/**
 * @author Ahmad Arsalan
 * Project Name: Economic Policy
 */
import java.util.Scanner;

public class EconomicPolicy {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			double growthRate, inflationRate;
			System.out.print("Enter the current Growth rate: ");
			growthRate = in.nextDouble();
			System.out.print("Enter the current Inflation rate: ");
			inflationRate = in.nextDouble();
			if (growthRate < 1) {
				if (inflationRate < 3) {
					System.out.print("Increase welfare spending, reduce personal taxes, and decrease discount rate.\n");
				} else {
					System.out.print("Reduce business taxes.\n");
				}
			} else if (growthRate > 4) {
				if (inflationRate < 1) {
					System.out.print("Increase pesonal and business taxes, and decrease discount rate.\n");
				} else if (inflationRate > 3) {
					System.out.print("Increase discount rate.\n");
				} else {
					System.out.print("No change in economic policy.\n");
				}

			} else {
				System.out.print("No change in economic policy.\n");
			}

		}

	}

}
