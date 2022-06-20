package reflection.apis;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class Reflection10 {
	
	private static void process(String val) {
        System.out.println("processing " + val);
    }

	public static void main(String[] args) throws NoSuchMethodException,  
    InvocationTargetException, IllegalAccessException{
		// TODO Auto-generated method stub
	    Method m = Reflection10.class.getDeclaredMethod("process", String.class);
	    m.setAccessible(true);
	    Object mv = m.invoke(null,"Final Value");
	    System.out.println(mv);
	}

}
