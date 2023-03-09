package Types;

public class Results {
	public static void main(String[] args) {

		int pScore = 85;
		int cScore = 100;
		int bScore = 125;
		int resultTotal = (pScore + cScore + bScore);
		double percentage = (((resultTotal) * 100) / 450);

		System.out.println(resultTotal);
		System.out.println(percentage);
	}
}
