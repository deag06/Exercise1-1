import java.io.IOException;

public class HelloUser {

	public static void main(String[] args) {	
    System.out.println("Hello ASE2017 - How are you? :)");
	System.out.println("Please enter your name: ");
	byte buffer[] = new byte[80];
	String input = "";
	int read;
	try{
		read = System.in.read(buffer, 0, 80);
		input = new String(buffer, 0, read);
	}
	catch(IOException e){
		e.printStackTrace();
	}
	System.out.println("Hello " + input);
	
	}

}
