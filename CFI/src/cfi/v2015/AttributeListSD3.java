package cfi.v2015;

import java.util.ArrayList;

import cfi.Attribute;
import cfi.AttributeList;

public class AttributeListSD3 extends AttributeList {

	public AttributeListSD3() {
		super("SD3", "Standard Dropdown List");
		this.list = new ArrayList<Attribute>();
		list.add(new Attribute("S", "Standardised"));
		list.add(new Attribute("N", "Non-standardised"));
		list.add(new Attribute("X", "Undefined"));

	}

}
