package entity.operand;

public class BinaryService implements OperandService {

	private double inputA;
	private double inputB;
	
	private double value = 0;
	
	 public BinaryService(double inputA, double inputB) {
		 this.inputA = inputA;
		 this.inputB = inputB;
	   }
	 
	@Override
	public double[] execute()  {
		
		return new  double[]{inputA, inputB};		
	}
	

	@Override
	public double getAnswer() {
		
		return this.value;
	}

	@Override
	public void setValue(double value) {
		
		this.value = value;
		
	}

}
