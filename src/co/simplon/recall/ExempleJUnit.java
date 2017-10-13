package co.simplon.recall;

public class ExempleJUnit {

	public static String helloWorld(String name) {
		// TODO Auto-generated method stub
		String message;
		//message = name == ""  ? "Helle World": "Hello "+name;
		if (name == "")
			message = "Hello World";
		else
			message = "Hello " + name;
		return message;
	}

}
