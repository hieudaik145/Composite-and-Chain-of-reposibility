package test.entity;

import test.common.CoreObject;

public class TheCoffeHouse extends CoreObject {

	private String id;
	private String tenCafe;
	private String giaBan;
	private String nguoiPhucVu;
	private String thuNgan;


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public TheCoffeHouse() {
		super();
	}

	public TheCoffeHouse(String id, String tenCafe, String giaBan, String nguoiPhucVu, String thuNgan) {
		super();
		this.id = id;
		this.tenCafe = tenCafe;
		this.giaBan = giaBan;
		this.nguoiPhucVu = nguoiPhucVu;
		this.thuNgan = thuNgan;
	}

	public String getTenCafe() {
		return tenCafe;
	}

	public void setTenCafe(String tenCafe) {
		this.tenCafe = tenCafe;
	}

	public String getGiaBan() {
		return giaBan;
	}

	public void setGiaBan(String giaBan) {
		this.giaBan = giaBan;
	}

	public String getNguoiPhucVu() {
		return nguoiPhucVu;
	}

	public void setNguoiPhucVu(String nguoiPhucVu) {
		this.nguoiPhucVu = nguoiPhucVu;
	}

	public String getThuNgan() {
		return thuNgan;
	}

	public void setThuNgan(String thuNgan) {
		this.thuNgan = thuNgan;
	}

	@Override
	public void save() {
		System.out.println("save the coffe house with id = " + this.id);
	}

	
}
