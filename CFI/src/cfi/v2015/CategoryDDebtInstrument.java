package cfi.v2015;

import java.util.ArrayList;

import cfi.Category;
import cfi.Group;

public class CategoryDDebtInstrument extends Category {


	public CategoryDDebtInstrument() {
		super("D", "Debt Instruments");
		this.list = new ArrayList<Group>();
		list.add(new Group("B", "Bonds", new AttributeListID3(), new AttributeListGD1(), new AttributeListRD3(), new AttributeListFD1()));
		list.add(new Group("C", "Convertible notes", new AttributeListID3(), new AttributeListGD1(), new AttributeListRD3(), new AttributeListFD1()));
		list.add(new Group("W", "Bonds with warrants attached", new AttributeListID3(), new AttributeListGD1(), new AttributeListRD3(), new AttributeListFD1()));
		list.add(new Group("T", "Medium term notes", new AttributeListID3(), new AttributeListGD1(), new AttributeListRD3(), new AttributeListFD1()));
		list.add(new Group("Y", "Money market instruments", new AttributeListID3(), new AttributeListGD1(), new AttributeListRD3(), new AttributeListFD1()));
		list.add(new Group("S", "Structured instruments (capital protected)", new AttributeListTD3(), new AttributeListDD1(), new AttributeListRD2(), new AttributeListUD1()));
		list.add(new Group("E", "Structured instruments (without capital protected)", new AttributeListTD4(), new AttributeListDD1(), new AttributeListRD2(), new AttributeListUD1()));
		list.add(new Group("G", "Mortgage backed securities", new AttributeListID3(), new AttributeListGD1(), new AttributeListRD3(), new AttributeListTD3()));
		list.add(new Group("A", "Asset backed securities", new AttributeListID3(), new AttributeListGD1(), new AttributeListRD3(), new AttributeListTD3()));
		list.add(new Group("N", "Municipal bonds", new AttributeListID3(), new AttributeListGD1(), new AttributeListRD3(), new AttributeListTD3()));
		list.add(new Group("D", "Depository receipts on debt instruments", new GroupListDDebtInstrument(), new AttributeListID3(), new AttributeListGD1(), new AttributeListRD3()));
		list.add(new Group("M", "Others (miscellaneous)", new AttributeListTD5(), new AttributeListX(), new AttributeListX(), new AttributeListFD1()));
		list.add(new Group("X", "Undefined", new AttributeListX(), new AttributeListX(), new AttributeListX(), new AttributeListX()));

	}

}
