package day03;

import java.util.ArrayList;
import java.util.Collection;

import day02.Point;

/**
 * boolean contains(E e)
 * �жϵ�ǰ�����Ƿ��������Ԫ��
 * @author adminitartor
 *
 */
public class Collection_contains {
	public static void main(String[] args) {
		Collection c = new ArrayList();		
		c.add(new Point(1,2));
		c.add(new Point(3,4));
		c.add(new Point(5,6));		
		System.out.println(c);
		
		Point p = new Point(1,2);
//		c.add(p);
		/*
		 * �������жϸ���Ԫ���Ƿ񱻼��ϰ���ʱ����
		 * ��������Ԫ��equals�ȽϵĽ������:ֻҪ
		 * ����Ԫ���뼯������Ԫ����equals�Ƚ�Ϊ
		 * true��ʱ�򣬼��Ͼ���Ϊ������Ԫ�ء�
		 */
		boolean contains = c.contains(p);
		System.out.println("�Ƿ����:"+contains);
	}
}











