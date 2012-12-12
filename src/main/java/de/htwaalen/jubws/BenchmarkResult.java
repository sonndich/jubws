package de.htwaalen.jubws;

import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;


public class BenchmarkResult {

	private String className;
	private Calendar date;
	private List<BenchmarkMethod> methods;

	
	static class BenchmarkMethod {
		
		private String methodName;
		private double roundAvg;
		private double roundStddev;

		private int gcInvocations;
		private double gcTime;

		private int benchmarkRounds;
		private int warmupRounds;
		private long warmupTime;
		private long benchmarkTime;
		
		public BenchmarkMethod() {
		}

		public String getMethodName() {
			return methodName;
		}

		public void setMethodName(String methodName) {
			this.methodName = methodName;
		}

		public double getRoundAvg() {
			return roundAvg;
		}

		public void setRoundAvg(double roundAvg) {
			this.roundAvg = roundAvg;
		}

		public double getRoundStddev() {
			return roundStddev;
		}

		public void setRoundStddev(double roundStddev) {
			this.roundStddev = roundStddev;
		}

		public int getGcInvocations() {
			return gcInvocations;
		}

		public void setGcInvocations(int gcInvocations) {
			this.gcInvocations = gcInvocations;
		}

		public double getGcTime() {
			return gcTime;
		}

		public void setGcTime(double gcTime) {
			this.gcTime = gcTime;
		}

		public int getBenchmarkRounds() {
			return benchmarkRounds;
		}

		public void setBenchmarkRounds(int benchmarkRounds) {
			this.benchmarkRounds = benchmarkRounds;
		}

		public int getWarmupRounds() {
			return warmupRounds;
		}

		public void setWarmupRounds(int warmupRounds) {
			this.warmupRounds = warmupRounds;
		}

		public long getWarmupTime() {
			return warmupTime;
		}

		public void setWarmupTime(long warmupTime) {
			this.warmupTime = warmupTime;
		}

		public long getBenchmarkTime() {
			return benchmarkTime;
		}

		public void setBenchmarkTime(long benchmarkTime) {
			this.benchmarkTime = benchmarkTime;
		}
		
		
		
	}

	public BenchmarkResult() {
		methods = new LinkedList<>();
	}
	
	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public Calendar getDate() {
		return date;
	}

	public void setDate(Calendar date) {
		this.date = date;
	}

	public List<BenchmarkMethod> getMethods() {
		return methods;
	}

	public void setMethods(List<BenchmarkMethod> methods) {
		this.methods = methods;
	}

	


}
