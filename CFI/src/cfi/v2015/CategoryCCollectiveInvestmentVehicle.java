package cfi.v2015;

import java.util.ArrayList;

import cfi.Category;
import cfi.Group;

public class CategoryCCollectiveInvestmentVehicle extends Category {

	public CategoryCCollectiveInvestmentVehicle() {
		super("C", "Collective Investment Vehicle");
		this.list = new ArrayList<Group>();
		
		list.add(new Group("I", "Standard", new AttributeListCD1(), new AttributeListDD2(), new AttributeListAD1(), new AttributeListSD1()));
		list.add(new Group("H", "Hedge", new AttributeListID2(), new AttributeListX(), new AttributeListX(), new AttributeListX()));
		list.add(new Group("B", "REIT", new AttributeListCD1(), new AttributeListDD2(), new AttributeListX(), new AttributeListSD1()));
		list.add(new Group("E", "ETF", new AttributeListCD1(), new AttributeListDD2(), new AttributeListAD1(), new AttributeListSD1()));
		list.add(new Group("S", "Pension fund", new AttributeListCD1(), new AttributeListSD2(), new AttributeListTD2(), new AttributeListSD1()));
		list.add(new Group("F", "Fund of funds", new AttributeListCD1(), new AttributeListDD2(), new GroupListCCollectiveInvestmentVehicle(), new AttributeListSD1()));
		list.add(new Group("P", "Private equity fund", new AttributeListCD1(), new AttributeListDD2(), new AttributeListAD1(), new AttributeListSD1()));
		list.add(new Group("M", "Others (miscellaneous)", new AttributeListX(), new AttributeListX(), new AttributeListX(), new AttributeListSD1()));
		list.add(new Group("X", "Undefined", new AttributeListX(), new AttributeListX(), new AttributeListX(), new AttributeListX()));
		
	}

}
