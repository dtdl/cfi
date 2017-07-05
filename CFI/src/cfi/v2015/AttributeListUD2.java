package cfi.v2015;

import java.util.ArrayList;

import cfi.Attribute;
import cfi.AttributeList;

public class AttributeListUD2 extends AttributeList {

	public AttributeListUD2() {
		super("UD2", "Underlying Dropdown List 2");
		this.list = new ArrayList<Attribute>();
		list.add(new Attribute("E", "Extraction resources"));
		list.add(new Attribute("A", "Agriculture"));
		list.add(new Attribute("I", "Industrial products"));
		list.add(new Attribute("S", "Services"));
		list.add(new Attribute("N", "Environmental"));
		list.add(new Attribute("P", "Polypropylene products"));
		list.add(new Attribute("H", "Generated resources"));
		list.add(new Attribute("M", "Other"));
		list.add(new Attribute("X", "Undefined"));

	}

}
