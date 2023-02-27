package operand;

public class UnaryService implements OperandService {

	
	private double input;
	
	private double value = 0;
	
	 public UnaryService(double input) {
		 this.input = input;
	   }
	 
	@Override
	public double[] execute() {
		   // Return a lambda expression hat returns a double array
        return  new double[]{input};
        
	}
	
	@Override
	public void setValue(double value) {
		// TODO Auto-generated method stub
		this.value = value;

	}

	@Override
	public double getAnswer() {
		// TODO Auto-generated method stub
		return value;
	}

}
