package Dao;

public interface ToursMapper <Id, Location, Insurance, Price, TripsCount, OrderOfDivingt, PersonId, TransportTypeId > {

	Id getId(Integer id);
	Location getLocation(String location);
	Insurance getInsurance(Integer insurance);
	Price getPrice(Integer price);
	TripsCount getTripsCount (Integer tripsCount );
	OrderOfDivingt getOrderOfDiving (Integer orderOfDiving );
	PersonId getPersonId (Integer personId );
	TransportTypeId getTransportTypeId (Integer transportTypeId );
}

