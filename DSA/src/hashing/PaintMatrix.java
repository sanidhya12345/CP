package hashing;

import java.util.HashMap;
import java.util.Map;

public class PaintMatrix {

	public int firstCompleteIndex(int[] arr, int[][] mat) {
        Map<Integer, Integer> mp = new HashMap<>();
        
        int n = mat.length, m = mat[0].length, ans = (int)1e9;
        for (int i = 0; i < arr.length; i++) mp.put(arr[i], i);
        for (int i = 0; i < n; i++) {
            int c = 0;
            for (int j = 0; j < m; j++) {
                c = Math.max(c, mp.get(mat[i][j]));
            }
            ans = Math.min(ans, c);
        }
        for (int i = 0; i < m; i++) {
            int c = 0;
            for (int j = 0; j < n; j++) {
                c = Math.max(c, mp.get(mat[j][i]));
            }
            ans = Math.min(ans, c);
        }
        return ans;
    }

}
