package test.validation.leaf;

import test.component.ComponentResults;
import test.component.ComponentRules;
import test.result.SimpleResult;
import test.validatefor.FieldCheckValidate;
import test.validatefor.RowCheckValidate;

public class SoLuongCanBoValidator implements ComponentRules{
	
	public final String message = "Số lượng cán bộ của trung tâm văn hóa phải >= 50 người";
	
	private boolean isValidSoLuongCanBo(String soLuong) {
		
		int	slcb = Integer.parseInt(soLuong);
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
	public boolean canCheck(FieldCheckValidate fieldCheckValidate) {
		try {
			Integer.parseInt(fieldCheckValidate.getValue());
			return true;
		}catch (Exception e) {
			return false;
		}
	}

}
