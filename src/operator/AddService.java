package operator;

import operand.OperandService;

public class AddService implements OperatorService {

	
	private final OperandService dependency;

	 public AddService(OperandService dependency) {
	      this.dependency = dependency;
	   }
	 
	@Override
	public void execute() {
		int sum = 0; 
		for (int i : dependency.execute()) {
			sum +=i;
		}
		
		dependency.setValue(sum);
		
	}

	
	
}
