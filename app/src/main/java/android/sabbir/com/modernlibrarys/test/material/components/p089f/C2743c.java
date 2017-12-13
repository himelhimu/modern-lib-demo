package android.sabbir.com.modernlibrarys.test.material.components.p089f;

public class C2743c {
    public int m12242a(int i, int i2) {
        return ((int) (((double) (i2 / 1000)) * (((double) i) / 10000.0d))) * 1000;
    }

    public int m12243a(long j, long j2) {
        Double.valueOf(0.0d);
        return Double.valueOf((((double) j) / ((double) j2)) * 10000.0d).intValue();
    }

    public String m12244a(long j) {
        String str = "";
        int i = (int) (j / 3600000);
        int i2 = (int) (((j % 3600000) % 60000) / 1000);
        return (i > 0 ? i + ":" : "") + (((int) (j % 3600000)) / 60000) + ":" + (i2 < 10 ? "0" + i2 : "" + i2);
    }
}
