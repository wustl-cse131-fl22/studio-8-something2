package studio8;

import java.util.ArrayList;
import java.util.List;

public class Calender {
static List <Appointment> c = new <Appointment>ArrayList();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
Appointment a = new Appointment(new Date(1,1,1),new Time(1,1));
Appointment e = a;
Appointment b = new Appointment(new Date(1,1,1),new Time(1,1));
c.add(a);
c.add(b);
	
Appointment d = new Appointment(new Date(1,2,1),new Time(1,2));
c.add(d);
System.out.println(e);
System.out.println(d);
System.out.println(e.equals(d));
	}

}
