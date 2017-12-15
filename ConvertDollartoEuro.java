package se2;

public class ConvertDollartoEuro implements Command {
	
	private Conversions_SE conversion;
	public ConvertDollartoEuro(Conversions_SE conversion) {this.conversion = conversion;}

	public ConvertDollartoEuro() {
		// TODO Auto-generated constructor stub
	}

	public void execute() {
	      conversion.CurrencyConverter();
	   }

	
}
