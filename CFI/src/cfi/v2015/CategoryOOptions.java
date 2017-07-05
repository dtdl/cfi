package cfi.v2015;

import java.util.ArrayList;

import cfi.Category;
import cfi.Group;

public class CategoryOOptions extends Category {


	public CategoryOOptions() {
		// TODO Auto-generated constructor stub
		super("O", "Listed Options");
		this.list = new ArrayList<Group>();
		//removed, as it is a mistake in cfi spec: 4th digitial should be SD3, not SD2
		//--list.add(new Group("C", "Call Options", new AttributeListED1(), new AttributeListUD1(), new AttributeListDD3(), new AttributeListSD2()));
		list.add(new Group("C", "Call Options", new AttributeListED1(), new AttributeListUD1(), new AttributeListDD3(), new AttributeListSD3()));
		//--list.add(new Group("P", "Put Options", new AttributeListED1(), new AttributeListUD1(), new AttributeListDD3(), new AttributeListSD2()));
		list.add(new Group("P", "Put Options", new AttributeListED1(), new AttributeListUD1(), new AttributeListDD3(), new AttributeListSD3()));
		list.add(new Group("M", "Others (miscellaneous)", new AttributeListX(), new AttributeListX(), new AttributeListX(), new AttributeListX()));
		list.add(new Group("X", "Undefined", new AttributeListX(), new AttributeListX(), new AttributeListX(), new AttributeListX()));
	}

}
