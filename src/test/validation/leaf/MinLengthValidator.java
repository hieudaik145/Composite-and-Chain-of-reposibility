package test.validation.leaf;

import java.util.Map;

import test.common.CoreObject;
import test.component.ComponentResults;
import test.component.ComponentRules;
import test.result.SimpleResult;
import test.validatefor.FieldCheckValidate;
import test.validatefor.RowCheckValidate;

public class MinLengthValidator implements ComponentRules {

	private final String message = "Min lenght value must be >=8";

	private boolean isMinLenghtValidator(String value) {
		if (value.length() < 8) {
			return false;
		}
		return true;
	}

	@Override
	public ComponentResults validateFieldCheck(FieldCheckValidate fieldCheckValidate, RowCheckValidate rowCheckValidate) {
		SimpleResult simpleResult = new SimpleResult();
		
		simpleResult.setId(rowCheckValidate.getId());
		simpleResult.setTable(rowCheckValidate.getTable());
		simpleResult.setFieldCheckValidate(fieldCheckValidate);
		simpleResult.setOk(isMinLenghtValidator(fieldCheckValidate.getValue()));
		simpleResult.setMessage(message);

		return simpleResult;
	}


	@Override
	public void validateListRow(Map<CoreObject, RowCheckValidate> maps) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void validateRow(RowCheckValidate rowCheckValidate, CoreObject object) {
		// TODO Auto-generated method stub
		
	}


}
