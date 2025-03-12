class Practical10{
  

void displayGrid(int size){
  int ln=2*size+1,p=2*size+1;
 String[][] a=new String[ln][p];
  for(ln=1;ln<2*size+1;ln++){
   for(p=1;p<2*size+1;p++){
    a[ln][p]=Integer.toString(ln+p+1);
   }
  }
  for(ln=2*size+1;ln>0;ln--){
    if(ln%2==1){
      for( p=2*size+1;p>0;p--){
        if(p%2==0){
          System.out.print("---");
          
        }else{
          System.out.print("*");
        }
      }
    }else{
      for( p=2*size+1;p>0;p--){
        if(p%2==0){
         if(p%4==0||ln%4==0){
          System.out.print("   ");
         }else{
         if(Integer.parseInt(a[ln][p])>9){
          System.out.print( " "+a[ln][p]+"" );
          }else{
          System.out.print(" "+a[ln][p]+" ");
          }
       }   
        }else{
          System.out.print("|");
        }
      }
    }
    System.out.print("\n");
  }
 }  
 public static void main(String[]args){
    Practical10 p=new Practical10();
    int size=0;
    if(args.length>0){
      size=Integer.parseInt(args[0]);
    }
    p.displayGrid(size);
  }

}

