package Dao;

public interface FamilyTourMapper <IdFamilyTour, Name, Price> {

		IdFamilyTour getIdFamilyTour(Integer idFamilyTour);
		Name getName(String name);
		Price getPrice(Integer price);
		
	}


