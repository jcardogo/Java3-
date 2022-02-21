package Lecture1_2;

public class Main {
	public static void main(String[] args) {
			Person p1 = new Person();
			Person p2 = new Person("Nelson");
			Person p3 = new Person("Arneaud");
			
			Person p4 = new Person ("Momo", (byte)52, 6.1f, 220f, "Asian");
			
			System.out.println("Howmany people: " +Person.count);
			
			p4.setAge((byte) 25);
			//System.out.println(p4.desciption());
			System.out.println(p4.getName());
			
		
		/*
			Rectangle.unit = "in";
			Rectangle r1 = new Rectangle(10, 15);
			Rectangle r2 = new Rectangle();
			
			r2.setHeight(50);
			r2.setWidth(10);
			
			System.out.println(r1.description());
			System.out.println();
			System.out.println(r2.description());
			System.out.println();
			
			System.out.println("Perimeter: " + r1.perimeter() + Rectangle.unit);
			System.out.println("Perimeter: " + r2.perimeter() + Rectangle.unit);
			
			System.out.println("Area: " + r1.area() + Rectangle.unit);
			System.out.println("Area: " + r2.area() + Rectangle.unit);
		*/	
			
		}
}
