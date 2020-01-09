package test.rule;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import test.common.CoreObject;
import test.component.ComponentResults;
import test.component.ComponentRules;
import test.result.CompositeResults;
import test.validatefor.FieldCheckValidate;
import test.validatefor.RowCheckValidate;
import test.validation.leaf.NullCheckValidator;

public class CompositeRules implements ComponentRules {

	private List<ComponentRules> rules;

	public List<ComponentRules> getRules() {
		return rules;
	}

	public void setRules(List<ComponentRules> rules) {
		this.rules = rules;
	}

	@Override
	public ComponentResults validateFieldCheck(FieldCheckValidate fieldCheckValidate,
			RowCheckValidate rowCheckValidate) {
		CompositeResults result = new CompositeResults();

		setRules(fieldCheckValidate.getListRuleCheck());

		if (!canCheck(fieldCheckValidate)) {
			setRules(Arrays.asList(new NullCheckValidator()));
		}

		for (ComponentRules rule : rules) {
			if (rule.canCheck(fieldCheckValidate)) {
				ComponentResults componentresult = rule.validateFieldCheck(fieldCheckValidate, rowCheckValidate);

				if (!componentresult.isOk()) {
					result.add(componentresult);
				}
			}
		}

		return result;
	}

	public void validateRow(RowCheckValidate rowCheckValidate, CoreObject object) {

		CompositeResults resultRow = new CompositeResults();

		for (FieldCheckValidate fieldValidate : rowCheckValidate.getListFieldCheck()) {

			ComponentResults result = validateFieldCheck(fieldValidate, rowCheckValidate);
			if (!result.isOk()) {
				resultRow.add(result);
			}
		}

		if (!resultRow.isOk()) {
			resultRow.showError();
		} else {
			object.save();
		}

	}

	public void validateListRow(Map<CoreObject, RowCheckValidate> maps) {

		for (CoreObject object : maps.keySet()) {
			validateRow(maps.get(object), object);
		}
	}

	@Override
	public boolean canCheck(FieldCheckValidate fieldCheckValidate) {

		if (fieldCheckValidate.getValue() != null) {
			return true;
		}

		return false;
	}

}
