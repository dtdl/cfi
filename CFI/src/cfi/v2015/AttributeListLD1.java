package cfi.v2015;

import java.util.ArrayList;

import cfi.Attribute;
import cfi.AttributeList;

public class AttributeListLD1 extends AttributeList {

	public AttributeListLD1() {

		super("LD1", "Long/Short Dropdown List");
		this.list = new ArrayList<Attribute>();
		list.add(new Attribute("C", "Long"));
		list.add(new Attribute("P", "Short"));
		list.add(new Attribute("M", "Other"));
		list.add(new Attribute("X", "Undefined"));

	}

}
