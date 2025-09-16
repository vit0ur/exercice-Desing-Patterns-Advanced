package adapter.clima;

public class AdapterApiB implements ClimaService {
    private ApiB_Kelvin api;
    public AdapterApiB(ApiB_Kelvin b) { api = b; }
    public double getTemperaturaCelsius() {
        return api.getTempK() - 273.15;
    }
}
