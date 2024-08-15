package Mutators;

public class Cuboid {
	//private data members
	private double length;
	private double breadth;
	private double height;
	
	//accessors or getters method
	public double getLength() {
		return this.length;
	}
	
	public double getBreadth() {
		return this.breadth;
	}
	
	public double getHeight() {
		return this.height;
	}
	
	public double volume() {
		return this.length * this.breadth * this.height;
	}
	
	//Mutators or Setters method
	public void setLength(double length) {
		this.length = length;
	}
	
	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}

	public String toString() {
		String s = "".format("Length: %.2f\nBreadth: %f\nHeight: %f\nVolume: %f", this.getLength(), this.getBreadth(), this.getHeight(), this.volume());
		return s;
	}
}
