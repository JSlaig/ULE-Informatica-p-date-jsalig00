package es.unileon.prg1.date;

public class MainDate{
	
	public static void main(String args[]){
		
		Date hoy = null;
		Date ayer = null;
		
		try{
			
		hoy = new Date(12, 12, 2019);
		ayer = new Date(30, 12, 2019);
		
		/*		
		boolean sameYear = ayer.isSameYear(hoy.getYear());		
		if(sameYear == true){
		System.out.println("Las dos fechas pertenecen al mismo anyo");
		}
		
		boolean sameMonth = ayer.isSameMonth(hoy.getMonth());		
		if(sameMonth == true){
		System.out.println("Las dos fechas pertenecen al mismo mes");
		}
		
		boolean sameDay = ayer.isSameDay(hoy.getDay());		
		if(sameDay == true){
		System.out.println("Las dos fechas tienen el mismo dia");
		}
		
		boolean same = ayer.isSame(hoy);
		if(same == true){
		System.out.println("Las dos fechas son la misma");
		}	
		*/
		hoy.printDate();
		
		hoy.printSeason();		
		
		hoy.printMonthsLeft();

		hoy.printDaysLeft();
		
		hoy.printSameDayNumber();
		
		ayer.printDate();
		
		}catch(DateException e){
		System.out.println(e.getMessage());
		}		
	}
}