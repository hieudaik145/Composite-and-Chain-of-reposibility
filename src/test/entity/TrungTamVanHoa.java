package test.entity;

import test.common.CoreObject;

public class TrungTamVanHoa extends CoreObject {
	
	private int id;
	private String tenCuaTrungTamVanHoa;
	private int soLuongCanBo;
	
	public TrungTamVanHoa() {
		super();
	}
	
	public TrungTamVanHoa(int id, String tenCuaTrungTamVanHoa, int soLuongCanBo) {
		super();
		this.id = id;
		this.tenCuaTrungTamVanHoa = tenCuaTrungTamVanHoa;
		this.soLuongCanBo = soLuongCanBo;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTenCuaTrungTamVanHoa() {
		return tenCuaTrungTamVanHoa;
	}
	public void setTenCuaTrungTamVanHoa(String tenCuaTrungTamVanHoa) {
		this.tenCuaTrungTamVanHoa = tenCuaTrungTamVanHoa;
	}
	public int getSoLuongCanBo() {
		return soLuongCanBo;
	}
	public void setSoLuongCanBo(int soLuongCanBo) {
		this.soLuongCanBo = soLuongCanBo;
	}

	@Override
	public void save() {
		System.out.println("save Trung Tam Van Hoa With id = " + this.id);
	}
	
	
}
