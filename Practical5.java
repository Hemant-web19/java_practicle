class Practical5{
 
  	public static int factorial1(int number){// with using a for loop
  	if (number>=0){
  		if(number>1){
  			int fact = 1 ;
  			for(;number>1;){
  				fact *= number-- ;} 
  			return fact ;
  		}
  		else return 1 ;	
  	} else return -1 ;
  	}
  	public static int factorial2(int number){// with using a while  loop
  	if (number>=0){
  		if(number>1){
  			int fact = 1 ;
  			while(number>1){
  				fact *= number-- ;} 
  			return fact ;
  		}
  		else return 1 ;	
  	} else return -1 ;
  	}
  	
  	public static int factorial3(int number){
  		if (number>=0){
  			if(number>1)return fact(number);
  			else return 1 ;	
  		} else return -1 ;
  	}
  	public static int fact(int number){
  		if (number<2) return 1 ;
  		else return number * fact(--number);
  		}
  	public static int getarray_sum (int [] arr,int index){
  		if(index > arr.length-1 ) return 0 ;
  		else return arr[index] + getarray_sum(arr,++index);
  		}
  }


