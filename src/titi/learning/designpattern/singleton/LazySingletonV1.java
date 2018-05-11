package titi.learning.designpattern.singleton;

/*
 * ����ģʽ����ʽV1
 * ʹ����synchronized���η��������Ӱ��������
 */
public class LazySingletonV1 {
	private static LazySingletonV1 instance;
	private LazySingletonV1(){}
	public static LazySingletonV1 getInstance() {
		if(instance == null) {
			synchronized(LazySingletonV1.class) {
				if(instance == null) {
					instance = new LazySingletonV1();
				}
			}
		}
		return instance;
	}
}
