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

public class C2344y extends C0105a<C0102w> {
    private List<C2733h> f5985a = new ArrayList();
    private Context f5986b;
    private C2342a f5987c;

    public interface C2342a {
        void mo1929a(View view, C2733h c2733h, int i);
    }

    public class C2343b extends C0102w {
        public ImageView f5981n;
        public TextView f5982o;
        public View f5983p;
        final /* synthetic */ C2344y f5984q;

        public C2343b(C2344y c2344y, View view) {
            this.f5984q = c2344y;
            super(view);
            this.f5981n = (ImageView) view.findViewById(C1142R.id.image);
            this.f5982o = (TextView) view.findViewById(C1142R.id.name);
            this.f5983p = view.findViewById(C1142R.id.lyt_parent);
        }
    }

    public C2344y(Context context, List<C2733h> list) {
        this.f5985a = list;
        this.f5986b = context;
    }

    public int mo94a() {
        return this.f5985a.size();
    }

    public void mo97a(C0102w c0102w, final int i) {
        if (c0102w instanceof C2343b) {
            C2343b c2343b = (C2343b) c0102w;
            final C2733h c2733h = (C2733h) this.f5985a.get(i);
            c2343b.f5982o.setText(c2733h.f7027c);
            C2746d.m12264b(this.f5986b, c2343b.f5981n, c2733h.f7025a);
            c2343b.f5983p.setOnClickListener(new OnClickListener(this) {
                final /* synthetic */ C2344y f5980c;

                public void onClick(View view) {
                    if (this.f5980c.f5987c != null) {
                        this.f5980c.f5987c.mo1929a(view, c2733h, i);
                    }
                }
            });
        }
    }

    public void m11129a(C2342a c2342a) {
        this.f5987c = c2342a;
    }

    public C0102w mo99b(ViewGroup viewGroup, int i) {
        return new C2343b(this, LayoutInflater.from(viewGroup.getContext()).inflate(C1142R.layout.item_people_left, viewGroup, false));
    }

    public C2733h m11131f(int i) {
        return (C2733h) this.f5985a.get(i);
    }
}
