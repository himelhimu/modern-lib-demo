package android.sabbir.com.modernlibrarys.test.material.components.p089f;

import android.content.Context;
import android.content.res.TypedArray;
import java.util.Random;

public class C2742b {
    private static Random f7055a = new Random();

    public static int m12241a(Context context, String str, int i) {
        int identifier = context.getResources().getIdentifier("mdcolor_random", "array", context.getPackageName());
        if (identifier == 0) {
            return -1;
        }
        TypedArray obtainTypedArray = context.getResources().obtainTypedArray(identifier);
        while (i >= obtainTypedArray.length()) {
            i -= 5;
        }
        while (i < 0) {
            i += 2;
        }
        int color = obtainTypedArray.getColor(i, -7829368);
        obtainTypedArray.recycle();
        return color;
    }
}
