package cfi.v2015;

import java.util.ArrayList;

import cfi.Attribute;
import cfi.AttributeList;

public class AttributeListTD4 extends AttributeList {

	public AttributeListTD4() {
		super("TD4", "Type Dropdown List");
		this.list = new ArrayList<Attribute>();
		list.add(new Attribute("A", "Discount certificate"));
		list.add(new Attribute("B", "Barrier discount certificate"));
		list.add(new Attribute("C", "Reverse convertible"));
		list.add(new Attribute("D", "Barrier reverse convertible"));
		list.add(new Attribute("E", "Express certificate"));
		list.add(new Attribute("M", "Other"));
		list.add(new Attribute("X", "Undefined"));

	}

}
