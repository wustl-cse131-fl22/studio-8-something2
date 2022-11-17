package studio8;

import java.util.Objects;

public class Time {
int hour;
int minute;
public Time(int a, int b) {
	this.hour = a;
	this.minute = b;
}

public int getHour() {
	return hour;
}

public void setHour(int hour) {
	this.hour = hour;
}

public int getMinute() {
	return minute;
}

public void setMinute(int minute) {
	this.minute = minute;
}

@Override
public int hashCode() {
	return Objects.hash(hour, minute);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Time other = (Time) obj;
	return hour == other.hour && minute == other.minute;
}
public String toString() {
	return hour+":"+minute;
	
}
	public static void main(String[] args) {
 Time a = new Time(12, 0);
 Time b = new Time(11, 0);
 System.out.print(a.equals(b));
    	
    }

}