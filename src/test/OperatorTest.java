package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import entity.operand.BinaryService;
import entity.operand.OperandService;
import entity.operator.AddService;
import entity.operator.DivideService;
import entity.operator.MultiplyService;
import entity.operator.OperatorService;
import entity.operator.PowerService;
import entity.operator.SubtractService;

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
	
	
	@Test
	void testSubstraction() {
		
		//build
		OperandService val = new BinaryService(-5,5);
		OperatorService add = new SubtractService(val);
		
		//operate
		add.execute();
		
		//check
		assertEquals(val.getAnswer(),-10);
	}
	
	
	@Test
	void testMultiplication() {
		
		//build
		OperandService val = new BinaryService(-5,5);
		OperatorService add = new MultiplyService(val);
		
		//operate
		add.execute();
		
		//check
		assertEquals(val.getAnswer(),-25);
	}
	
	
	@Test
	void testDivision() {
		
		//build
		OperandService val = new BinaryService(-5,5);
		OperatorService add = new DivideService(val);
		
		//operate
		add.execute();
		
		//check
		assertEquals(val.getAnswer(),-1);
	}
	
	
	@Test
	void testPower() {
		
		//build
		OperandService val = new BinaryService(2,2);
		OperatorService add = new PowerService(val);
		
		//operate
		add.execute();
		
		//check
		assertEquals(val.getAnswer(), 4);
	}
	

}
