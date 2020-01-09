package test.validation.leaf;

import test.component.ComponentResults;
import test.component.ComponentRules;
import test.result.SimpleResult;
import test.validatefor.FieldCheckValidate;
import test.validatefor.RowCheckValidate;

public class NullCheckValidator implements ComponentRules {

	private final String message = "Value check is null";
	
	@Override
	public ComponentResults validateFieldCheck(FieldCheckValidate fieldCheckValidate,
			RowCheckValidate rowCheckValidate) {
		SimpleResult simpleResult = new SimpleResult();

		simpleResult.setId(rowCheckValidate.getId());
		simpleResult.setTable(rowCheckValidate.getTable());
		simpleResult.setFieldCheckValidate(fieldCheckValidate);
		simpleResult.setOk(canCheck(fieldCheckValidate));
		simpleResult.setMessage(message);

		return simpleResult;
	}

	@Override
	public boolean canCheck(FieldCheckValidate fieldCheckValidate) {
		
		if(fieldCheckValidate.getValue() != null) {
			return true;
		}
		
		return false;
	}

}
