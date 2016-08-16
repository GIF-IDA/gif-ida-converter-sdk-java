//package org.zgif.converter.plugin.input.csv;
//
//import java.lang.reflect.InvocationTargetException;
//import java.lang.reflect.Method;
//import java.math.BigDecimal;
//import java.util.Currency;
//import java.util.HashMap;
//import java.util.Locale;
//import java.util.Map;
//import java.util.Map.Entry;
//
//import org.apache.log4j.Logger;
//import org.joda.time.LocalDate;
//import org.joda.time.LocalDateTime;
//import org.joda.time.Period;
//import org.zgif.converter.sdk.ITransformContext;
//import org.zgif.converter.sdk.impl.BasicTransformer;
//import org.zgif.model.datatype.Amount;
//import org.zgif.model.datatype.Area;
//import org.zgif.model.datatype.enumeration.AreaMeasurement;
//import org.zgif.model.datatype.enumeration.AreaType;
//import org.zgif.model.datatype.enumeration.Subset;
//import org.zgif.model.node.AbstractNode;
//import org.zgif.model.node.group.AbstractGroupNode;
//
///**
// * transforms a <code>CSVLine<A></code> to an <code>AbstractNode</code> of type
// * <NodeType>
// *
// * @author phoudek
// *
// * @param <NodeType>
// *            Type of the <code>AbstractNode</code> for transformer target
// */
//public class CSV2NodeTransformer<NodeType extends AbstractNode> extends BasicTransformer<CSVLine<NodeType>, NodeType> {
//    private static Logger     logger = Logger.getLogger(CSV2NodeTransformer.class);
//
//    protected Class<NodeType> type;
//
//    public CSV2NodeTransformer(Class<NodeType> type) {
//        super();
//        this.type = type;
//    }
//
//    /**
//     * creates a map with all setters of a specific <code>AbstractNode</code>
//     *
//     * @param type
//     *            type of the AbstractNode
//     * @return map of setters
//     */
//    private Map<String, Method> getMethodMap(Class<?> type) {
//        Map<String, Method> methodMap = new HashMap<String, Method>();
//        Method[] methods = type.getMethods();
//
//        for (Method method : methods) {
//            String methodName = method.getName();
//            if (methodName.startsWith("set")) {
//                methodMap.put(methodName, method);
//            }
//        }
//        return methodMap;
//    }
//
//    /**
//     * calls the setter for an object
//     *
//     * @param object
//     *            object to set the value
//     * @param key
//     *            name of the datafield / setter
//     * @param value
//     *            value to set
//     */
//    protected void setValue(NodeType object, String key, String value) {
//        Map<String, Method> methodMap = getMethodMap(object.getClass());
//
//        Method method = null;
//        NodeType methodInvokeObject = object;
//
//        Integer separatorPos = key.indexOf(".");
//        if (separatorPos >= 0) {
//            // nested object:
//            String objectName = key.substring(0, separatorPos);
//            String attributeName = key.substring(separatorPos + 1);
//
//            Method getNestedObjectMethod = null;
//            try {
//                getNestedObjectMethod = getMethodDeep(object.getClass(), "get" + objectName);
//                if (getNestedObjectMethod != null) {
//                    methodInvokeObject = (NodeType) getNestedObjectMethod.invoke(object);
//                }
//                if (methodInvokeObject == null) {
//                    Class<?> invokeObjectClass = Class.forName(AbstractGroupNode.class.getPackage().getName() + "." + objectName);
//                    methodInvokeObject = (NodeType) invokeObjectClass.newInstance();
//                    Method setNestedObjectMethod = getMethodDeep(object.getClass(), "set" + objectName, invokeObjectClass);
//                    setNestedObjectMethod.invoke(object, methodInvokeObject);
//                }
//                String methodName = "set" + attributeName.substring(0, 1).toUpperCase() + attributeName.substring(1);
//                Method[] methods = methodInvokeObject.getClass().getDeclaredMethods();
//                for (int i = 0; i < methods.length; i++) {
//                    Method invokeObjectMethod = methods[i];
//                    if (invokeObjectMethod.getName().equals(methodName)) {
//                        method = invokeObjectMethod;
//                        break;
//                    }
//                }
//            } catch (Exception e) {
//                Exception x = e;
//            }
//        } else {
//            String methodName = "set" + key.substring(0, 1).toUpperCase() + key.substring(1);
//            method = methodMap.get(methodName);
//        }
//
//        if (method != null) {
//            Object setValue = null;
//            Class<?> targetType = method.getParameterTypes()[0];
//
//            try {
//                if (value.equals("")) {
//                    setValue = null;
//                } else if (String.class.isAssignableFrom(targetType)) {
//                    setValue = value;
//                } else if (Double.class.isAssignableFrom(targetType)) {
//                    setValue = Double.parseDouble(value);
//                } else if (Currency.class.isAssignableFrom(targetType)) {
//                    setValue = Currency.getInstance(value);
//                } else if (LocalDate.class.isAssignableFrom(targetType)) {
//                    // TODO: überprüfen
//                    setValue = LocalDate.parse(value);
//                } else if (LocalDateTime.class.isAssignableFrom(targetType)) {
//                    // TODO: überprüfen
//                    setValue = LocalDateTime.parse(value);
//                } else if (Period.class.isAssignableFrom(targetType)) {
//                    // TODO: überprüfen
//                    setValue = Period.parse(value);
//                } else if (Locale.class.isAssignableFrom(targetType)) {
//                    // TODO: korrigieren
//                    setValue = Locale.GERMANY;
//                } else if (Amount.class.isAssignableFrom(targetType)) {
//                    String[] parts = value.split(" ");
//                    if (parts.length == 1) {
//                        Amount amount = new Amount();
//                        amount.setValue(BigDecimal.valueOf(Double.parseDouble(parts[0])));
//                        amount.setCurrency("EUR");
//                        setValue = amount;
//                    } else if (parts.length == 2) {
//                        Amount amount = new Amount();
//                        amount.setValue(BigDecimal.valueOf(Double.parseDouble(parts[0])));
//                        amount.setCurrency(parts[1]);
//                        setValue = amount;
//                    } else {
//                        logger.warn("invalid value '" + value + "' for type '" + targetType + "' - value will be set to empty");
//                    }
//                } else if (Area.class.isAssignableFrom(targetType)) {
//                    String[] parts = value.split(" ");
//                    if (parts.length == 1) {
//                        Area area = new Area();
//                        area.setValue(BigDecimal.valueOf(Double.parseDouble(parts[0])));
//                        area.setAreaMeasurement(AreaMeasurement.NOT_SPECIFIED);
//                        area.setAreaType(AreaType.NOT_SPECIFIED);
//                        setValue = area;
//                    } else if (parts.length == 2) {
//                        Area area = new Area();
//                        area.setValue(BigDecimal.valueOf(Double.parseDouble(parts[0])));
//                        area.setAreaMeasurement(AreaMeasurement.valueOf(parts[1]));
//                        area.setAreaType(AreaType.NOT_SPECIFIED);
//                        setValue = area;
//                    } else if (parts.length == 3) {
//                        Area area = new Area();
//                        area.setValue(BigDecimal.valueOf(Double.parseDouble(parts[0])));
//                        area.setAreaMeasurement(AreaMeasurement.valueOf(parts[1]));
//                        area.setAreaType(AreaType.valueOf(parts[2]));
//                        setValue = area;
//                    } else {
//                        logger.warn("invalid value '" + value + "' for type '" + targetType + "' - value will be set to empty");
//                    }
////                } else if (Country.class.isAssignableFrom(targetType)) {
////                    setValue = new Country(value);
//                } else if (targetType.getPackage() == Subset.class.getPackage()) {
//                    // type is enumeration:
//                    try {
//                        Method fromString = targetType.getDeclaredMethod("fromString", String.class);
//                        setValue = fromString.invoke(null, value);
//                    } catch (Throwable t) {
//                    }
//
//                    if (setValue == null) {
//                        Method valueOf = targetType.getDeclaredMethod("valueOf", String.class);
//                        setValue = valueOf.invoke(null, value);
//                    }
//                } else {
//                    // unknown type
//                    setValue = null;
//                    logger.warn("unknown data type: " + targetType + " - value will be set to empty");
//                }
//
//                method.invoke(methodInvokeObject, setValue);
//            } catch (IllegalArgumentException e) {
//                logger.error("could not set '" + key + "' to object " + object.toString() + " (plugin bug - please report bug of plugin)", e);
//            } catch (IllegalAccessException e) {
//                logger.error("could not set '" + key + "' to object " + object.toString() + " (plugin bug - please report bug of plugin)", e);
//            } catch (InvocationTargetException e) {
//                logger.error("could not set '" + key + "' to object " + object.toString() + " (plugin bug - please report bug of plugin)", e);
//            } catch (SecurityException e) {
//                logger.error("could not set '" + key + "' to object " + object.toString() + " (plugin bug - please report bug of plugin)", e);
//            } catch (NoSuchMethodException e) {
//                logger.error("could not set '" + key + "' to object " + object.toString() + " (plugin bug - please report bug of plugin)", e);
//            }
//        } else {
//            if (!key.endsWith(".identifier") && !key.endsWith(".objectIdSender")) {
//                logger.error("could not set '" + key + "' to object " + object.toString() + ": no setter found for key (please report bug of plugin)");
//            }
//        }
//    }
//
//    /**
//     * (non-Javadoc)
//     *
//     * @see org.zgif.converter.sdk.impl.BasicTransformer#doTransform
//     */
//    @Override
//    protected NodeType doTransform(CSVLine<NodeType> csvLine, ITransformContext context) {
//        NodeType object = null;
//
//        try {
//            object = type.newInstance();
//            for (Entry<String, String> dataField : csvLine.entrySet()) {
//                setValue(object, dataField.getKey(), dataField.getValue());
//            }
//        } catch (IllegalAccessException e) {
//            logger.error("could not create object of type '" + type.toString() + "' (plugin bug - please report bug of plugin)", e);
//        } catch (InstantiationException e) {
//            logger.error("could not create object of type '" + type.toString() + "' (plugin bug - please report bug of plugin)", e);
//        }
//
//        return (NodeType) object;
//    }
//
//    private Method getMethodDeep(Class clazz, String methodName, Class... parameterTypes) {
//        Method m = null;
//
//        do {
//            try {
//
//                m = clazz.getMethod(methodName, parameterTypes);
//            } catch (Exception e) {
//            }
//            if (m == null) {
//                clazz = clazz.getSuperclass();
//            }
//        } while (m == null && !clazz.equals(Object.class));
//
//        return m;
//    }
//}
