package cfi.v2015;

import java.util.ArrayList;

import cfi.Attribute;
import cfi.AttributeList;

public class AttributeListCD2 extends AttributeList {

	public AttributeListCD2() {
		
		super("CD2", "Call/Put Dropdown List");
		this.list = new ArrayList<Attribute>();
		list.add(new Attribute("C", "Call"));
		list.add(new Attribute("P", "Put"));
		list.add(new Attribute("B", "Call and Put"));
		list.add(new Attribute("X", "Undefined"));

	}

}
