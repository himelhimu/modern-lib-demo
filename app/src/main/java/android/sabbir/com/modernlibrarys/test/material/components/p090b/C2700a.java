package android.sabbir.com.modernlibrarys.test.material.components.p090b;

import android.content.Context;
import android.content.res.TypedArray;
import butterknife.C1142R;
import com.material.components.p089f.C2742b;
import com.material.components.p089f.C2746d;
import com.material.components.p091e.C2728c;
import com.material.components.p091e.C2729d;
import com.material.components.p091e.C2731f;
import com.material.components.p091e.C2732g;
import com.material.components.p091e.C2733h;
import com.material.components.p091e.C2738l;
import com.material.components.p091e.C2739m;
import com.material.components.p091e.C2740n;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class C2700a {
    private static Random f6962a = new Random();

    public static int m12155a(int i) {
        return 0 + f6962a.nextInt((i - 0) + 1);
    }

    public static List<Integer> m12156a(Context context) {
        List<Integer> arrayList = new ArrayList();
        TypedArray obtainTypedArray = context.getResources().obtainTypedArray(C1142R.array.sample_images);
        for (int i = 0; i < obtainTypedArray.length(); i++) {
            arrayList.add(Integer.valueOf(obtainTypedArray.getResourceId(i, -1)));
        }
        Collections.shuffle(arrayList);
        return arrayList;
    }

    private static int m12157b(int i) {
        return f6962a.nextInt(i - 1);
    }

    public static List<String> m12158b(Context context) {
        List<String> arrayList = new ArrayList();
        for (Object add : context.getResources().getStringArray(C1142R.array.month)) {
            arrayList.add(add);
        }
        Collections.shuffle(arrayList);
        return arrayList;
    }

    public static List<C2733h> m12159c(Context context) {
        List<C2733h> arrayList = new ArrayList();
        TypedArray obtainTypedArray = context.getResources().obtainTypedArray(C1142R.array.people_images);
        String[] stringArray = context.getResources().getStringArray(C1142R.array.people_names);
        for (int i = 0; i < obtainTypedArray.length(); i++) {
            C2733h c2733h = new C2733h();
            c2733h.f7025a = obtainTypedArray.getResourceId(i, -1);
            c2733h.f7027c = stringArray[i];
            c2733h.f7028d = C2746d.m12251a(c2733h.f7027c);
            c2733h.f7026b = context.getResources().getDrawable(c2733h.f7025a);
            arrayList.add(c2733h);
        }
        Collections.shuffle(arrayList);
        return arrayList;
    }

    public static List<C2740n> m12160d(Context context) {
        List<C2740n> arrayList = new ArrayList();
        TypedArray obtainTypedArray = context.getResources().obtainTypedArray(C1142R.array.social_images);
        String[] stringArray = context.getResources().getStringArray(C1142R.array.social_names);
        for (int i = 0; i < obtainTypedArray.length(); i++) {
            C2740n c2740n = new C2740n();
            c2740n.f7049a = obtainTypedArray.getResourceId(i, -1);
            c2740n.f7051c = stringArray[i];
            c2740n.f7050b = context.getResources().getDrawable(c2740n.f7049a);
            arrayList.add(c2740n);
        }
        Collections.shuffle(arrayList);
        return arrayList;
    }

    public static List<C2729d> m12161e(Context context) {
        List<C2729d> arrayList = new ArrayList();
        TypedArray obtainTypedArray = context.getResources().obtainTypedArray(C1142R.array.people_images);
        String[] stringArray = context.getResources().getStringArray(C1142R.array.people_names);
        String[] stringArray2 = context.getResources().getStringArray(C1142R.array.general_date);
        for (int i = 0; i < obtainTypedArray.length(); i++) {
            C2729d c2729d = new C2729d();
            c2729d.f7003a = Integer.valueOf(obtainTypedArray.getResourceId(i, -1));
            c2729d.f7005c = stringArray[i];
            c2729d.f7006d = C2746d.m12251a(c2729d.f7005c);
            c2729d.f7007e = context.getResources().getString(C1142R.string.lorem_ipsum);
            c2729d.f7008f = stringArray2[C2700a.m12155a(stringArray2.length - 1)];
            c2729d.f7004b = context.getResources().getDrawable(c2729d.f7003a.intValue());
            arrayList.add(c2729d);
        }
        Collections.shuffle(arrayList);
        return arrayList;
    }

    public static List<C2728c> m12162f(Context context) {
        List<C2728c> arrayList = new ArrayList();
        TypedArray obtainTypedArray = context.getResources().obtainTypedArray(C1142R.array.sample_images);
        String[] stringArray = context.getResources().getStringArray(C1142R.array.sample_images_name);
        String[] stringArray2 = context.getResources().getStringArray(C1142R.array.general_date);
        for (int i = 0; i < obtainTypedArray.length(); i++) {
            C2728c c2728c = new C2728c();
            c2728c.f6998a = obtainTypedArray.getResourceId(i, -1);
            c2728c.f7000c = stringArray[i];
            c2728c.f7001d = stringArray2[C2700a.m12155a(stringArray2.length - 1)];
            c2728c.f7002e = f6962a.nextBoolean() ? Integer.valueOf(C2700a.m12155a(500)) : null;
            c2728c.f6999b = context.getResources().getDrawable(c2728c.f6998a);
            arrayList.add(c2728c);
        }
        Collections.shuffle(arrayList);
        return arrayList;
    }

    public static List<C2738l> m12163g(Context context) {
        List<C2738l> arrayList = new ArrayList();
        TypedArray obtainTypedArray = context.getResources().obtainTypedArray(C1142R.array.shop_category_icon);
        TypedArray obtainTypedArray2 = context.getResources().obtainTypedArray(C1142R.array.shop_category_bg);
        String[] stringArray = context.getResources().getStringArray(C1142R.array.shop_category_title);
        String[] stringArray2 = context.getResources().getStringArray(C1142R.array.shop_category_brief);
        for (int i = 0; i < obtainTypedArray.length(); i++) {
            C2738l c2738l = new C2738l();
            c2738l.f7040a = obtainTypedArray.getResourceId(i, -1);
            c2738l.f7044e = obtainTypedArray2.getResourceId(i, -1);
            c2738l.f7042c = stringArray[i];
            c2738l.f7043d = stringArray2[i];
            c2738l.f7041b = context.getResources().getDrawable(c2738l.f7040a);
            arrayList.add(c2738l);
        }
        return arrayList;
    }

    public static List<C2739m> m12164h(Context context) {
        List<C2739m> arrayList = new ArrayList();
        TypedArray obtainTypedArray = context.getResources().obtainTypedArray(C1142R.array.shop_product_image);
        String[] stringArray = context.getResources().getStringArray(C1142R.array.shop_product_title);
        String[] stringArray2 = context.getResources().getStringArray(C1142R.array.shop_product_price);
        for (int i = 0; i < obtainTypedArray.length(); i++) {
            C2739m c2739m = new C2739m();
            c2739m.f7045a = obtainTypedArray.getResourceId(i, -1);
            c2739m.f7047c = stringArray[i];
            c2739m.f7048d = stringArray2[i];
            c2739m.f7046b = context.getResources().getDrawable(c2739m.f7045a);
            arrayList.add(c2739m);
        }
        return arrayList;
    }

    public static List<C2732g> m12165i(Context context) {
        List<C2732g> arrayList = new ArrayList();
        TypedArray obtainTypedArray = context.getResources().obtainTypedArray(C1142R.array.album_cover);
        String[] stringArray = context.getResources().getStringArray(C1142R.array.song_name);
        String[] stringArray2 = context.getResources().getStringArray(C1142R.array.album_name);
        for (int i = 0; i < obtainTypedArray.length(); i++) {
            C2732g c2732g = new C2732g();
            c2732g.f7021a = obtainTypedArray.getResourceId(i, -1);
            c2732g.f7023c = stringArray[i];
            c2732g.f7024d = stringArray2[i];
            c2732g.f7022b = context.getResources().getDrawable(c2732g.f7021a);
            arrayList.add(c2732g);
        }
        Collections.shuffle(arrayList);
        return arrayList;
    }

    public static List<C2731f> m12166j(Context context) {
        List<C2731f> arrayList = new ArrayList();
        TypedArray obtainTypedArray = context.getResources().obtainTypedArray(C1142R.array.album_cover);
        String[] stringArray = context.getResources().getStringArray(C1142R.array.album_name);
        for (int i = 0; i < obtainTypedArray.length(); i++) {
            C2731f c2731f = new C2731f();
            c2731f.f7016a = obtainTypedArray.getResourceId(i, -1);
            c2731f.f7018c = stringArray[i];
            c2731f.f7019d = C2700a.m12157b(15) + " MusicSong (s)";
            c2731f.f7020e = C2742b.m12241a(context, c2731f.f7018c, i);
            c2731f.f7017b = context.getResources().getDrawable(c2731f.f7016a);
            arrayList.add(c2731f);
        }
        return arrayList;
    }
}
