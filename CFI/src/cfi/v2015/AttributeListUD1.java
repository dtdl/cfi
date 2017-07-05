package cfi.v2015;

import java.util.ArrayList;

import cfi.Attribute;
import cfi.AttributeList;

public class AttributeListUD1 extends AttributeList {

	public AttributeListUD1() {
		super("UD1", "Underlying Dropdown List 1");
		this.list = new ArrayList<Attribute>();
		list.add(new Attribute("B", "Baskets"));
		list.add(new Attribute("S", "Equities"));
		list.add(new Attribute("D", "Debt instruments"));
		list.add(new Attribute("G", "Derivatives"));
		list.add(new Attribute("T", "Commodities"));
		list.add(new Attribute("C", "Currencies"));
		list.add(new Attribute("I", "Indices"));
		list.add(new Attribute("N", "Interest rates"));
		list.add(new Attribute("O", "Options"));
		list.add(new Attribute("F", "Futures"));
		list.add(new Attribute("W", "Swaps"));
		list.add(new Attribute("M", "Other"));
		list.add(new Attribute("X", "Undefined"));

	}

}
