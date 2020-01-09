package test.result;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import test.component.ComponentResults;

public class CompositeResults implements ComponentResults {
	
	private List<ComponentResults> results;
	
	public CompositeResults() {
		super();
		results = new ArrayList<>();
	}

	public void add(ComponentResults result) {
		this.results.add(result);
	}
	
	public void addAll(Collection<ComponentResults> collections) {
		this.results.addAll(collections);
	}
	
	@Override
	public boolean isOk() {
		
		if(results.isEmpty()) {
			return true;
		}
		return false;
	}
	
	public List<ComponentResults> getResults() {
		return results;
	}
	
	public void setResults(List<ComponentResults> results) {
		this.results = results;
	}

	@Override
	public void showError() {
		for(ComponentResults result: results) {
			result.showError();
		}
		
	}

	@Override
	public void doAction() {
		for(ComponentResults result: results) {
			result.doAction();
		}
	}

}
