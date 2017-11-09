public class Component_Piece implements Piece_Interface {
	
	private String name = "";
	private String color = "";
	private String coordinate = "";
	
	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public void setCoordinate(String coordinate) {
		this.coordinate = coordinate;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getColor() {
		return color;
	}
	
	@Override
	public String getCoordinate() {
		return coordinate;
	}

}
