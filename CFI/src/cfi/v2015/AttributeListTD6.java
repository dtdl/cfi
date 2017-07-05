package cfi.v2015;

import java.util.ArrayList;

import cfi.Attribute;
import cfi.AttributeList;

public class AttributeListTD6 extends AttributeList {

	public AttributeListTD6() {
		super("TD6", "Type Dropdown List");
		this.list = new ArrayList<Attribute>();
		list.add(new Attribute("T", "Traditional"));
		list.add(new Attribute("N", "Naked"));
		list.add(new Attribute("C", "Covered"));
		list.add(new Attribute("X", "Undefined"));

	}

}
