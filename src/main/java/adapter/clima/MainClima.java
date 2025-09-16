package adapter.clima;

public class MainClima {
    public static void main(String[] args) {
        ClimaService climaA = new AdapterApiA(new ApiA_Fahrenheit());
        ClimaService climaB = new AdapterApiB(new ApiB_Kelvin());
        System.out.println("API A: " + climaA.getTemperaturaCelsius() + " °C");
        System.out.println("API B: " + climaB.getTemperaturaCelsius() + " °C");
    }
}
