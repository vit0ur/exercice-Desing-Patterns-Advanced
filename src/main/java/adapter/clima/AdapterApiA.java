package adapter.clima;

public class AdapterApiA implements ClimaService {
    private ApiA_Fahrenheit api;
    public AdapterApiA(ApiA_Fahrenheit a) { api = a; }
    public double getTemperaturaCelsius() {
        return (api.getTempF() - 32) * 5/9;
    }
}
