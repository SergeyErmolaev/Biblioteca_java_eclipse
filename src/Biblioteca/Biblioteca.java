package Biblioteca;

import java.sql.SQLException;

public class Biblioteca {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		/*
		 * We need to have variables that identify the reader's book, the library system administrator, and the librarian.
		Let's start with the variables that identify the book.
		*/
//		private char au_id;
//        private char pub_id;
//        private char title_id;
//
//        private String au_fname;
//        private String au_lname;
//        private String title_name;
//        private String pub_name;
//        private String city;
//        private String type;
//
//        private int pages;
//        private int day;
//        private int month;
//        private int year;
//        private int au_order;
        
        /*
         * Also needed are methods to connect to the database with different permissions.
         * Administrator
         * add/edit/delete users with different permissions (administrator, librarian, reader).
         * add/edit/delete books
         * See all members.
         * See all books
         * 
         * Librarian
         * add/edit/delete books.
         * add/edit/delete readers
         * See all readers/all books
         * 
         * Reader
         * view books
         * get a book
         * return a book
         * change your personal data
         * */
        

//        Biblioteca biblioteca = new Biblioteca();
//        biblioteca.open();
//        biblioteca.insert();
//        biblioteca.select();
//        biblioteca.close();
//		  returns the contents of the table
//		Queries q = new Queries();
//		q.q1();
		InsertPublishers ip = new InsertPublishers("P03", "McGraw-Hill", "New York");
	}

}
