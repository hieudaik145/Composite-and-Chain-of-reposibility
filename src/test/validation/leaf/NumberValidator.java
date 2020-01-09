package test.validation.leaf;

import test.component.ComponentResults;
import test.component.ComponentRules;
import test.result.SimpleResult;
import test.validatefor.FieldCheckValidate;
import test.validatefor.RowCheckValidate;

public class NumberValidator implements ComponentRules {
	
	private final String message = "String must be number";

	private boolean isValidateNumberic(String value) {

		String pattern = ".*([0-9])";

		return value.matches(pattern);

	}

	@Override
	public ComponentResults validateFieldCheck(FieldCheckValidate fieldCheckValidate,
			RowCheckValidate rowCheckValidate) {

		SimpleResult simpleResult = new SimpleResult();

		simpleResult.setId(rowCheckValidate.getId());
		simpleResult.setTable(rowCheckValidate.getTable());
		simpleResult.setFieldCheckValidate(fieldCheckValidate);
		simpleResult.setMessage(message);
		simpleResult.setOk(isValidateNumberic(fieldCheckValidate.getValue()));
		
		return simpleResult;
	}
	
	public static void main(String[] args) {
		NumberValidator check = new NumberValidator();
		
		System.out.println(check.isValidateNumberic(""));
	}

	@Override
	public boolean canCheck(FieldCheckValidate fieldCheckValidate) {
		return true;
	}

}
