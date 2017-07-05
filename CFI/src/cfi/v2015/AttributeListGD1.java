package cfi.v2015;

import java.util.ArrayList;

import cfi.Attribute;
import cfi.AttributeList;

public class AttributeListGD1 extends AttributeList {

	public AttributeListGD1() {

		super("GD1", "Guarantee Dropdown List");
		this.list = new ArrayList<Attribute>();
		list.add(new Attribute("T", "Government guarantee"));
		list.add(new Attribute("G", "Joint guarantee"));
		list.add(new Attribute("S", "Secured"));
		list.add(new Attribute("U", "Unsecured/inguaranteed"));
		list.add(new Attribute("P", "Negative pledge"));
		list.add(new Attribute("N", "Senior"));
		list.add(new Attribute("O", "Senior subordinated"));
		list.add(new Attribute("Q", "Junior"));
		list.add(new Attribute("J", "Junior subordinated"));
		list.add(new Attribute("C", "Supranational"));
		list.add(new Attribute("X", "Undefined"));

	}

}
