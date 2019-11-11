class DataSet {
	int i;
	double d;
	boolean b;
	String s;
	DataSet data;
}

class InitializationTest {
	public static void main(String[] args) {
		DataSet dataSet = new DataSet();
		System.out.println(dataSet.i);
		System.out.println(dataSet.d);
		System.out.println(dataSet.b);
		System.out.println(dataSet.s);
		System.out.println(dataSet.data);
	}
}
