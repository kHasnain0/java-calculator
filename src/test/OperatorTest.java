package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import operand.BinaryService;

import operand.OperandService;
import operator.AddService;
import operator.OperatorService;

class OperatorTest {

	@Test
	void testAddition() {
		
		//build
		OperandService val = new BinaryService(5,5);
		OperatorService add = new AddService(val);
		
		//operate
		add.execute();
		
		//check
		assertEquals(val.getAnswer(),10);
	}
	
	
	

}
