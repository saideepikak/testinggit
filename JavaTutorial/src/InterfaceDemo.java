
public class InterfaceDemo {
	public static void main(String args[]){
		Aa b=new Aa();
		b.show();
	}

}
interface InterfceE{
	void show();
	void print();

}

class Aa implements InterfceE{
	public void show(){
		System.out.println("class Aa");
	}
	public void print(){
		System.out.println("class Aa hai");
	}
	
}
abstract class Bb implements InterfceE{
	public void show() {
		System.out.println("class Aa");
	}
}
class Cc extends Bb{
	public void print() {
		System.out.println();
		System.err.println("hi");
		
	}
	
}
