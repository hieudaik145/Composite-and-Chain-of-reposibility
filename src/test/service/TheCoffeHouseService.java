package test.service;

import java.util.Arrays;
import java.util.List;

import test.entity.TheCoffeHouse;

public class TheCoffeHouseService {
	
	public List<TheCoffeHouse> getTheCoffeHouseLst() {

		List<TheCoffeHouse> list = Arrays.asList(
				new TheCoffeHouse("15", null, "2000003232", "Nam", "Nhan Vien")
				,new TheCoffeHouse("1", "cafe", "200000", "Nam", "Nguyen Van B")
				,new TheCoffeHouse("155", "cafe Sua Da9", "200000", "Nam", "Nhan Vien9"));
				
		return list;
	}
	

}
