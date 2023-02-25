package operator;

import operand.OperandService;

public class DivideService implements OperatorService {

	private final OperandService dependency;

	 public DivideService(OperandService dependency) {
	      this.dependency = dependency;
	   }
	 
	@Override
	public void execute() {
		int sum = dependency.execute()[0] / dependency.execute()[1]; 
		
		dependency.setValue(sum);
		
	}

}
