package se2;

public class ConvertMetertoCentimeter implements Command {
	private Conversions_SE conversion;
	public ConvertMetertoCentimeter(Conversions_SE conversion) {this.conversion = conversion;}

	public ConvertMetertoCentimeter() {
		// TODO Auto-generated constructor stub
	}

	public void execute() {
	      conversion.LengthConverter();
	   }


}
