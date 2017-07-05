package cfi;

import java.util.List;

import cfi.base.ItemList;

public class Category extends ItemList {
	
	protected List<Group> list;

	public Category(String name, String description, List<Group> items) {
		super(name, description, items);
	}

	public Category(String name, String description) {
		super(name, description);
	}

	public Category(List<Group> items) {
		super(items);
	}

	public Category() {
		super();
	}
	
	public List<Group> getList() {
		return this.list;
	}
	
	public int size() {
		return this.list.size();
	}

}
