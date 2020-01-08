import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileIO {

	static ArrayList<String> myList = new ArrayList<String>();
	
	public static void main(String[] args) throws IOException {
		String baseDir = System.getProperty("user.dir");
		System.out.println("user current directory = " + baseDir);
		String fileName = baseDir + "/src/Songs.txt";
				
		File fos = new File(fileName);
		BufferedReader br = new BufferedReader(new FileReader(fos));
		
		String msg = null; 
		 
		while((msg = br.readLine()) != null){
			new FileIO().parseMsg(msg);
		}
		
		br.close();		
		System.out.println(myList);
	}
	
	private void parseMsg(String msg) {
		String tempArr[] = msg.split("/");
		myList.add(tempArr[0]);
	}

}
