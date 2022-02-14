package JavaProgramms;

public class AccuranceRevers {

	public static void main(String[] args) {
		String s= "ApPiEl";
		char[] ch = s.toLowerCase().toCharArray();
		for(int i=0;i<ch.length;i++) {
			int count=1;
			for(int j=i+1; j<ch.length;j++) {
				if(ch[i]==ch[j]) {

				}
				System.out.println(ch[i]+" "+count);


			}
		}
	}
}
	


