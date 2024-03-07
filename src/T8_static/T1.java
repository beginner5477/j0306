package T8_static;

public class T1 {
	//static field
	static double pi = Math.PI;
	
	//static method
	static double circleS (int r) {
		double res = pi * r * r;
		return res;
	}

	public static double getPi() {
		return pi;
	}

	public static void setPi(double pi) {
		T1.pi = pi;
	}
}
