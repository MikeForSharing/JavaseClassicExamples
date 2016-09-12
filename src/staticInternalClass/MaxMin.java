package staticInternalClass;

public class MaxMin {
	public static class Result {
		private double Max;
		private double Min;
		
		public Result(double Max, double Min) {
			this.Max = Max;
			this.Min = Min;
		}

		public double getMax() {
			return Max;
		}

		public void setMax(double max) {
			Max = max;
		}

		public double getMin() {
			return Min;
		}

		public void setMin(double min) {
			Min = min;
		}
	}
	
	
	public static Result getResult(double[] array) {
		double Max = Double.MIN_VALUE;
		double Min = Double.MAX_VALUE;
		for(double i: array) {
			if(i > Max) {
				Max = i;
			} if(i < Min) {
				Min = i;
			}
		}
		
		return new Result(Max, Min);
	}
}
