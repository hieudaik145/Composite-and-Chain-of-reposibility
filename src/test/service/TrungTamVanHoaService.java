package test.service;

import java.util.Arrays;
import java.util.List;

import test.entity.TrungTamVanHoa;

public class TrungTamVanHoaService {

	public List<TrungTamVanHoa> createTrungTamVanHoa(){
		
		List<TrungTamVanHoa> list = Arrays.asList(new TrungTamVanHoa(1, "TTVH Thành phố Đà Nẵng", 51), new TrungTamVanHoa(2, "TTVH Quận Hải Châu", 49));
		
		return list;
	}
}
