package test.validation.leaf;

import test.component.ComponentResults;
import test.component.ComponentRules;
import test.result.SimpleResult;
import test.validatefor.FieldCheckValidate;
import test.validatefor.RowCheckValidate;

public class GioiTinhValidator implements ComponentRules {

	private final String message = "Giới tính chỉ có thể là Nam or Nữ";
	
	private boolean isGioiTinhValidator(String value) {
		
		if("Nam".equals(value) || "Nu".equals(value)) {
			return true;
		}
		return false;
	}

	@Override
	public ComponentResults validateFieldCheck(FieldCheckValidate fieldCheckValidate,
			RowCheckValidate rowCheckValidate) {
		SimpleResult simpleResult = new SimpleResult();

		simpleResult.setId(rowCheckValidate.getId());
		simpleResult.setTable(rowCheckValidate.getTable());
		simpleResult.setFieldCheckValidate(fieldCheckValidate);
		simpleResult.setOk(isGioiTinhValidator(fieldCheckValidate.getValue()));
		simpleResult.setMessage(message);
		return simpleResult;
	}

	@Override
	public boolean canCheck(FieldCheckValidate fieldCheckValidate) {
		// TODO Auto-generated method stub
		return true;
	}

}
