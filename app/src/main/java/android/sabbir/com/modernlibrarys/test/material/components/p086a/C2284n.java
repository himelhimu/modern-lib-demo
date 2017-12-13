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

public class C2284n extends C0105a<C0102w> {
    private List<C2733h> f5835a = new ArrayList();
    private Context f5836b;
    private C2282a f5837c;

    public interface C2282a {
        void mo1938a(View view, C2733h c2733h, int i);
    }

    public class C2283b extends C0102w {
        public ImageView f5831n;
        public TextView f5832o;
        public View f5833p;
        final /* synthetic */ C2284n f5834q;

        public C2283b(C2284n c2284n, View view) {
            this.f5834q = c2284n;
            super(view);
            this.f5831n = (ImageView) view.findViewById(C1142R.id.image);
            this.f5832o = (TextView) view.findViewById(C1142R.id.name);
            this.f5833p = view.findViewById(C1142R.id.lyt_parent);
        }
    }

    public C2284n(Context context, List<C2733h> list) {
        this.f5835a = list;
        this.f5836b = context;
    }

    public int mo94a() {
        return this.f5835a.size();
    }

    public void mo97a(C0102w c0102w, final int i) {
        if (c0102w instanceof C2283b) {
            C2283b c2283b = (C2283b) c0102w;
            C2733h c2733h = (C2733h) this.f5835a.get(i);
            c2283b.f5832o.setText(c2733h.f7027c);
            C2746d.m12264b(this.f5836b, c2283b.f5831n, c2733h.f7025a);
            c2283b.f5833p.setOnClickListener(new OnClickListener(this) {
                final /* synthetic */ C2284n f5830b;

                public void onClick(View view) {
                    if (this.f5830b.f5837c != null) {
                        this.f5830b.f5837c.mo1938a(view, (C2733h) this.f5830b.f5835a.get(i), i);
                    }
                }
            });
        }
    }

    public void m11007a(C2282a c2282a) {
        this.f5837c = c2282a;
    }

    public C0102w mo99b(ViewGroup viewGroup, int i) {
        return new C2283b(this, LayoutInflater.from(viewGroup.getContext()).inflate(C1142R.layout.item_people_chat, viewGroup, false));
    }
}
