package android.sabbir.com.modernlibrarys.test.material.components.p088c;

import android.os.Bundle;
import android.support.v4.p008b.C0227l;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.C0105a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import butterknife.C1142R;
import com.material.components.p086a.C2240e;
import com.material.components.p086a.C2240e.C2238a;
import com.material.components.p089f.C2746d;
import com.material.components.p090b.C2700a;
import com.material.components.p091e.C2731f;
import com.material.components.p093g.C2757c;
import java.util.Collections;
import java.util.List;

public class C2714c extends C0227l {

    class C27131 implements C2238a {
        final /* synthetic */ C2714c f6975a;

        C27131(C2714c c2714c) {
            this.f6975a = c2714c;
        }

        public void mo1963a(View view, C2731f c2731f, int i) {
            Toast.makeText(this.f6975a.m1314j(), "Item " + c2731f.f7018c + " clicked", 0).show();
        }
    }

    public static C2714c m12193a() {
        return new C2714c();
    }

    public View mo1503a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C1142R.layout.fragment_product_grid, viewGroup, false);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(C1142R.id.recyclerView);
        recyclerView.setLayoutManager(new GridLayoutManager(m1314j(), 2));
        recyclerView.m358a(new C2757c(2, C2746d.m12248a(m1314j(), 4), true));
        recyclerView.setHasFixedSize(true);
        List j = C2700a.m12166j(m1314j());
        Collections.shuffle(j);
        C0105a c2240e = new C2240e(m1314j(), j);
        recyclerView.setAdapter(c2240e);
        c2240e.m10920a(new C27131(this));
        return inflate;
    }
}
