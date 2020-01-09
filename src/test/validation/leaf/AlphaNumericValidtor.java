package test.validation.leaf;

import test.component.ComponentResults;
import test.component.ComponentRules;
import test.result.SimpleResult;
import test.validatefor.FieldCheckValidate;
import test.validatefor.RowCheckValidate;

public class AlphaNumericValidtor implements ComponentRules {

	public final String message = "The string should be alphanumeric";

	private boolean isAlphaNumeric(String s) {
		String pattern = "^[a-zA-Z0-9]*$";
		return s.matches(pattern);
	}

	@Override
	public ComponentResults validateFieldCheck(FieldCheckValidate fieldCheckValidate, RowCheckValidate rowCheckValidate) {
		SimpleResult simpleResult = new SimpleResult();
		
		simpleResult.setId(rowCheckValidate.getId());
		simpleResult.setTable(rowCheckValidate.getTable());
		simpleResult.setFieldCheckValidate(fieldCheckValidate);

		simpleResult.setOk(isAlphaNumeric(fieldCheckValidate.getValue()));
		simpleResult.setMessage(message);

		return simpleResult;
	}

	@Override
	public boolean canCheck(FieldCheckValidate fieldCheckValidate) {
		// TODO Auto-generated method stub
		return true;
	}

}
