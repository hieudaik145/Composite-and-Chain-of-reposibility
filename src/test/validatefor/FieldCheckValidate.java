package test.validatefor;

import java.util.List;

import test.component.ComponentRules;

public class FieldCheckValidate {
	
	private String type;
	
	private String fieldName;
	
	private String value;
	
	private List<ComponentRules> listRuleCheck;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public List<ComponentRules> getListRuleCheck() {
		return listRuleCheck;
	}

	public void setListRuleCheck(List<ComponentRules> listRuleCheck) {
		this.listRuleCheck = listRuleCheck;
	}
	
}
