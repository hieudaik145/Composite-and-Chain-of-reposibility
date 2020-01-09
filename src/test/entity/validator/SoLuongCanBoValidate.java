package test.entity.validator;

import java.util.ArrayList;
import java.util.List;

import test.common.NumberOperatorEnum;
import test.component.ComponentRules;
import test.validation.leaf.NumberOperatorValidatator;
import test.validation.leaf.SoLuongCanBoValidator;
import test.validation.type.NumberRules;

public class SoLuongCanBoValidate extends NumberRules{

	@Override
	public List<ComponentRules> getRules() {
		
		List<ComponentRules> rules = new ArrayList<>();
		rules.addAll(super.getRules());
		rules.add(new SoLuongCanBoValidator());
		rules.add(new NumberOperatorValidatator(5, NumberOperatorEnum.EQ));
		
		return rules;
	}

}
