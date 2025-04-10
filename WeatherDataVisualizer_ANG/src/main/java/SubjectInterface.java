public interface SubjectInterface {

    public void registerO(WeatherDataObserver observer);
    public void removeO(WeatherDataObserver observer);
    public void notifyO(WeatherData weatherData);

}
