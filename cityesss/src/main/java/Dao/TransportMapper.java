package Dao;
import transporttype.Transport;
public interface TransportMapper  {
	IdTransportType getIdTransportType(Integer idTransportType);
	TransportTypeName getTransportTypeName(String transportTypeName);
}