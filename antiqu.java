package test;

public class antiqu {

	public static void main(String[] args) {
		
	 double a = 3;
	 double b = 4;
	 double c = 3;
	 double d = 10;
	 
	 /*	    double ab = shuzu(a,b);
 	 		double cd = shuzu(c,d);
	  		System.out.println(ab);
	  		System.out.println(cd);
	  */
	 //三名选手均为同组
		double gai_1_1 = (shuzu(3,4)*shuzu(0,13))/shuzu(3,17);
		double gai_1_2 = (shuzu(3,5)*shuzu(0,12))/shuzu(3,17);
		double gai1 = gai_1_1*3 + gai_1_2 ;
		System.out.println("三名选手均为同组概率为： "+gai1);
		
		
		//有两名选手在同一组
		double gai_2_1 = (shuzu(2,4)*shuzu(1,13))/shuzu(3,17);
		double gai_2_2 = (shuzu(2,5)*shuzu(1,12))/shuzu(3,17);
		double gai2 = gai_2_1*3 + gai_2_2 ;
		System.out.println("有两名选手在同一组概率为： "+gai2);
		//三名选手均为不同组
		double gai_3_1 = (shuzu(1,4)*shuzu(1,4)*shuzu(1,4))/shuzu(3,17);
		double gai_3_2 = (shuzu(1,4)*shuzu(1,4)*5*shuzu(2,3))/shuzu(3,17);
		double gai3 = gai_3_1+gai_3_2;
		System.out.println("三名选手均为不同组概率为： "+gai3);
		
/*		double gai_4_1 = (shuzu(0,4)*shuzu(3,13))/shuzu(3,17);
		double gai_4_2 = (shuzu(0,5)*shuzu(3,12))/shuzu(3,17);
		System.out.println(gai_4_1*3 + gai_4_2);
		*/
		
		//总概率验证
		double gailv = gai1 + gai2 + gai2 ;
		System.out.println("总概率验证(采用double数据类型，精度异常):"+gailv);
		
		
		
		
		
		
		}
	
	  

	//C b个元素取a组
public static double shuzu(double a,double b) {
	double result=velu(b)/(velu(b-a)*velu(a));
	return result;	
}
	//阶层乘积递归方法
private static double velu(double a) {
	if(a==0||a==1)return 1;
	else return a*velu(a-1);	
}
	//数列概率积
private static double list_rate( int t) {
	double sor=4.0 ;
	double fuzhu=sor;
	  for(int c=0;c<t-1;c++){
		 
		sor*=4;
	  }
	  
	return sor;
}


}
