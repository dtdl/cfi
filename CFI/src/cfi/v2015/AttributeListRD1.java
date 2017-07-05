package cfi.v2015;

import java.util.ArrayList;

import cfi.Attribute;
import cfi.AttributeList;

public class AttributeListRD1 extends AttributeList {

	public AttributeListRD1() {
		super("RD1", "Redemption Dropdown List 1");
		this.list = new ArrayList<Attribute>();
		list.add(new Attribute("R", "Redeemable"));
		list.add(new Attribute("E", "Extendible"));
		list.add(new Attribute("T", "Redeemable/Extendible"));
		list.add(new Attribute("G", "Exchangeable"));
		list.add(new Attribute("A", "Redeemable/Extendible/Transferable"));
		list.add(new Attribute("C", "Redeemable/Exchangeable"));
		list.add(new Attribute("N", "Perpetual"));
		list.add(new Attribute("X", "Undefined"));

	}

}
