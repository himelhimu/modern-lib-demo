package android.sabbir.com.modernlibrarys.test.material.components.p088c;

import android.app.Dialog;
import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.BottomSheetBehavior.C0145a;
import android.support.design.widget.C0226c;
import android.support.design.widget.C0230d;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.C1142R;
import com.material.components.p089f.C2746d;
import com.material.components.p091e.C2733h;

public class C2712b extends C0230d {
    private BottomSheetBehavior aa;
    private AppBarLayout ab;
    private LinearLayout ac;
    private C2733h ad;

    class C27101 extends C0145a {
        final /* synthetic */ C2712b f6973a;

        C27101(C2712b c2712b) {
            this.f6973a = c2712b;
        }

        public void mo200a(View view, float f) {
        }

        public void mo201a(View view, int i) {
            if (3 == i) {
                this.f6973a.m12183a(this.f6973a.ab, this.f6973a.m12181X());
                this.f6973a.m12187b(this.f6973a.ac);
            }
            if (4 == i) {
                this.f6973a.m12187b(this.f6973a.ab);
                this.f6973a.m12183a(this.f6973a.ac, this.f6973a.m12181X());
            }
            if (5 == i) {
                this.f6973a.mo209a();
            }
        }
    }

    class C27112 implements OnClickListener {
        final /* synthetic */ C2712b f6974a;

        C27112(C2712b c2712b) {
            this.f6974a = c2712b;
        }

        public void onClick(View view) {
            this.f6974a.mo209a();
        }
    }

    private int m12181X() {
        return (int) m1311i().getTheme().obtainStyledAttributes(new int[]{16843499}).getDimension(0, 0.0f);
    }

    private void m12183a(View view, int i) {
        LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i;
        view.setLayoutParams(layoutParams);
    }

    private void m12187b(View view) {
        LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = 0;
        view.setLayoutParams(layoutParams);
    }

    public Dialog mo220a(Bundle bundle) {
        C0226c c0226c = (C0226c) super.mo220a(bundle);
        View inflate = View.inflate(m1311i(), C1142R.layout.fragment_bottom_sheet_dialog_full, null);
        c0226c.setContentView(inflate);
        this.aa = BottomSheetBehavior.m846a((View) inflate.getParent());
        this.aa.m851a(-1);
        this.ab = (AppBarLayout) inflate.findViewById(C1142R.id.app_bar_layout);
        this.ac = (LinearLayout) inflate.findViewById(C1142R.id.lyt_profile);
        C2746d.m12264b(m1314j(), (ImageView) inflate.findViewById(C1142R.id.image), this.ad.f7025a);
        ((TextView) inflate.findViewById(C1142R.id.name)).setText(this.ad.f7027c);
        ((TextView) inflate.findViewById(C1142R.id.name_toolbar)).setText(this.ad.f7027c);
        m12187b(this.ab);
        this.aa.m852a(new C27101(this));
        ((ImageButton) inflate.findViewById(C1142R.id.bt_close)).setOnClickListener(new C27112(this));
        return c0226c;
    }

    public void m12190a(C2733h c2733h) {
        this.ad = c2733h;
    }

    public void mo215d() {
        super.mo215d();
        this.aa.m864b(4);
    }
}
