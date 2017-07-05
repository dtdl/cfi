package cfi.v2015;

import java.util.ArrayList;

import cfi.Attribute;
import cfi.AttributeList;

public class AttributeListX extends AttributeList {

	public AttributeListX() {
		super("X", "Undefined Dropdown List");
		this.list = new ArrayList<Attribute>();
		list.add(new Attribute("X", "Undefined"));

	}

}
