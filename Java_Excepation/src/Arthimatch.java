
public class Arthimatch {

			int i =10;
		
		public void mymethod() {
			
			try {
				
				int a=i/0;	
				
				System.out.println(a);
				
			}catch(Exception e){
				System.out.println("i am inside the cath");
				e.printStackTrace();
			}
					
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
		Arthimatch cathch= new Arthimatch();
		
		cathch.mymethod();
		
		
		
		
		
			
			
		}

	


	}


