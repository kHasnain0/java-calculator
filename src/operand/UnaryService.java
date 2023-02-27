package operand;

public class UnaryService implements OperandService {

	
	private double x;
	
	private double value = 0;
	
	 public UnaryService(int x) {
		 this.x = x;
	   }
	 
	@Override
	public double[] execute() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setValue(double value) {
		// TODO Auto-generated method stub

	}

	@Override
	public double getAnswer() {
		// TODO Auto-generated method stub
		return value;
	}

}
