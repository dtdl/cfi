package cfi.v2015;

import java.util.ArrayList;

import cfi.Attribute;
import cfi.AttributeList;

public class AttributeListTD5 extends AttributeList {

	public AttributeListTD5() {
		super("TD5", "Type Dropdown List");
		this.list = new ArrayList<Attribute>();
		list.add(new Attribute("B", "Bank loan"));
		list.add(new Attribute("P", "Promissory note"));
		list.add(new Attribute("M", "Other"));
		list.add(new Attribute("X", "Undefined"));

	}

}
