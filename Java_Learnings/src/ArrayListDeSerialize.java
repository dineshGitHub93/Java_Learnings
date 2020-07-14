
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class ArrayListDeSerialize {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList< String> alist = new ArrayList<String>();
		
		try {
			
			FileInputStream fis = new FileInputStream("myFile");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			alist =  (ArrayList<String>) ois.readObject();
			ois.close();
			fis.close();
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}catch (ClassNotFoundException CE) {
			System.out.println("Class not found");
			CE.printStackTrace();
			return;
		}
		
		for(String temp:alist) {
			System.out.println(temp);
		}

	}

}
