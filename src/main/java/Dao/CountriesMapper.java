package Dao;
public interface CountriesMapper {
	public interface CitiesMapper<IdCountries,Location, Name, Language, Hymn> {
		IdCountries getIdCountries(Integer idCountries);
		Location getLocation(String location);
		Name getName(String name);
		Language getLanguage(String language);
		Hymn getHymn(String hymn);
	}
}
