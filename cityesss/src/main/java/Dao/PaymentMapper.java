package Dao;

public interface PaymentMapper<IdLuxTour, Insurance, Feeding, Guidedtour> {

	IdLuxTour getIdLuxTour(Integer idLuxTour);
	Insurance getInsurance(Integer insurance);
	Feeding getFeeding(Integer feeding);
	Guidedtour getGuidedtour(Integer guidedtour);
}


