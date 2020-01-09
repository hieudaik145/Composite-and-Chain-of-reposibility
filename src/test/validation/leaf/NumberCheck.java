package test.validation.leaf;

import java.util.Map;

import test.common.CoreObject;
import test.component.ComponentResults;
import test.component.ComponentRules;
import test.validatefor.FieldCheckValidate;
import test.validatefor.RowCheckValidate;

public class NumberCheck implements ComponentRules{
	

	@Override
	public ComponentResults validateFieldCheck(FieldCheckValidate fieldCheckValidate,
			RowCheckValidate rowCheckValidate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void validateRow(RowCheckValidate rowCheckValidate, CoreObject object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void validateListRow(Map<CoreObject, RowCheckValidate> maps) {
		// TODO Auto-generated method stub
		
	}

}
