package android.sabbir.com.modernlibrarys.test.material.components.p088c;

import android.os.Bundle;
import android.support.v4.p008b.C0227l;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.C0105a;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import butterknife.C1142R;
import com.material.components.p086a.C2315s;
import com.material.components.p086a.C2315s.C2312a;
import com.material.components.p086a.C2315s.C2313b;
import com.material.components.p090b.C2700a;
import com.material.components.p091e.C2732g;
import java.util.Collections;
import java.util.List;

public class C2717d extends C0227l {

    class C27151 implements C2312a {
        final /* synthetic */ C2717d f6976a;

        C27151(C2717d c2717d) {
            this.f6976a = c2717d;
        }

        public void mo1964a(View view, C2732g c2732g, int i) {
            Toast.makeText(this.f6976a.m1314j(), "Item " + c2732g.f7023c + " clicked", 0).show();
        }
    }

    class C27162 implements C2313b {
        final /* synthetic */ C2717d f6977a;

        C27162(C2717d c2717d) {
            this.f6977a = c2717d;
        }

        public void mo1965a(View view, C2732g c2732g, MenuItem menuItem) {
            Toast.makeText(this.f6977a.m1314j(), c2732g.f7023c + " (" + menuItem.getTitle() + ") clicked", 0).show();
        }
    }

    public static C2717d m12197a() {
        return new C2717d();
    }

    public View mo1503a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C1142R.layout.fragment_music_song, viewGroup, false);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(C1142R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(m1314j()));
        recyclerView.setHasFixedSize(true);
        List i = C2700a.m12165i(m1314j());
        Collections.shuffle(i);
        C0105a c2315s = new C2315s(m1314j(), i);
        recyclerView.setAdapter(c2315s);
        c2315s.m11075a(new C27151(this));
        c2315s.m11076a(new C27162(this));
        return inflate;
    }
}
