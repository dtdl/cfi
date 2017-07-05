package cfi.v2015;

import java.util.ArrayList;

import cfi.Attribute;
import cfi.AttributeList;

public class AttributeListPD1 extends AttributeList {

	public AttributeListPD1() {

		super("PD1", "Payment Dropdown List");
		this.list = new ArrayList<Attribute>();
		list.add(new Attribute("O", "Nil Paid"));
		list.add(new Attribute("P", "Partly Paid"));
		list.add(new Attribute("F", "Fully Paid"));
		list.add(new Attribute("X", "Undefined"));

	}

}
