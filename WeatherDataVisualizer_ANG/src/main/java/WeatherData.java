import java.time.LocalDateTime;

public interface WeatherData {
//Subject Interface
    void registerO(WeatherDataObserver observer);

    void removeO(WeatherDataObserver observer);

    void notifyO();

    /**
     * Gibt die aktuelle Temperatur zurück
     * @return Temperatur in Grad Celsius
     */
    double getTemperature();

    /**
     * Gibt die Regenwahrscheinlichkeit zurück
     * @return Regenwahrscheinlichkeit in Prozent (0-100)
     */
    int getRainProbability();

    /**
     * Gibt die aktuelle Wetterbedingung zurück
     * @return Aktuelle Wetterbedingung
     */
    WeatherCondition getCurrentCondition();

    /**
     * Gibt den Zeitpunkt der Wetteraufzeichnung zurück
     * @return Zeitpunkt der Wetteraufzeichnung
     */
    LocalDateTime getTimestamp();
}