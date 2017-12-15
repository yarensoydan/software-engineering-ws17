package se2;

public class ConvertMetertoMilimeter implements Command {
	
	private Conversions_SE conversion;
	public ConvertMetertoMilimeter(Conversions_SE conversion) {this.conversion = conversion;}

	public ConvertMetertoMilimeter() {
		// TODO Auto-generated constructor stub
	}

	public void execute() {
	      conversion.LengthConverter();
	      
	   }


}
