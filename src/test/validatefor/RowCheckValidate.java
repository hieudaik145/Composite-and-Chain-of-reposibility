package test.validatefor;

import java.util.List;

public class RowCheckValidate {
	
	private String id;

	private String table;
	
	private List<FieldCheckValidate> listFieldCheck;

	public List<FieldCheckValidate> getListFieldCheck() {
		return listFieldCheck;
	}

	public void setListFieldCheck(List<FieldCheckValidate> listFieldCheck) {
		this.listFieldCheck = listFieldCheck;
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
}
