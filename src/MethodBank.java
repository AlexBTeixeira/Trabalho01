import java.util.List;

public class MethodBank {
    public static int steps = 0;

    public static int maxVal1(List<Integer> list) throws Exception {

        if(list.size()<1){throw new Exception("Empty List");}
        if(list.size() == 1) {return list.get(0);}

        int currentMax = list.get(0);

        for (int i = 1; i < list.size(); i++) {
            if (currentMax < list.get(i)) {
                currentMax = list.get(i);
            }
            steps++;
        }
        steps++;
        return currentMax;
    }

    public static int maxVal2(List<Integer> list,int init, int end) {

        if(end-init <=1){
            return Math.max(list.get(init),list.get(end));
        }
        else{
            int m = (init + end)/2;
            int v1 = maxVal2(list,init,m);
            int v2 = maxVal2(list,m+1,end);
            steps++;

            return Math.max(v1,v2);
        }
    }

    public static long multiply(long x, long y, long n){
        if(n==1){return Math.multiplyExact(x,y);}
        else{
            long m = (long)Math.ceil(n / 2);
            long a = (long)Math.floor(x / Math.pow(2, m));
            long c = (long)Math.floor(y / Math.pow(2, m));
            long b = (long) x % (long)Math.pow(2, m);
            long d = (long) y % (long)Math.pow(2, m);
            long e = multiply(a, c, m);
            long f = multiply(b, d, m);
            long g = multiply(b, c, m);
            long h = multiply(a, d, m);
            steps++;
            return (long)Math.pow(2, 2*m) * e +
                    (long)Math.pow(2,m)*(g + h) + f;
        }
        }
    }

