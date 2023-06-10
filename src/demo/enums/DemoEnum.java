package demo.enums;

public class DemoEnum {

	public enum Size {
		SMALL(10), MEDIUM(20), LARGE(30);

		private int value;

		private Size(int value) {
			this.value = value;
		}

		public int getValue() {
			return value;
		}
	}

	public enum Color {
		RED("Red color"), BLUE("This blue color"), GREEN("green color"), YELLOW("yellow color");

		private String string;

		Color(String string) {
			this.string = string;
		}

		public String value() {
			return string;
		}
	}

	public static void main(String[] args) {

		System.out.println(Size.SMALL.getValue());
		System.out.println(Color.BLUE.value());

	}

}
