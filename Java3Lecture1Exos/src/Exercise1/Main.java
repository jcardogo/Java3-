package Exercise1;

public class Main {
	public static void main(String[] args) {
		Author a1 = new Author("John", "johnjay@gmail.com", "Heaven Glory");
		Author a2 = new Author("Alejandro", "jcardogo@gmail.com", "The greatest code");
		Author a3 = new Author("Rina", "rina@gmail.com", "Super Fly");
		Author a4 = new Author("Nima", "nima@gmail.com", "Nima's code tips");
		
			System.out.print("Author: " + a1.getName() + "  ");
			System.out.print("Email: " + a1.getEmail() + "  ");
			System.out.println("Book: " + a1.getBookname() + "  ");
			System.out.print("Author: " + a2.getName() + "  ");
			System.out.print("Email: " + a2.getEmail() + "  ");
			System.out.println("Book: " + a2.getBookname() + "  ");
			System.out.print("Author: " + a3.getName() + "  ");
			System.out.print("Email: " + a3.getEmail() + "  ");
			System.out.println("Book: " + a3.getBookname() + "  ");
			System.out.print("Author: " + a4.getName() + "  ");
			System.out.print("Email: " + a4.getEmail() + "  ");
			System.out.println("Book: " + a4.getBookname() + "  ");
			
	}

}
