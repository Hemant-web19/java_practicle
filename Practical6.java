class Practical{
	static public void displaypattern(int size){
		display1(size);
		display2(size);
		display3(size);
		}
	
	public static void display3(int size){
        for(int ln = 1 ; ln <= size ; ln ++){
            for(int space = size - ln ; space > 0 ; space --){
                System.out.print(" ");
            
            }
            for(int sign = 2*ln -1 ; sign > 0 ; sign --){
                if((sign+ln) %2 == 1)System.out.print("*");
                else System.out.print("+");
                
            }
            System.out.print("\n");
        }
        for(int ln = size  ; ln > 0 ; ln--){
            for(int space = size - ln ; space>0; space--){
                System.out.print(" ");
            }
            for(int sign = 2*ln -1 ; sign >0 ; sign--){
                if((sign+ln) %2 == 1)System.out.print("+");
                else System.out.print("*");
            }
            System.out.print("\n");
        }
    }
	static public void display2(int size){
		for(int ln = 1 ; ln <=size ; ln++){
			for(int dot = size - ln ; dot > 0 ;dot--){
				System.out.print(" ");
				}
			for(int sign = 2*ln - 1 ; sign > 0 ; sign--){
					System.out.print("+");
					
				} 
			System.out.print("\n");
		}
		for(int ln = size -1 ; ln > 0  ; ln--){
			for(int dot = size - ln ; dot > 0 ;dot--){
				System.out.print(" ");
				}
			for(int sign = 2*ln - 1 ; sign > 0 ; sign--){
					System.out.print("+");
					
				}
			System.out.print("\n"); 
		}
		 
		}
	static public void display1(int size){
		int is_sign = 1 ;
		for(int ln = 1 ; ln <= size ; ln++){
			for(int dot = size - ln ; dot > 0 ;dot--){
				System.out.print(" ");
				}
			for(int sign = 2*ln - 1 ; sign > 0 ; sign--){
				if(is_sign == 1 ) {
					System.out.print("+");
					is_sign = 0 ;}
				else {
					System.out.print(" ");
					is_sign = 1 ;}
					
				} 
				is_sign =  1 ;
				System.out.print("\n");
			}
		for(int ln = size-1 ; ln > 0  ; ln--){
			for(int dot = size - ln ; dot > 0 ;dot--){
				System.out.print(" ");
				}
			for(int sign = 2*ln - 1 ; sign > 0 ; sign--){
				if(is_sign == 1 ) {
					System.out.print("*");
					is_sign = 0 ;}
				else {
					System.out.print(" ");
					is_sign = 1 ;}
					
				} 
				is_sign =  1 ;
				System.out.print("\n");
			}
			}
			}
		
