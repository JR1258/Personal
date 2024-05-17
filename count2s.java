
public class count2s {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] array = { 1, 5, 2, 2, 2, 9, 4};


		int count = 0;
		for (int i = 0; i < array.length; i++){

		if (array[i] == 2){
		count = count + 1;
		}
		}
		System.out.println(count);

	}

}
