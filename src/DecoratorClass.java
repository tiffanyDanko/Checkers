
public class DecoratorClass implements Piece_Interface {
	
	protected Piece_Interface piece;
	private String name = "";
	private String color = "";
	private String coordinate = "";
	
	public DecoratorClass(Piece_Interface piece) {
		this.piece = piece;
	}

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
