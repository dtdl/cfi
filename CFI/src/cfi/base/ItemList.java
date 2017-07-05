package cfi.base;

import java.util.ArrayList;
import java.util.List;

public class ItemList extends Item {

	protected List<? extends Item> list;

	public ItemList(String name, String description, List<? extends Item> items) {
		super(name, description);
		this.setList(items);
	}

	public ItemList(String name, String description) {
		super(name, description);
	}
	
	public ItemList(List<? extends Item> items) {
		this.setList(items);
	}

	public ItemList() {
		this.list = new ArrayList<Item>();
	}

	public List<? extends Item> getItems() {
		return list;
	}

	public void setList(List<? extends Item> list) {
		this.list = list;
	}

	public void getList(List<? extends Item> list) {
		this.list = list;
	}
	
	public int size() {
		return this.list.size();
	}
}
