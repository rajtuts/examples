import java.io.File;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RenameFile {
	
	final static Pattern PATTERN = Pattern.compile("(.*?)(?:\\((\\d+)\\))?(\\.[^.]*)?");
	public static void main(String[] args) {
			
		System.out.println(getNewName("one.sh"));
		File file= new File("one.sh");
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e);
		}
	}	
		
	static String getNewName(String filename) {
	    if (fileExists(filename)) {
	        Matcher m = PATTERN.matcher(filename);
	        if (m.matches()) {
	            String prefix = m.group(1);
	            String last = m.group(2);
	            String suffix = m.group(3);
	            if (suffix == null) suffix = "";
	
	            int count = last != null ? Integer.parseInt(last) : 0;
	
	            do {
	                count++;
	                filename = prefix + "(" + count + ")" + suffix;
	            } while (fileExists(filename));
	        }
	    }
	    return filename;
	}
	private static boolean fileExists(String filename) {
		File f= new File(filename);
	    if (f.exists() && !f.isDirectory()) {
	    	return true;
	    }
	    return false;
	}
}
