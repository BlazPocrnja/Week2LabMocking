package stub;

import java.util.ArrayList;
import java.util.List;

import service.City;

public class CityStub implements City {

	public List<String> listCities() {
		List<String> cities = new ArrayList<String>();
		cities.add("Toronto");
		cities.add("Edmonton");
		cities.add("Edmonton");
		cities.add("Edmonton");
		cities.add("Calgary");
		return cities;
	}

}
