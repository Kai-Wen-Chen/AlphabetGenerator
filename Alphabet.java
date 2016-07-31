package alphabet;

public class Alphabet {
	public static void main(String[] args){
		for (int i=0;i<10;i++){
			double r = Math.random()*100000;//隨機產生一個數
			int R = (int) r;
			char alphabet = (char)(R%26+65);//轉成A~Z
			if (alphabet == 'A' || alphabet == 'E' || 
					alphabet == 'I' || alphabet == 'O' ||
					alphabet == 'U') continue;//忽略母音
			System.out.println(alphabet);
		}
	}
}
