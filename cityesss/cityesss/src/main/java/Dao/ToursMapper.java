package Dao;

import tours.Tours;

import java.util.List;

public interface ToursMapper {
	Tours getTourById(Integer tourId);
	List<Tours> getAllTours();
}

