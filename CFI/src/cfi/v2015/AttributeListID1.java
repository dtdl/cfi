package cfi.v2015;

import java.util.ArrayList;

import cfi.Attribute;
import cfi.AttributeList;

public class AttributeListID1 extends AttributeList {

	public AttributeListID1() {
		super("ID1", "Income Dropdown List");
		this.list = new ArrayList<Attribute>();
		list.add(new Attribute("F", "Fixed rate income"));
		list.add(new Attribute("C", "Cumulative fixed rate income"));
		list.add(new Attribute("P", "Participating income"));
		list.add(new Attribute("Q", "Cumulative participating income"));
		list.add(new Attribute("A", "Adjustable/variable fixed rate income"));
		list.add(new Attribute("N", "Normal rate income"));
		list.add(new Attribute("U", "Austion rate income"));
		list.add(new Attribute("X", "Undefined"));

	}

}
