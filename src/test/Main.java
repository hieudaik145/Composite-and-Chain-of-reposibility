package test;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import test.common.CoreObject;
import test.common.Support;
import test.component.ComponentRules;
import test.entity.TheCoffeHouse;
import test.entity.TrungTamVanHoa;
import test.rule.CompositeRules;
import test.service.TheCoffeHouseService;
import test.service.TrungTamVanHoaService;
import test.validatefor.FieldCheckValidate;
import test.validatefor.RowCheckValidate;
import test.validation.type.TypeCheck;

public class Main {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException {
		
		TheCoffeHouseService service = new TheCoffeHouseService();
		
		TrungTamVanHoaService ttvhService = new TrungTamVanHoaService();

		ComponentRules rules = new CompositeRules();

		List<TheCoffeHouse> list = service.getTheCoffeHouseLst();
		
		List<TrungTamVanHoa> ttvhs = ttvhService.createTrungTamVanHoa();
		
		Map<CoreObject, RowCheckValidate> mapObject = createMapTheCoffeeHouses(list);
		
		mapObject.putAll(createMapTrungTamVanHoa(ttvhs));
		
		rules.validateListRow(mapObject);
		
	}
	
	private static Map<CoreObject, RowCheckValidate> createMapTrungTamVanHoa(List<TrungTamVanHoa> list) {
		
		Map<CoreObject, RowCheckValidate> map = new LinkedHashMap<CoreObject, RowCheckValidate>();
		
		for (TrungTamVanHoa trungTamVanHoa : list) {
			RowCheckValidate rowCheck = new RowCheckValidate();
			rowCheck.setId(String.valueOf(trungTamVanHoa.getId()));
			rowCheck.setTable(TrungTamVanHoa.class.getSimpleName());
			
			List<FieldCheckValidate> listFieldCheckValidates = new ArrayList<>();
			
			FieldCheckValidate fieldCheckSoLuongCanBo = new FieldCheckValidate();
			fieldCheckSoLuongCanBo.setFieldName("soLuongCanBo");
			fieldCheckSoLuongCanBo.setValue(String.valueOf(trungTamVanHoa.getSoLuongCanBo()));
			fieldCheckSoLuongCanBo.setType("int");
			fieldCheckSoLuongCanBo.setListRuleCheck(TypeCheck.typeCheckSoLuongCanBoTTVH());
			
			listFieldCheckValidates.add(fieldCheckSoLuongCanBo);
			
			rowCheck.setListFieldCheck(listFieldCheckValidates);
			
			map.put(trungTamVanHoa, rowCheck);
			
		}
		
		return map;
	}
	
	private static Map<CoreObject, RowCheckValidate> createMapTheCoffeeHouses(List<TheCoffeHouse> list) throws NoSuchFieldException, SecurityException {
		
		
		TheCoffeHouse label = Support.validateFor(TheCoffeHouse.class);
		Map<CoreObject, RowCheckValidate> map = new LinkedHashMap<CoreObject, RowCheckValidate>();
		
		for (TheCoffeHouse theCoffeHouse : list) {
			
			
			RowCheckValidate rowCheck = new RowCheckValidate();
			rowCheck.setId(String.valueOf(theCoffeHouse.getId()));
			rowCheck.setTable(TheCoffeHouse.class.getSimpleName());
			
			List<FieldCheckValidate> listFieldCheckValidates = new ArrayList<>();
			
			FieldCheckValidate fieldCheckTenCafe = new FieldCheckValidate();
			fieldCheckTenCafe.setFieldName(label.getTenCafe());
			fieldCheckTenCafe.setValue(theCoffeHouse.getTenCafe());
			fieldCheckTenCafe.setType(TheCoffeHouse.class.getDeclaredField(label.getTenCafe()).getType().getSimpleName());
			fieldCheckTenCafe.setListRuleCheck(TypeCheck.typeNumberCheck());
			
			listFieldCheckValidates.add(fieldCheckTenCafe);
			
			FieldCheckValidate fieldCheckGiaBan = new FieldCheckValidate();
			fieldCheckGiaBan.setFieldName(label.getGiaBan());
			fieldCheckGiaBan.setValue(theCoffeHouse.getGiaBan());
			fieldCheckGiaBan.setType(TheCoffeHouse.class.getDeclaredField(label.getGiaBan()).getType().getSimpleName());
			fieldCheckGiaBan.setListRuleCheck(TypeCheck.typeNumberCheck());
		
			listFieldCheckValidates.add(fieldCheckGiaBan);
			
			FieldCheckValidate fieldCheckNguoiPhucVu = new FieldCheckValidate();
			fieldCheckNguoiPhucVu.setFieldName(label.getNguoiPhucVu());
			fieldCheckNguoiPhucVu.setValue(theCoffeHouse.getNguoiPhucVu());
			fieldCheckNguoiPhucVu.setType(TheCoffeHouse.class.getDeclaredField(label.getNguoiPhucVu()).getType().getSimpleName());
			fieldCheckNguoiPhucVu.setListRuleCheck(TypeCheck.typeCheckNguoiPhucVu());
			
			listFieldCheckValidates.add(fieldCheckNguoiPhucVu);
			
			rowCheck.setListFieldCheck(listFieldCheckValidates);
			
			map.put(theCoffeHouse, rowCheck);			
		}
		return map;
	}
}
