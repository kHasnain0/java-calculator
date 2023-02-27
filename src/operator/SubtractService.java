package operator;

import operand.OperandService;

public class SubtractService implements OperatorService {

	private final OperandService dependency;

	 public SubtractService(OperandService dependency) {
	      this.dependency = dependency;
	   }
	 
	@Override
	public void execute() {
		double sum = dependency.execute()[0] - dependency.execute()[1]; 
		
		
		dependency.setValue(sum);
		
	}
}
