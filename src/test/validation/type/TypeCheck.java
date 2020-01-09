package test.validation.type;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import test.component.ComponentRules;
import test.validation.leaf.AlphaNumericValidtor;
import test.validation.leaf.GioiTinhValidator;
import test.validation.leaf.MinLengthValidator;
import test.validation.leaf.NumberValidator;
import test.validation.leaf.SoLuongCanBoValidator;

public class TypeCheck {
	
	
	public static List<ComponentRules> typeNumberCheck(){
		
		List<ComponentRules> list = new ArrayList<>();
		
		list.add(new MinLengthValidator());
		list.add(new AlphaNumericValidtor());
		
		return list;
	}
	
	public static List<ComponentRules> typeCheckAlphaNumeric() {
		
		List<ComponentRules> list = new ArrayList<>();
		list.add(new AlphaNumericValidtor());
		
		return list;
	}

	public static List<ComponentRules> typeCheckSoLuongCanBoTTVH(){
		
		List<ComponentRules> list = Arrays.asList(new NumberValidator(), new SoLuongCanBoValidator());
		
		return list;
	}
	
	public static List<ComponentRules> typeCheckNguoiPhucVu(){
		List<ComponentRules> list = new ArrayList<>();
		list.add(new GioiTinhValidator());
		
		return list;
	}

}
