
public class TryCatch {

	public static void main(String[] args) {
		
		
		System.out.println("before trying try block sys");
		
		try {
			
			System.out.println("starting for try cath");
			
			int divided=10/0;
			
			System.out.println(divided);
			
			
			
		}catch(Exception e) {
			
			System.out.println("error occored");
			
			System.out.println(e.getMessage());
			
			e.printStackTrace();
			
			
		}
		System.out.println("ending cath block");
			
	}
		
		
		
}			
			
			
			