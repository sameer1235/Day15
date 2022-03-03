package Day15;

import java.util.*;

public class EnumItterator {

	public static void main(String[] args) {
        Vector<String> vector = new Vector<>();

        vector.add("sam");
        vector.add("sateesh");
        vector.add("Ritesh");
        vector.add("Raju");
        vector.add("Abhi");

        Enumeration<String> elements = vector.elements();
        while(elements.hasMoreElements()) {
      	  String  n = elements.nextElement();
            System.out.println(n);
            if(n == "Raju")
          	  vector.remove("Raju");

        }
        System.out.println("Vector List");
        System.out.println(vector);
	
	}

}
