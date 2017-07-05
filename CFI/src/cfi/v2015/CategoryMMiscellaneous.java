package cfi.v2015;

import java.util.ArrayList;

import cfi.Category;
import cfi.Group;

public class CategoryMMiscellaneous extends Category {


	public CategoryMMiscellaneous() {
		super("M", "Miscellaneous");
		this.list = new ArrayList<Group>();
		list.add(new Group("C", "Combined instruments", new AttributeListCD3(), new AttributeListOD1(), new AttributeListX(), new AttributeListFD1()));
		list.add(new Group("M", "Other", new AttributeListGD2(), new AttributeListX(), new AttributeListX(), new AttributeListX()));
		list.add(new Group("X", "Undefined", new AttributeListX(), new AttributeListX(), new AttributeListX(), new AttributeListX()));

	}

}
