package cfi;

import java.util.List;

import cfi.base.Item;
import cfi.base.ItemList;

public class AttributeList extends ItemList {
	
	protected List<Attribute> list;

	public AttributeList(String name, String description,
			List<Attribute> items) {
		super(name, description, items);
	}

	public AttributeList(String name, String description) {
		super(name, description);
	}

	public AttributeList(List<? extends Item> items) {
		super(items);
	}

	public AttributeList() {
		super();
	}
	
	public List<Attribute> getList(){
		return this.list;
	}

	@Override
	public int size() {
		return this.list.size();
	}
}
