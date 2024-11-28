package com.ibm.training.basics;

public class Point {
	
	int x,y;
	
	public Point(int x,int y){
		this.x = x;
		this.y = y;
	}

	
	//incomplete  - to be corrected
	
	public boolean equals(Object o) {
		Point other = (Point) o; //explicit typecast
		return (this.x == other.x && this.y == other.y);
	}
	
	@Override
	public String toString() {
		return "Point[x="+x+",y="+y+"]";
	}
}
