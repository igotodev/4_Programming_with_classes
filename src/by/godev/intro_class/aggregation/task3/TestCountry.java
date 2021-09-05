package by.godev.intro_class.aggregation.task3;

public class TestCountry {
	public TestCountry() {
		
	}
	
	public Country addTestCountry() {
		Country belarus;
		double countryArea;
		Region[] regions;
		Region brestskaya;
		Region minskaya;
		Region grodnenskaya;
		Region vitebskaya;
		Region gomelskaya;
		Region mogilevskaya;
		District[] districtsMinskaya;
		District[] districtsGrodnenskaya;
		District[] districtsVitebskaya;
		District[] districtsGomelskaya;
		District[] districtsMogilevskaya;
		District[] districtsBrestskaya;
		District brestsky;
		District minsky;
		District grodnensky;
		District vitebsky;
		District gomelsky;
		District mogilevsky;
		City[] citiesBrestsky;
		City[] citiesMinsky;
		City[] citiesVitebsky;
		City[] citiesGomelsky;
		City[] citiesMogilevsky;
		City[] citiesGrodnensky;
		City brest;
		City minsk;
		City grodno;
		City vitebsk;
		City gomel;
		City mogilev;

		brest = new City("Брест");
		minsk = new City("Минск");
		grodno = new City("Гродно");
		vitebsk = new City("Витебск");
		gomel = new City("Гомель");
		mogilev = new City("Могилев");

		// для краткость в райнах присутствует только административный центр района
		citiesMinsky = new City[] { minsk };
		citiesGomelsky = new City[] { gomel };
		citiesVitebsky = new City[] { vitebsk };
		citiesMogilevsky = new City[] { mogilev };
		citiesGrodnensky = new City[] { grodno };
		citiesBrestsky = new City[] { brest };
		minsky = new District(citiesMinsky, minsk);
		vitebsky = new District(citiesVitebsky, vitebsk);
		gomelsky = new District(citiesGomelsky, gomel);
		mogilevsky = new District(citiesMogilevsky, mogilev);
		grodnensky = new District(citiesGrodnensky, grodno);
		brestsky = new District(citiesBrestsky, brest);

		// для краткость в областях присутствует только административный центр области
		districtsMinskaya = new District[] { minsky };
		districtsVitebskaya = new District[] { vitebsky };
		districtsGomelskaya = new District[] { gomelsky };
		districtsMogilevskaya = new District[] { mogilevsky };
		districtsGrodnenskaya = new District[] { grodnensky };
		districtsBrestskaya = new District[] { brestsky };
		minskaya = new Region(districtsMinskaya, minsk);
		vitebskaya = new Region(districtsVitebskaya, vitebsk);
		gomelskaya = new Region(districtsGomelskaya, gomel);
		mogilevskaya = new Region(districtsMogilevskaya, mogilev);
		brestskaya = new Region(districtsBrestskaya, brest);
		grodnenskaya = new Region(districtsGrodnenskaya, grodno);
		regions = new Region[] { minskaya, vitebskaya, gomelskaya, mogilevskaya, grodnenskaya, brestskaya };

		countryArea = 207600;
		belarus = new Country("Беларусь", countryArea, minsk, regions);
		
		return belarus;
	}
}
