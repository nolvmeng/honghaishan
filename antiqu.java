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
 	/* //����ѡ�־�Ϊͬ��
		double gai_1_1 = (shuzu(3,4)*shuzu(0,13))/shuzu(3,17);
		double gai_1_2 = (shuzu(3,5)*shuzu(0,12))/shuzu(3,17);
		double gai1 = gai_1_1*3 + gai_1_2 ;
		System.out.println("����ѡ�־�Ϊͬ�����Ϊ�� "+gai1);
		
		
		//������ѡ����ͬһ��
		double gai_2_1 = (shuzu(2,4)*shuzu(1,13))/shuzu(3,17);
		double gai_2_2 = (shuzu(2,5)*shuzu(1,12))/shuzu(3,17);
		double gai2 = gai_2_1*3 + gai_2_2 ;
		System.out.println("������ѡ����ͬһ�����Ϊ�� "+gai2);
		//����ѡ�־�Ϊ��ͬ��
		double gai_3_1 = (shuzu(1,4)*shuzu(1,4)*shuzu(1,4))/shuzu(3,17);
		double gai_3_2 = (shuzu(1,4)*shuzu(1,4)*5*shuzu(2,3))/shuzu(3,17);
		double gai3 = gai_3_1+gai_3_2;
		System.out.println("����ѡ�־�Ϊ��ͬ�����Ϊ�� "+gai3);
		
	 
		
		
		//�ܸ�����֤
		double gailv = gai1 + gai2 + gai3 ;
		String banhu = "��";
		if(gailv != 1.0) banhu = "��";
		System.out.println("�ܸ�����֤(����double�������ͣ�����"+banhu+"��):"+gailv);

		System.out.println(shuzu(3,13));
		
		*/
		
		
