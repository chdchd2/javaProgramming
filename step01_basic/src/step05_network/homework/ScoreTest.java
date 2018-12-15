package step05_network.homework;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ScoreTest {
	public static void main(String[] args) {
		try{
			BufferedReader br = new BufferedReader(new FileReader("src/step05_network/score.txt"));
			String name;
			int k,e,m;
			
			while(true){
				name=br.readLine();
				if(name==null)
					break;
				k=Integer.parseInt(br.readLine());
				e=Integer.parseInt(br.readLine());
				m=Integer.parseInt(br.readLine());
				
				int tot=k+e+m;
				double avg=(double)tot/3;
				System.out.printf("¿Ã∏ß : %s    √—¡° : %d   ∆Ú±’ : %.2f\n", name,tot,avg);
			}
			br.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}






