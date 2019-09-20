
public class Test_exception {

	public static void main(String[] args) {
		
		System.out.println("beggining");
		
		try {
			
			int i[]=new int [5];
			
			i[1]=200;
			
		}
		catch(Exception e) {
			
			System.out.println("error occoured");
			
			e.getStackTrace();
		}
			
		System.out.println("eanding");
		
		}

		}


