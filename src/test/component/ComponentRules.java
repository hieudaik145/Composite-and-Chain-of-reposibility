package test.component;

import test.validatefor.FieldCheckValidate;
import test.validatefor.RowCheckValidate;

public interface ComponentRules {

	ComponentResults validateFieldCheck(FieldCheckValidate fieldCheckValidate, RowCheckValidate rowCheckValidate);
	
	boolean canCheck(FieldCheckValidate fieldCheckValidate);
}
