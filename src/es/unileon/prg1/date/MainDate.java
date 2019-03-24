package es.unileon.prg1.date;

public class MainDate{
	
	public static void main(String args[]){
		
		Date hoy = null;
		Date ayer = null;
		
		try{
			
		hoy = new Date(30, 12, 2019);
		ayer = new Date(30, 12, 2019);

		//hoy.printDate();
		
		//hoy.printSeason();		
		
		//hoy.printMonthsLeft();

		//hoy.printDaysLeft();
		
		//hoy.printSameDayNumber();
		
		//hoy.dayOfYear();
		
		hoy.attempt();
		
		//ayer.printDate();
		
		}catch(DateException e){
		System.out.println(e.getMessage());
		}		
	}
}