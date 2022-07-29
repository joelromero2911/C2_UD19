package MiniCalculadora;

public class MiniCalculadora {
	double result;

	/**
	 * Constructor
	 */
	public MiniCalculadora() {

	}

	/**
	 * Add
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public double sum(double a, double b) {
		result = a + b;
		return result;
	}

	/**
	 * Substract
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public double rest(double a, double b) {
		result = a - b;
		return result;
	}

	/**
	 * Multiply
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public double multiplication(double a, double b) {
		result = a * b;
		return result;
	}

	/**
	 * Split
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public double division(double a, double b) {
		result = a / b;
		return result;
	}

}
