package cfi.v2015;

import java.util.ArrayList;

import cfi.Attribute;
import cfi.AttributeList;

public class AttributeListOD1 extends AttributeList {


	public AttributeListOD1() {
		super("OD1", "Ownership Dropdown List");
		this.list = new ArrayList<Attribute>();	
		list.add(new Attribute("T", "Restrictions"));
		list.add(new Attribute("U", "Free"));
		list.add(new Attribute("X", "Undefined"));

	}

}
