
public class ThreadDemo {
	public static void main(String args[]){
		Thread t=Thread.currentThread();
		System.out.println("Current thread:"+t);
		t.setName("Mythread");
		System.out.println("After name chang:"+t);
		try{
			for(int n=5;n>0;n--){
				System.out.println(n);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e){
			System.out.println("Main thread Interrupted");
		}
	}

}
