class Solution {
    public int tribonacci(int n) {
        HashMap<Integer,Integer> h = new HashMap<>();
        return trib(n,h);
    }
    public static int trib(int n, HashMap<Integer,Integer> h) {
        if (n==0) return 0;
        if (n==1 || n==2) return 1;
        if (h.containsKey(n)) {
            return h.get(n);
        } else {
            h.put(n, trib(n-3,h)+trib(n-2,h)+trib(n-1,h));
        }
        return trib(n-3,h)+trib(n-2,h)+trib(n-1,h);
    }
}
