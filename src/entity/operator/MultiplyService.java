package entity.operator;

import entity.operand.OperandService;

public class MultiplyService implements OperatorService {

	private final OperandService dependency;

	 public MultiplyService(OperandService dependency) {
	      this.dependency = dependency;
	   }
	 
	@Override
	public void execute() {
		double sum = dependency.execute()[0] * dependency.execute()[1]; 
		
		
		dependency.setValue(sum);
		
	}
}
