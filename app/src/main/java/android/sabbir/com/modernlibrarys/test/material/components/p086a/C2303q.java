package android.sabbir.com.modernlibrarys.test.material.components.p086a;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.C0102w;
import android.support.v7.widget.RecyclerView.C0105a;
import android.support.v7.widget.RecyclerView.C0995m;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.C1142R;
import com.material.components.p089f.C2741a;
import com.material.components.p091e.C2727b;
import java.util.ArrayList;
import java.util.List;

public class C2303q extends C0105a<C0102w> {
    private final int f5875a = 1;
    private final int f5876b = 0;
    private List<C2727b> f5877c = new ArrayList();
    private Context f5878d;
    private C2300a f5879e;
    private int f5880f = 0;
    private int f5881g = -1;
    private boolean f5882h = true;

    class C22992 extends C0995m {
        final /* synthetic */ C2303q f5868a;

        C22992(C2303q c2303q) {
            this.f5868a = c2303q;
        }

        public void mo1038a(RecyclerView recyclerView, int i) {
            this.f5868a.f5882h = false;
            super.mo1038a(recyclerView, i);
        }
    }

    public interface C2300a {
        void mo1966a(View view, C2727b c2727b, int i);
    }

    public class C2301b extends C0102w {
        public ImageView f5869n;
        public TextView f5870o;
        public TextView f5871p;
        public View f5872q;
        final /* synthetic */ C2303q f5873r;

        public C2301b(C2303q c2303q, View view) {
            this.f5873r = c2303q;
            super(view);
            this.f5869n = (ImageView) view.findViewById(C1142R.id.image);
            this.f5870o = (TextView) view.findViewById(C1142R.id.name);
            this.f5871p = (TextView) view.findViewById(C1142R.id.date);
            this.f5872q = view.findViewById(C1142R.id.lyt_parent);
        }
    }

    public static class C2302c extends C0102w {
        public TextView f5874n;

        public C2302c(View view) {
            super(view);
            this.f5874n = (TextView) view.findViewById(C1142R.id.title_section);
        }
    }

    public C2303q(Context context, List<C2727b> list, int i) {
        this.f5877c = list;
        this.f5878d = context;
        this.f5880f = i;
    }

    private void m11038a(View view, int i) {
        if (i > this.f5881g) {
            C2741a.m12237a(view, this.f5882h ? i : -1, this.f5880f);
            this.f5881g = i;
        }
    }

    public int mo94a() {
        return this.f5877c.size();
    }

    public void mo97a(C0102w c0102w, final int i) {
        C2727b c2727b = (C2727b) this.f5877c.get(i);
        if (c0102w instanceof C2301b) {
            C2301b c2301b = (C2301b) c0102w;
            c2301b.f5870o.setText(c2727b.f6994b);
            c2301b.f5871p.setText(c2727b.f6995c);
            c2301b.f5869n.setImageResource(c2727b.f6993a);
            c2301b.f5872q.setOnClickListener(new OnClickListener(this) {
                final /* synthetic */ C2303q f5867b;

                public void onClick(View view) {
                    if (this.f5867b.f5879e != null) {
                        this.f5867b.f5879e.mo1966a(view, (C2727b) this.f5867b.f5877c.get(i), i);
                    }
                }
            });
        } else {
            ((C2302c) c0102w).f5874n.setText(c2727b.f6994b);
        }
        m11038a(c0102w.f361a, i);
    }

    public void mo1919a(RecyclerView recyclerView) {
        recyclerView.m362a(new C22992(this));
        super.mo1919a(recyclerView);
    }

    public void m11044a(C2300a c2300a) {
        this.f5879e = c2300a;
    }

    public int mo98b(int i) {
        return ((C2727b) this.f5877c.get(i)).f6996d ? 0 : 1;
    }

    public C0102w mo99b(ViewGroup viewGroup, int i) {
        return i == 1 ? new C2301b(this, LayoutInflater.from(viewGroup.getContext()).inflate(C1142R.layout.item_folder_file, viewGroup, false)) : new C2302c(LayoutInflater.from(viewGroup.getContext()).inflate(C1142R.layout.item_section_folder_file, viewGroup, false));
    }
}
