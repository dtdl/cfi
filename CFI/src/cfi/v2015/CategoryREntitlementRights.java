package cfi.v2015;

import java.util.ArrayList;

import cfi.Category;
import cfi.Group;

public class CategoryREntitlementRights extends Category {


	public CategoryREntitlementRights() {
		super("R", "Entitlement (Rights)");
		this.list = new ArrayList<Group>();
		list.add(new Group("A", "Allotment (bonus) rights", new AttributeListX(), new AttributeListX(), new AttributeListX(), new AttributeListFD1()));
		list.add(new Group("S", "Subscription rights", new AttributeListAD2(), new AttributeListX(), new AttributeListX(), new AttributeListFD1()));
		list.add(new Group("P", "Purchase rights", new AttributeListAD2(), new AttributeListX(), new AttributeListX(), new AttributeListFD1()));
		list.add(new Group("W", "Warrants", new AttributeListUD1(), new AttributeListTD6(), new AttributeListCD2(), new AttributeListED1()));
		list.add(new Group("F", "Mini future certificates, constant leverage certificates", new AttributeListUD1(), new AttributeListBD1(), new AttributeListLD1(), new AttributeListED1()));
		list.add(new Group("D", "Depository receipts on entitlements", new GroupListREntitlementRights(), new AttributeListX(), new AttributeListX(), new AttributeListFD1()));
		list.add(new Group("M", "Others (miscellaneous)", new AttributeListX(), new AttributeListX(), new AttributeListX(), new AttributeListX()));
		list.add(new Group("X", "Undefined", new AttributeListX(), new AttributeListX(), new AttributeListX(), new AttributeListX()));

	}

}
