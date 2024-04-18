package javasessions;

import java.util.Arrays;

public class ArraysConcept {

	public static void main(String[] args) {

		// int array

		int i[] = new int[4];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		// i[4] = 50;

//		System.out.println(Arrays.toString(i));
//		
//		
//		int p[] = {1,4,5,2,3,22,31,2};
//		System.out.println(Arrays.toString(p));

		// System.out.println(i); //address of array
		// System.out.println(i[4]);
		System.out.println(Arrays.toString(i));
		System.out.println(i.length);

		for (int j = 0; j <= 3; j++) {
			System.out.println(i[j]);
			if (i[j] == 20) {
				System.out.println("COdEr");
				break;
			}
		}

		// char array

		char ch[] = new char[4];
		ch[0] = 'a';
		ch[1] = 'A';
		ch[2] = '$';
		ch[3] = 98;
		System.out.println(ch[3]);

		System.out.println(Arrays.toString(ch));

		// float array

		float fh[] = new float[2];
		fh[0] = 12.33f;
		fh[1] = 100;
		System.out.println(Arrays.toString(fh));

		// object array

		Object empData[] = new Object[4];
		empData[0] = "Shilpa";
		empData[1] = 23;
		empData[2] = 35.66;
		empData[3] = 'f';
		
		System.out.println(Arrays.toString(empData));
		
		//reverse printing of array
		System.out.println("------------------------");
		
		for( int x = empData.length-1; x>=0;x--) {
			System.out.println(empData[x]);
		}
	}

}
