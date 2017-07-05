package cfi.v2015;

import java.util.ArrayList;

import cfi.Attribute;
import cfi.AttributeList;

public class AttributeListCD1 extends AttributeList {


	public AttributeListCD1() {

		super("CD1", "Closed Dropdown List");
		this.list = new ArrayList<Attribute>();
		list.add(new Attribute("C", "Closed end"));
		list.add(new Attribute("O", "Open end"));
		list.add(new Attribute("M", "Other"));
		list.add(new Attribute("X", "Undefined"));

	}

}
