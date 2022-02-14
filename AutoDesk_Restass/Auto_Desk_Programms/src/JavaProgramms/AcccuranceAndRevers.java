package JavaProgramms;

public class AcccuranceAndRevers {

	public static void main(String[] args) {
		int count =1;
		String s= "ApPiEl";
		String s1= s.toLowerCase();
		char[] ch = s1.toCharArray();
		for(int i=0;i<ch.length-1;i++) {
			
			if(s1.charAt(i)!=s1.charAt(i+1)) {
				System.out.println(count+""+s1.charAt(i));	
				count=1;
			}else
				count++;
		}
		System.out.println(count+""+s1.charAt(s.length()-1));


	}

	}


