package cfi.v2015;

import java.util.ArrayList;

import cfi.Attribute;
import cfi.AttributeList;

public class AttributeListTD3 extends AttributeList {


	public AttributeListTD3() {
		super("TD3", "Type Dropdown List 3");
		this.list = new ArrayList<Attribute>();
		list.add(new Attribute("A", "Capital protection certificate"));
		list.add(new Attribute("B", "Capital protection convertible certificate"));
		list.add(new Attribute("C", "Barrier capital protection certificate"));
		list.add(new Attribute("D", "Capital protection certificate with coupon"));
		list.add(new Attribute("M", "Other"));
		list.add(new Attribute("X", "Undefined"));

	}

}
