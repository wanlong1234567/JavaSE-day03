package day03;

import java.util.Date;

/**
 * java.util.Date
 * Date��ÿһ��ʵ�����ڱ�ʾһ��ʱ��㡣
 * ����Date�������ȱ�ݣ����Դ󲿷ֲ���ʱ��ķ�����
 * ������Ϊ��ʱ�ģ����ٽ���ʹ�á�
 * Date��ÿһ��ʵ���ڲ�ά����һ��longֵ����ֵ��ʾ
 * ������1970��1��1�� 00:00:00����ʵ����ʾ������
 * ֮���������ĺ��롣
 * @author adminitartor
 *
 */
public class DateDemo {
	public static void main(String[] args) {
		/*
		 * Ĭ�ϴ�����Date��ʾ��ǰϵͳʱ��
		 */
		Date date = new Date();
//		Date date = new Date(1000);
		System.out.println(date);
		
		//Date�󲿷ַ������ǹ�ʱ�ģ�����ʹ��
//		date.getYear();
		
		/*
		 * long getTime()
		 * ��ȡ��ǰDate�����ڲ�ά���ĺ���ֵ
		 */
		long time = date.getTime();
		System.out.println(time);
		long days = time/1000/60/60/24;
		System.out.println("��1970�굽���ھ�����"+days+"��");
		
		/*
		 * void setTime(long ms)
		 * ����һ��longֵ��ʹ�õ�ǰDate�����ʾ
		 * ������
		 */
		//��ʾ������һ�̵�ʱ��
		time+=1000*60*60*24;
		date.setTime(time);
		System.out.println(date);
		
	}
}








