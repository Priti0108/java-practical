class Practical6{
   void displayPattern1(int size){
          int ln,spaces,symbols;
          for(ln=1;ln<=size;ln++){
            for(spaces=size-ln;spaces>0;spaces--){
              System.out.print(" ");
              }
            for(symbols=2*ln-1;symbols>0;symbols--){
              System.out.print("+");
              }
              System.out.print("\n");
              }
          for(ln=size-1;ln>0;ln--){
            for(spaces=size-ln;spaces>0;spaces--){
              System.out.print(" ");
              }
            for(symbols=2*ln-1;symbols>0;symbols--){
              System.out.print("+");
              }
                    System.out.print("\n");
              }
    }
    void displayPattern2(int size){
      int ln,spaces,symbols;
        for(ln=1;ln<=size;ln++){
          for(spaces=size-ln;spaces>0;spaces--){
            System.out.print(" ");
            }
          for(symbols=2*ln-1;symbols>0;symbols--){
           if(symbols%2==1){
           System.out.print("+");
           }else{
           System.out.print(" ");
           }
           }
           System.out.print("\n");
           }
           for(ln=size-1;ln>0;ln--){
             for(spaces=size-ln;spaces>0;spaces--){
            System.out.print(" ");
            }
          for(symbols=2*ln-1;symbols>0;symbols--){
           if(symbols%2==1){
           System.out.print("*");
           }else{
           System.out.print(" ");
           }
           }
           System.out.print("\n");
           }
          }
    void displayPattern3(int size){
      int ln,spaces,symbols;
        for(ln=1;ln<=size;ln++){
          for(spaces=size-ln;spaces>0;spaces--){
            System.out.print(" ");
              }
           for(symbols=2*ln-1;symbols>0;symbols--){
            if((symbols+ln)%2==0){
              System.out.print("*");
              }else{
              System.out.print("+");
              }
             }
             System.out.print("\n");
            }
             for(ln=size;ln>0;ln--){
          for(spaces=size-ln;spaces>0;spaces--){
            System.out.print(" ");
            }
            for(symbols=2*ln-1;symbols>0;symbols--){
              if((symbols+ln)%2==0){
                System.out.print("+");
                }else{
                System.out.print("*");
                }
              }
              System.out.print("\n");
          }
       }
       public static void main(String args[]){
		   Practical6 q=new Practical6();
		  
		   q.displayPattern1(3);
		   q.displayPattern2(3);
		   q.displayPattern3(3);
	}
    }   
