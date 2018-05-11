package titi.learning.designpattern.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class SingletonSerizableTest {

	public static void main(String[] args) {
		try {
            LazySingletonV3 instance1 = LazySingletonV3.getInstance();
            ObjectOutput out = null;
            out = new ObjectOutputStream(new FileOutputStream("filename.ser"));
            out.writeObject(instance1);
            out.close();
            //deserialize from file to object
            ObjectInput in = new ObjectInputStream(new FileInputStream("filename.ser"));
            LazySingletonV3 instance2 = (LazySingletonV3) in.readObject();
            in.close();
            System.out.println("instance1 hashCode=" + instance1.hashCode());
            System.out.println("instance2 hashCode=" + instance2.hashCode());
        } catch (Exception e) {
            e.printStackTrace();
        }

	}

}
