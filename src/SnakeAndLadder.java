
public class SnakeAndLadder {

	public static void main(String[] args) 
	{
		int player1=0,player2=0;
		int number;
		int option;
		int discCount=0;
		int current=1;
		while(player1!=100 && player2!=100)
		{
		      number=(int) (Math.floor(Math.random()*10)%6)+1;
		      discCount++;
		      System.out.println("Number on Dice = "+number);
		
	       	  option=(int) (Math.floor(Math.random()*10)%3);
		      System.out.println("Option = "+option);
		
		      if(current==1)
		      { 
		            if(option==1)
		            {
		        	       int max=player1+number;
			               if(max<=100)
			                   player1=max;
		            }
		           else if(option==2)
		           {
			               int min=player1-number;
			               if(min>0)
			                   player1=min;
			               else
				              player1=0;
			               current=2;
		            }
		           else
		             current=2;
		      }
		      else
		      {
		    	  if(option==1)
			      {
			        	int max=player2+number;
				        if(max<=100)
				            player2=max;
			      }
			     else if(option==2)
			     {
				        int min=player2-number;
				        if(min>0)
				          player2=min;
				        else
					      player2=0;
				        current=1;
			     }  
			     else
			    	 current=1;
		      }
		      System.out.println("Player 1 = "+player1);
		      System.out.println("player 2 =  "+player2);
		}
		if(player1==100)
			System.out.println("Player 1 is Winner");
		else
			System.out.println("Player 2 is winner");
		System.out.println("No of Dice thrown = "+discCount);
	    }
}
