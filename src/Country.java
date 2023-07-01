import java.util.Arrays;

public class Country {
    protected String name;
    protected String continent;
    protected long population;
    protected String phone_code;
    protected String capital;
    protected String[] cities;

    public Country(String name, String continent, long population, String phone_code, String capital, String[] cities) {
        this.name = name;
        this.continent = continent;
        this.population = population;
        this.phone_code = phone_code;
        this.capital = capital;
        this.cities = cities;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public String getPhone_code() {
        return phone_code;
    }

    public void setPhone_code(String phone_code) {
        this.phone_code = phone_code;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String[] getCities() {
        return cities;
    }

    public void setCities(String[] cities) {
        this.cities = cities;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", continent='" + continent + '\'' +
                ", population=" + population +
                ", phone_code='" + phone_code + '\'' +
                ", capital='" + capital + '\'' +
                ", cities=" + Arrays.toString(cities) +
                '}';
    }
}
