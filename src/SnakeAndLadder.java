
public class SnakeAndLadder {

	public static void main(String[] args) 
	{
		int position=0;
		int number;
		int option;
		int discCount=0;
		while(position!=100)
		{
		      number=(int) (Math.floor(Math.random()*10)%6);
		      discCount++;
		      System.out.println(number);
		
	       	  option=(int) (Math.floor(Math.random()*10)%3);
		      System.out.println(option);
		
		      if(option==1)
		      {
		        	int max=position+number;
			        if(max<=100)
			        position=max;
		      }
		     else if(option==2)
		     {
			        int min=position-number;
			        if(min>0)
			          position=min;
			        else
				      position=0;
		     }
		     System.out.println("Position = "+position);
		}
		System.out.println(discCount);
	    }
}
