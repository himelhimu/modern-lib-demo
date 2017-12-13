package android.sabbir.com.modernlibrarys.test.material.components.activity.bottomsheet;

import android.os.Bundle;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.BottomSheetBehavior.C0145a;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.C0818e;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.Toast;
import butterknife.C1142R;
import com.google.android.gms.maps.C2115a;
import com.google.android.gms.maps.C2116b;
import com.google.android.gms.maps.C2119c;
import com.google.android.gms.maps.C2119c.C2118a;
import com.google.android.gms.maps.C2121e;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.C2160h;
import com.google.android.gms.maps.model.C2161i;
import com.google.android.gms.maps.model.LatLng;
import com.material.components.p089f.C2746d;

public class BottomSheetMap extends C0818e {
    private C2119c f6088m;
    private BottomSheetBehavior f6089n;

    class C23821 extends C0145a {
        final /* synthetic */ BottomSheetMap f6084a;

        C23821(BottomSheetMap bottomSheetMap) {
            this.f6084a = bottomSheetMap;
        }

        public void mo200a(View view, float f) {
        }

        public void mo201a(View view, int i) {
        }
    }

    class C23832 implements OnClickListener {
        final /* synthetic */ BottomSheetMap f6085a;

        C23832(BottomSheetMap bottomSheetMap) {
            this.f6085a = bottomSheetMap;
        }

        public void onClick(View view) {
            this.f6085a.f6089n.m864b(4);
            try {
                this.f6085a.f6088m.m10254b(this.f6085a.m11226l());
            } catch (Exception e) {
            }
        }
    }

    class C23853 implements C2121e {
        final /* synthetic */ BottomSheetMap f6087a;

        class C23841 implements C2118a {
            final /* synthetic */ C23853 f6086a;

            C23841(C23853 c23853) {
                this.f6086a = c23853;
            }

            public boolean mo1930a(C2160h c2160h) {
                this.f6086a.f6087a.f6089n.m864b(4);
                try {
                    this.f6086a.f6087a.f6088m.m10254b(this.f6086a.f6087a.m11226l());
                } catch (Exception e) {
                }
                return true;
            }
        }

        C23853(BottomSheetMap bottomSheetMap) {
            this.f6087a = bottomSheetMap;
        }

        public void mo1931a(C2119c c2119c) {
            this.f6087a.f6088m = C2746d.m12249a(c2119c);
            this.f6087a.f6088m.m10250a(new C2161i().m10680a(new LatLng(37.7610237d, -122.4217785d)));
            this.f6087a.f6088m.m10252a(this.f6087a.m11226l());
            this.f6087a.f6088m.m10253a(new C23841(this));
        }
    }

    private void m11224j() {
        this.f6089n = BottomSheetBehavior.m846a((LinearLayout) findViewById(C1142R.id.bottom_sheet));
        this.f6089n.m864b(4);
        this.f6089n.m852a(new C23821(this));
        ((FloatingActionButton) findViewById(C1142R.id.fab_directions)).setOnClickListener(new C23832(this));
    }

    private void m11225k() {
        ((SupportMapFragment) m1917e().mo330a((int) C1142R.id.map)).m9731a(new C23853(this));
    }

    private C2115a m11226l() {
        return C2116b.m10245a(new LatLng(37.76496792d, -122.42206407d), 13.0f);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1142R.layout.activity_bottom_sheet_map);
        m11225k();
        m11224j();
        Toast.makeText(this, "Swipe up bottom sheet", 0).show();
    }
}
