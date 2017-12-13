package android.sabbir.com.modernlibrarys.test.material.components.activity.button;

import android.os.Bundle;
import android.support.v7.app.C0818e;
import butterknife.C1142R;
import com.google.android.gms.maps.C2116b;
import com.google.android.gms.maps.C2119c;
import com.google.android.gms.maps.C2121e;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.C2161i;
import com.google.android.gms.maps.model.LatLng;
import com.material.components.p089f.C2746d;

public class FabMiddle extends C0818e {
    private C2119c f6091m;

    class C23861 implements C2121e {
        final /* synthetic */ FabMiddle f6090a;

        C23861(FabMiddle fabMiddle) {
            this.f6090a = fabMiddle;
        }

        public void mo1931a(C2119c c2119c) {
            this.f6090a.f6091m = C2746d.m12249a(c2119c);
            this.f6090a.f6091m.m10250a(new C2161i().m10680a(new LatLng(37.7610237d, -122.4217785d)));
            this.f6090a.f6091m.m10252a(C2116b.m10245a(new LatLng(37.76496792d, -122.42206407d), 13.0f));
        }
    }

    private void m11230j() {
        ((SupportMapFragment) m1917e().mo330a((int) C1142R.id.map)).m9731a(new C23861(this));
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1142R.layout.activity_button_fab_middle);
        m11230j();
    }
}
