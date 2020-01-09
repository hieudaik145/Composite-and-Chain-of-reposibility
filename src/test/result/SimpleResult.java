package test.result;

import test.component.ComponentResults;
import test.validatefor.FieldCheckValidate;

public class SimpleResult implements ComponentResults {

	private boolean isOk;
	private String message;
	private String id;
	private String table;
	private FieldCheckValidate fieldCheckValidate;
	
	public FieldCheckValidate getFieldCheckValidate() {
		return fieldCheckValidate;
	}

	public void setFieldCheckValidate(FieldCheckValidate fieldCheckValidate) {
		this.fieldCheckValidate = fieldCheckValidate;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTable() {
		return table;
	}

	public void setTable(String table) {
		this.table = table;
	}

	public SimpleResult(boolean isOk) {
		super();
		this.isOk = isOk;
	}

	public SimpleResult() {
		super();
	}

	@Override
	public boolean isOk() {
		return isOk;
	}

	public void setOk(boolean isOk) {
		this.isOk = isOk;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public void showError() {
		System.out.println("save Error to" + toString());
		
	}
	
	@Override
	public void doAction() {
		System.out.println("save object " + toString());
	}
	
	
	@Override
	public String toString() {
		return "SimpleResult [isOk=" + isOk + ", message=" + message + ", id=" + id + ", table=" + table
				+ ", fieldCheckValidate=" + fieldCheckValidate.getFieldName() + " " + fieldCheckValidate.getType() + " " + fieldCheckValidate.getValue() + "]";
	}

	
	
}
