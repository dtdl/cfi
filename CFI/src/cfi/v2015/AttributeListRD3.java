package cfi.v2015;

import java.util.ArrayList;

import cfi.Attribute;
import cfi.AttributeList;

public class AttributeListRD3 extends AttributeList {

	public AttributeListRD3() {
		super("RD3", "Redemption Dropdown List 2");
		this.list = new ArrayList<Attribute>();
		list.add(new Attribute("F", "Fixed maturity"));
		list.add(new Attribute("G", "Fixed maturity with call"));
		list.add(new Attribute("C", "Fixed maturity with put"));
		list.add(new Attribute("D", "Fixed maturity with call and put"));
		list.add(new Attribute("A", "Amortisation plan"));
		list.add(new Attribute("B", "Amortisation plan with call"));
		list.add(new Attribute("T", "Amortisation plan with put"));
		list.add(new Attribute("L", "Amortisation plan with call and put"));
		list.add(new Attribute("P", "Perpetual"));
		list.add(new Attribute("Q", "Perpetual with call"));
		list.add(new Attribute("R", "Perpetual with put"));
		list.add(new Attribute("E", "Extendible"));
		list.add(new Attribute("X", "Undefined"));

	}

}
