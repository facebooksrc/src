import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.LinkedList;


public class Elearning {
	
	public Elearning(){
		
		try{
			
			String emotions[] = {"PAGE02","PAGE06","PAGE09","PAGE16","PAGE24","PAGE26","PAGE28","PAGE30","PAGE37","PAGE39","PAGE43","PAGE46"};
		
			int temp=0;
			while(temp < emotions.length)
				System.out.println(emotions[temp++]);
			
			LinkedList<String> listFilenames = new LinkedList<String>();
			
			File directory = new File("./data/");
			String filename[] = directory.list();
	
			for (int i = 0; i < filename.length; i++) {
				listFilenames.add(filename[i]);
			}
	
			//retrieve all 40 students
			for(int j=0;j<listFilenames.size();j++)
			{
				//BufferedReader eachPerson =  new BufferedReader(new FileReader("./data/"+(String) listFilenames.get(j),"UTF-8"));
				BufferedReader eachPerson = new BufferedReader(new InputStreamReader(new FileInputStream("./data/"+(String) listFilenames.get(j)), "UTF-8"));
				//Writer writer = new OutputStreamWriter(new FileOutputStream("activity"+index+type+"out.txt"),"MS949");
				
				String line="";
				while((line = eachPerson.readLine()) != null)
				{
					String[] words = line.split("::");
					
					int k=0;
					while(k < words.length)
						System.out.print(words[k++]+" ");
				}
				System.out.print("\n");
			}
			
			//System.out.println("test");
		}catch (IOException e){

			
			
		}
	}
	
	
	public static void main(String args[]){
		
		new Elearning();
	
	}

}
