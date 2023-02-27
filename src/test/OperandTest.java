package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import operand.BinaryService;

import operand.OperandService;
import operand.UnaryService;
import operator.AddService;
import operator.DivideService;
import operator.MultiplyService;
import operator.OperatorService;
import operator.SquareRootService;
import operator.SubtractService;

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
	
	
	
}
