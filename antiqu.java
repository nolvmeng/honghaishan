package test;

public class antiqu {

	public static void main(String[] args) {
	 /*	
	 double a = 3;
	 double b = 4;
	 double c = 3;
	 double d = 10;
	 
		    double ab = shuzu(a,b);
 	 		double cd = shuzu(c,d);
	  		System.out.println(ab);
	  		System.out.println(cd);
	  */
 	/* //三名选手均为同组
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
		
	 
		
		
		//总概率验证
		double gailv = gai1 + gai2 + gai3 ;
		String banhu = "正";
		if(gailv != 1.0) banhu = "异";
		System.out.println("总概率验证(采用double数据类型，精度"+banhu+"常):"+gailv);

		System.out.println(shuzu(3,13));
		
		*/
		
		
/*		
		
		double gai_1_1 = (shuzu(4,4)*shuzu(1,13))/shuzu(5,17);
		double gai_1_2 = (shuzu(4,5)*shuzu(1,12))/shuzu(5,17);
		double gai1 = gai_1_1*3 + gai_1_2 ;
		System.out.println("4名选手同组概率为： "+gai1);
		
		double gai_0 =  shuzu(5,5) /shuzu(5,17);
		System.out.println("5名选手同组概率为： "+gai_0);
		
		double gai_2_1 = (shuzu(3,4)*shuzu(2,13))/shuzu(5,17);
		double gai_2_2 = (shuzu(3,5)*shuzu(2,12))/shuzu(5,17);
		double gai2 = gai_2_1*3 + gai_2_2 ;
		System.out.println("3名选手同组概率为： "+gai2);
		
		double gai_3_1 = (shuzu(2,4)*3*4*4*5+(shuzu(2,5)*4*4*4))/shuzu(5,17);
		double gai_3_2 = (shuzu(2,3)*shuzu(2,4)*shuzu(2,4)*9+(shuzu(2,5)*shuzu(2,4))*3*8)/shuzu(5,17);
		double gai3 = gai_3_1 + gai_3_2  ;
		System.out.println("有2名选手同组（无3人同组）概率为： " +gai3);
		
		
		//总概率验证
				double gailv = gai1 + gai2 + gai3 + gai_0 ;
				String banhu = "正";
				if(gailv != 1.0) banhu = "异";
				System.out.println("总概率验证(采用double数据类型，精度"+banhu+"常):"+gailv);
		*/
		
		
		
	 double zo = shuzu(7,49);//总事件数
	 double ga =0.0 ;

	 //5名队员来自同一组
	 	double gai_10_1 = (shuzu(5,5) * shuzu(2,44));
	 	double gai10 =  gai_10_1/ zo;
		System.out.println("5名队员来自同一组： "+gai10);
		ga =ga +gai_10_1;
		
	 //4名队员来自同一组，概率总为  shuzu(1,11)*shuzu(4,4)*shuzu(3,45)+(shuzu(4,5)*shuzu(3,44));
		double gai_20_10 = shuzu(1,11)*shuzu(4,4)*shuzu(3,10)*shuzu(1,4)*shuzu(1,4)*shuzu(1,4);//剩余的均为不同组：4
		double gai_20_11 = shuzu(1,11)*shuzu(4,4)*shuzu(1,10)*shuzu(1,4)*shuzu(1,9)*shuzu(2,4);//剩余存在2名同组：3
		double gai_20_15 = shuzu(1,11)*shuzu(4,4)*shuzu(2,10)*shuzu(1,4)*shuzu(1,4)*shuzu(1,5);//剩余的均为不同组其中一组来自C组：4
		double gai_20_12 = shuzu(1,11)*shuzu(4,4)*shuzu(1,10)*shuzu(1,4)*shuzu(2,5);//剩余存在2名同组来自C组：3
		double gai_20_13 = shuzu(1,11)*shuzu(4,4)*11*shuzu(3,4);//：2
		double gai_20_14 = shuzu(1,11)*shuzu(4,4)*shuzu(3,5);//其余均来自C组：2
		double gai_20_3 =  (shuzu(4,5)*shuzu(3,44)); //来自C组
		double gai20 = (gai_20_10+gai_20_11+gai_20_12+gai_20_13+gai_20_14+gai_20_15+gai_20_3)/zo;
		System.out.println("4名队员来自同一组： "+gai20);
		ga =ga +(gai_20_10+gai_20_11+gai_20_12+gai_20_13+gai_20_14+gai_20_3);
		
	//仅有一个3名队员来自同组 
			
			//其余均为不同组
			double gai_30_1 = 11*shuzu(3,4)*shuzu(4,10)*4*4*4*4 ;//其余来自非C组，5
			double gai_30_2 = 11*shuzu(3,4)*shuzu(3,10)*4*4*4*5;//其中一员来自C组，5
			double gai_30_3 = shuzu(3,5)*shuzu(4,11)*4*4*4*4;//来自C组，5
			double gai30 =( gai_30_1 + gai_30_2 + gai_30_3 )/zo;
			System.out.println("仅有一个3名队员来自同组"+"\n"+"其余均为不同组： "+gai30);
			ga = ga+( gai_30_1 + gai_30_2 +gai_30_3 );
			
			
			//其余存在一个2名队员来自同组
			double gai_31_1 = 11*shuzu(3,4)*10*shuzu(2,4)*shuzu(2,9)*4*4; //来自于非C组，4
			double gai_31_2 = 11*shuzu(3,4)*(shuzu(2,10)*4*4*shuzu(2,5) );//一组双人来自C组 ，4
			double gai_31_3 = 11*shuzu(3,4)*(10*shuzu(2,4)*9*4*5);//其中一员来自C组，4
			double gai_31_4 = shuzu(3,5)*11*shuzu(2,4)*shuzu(2,10)*4*4;//3名同组的来自C组，4
			double gai31  =  (gai_31_1+gai_31_2+gai_31_3+gai_31_4)/zo;
			System.out.println("其余存在一个2名队员来自同组： "+gai31);
			ga =ga +( gai_31_1 + gai_31_2+gai_31_3+gai_31_4 );
	 
			
			//其余存在两个2名队员来自同组
			double gai_32_1 = 11*shuzu(3,4)*shuzu(2,10)*shuzu(2,4)*shuzu(2,4) ; //来自于非C组，3
			double gai_32_2 = 11*shuzu(3,4)*(shuzu(1,10)*shuzu(2,4)*shuzu(2,5) );//其余一组双人来自C组 ，3
			double gai_32_3 = shuzu(3,5)*shuzu(2,11)*shuzu(2,4)*shuzu(2,4);//三名同组来自C组，3
			double gai32  =  (gai_32_1+gai_32_2+gai_32_3)/zo;
			System.out.println("其余存在两个2名队员来自同组： "+gai32+"\n");
			ga = ga+( gai_32_1 + gai_32_2+gai_32_3 );

	//存在2个3名队员来自同组		
			double gai33_1 = shuzu(2,11)*shuzu(3,4)*shuzu(3,4)*36 ;//非C组，3
			double gai33_2 = shuzu(2,11)*shuzu(3,4)*shuzu(3,4)*5 ;//剩余一名来自C组，3
			double gai33_3 = 11*shuzu(3,4)*shuzu(3,5)*40 ;//其中一组来自C组，3
			double gai33  = (gai33_1+gai33_2+gai33_3)/zo;
			System.out.println("存在2个3名队员来自同组： "+gai33);
			ga =ga +( gai33_1 + gai33_2 + gai33_3);

			
	//2名队员来自同组（无5，4，3名同组）
		
			//仅一个2名队员来自同组
			double gai41_1 = 11*shuzu(2,4)*shuzu(5,10)*4*4*4*4*4;//非C组，6
			double gai41_2 = 11*shuzu(2,4)*shuzu(4,10)*4*4*4*4*5;//剩余的其中一员来自C组，6
			double gai41_3 = shuzu(2,5)*shuzu(5,11)*4*4*4*4*4;//同组的来自C组，6
			double gai41 = (gai41_1+gai41_2+gai41_3)/zo;
			System.out.println("\n 2名队员来自同组："+"\n"+"仅一个2名队员来自同组"  +gai41);
			ga = ga+( gai41_1 + gai41_2 +gai41_3);

			
			//存在2个2人来自同组的
			double gai51_1 = shuzu(2,11)*shuzu(2,4)*shuzu(2,4)*shuzu(3,9)*4*4*4;//非c组，5
			double gai51_2 = shuzu(2,11)*shuzu(2,4)*shuzu(2,4)*+shuzu(2,9)*4*4*5;//剩余的其中一员来自C组，5
			double gai51_3 = shuzu(2,5)*11*shuzu(2,4)*shuzu(3,10)*4*4*4;//同组的其中一组来自C组，5
			double gai51 = (gai51_1+gai51_2+gai51_3)/zo;
			System.out.println("存在2个2名队员来自同组"   +gai51);
			ga = ga+( gai51_1 + gai51_2 +gai51_3);
			
			//存在3个2人来自同组
			double gai61_1 = shuzu(3,11)*shuzu(2,4)*shuzu(2,4)*shuzu(2,4)*32;//非C组，4
			double gai61_2 = shuzu(3,11)*shuzu(2,4)*shuzu(2,4)*shuzu(2,4)*5;//剩余的一员来自C组，4
			double gai61_3 = shuzu(2,11)*shuzu(2,4)*shuzu(2,4)*shuzu(2,5)*36;//同组的其中一组来自C组，4
			double gai61 = (gai61_1+gai61_2+gai61_3)/zo;
			System.out.println("存在3个2名队员来自同组" +gai61);
			ga =ga +( gai61_1 + gai61_2 +gai61_3);
			
	//每名队员均来自不同组别
			double gai7_1 = shuzu(7,11)*4*4*4*4*4*4*4;//非C组，7
			double gai7_2 = shuzu(6,11)*4*4*4*4*4*4*5;//其中一员来自C组，7
			double gai7  = (gai7_1+gai7_2)/zo;
			System.out.println("每名队员均来自不同组别" +gai7);
			ga =ga +( gai7_1 + gai7_2 );
			
			
			double cc = gai10 +gai20+gai30+gai31+gai32+gai33+gai41+gai51+gai61+gai7;
			System.out.println("\n\n检验精度"+  cc );
			System.out.println("\n检验精度,总事件数"+  zo );
			System.out.println("\n检验精度，已统计事件数"+  ga );
			
			
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
