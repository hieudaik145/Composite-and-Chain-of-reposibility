package test.validation.leaf;

import java.util.Map;

import test.common.CoreObject;
import test.component.ComponentResults;
import test.component.ComponentRules;
import test.result.SimpleResult;
import test.validatefor.FieldCheckValidate;
import test.validatefor.RowCheckValidate;

public class SoLuongCanBoValidator implements ComponentRules{
	
	public final String message = "Số lượng cán bộ của trung tâm văn hóa phải >= 50 người";
	
	private boolean isValidSoLuongCanBo(String soLuong) {
		int slcb = 0;
		try {
			slcb = Integer.parseInt(soLuong);
		}catch (Exception e) {
			return false;
		}
		return slcb >= 50;
	}

	@Override
	public ComponentResults validateFieldCheck(FieldCheckValidate fieldCheckValidate,
			RowCheckValidate rowCheckValidate) {
		
		SimpleResult simpleResult = new SimpleResult();
		
		simpleResult.setId(rowCheckValidate.getId());
		simpleResult.setTable(rowCheckValidate.getTable());
		simpleResult.setFieldCheckValidate(fieldCheckValidate);
		simpleResult.setMessage(message);
		simpleResult.setOk(isValidSoLuongCanBo(fieldCheckValidate.getValue()));
		
		return simpleResult;
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
