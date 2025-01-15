         public  class Practical4{
              public static int getShort(int num){
          int result;
           int temp;
            temp = num/32768;
            if(num>0){
                if(temp%2==0){
                   result=num%32768;
                   }
                else{
                    result=num%32768-32768;
                    }
                return result;
            }
            else{
               if(temp%2==0){
                    result=-num%32768;
                    }
                else{
                    result=num%32768+32768;
        }
            
            }
               return result;
       }
       public  static int getBytes(int num){
            int result;
            int temp;
            temp = num/128;
           if(num>0){
               if(temp%2==0){
                   result=num%128;
                   }
                else{
                   result=num%128-128;
                   }
                return result;
            }
            else{
                if(temp%2==0){
                   result=-num%128;
                   }
                else{
                    result=num%128+128;
        }
                    
            }
             return result;
        }
        public static int getNumber(int num, String type){
           if(type.equalsIgnoreCase("Short")){
               return  getShort(num);
                
            }
            
            else if( type.equalsIgnoreCase("Byte")){
                   return getBytes(num);
                   }
          return -1;
     }
     
public static void main(String args[])
{
System.out.println(getBytes(2355));
System.out.println(getBytes(-123));
System.out.println(getBytes(-5015));
System.out.println(getShort(5103));

}
//decimal to binary
public static int decimalToBinary(int num){
   int base=1;
   int d=0;
   int r;
  
   while(num>0){
   r=num %2;
   num=num/2;
   d=d+r*base;
   base=base*10;
   }
 return d;
 }
 //Decimal to Octal
 public static int decimalToOctal(int num){
 int base=1;
   int d=0;
   int r;
  
   while(num>0){
   r=num %8;
   num=num/8;
   d=d+r*base;
   base=base*10;
   }
   return d;
 }
 //binary to Decimal
 public static int binaryToDecimal(int binary){
 int num;
 int base=1;
   int d=0;
   int r;
  
   while(binary>0){
   r=binary%10;
   d=d+r*base;
   num=binary/10;
   base=base*2;
   }
   return d;
   }
   //octal to Decimal
   public static int octalToDecimal(int octal){
   int num;
 int base=1;
   int d=0;
   int r;
  
   while(octal>0){
   r=octal%10;
   d=d+r*base;
   num=octal/10;
   base=base*8;
   }
   return d;
   }
   //binary to octal
   public static String binaryToOctal(int binary){
   int decimal = binaryToDecimal(binary);
   return String.valueOf(decimalToOctal(decimal));
   }
   //octal to binary
   public static String octalToBinary(int octal){
   int decimal=octalToDecimal(octal);
   return String.valueOf(decimalToBinary(decimal));
   }
   public static String toXXSystem(String num,String XX){
   int decimalNum=0;
   String result = "";
   
   if(num.startsWith("0b")|| num.startsWith("0B")){
   num=num.substring(2);
   decimalNum=binaryToDecimal(Integer.parseInt(num));
   }else if(num.startsWith("0")&&num.length()>1){
   num=num.substring(1);
   decimalNum=octalToDecimal(Integer.parseInt(num));
   } else if (num.matches("[01]+")) {  
            decimalNum = binaryToDecimal(Integer.parseInt(num));
        }
        }
        }
   
   

   
