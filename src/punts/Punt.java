package punts;

public class Punt {

	int[] coord;

	public Punt(int x, int y) {
		coord = new int[2];
		setX(x);
		setY(y);
	}

	public Punt() {
		coord = new int[2];
		coord[0] = 0;
		coord[1] = 0;
	}

	public int getX() {
		return coord[0];
	}

	public int getY() {
		return coord[1];
	}

	public void setX(int x) throws IllegalArgumentException {
		if (x >= 0) {
			coord[0] = x;
		} else {
			throw new IllegalArgumentException();
		}
	}

	public void setY(int y) throws IllegalArgumentException {
		if (y >= 0) {
			coord[1] = y;
		} else {
			throw new IllegalArgumentException();
		}
	}

	public void Suma(Punt p) {
		coord[0] += p.getX();
		coord[1] += p.getY();
	}

}
