package oop;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Time {
	private int hour;
	private int minute;
	private int second;
	
	public Time(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	public int getHour() {
		return hour;
	}
	
	public int getMinute() {
		return minute;
	}
	
	public int getSecond() {
		return second;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}
	
	public void setMinute(int minute) {
		this.minute = minute;
	}
	
	public void setSecond(int second) {
		this.second = second;
	}
	
	public void setTime(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	public String toString() {
		NumberFormat formatter = new DecimalFormat("00");
		
		return formatter.format(hour) + ":" + formatter.format(minute) + ":" + formatter.format(second);
		
	}

	public Time nextSecond() {
		if (second == 59) {
			second = 0;
			if (minute == 59) {
				minute = 0;
				if (hour == 23) {
					hour = 0;
					minute = 0;
					second = 0;
				} else {
					++hour;
				}

			} else {
				++minute;
			}

		} else {
			++second;
		}
		return this;
	}
	
	public Time previousSecond() {
		if (second == 0) {
			second = 59;
			if (minute == 0) {
				minute = 59;
				if (hour == 0) {
					hour = 23;
					minute = 59;
					second = 59;
				}
			} else {
				--minute;
			}
		} else {
			--second;
		}
		return this;
	}
}
