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
	public void setDay(int day)throws DateException{
		if(this.isDayRight(day, this.month)){
			this.day = day;
		}
		else{
			throw new DateException("Dia invalido("+day+")");
		}
	}
	public void setMonth(int month)throws DateException{
		if(this.isDayRight(this.day, month)){
			this.month = month;
		}
		else{
			throw new DateException("Mes invalido("+month+")");
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
	
	//Sentencias de control con if, ahora simplificadas con el api de java
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
	
	//Metodo que imprime el nombre del mes
	public void printMonthName(int i){
		String month;
		/*En el switch se podria usar el atributo this.month, pero se usa otra variable con el fin de introducir el metodo dentro del 
		 *bucle del metodo printMonthsLeft con el fin de aprovechar el codigo de este metodo y asi poder imprimir por pantalla el
		 *nombre de los meses restantes hasta que acabe el anyo. Para poder invocar el metodo  sobre un objeto directamente se le pasara
		 *como argumento "objeto.getMonth()".
		*/
		switch(i){
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
			month = "";
		}
		
		System.out.println(month);
	}
	
	//Metodo que imprime el nombre de la estacion
	public void printSeason()throws DateException{
		String season = "";
		
		if(this.month > 3 && this.month < 5 || (this.month == 3 && this.day >= 1) || (this.month == 5 && this.day <= 31)){
			season = "primavera";
		}		
		else if(this.month > 6 && this.month < 8 || (this.month == 6 && this.day >= 1) || (this.month == 8 && this.day <= 31)){
			season = "verano";
		}
		else if(this.month > 9 && this.month < 11 || (this.month == 9 && this.day >= 1) || (this.month == 11 && this.day <= 30)){
			season = "otoño";
		}
		else if(this.month >= 1 && this.month < 2 || (this.month == 12 && this.day >= 1) || (this.month == 2 && this.day <= 29)){
			season = "invierno";
		}
		else{
			throw new DateException("La fecha introducida no corresponde con ninguna estacion");
		}
			System.out.println("La fecha introducida pertenece al "+season);
	}
	
	//Metodo que calcula el numero de meses restante hasta el final del anyo
	public void printMonthsLeft(){
		int monthsLeft = 13 - this.month;
		if(monthsLeft == 1){
			System.out.println("Queda "+monthsLeft+" mes para que finalice el anyo: ");
		}
		else{
			System.out.println("Quedan "+monthsLeft+" meses para que finalice el anyo: ");
		}	
			
		for(int i = this.month; i <= 12; i++){
			printMonthName(i);
		}
	}
		
	//Metodo que imprime el numero de dias restantes para que acabe el mes
	public void printDaysLeft(){
		int daysLeft = this.daysNumber() + 1 - this.day;
		if(daysLeft == 1){
		System.out.println("Queda "+daysLeft+" dia para que acabe el mes: ");
		}
		else{
		System.out.println("Quedan "+daysLeft+" dias para que acabe el mes: ");
		}
		for(int i = this.day; i <= this.daysNumber(); i++){
			System.out.println(i+"/" + this.month + "/" + this.year);
		}
	}
	
	//Metodo para imprimir por pantalla la fecha almacenada en un objeto
	public void printDate(){
		System.out.println("La fecha es: "+this.toString());
	}
	
	//Metodo auxiliar para el metodo printDaysLeft
	public int daysNumber(){
		int days = 0;
		switch(this.month){
			case 2:
				if(isBisiesto() == true){
					days = 29;
				}
				else{
					days = 28;
				}
			break;
			case 4:
			case 6:
			case 9:
			case 11:
				days = 30;
			break;
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				days = 31;
			break;
			default:
				days = 0;
		}
		return days;
	}
	
	//Metodo para imprimir los nombres de los meses con el mismo numero de dias
	public void printSameDayNumber(){
		System.out.println("Los meses que tienen el mismo numero de dias que el introducido son: ");
		if(this.daysNumber() == 30){
			printMonthName(4);
			printMonthName(6);
			printMonthName(9);
			printMonthName(11);
		}
		else if(this.daysNumber() == 31){
			printMonthName(1);
			printMonthName(3);
			printMonthName(5);
			printMonthName(7);
			printMonthName(8);
			printMonthName(10);
			printMonthName(12);
		}
		else{
			printMonthName(2);
		}
	}
	
	//Metodo para contar el numero de dias del anyo que han pasado
	public void dayOfYear(){
		
		try{
			
		Date start = new Date(1,1,this.getYear());
		
		int day = 1;
		
		for(int i = 1; i <= this.month; i++){
			for(int j = 1; j <= start.daysNumber(); j++){
				
				start.setDay(j);
				start.setMonth(i);
				
				if(this.isSame(start) == true){
					break;					
				}
				
				else{
					day++;				
				}
			}
		}
		
		System.out.println("Es el dia "+day+" del anyo");
		
		}catch(DateException e){
		System.out.println(e.getMessage());
		}		
	}
	
	
	//Metodo para contar el numero de intentos para generar una fecha aleatoria que coincida con la introducida
	public void attempt(){
		
		try{
			
		Date random = null;	
		
		double rday, rmonth, ryear;
		
		int day, month, year;
		
		int i = 1;
		
		while(true){
			rday = Math.random() * 100;
			rmonth = Math.random() * 100;
			//Con motivo de reducir el numero de intentos, escogi como multiplo el 3000 ya que asi las fechas seran mas cercanas
			ryear = Math.random() * 3000;
			
			day = (int)rday;
			month = (int)rmonth;
			year = (int)ryear;
			
			if(isDayRight(day, month) == true){
				random = new Date(day, month, year);
			}
			else{
				continue;
			}						
		
			if(this.isSame(random) == true){
				break;
			}
			else{
				i++;
			}
		}
		
		System.out.println("La fecha coincidio en el intento: "+i);
		
		}catch(DateException e){
				System.out.println(e.getMessage());
			}			
	}
	
	//Metodo para transformar la fecha en una cadena de caracteres
	public String toString(){
		return this.day + "/" + this.month + "/" + this.year;
	}
	
}