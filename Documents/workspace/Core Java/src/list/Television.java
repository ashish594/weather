package list;

public class Television {
	private int size;
	private String color;
	private String type;
	
	
	
	@Override
	public String toString() {
		return "Television [size=" + size + ", color=" + color + ", type=" + type + "]";
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
