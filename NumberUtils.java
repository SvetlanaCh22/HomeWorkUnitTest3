public class NumberUtils {
	
	// ������� ���������, �������� �� ���������� ����� ������ ��� ��������
	public boolean evenOddNumber(int n) {
		if (n % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	// ������� ���������, �������� �� ���������� ����� � �������� (25; 100)
	public boolean numberInInterval(int n) {
    return n > 25 && n < 100;
  }
}