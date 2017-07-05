package cfi.v2015;

import java.util.ArrayList;

import cfi.Attribute;
import cfi.AttributeList;

public class AttributeListGD2 extends AttributeList {

	public AttributeListGD2() {
		super("GD2", "Grouping Dropdown List");
		this.list = new ArrayList<Attribute>();
		list.add(new Attribute("R", "Real estate deeds"));
		list.add(new Attribute("I", "Insurance policies"));
		list.add(new Attribute("E", "Escrow receipts"));
		list.add(new Attribute("T", "Trade finance instruments"));
		// TODO to check the duplicate value
		list.add(new Attribute("N", "Carbon credit"));
		list.add(new Attribute("P", "Precious metal receipts"));
		list.add(new Attribute("S", "Other OTC derivative products"));
		list.add(new Attribute("M", "Other"));
		list.add(new Attribute("X", "Undefined"));

	}

}
