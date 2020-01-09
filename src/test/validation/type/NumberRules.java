package test.validation.type;

import java.util.Arrays;
import java.util.List;

import test.component.ComponentRules;
import test.validation.leaf.NumberValidator;

public class NumberRules {

	private List<ComponentRules> rules = Arrays.asList(new NumberValidator());

	public List<ComponentRules> getRules() {
		return rules;
	}

	public void setRules(List<ComponentRules> rules) {
		this.rules = rules;
	}
	
	
}
