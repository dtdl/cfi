package cfi.v2015;

import java.util.ArrayList;

import cfi.Attribute;
import cfi.AttributeList;

public class AttributeListDD1 extends AttributeList {

	public AttributeListDD1() {

		super("DD1", "Distribution Dropdown List");
		this.list = new ArrayList<Attribute>();
		list.add(new Attribute("F", "Fixed interest payments"));
		list.add(new Attribute("D", "Dividend payments"));
		list.add(new Attribute("V", "Variable interest payments"));
		list.add(new Attribute("Y", "No payments"));
		list.add(new Attribute("M", "Other"));
		list.add(new Attribute("X", "Undefined"));

	}

}
