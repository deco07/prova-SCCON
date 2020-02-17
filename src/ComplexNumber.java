
public class ComplexNumber {
	
	private Double x;
	private Double y;
	
	public ComplexNumber() {
		x = 0.0;
		y = 0.0;
	}
	
	
	
	public ComplexNumber(Double x, Double y) {
		super();
		this.x = x;
		this.y = y;
	}


	public void somar(ComplexNumber z) {
			x = x + z.x;
			y = y + z.y;
	}

	public static ComplexNumber somar (ComplexNumber n1, ComplexNumber n2) {
	    return new ComplexNumber (n1.x + n2.x, n1.y + n2.y);
	}
}
