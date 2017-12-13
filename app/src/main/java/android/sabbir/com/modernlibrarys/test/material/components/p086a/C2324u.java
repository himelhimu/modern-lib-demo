package android.sabbir.com.modernlibrarys.test.material.components.p086a;

import android.content.Context;
import android.support.v7.widget.RecyclerView.C0102w;
import android.support.v7.widget.RecyclerView.C0105a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.C1142R;
import com.material.components.p091e.C2738l;
import java.util.ArrayList;
import java.util.List;

public class C2324u extends C0105a<C0102w> {
    private List<C2738l> f5940a = new ArrayList();
    private Context f5941b;
    private C2322a f5942c;

    public interface C2322a {
        void mo1972a(View view, C2738l c2738l, int i);
    }

    public class C2323b extends C0102w {
        public ImageView f5935n;
        public TextView f5936o;
        public TextView f5937p;
        public View f5938q;
        final /* synthetic */ C2324u f5939r;

        public C2323b(C2324u c2324u, View view) {
            this.f5939r = c2324u;
            super(view);
            this.f5935n = (ImageView) view.findViewById(C1142R.id.image);
            this.f5936o = (TextView) view.findViewById(C1142R.id.title);
            this.f5937p = (TextView) view.findViewById(C1142R.id.brief);
            this.f5938q = view.findViewById(C1142R.id.lyt_parent);
        }
    }

    public C2324u(Context context, List<C2738l> list) {
        this.f5940a = list;
        this.f5941b = context;
    }

    public int mo94a() {
        return this.f5940a.size();
    }

    public void mo97a(C0102w c0102w, final int i) {
        if (c0102w instanceof C2323b) {
            C2323b c2323b = (C2323b) c0102w;
            C2738l c2738l = (C2738l) this.f5940a.get(i);
            c2323b.f5936o.setText(c2738l.f7042c);
            c2323b.f5937p.setText(c2738l.f7043d);
            c2323b.f5935n.setImageResource(c2738l.f7040a);
            c2323b.f5938q.setOnClickListener(new OnClickListener(this) {
                final /* synthetic */ C2324u f5934b;

                public void onClick(View view) {
                    if (this.f5934b.f5942c != null) {
                        this.f5934b.f5942c.mo1972a(view, (C2738l) this.f5934b.f5940a.get(i), i);
                    }
                }
            });
        }
    }

    public void m11092a(C2322a c2322a) {
        this.f5942c = c2322a;
    }

    public C0102w mo99b(ViewGroup viewGroup, int i) {
        return new C2323b(this, LayoutInflater.from(viewGroup.getContext()).inflate(C1142R.layout.item_shop_category, viewGroup, false));
    }
}
