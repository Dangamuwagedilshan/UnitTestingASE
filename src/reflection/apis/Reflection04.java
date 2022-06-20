package reflection.apis;

import java.lang.reflect.Field;

public class Reflection04 {

	public static void main(String[] args) throws  NoSuchFieldException,
    SecurityException,
    IllegalArgumentException,
    IllegalAccessException {
		// TODO Auto-generated method stub
		Simple sm = new Simple();
		Field[] fields = sm.getClass().getFields();
		
		System.out.printf("There are %d fields\n", fields.length);
	
		
		
		for(Field f : fields) {
			
	        System.out.printf("field name=%s type=%s value=%.2f\n" ,f.getName(), f.getType(),f.getDouble(sm));
	    }
	}

}
