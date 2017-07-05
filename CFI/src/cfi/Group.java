package cfi;

import java.util.ArrayList;
import java.util.List;

import cfi.base.ItemList;

public class Group extends ItemList {
	
	protected List<AttributeList> list;

	public Group(String name, String description, List<AttributeList> items) {
		super(name, description, items);
		// TODO Auto-generated constructor stub
	}

	public Group(String name, String description, AttributeList attributeList1, AttributeList attributeList2, AttributeList attributeList3, AttributeList attributeList4) {
		super(name, description);
		this.list = new ArrayList<AttributeList>();
		list.add(attributeList1);
		list.add(attributeList2);
		list.add(attributeList3);
		list.add(attributeList4);
	}
	
	public Group(String name, String description) {
		super(name, description);
	}

	public Group(List<AttributeList> items) {
		super(items);
	}

	public Group() {
		super();
	}
	
	public List<AttributeList> getList() {
		return this.list;
	}
	
	public AttributeList getAttributeList1() throws NullPointerException {
		return this.list.get(0);
	}

	public AttributeList getAttributeList2() throws NullPointerException {
		return this.list.get(1);
	}

	public AttributeList getAttributeList3() throws NullPointerException {
		return this.list.get(2);
	}

	public AttributeList getAttributeList4() throws NullPointerException {
		return this.list.get(3);
	}
	
	@Override
	public int size() {
		return this.list.size();
	}

}
