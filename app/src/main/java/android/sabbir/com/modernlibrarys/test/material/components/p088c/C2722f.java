package android.sabbir.com.modernlibrarys.test.material.components.p088c;

import android.os.Bundle;
import android.support.v4.p008b.C0227l;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.C0105a;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.C1142R;
import com.material.components.p086a.C2252g;
import com.material.components.p086a.C2252g.C2249a;
import com.material.components.p090b.C2700a;
import com.material.components.p091e.C2737k;
import java.util.ArrayList;
import java.util.List;

public class C2722f extends C0227l {

    class C27211 implements C2249a {
        final /* synthetic */ C2722f f6982a;

        C27211(C2722f c2722f) {
            this.f6982a = c2722f;
        }

        public void mo1945a(View view, C2737k c2737k, int i) {
        }
    }

    public static C2722f m12204a() {
        return new C2722f();
    }

    public View mo1503a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = 0;
        View inflate = layoutInflater.inflate(C1142R.layout.fragment_tabs_gallery, viewGroup, false);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(C1142R.id.recyclerView);
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(3, 1));
        recyclerView.setHasFixedSize(true);
        List<Integer> a = C2700a.m12156a(m1314j());
        a.addAll(C2700a.m12156a(m1314j()));
        a.addAll(C2700a.m12156a(m1314j()));
        a.addAll(C2700a.m12156a(m1314j()));
        a.addAll(C2700a.m12156a(m1314j()));
        List arrayList = new ArrayList();
        for (Integer num : a) {
            arrayList.add(new C2737k(num.intValue(), "IMG_" + num + ".jpg", false));
        }
        List b = C2700a.m12158b(m1314j());
        int i2 = 0;
        int i3 = 0;
        while (i < arrayList.size() / 10) {
            arrayList.add(i3, new C2737k(-1, (String) b.get(i2), true));
            i3 += 10;
            i2++;
            i++;
        }
        C0105a c2252g = new C2252g(m1314j(), arrayList);
        recyclerView.setAdapter(c2252g);
        c2252g.m10946a(new C27211(this));
        return inflate;
    }
}
