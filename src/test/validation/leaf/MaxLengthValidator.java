package test.validation.leaf;

import test.component.ComponentResults;
import test.component.ComponentRules;
import test.result.SimpleResult;
import test.validatefor.FieldCheckValidate;
import test.validatefor.RowCheckValidate;

public class MaxLengthValidator implements ComponentRules {

	private long maxLength;

	private String message = "Độ dài phải >= " + this.maxLength;

	public MaxLengthValidator(long maxLength) {
		super();
		this.maxLength = maxLength;
	}

	private boolean isValidateMaxLenght(String value) {

		if (value.length() <= this.maxLength) {
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
		simpleResult.setOk(isValidateMaxLenght(fieldCheckValidate.getValue()));
		simpleResult.setMessage(message);

		return simpleResult;
	}

	@Override
	public boolean canCheck(FieldCheckValidate fieldCheckValidate) {
		// TODO Auto-generated method stub
		return true;
	}

}
