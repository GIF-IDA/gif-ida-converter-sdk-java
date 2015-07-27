package org.zgif.samples.test;

import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.zgif.converter.sdk.MapperValidationException;
import org.zgif.model.subset_5_1.ZGif;

/**
 * @author Martin Fluegge
 * 
 */
public class Main {

	public static void main(String[] args) throws MapperValidationException {

		new Main().test();

	}

	private void test() throws MapperValidationException {
		Unit unit = new Unit();
		unit.setZahl(123);
		Property property = new Property();

		property.getUnits().add(unit);

		Building building = new Building();
		building.getUnits().add(unit);

		property.setBuilding(building);

		String xml = doMarshall(property);
		System.out.println(xml);

		Property property2 = doUnmarshall(xml);

		property2.getBuilding().getUnits().get(0).setZahl(456);

		System.out.println(property2.getUnits().get(0).getZahl());

		ZGif zgif;
		// zgif.getPeriods().get(0).getData().getListOfProp().get("12").getArchValidTo();

	}

	public String doMarshall(Object o) throws MapperValidationException {

		try {

			JAXBContext contextIs24 = JAXBContext.newInstance(o.getClass());
			Marshaller is24Marshaller = contextIs24.createMarshaller();
			is24Marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

			StringWriter writer = new StringWriter();

			is24Marshaller.marshal(o, writer);
			return writer.toString();

		} catch (JAXBException e) {
			throw new RuntimeException(e);
		}
	}

	public Property doUnmarshall(String o) {

		// TODO vorbehandlung: finde heraus welches Objekt instanziiert werden
		// muss
		Class<?> objectClass = Property.class;
		try {
			JAXBContext context = JAXBContext.newInstance(objectClass);
			Unmarshaller unmarshaller = context.createUnmarshaller();

			StringReader reader = new StringReader(o);

			return (Property) unmarshaller.unmarshal(reader);
		} catch (JAXBException e) {
			throw new RuntimeException(e);
		}
	}
}
