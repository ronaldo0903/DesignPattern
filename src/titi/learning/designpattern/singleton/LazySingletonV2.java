package titi.learning.designpattern.singleton;

/*
 * ����ģʽ����ʽV2
 * �ŵ�:ʹ�þ�̬�ڲ�����Ʊ�֤��instanceֻ�ڵ�һ��getInstance()����������ʱ������һ�Σ����ұ����˶��̵߳Ĳ�����ͻ
 * ����:�ڷ���������£������ᱻ�ƻ� 
 */
public class LazySingletonV2 {
	private LazySingletonV2() {}
	static class SingletonHolder {
		private static final LazySingletonV2 instance = new LazySingletonV2();
	}
	public static LazySingletonV2 getInstance() {
		return SingletonHolder.instance;
	}
}
