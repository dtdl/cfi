package cfi.v2015;

import java.util.ArrayList;

import cfi.Category;
import cfi.Group;

public class CategoryEEquity extends Category {

	public CategoryEEquity() {
		super("E", "Equity");
		this.list = new ArrayList<Group>();
		list.add(new Group("S", "Common/ordinary shares", new AttributeListVD1(), new AttributeListOD1(), new AttributeListPD1(), new AttributeListFD1()));
		list.add(new Group("P", "Preferred/preference shares", new AttributeListVD1(), new AttributeListRD1(), new AttributeListID1(), new AttributeListFD1()));
		list.add(new Group("C", "Common/ordinary convertible shares", new AttributeListVD1(), new AttributeListOD1(), new AttributeListPD1(), new AttributeListFD1()));
		list.add(new Group("F", "Preferred/preference convertible shares", new AttributeListVD1(), new AttributeListRD1(), new AttributeListID1(), new AttributeListFD1()));
		list.add(new Group("L", "Limited partnership units", new AttributeListVD1(), new AttributeListOD1(), new AttributeListPD1(), new AttributeListFD1()));
		list.add(new Group("D", "Depository receipts on equities", new AttributeListVD2(), new AttributeListRD1(), new AttributeListID1(), new AttributeListFD1()));
		list.add(new Group("Y", "Structured instruments (participation)", new AttributeListTD1(), new AttributeListDD1(), new AttributeListRD2(), new AttributeListUD1()));
		list.add(new Group("M", "Others (miscellaneous)", new AttributeListX(), new AttributeListX(), new AttributeListX(), new AttributeListFD1()));
		list.add(new Group("X", "Undefined", new AttributeListX(), new AttributeListX(), new AttributeListX(), new AttributeListX()));
		
	}

}
