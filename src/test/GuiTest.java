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

class GuiTest {

	@Test
	void testAddition() {
		String input = "5+5+5+7+8";
		
		//build
		OperandService val = new BinaryService(5,5);
		OperatorService add = new AddService(val);
		
		//operate
		add.execute();
		
		//check
		assertEquals(val.getAnswer(),10);
	}
	
	

}
