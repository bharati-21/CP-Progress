import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.*;

public final class ChewbaccaAndNumber {
	static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader()
		{
			br = new BufferedReader(
				new InputStreamReader(System.in));
		}

		String next()
		{
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				}
				catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() { return Integer.parseInt(next()); }

		long nextLong() { return Long.parseLong(next()); }

		double nextDouble()
		{
			return Double.parseDouble(next());
		}

		String nextLine()
		{
			String str = "";
			try {
				if(st.hasMoreTokens()){
					str = st.nextToken("\n");
				}
				else{
					str = br.readLine();
				}
			}
			catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}

	public static void main(String[] args)
	{
		FastReader s = new FastReader();
		long n = s.nextLong();
		
		// convert the number to a string and get char array
		String str = Long.toString(n);

		char[] nums = str.toCharArray();

		for(int i = 0; i<nums.length; i++) {
			char num = nums[i];
			int currNum = num - '0';

			// cannot convert the first number to 0
			if(i == 0 && currNum == 9) {
				continue;
			}
			int convertedNum = 9 - currNum;
			if(convertedNum < currNum) {
				nums[i] = (char) (convertedNum + '0');
			}
		}

		long min = Long.parseLong(new String(nums));
		System.out.println(min);
	}
}
