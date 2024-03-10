import java.lang.*;
class Conversion {

	byte b;
	int i = 10;
	double d= 21244456.78899;

	System.out.println("// conversion of int to byte");
	b=(byte) i;
	System.out.println("i and b "+i+" "+b);

	System.out.println("// conversion of double to byte");
	b=(byte) d;
	System.out.println("d and b "+d+" "+b);

}