package cfi.v2015;

import java.util.ArrayList;

import cfi.Category;
import cfi.Group;

public class CategoryFFutures extends Category {


	public CategoryFFutures() {

		super("F", "Futures");
		this.list = new ArrayList<Group>();
		list.add(new Group("F", "Financial futures", new AttributeListUD1(), new AttributeListDD3(), new AttributeListSD3(), new AttributeListX()));
		list.add(new Group("C", "Commodities futures", new AttributeListUD2(), new AttributeListDD3(), new AttributeListSD3(), new AttributeListX()));
		list.add(new Group("X", "Undefined", new AttributeListX(), new AttributeListX(), new AttributeListX(), new AttributeListX()));
	}

}
