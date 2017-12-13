package android.sabbir.com.modernlibrarys.test.material.components.p088c;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v4.p008b.C0227l;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.C0105a;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import butterknife.C1142R;
import com.material.components.p086a.C2263i;
import com.material.components.p086a.C2263i.C2260a;
import com.material.components.p086a.C2263i.C2261b;
import com.material.components.p089f.C2746d;
import com.material.components.p090b.C2700a;
import com.material.components.p091e.C2739m;
import com.material.components.p093g.C2757c;
import java.util.Collections;
import java.util.List;

public class C2720e extends C0227l {
    public static C2720e m12201a() {
        return new C2720e();
    }

    public View mo1503a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        final View inflate = layoutInflater.inflate(C1142R.layout.fragment_product_grid, viewGroup, false);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(C1142R.id.recyclerView);
        recyclerView.setLayoutManager(new GridLayoutManager(m1314j(), 2));
        recyclerView.m358a(new C2757c(2, C2746d.m12248a(m1314j(), 8), true));
        recyclerView.setHasFixedSize(true);
        List h = C2700a.m12164h(m1314j());
        Collections.shuffle(h);
        C0105a c2263i = new C2263i(m1314j(), h);
        recyclerView.setAdapter(c2263i);
        c2263i.m10966a(new C2260a(this) {
            final /* synthetic */ C2720e f6979b;

            public void mo1973a(View view, C2739m c2739m, int i) {
                Snackbar.m1021a(inflate, "Item " + c2739m.f7047c + " clicked", -1).m1012a();
            }
        });
        c2263i.m10967a(new C2261b(this) {
            final /* synthetic */ C2720e f6981b;

            public void mo1974a(View view, C2739m c2739m, MenuItem menuItem) {
                Snackbar.m1021a(inflate, c2739m.f7047c + " (" + menuItem.getTitle() + ") clicked", -1).m1012a();
            }
        });
        return inflate;
    }
}
