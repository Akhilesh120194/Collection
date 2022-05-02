package test101;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/*
 * I need to store countries, its states and cities in a data structure.
The following queries might be used to fetch details
1) find list of states for a country.
2) find list of cities for a state.
3) find the name of the country and state for a city.
eg:
1) India -> Gujarat, UP, MP
MP -> bhopal,indore
Gujarat-> Surat,Ahmedabad, Baroda
2) USA -> Texas, California.. and so on.
 */

public class Country {

	static Map<String, Map<String, List<String>>> countriesStatesCities = new HashMap<String, Map<String, List<String>>>();
	static Map<String, List<String>> state = new HashMap<String, List<String>>();

	public static void main(String[] args) {
		List<String> cities = new ArrayList<String>();
		cities.add("Surat");
		cities.add("Ahmedabad");
		cities.add("Baroda");

		List<String> cities1 = new ArrayList<String>();
		cities1.add("Bhopal");
		cities1.add("Indore");

		state.put("Gujrat", cities);
		state.put("MadhyaPradesh", cities1);

		countriesStatesCities.put("India", state);

		Iterator it = countriesStatesCities.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry pairs = (Map.Entry) it.next();
			System.out.println(pairs);
			System.out.println(pairs.getKey() + " -> " + pairs.getValue());
		}

		Country c1 = new Country();
		c1.listStatesByCountry("India");
		c1.listCitiesByState("MadhyaPradesh");
	}

	public ArrayList<String> listStatesByCountry(String country) {
		Iterator it = countriesStatesCities.entrySet().iterator();
		
	//	Iterator it2 = state.entrySet().iterator();
	

		while (it.hasNext()) {
			Map.Entry pairs = (Map.Entry) it.next();

			if (pairs.getKey().equals(country)) {
				Map<String, List<String>> state = (Map<String, List<String>>) pairs.getValue();

				Iterator it2 = state.entrySet().iterator();
				while (it2.hasNext()) {
					Map.Entry pairs2 = (Map.Entry) it2.next();
					System.out.println(pairs2.getKey());
				}

			}

			// System.out.println(pairs.getKey() + " -> " + pairs.getValue());
		}
		return null;

	}

	public ArrayList<String> listCitiesByState(String state1) {

		Iterator it3 = state.entrySet().iterator();
		
		while(it3.hasNext())
		{
			Map.Entry pairs = (Map.Entry) it3.next();
			
			if(pairs.getKey().equals(state1))
			{
				System.out.println(pairs.getValue());
			}
		}
		
		return null;

	}

}
