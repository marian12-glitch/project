import java.util.Scanner;
class Room{
	private double width;
	private double length;
	private int floor;

	public Room(){
		width=10;
		length=12.5
		floor=1
	}

	public double getWidth(){
		return width;
	}

	public double setWidth(double width){
		if(width>0){
			this.width=width;
		}

		else {
			throw new IllegalArgumentException ("The width has to be greater than zero");

		}
	}

	public double getLength(){
		return length;
	}

	public double setLength(double length){
		if (length>0){
			this.length=length;
		}

		else{
			throw new IllegalArgumentException("The length has to be greater than zero");
		}
	}

	public int getFloor(){
		return floor;
	}

	public int setFloor(int floor){
		this.floor=floor;
	}

}