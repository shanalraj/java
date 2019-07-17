package shanal;

import java.util.Scanner;

public class TicketSystem {

	
	String ticDesc,ticType,ticStatus,ticResolution;
	int ticNumber;
	
	TicketSystem(String ticDesc,String ticType,int ticNumber)
	{
		this.ticDesc=ticDesc;
		this.ticType=ticType;
		this.ticStatus="New";
		this.ticNumber= ticNumber;
	}
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1 for Create new Ticket or 2 for exit ");
		int i1=sc.nextInt();
		
      switch(i1)
      {
      case 1:
    	  System.out.println("Enter ticket description");
    	  sc.nextLine();
    	  String s1=sc.nextLine();
    	  System.out.println("Enter ticket Type");
    	  //sc.nextLine();
    	  String s2=sc.nextLine();
    	  int n1=(int)(Math.random() * 3) + 100;
    	  TicketSystem tsobj=new TicketSystem(s1,s2,n1);
    	  System.out.println("Ticket Number: "+tsobj.ticNumber+ ", Ticket ticStatus: "+tsobj.ticStatus+ ", Ticket Description: "+tsobj.ticDesc+", Ticket Type: "+tsobj.ticType);
    	  System.out.println("========================================================================");
    	  System.out.print("");
    	  System.out.println("Enter 3 for approve and 4 for cancel/Reject");
    	  int i2=sc.nextInt();
    	  if(i2==3)
    	  {
    		  tsobj.ticStatus="Approved";
                  System.out.println("Ticket Number: "+tsobj.ticNumber+ ", Ticket ticStatus: "+tsobj.ticStatus+ ", Ticket Description: "+tsobj.ticDesc);
                  
            	  System.out.println("========================================================================");
            	  System.out.print("");
    		  System.out.println("Enter ticket resolution details ");
    		  sc.nextLine();
    		  String s3=sc.nextLine();
    		  tsobj.ticResolution=s3;
    		  System.out.println("Ticket Number: "+tsobj.ticNumber+ ", Ticket ticStatus: "+tsobj.ticStatus+ ", Ticket Description: "+tsobj.ticDesc+", Ticket Resolution: "+tsobj.ticResolution);
        	  System.out.println("========================================================================");
        	  System.out.print("");
    		  
    		  System.out.println("Enter 5 to close the ticket ");
    		  int i3=sc.nextInt();
    		  if(i3==5)
    		  {
    			  tsobj.ticStatus="Close";
    			  System.out.println("Ticket Number: "+tsobj.ticNumber+ ", Ticket ticStatus: "+tsobj.ticStatus+ ", Ticket Description: "+tsobj.ticDesc+", Ticket Resolution: "+tsobj.ticResolution);  
    		  }
    		  else
    		  {
    			  System.out.println("Worng input, cannot close the Ticket");
    		  }
    		  
    		  
    		  
    	  }
    	  else if(i2==4)
    	  {
    		  tsobj.ticStatus="Cancel";
    		  System.out.println("Ticket Number: "+tsobj.ticNumber+ ", Ticket ticStatus: "+tsobj.ticStatus+ ", Ticket Description: "+tsobj.ticDesc);
    	  }
    	  else
    	  {
    		  System.out.println("Wrong input and exiting the System");
    	  }
    	  
      case 2:
    	  System.out.println("Exiting the System");
    	  break;
		}
		
	}
	
}


