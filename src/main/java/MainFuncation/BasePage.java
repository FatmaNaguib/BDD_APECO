package MainFuncation;
import io.cucumber.core.cli.Main;

public class BasePage {

	public static void main(String[] args) {

	
		    try {
		        Main.main(new String[] { 
		    
		        	
		        		"-g", "MainFuncation",
		                "-g", "definitions",
		                "-g", "runner.testrunner",

		                "classpath:features", 
				        
				       "-t","@UserLogin",		        
				                
				        "-p", "pretty", 
				        "-p", "json:target/cucumber.json", 
				        
				       		"-p","json:target/json/file.json",
				       		
				        "-m"
		    }
		    );
		} catch (Exception e) {
		        e.printStackTrace();
		        System.out.println("Main method exception : " + e);
		}

}
}