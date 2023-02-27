package operator;

import operand.OperandService;

public class SquareRootService implements OperatorService {

	private final OperandService dependency;

	 public SquareRootService(OperandService dependency) {
	      this.dependency = dependency;
	   }
	 
	@Override
	public void execute() {
		double sqRoot = Math.sqrt(dependency.execute()[0]); 
		
		
		dependency.setValue(sqRoot);
		
	}

}
