package es.unileon.prg1.date;

public class MainDate{
	
	public static void main(String args[]){
		
		Date hoy = null;
		Date ayer = null;
		
		try{
			
		hoy = new Date(30, 12, 2019);
		ayer = new Date(30, 12, 2019);
		
		System.out.println(hoy.toString());
		System.out.println(ayer.toString());
		
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
		
		System.out.println(hoy.getMonthName());
		
		System.out.println(hoy.isSeason());
		
		String end = hoy.getMonthsLeft();
		System.out.println(end);
		
		hoy.printDate();
		
		}catch(DateException e){
		System.out.println(e.getMessage());
		}		
	}
}