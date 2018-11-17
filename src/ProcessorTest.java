/**
 * ����ģʽ�Ĳ�����
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
		 * Strategy Pattern����ʲô����ô�ɷ��뿪������Ҳ���������������ӿ�����е�һ���ܺ��ĵ�˼�롪��һ����Ӧ�ð�������ʲô�����Լ�������ʲô��������
		 */
		process(new Upcase(), s);
		process(new Downcase(), s);
		process(new Splitter(), s);
	}
}