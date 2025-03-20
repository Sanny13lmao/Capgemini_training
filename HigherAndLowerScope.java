package varAndDatatype;

public class HigherAndLowerScope {
	public static void main(String[] args){
		int a = 10;
		{
			int b =110;
			System.out.println(a);
			System.out.println(b);//lower scope variables
		}
		System.out.println(a); //higher scope variables
		System.out.println(b);//throws error
	}

}
