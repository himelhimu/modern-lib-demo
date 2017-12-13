package android.sabbir.com.modernlibrarys.test.material.components.p086a;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.C0102w;
import android.support.v7.widget.RecyclerView.C0105a;
import android.support.v7.widget.RecyclerView.C0995m;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.support.v7.widget.StaggeredGridLayoutManager.C1018b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import butterknife.C1142R;
import com.material.components.p089f.C2746d;
import com.material.components.p091e.C2736j;
import java.util.ArrayList;
import java.util.List;

public class C2247f extends C0105a<C0102w> {
    private final int f5741a = 1;
    private final int f5742b = 0;
    private int f5743c = 0;
    private List<C2736j> f5744d = new ArrayList();
    private boolean f5745e;
    private C2244b f5746f = null;
    private Context f5747g;
    private C2243a f5748h;

    public interface C2243a {
        void m10923a(View view, C2736j c2736j, int i);
    }

    public interface C2244b {
        void mo1967a(int i);
    }

    public class C2245c extends C0102w {
        public ImageView f5737n;
        public View f5738o;
        final /* synthetic */ C2247f f5739p;

        public C2245c(C2247f c2247f, View view) {
            this.f5739p = c2247f;
            super(view);
            this.f5737n = (ImageView) view.findViewById(C1142R.id.image);
            this.f5738o = view.findViewById(C1142R.id.lyt_parent);
        }
    }

    public static class C2246d extends C0102w {
        public ProgressBar f5740n;

        public C2246d(View view) {
            super(view);
            this.f5740n = (ProgressBar) view.findViewById(C1142R.id.progress_bar);
        }
    }

    public C2247f(Context context, int i, List<C2736j> list) {
        this.f5744d = list;
        this.f5743c = i;
        this.f5747g = context;
    }

    private int m10926a(int[] iArr) {
        int i = iArr[0];
        int length = iArr.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = iArr[i2];
            if (i >= i3) {
                i3 = i;
            }
            i2++;
            i = i3;
        }
        return i;
    }

    private void m10931c(RecyclerView recyclerView) {
        if (recyclerView.getLayoutManager() instanceof StaggeredGridLayoutManager) {
            final StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) recyclerView.getLayoutManager();
            recyclerView.m362a(new C0995m(this) {
                final /* synthetic */ C2247f f5736b;

                public void mo1039a(RecyclerView recyclerView, int i, int i2) {
                    super.mo1039a(recyclerView, i, i2);
                    int a = this.f5736b.m10926a(staggeredGridLayoutManager.m5821a(null));
                    if (!this.f5736b.f5745e && a == this.f5736b.mo94a() - 1 && this.f5736b.f5746f != null) {
                        this.f5736b.f5746f.mo1967a(this.f5736b.mo94a() / this.f5736b.f5743c);
                        this.f5736b.f5745e = true;
                    }
                }
            });
        }
    }

    public int mo94a() {
        return this.f5744d.size();
    }

    public void mo97a(C0102w c0102w, final int i) {
        final C2736j c2736j = (C2736j) this.f5744d.get(i);
        if (c0102w instanceof C2245c) {
            C2245c c2245c = (C2245c) c0102w;
            C2746d.m12254a(this.f5747g, c2245c.f5737n, c2736j.f7034a);
            c2245c.f5738o.setOnClickListener(new OnClickListener(this) {
                final /* synthetic */ C2247f f5734c;

                public void onClick(View view) {
                    if (this.f5734c.f5748h != null) {
                        this.f5734c.f5748h.m10923a(view, c2736j, i);
                    }
                }
            });
        } else {
            ((C2246d) c0102w).f5740n.setIndeterminate(true);
        }
        if (c2736j.f7036c) {
            ((C1018b) c0102w.f361a.getLayoutParams()).m5709a(true);
        } else {
            ((C1018b) c0102w.f361a.getLayoutParams()).m5709a(false);
        }
    }

    public void mo1919a(RecyclerView recyclerView) {
        m10931c(recyclerView);
        super.mo1919a(recyclerView);
    }

    public void m10936a(C2244b c2244b) {
        this.f5746f = c2244b;
    }

    public void m10937a(List<C2736j> list) {
        m10940b();
        int a = mo94a();
        int size = list.size();
        this.f5744d.addAll(list);
        m587b(a, size);
    }

    public int mo98b(int i) {
        return ((C2736j) this.f5744d.get(i)).f7036c ? 0 : 1;
    }

    public C0102w mo99b(ViewGroup viewGroup, int i) {
        return i == 1 ? new C2245c(this, LayoutInflater.from(viewGroup.getContext()).inflate(C1142R.layout.item_grid_image_progres, viewGroup, false)) : new C2246d(LayoutInflater.from(viewGroup.getContext()).inflate(C1142R.layout.item_progress, viewGroup, false));
    }

    public void m10940b() {
        this.f5745e = false;
        for (int i = 0; i < mo94a(); i++) {
            if (((C2736j) this.f5744d.get(i)).f7036c) {
                this.f5744d.remove(i);
                m600e(i);
            }
        }
    }

    public void m10941c() {
        if (mo94a() != 0) {
            this.f5744d.add(new C2736j(true));
            m597d(mo94a() - 1);
            this.f5745e = true;
        }
    }
}
