package se2;

import java.util.ArrayList;
import java.util.List;

public class CommandDemo {
	
	public static List<Command> produceRequests()  {
		
		List<Command> queue = new ArrayList<>();
		queue.add(new ConvertMetertoMilimeter());
		queue.add(new ConvertMetertoCentimeter());
		queue.add(new ConvertFahrenheittoCelsius());
		queue.add(new ConvertCelsiustoFahrenheit());
		queue.add(new ConvertDollartoTRY());
		queue.add(new ConvertDollartoCNY());
		queue.add(new ConvertDollartoEuro());
		return queue;
	}
	
	
	public static void  workoffRequests(List<Command> queue) {
		
		for (Object command : queue) { ((Command)command).execute();}
		}

  public static void main (String[] args ) {
	  List<Command> queue = produceRequests();
	  workoffRequests(queue);
	  }
  }
 
