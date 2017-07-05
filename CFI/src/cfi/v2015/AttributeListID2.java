package cfi.v2015;

import java.util.ArrayList;

import cfi.Attribute;
import cfi.AttributeList;

public class AttributeListID2 extends AttributeList {

	public AttributeListID2() {
		super("ID2", "Investment Dropdown List");
		this.list = new ArrayList<Attribute>();
		list.add(new Attribute("D", "Directional"));
		list.add(new Attribute("R", "Relative value"));
		list.add(new Attribute("S", "Security selection"));
		list.add(new Attribute("E", "Event driven"));
		list.add(new Attribute("A", "Arbitrage"));
		list.add(new Attribute("N", "Multi strategy"));
		list.add(new Attribute("L", "Asset based lending"));
		list.add(new Attribute("M", "Other"));
		list.add(new Attribute("X", "Undefined"));

	}

}
