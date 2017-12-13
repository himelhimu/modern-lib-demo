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
import com.material.components.p089f.C2746d;
import com.material.components.p091e.C2733h;
import java.util.ArrayList;
import java.util.List;

public class C2236d extends C0105a<C0102w> {
    private List<C2733h> f5718a = new ArrayList();
    private Context f5719b;
    private C2234a f5720c;

    public interface C2234a {
        void mo1944a(View view, C2733h c2733h, int i);
    }

    public class C2235b extends C0102w {
        public ImageView f5713n;
        public TextView f5714o;
        public TextView f5715p;
        public View f5716q;
        final /* synthetic */ C2236d f5717r;

        public C2235b(C2236d c2236d, View view) {
            this.f5717r = c2236d;
            super(view);
            this.f5713n = (ImageView) view.findViewById(C1142R.id.image);
            this.f5714o = (TextView) view.findViewById(C1142R.id.name);
            this.f5715p = (TextView) view.findViewById(C1142R.id.brief);
            this.f5716q = view.findViewById(C1142R.id.lyt_parent);
        }
    }

    public C2236d(Context context, List<C2733h> list) {
        this.f5718a = list;
        this.f5719b = context;
    }

    public int mo94a() {
        return this.f5718a.size();
    }

    public void mo97a(C0102w c0102w, final int i) {
        C2733h c2733h = (C2733h) this.f5718a.get(i);
        if (c0102w instanceof C2235b) {
            C2235b c2235b = (C2235b) c0102w;
            c2235b.f5714o.setText(c2733h.f7027c);
            c2235b.f5715p.setText("Mobile");
            C2746d.m12254a(this.f5719b, c2235b.f5713n, c2733h.f7025a);
            c2235b.f5716q.setOnClickListener(new OnClickListener(this) {
                final /* synthetic */ C2236d f5712b;

                public void onClick(View view) {
                    if (this.f5712b.f5720c != null) {
                        this.f5712b.f5720c.mo1944a(view, (C2733h) this.f5712b.f5718a.get(i), i);
                    }
                }
            });
        }
    }

    public void m10913a(C2234a c2234a) {
        this.f5720c = c2234a;
    }

    public C0102w mo99b(ViewGroup viewGroup, int i) {
        return new C2235b(this, LayoutInflater.from(viewGroup.getContext()).inflate(C1142R.layout.item_grid_caller, viewGroup, false));
    }
}
