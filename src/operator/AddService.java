package operator;

import operand.OperandService;

public class AddService implements OperatorService {

	
	private final OperandService dependency;

	 public AddService(OperandService dependency) {
	      this.dependency = dependency;
	   }
	 
	@Override
	public void execute() {
		int sum = dependency.execute()[0] + dependency.execute()[1]; 
		
		dependency.setValue(sum);
		
	}

	
	
}
