public class NumberUtils {
	
	// функция проверяет, является ли переданное число четным или нечетным
	public boolean evenOddNumber(int n) {
		if (n % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	// функция проверяет, попадает ли переданное число в интервал (25; 100)
	public boolean numberInInterval(int n) {
    return n > 25 && n < 100;
  }
}