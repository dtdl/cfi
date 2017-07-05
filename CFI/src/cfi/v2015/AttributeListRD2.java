package cfi.v2015;

import java.util.ArrayList;

import cfi.Attribute;
import cfi.AttributeList;

public class AttributeListRD2 extends AttributeList {

	public AttributeListRD2() {
		super("RD2", "Repayment Dropdown List");
		this.list = new ArrayList<Attribute>();
		list.add(new Attribute("F", "Cash repayment"));
		list.add(new Attribute("V", "Physical repayment"));
		list.add(new Attribute("E", "Elect at settlement"));
		list.add(new Attribute("M", "Other"));
		list.add(new Attribute("X", "Undefined"));

	}

}
