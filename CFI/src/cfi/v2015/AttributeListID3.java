package cfi.v2015;

import java.util.ArrayList;

import cfi.Attribute;
import cfi.AttributeList;

public class AttributeListID3 extends AttributeList {

	public AttributeListID3() {
		super("ID3", "Interest Dropdown List");
		this.list = new ArrayList<Attribute>();
		list.add(new Attribute("F", "Fixed rate"));
		list.add(new Attribute("Z", "Zero rate/discounted"));
		list.add(new Attribute("V", "Variable rate"));
		list.add(new Attribute("C", "Cash payment"));
		list.add(new Attribute("K", "Payment in kind"));
		list.add(new Attribute("X", "Undefined"));

	}

}
