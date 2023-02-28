package entity.operator;

import entity.operand.OperandService;

public class PowerService implements OperatorService {

	private final OperandService dependency;

	 public PowerService(OperandService dependency) {
	      this.dependency = dependency;
	   }
	 
	@Override
	public void execute() {
		double sqRoot = Math.pow(dependency.execute()[0],dependency.execute()[1] ); 
		
		
		dependency.setValue(sqRoot);
		
	}

}


