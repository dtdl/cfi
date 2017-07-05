package cfi.v2015;

import java.util.ArrayList;

import cfi.Attribute;
import cfi.AttributeList;

public class GroupListDDebtInstrument extends AttributeList {


	public GroupListDDebtInstrument() {
		super("D", "Debt Instrument Group Dropdown List");
		this.list = new ArrayList<Attribute>();	
		list.add(new Attribute("B", "Bonds"));
		list.add(new Attribute("C", "Convertible notes"));
		list.add(new Attribute("W", "Bonds with warrants attached"));
		list.add(new Attribute("T", "Medium term notes"));
		list.add(new Attribute("Y", "Money market instruments"));
		list.add(new Attribute("S", "Structured instruments (capital protected)"));
		list.add(new Attribute("E", "Structured instruments (without capital protected)"));
		list.add(new Attribute("G", "Mortgage backed securities"));
		list.add(new Attribute("A", "Asset backed securities"));
		list.add(new Attribute("N", "Municipal bonds"));
		list.add(new Attribute("D", "Depository receipts on debt instruments"));
		list.add(new Attribute("M", "Others (miscellaneous)"));
		list.add(new Attribute("X", "Undefined"));
	}

}
