package operand;

public class UnaryService implements OperandService {

	
	private int x;
	
	private int value = 0;
	
	 public UnaryService(int x) {
		 this.x = x;
	   }
	 
	@Override
	public int[] execute() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setValue(int value) {
		// TODO Auto-generated method stub

	}

	@Override
	public int getAnswer() {
		// TODO Auto-generated method stub
		return value;
	}

}
