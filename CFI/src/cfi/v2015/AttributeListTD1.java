package cfi.v2015;

import java.util.ArrayList;

import cfi.Attribute;
import cfi.AttributeList;

public class AttributeListTD1 extends AttributeList {

	public AttributeListTD1() {
		super("TD1", "Type Dropdown List 1");
		this.list = new ArrayList<Attribute>();
		list.add(new Attribute("A", "Tracker certificate"));
		list.add(new Attribute("B", "Outperformance certificate"));
		list.add(new Attribute("C", "Bonus certificate"));
		list.add(new Attribute("D", "Outperformance bonus certificate"));
		list.add(new Attribute("E", "Twin win certificate"));
		list.add(new Attribute("M", "Other"));
		list.add(new Attribute("X", "Undefined"));

	}

}
