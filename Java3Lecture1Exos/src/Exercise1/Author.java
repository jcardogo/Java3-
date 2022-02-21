package Exercise1;

public class Author {
	//Properties
	private String name = "No Name", email = "No name", bookname = "No book name";
	public static int count = 0;
	
	//Empty Constructor
	public Author() {
		count++;
	}
	
	//Constructor with one Arg
			public Author(String name, String email ,String bookname ) {
				this.name = name;
				this.email = email;
				this.bookname = bookname;
				count++;
			}

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
			 * @return the email
			 */
			public String getEmail() {
				return email;
			}

			/**
			 * @param name the email to set
			 */
			public void setEmail(String email) {
				this.email = email;
			}
			/**
			 * @return the bookname
			 */
			public String getBookname() {
				return bookname;
			}

			/**
			 * @param name the bookname to set
			 */
			public void setBookname(String bookname) {
				this.bookname = bookname;
			}
			public static int getCount() {
				return count;
			}
			public static void numberOfa(){
				System.out.println("Authors: " + count);
			}
			
			//Description Function
	
}
