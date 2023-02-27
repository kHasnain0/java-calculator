package operand;

public class BinaryService implements OperandService {

	private double x;
	private double y;
	
	private double value = 0;
	
	 public BinaryService(int x, int y) {
		 this.x = x;
		 this.y = y;
	   }
	 
	@Override
	public double[] execute()  {
		
		double[] values = {x,y};
		
		return values;
			
	}
	

	@Override
	public double getAnswer() {
		// TODO Auto-generated method stub
		return this.value;
	}

	@Override
	public void setValue(double value) {
		// TODO Auto-generated method stub
		this.value = value;
		
	}

}
