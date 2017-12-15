package se2;

public class ConvertFahrenheittoCelsius implements Command {
	
private Conversions_SE conversion;
public ConvertFahrenheittoCelsius(Conversions_SE conversion) {this.conversion = conversion;}

public ConvertFahrenheittoCelsius() {
	// TODO Auto-generated constructor stub
}

public void execute() {
      conversion.TemperatureConverter();
   }



}
