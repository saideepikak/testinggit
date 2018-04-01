public class MethodOver{
	public static void main(String args[]){
		Add me=new Add();
		me.sum(10,29);
		me.sum(1,2,3);
		me.sum(1.23,42.4,4.56);		
	}
}
class Add{
	void sum(int a,int b){
		System.out.println(a+b);
	}
	int sum(int a,int b,int c){
		System.out.println(a+b+c);
		return a+b+c;
	}
	void sum(double a,double b,double c){
		System.out.println(a+b+c);
	}
	
}

/**
 * After creating object,if we overload it is runtime polymorphism..
 */
