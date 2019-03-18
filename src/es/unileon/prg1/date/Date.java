package es.unileon.prg1.date;

public class Date{
	
	private int day;
	private int month;
	private int year;
	
	//Constructor que lanza excepcion
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
	
	public boolean isSameDay(int day){
		boolean sameDay = false;
		if(day == this.day){
			sameDay = true;
		}
		else{
			sameDay = false;
		}
		return sameDay;
	}
	
	public boolean isSame(Date aux){
		boolean same = false;
		if(this.isSameYear(aux.getYear()) == true && this.isSameMonth(aux.getMonth()) == true && this.isSameDay(aux.getDay()) == true){
			same = true;
		}
		else{
			same = false;
		}
		return same;
	}
	
	//Metodo que devuelva el nombre del mes
	public String monthName(){
		String month;
		switch(this.month){
			case 1:
				month = "Enero";
			break;
			case 2:
				month = "Febrero";
			break;
			case 3:
				month = "Marzo";
			break;
			case 4:
				month = "Abril";
			break;
			case 5:
				month = "Mayo";
			break;
			case 6:
				month = "Junio";
			break;
			case 7:
				month = "Julio";
			break;
			case 8:
				month = "Agosto";
			break;
			case 9:
				month = "Septiembre";
			break;
			case 10:
				month = "Octubre";
			break;
			case 11:
				month = "Noviembre";
			break;
			case 12:
				month = "Diciembre";
			break;
			default:
			month = "No se ha introducido ningun mes";
		}
		return month;
	}
	
	//Metodo para transformar la fecha en una cadena de caracteres
	public String toString() {
		return this.day + "/" + this.month + "/" + this.year;
	}
}