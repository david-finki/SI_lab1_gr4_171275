class Point {
	String id
	double x,y;

	//TODO add new variable

	//TODO constructor
	public Point(String id, double x, double y){
		this.id=id;
		this.x=x;
		this.y=y;
	}
	//TODO setters and getters
	public void setID(String id){this.id=id;}
	public void setX(double x){this.x=x;}
	public void setX(double y){this.y=y;}

	public void move (char xDirection, char yDirection) {
		x+= xDirection=="L"?1:-1;
		y+= yDirection=="U"?1:-1;
		

	}

	public void draw () {
		System.out.println(this.x+" "+this.y);
	}

}