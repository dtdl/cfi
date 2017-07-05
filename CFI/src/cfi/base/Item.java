package cfi.base;

public class Item {

	protected String name = null;
	protected String description = null;

	public Item(String name, String description) {
		this.name = name;
		this.description = description;
	}

	public Item() {
		this.name = "";
		this.description = "";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
