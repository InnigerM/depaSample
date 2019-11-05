package patterns.clone.comparison;

public class CompareCopyStrategies {
	private static final int SIZE = 10000;
	private static final int NOFCLONES = 1000;

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		double referenceTime = measure(new Dictionary("german", SIZE));
		double serializableTime = measure(new DictionarySerializable("german", SIZE));
	}

	private static double measure(Dictionary dict) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < NOFCLONES; i++) {
			dict.clone();
		}
		long end = System.currentTimeMillis();
		double t = (end - start) / 1000.0;
		System.out.println("Time used: " + t);
		return t;
	}

	private static double measure(DictionarySerializable dict) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < NOFCLONES; i++) {
			dict.clone();
		}
		long end = System.currentTimeMillis();
		double t = (end - start) / 1000.0;
		System.out.println("Time used: " + t);
		return t;
	}
}
