package punts;

public class Segment {

	private int x1;
	private int y1;
	private int x2;
	private int y2;
	
	public Segment() {
		x1 = 0;
		y1 = 0;
		x2 = 0;
		y2 = 0;
	}
	
	public Segment(Punt p1, Punt p2) {
		x1 = p1.getX();
		y1 = p1.getY();
		x2 = p2.getX();
		y2 = p2.getY();
	}

	public int getX1() {
		return x1;
	}

	public void setX1(int x1) {
		this.x1 = x1;
	}

	public int getY1() {
		return y1;
	}

	public void setY1(int y1) {
		this.y1 = y1;
	}

	public int getX2() {
		return x2;
	}

	public void setX2(int x2) {
		this.x2 = x2;
	}

	public int getY2() {
		return y2;
	}

	public void setY2(int y2) {
		this.y2 = y2;
	}
	
	public double longitud() {
		double longitud = Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2));
		return longitud;
	}
}