/*		
		
		double gai_1_1 = (shuzu(4,4)*shuzu(1,13))/shuzu(5,17);
		double gai_1_2 = (shuzu(4,5)*shuzu(1,12))/shuzu(5,17);
		double gai1 = gai_1_1*3 + gai_1_2 ;
		System.out.println("4��ѡ��ͬ�����Ϊ�� "+gai1);
		
		double gai_0 =  shuzu(5,5) /shuzu(5,17);
		System.out.println("5��ѡ��ͬ�����Ϊ�� "+gai_0);
		
		double gai_2_1 = (shuzu(3,4)*shuzu(2,13))/shuzu(5,17);
		double gai_2_2 = (shuzu(3,5)*shuzu(2,12))/shuzu(5,17);
		double gai2 = gai_2_1*3 + gai_2_2 ;
		System.out.println("3��ѡ��ͬ�����Ϊ�� "+gai2);
		
		double gai_3_1 = (shuzu(2,4)*3*4*4*5+(shuzu(2,5)*4*4*4))/shuzu(5,17);
		double gai_3_2 = (shuzu(2,3)*shuzu(2,4)*shuzu(2,4)*9+(shuzu(2,5)*shuzu(2,4))*3*8)/shuzu(5,17);
		double gai3 = gai_3_1 + gai_3_2  ;
		System.out.println("��2��ѡ��ͬ�飨��3��ͬ�飩����Ϊ�� " +gai3);
		
		
		//�ܸ�����֤
				double gailv = gai1 + gai2 + gai3 + gai_0 ;
				String banhu = "��";
				if(gailv != 1.0) banhu = "��";
				System.out.println("�ܸ�����֤(����double�������ͣ�����"+banhu+"��):"+gailv);
		*/
		
		
		
	 double zo = shuzu(7,49);//���¼���
	 double ga =0.0 ;

	 //5����Ա����ͬһ��
	 	double gai_10_1 = (shuzu(5,5) * shuzu(2,44));
	 	double gai10 =  gai_10_1/ zo;
		System.out.println("5����Ա����ͬһ�飺 "+gai10);
		ga =ga +gai_10_1;
		
	 //4����Ա����ͬһ�飬������Ϊ  shuzu(1,11)*shuzu(4,4)*shuzu(3,45)+(shuzu(4,5)*shuzu(3,44));
		double gai_20_10 = shuzu(1,11)*shuzu(4,4)*shuzu(3,10)*shuzu(1,4)*shuzu(1,4)*shuzu(1,4);//ʣ��ľ�Ϊ��ͬ�飺4
		double gai_20_11 = shuzu(1,11)*shuzu(4,4)*shuzu(1,10)*shuzu(1,4)*shuzu(1,9)*shuzu(2,4);//ʣ�����2��ͬ�飺3
		double gai_20_15 = shuzu(1,11)*shuzu(4,4)*shuzu(2,10)*shuzu(1,4)*shuzu(1,4)*shuzu(1,5);//ʣ��ľ�Ϊ��ͬ������һ������C�飺4
		double gai_20_12 = shuzu(1,11)*shuzu(4,4)*shuzu(1,10)*shuzu(1,4)*shuzu(2,5);//ʣ�����2��ͬ������C�飺3
		double gai_20_13 = shuzu(1,11)*shuzu(4,4)*11*shuzu(3,4);//��2
		double gai_20_14 = shuzu(1,11)*shuzu(4,4)*shuzu(3,5);//���������C�飺2
		double gai_20_3 =  (shuzu(4,5)*shuzu(3,44)); //����C��
		double gai20 = (gai_20_10+gai_20_11+gai_20_12+gai_20_13+gai_20_14+gai_20_15+gai_20_3)/zo;
		System.out.println("4����Ա����ͬһ�飺 "+gai20);
		ga =ga +(gai_20_10+gai_20_11+gai_20_12+gai_20_13+gai_20_14+gai_20_3);
		
	//����һ��3����Ա����ͬ�� 
			
			//�����Ϊ��ͬ��
			double gai_30_1 = 11*shuzu(3,4)*shuzu(4,10)*4*4*4*4 ;//�������Է�C�飬5
			double gai_30_2 = 11*shuzu(3,4)*shuzu(3,10)*4*4*4*5;//����һԱ����C�飬5
			double gai_30_3 = shuzu(3,5)*shuzu(4,11)*4*4*4*4;//����C�飬5
			double gai30 =( gai_30_1 + gai_30_2 + gai_30_3 )/zo;
			System.out.println("����һ��3����Ա����ͬ��"+"\n"+"�����Ϊ��ͬ�飺 "+gai30);
			ga = ga+( gai_30_1 + gai_30_2 +gai_30_3 );
			
			
			//�������һ��2����Ա����ͬ��
			double gai_31_1 = 11*shuzu(3,4)*10*shuzu(2,4)*shuzu(2,9)*4*4; //�����ڷ�C�飬4
			double gai_31_2 = 11*shuzu(3,4)*(shuzu(2,10)*4*4*shuzu(2,5) );//һ��˫������C�� ��4
			double gai_31_3 = 11*shuzu(3,4)*(10*shuzu(2,4)*9*4*5);//����һԱ����C�飬4
			double gai_31_4 = shuzu(3,5)*11*shuzu(2,4)*shuzu(2,10)*4*4;//3��ͬ�������C�飬4
			double gai31  =  (gai_31_1+gai_31_2+gai_31_3+gai_31_4)/zo;
			System.out.println("�������һ��2����Ա����ͬ�飺 "+gai31);
			ga =ga +( gai_31_1 + gai_31_2+gai_31_3+gai_31_4 );
	 
			
			//�����������2����Ա����ͬ��
			double gai_32_1 = 11*shuzu(3,4)*shuzu(2,10)*shuzu(2,4)*shuzu(2,4) ; //�����ڷ�C�飬3
			double gai_32_2 = 11*shuzu(3,4)*(shuzu(1,10)*shuzu(2,4)*shuzu(2,5) );//����һ��˫������C�� ��3
			double gai_32_3 = shuzu(3,5)*shuzu(2,11)*shuzu(2,4)*shuzu(2,4);//����ͬ������C�飬3
			double gai32  =  (gai_32_1+gai_32_2+gai_32_3)/zo;
			System.out.println("�����������2����Ա����ͬ�飺 "+gai32+"\n");
			ga = ga+( gai_32_1 + gai_32_2+gai_32_3 );

	//����2��3����Ա����ͬ��		
			double gai33_1 = shuzu(2,11)*shuzu(3,4)*shuzu(3,4)*36 ;//��C�飬3
			double gai33_2 = shuzu(2,11)*shuzu(3,4)*shuzu(3,4)*5 ;//ʣ��һ������C�飬3
			double gai33_3 = 11*shuzu(3,4)*shuzu(3,5)*40 ;//����һ������C�飬3
			double gai33  = (gai33_1+gai33_2+gai33_3)/zo;
			System.out.println("����2��3����Ա����ͬ�飺 "+gai33);
			ga =ga +( gai33_1 + gai33_2 + gai33_3);

			
	//2����Ա����ͬ�飨��5��4��3��ͬ�飩
		
			//��һ��2����Ա����ͬ��
			double gai41_1 = 11*shuzu(2,4)*shuzu(5,10)*4*4*4*4*4;//��C�飬6
			double gai41_2 = 11*shuzu(2,4)*shuzu(4,10)*4*4*4*4*5;//ʣ�������һԱ����C�飬6
			double gai41_3 = shuzu(2,5)*shuzu(5,11)*4*4*4*4*4;//ͬ�������C�飬6
			double gai41 = (gai41_1+gai41_2+gai41_3)/zo;
			System.out.println("\n 2����Ա����ͬ�飺"+"\n"+"��һ��2����Ա����ͬ��"  +gai41);
			ga = ga+( gai41_1 + gai41_2 +gai41_3);

			
			//����2��2������ͬ���
			double gai51_1 = shuzu(2,11)*shuzu(2,4)*shuzu(2,4)*shuzu(3,9)*4*4*4;//��c�飬5
			double gai51_2 = shuzu(2,11)*shuzu(2,4)*shuzu(2,4)*+shuzu(2,9)*4*4*5;//ʣ�������һԱ����C�飬5
			double gai51_3 = shuzu(2,5)*11*shuzu(2,4)*shuzu(3,10)*4*4*4;//ͬ�������һ������C�飬5
			double gai51 = (gai51_1+gai51_2+gai51_3)/zo;
			System.out.println("����2��2����Ա����ͬ��"   +gai51);
			ga = ga+( gai51_1 + gai51_2 +gai51_3);
			
			//����3��2������ͬ��
			double gai61_1 = shuzu(3,11)*shuzu(2,4)*shuzu(2,4)*shuzu(2,4)*32;//��C�飬4
			double gai61_2 = shuzu(3,11)*shuzu(2,4)*shuzu(2,4)*shuzu(2,4)*5;//ʣ���һԱ����C�飬4
			double gai61_3 = shuzu(2,11)*shuzu(2,4)*shuzu(2,4)*shuzu(2,5)*36;//ͬ�������һ������C�飬4
			double gai61 = (gai61_1+gai61_2+gai61_3)/zo;
			System.out.println("����3��2����Ա����ͬ��" +gai61);
			ga =ga +( gai61_1 + gai61_2 +gai61_3);
			
	//ÿ����Ա�����Բ�ͬ���
			double gai7_1 = shuzu(7,11)*4*4*4*4*4*4*4;//��C�飬7
			double gai7_2 = shuzu(6,11)*4*4*4*4*4*4*5;//����һԱ����C�飬7
			double gai7  = (gai7_1+gai7_2)/zo;
			System.out.println("ÿ����Ա�����Բ�ͬ���" +gai7);
			ga =ga +( gai7_1 + gai7_2 );
			
			
			double cc = gai10 +gai20+gai30+gai31+gai32+gai33+gai41+gai51+gai61+gai7;
			System.out.println("\n\n���龫��"+  cc );
			System.out.println("\n���龫��,���¼���"+  zo );
			System.out.println("\n���龫�ȣ���ͳ���¼���"+  ga );
			
			
		}
	
	
	
	  

	//C b��Ԫ��ȡa��
public static double shuzu(double a,double b) {
	double result=velu(b)/(velu(b-a)*velu(a));
	return result;	
}
	//�ײ�˻��ݹ鷽��
private static double velu(double a) {
	if(a==0||a==1)return 1;
	else return a*velu(a-1);	
}
	//���и��ʻ�
private static double list_rate( int t) {
	double sor=4.0 ;
	double fuzhu=sor;
	  for(int c=0;c<t-1;c++){
		 
		sor*=4;
	  }
	  
	return sor;
}


}
