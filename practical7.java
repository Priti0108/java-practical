class Practical7{
    void displayPatternP(int size){
      int ln,symbols;
      for(ln=1;ln<=size;ln++){
        if(ln==1||ln==size){
      for(symbols=size;symbols>0;symbols--){
          if(symbols==1){
          System.out.print(" ");
       }else{
          System.out.print("*");
            }
      }
      }else{
        for(symbols=size;symbols>0;symbols--){
         if(symbols==size||symbols==1){
            System.out.print("*");
            }else{
            System.out.print(" ");
            }
           }
         }
           System.out.print("\n");
          }
          for(ln=size-1;ln>0;ln--){
             for(symbols=1;symbols<=size;symbols++){
            if(symbols==1){
            System.out.print("*");
             }else{
            System.out.print(" ");
            }
          } 
          System.out.print("\n");
         }
         
      }
        void displayPatternR(int size){
      int ln,symbols;
        for(ln=1;ln<=size;ln++){
          if(ln==1||ln==size){
          for(symbols=size;symbols>1;symbols--){
            System.out.print("*");
            }
            }else{
        for(symbols=size;symbols>0;symbols--){
          if(symbols==size||symbols==1){
            System.out.print("*");
            }else{
            System.out.print(" ");
            }
           }
             }
          System.out.print("\n");
         }
         for(ln=size-1;ln>0;ln--){
          for(symbols=1;symbols<=size+1-ln;symbols++){
            if(symbols==1||symbols==size+1-ln){
              System.out.print("*");
              }else{
              System.out.print(" ");
              }
              }
              System.out.print("\n");
            }
      }
         void displayPatternI(int size){
        int ln,symbols;
          for(ln=1;ln<=size;ln++){
            if(ln==1){
            for(symbols=size;symbols>0;symbols--){
              System.out.print("*");
              }
          } else{
              for(symbols=size;symbols>0;symbols--){
                 if(symbols==size/2+1){
                  System.out.print("*"); 
               }  else{ 
                  System.out.print(" ");
                 }
            
             } 
                }
            
              System.out.print("\n");
          }
          for(ln=size-1;ln>0;ln--){
               if(ln==1){
            for( symbols=size;symbols>0;symbols--){
              System.out.print("*");
              }
          }else{
              for( symbols=size;symbols>0;symbols--){
                 if(symbols==size/2+1){
                  System.out.print("*"); 
               }  else{ 
                   System.out.print(" ");
              }
            
             } 
            
           } 
              System.out.print("\n");
          }
         }
          void displayPatternT(int size){
           int ln,symbols,spaces;
            for(ln=1;ln<=size;ln++){
              if(ln==1){
              for(symbols=size;symbols>0;symbols--){
                System.out.print("*");
                }
               }else{
              for(symbols=size;symbols>0;symbols--){
                 if(symbols==size/2+1){
                  System.out.print("*"); 
               }  else{ 
                  System.out.print(" ");
                 }
                   } 
            }
            
              System.out.print("\n");
          }
              for(ln=size-1;ln>0;ln--){
              for(symbols=size;symbols>0;symbols--){
                 if(symbols==size/2+1){
                  System.out.print("*"); 
               }  else{ 
                  System.out.print(" ");
                 }
            
             } 
            
            
              System.out.print("\n");
          }
         }   
             public static void main(String[]args){
             Pattern q=new Pattern();
		             q.displayPatternP(5);
		             System.out.print("\n");
		             q.displayPatternR(5);
		             System.out.print("\n");
		             q.displayPatternI(5);
		             System.out.print("\n");
		             q.displayPatternT(5);
		             System.out.print("\n");
		             q.displayPatternI(5);
		             System.out.print("\n");
		            }
     }  
