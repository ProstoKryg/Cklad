package cklad;

public class Cklad {

    int Prod [] = new int [] {0,0,0,0,0,0};
    
    int posl [] = new int [] {0,0,0,0,0,0,0,0,0,0};
    
    int ProdPos1 [] = new int [] {0,0,0,0,0,0};
    
    int ProdPol1 [] = new int [] {0,0,0,0,0,0};
    int il[];
    
    
    
    
    boolean stopped=false;

Thread Pos1=new Thread()
	{	public void run(){
		 while(!stopped)
			{
                            try	{
				sleep((int)(Math.random()*10000));
                                
                                for ( il =1 ; il <= 4  ; il++){
                                
                                    
                                
                                };
                                    
                                    
                                
                                
					System.out.println();
				}
		  		catch(Exception pe)
		  		{	
					System.out.println("Error heigh: " + pe);
		  		}
		  	}
		  }
	};

Thread Pol1=new Thread()
	{	public void run()
		{ while(!stopped)
			{try	
				{ sleep(1);

				System.out.println();
				}
		  	catch(Exception pe)
		  		{	
					System.out.println("Error heigh: " + pe);
		  		}
		  	}
		  }
	};

Thread Oper=new Thread()
	{	public void run()
		{ while(!stopped)
			{try	
				{ sleep(1);

				System.out.println();
				}
		  	catch(Exception pe)
		  		{	
					System.out.println("Error heigh: " + pe);
		  		}
		  	}
		  }
	};

	public Cklad()
	{	
		Pol1.setPriority(Thread.NORM_PRIORITY);	//NORM_PRIORITY MIN_PRIORITY 
                Pos1.setPriority(Thread.NORM_PRIORITY);
                Oper.setPriority(Thread.NORM_PRIORITY);
    
		Pol1.start();	
		Pos1.start();	
		Oper.start();	
	}

    public static void main(String[] args) {
      
    }
    
}
