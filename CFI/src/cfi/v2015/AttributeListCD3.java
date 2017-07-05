package cfi.v2015;

import java.util.ArrayList;

import cfi.Attribute;
import cfi.AttributeList;

public class AttributeListCD3 extends AttributeList {

	public AttributeListCD3() {

		super("CD3", "Component Dropdown List");
		this.list = new ArrayList<Attribute>();
		list.add(new Attribute("S", "Combination of shares"));
		list.add(new Attribute("B", "Combination of bonds"));
		list.add(new Attribute("H", "Share and bond"));
		list.add(new Attribute("A", "Share and warrant"));
		list.add(new Attribute("W", "Warrant and warrant"));
		list.add(new Attribute("U", "Fund and other component"));
		list.add(new Attribute("M", "Other"));
		list.add(new Attribute("X", "Undefined"));

	}

}
