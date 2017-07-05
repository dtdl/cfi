package cfi.v2015;

import java.util.ArrayList;

import cfi.Attribute;
import cfi.AttributeList;

public class GroupListCCollectiveInvestmentVehicle extends AttributeList {

	public GroupListCCollectiveInvestmentVehicle() {
		super("C", "Collective Investment Vehicle Group Dropdown List");
		this.list = new ArrayList<Attribute>();
		list.add(new Attribute("I", "Standard"));
		list.add(new Attribute("H", "Hedge"));
		list.add(new Attribute("B", "REIT"));
		list.add(new Attribute("E", "ETF"));
		list.add(new Attribute("S", "Pension fund"));
		list.add(new Attribute("F", "Fund of funds"));
		list.add(new Attribute("P", "Private equity fund"));
		list.add(new Attribute("M", "Others (miscellaneous)"));
		list.add(new Attribute("X", "Undefined"));
	}

}
