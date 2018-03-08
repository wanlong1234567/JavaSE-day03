package day03;

import java.util.ArrayList;
import java.util.Collection;

/**
 * java.util.Collection
 * ���Ͽ��
 * ���������洢һ��Ԫ�أ������鹦�����ơ�
 * �����ṩ��һ�ױ��ڲ���Ԫ�صķ���������ʹ������
 * �����鷽�㡣
 * Collection�����м��ϵĶ����ӿڣ����������м���
 * ��Ӧ���߱��ķ�����
 * �����������������ӽӿ�:
 * java.util.List:���ظ������������ص��ǿ���
 * ͨ���±����Ԫ�ء�
 * 
 * java.util.Set:�����ظ���
 * Ԫ���Ƿ��ظ��Ǹ���Ԫ������equals�ȽϵĽ���ж�
 * 
 * @author adminitartor
 *
 */
public class CollectionDemo1 {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		/*
		 * boolean add(E e)
		 * ������Ԫ����ӵ���ǰ�����С���ӳɹ�
		 * �򷵻�true
		 */
		c.add("one");
		c.add("two");
		c.add("three");
		System.out.println(c);
		
		/*
		 * int size()
		 * ���ص�ǰ���ϵ�Ԫ�ظ���
		 */
		int size = c.size();
		System.out.println("size:"+size);
		/*
		 * boolean isEmpty()
		 * �жϵ�ǰ�����Ƿ�Ϊ�ռ�����:�������κ�
		 * Ԫ�ء�
		 */
		boolean isEmpty = c.isEmpty();
		System.out.println("isEmpty:"+isEmpty);
		
		/*
		 * void clear()
		 * ��յ�ǰ����
		 */
		c.clear();
		System.out.println("���������!");
		
		System.out.println(c);
		System.out.println("size:"+c.size());
		System.out.println("isEmpty:"+c.isEmpty());
	}
}









	
