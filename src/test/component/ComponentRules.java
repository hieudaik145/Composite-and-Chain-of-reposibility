package test.component;

import java.util.Map;

import test.common.CoreObject;
import test.validatefor.FieldCheckValidate;
import test.validatefor.RowCheckValidate;

public interface ComponentRules {

	ComponentResults validateFieldCheck(FieldCheckValidate fieldCheckValidate, RowCheckValidate rowCheckValidate);
	
	void validateRow(RowCheckValidate rowCheckValidate, CoreObject object);
	
	void validateListRow(Map<CoreObject, RowCheckValidate> maps);
	
}
