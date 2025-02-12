class Pattern{
  void fun(int size,int ln){
    if(ln<size+1){
    space(ln,4-ln);
    star(ln,1);
    System.out.print("\n");
    fun(size,ln+1);
    space(ln,4-ln);
    line(ln,1);
    System.out.print("\n");
    }
    
    if(ln==size+1){
    plus(size,1);
    System.out.print("\n");
    fun(size,ln+1);
    }
    
    }
    void space(int ln,int spaces){
      if(spaces>0){
      System.out.print(" ");
      space(ln,spaces-1);
      }
      }
    void star(int ln,int stars){
      if(stars<=ln){
      System.out.print("*");
      star(ln,stars+1);
      }
      }
    void plus(int size,int p){
      if(p<=size+1){
      System.out.print("+");
      plus(size,p+1);
      }
      }
      void line(int ln,int l){
        if(l<=ln){
        System.out.print("/");
        line(ln,l+1);
        }
        }
      void printstars(int ln,int stars){
      if(stars<=ln){
        System.out.print("*");
        printstars(ln,stars+1);
        }
        }
    void fun1(int ln,int size){
      if(ln<=size){
        printstars(ln,1);
        System.out.print("\n");
        fun1(ln+1,size);
        }
        printstars(ln,1);
        System.out.print("\n");
        }
        
        
     public static void main(String[] args){
      Pattern p=new Pattern();
      p.fun1(1,3);
      p.fun(3,1);   
  }
  
 } 
