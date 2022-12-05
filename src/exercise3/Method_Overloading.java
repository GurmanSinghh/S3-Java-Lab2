package exercise3;

public class Method_Overloading {
	 private static int num1,num2,num3;
	    
	    public static void setNum(int a){
	        num1 = a;
	        num2 =0;
	        num3 =0;
	   }
	    
	    public static void setNum(int a,int b){
	        num1 =a;
	        num2 =b;
	        num3 =0;
	    }
	    
	    public static void setNum(int a,int b,int c){
	        num1 =a;
	        num2 =b;
	        num3 =c;
	    }
	    
	    public static void showVal(){
	        System.out.println(" Number 1 : "+num1);
	        System.out.println(" Number 2 : "+num2);
	        System.out.println(" Number 3 : "+num3);
	        System.out.println("------------------------");
	    }
	    
	    public static void main(String[] args) {
	    	Method_Overloading.setNum(3);
	        Method_Overloading.showVal();
	        Method_Overloading.setNum(69,22);
	        Method_Overloading.showVal();
	        Method_Overloading.setNum(15,30,45);
	        Method_Overloading.showVal();
	    }

	
}

