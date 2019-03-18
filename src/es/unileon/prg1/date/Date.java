package es.unileon.prg1.p-date;

public class Date{
	
	private int day;
	private int month;
	private int year;
	
	//Implementar excepciones en el constructor cuando la fecha introducida no sea valida
	public Date(int day, int month, int year)throws DateException{	
		if(this.isDayRight(day, month) == true){
			this.day = day;
			this.month = month;
			this.year = year;
		}
		else{
			throw new DateException("Fecha invalida.("+day+", "+month+", "+year+")");
		}
	}
	
	
	//Implementar metodo que se encarge de comprobar si el dia y el mes es correcto
	public boolean isDayRight(int day, int month){
		
		boolean isRight = false;
		
		switch(month){
			case 1:
				if(day > 0 && day < 31){
					isRight = true;
				}
				else{
					isRight = false;
				}
			break;
			case 2:
				if(day > 0 && day < 31){
					isRight = true;
				}
				else{
					isRight = false;
				}
			break;
			case 3:
				if(day > 0 && day < 31){
					isRight = true;
				}
				else{
					isRight = false;
				}
			break;
			case 4:
				if(day > 0 && day < 31){
					isRight = true;
				}
				else{
					isRight = false;
				}
			break;
			case 5:
				if(day > 0 && day < 31){
					isRight = true;
				}
				else{
					isRight = false;
				}
			break;
			case 6:
				if(day > 0 && day < 31){
					isRight = true;
				}
				else{
					isRight = false;
				}
			break;
			case 7:
				if(day > 0 && day < 31){
					isRight = true;
				}
				else{
					isRight = false;
				}
			break;
			case 8:
				if(day > 0 && day < 31){
					isRight = true;
				}
				else{
					isRight = false;
				}			
			break;
			case 9:
				if(day > 0 && day < 31){
					isRight = true;
				}
				else{
					isRight = false;
				}
			break;
			case 10:
				if(day > 0 && day < 31){
					isRight = true;
				}
				else{
					isRight = false;
				}
			break;
			case 11:
				if(day > 0 && day < 31){
					isRight = true;
				}
				else{
					isRight = false;
				}
			break;
			case 12:
				if(day > 0 && day < 31){
					isRight = true;
				}
				else{
					isRight = false;
				}
			default:
				isRight = false;
		}
		return isRight;
	}
	
	//Metodo para comprobar si un año es bisiesto, reutilizado de apartado030102 ejercicio 02 de la practica de sentencias de control
	public boolean isBisiesto(){
		
	}
	//Implementar metodo para cambiar el dia
	public void setDay(int day){
		if(this.isDayRight(day, this.month)){
			this.day = day;
		}
	}
	
	
}