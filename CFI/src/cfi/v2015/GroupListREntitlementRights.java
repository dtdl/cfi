package cfi.v2015;

import java.util.ArrayList;

import cfi.Attribute;
import cfi.AttributeList;

public class GroupListREntitlementRights extends AttributeList {


	public GroupListREntitlementRights() {
		super("R", "Entitlement (Rights) Group Dropdown List");
		this.list = new ArrayList<Attribute>();	
		list.add(new Attribute("A", "Allotment (bonus) rights"));
		list.add(new Attribute("S", "Subscription rights"));
		list.add(new Attribute("P", "Purchase rights"));
		list.add(new Attribute("W", "Warrants"));
		list.add(new Attribute("F", "Mini future certificates, constant leverage certificates"));
		list.add(new Attribute("D", "Depository receipts on entitlements"));
		list.add(new Attribute("M", "Others (miscellaneous)"));
		list.add(new Attribute("X", "Undefined"));
	}

}
