package cfi.v2015;

import java.util.ArrayList;

import cfi.Attribute;
import cfi.AttributeList;

public class AttributeListTD2 extends AttributeList {

	public AttributeListTD2() {
		super("TD2", "Type Dropdown List 2");
		this.list = new ArrayList<Attribute>();
		list.add(new Attribute("R", "Defined benefit"));
		list.add(new Attribute("B", "Defined contribution"));
		list.add(new Attribute("M", "Other"));
		list.add(new Attribute("X", "Undefined"));

	}

}
