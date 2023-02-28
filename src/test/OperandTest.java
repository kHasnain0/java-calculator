package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import entity.operand.BinaryService;
import entity.operand.OperandService;
import entity.operand.UnaryService;
import entity.operator.AddService;
import entity.operator.DivideService;
import entity.operator.MultiplyService;
import entity.operator.OperatorService;
import entity.operator.SquareRootService;
import entity.operator.SubtractService;

class OperandTest {

	@Test
	void testBinary() {
		
		//build
		OperandService val = new BinaryService(5,5);
		OperatorService add = new AddService(val);
		
		//operate
		add.execute();
		
		//check
		assertEquals(val.getAnswer(),10);
	}
	
	
	@Test
	void testUnary() {
		
		//build
		OperandService val = new UnaryService(25);
		OperatorService add = new SquareRootService(val);
		
		//operate
		add.execute();
		
		//check
		assertEquals(val.getAnswer(),5);
	}
	
	@Test
	void testTrinary() {
		
		//25+5+10 =40 
				//build
				OperandService val = new BinaryService(25,5);
				OperatorService add = new AddService(val);
				add.execute();
				OperandService val2 = new BinaryService(val.getAnswer(),10);
				OperatorService add2 = new AddService(val2);
			//	System.out.println(val.getAnswer());
				
				//operate
				add2.execute();
				
				//check
				assertEquals(val2.getAnswer(),40);
			}
			
	
	
	
}
