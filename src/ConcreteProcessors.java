import java.util.Arrays;
/**
 * ���־���Ĳ�����
 * @author XZP
 *
 */
class Upcase extends Processor { // ����A
	public String process(Object input) {
		return ((String)input).toUpperCase();
	}
}
class Downcase extends Processor { // ����B
	public String process(Object input) {
		return ((String)input).toLowerCase();
	}
}
class Splitter extends Processor { // ����C
	public String process(Object input) {
		return Arrays.toString(((String)input).split(" "));
	}
}
// �������...