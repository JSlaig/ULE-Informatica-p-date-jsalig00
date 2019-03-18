package es.unileon.prg1.date;

public class MainDate{
	
	public static void main(String args[]){
		
		Date day;
		
		try{
		day = new Date(01, 12, 2019);
		System.out.println(day.toString());
		}catch(DateException e){
		System.out.println(e.getMessage());
		}		
		
		//day.setDay(40);
	}
}