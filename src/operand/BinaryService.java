package operand;

public class BinaryService implements OperandService {

	private int x;
	private int y;
	
	private int value = 0;
	
	 public BinaryService(int x, int y) {
		 this.x = x;
		 this.y = y;
	   }
	 
	@Override
	public int[] execute()  {
		
		int[] values = {x,y};
		
		return values;
			
	}
	

	@Override
	public int getAnswer() {
		// TODO Auto-generated method stub
		return this.value;
	}

	@Override
	public void setValue(int value) {
		// TODO Auto-generated method stub
		this.value = value;
		
	}

}
