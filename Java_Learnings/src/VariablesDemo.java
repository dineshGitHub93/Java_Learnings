
public class VariablesDemo {
	
	// Instance variable or object variable
	
	// public access modifier datatype variable_name = Value;
	
	public int number = 10;
	//static variable 
	public static int num = 15;
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Instance variable call
		VariablesDemo obj= new VariablesDemo();
		System.out.println(obj.number);
		obj.number=20;
		System.out.println(obj.number);
		
		
		VariablesDemo obj1 = new VariablesDemo();
		System.out.println(obj1.number);
		
		System.out.println(obj.number);
		
		obj1.number=50;
		
		System.out.println(obj1.number);
		VariablesDemo obj3 = new VariablesDemo();
		System.out.println(obj3.number);
		
		num= 30;
		num= 40 ;
		
		System.out.println(num);
		
		//Static call
		System.out.println(num);
		VariablesDemo.num=30;
		System.out.println(VariablesDemo.num);
		
		
		int b= 10;
		System.out.println(b);
		
			
		
		for(int i=0; i<5;i++) {
			int a =5;
			System.out.println(a+i);
			System.out.println(b);
		}
		//System.out.println(a);

	}
	

}
