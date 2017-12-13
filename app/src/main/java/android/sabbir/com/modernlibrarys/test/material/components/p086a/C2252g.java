package android.sabbir.com.modernlibrarys.test.material.components.p086a;

import android.content.Context;
import android.support.v7.widget.RecyclerView.C0102w;
import android.support.v7.widget.RecyclerView.C0105a;
import android.support.v7.widget.StaggeredGridLayoutManager.C1018b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.C1142R;
import com.material.components.p089f.C2746d;
import com.material.components.p091e.C2737k;
import java.util.ArrayList;
import java.util.List;

public class C2252g extends C0105a<C0102w> {
    private final int f5756a = 1;
    private final int f5757b = 0;
    private List<C2737k> f5758c = new ArrayList();
    private Context f5759d;
    private C2249a f5760e;

    public interface C2249a {
        void mo1945a(View view, C2737k c2737k, int i);
    }

    public class C2250b extends C0102w {
        public ImageView f5752n;
        public View f5753o;
        final /* synthetic */ C2252g f5754p;

        public C2250b(C2252g c2252g, View view) {
            this.f5754p = c2252g;
            super(view);
            this.f5752n = (ImageView) view.findViewById(C1142R.id.image);
            this.f5753o = view.findViewById(C1142R.id.lyt_parent);
        }
    }

    public static class C2251c extends C0102w {
        public TextView f5755n;

        public C2251c(View view) {
            super(view);
            this.f5755n = (TextView) view.findViewById(C1142R.id.title_section);
        }
    }

    public C2252g(Context context, List<C2737k> list) {
        this.f5758c = list;
        this.f5759d = context;
    }

    public int mo94a() {
        return this.f5758c.size();
    }

    public void mo97a(C0102w c0102w, final int i) {
        final C2737k c2737k = (C2737k) this.f5758c.get(i);
        if (c0102w instanceof C2250b) {
            C2250b c2250b = (C2250b) c0102w;
            C2746d.m12254a(this.f5759d, c2250b.f5752n, c2737k.f7037a);
            c2250b.f5753o.setOnClickListener(new OnClickListener(this) {
                final /* synthetic */ C2252g f5751c;

                public void onClick(View view) {
                    if (this.f5751c.f5760e != null) {
                        this.f5751c.f5760e.mo1945a(view, c2737k, i);
                    }
                }
            });
        } else {
            ((C2251c) c0102w).f5755n.setText(c2737k.f7038b);
        }
        if (c2737k.f7039c) {
            ((C1018b) c0102w.f361a.getLayoutParams()).m5709a(true);
        } else {
            ((C1018b) c0102w.f361a.getLayoutParams()).m5709a(false);
        }
    }

    public void m10946a(C2249a c2249a) {
        this.f5760e = c2249a;
    }

    public int mo98b(int i) {
        return ((C2737k) this.f5758c.get(i)).f7039c ? 0 : 1;
    }

    public C0102w mo99b(ViewGroup viewGroup, int i) {
        return i == 1 ? new C2250b(this, LayoutInflater.from(viewGroup.getContext()).inflate(C1142R.layout.item_grid_image_sectioned, viewGroup, false)) : new C2251c(LayoutInflater.from(viewGroup.getContext()).inflate(C1142R.layout.item_section, viewGroup, false));
    }
}
