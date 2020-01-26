package Dao;

public interface TransportMapper  <IdTransportType, TransportTypeName > {
	IdTransportType getIdTransportType(Integer idTransportType);
	TransportTypeName getTransportTypeName(String transportTypeName);
}