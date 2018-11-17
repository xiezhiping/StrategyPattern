/**
 * 策略模式的测试类
 * @author XZP
 *
 */
public class ProcessorTest {
	public static void process(Processor p, Object s) {
		System.out.println("Using Processor:" + p.name());
		System.out.println(p.process(s));
	}
	public static String s = "Hello World";
	public static void main(String [] args) {
		/**
		 * Strategy Pattern将干什么和怎么干分离开来，这也是面向对象编程类与接口设计中的一个很核心的思想——一个类应该包含它有什么属性以及它能做什么（方法）
		 */
		process(new Upcase(), s);
		process(new Downcase(), s);
		process(new Splitter(), s);
	}
}