import java.util.Arrays;
/**
 * 三种具体的策略类
 * @author XZP
 *
 */
class Upcase extends Processor { // 策略A
	public String process(Object input) {
		return ((String)input).toUpperCase();
	}
}
class Downcase extends Processor { // 策略B
	public String process(Object input) {
		return ((String)input).toLowerCase();
	}
}
class Splitter extends Processor { // 策略C
	public String process(Object input) {
		return Arrays.toString(((String)input).split(" "));
	}
}
// 更多策略...