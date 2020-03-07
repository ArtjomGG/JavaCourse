package lesson18;


/* ------------Lesson 18:------------
Read: Ekkel: 849-887
- Create a new classs with: 2 fields, 2 constructors.
1st constructor without parameters and 2nd with all parameters.
- Create instance of that class programmatically vie reflection(not explisitly call a constructor!),
use Class.newInstance() and its combination.
- Create Annotation(@MyProfile) for profiling methods. After method execution the processor
should print execution time. Hint: use System.currentTimeMillis(). */


import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Lesson18HW {

    // Mozhn "IllegalAccessException, InstantiationException, InvocationTargetException" udalit i ostavit tolko "Exeption";

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, InvocationTargetException {

        Lesson18With2fields obj18HW = Lesson18With2fields.class.newInstance();

        Constructor<?>[] declaredConstructors = Lesson18With2fields.class.getDeclaredConstructors();
        //TODO Prikasteli zachem?
        Lesson18With2fields obj18HW2 = (Lesson18With2fields) declaredConstructors[0].newInstance("Book", 500);

        Lesson18With2fields obj18HW3 = (Lesson18With2fields) declaredConstructors[1].newInstance();
        System.out.println(obj18HW2);

        MyProfileProcessor profileProcessor = new MyProfileProcessor();
        MyKlass object = new MyKlass();

        profileProcessor.executeWithProfile(object,"do1");
        profileProcessor.executeWithProfile(object,"do2");
        profileProcessor.executeWithProfile(object,"do3");
    }

}





/*public static void main(String args[]) throws Throwable {
		Class ctClass = ConstructorTest.class;

		// creating an object calling no argument constructor via newInstance of Class object
		ConstructorTest ctNoArgs = (ConstructorTest) ctClass.newInstance();
		ctNoArgs.setPub("created this with ctClass.newInstance()");
		System.out.println("pub:" + ctNoArgs.getPub());

		// creating an object by getting Constructor object (with parameters) and calling newInstance (with parameters) on it
		Constructor constructor = ctClass.getConstructor(new Class[] { String.class, String.class, String.class });
		ConstructorTest ctArgs = (ConstructorTest) constructor.newInstance(new Object[] { "first", "second", "third" });
		ctArgs.setPub("created this with constructor.newInstance(new Object[] { \"first\", \"second\", \"third\" })");

		System.out.println("\npub:" + ctArgs.getPub());
		System.out.println("pro:" + ctArgs.getPro());
		System.out.println("pri:" + ctArgs.getPri());
	}*/
