package myPackage;

public class Time {
	private int hour, minute;
	
	public int getHour() {
		return hour;
	}
	public int getMinute() {
		return minute;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	Time(int hour, int minute) {
		setTime(hour, minute);
	}
	
	Time(int hour, int minute, boolean isPM) {
		setTime2(hour, minute, isPM);
	}
	
	public static boolean isValid(int hour, int minute) {
		return (0 <= hour && hour <= 23) && (0 <= minute && minute <= 59);
	}
	public void setTime(int hour, int minute) {
		if (isValid(hour, minute)) {
			this.hour = hour;
			this.minute = minute;
		} else {
			System.out.println("Wrong Time!!");
			return;
		}
	}
	public void setTime2(int hour, int minute, boolean isPM) {
		if (isPM) {
			setTime(hour + 12, minute);
		} else {
			setTime(hour, minute);
		}
	}
	public String getTime24() {
		 return String.format("%d%d", hour, minute);
	}
	public String getTime12() {
		if(hour >= 12)
			return String.format("%d:%dpm", hour, minute);
		else
			return String.format("%d:%dam", hour, minute);
	}
}
