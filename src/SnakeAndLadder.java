
public class SnakeAndLadder {

	public static void main(String[] args) 
	{
		int position=0;
		int number;
		int option;

		number=(int) (Math.floor(Math.random()*10)%6)+1;
		System.out.println(number);
		
		option=(int) (Math.floor(Math.random()*10)%3);
	    System.out.println(option);
	    
	    if(option==1)
	      {
	        	int max=position+number;
		        position=max;
	      }
	     else if(option==2)
	     {
		        int min=position-number;      
		          position=min;
		 }
	    System.out.println(position);
	}

}
