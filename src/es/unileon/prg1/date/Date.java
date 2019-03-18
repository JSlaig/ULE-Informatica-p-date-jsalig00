package es.unileon.prg1.date;

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
	
	//Implementar metodos set
	public void setDay(int day){
		if(this.isDayRight(day, this.month)){
			this.day = day;
		}
	}
	public void setMonth(int month){
		if(this.isDayRight(this.day, month)){
			this.month = month;
		}
	}
	public void setYear(int year){
		this.year = year;
	}
	
	//Implementar metodos get
	public int getDay(){
		return this.day;
	}
	public int getMonth(){
		return this.month;
	}
	public int getYear(){
		return this.year;
	}
	
		//Metodo para comprobar si la fecha introducida es correcta
	public boolean isDayRight(int day, int month){
		
		boolean isRight = false;
		
		switch(month){
			case 1:
				if(day > 0 && day < 32){
					isRight = true;
				}
				else{
					isRight = false;
				}
			break;
			case 2:
				if(day > 0 && isBisiesto() == false && day < 29){
					isRight = true;
				}
				else if(day > 0 && isBisiesto() == true && day < 30){
					isRight = true;
				}
				else{
					isRight = false;
				}
			break;
			case 3:
				if(day > 0 && day < 32){
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
				if(day > 0 && day < 32){
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
				if(day > 0 && day < 32){
					isRight = true;
				}
				else{
					isRight = false;
				}
			break;
			case 8:
				if(day > 0 && day < 32){
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
				if(day > 0 && day < 32){
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
				if(day > 0 && day < 32){
					isRight = true;
				}
				else{
					isRight = false;
				}
			break;
			default:
				isRight = false;
		}
		return isRight;
	}
	
	//Metodo para comprobar si un año es bisiesto, reutilizado de apartado030102 ejercicio 02 de la practica de sentencias de control
	public boolean isBisiesto(){
		
		int year;				
		boolean bisiesto = false;
		
		year = this.year;
		
		if(year % 400 == 0){
			bisiesto = true;
		}
		else if(year % 4 == 0 && year % 100 != 0){
			bisiesto = true;
		}
		else{
			bisiesto = false;
		}
		return bisiesto;
	}
	
	//Sentencias de control con if
	public boolean isSameYear(int year){
		boolean sameYear = false;
			
		if(year == this.year){
			sameYear = true;
		}
		else{
			sameYear = false;
		}
		return sameYear;
	}
	
	public boolean isSameMonth(int month){
		boolean sameMonth = false;
			
		if(month == this.month){
			sameMonth = true;
		}
		else{
			sameMonth = false;
		}
		return sameMonth;
	}
	//Metodo para transformar la fecha en una cadena de caracteres
	public String toString() {
		return this.day + "/" + this.month + "/" + this.year;
	}
}