package se2;

public class ConvertDollartoCNY implements Command {
	private Conversions_SE conversion;
	public ConvertDollartoCNY(Conversions_SE conversion) {this.conversion = conversion;}

	public ConvertDollartoCNY() 
	{
		// TODO Auto-generated constructor stub
	}

	public void execute() {
	      conversion.CurrencyConverter();
	   }


}
