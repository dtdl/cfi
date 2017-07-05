package cfi.v2015;

import java.util.ArrayList;

import cfi.Attribute;
import cfi.AttributeList;

public class AttributeListFD1 extends AttributeList {

	public AttributeListFD1() {
		super("FD1", "Form Dropdown List");
		this.list = new ArrayList<Attribute>();
		list.add(new Attribute("B", "Bearer"));
		list.add(new Attribute("R", "Registered"));
		list.add(new Attribute("N", "Bearer/registered"));
		list.add(new Attribute("M", "Other"));
		list.add(new Attribute("X", "Undefined"));

	}
}
