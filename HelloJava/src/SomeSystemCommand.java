
public class SomeSystemCommand {

	public static void main(String[] args) {
		String envPATH = System.getenv("PATH");
		System.out.println("Environment variable PATH = " + envPATH);
		
		String baseDir = System.getProperty("user.dir");
		System.out.println("user current directory = " + baseDir);
		
		String userHome = System.getProperty("user.home");
		System.out.println("user home = " + userHome);
		
		String userName = System.getProperty("user.name");
		System.out.println("user name = " + userName);
		
	}

}
