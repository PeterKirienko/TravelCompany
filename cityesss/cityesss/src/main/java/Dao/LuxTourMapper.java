package Dao;

public interface LuxTourMapper  <IdLuxTour, Name, Insurance, Feeding, GuidedTour> {

	IdLuxTour getIdLuxTour(Integer idLuxTour);
	Name getName(String name);
	Insurance getInsurance(Integer insurance);
	Feeding getFeeding(Integer feeding);
	GuidedTour getGuidedTour(Integer guidedTour);
}

