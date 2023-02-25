package operator;

import operand.OperandService;

public class MultiplyService implements OperatorService {

	private final OperandService dependency;

	 public MultiplyService(OperandService dependency) {
	      this.dependency = dependency;
	   }
	 
	@Override
	public void execute() {
		int sum = dependency.execute()[0] * dependency.execute()[1]; 
		
		
		dependency.setValue(sum);
		
	}
}
