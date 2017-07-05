package cfi.v2015;

import java.util.ArrayList;

import cfi.Attribute;
import cfi.AttributeList;

public class AttributeListAD2 extends AttributeList {

	public AttributeListAD2() {

		super("AD2", "Assets Dropdown List 2");
		this.list = new ArrayList<Attribute>();
		list.add(new Attribute("S", "Common/ordinary shares"));
		list.add(new Attribute("P", "Preferred/preference shares"));
		list.add(new Attribute("C", "Common/ordinary convertible shares"));
		list.add(new Attribute("F", "Preferred/preference convertible shares"));
		list.add(new Attribute("B", "Bonds"));
		list.add(new Attribute("I", "Combined instruments"));
		list.add(new Attribute("M", "Other (miscellaneous)"));
		list.add(new Attribute("X", "Undefined"));
	}

}
