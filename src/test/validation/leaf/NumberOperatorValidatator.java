package test.validation.leaf;

import test.common.NumberOperatorEnum;
import test.component.ComponentResults;
import test.component.ComponentRules;
import test.validatefor.FieldCheckValidate;
import test.validatefor.RowCheckValidate;

public class NumberOperatorValidatator implements ComponentRules{
	
	private int compareWith;
	
	private NumberOperatorEnum operator;

	

	public NumberOperatorValidatator(int compare, NumberOperatorEnum operator) {
		super();
		this.compareWith = compare;
		this.operator = operator;
	}

	private boolean isValidOperatorNumber(String value) {
		return operator.apply(Integer.parseInt(value), compareWith);
	}
	
	@Override
	public ComponentResults validateFieldCheck(FieldCheckValidate fieldCheckValidate,
			RowCheckValidate rowCheckValidate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean canCheck(FieldCheckValidate fieldCheckValidate) {
		// TODO Auto-generated method stub
		return false;
	}
	
	public static void main(String[] args) {
		NumberOperatorValidatator number = new NumberOperatorValidatator(10, NumberOperatorEnum.EQ);
		System.out.println(number.isValidOperatorNumber("10"));
		
	}

}
