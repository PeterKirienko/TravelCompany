package Dao;
import tours.Tours;
public interface ToursMapper  {
	Id getId(Integer id);
	Location getLocation(String location);
	PersonId getPersonId (Integer personId );
	TransportTypeId getTransportTypeId (Integer transportTypeId );
}

