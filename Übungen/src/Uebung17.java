public class Uebung17 {

    public static void main(String[] args) {
        int z = 5;
        int[] Zahlen = zahlenGenerieren(z);
        printArray(Zahlen);
        Zahlen = sort(Zahlen);
        printArray(Zahlen);

    }

    public static int[] zahlenGenerieren(int i) {
        int[] tmp = new int[i];
        for (int j = 0; j < tmp.length; j++) {
            tmp[j] = ((int) (Math.random() * 10)) + 1;
        }
        return tmp;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println();
    }


    public static int[] sort(int[] arr) {
        return sort(arr, 0, arr.length-1);
    }

    private static int[] sort(int[] arr, int l, int r) {
        int[] left;
        int[] right;
        int m = l + ((r - l) / 2);

        if (r - l > 1) {
            return mergeArray(sort(arr, l, m - 1), sort(arr, m, r));
        } else if (r - l == 1) {
            return arr[r]>arr[l]?new int[]{arr[l],arr[r]}:new int[]{arr[r],arr[l]};
        } else {
            return new int[]{arr[l]};
        }
    }

    private static int[] mergeArray(int[] l, int[] r) {
        int[] tmp = new int[l.length + r.length];
        int lc = 0;
        int rc = 0;
        int i = 0;

        for (; i < tmp.length; i++) {
            if (lc >= l.length || rc >= r.length) {
                break;
            }
            if (l[lc] > r[rc]) {
                tmp[i] = r[rc++];
            } else {
                tmp[i] = l[lc++];
            }
        }

        for (; i < tmp.length; i++) {

            if (lc < l.length) {
                tmp[i] = l[lc++];
            } else if (rc < r.length) {
                tmp[i] = r[rc++];
            }
        }

        return tmp;
    }
}
