import java.io.File;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RenameFile2 {
	
	final static Pattern PATTERN = Pattern.compile("(.*?)(?:\\((\\d+)\\))?(\\.[^.]*)?");
	public static void main(String[] args) {
			
		// Rename file
		String sfile = "one.sh";
		renameFile(sfile);
		try {
			File file=new File(sfile);
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static void renameFile(String sfile) {
		String newfilename = null;
		if(fileExists(sfile)){
			newfilename = getNewName(sfile);
			renameFile(sfile, newfilename);
		}
	}
	
	private static boolean renameFile(String oldfilename, String newfilename) {
		File file= new File(oldfilename);
		boolean success = file.renameTo(new File(newfilename));

		if (success) {
			System.out.println("File was successfully renamed to "+newfilename);
		} else {
			return false;
		}
		return true;
	}
		
	private static String getNewName(String filename) {
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
