package org.zgif.converter.plugin.input.csv;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.zgif.model.annotation.DataField;
import org.zgif.model.node.AbstractNode;

public class CSVLine<A extends AbstractNode> extends HashMap<String, String> {
	private static final long serialVersionUID = -9068446495268025416L;

	private static Map<Class<AbstractNode>, List<String>> staticDatafieldMap;
	
	@SuppressWarnings("unchecked")
	private static List<String> getDataFieldsOfNode(String prefix, Class<AbstractNode> type) {
		List<String> datafieldList = new ArrayList<String>();
		
		Field[] fields = type.getDeclaredFields();
		for (Field field : fields) {
			DataField anno = field.getAnnotation(DataField.class);
			if (anno != null) {
				datafieldList.add(prefix + field.getName());
			} else if(AbstractNode.class.isAssignableFrom(field.getType())) {
				datafieldList.addAll(getDataFieldsOfNode(field.getType().getSimpleName() + ".", (Class<AbstractNode>) field.getType()));
			}
		}
		
		return datafieldList;
	}
	
	private static void initializeDatafields(Class<AbstractNode> type) {
		if (staticDatafieldMap == null) {
			staticDatafieldMap = new HashMap<Class<AbstractNode>, List<String>>();
		}

		if (staticDatafieldMap.get(type) == null) {
			staticDatafieldMap.put(type, getDataFieldsOfNode(null, type));
		}
	}
	
	//////////////////////////////
	
	private List<String> datafields;

	@SuppressWarnings("unchecked")
	public CSVLine(Class<A> type) {
		initializeDatafields((Class<AbstractNode>) type);

		datafields = staticDatafieldMap.get(type);
	}

	
	
	@Override
	public String put(String key, String value) {
		if (datafields.contains(key)) {
			return super.put(key, value);
		} else {
			return null;
		}
	}

	public List<String> getDatafields() {
		return Collections.unmodifiableList(this.datafields);
	}
}
