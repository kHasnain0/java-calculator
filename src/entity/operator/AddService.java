package entity.operator;

import entity.operand.OperandService;

public class AddService implements OperatorService {

	
	private final OperandService dependency;

	 public AddService(OperandService dependency) {
	      this.dependency = dependency;
	   }
	 
	@Override
	public void execute() {
		double sum = dependency.execute()[0] + dependency.execute()[1]; 
		
		dependency.setValue(sum);
		
	}

	
	
}
