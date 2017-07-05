package cfi.v2015;

import java.util.ArrayList;

import cfi.Attribute;
import cfi.AttributeList;

public class AttributeListBD1 extends AttributeList {

	public AttributeListBD1() {
		super("BD1", "Barrier Dropdown List 1");
		this.list = new ArrayList<Attribute>();
		list.add(new Attribute("T", "Barrier underlying based"));
		list.add(new Attribute("N", "Barrier instrument based"));
		list.add(new Attribute("M", "Other"));
		list.add(new Attribute("X", "Undefined"));
	}

}
