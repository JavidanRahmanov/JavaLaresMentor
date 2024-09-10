package MentorTasks.lesson27.CityWeatherInformationSystem;

import java.util.HashMap;

public class CityWeatherSystem {

    private HashMap<String, WeatherInfo> cityWeatherSystem;

    public CityWeatherSystem() {

        this.cityWeatherSystem = new HashMap<>();
    }

    public void addCityWeather(String city, WeatherInfo weatherInfo) {

        cityWeatherSystem.put(city, weatherInfo);
    }

    public void removeCityWeather(String city) {

        cityWeatherSystem.remove(city);
    }

    public void updateCityWeather(String city, WeatherInfo weatherInfo) {

        cityWeatherSystem.put(city, weatherInfo);
    }

    public void getCityWeather(String city) {

        System.out.println(cityWeatherSystem.get(city));
    }


    public void displayAllCitiesWeather() {

        System.out.println("All cities' weather information: " + cityWeatherSystem);

    }

    public static void main(String[] args) {



        WeatherInfo sunnyWeather = new WeatherInfo(25.5, 40, "Sunny");
        WeatherInfo rainyWeather = new WeatherInfo(18.3, 85, "Rainy");
        WeatherInfo cloudyWeather = new WeatherInfo(22.0, 60, "Cloudy");
        WeatherInfo snowyWeather = new WeatherInfo(-5.0, 75, "Snowy");
        WeatherInfo windyWeather = new WeatherInfo(15.0, 50, "Windy");

        CityWeatherSystem cityWeatherSystem = new CityWeatherSystem();

        cityWeatherSystem.addCityWeather("Baku",windyWeather);
        cityWeatherSystem.addCityWeather("London",rainyWeather);
        cityWeatherSystem.addCityWeather("Moscow",snowyWeather);

        cityWeatherSystem.displayAllCitiesWeather();
        cityWeatherSystem.addCityWeather("Dublin",cloudyWeather);
        cityWeatherSystem.getCityWeather("Dublin");
        cityWeatherSystem.removeCityWeather("Moscow");
        cityWeatherSystem.updateCityWeather("Baku",sunnyWeather);
        cityWeatherSystem.displayAllCitiesWeather();

    }
}
