package cities;

public class Cities {
    private int cities_id;
    private String Name;
    private int countries_idcountries;
    
    private String Description;

    public int getCities_id() {
        return cities_id;
    }

    public void setCities_id(int cities_id) {
        this.cities_id = cities_id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getCountries_idcountries() {
        return countries_idcountries;
    }

    public void setCountries_idcountries(int countries_idcountries) {
        this.countries_idcountries = countries_idcountries;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}

