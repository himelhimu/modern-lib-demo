package android.sabbir.com.modernlibrarys.test.material.components.p086a;

import android.content.Context;
import android.support.v7.widget.RecyclerView.C0102w;
import android.support.v7.widget.RecyclerView.C0105a;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.C1142R;
import com.material.components.p089f.C2746d;
import com.material.components.p091e.C2729d;
import java.util.ArrayList;
import java.util.List;

public class C2308r extends C0105a<C2307b> {
    private Context f5899a;
    private List<C2729d> f5900b;
    private C2306a f5901c = null;
    private SparseBooleanArray f5902d;
    private int f5903e = -1;

    public interface C2306a {
        void mo1952a(View view, C2729d c2729d, int i);

        void mo1953b(View view, C2729d c2729d, int i);
    }

    public class C2307b extends C0102w {
        public TextView f5889n;
        public TextView f5890o;
        public TextView f5891p;
        public TextView f5892q;
        public TextView f5893r;
        public ImageView f5894s;
        public RelativeLayout f5895t;
        public RelativeLayout f5896u;
        public View f5897v;
        final /* synthetic */ C2308r f5898w;

        public C2307b(C2308r c2308r, View view) {
            this.f5898w = c2308r;
            super(view);
            this.f5889n = (TextView) view.findViewById(C1142R.id.from);
            this.f5890o = (TextView) view.findViewById(C1142R.id.email);
            this.f5891p = (TextView) view.findViewById(C1142R.id.message);
            this.f5892q = (TextView) view.findViewById(C1142R.id.date);
            this.f5893r = (TextView) view.findViewById(C1142R.id.image_letter);
            this.f5894s = (ImageView) view.findViewById(C1142R.id.image);
            this.f5895t = (RelativeLayout) view.findViewById(C1142R.id.lyt_checked);
            this.f5896u = (RelativeLayout) view.findViewById(C1142R.id.lyt_image);
            this.f5897v = view.findViewById(C1142R.id.lyt_parent);
        }
    }

    public C2308r(Context context, List<C2729d> list) {
        this.f5899a = context;
        this.f5900b = list;
        this.f5902d = new SparseBooleanArray();
    }

    private void m11050a(C2307b c2307b, C2729d c2729d) {
        if (c2729d.f7003a != null) {
            C2746d.m12264b(this.f5899a, c2307b.f5894s, c2729d.f7003a.intValue());
            c2307b.f5894s.setColorFilter(null);
            c2307b.f5893r.setVisibility(8);
            return;
        }
        c2307b.f5894s.setImageResource(C1142R.drawable.shape_circle);
        c2307b.f5894s.setColorFilter(c2729d.f7009g);
        c2307b.f5893r.setVisibility(0);
    }

    private void m11051b(C2307b c2307b, int i) {
        if (this.f5902d.get(i, false)) {
            c2307b.f5896u.setVisibility(8);
            c2307b.f5895t.setVisibility(0);
            if (this.f5903e == i) {
                m11052h();
                return;
            }
            return;
        }
        c2307b.f5895t.setVisibility(8);
        c2307b.f5896u.setVisibility(0);
        if (this.f5903e == i) {
            m11052h();
        }
    }

    private void m11052h() {
        this.f5903e = -1;
    }

    public int mo94a() {
        return this.f5900b.size();
    }

    public C2307b m11054a(ViewGroup viewGroup, int i) {
        return new C2307b(this, LayoutInflater.from(viewGroup.getContext()).inflate(C1142R.layout.item_inbox, viewGroup, false));
    }

    public void m11056a(C2306a c2306a) {
        this.f5901c = c2306a;
    }

    public void m11057a(C2307b c2307b, final int i) {
        final C2729d c2729d = (C2729d) this.f5900b.get(i);
        c2307b.f5889n.setText(c2729d.f7005c);
        c2307b.f5890o.setText(c2729d.f7006d);
        c2307b.f5891p.setText(c2729d.f7007e);
        c2307b.f5892q.setText(c2729d.f7008f);
        c2307b.f5893r.setText(c2729d.f7005c.substring(0, 1));
        c2307b.f5897v.setActivated(this.f5902d.get(i, false));
        c2307b.f5897v.setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ C2308r f5885c;

            public void onClick(View view) {
                if (this.f5885c.f5901c != null) {
                    this.f5885c.f5901c.mo1952a(view, c2729d, i);
                }
            }
        });
        c2307b.f5897v.setOnLongClickListener(new OnLongClickListener(this) {
            final /* synthetic */ C2308r f5888c;

            public boolean onLongClick(View view) {
                if (this.f5888c.f5901c == null) {
                    return false;
                }
                this.f5888c.f5901c.mo1953b(view, c2729d, i);
                return true;
            }
        });
        m11051b(c2307b, i);
        m11050a(c2307b, c2729d);
    }

    public /* synthetic */ C0102w mo99b(ViewGroup viewGroup, int i) {
        return m11054a(viewGroup, i);
    }

    public void m11059b() {
        this.f5902d.clear();
        m602f();
    }

    public int m11060c() {
        return this.f5902d.size();
    }

    public C2729d m11061f(int i) {
        return (C2729d) this.f5900b.get(i);
    }

    public List<Integer> m11062g() {
        List<Integer> arrayList = new ArrayList(this.f5902d.size());
        for (int i = 0; i < this.f5902d.size(); i++) {
            arrayList.add(Integer.valueOf(this.f5902d.keyAt(i)));
        }
        return arrayList;
    }

    public void m11063g(int i) {
        this.f5903e = i;
        if (this.f5902d.get(i, false)) {
            this.f5902d.delete(i);
        } else {
            this.f5902d.put(i, true);
        }
        m594c(i);
    }

    public void m11064h(int i) {
        this.f5900b.remove(i);
        m11052h();
    }
}
