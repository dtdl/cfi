package cfi.v2015;

import java.util.ArrayList;

import cfi.Attribute;
import cfi.AttributeList;

public class AttributeListDD2 extends AttributeList {

	public AttributeListDD2() {
		
		super("DD2", "Distribution Dropdown List 2");
		this.list = new ArrayList<Attribute>();
		list.add(new Attribute("I", "Income funds"));
		list.add(new Attribute("G", "Accumulation funds"));
		list.add(new Attribute("J", "Mixed funds"));
		list.add(new Attribute("X", "Undefined"));

	}

}
