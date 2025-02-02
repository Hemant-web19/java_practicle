

class Practical7 {
    public static void main(String[] args) {

    		
    }
    public static String PrintName_horizontal(int size ){
        String pattern = "";
       	if(size>2){
       		
       	int mid = size/2+1;
        int size1 = size ;
        if (size%2==0)size1+=1;
        for(int ln =  1 ; ln <= size ; ln++){
            for(int i = 1 ; i<=size ; i++){
                if (i == 1 || i == size || ln == mid )pattern+="+";
                else pattern+=" ";
                
            }
        pattern += "   ";
            for(int i = 1 ; i<= size ; i++){
                if(i == 1 ||ln == 1 || ln == mid || ln == size)pattern +="+";
                else pattern += " ";
            }
            
        pattern += "  ";
            {
            if(ln <= mid){
                for(int i = 1 ; i<= size1 ; i++){
                    if(i ==1 || i == size1 || i == ln || ln+i == 2*mid)pattern+= "+";
                    else pattern += " ";
                    }
                    
                }
            else {
                for(int i = 1 ; i<=size1 ; i++){
                    if(i==1 || i == size1)pattern+="+";
                    else pattern += " ";
                }
            }
            }
         pattern += "  ";
            
             for(int i = 1  ; i<=size ;i++){
                if((ln == 1 && i== size )||(i == 1 && ln ==1 )) pattern += " ";
                else if(ln == size/2+1 || i == 1 || i==size || ln ==1   ) pattern += "*";
                else pattern += " ";
                
            }
            
            pattern += "  ";
             {
                 for(int i = 1 ; i<=size ;i++){
                if ( i == 1 || i ==size || i==ln )pattern += "+";
                 else pattern += " ";
             }
             }
             pattern += "  ";
             {
                 for( int i = 1 ; i<=size1 ; i++){
                 if (ln == 1 || i == mid  )pattern += "+";
                 else pattern += " ";
             }
             }
            
            pattern += "\n";
        }
       		}
       	else pattern = "HEMANT";
        
        return pattern ;
    }
    public static String PrintName_vertical(int size){
    	String pattern = "";
    	if (size >2){
    	pattern += H(size);
        pattern += "\n";
        pattern += E(size);
        pattern += "\n";
        pattern += M(size);
        pattern += "\n";
        pattern += A(size);
        pattern += "\n";
        pattern += N(size);
        pattern += "\n";
        pattern += T(size);}
        
    	else pattern = "HEMANT";
        
        
        
        return pattern ;
    }
    public static String H(int size ){
        String pattern = "";
        int mid = size/2+1;
        for(int ln =  1 ; ln <= size ; ln++){
            for(int i = 1 ; i<=size ; i++){
                if (i == 1 || i == size || ln == mid )pattern+="+";
                else pattern+=" ";
                
            }
            pattern += "\n";
        }
        return pattern ;
    }
    public static String E(int size ){
        String pattern ="";
        int mid = size/2+1;
        for(int ln = 1 ; ln<=size ; ln++){
            for(int i = 1 ; i<= size ; i++){
                if(i == 1 ||ln == 1 || ln == mid || ln == size)pattern +="+";
                else pattern += " ";
            }
            pattern += "\n";
        }
        return pattern ;
    }
    public static String M(int size ){
        String pattern = "";
        int mid = size/2+1;
        int size1 = size ;
        if (size%2==0)size1+=1;
        for(int ln = 1 ; ln <= size ;ln ++){
                if(ln <= mid){
                    for(int i = 1 ; i<= size1 ; i++){
                        if(i ==1 || i == size1 || i == ln || ln+i == 2*mid)pattern+= "+";
                        else pattern += " ";
                    }
                    
                }
                else {
                    for(int i = 1 ; i<=size1 ; i++){
                        if(i==1 || i == size1)pattern+="+";
                        else pattern += " ";
                    }
                }
            pattern += "\n";
        }
        return pattern ;
    }
    public static String A(int size){
        String pattern ="";
        for (int ln = 1 ; ln <= size ; ln++){
            for(int i = 1  ; i<=size ;i++){
                if((ln == 1 && i== size )||(i == 1 && ln ==1 )) pattern += " ";
                else if(ln == size/2+1 || i == 1 || i==size || ln ==1   ) pattern += "*";
                else pattern += " ";
                
            }
   			pattern  += "\n";
        }
        return pattern ;
    }
    public static String N(int size){
        String pattern = "";
        for (int ln = 1  ; ln<= size ;ln++){
            for(int i = 1 ; i<=size ;i++){
                if ( i == 1 || i ==size || i==ln )pattern += "+";
                else pattern += " ";
            }
            pattern += "\n";
        }
        return pattern ;
    }
    public static String T(int size){
        String pattern ="";
        int size1 = size ;
        if (size %2==0)size1 += 1 ;
        int mid = size/2+1;
        for(int ln = 1 ; ln<=size ; ln++){
            for( int i = 1 ; i<=size1 ; i++){
                if (ln == 1 || i == mid  )pattern += "+";
                else pattern += " ";
            }
            pattern += "\n";
        }
        return pattern;
    }

    
}
