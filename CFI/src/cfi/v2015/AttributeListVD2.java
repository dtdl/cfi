package cfi.v2015;

import java.util.ArrayList;

import cfi.Attribute;
import cfi.AttributeList;

public class AttributeListVD2 extends AttributeList {

	public AttributeListVD2() {
		super("VD2", "Instrument Dependency Dropdown List");
		this.list = new ArrayList<Attribute>();
		
		list.add(new Attribute("S", "Common/ordinary shares"));
		list.add(new Attribute("P", "Preferred/preference shares"));
		list.add(new Attribute("C", "Common/ordinary convertible shares"));
		list.add(new Attribute("F", "Preferred/preference convertible shares"));
		list.add(new Attribute("L", "Limited Partnership units"));
		list.add(new Attribute("X", "Undefined"));

	}

}
