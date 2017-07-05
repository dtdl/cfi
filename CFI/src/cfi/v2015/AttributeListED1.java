package cfi.v2015;

import java.util.ArrayList;

import cfi.Attribute;
import cfi.AttributeList;

public class AttributeListED1 extends AttributeList {


	public AttributeListED1() {
		super("ED1", "Exercise Dropdown List");
		this.list = new ArrayList<Attribute>();
		list.add(new Attribute("E", "European"));
		list.add(new Attribute("A", "American"));
		list.add(new Attribute("B", "Bermudan"));
		list.add(new Attribute("M", "Other"));
		list.add(new Attribute("X", "Undefined"));

	}

}
