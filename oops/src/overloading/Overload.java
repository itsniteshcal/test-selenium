package overloading;

public class Overload {
	Overload(){
		System.out.println("non-argument");
	}
	Overload(int arg){
		System.out.println("int-argument");
	}
	Overload(double arg1){
		System.out.println("double-argument");
	}
	Overload(int arg1,double arg2){
		System.out.println("double,int");
	}

}
