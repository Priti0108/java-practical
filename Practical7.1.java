class Practical7.1{
  String getPatternP1(int ln,int size){
    String Pattern="";
    String blankString=" ";
     int symbols;
      
        if(ln==1||ln==size){
      for(symbols=size;symbols>0;symbols--){
          if(symbols==1){
          Pattern+=blankString;
       }else{
          Pattern+="*";
          }
          }
      }else{
        for(symbols=size;symbols>0;symbols--){
          if(symbols==size||symbols==1){
           Pattern+="*";
             }else{
           Pattern+=blankString;
            }
           }
         }
         
          
          return Pattern;
          }
       String getPatternP2(int ln,int size){
          String Pattern="";
          String blankString=" ";
          for(int symbols=size;symbols>0;symbols--){
           if( symbols==size){
            Pattern+="*";
          }else{
            Pattern+=blankString;
            } 
            }
          return Pattern;
       }
       
       String getPatternR1(int ln,int size){
        String Pattern="";
        String blankString=" ";
          int symbols;
          
        if(ln==1||ln==size){
      for(symbols=size;symbols>0;symbols--){
        if(symbols==1){
          Pattern+=blankString;
       }else{
          Pattern+="*";
          }
          }
      }else{
        for(symbols=size;symbols>0;symbols--){
          if(symbols==size||symbols==1){
           Pattern+="*";
            }else{
              Pattern+=blankString;
              }
             }
           }
           
         
         return Pattern;
         }
      String getPatternR2(int ln,int size){
        String Pattern="";
        String blankString=" ";
         int symbols;
          for(symbols=1;symbols<=size;symbols++){
            if(symbols==1||symbols==size+1-ln){
               Pattern+="*";
              }else{
                 Pattern+=blankString;
              }
              }
             
              
              return Pattern;
       }
        String getPatternI1(int ln,int size){
         String Pattern="";
         String blankString=" ";
          int symbols;
          
            if(ln==1){
            for(symbols=size;symbols>0;symbols--){
              Pattern+="*";
              }
          } else{
              for(symbols=size;symbols>0;symbols--){
                 if(symbols==size/2+1){
                  Pattern+="*"; 
               }  else{ 
                  Pattern+=blankString;
                 }
            
             } 
            }
             
          
          return Pattern;
          }
        String getPatternI2(int ln,int size){ 
          String Pattern="";
          String blankString=" ";
          int symbols;
                if(ln==1){
            for(symbols=size;symbols>0;symbols--){
              Pattern+="*";
              }
          }else{
              for(symbols=size;symbols>0;symbols--){
                 if(symbols==size/2+1){
                  Pattern+="*"; 
               }  else{ 
                  Pattern+=blankString;
              }
            
             } 
            
           } 
            
          
          return Pattern;
        }
        String getPatternT1(int ln,int size){
         String Pattern="";
         String blankString=" ";
          int symbols,spaces;
           
               if(ln==1){
              for(symbols=size;symbols>0;symbols--){
                Pattern+="*";
                }
               }else{
              for(symbols=size;symbols>0;symbols--){
                 if(symbols==size/2+1){
                  Pattern+="*"; 
               }  else{ 
                  Pattern+=blankString;
                 }
            
             } 
            }
             
              return Pattern;
            }
          String getPatternT2(int ln,int size){
            String Pattern="";
            String blankString=" ";
          
                 for(int symbols=size;symbols>0;symbols--){
                 if(symbols==size/2+1){
                  Pattern+="*"; 
               }  else{ 
                  Pattern+=blankString;
                 }
            
             } 
             return Pattern;
             }
       
       public static void main(String args[]){
        Priti p=new Priti();
      
        int size=5;
        for(int ln=1;ln<=size;ln++){
        System.out.print(p.getPatternP1(ln,size)+" "+p.getPatternR1(ln,size)+" "+p.getPatternI1(ln,size)+" "+p.getPatternT1(ln,size)+" "+p.getPatternI1(ln,size)+"\n");
      }
      for(int ln=size-1;ln>0;ln--){
         System.out.print(p.getPatternP2(ln,size)+" "+p.getPatternR2(ln,size)+" "+p.getPatternI2(ln,size)+" "+p.getPatternT2(ln,size)+" "+p.getPatternI2(ln,size)+"\n");
        }
    
   }
  }
  
  
   
   
