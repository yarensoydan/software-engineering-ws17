package se2;

public class ConvertDollartoTRY implements Command {
	
private Conversions_SE conversion;
public ConvertDollartoTRY(Conversions_SE conversion) {this.conversion = conversion;}

public ConvertDollartoTRY() {
	// TODO Auto-generated constructor stub
}

public void execute() {
      conversion.CurrencyConverter();
   }


}
