package titi.learning.designpattern.singleton;

import java.lang.reflect.Constructor;

public class LazySingletonV2Test {

	public static void main(String[] args) {
		//������һ��ʵ��
		LazySingletonV2 instance1 = LazySingletonV2.getInstance();
        //ͨ�����䴴���ڶ���ʵ��
		LazySingletonV2 instance2 = null;
        try {
            Class<LazySingletonV2> clazz = LazySingletonV2.class;
            Constructor<LazySingletonV2> cons = clazz.getDeclaredConstructor();
            cons.setAccessible(true);
            instance2 = cons.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        //�������ʵ����hashֵ
        System.out.println("Instance 1 hash:" + instance1.hashCode());
        System.out.println("Instance 2 hash:" + instance2.hashCode());
	}

}
