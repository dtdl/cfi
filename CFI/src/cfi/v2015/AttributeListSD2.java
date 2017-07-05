package cfi.v2015;

import java.util.ArrayList;

import cfi.Attribute;
import cfi.AttributeList;

public class AttributeListSD2 extends AttributeList {

	public AttributeListSD2() {
		super("SD2", "Strategy Dropdown List");
		this.list = new ArrayList<Attribute>();
		list.add(new Attribute("B", "Balanced"));
		list.add(new Attribute("G", "Growth"));
		list.add(new Attribute("L", "Lifestyle"));
		list.add(new Attribute("M", "Other"));
		list.add(new Attribute("X", "Undefined"));

	}

}
