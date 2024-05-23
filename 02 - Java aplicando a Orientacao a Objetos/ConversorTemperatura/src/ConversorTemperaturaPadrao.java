public class ConversorTemperaturaPadrao implements ConversorTemperatura{
    @Override
    public double celsiusParaFahrenheit(int celsius) {
        return  (celsius * 9/5 + 32);
    }

    @Override
    public double fahrenheitParaCelsius(int fahrenheit) {
        return  ((5.0/9.0) * (fahrenheit - 32));
    }
}
