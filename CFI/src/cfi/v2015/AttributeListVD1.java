package cfi.v2015;

import java.util.ArrayList;

import cfi.Attribute;
import cfi.AttributeList;

public class AttributeListVD1 extends AttributeList {

	public AttributeListVD1() {
		super("VD1", "Voting Dropdown List");
		this.list = new ArrayList<Attribute>();
		list.add(new Attribute("V", "Voting"));
		list.add(new Attribute("N", "Non-voting"));
		list.add(new Attribute("R", "Restricted voting"));
		list.add(new Attribute("E", "Enhanced voting"));
		list.add(new Attribute("X", "Undefined"));

	}

}
