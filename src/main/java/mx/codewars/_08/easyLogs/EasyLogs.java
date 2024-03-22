package mx.codewars._08.easyLogs;

public class EasyLogs {
	public static double logs(double x, double a, double b) {
		return customLog(x, a) + customLog(x, b);
	}

	private static double customLog(double base, double logNumber) {
		return Math.log(logNumber) / Math.log(base);
	}
}
