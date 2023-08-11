class A{
public static void main(String arg[]){
int i1=10;
int i2=i1;
System.out.println(i2);
/// ABOVE CASE SAME TYPE OF DATA TYPE.

byte b1=20;
int i3=b1;
System.out.println(i3);
byte b2=30;
short s1=b2;
System.out.println(s1);
byte b3=40;
long l1=b3;
System.out.println(l1);
//// ABOVE CASE NO PROBLEM . IMPLICIT TYPE CASTING.   DESTINATION > SOURCE & SAME LITERAL.

int i4=50;
byte b4=(byte)i4;
System.out.println(b4);
short s2=60;
byte b5=(byte)s2;
System.out.println(b5);
long l2=70L;
// here "L" LIKHNA JARURI NAHI HAI.===========??????????? 
byte b6=(byte)l2;
System.out.println(b6);
////ABOVE CASE IS EXPLICIT TYPE CASTING. DESTINATION < SOURCE. 

final byte b7=80;
int i5=b7;
System.out.println(i5);
// ABOVE CASE NO NEED OF TYPE CASTNG (IMPLICIT TYPE) BY USE OF FINAL.


final int i6=90;
byte b8=i6;
System.out.println(b8);
final short s3=100;
byte b9= s3;
System.out.println(b9);
// ABOVE CASE NO NEED OF TYPE CASTING (EXPLICIT TYPE) BY USE OF FINAL.


final long l3=110L;
short s4=(short)l3;
System.out.println(s4);
long l4=120L;
float f1=l4;
System.out.println(f1);
// ABOVE CASE IS EXCEPTION.

float f2=130f;
long l5=(long)f2;
System.out.println(l5);
// Q= ??????????
}
}


