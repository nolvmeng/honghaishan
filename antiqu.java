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
	 //����ѡ�־�Ϊͬ��
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
		
/*		double gai_4_1 = (shuzu(0,4)*shuzu(3,13))/shuzu(3,17);
		double gai_4_2 = (shuzu(0,5)*shuzu(3,12))/shuzu(3,17);
		System.out.println(gai_4_1*3 + gai_4_2);
		*/
		
		//�ܸ�����֤
		double gailv = gai1 + gai2 + gai2 ;
		System.out.println("�ܸ�����֤(����double�������ͣ������쳣):"+gailv);
		
		
		
		
		
		
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
