package minggu5;

public class MainNilaiMHS {
    public static void main(String[] args) {
        NilaiMHS[] data = {
            new NilaiMHS("Ahmad", "220101001", 2022, 78, 82),
            new NilaiMHS("Budi", "220101002", 2022, 85, 88),
            new NilaiMHS("Cindy", "220101003", 2021, 90, 87),
            new NilaiMHS("Dian", "220101004", 2021, 76, 79),
            new NilaiMHS("Eko", "220101005", 2022, 92, 95),
            new NilaiMHS("Fajar", "220101006", 2022, 85, 85),
            new NilaiMHS("Gina", "220101007", 2021, 79, 81),
            new NilaiMHS("Hadi", "220101008", 2021, 88, 90)
        };

        int maxUTS = NilaiMHS.maxUTSDC(data, 0, data.length - 1);

        int minUTS = NilaiMHS.minUTSDC(data, 0, data.length - 1);

        double rataUAS = NilaiMHS.rataUASBF(data);

        System.out.println("Nilai UTS Tertinggi (DC): " + maxUTS);
        System.out.println("Nilai UTS Terendah (DC): " + minUTS);
        System.out.println("Rata-rata Nilai UAS (BF): " + rataUAS);
    }
}
