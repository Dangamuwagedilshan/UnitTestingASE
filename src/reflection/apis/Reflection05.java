package reflection.apis;

import java.lang.reflect.Field;


public class Reflection05 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		 Simple s = new Simple();
		 
		 Field [] fields =  s.getClass().getDeclaredFields();
		    System.out.printf("There are %d fields\n", fields.length);
		    
		 for(Field f : fields) {
		      System.out.printf("field name=%s type=%s value=%s\n", 
		          f.getName(), f.getType(), f.getName().toString());
		      
		 }
	}

}
