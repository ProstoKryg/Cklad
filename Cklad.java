package cklad;


public class Cklad {

    
    int Prod [] = new int [] {0,0,0,0,0,0};
    
    int posl [] = new int [] {0,0,0,0,0,0,0,0,0,1000};
    
    int ProdPos1 [] = new int [] {0,0,0,0,0,0};
    int ProdPos2 [] = new int [] {0,0,0,0,0,0};
    
    int ProdPol1 [] = new int [] {0,0,0,0,0,0};
    int ProdPol2 [] = new int [] {0,0,0,0,0,0};
    
    
    
    
    
    boolean stopped=false;

Thread Pos1=new Thread()
	{	public void run(){
		 while(!stopped)
			{
                            try	{
				sleep((int)(Math.random()*1000));
                                
                                
                                
                                    ProdPos1 [1] = (int)(Math.random()*1000);
                                    
                                    ProdPos1 [2] = 1000-ProdPos1 [1];
                                    ProdPos1 [2] = (int)(Math.random()*ProdPos1 [2]);
                                    
                                    ProdPos1 [3] = 1000-ProdPos1 [1] - ProdPos1 [2];
                                    ProdPos1 [3] = (int)(Math.random()*ProdPos1 [3]);
                                    
                                    ProdPos1 [4] = 1000 - ProdPos1 [1] - ProdPos1 [2] - ProdPos1 [3];
                                    ProdPos1 [4] = (int)(Math.random()*ProdPos1 [4]);
                                    
                                    ProdPos1 [0] = ProdPos1 [1] + ProdPos1 [2] + ProdPos1 [3] + ProdPos1 [4];
                                    System.out.println(+ ProdPos1 [1]);
                                    System.out.println(+ ProdPos1 [2]);
                                    System.out.println(+ ProdPos1 [3]);
                                    System.out.println(+ ProdPos1 [4]);
                                    System.out.println(+ ProdPos1 [0]);
                                    System.out.println();
                                    int cladv=0;
                                    int cikl =0;
                                    int il =0;
                                            
                                    while(cladv == 0 && cikl <= 10){
                                    int ckal = 0 ;
                                    int cled = 0 ;
                                    il =0;
                                    
                                    
                                    
                                     
                                          while(ckal == 0){
                                        while(cled == 0){
                                            if (posl [il+1] == 0){
                                                posl [il+1] = 11;
                                                cled = 1;
                                            }
                                            if (posl [il+1] == 1000) {
                                                 posl [il+1] = 11 ;
                                                 cled = 1;
                                                 ckal = 1;}
                                        }
                                        posl [il]= 0;
                                        il++;
                                        cled = 0;
                                          }    
 
                                     if (ProdPos1 [0] + Prod [0] < 1000) {
                                     Prod[0] = Prod[0]+ ProdPos1[0];
                                     Prod[1] = Prod[1]+ ProdPos1[1];
                                     Prod[2] = Prod[2]+ ProdPos1[2];
                                     Prod[3] = Prod[3]+ ProdPos1[3];
                                     Prod[4] = Prod[4]+ ProdPos1[4];
                                     cladv= 1;
                                      }
                                     else
                                         cikl++;
                                         }
                                        
                                        posl [il] = 1000;
					System.out.println("Pos1 загрузил товар на" + ProdPos1[0] + "единиц" );
                                        System.out.println("на складе " + Prod [0] + " единиц товаров");
				}
		  		catch(Exception pe)
		  		{	
					System.out.println("Error heigh: " + pe);
		  		}
		  	}
		  }
	};

Thread Pos2=new Thread()
	{	public void run(){
		 while(!stopped)
			{
                            try	{
				sleep((int)(Math.random()*1000));
                                
                                
                                
                                    ProdPos2 [1] = (int)(Math.random()*1000);
                                    
                                    ProdPos2 [2] = 1000-ProdPos2 [1];
                                    ProdPos2 [2] = (int)(Math.random()*ProdPos2 [2]);
                                    
                                    ProdPos2 [3] = 1000-ProdPos2 [1] - ProdPos2 [2];
                                    ProdPos2 [3] = (int)(Math.random()*ProdPos2 [3]);
                                    
                                    ProdPos2 [4] = 1000 - ProdPos2 [1] - ProdPos2 [2] - ProdPos2 [3];
                                    ProdPos2 [4] = (int)(Math.random()*ProdPos2 [4]);
                                    
                                    ProdPos2 [0] = ProdPos2 [1] + ProdPos2 [2] + ProdPos2 [3] + ProdPos2 [4];
                                    System.out.println(+ ProdPos2 [1]);
                                    System.out.println(+ ProdPos2 [2]);
                                    System.out.println(+ ProdPos2 [3]);
                                    System.out.println(+ ProdPos2 [4]);
                                    System.out.println(+ ProdPos2 [0]);
                                    System.out.println();
                                    int cladv=0;
                                    int cikl =0;
                                    int il =0;
                                            
                                    while(cladv == 0 && cikl <= 10){
                                    int ckal = 0 ;
                                    int cled = 0 ;
                                    il =0;
                                    
                                    
                                    
                                     
                                          while(ckal == 0){
                                        while(cled == 0){
                                            if (posl [il+1] == 0){
                                                posl [il+1] = 12;
                                                cled = 1;
                                            }
                                            if (posl [il+1] == 1000) {
                                                 posl [il+1] = 12 ;
                                                 cled = 1;
                                                 ckal = 1;}
                                        }
                                        posl [il]= 0;
                                        il++;
                                        cled = 0;
                                          }    
 
                                     if (ProdPos2 [0] + Prod [0] < 1000) {
                                     Prod[0] = Prod[0]+ ProdPos2[0];
                                     Prod[1] = Prod[1]+ ProdPos2[1];
                                     Prod[2] = Prod[2]+ ProdPos2[2];
                                     Prod[3] = Prod[3]+ ProdPos2[3];
                                     Prod[4] = Prod[4]+ ProdPos2[4];
                                     cladv= 1;
                                      }
                                     else
                                         cikl++;
                                         }
                                    
                                        posl [il] = 1000;
					System.out.println("Pos2 загрузил товар на " + ProdPos2[0] + " единиц");
                                        System.out.println("на складе " + Prod [0] + " единиц товаров");
                                        
                                
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
	{	public void run(){
		 while(!stopped)
			{
                            try	{
				sleep((int)(Math.random()*1000));
                                
                                
                                
                                    ProdPol1 [1] = (int)(Math.random()*1000);
                                    
                                    ProdPol1 [2] = 1000-ProdPol1 [1];
                                    ProdPol1 [2] = (int)(Math.random()*ProdPol1 [2]);
                                    
                                    ProdPol1 [3] = 1000-ProdPol1 [1] - ProdPol1 [2];
                                    ProdPol1 [3] = (int)(Math.random()*ProdPol1 [3]);
                                    
                                    ProdPol1 [4] = 1000 - ProdPol1 [1] - ProdPol1 [2] - ProdPol1 [3];
                                    ProdPol1 [4] = (int)(Math.random()*ProdPol1 [4]);
                                    
                                    ProdPol1 [0] = ProdPol1 [1] + ProdPol1 [2] + ProdPol1 [3] + ProdPol1 [4];
                                    System.out.println(+ ProdPol1 [1]);
                                    System.out.println(+ ProdPol1 [2]);
                                    System.out.println(+ ProdPol1 [3]);
                                    System.out.println(+ ProdPol1 [4]);
                                    System.out.println(+ ProdPol1 [0]);
                                    System.out.println();
                                    int cladv=0;
                                    int cikl =0;
                                    int il =0;
                                            
                                    while(cladv == 0 && cikl <= 10){
                                        sleep(10);
                                    int ckal = 0 ;
                                    int cled = 0 ;
                                    il =0;
                                    
                                    
                                    
                                     
                                          while(ckal == 0){
                                        while(cled == 0){
                                            if (posl [il+1] == 0){
                                                posl [il+1] = 21;
                                                cled = 1;
                                            }
                                            if (posl [il+1] == 1000) {
                                                 posl [il+1] = 21 ;
                                                 cled = 1;
                                                 ckal = 1; }
                                        }
                                        posl [il]= 0;
                                        il++;
                                        cled = 0;
                                          }    
 
                                     if (ProdPol1 [0] <= Prod [0] )
                                         if ( Prod[1] >= ProdPol1[1])
                                                 if (Prod [2] >= ProdPol1 [2])
                                                         if (Prod[3] >= ProdPol1[3])
                                                                 if (Prod[4]>= ProdPol1[4])
                                     
                                     
                                     {
                                     Prod[0] = Prod[0]- ProdPol1[1];
                                     Prod[1] = Prod[1]- ProdPol1[1];
                                     Prod[2] = Prod[2]- ProdPol1[2];
                                     Prod[3] = Prod[3]- ProdPol1[3];
                                     Prod[4] = Prod[4]- ProdPol1[4];
                                     cladv= 1;
                                      }
                                     else
                                         cikl++;
                                         }
                                    
                                        posl [il] = 1000;
					System.out.println("Pol1 Забрал товар на " + ProdPol1[0] + " единиц");
                                        System.out.println("на складе " + Prod [0] + " единиц товаров");
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
				{ sleep(10);

				System.out.println(+ posl[0]+ " "+ posl[1]+ " " + posl[2] + " " + posl[3]+ " " + posl[4] + " " + posl[5]+ " " + posl[6] + " " + posl[7]+ " " + posl[8]);
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
		Pol1.setPriority(Thread.NORM_PRIORITY);
                Pos1.setPriority(Thread.NORM_PRIORITY);
                Pos2.setPriority(Thread.NORM_PRIORITY);
                Oper.setPriority(Thread.NORM_PRIORITY);
    
		Pol1.start();	
		Pos1.start();	
                Pos2.start();
		Oper.start();	
	}

    public static void main(String[] args) {
        
        new Cklad();
      
    }
    
}
