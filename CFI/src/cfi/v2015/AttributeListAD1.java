package cfi.v2015;

import java.util.ArrayList;

import cfi.Attribute;
import cfi.AttributeList;

public class AttributeListAD1 extends AttributeList {

	public AttributeListAD1() {
		
		super("AD1", "Assets Dropdown List 1");
		this.list = new ArrayList<Attribute>();
		list.add(new Attribute("R", "Real estate"));
		list.add(new Attribute("B", "Debt instruments"));
		list.add(new Attribute("E", "Equities"));
		list.add(new Attribute("V", "Convertible securities"));
		list.add(new Attribute("L", "Mixed"));
		list.add(new Attribute("C", "Commodities"));
		list.add(new Attribute("D", "Derivatives"));
		list.add(new Attribute("F", "Referential instruments"));
		list.add(new Attribute("K", "Credits"));
		list.add(new Attribute("M", "Other"));
		list.add(new Attribute("X", "Undefined"));

	}
}
