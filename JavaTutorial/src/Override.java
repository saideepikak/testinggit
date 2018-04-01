
public class Override {
	public static void main(String args[]){
		//Hi ob=new Hi();
		Hello ob1=new Hello();
		//ob.show(2, 3);
		ob1.show(5, 6);
		
	}

}
class Hi{
	void show(int a,int b){
		System.out.println(a*b);
	}
}
class Hello extends Hi{
	void show(int a,int b){
		//super.show(a, b);
		System.out.println(a+b);
	}
}
