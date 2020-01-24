package Dao;

public interface DivingTourMapper <IdDivingTour, Sea, Equipment, Preparation> {

		IdDivingTour getIdDivingTour(Integer idDivingTour);
		Sea getSea(Integer sea);
		Equipment getEquipment(String equipment);
		Preparation getPreparation (Integer parentId);
		
	}



