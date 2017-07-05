package cfi.v2015;

import java.util.ArrayList;

import cfi.Attribute;
import cfi.AttributeList;

public class AttributeListSD1 extends AttributeList {

	public AttributeListSD1() {
		super("SD1", "Security Dropdown List");
		this.list = new ArrayList<Attribute>();
		list.add(new Attribute("S", "Shares"));
		list.add(new Attribute("Q", "Shares for QI (qualified investor)"));
		list.add(new Attribute("U", "Units"));
		list.add(new Attribute("Y", "Units for QI (qualified investor)"));
		list.add(new Attribute("X", "Undefined"));

	}

}
