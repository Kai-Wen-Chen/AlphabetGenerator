package alphabet;

public class Alphabet {
	public static void main(String[] args){
		for (int i=0;i<10;i++){
			double r = Math.random()*100000;//�H�����ͤ@�Ӽ�
			int R = (int) r;
			char alphabet = (char)(R%26+65);//�নA~Z
			if (alphabet == 'A' || alphabet == 'E' || 
					alphabet == 'I' || alphabet == 'O' ||
					alphabet == 'U') continue;//��������
			System.out.println(alphabet);
		}
	}
}
