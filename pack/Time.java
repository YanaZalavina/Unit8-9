package my.pack;

import java.util.Scanner;

public class Time {
	public int hours;
	public int minutes;
	public int sec;
	
	public Time() {
		this.hours=0;
		this.minutes=0;
		this.sec=0; 
	}

	public void setHours(int hours) {
		Scanner sc = new Scanner(System.in); 
        System.out.println("”кажите врем€: часы - ");
        if (sc.hasNext()) { 
        	if(sc.nextInt()>0&&sc.nextInt()<25) {
    			this.hours=sc.nextInt();
        	}else this.hours=0;
        }
	}

	public void setMinutes(int minutes) {
		Scanner sc = new Scanner(System.in); 
        System.out.println("”кажите врем€: минуты - ");
        if (sc.hasNext()) { 
        	if(sc.nextInt()>0&&sc.nextInt()<60) {
    			this.minutes=sc.nextInt();
        	}else this.minutes=0;
        }
	}

	public void setSec(int sec) {
		Scanner sc = new Scanner(System.in); 
        System.out.println("”кажите врем€: секунды - ");
        if (sc.hasNext()) { 
        	if(sc.nextInt()>0&&sc.nextInt()<60) {
    			this.sec=sc.nextInt();
        	}else this.sec=0;
        }
	}
	public void setTime(int hours, int minutes, int sec) {
		setHours(hours);
		setMinutes(minutes);
		setSec(sec);
	}
	public void changeHours(int hours) {
		int currentHours=this.hours;
		if(hours>0) {
			currentHours+=hours;
		}else System.out.println("¬рем€ изменено на 0 часов");
		
		if(currentHours>23) {
			currentHours=currentHours/24;
			this.hours=currentHours;
		}else this.hours=currentHours;
	}
	public void changeMinutes(int minutes) {
		int currentMinutes=this.minutes;
		int addHours=0;
		if(minutes>0) {
			currentMinutes+=minutes;
		}else System.out.println("¬рем€ изменено на 0 минут");
		
		if(currentMinutes>59) {
			addHours=currentMinutes/60;
			this.minutes=currentMinutes%60;
			changeHours(addHours);
		}else this.minutes=currentMinutes;
		
	}
	public void changeSec(int sec) {
		int currentSec=this.sec;
		int addMinutes=0;
		if(sec>0) {
			currentSec+=sec;
		}
		
		if(currentSec>59) {
			addMinutes=currentSec/60;
			this.sec=currentSec%60;
			changeMinutes(addMinutes);
		}else this.minutes=currentSec;
		
	}

}
