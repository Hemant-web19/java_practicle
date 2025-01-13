

class practical4 {
    
    
    public static String toxxsystem ( String num , String xx){
        String str = "";
        xx.toLowerCase();
        int number  = to_decimal(num);
        if(xx.contains("o"))return str = "0"+decimal_xxsystem(to_decimal(num),8);
        if(xx.contains("b"))return str = "0b"+decimal_xxsystem(to_decimal(num),2);
        if(xx.contains("x"))return str = "0X"+decimal_xxsystem(to_decimal(num),16);
        if(xx.contains("d"))return str = decimal_xxsystem(to_decimal(num),10);
        
        return str;
    }
    public static int to_decimal( String num){
        int ans = 0  ; 
        num.toLowerCase();
        if ( num.contains("0b")){
            for( int i = 2 ; i < num.length() ; i++ ){
                if ( num.charAt(i) == '1')
                    ans = 2 * ans+1;
                else 
                    ans *= 2; 
            }
            return ans ; 
        } 
        else if ( num.contains("0x")){
            for(  int i = 2; i < num.length(); i++){
                if ( num.codePointAt(i) >= 65 && num.codePointAt(i)<= 70)
                    ans = ans*16 + num.codePointAt(i)-10;
                else
                    ans = ans *16 + num.codePointAt(i)-48;
            }
            return ans ;
        }else if ( num.charAt(0) == '0'){
            for( int i = 1 ; i< num.length() ; i++){
                ans = ans *8 + num.codePointAt(i)-48;
            }
            return ans ;
        }else {
            for ( int i = 0 ; i< num.length(); i++){
                ans = ans *10 + num.codePointAt(i)-48;
            }
            return ans ;
            
    } 
    }
    public static String decimal_xxsystem(int x , int radix){
        String s = "" ; 
        while( x > 0 ){
            int rem =  x % radix ;
            if ( rem >= 10)
                s = s + (char)(rem+55) ;
            else 
               s = s + rem ;
            x /= radix ;
        }
        return reverse(s) ;
    }
    public static String reverse( String s){
        String str = "" ;
        for( int i = s.length()-1 ; i>=0 ; i--){
            str += s.charAt(i);
        }
        return str ;
    }
    public static int  getByte( int number){
        int rem = number % 256 ;
        if( rem < -128) rem += 256;
        if (rem > 127) return rem - 128 -128;
        else return rem ;

    }
    public static int getShort(int number ){
        int rem = number % 65536;
        if( rem < -32768) rem += 65536;
        if ( rem > 32767 ) return rem - 32768 -32768;
        else return rem ;
        
    }
  public static int getNumber( int num , String xx ){
        xx.toLowerCase();
        if ( xx.contains("byte") ){return getByte(num);}
        if ( xx.contains("short") ){return getShort(num);}
        return 0 ;
        
    }
    
    
}
