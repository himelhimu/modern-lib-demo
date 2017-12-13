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

public class C2207a extends C0105a<C0102w> {
    private List<C2733h> f5641a = new ArrayList();
    private Context f5642b;
    private C2205a f5643c;

    public interface C2205a {
        void mo1937a(View view, C2733h c2733h, int i);
    }

    public class C2206b extends C0102w {
        public ImageView f5636n;
        public TextView f5637o;
        public TextView f5638p;
        public View f5639q;
        final /* synthetic */ C2207a f5640r;

        public C2206b(C2207a c2207a, View view) {
            this.f5640r = c2207a;
            super(view);
            this.f5636n = (ImageView) view.findViewById(C1142R.id.image);
            this.f5637o = (TextView) view.findViewById(C1142R.id.name);
            this.f5638p = (TextView) view.findViewById(C1142R.id.email);
            this.f5639q = view.findViewById(C1142R.id.lyt_parent);
        }
    }

    public C2207a(Context context, List<C2733h> list) {
        this.f5641a = list;
        this.f5642b = context;
    }

    public int mo94a() {
        return this.f5641a.size();
    }

    public void mo97a(C0102w c0102w, final int i) {
        if (c0102w instanceof C2206b) {
            C2206b c2206b = (C2206b) c0102w;
            C2733h c2733h = (C2733h) this.f5641a.get(i);
            c2206b.f5637o.setText(c2733h.f7027c);
            c2206b.f5638p.setText(c2733h.f7028d);
            C2746d.m12264b(this.f5642b, c2206b.f5636n, c2733h.f7025a);
            c2206b.f5639q.setOnClickListener(new OnClickListener(this) {
                final /* synthetic */ C2207a f5635b;

                public void onClick(View view) {
                    if (this.f5635b.f5643c != null) {
                        this.f5635b.f5643c.mo1937a(view, (C2733h) this.f5635b.f5641a.get(i), i);
                    }
                }
            });
        }
    }

    public void m10855a(C2205a c2205a) {
        this.f5643c = c2205a;
    }

    public C0102w mo99b(ViewGroup viewGroup, int i) {
        return new C2206b(this, LayoutInflater.from(viewGroup.getContext()).inflate(C1142R.layout.item_people_contacts, viewGroup, false));
    }
}
