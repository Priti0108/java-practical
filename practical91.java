class practical92 {

     public static long getFactorial( int number)
   {
       long fact=1;
        int n;
       for(n=number;n>0;n--)
     {
         fact*= n;
     }
       return fact; 
  }
    
   public static long getFactorial2( int number )
    {
      long fact ;
      if (number==0||number==1)
    {
       return 1;
     }
     else 
     {
        fact =number*getFactorial2(number-1);
        
    }
    return fact;
    }
    
    public static void main(String []args){
      int size =0;
      if(args.length>0){
        size=Integer.parseInt(args[0]);
      }
        int[] number= new int[size];
        
        long endTime,startingTime;
        long totalTimeOfForloop=0;
        long totalTimeOfRecursion =0;
         for( int index=0;index< size;index++){
            number[index]=(int)(System.nanoTime()% 10);
             // time of  loop  
            startingTime=System.nanoTime();
              long value=getFactorial(number[index]);
              endTime=System.nanoTime();
              totalTimeOfForloop +=(endTime- startingTime);
              
              // time of recursion method 
              startingTime=System.nanoTime();
              long value1 =getFactorial2(number[index]); 
              endTime= System.nanoTime();
              totalTimeOfRecursion +=(endTime- startingTime);
              
           }
            float AverageForTime= totalTimeOfForloop/(float)size;
           float AveragerecursiveTime= totalTimeOfRecursion/(float)size;
           
           System.out.print("display the numbers");
            for(int index=0 ;index<size;index++){
               System.out.print(number[index]+" ");
               }
               
               System.out.println();
               
               System.out.println("Average time of iterative method:-" +  AverageForTime +"ns");
               System.out.println("Average time of recursive method :-"+ AveragerecursiveTime +"ns");
               
               if(AveragerecursiveTime<AverageForTime){
                   System.out.println("recusive  is better");
                   }
                   else {
                      System.out.println("iterative  is better ");
                    }
                }
           }
