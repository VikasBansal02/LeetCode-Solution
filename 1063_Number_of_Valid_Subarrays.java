class Solution {
    public static int ValidSubArray(int[] arr) {

		  Stack<Integer> st = new Stack<>();
		  int ans = 0;
		  for (int i = 0; i < arr.length; i++) {
			  while (!st.isEmpty() && arr[i] < st.peek()) {
				  st.pop();
			  }
			  st.push(arr[i]);
			  ans += st.size();
		  }
		  return ans;

	  }
}
