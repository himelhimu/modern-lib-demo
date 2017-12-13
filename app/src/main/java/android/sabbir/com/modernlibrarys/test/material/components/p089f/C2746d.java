package android.sabbir.com.modernlibrarys.test.material.components.p089f;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.p002d.p003a.C0444o;
import android.support.v4.widget.NestedScrollView;
import android.util.TypedValue;
import android.view.Menu;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.widget.ImageView;
import android.widget.Toast;
import butterknife.C1142R;
import com.google.android.gms.maps.C2119c;
import com.p027a.p028a.C1420g;
import com.p027a.p028a.p032d.p034b.C1221b;
import com.p027a.p028a.p040h.p051b.C1438b;
import java.text.SimpleDateFormat;
import java.util.Date;

public class C2746d {
    public static int m12247a() {
        return Resources.getSystem().getDisplayMetrics().widthPixels;
    }

    public static int m12248a(Context context, int i) {
        return Math.round(TypedValue.applyDimension(1, (float) i, context.getResources().getDisplayMetrics()));
    }

    public static C2119c m12249a(C2119c c2119c) {
        c2119c.m10251a(1);
        c2119c.m10249a().m10258a(false);
        c2119c.m10249a().m10259b(true);
        c2119c.m10249a().m10262e(true);
        c2119c.m10249a().m10261d(true);
        c2119c.m10249a().m10260c(true);
        c2119c.m10249a().m10263f(true);
        return c2119c;
    }

    public static String m12250a(Long l) {
        return new SimpleDateFormat("MMMM dd, yyyy").format(new Date(l.longValue()));
    }

    public static String m12251a(String str) {
        return (str == null || str.equals("")) ? str : str.replaceAll(" ", ".").toLowerCase().concat("@mail.com");
    }

    public static void m12252a(Activity activity) {
        if (VERSION.SDK_INT >= 21) {
            Window window = activity.getWindow();
            window.addFlags(Integer.MIN_VALUE);
            window.clearFlags(67108864);
            window.setStatusBarColor(activity.getResources().getColor(C1142R.color.colorPrimaryDark));
        }
    }

    public static void m12253a(Activity activity, int i) {
        if (VERSION.SDK_INT >= 21) {
            Window window = activity.getWindow();
            window.addFlags(Integer.MIN_VALUE);
            window.clearFlags(67108864);
            window.setStatusBarColor(activity.getResources().getColor(i));
        }
    }

    public static void m12254a(Context context, ImageView imageView, int i) {
        try {
            C1420g.m7577b(context).m7754a(Integer.valueOf(i)).m6873c().m6856a(C1221b.NONE).mo1112a(imageView);
        } catch (Exception e) {
        }
    }

    public static void m12255a(Context context, String str) {
        ((ClipboardManager) context.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("clipboard", str));
        Toast.makeText(context, "Text copied to clipboard", 0).show();
    }

    public static void m12256a(final NestedScrollView nestedScrollView, final View view) {
        nestedScrollView.post(new Runnable() {
            public void run() {
                nestedScrollView.scrollTo(500, view.getBottom());
            }
        });
    }

    public static void m12257a(Menu menu, int i) {
        for (int i2 = 0; i2 < menu.size(); i2++) {
            Drawable icon = menu.getItem(i2).getIcon();
            if (icon != null) {
                icon.mutate();
                icon.setColorFilter(i, Mode.SRC_ATOP);
            }
        }
    }

    public static boolean m12258a(View view) {
        if (view.getRotation() == 0.0f) {
            view.animate().setDuration(200).rotation(180.0f);
            return true;
        }
        view.animate().setDuration(200).rotation(0.0f);
        return false;
    }

    public static boolean m12259a(boolean z, View view) {
        return C2746d.m12260a(z, view, true);
    }

    public static boolean m12260a(boolean z, View view, boolean z2) {
        long j = 200;
        if (z) {
            ViewPropertyAnimator animate = view.animate();
            if (!z2) {
                j = 0;
            }
            animate.setDuration(j).rotation(180.0f);
            return true;
        }
        animate = view.animate();
        if (!z2) {
            j = 0;
        }
        animate.setDuration(j).rotation(0.0f);
        return false;
    }

    public static String m12261b(Long l) {
        return new SimpleDateFormat("EEE, MMM dd yyyy").format(new Date(l.longValue()));
    }

    public static String m12262b(String str) {
        String toLowerCase = str.toLowerCase();
        StringBuilder stringBuilder = new StringBuilder();
        Object obj = 1;
        for (char c : toLowerCase.toCharArray()) {
            char c2;
            if (Character.isSpaceChar(c2)) {
                obj = 1;
            } else if (obj != null) {
                c2 = Character.toTitleCase(c2);
                obj = null;
            }
            stringBuilder.append(c2);
        }
        return stringBuilder.toString();
    }

    public static void m12263b(Activity activity) {
        if (VERSION.SDK_INT >= 21) {
            Window window = activity.getWindow();
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(0);
        }
    }

    public static void m12264b(final Context context, final ImageView imageView, int i) {
        try {
            C1420g.m7577b(context).m7754a(Integer.valueOf(i)).m7488h().mo1111a().m6748a(new C1438b(imageView) {
                protected void mo1988a(Bitmap bitmap) {
                    Drawable a = C0444o.m2353a(context.getResources(), bitmap);
                    a.m2349a(true);
                    imageView.setImageDrawable(a);
                }
            });
        } catch (Exception e) {
        }
    }

    public static String m12265c(Long l) {
        return new SimpleDateFormat("h:mm a").format(new Date(l.longValue()));
    }
}
