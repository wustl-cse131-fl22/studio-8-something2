package studio8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Date {
int month=1;
int day=1;
int year=1;
public Date(int a, int b, int c) {
	this.month = a;
	this.day = b;
	this.year = c;
}


@Override
public int hashCode() {
	return Objects.hash(day, month, year);
}

public int getMonth() {
	return month;
}

public void setMonth(int month) {
	this.month = month;
}

public int getDay() {
	return day;
}

public void setDay(int day) {
	this.day = day;
}

public int getYear() {
	return year;
}

public void setYear(int year) {
	this.year = year;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Date other = (Date) obj;
	return day == other.day && month == other.month && year == other.year;
}

public String toString() {
	return month+"/"+day+"/"+year;
	
}

    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	
    	Date b = new Date(in.nextInt(),in.nextInt(),in.nextInt());
    	Date c = new Date(in.nextInt(),in.nextInt(),in.nextInt());
    	
List <Date>a = new <Date>ArrayList();
a.add(b);
a.add(c);
a.add(b);
System.out.println(a);
HashSet<Date> set = new HashSet<Date>();
set.add(b);
set.add(c);
set.add(b);
System.out.println(set);
    }

}
