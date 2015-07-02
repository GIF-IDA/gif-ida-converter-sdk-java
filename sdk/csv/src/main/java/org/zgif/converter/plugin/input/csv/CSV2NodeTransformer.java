package org.zgif.converter.plugin.input.csv;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Currency;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.log4j.Logger;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.Period;
import org.zgif.converter.sdk.ITransformContext;
import org.zgif.converter.sdk.impl.BasicTransformer;
import org.zgif.model.datatype.enumeration.Subset;
import org.zgif.model.node.AbstractNode;

public class CSV2NodeTransformer<A extends AbstractNode> extends BasicTransformer<CSVLine<A>, A> {
    private static Logger logger = Logger.getLogger(CSV2NodeTransformer.class);

    protected Class<A>    type;

    public CSV2NodeTransformer(Class<A> type) {
        super();
        this.type = type;
    }

    private Map<String, Method> getMethodMap(Class<?> type) {
        Map<String, Method> methodMap = new HashMap<String, Method>();
        Method[] methods = type.getMethods();

        for (Method method : methods) {
            String methodName = method.getName();
            if (methodName.startsWith("set")) {
                methodMap.put(methodName, method);
            }
        }
        return methodMap;
    }

    protected void setValue(A object, String key, String value) throws NoSuchFieldException, IllegalAccessException, IllegalArgumentException,
        InvocationTargetException, NoSuchMethodException, SecurityException {
        Map<String, Method> methodMap = getMethodMap(object.getClass());
        String methodName = "set" + key.substring(0, 1).toUpperCase() + key.substring(1);

        Method method = methodMap.get(methodName);
        if (method != null) {
            Object setValue = null;
            Class<?> targetType = method.getParameterTypes()[0];

            try {
                if (value.equals("")) {
                    setValue = null;
                } else if (String.class.isAssignableFrom(targetType)) {
                    setValue = value;
                } else if (Currency.class.isAssignableFrom(targetType)) {
                    setValue = Currency.getInstance(value);
                } else if (LocalDate.class.isAssignableFrom(targetType)) {
                    // TODO: überprüfen
                    setValue = LocalDate.parse(value);
                } else if (LocalDateTime.class.isAssignableFrom(targetType)) {
                    // TODO: überprüfen
                    setValue = LocalDateTime.parse(value);
                } else if (Period.class.isAssignableFrom(targetType)) {
                    // TODO: überprüfen
                    setValue = Period.parse(value);
                } else if (Locale.class.isAssignableFrom(targetType)) {
                    // TODO: korrigieren
                    setValue = Locale.GERMANY;
                } else if (targetType.getPackage() == Subset.class.getPackage()) {
                    try {
                        Method fromString = targetType.getDeclaredMethod("fromString", String.class);
                        setValue = fromString.invoke(null, value);
                    } catch (Throwable t) {
                    }

                    if (setValue == null) {
                        Method valueOf = targetType.getDeclaredMethod("valueOf", String.class);
                        setValue = valueOf.invoke(null, value);
                    }
                } else {
                    setValue = null;
                    logger.warn("unknown data type: " + targetType);
                }
            } catch (Exception ex) {
                logger.error("error at converting value: " + value, ex);
            }

            method.invoke(object, setValue);
        }
    }

    @Override
    protected A doTransform(CSVLine<A> csvLine, ITransformContext context) {
        A object = null;

        try {
            object = type.newInstance();
            for (Entry<String, String> dataField : csvLine.entrySet()) {
                try {
                    setValue(object, dataField.getKey(), dataField.getValue());
                } catch (SecurityException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                } catch (IllegalArgumentException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                } catch (NoSuchFieldException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                } catch (NoSuchMethodException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }

        } catch (IllegalAccessException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        } catch (InstantiationException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }

        return (A) object;
    }

}
