package cfi.v2015;

import java.util.ArrayList;

import cfi.Attribute;
import cfi.AttributeList;

public class AttributeListDD3 extends AttributeList {

	public AttributeListDD3() {
		
		super("DD3", "Delivery Dropdown List");
		this.list = new ArrayList<Attribute>();
		list.add(new Attribute("P", "Physical"));
		list.add(new Attribute("C", "Cash"));
		list.add(new Attribute("N", "Non-deliverable"));
		list.add(new Attribute("E", "Elect at exercise"));
		list.add(new Attribute("X", "Undefined"));

	}

}
