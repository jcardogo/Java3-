package Lecture1_2;

public class Person {
	//Properties (AKA Attributes - or - States - or - Variables)
		private String name = "No Name";
		private byte age = 0;
		private float height = 0f;
		private float weight = 0f;
		private String race = "None";
		public static int count = 0;
		
		//Empty Constructor
		public Person(){
			System.out.println(name + " has been created!");
			count++;
		}
		
		//Constructor with one Arg
		public Person(String name){
			this.name = name;
			System.out.println(name + " has been created!");
			count++;
		}
		
		public Person(String name, byte age, float height, float weight, String race){
			this.name = name;
			this.age = age;
			this.height = height;
			this.weight = weight;
			this.race = race;
			count++;
		}
		
		//Description Function
		public String desciption(){
			String desc = "";
			desc += "Class: " + this.getClass().getSimpleName() + "\n";
			desc += "Name: " + name + "\n";
			desc += "Age: " + age + "\n";
			desc += "Height: " + height + "\n";
			desc += "Weight: " + weight + "\n";
			desc += "Race: " + race + "\n\n";
							
			return desc;
		}
		
		//Behaviors
		public void eat(String food){
			System.out.println("I am eating " + food);
		}
		
		public void greet(String name){
			System.out.println("Hello " + name);
		}
		
		public String yourName(){
			return "My name is: " + name;
		}

		
		/* Getter and Setter */
		
		/**
		 * @return the name
		 */
		public String getName() {
			return name;
		}

		/**
		 * @param name the name to set
		 */
		public void setName(String name) {
			this.name = name;
		}

		/**
		 * @return the age
		 */
		public byte getAge() {
			return age;
		}

		/**
		 * @param age the age to set
		 */
		public void setAge(byte age) {
			this.age = age;
		}

		/**
		 * @return the height
		 */
		public float getHeight() {
			return height;
		}

		/**
		 * @param height the height to set
		 */
		public void setHeight(float height) {
			this.height = height;
		}

		/**
		 * @return the weight
		 */
		public float getWeight() {
			return weight;
		}

		/**
		 * @param weight the weight to set
		 */
		public void setWeight(float weight) {
			this.weight = weight;
		}

		/**
		 * @return the race
		 */
		public String getRace() {
			return race;
		}

		/**
		 * @param race the race to set
		 */
		public void setRace(String race) {
			this.race = race;
		}

		/**
		 * @return the count
		 */
		public static int getCount() {
			return count;
		}

		/**
		 * @param count the count to set
		 */
		public static void setCount(int count) {
			Person.count = count;
		}
		
		
		public static void numberOfP(){
			System.out.println("People: " + count);
		}

}
