import java.util.Arrays;
public class Practical5{
   public int factorial(int number){
      if(number==0||number==1){
         return 1;
        }
        else{
           int i,fact=2;
         for(i=3;i<=number;i++){
            fact=fact*i;
         }
         return fact;
       }
    }
    public int factorial1(int number){
      if(number==0||number==1){
          return 1;
        }
        else{
           int i=2,fact=1;
          while(i<=number){
             fact=fact*i;
             i++;
           }
           return fact;
         } 
      }
      public int factorial2(int number){
       if(number==0||number==1){
          return 1;
        }
        else{
           return number*factorial2(number-1);
        }   
      }
      public int getSum(int[] numbers){
          int l;
         l=numbers.length;
        if(l==0){
        return 0;
      }
         return numbers[l-1]+getSum(Arrays.copyOf(numbers,l-1)); 
        } 
      public static void main(String args[]){
        int numbers[]={1,2,3};
        Practical5 ex = new Practical5();
         System.out.println(ex.getSum(numbers));
        }
       
     
 
}
  
