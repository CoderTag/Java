import java.io.File;

public class CreateFiles {

	public static void main(String[] args) {
		String tmpPath = System.getProperty("java.io.tmpdir");
		System.out.println(tmpPath);
		
		File absolutePath = new File(tmpPath);
		System.out.println(absolutePath);
		
		File fileName = new File(absolutePath.getAbsolutePath() + File.separator + "tilu.txt");
		System.out.println(fileName);
		
		System.out.print(fileName.exists());
	}



}
