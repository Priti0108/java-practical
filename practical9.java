public class practical9{
  public static void main(String[]args){
    int size=0;
    if(args.length){
      size=Integer.parseInt(args[0]);
    }
    String[]s=new String[size];
    long totalStringtime=0;
    long totalStringBuffertime=0;
    long totalStringBuildertime=0;
    for(Integer index=0;index<size;index++){
      Integer num=ss (int)(System.nanoTime()%51); 
        s[index]=num.toString();
        long startingTime;
        long endTime;
        
//for string 
  startingTime=System.nanoTime();
  String s1="153";
  String str=s1+s[index];
  endTime=System.nanoTime();
  totalStringtime+=(endTime-startingTime);
  
//for stringBuffer
   startingTime=System.nanoTime();
  StringBuffer s2 = new StringBuffer("234");
  s2.append(str[index]);
  endTime=System.nanoTime();
  totalStringBuffertime +=( endTime- startingtime);
  
  
   // for StringBuilder
     initialTime =System.nanoTime();
     StringBuilder s3 =new StringBuilder("345");
     s3.append(str[index]);
     endTime=System.nanoTime();
     totalStringBuildertime +=(endTime -startingtime );
}
 //calculate the average time of each method 
 float AverageTimeOfString =totalStringtime/(float)size ;
 float AverageTimeOfStringBuffer=totalStringBuffertime/(float)size;
 float AverageTimeOfStringBuilder=totalStringBuildertime/(float)size;
               
  System.out.println(" array elements :");
                
    for( Integer index=0; index<size ;index++){
       System.out.print(str[index]+" ");
       }
     System.out.print("\n");
                
  // avg time for each method
      System.out.println("the average time of String is:" + AverageTimeOfString+"ns");
      System.out.println(" the average time of StringBuffer is:"+ AverageTimeOfStringBuffer+"ns");
      System.out.println("the average time of StringBuilder is :"+ AverageTimeOfStringBuilder+"ns");
      

      // comparison 
                
                if(AverageTimeOfString>AverageTimeOfStringBuffer && AverageTimeOfString>AverageTimeOfStringBuilder){
                      System.out.println("String method is better than other two's");
                  }
                   else if(  AverageTimeOfStringBuffer>AverageTimeOfString && AverageTimeOfStringBuffer>AverageTimeOfStringBuilder){
                        
                        System.out.println("StringBuffer method is better than other two's");
                     }
                    else if( AverageTimeOfStringBuilder> AverageTimeOfString &&  AverageTimeOfStringBuilder> AverageTimeOfStringBuffer){
                         
                          System.out.println("StringBuilder method is better than other two's ");
                      }
                    }
               }     
