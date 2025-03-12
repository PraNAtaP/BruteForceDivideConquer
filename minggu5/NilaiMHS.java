package minggu5;

public class NilaiMHS {
    String nama;
    String nim;
    int tahunMasuk;
    int uts;
    int uas;

    public NilaiMHS(String nama, String nim, int tahunMasuk, int uts, int uas) {
        this.nama = nama;
        this.nim = nim;
        this.tahunMasuk = tahunMasuk;
        this.uts = uts;
        this.uas = uas;
    }

    public static int maxUTSDC(NilaiMHS[] arr, int left, int right) {
        if (left == right) {
            return arr[left].uts;
        }

        int mid = (left + right) / 2;
        int maxLeft = maxUTSDC(arr, left, mid);
        int maxRight = maxUTSDC(arr, mid + 1, right);
        int maxUTS = (maxLeft > maxRight) ? maxLeft : maxRight;

        return maxUTS;
    }

    public static int minUTSDC(NilaiMHS[] arr, int left, int right) {
        if (left == right) {
            return arr[left].uts;
        }
        int mid = (left + right) / 2;
        int minLeft = minUTSDC(arr, left, mid);
        int minRight = minUTSDC(arr, mid + 1, right);
        int minUTS = (minLeft < minRight) ? minLeft : minRight;

        return minUTS;
    }

    public static double rataUASBF(NilaiMHS[] arr) {
        double total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i].uas;
        }
        return total / arr.length;
    }
}
