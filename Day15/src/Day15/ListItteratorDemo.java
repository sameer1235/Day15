package Day15;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListItteratorDemo {

	public static void main(String[] args) {
		List<Student> stdList = new ArrayList<>();
		
		stdList.add(new Student( 1 , "Sameer", 86.52, "sam@email.com"));
		stdList.add(new Student( 2 , "mihaj", 70.00, "minhaj@email.com"));
		stdList.add(new Student( 3 , "Raju", 65.50, "Raju@email.com"));
		stdList.add(new Student( 4 , "Virat", 85.2, "virat@email.com"));
		stdList.add(new Student( 5 , "sateesh", 88.32, "sateesh@email.com"));
		
		iterateListUsingListIterator(stdList);
		//additerateListUsingListIterator(stdList);
	}
	private static void iterateListUsingListIterator(List<Student> stdList) {
		     ListIterator<Student> listIterator = stdList.listIterator();
		     System.out.println("Forward Direction");
		     while(listIterator.hasNext()) {
		    	 Student student = listIterator.next();
		    	 System.out.println(student);
		     }
		     System.out.println("**********************************");
		     System.out.println("Backward Direction");
		     while(listIterator.hasPrevious()) {
		    	 Student student = listIterator.previous();
		    	 System.out.println(student);
		     }
	}
	private static void additerateListUsingListIterator(List<Student> stdList) {
		 ListIterator<Student> listIterator = stdList.listIterator();
		 while(listIterator.hasNext()) {
	    	 Student student = listIterator.next();
	    	 if(!student.getName().equalsIgnoreCase("Nikita")) {
	    		 listIterator.add(new Student( 6, "Nikita", 90.0, "nikita@gmail.com"));
	    		 break;
	    	 }
         }
		 for(Student student : stdList) {
    		 System.out.println(student);

	}


	}

}
