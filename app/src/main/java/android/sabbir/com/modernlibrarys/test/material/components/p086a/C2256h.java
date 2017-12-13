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

public class C2256h extends C0105a<C0102w> {
    private List<C2738l> f5767a = new ArrayList();
    private Context f5768b;
    private C2254a f5769c;

    public interface C2254a {
        void mo1970a(View view, C2738l c2738l, int i);
    }

    public class C2255b extends C0102w {
        public ImageView f5763n;
        public TextView f5764o;
        public View f5765p;
        final /* synthetic */ C2256h f5766q;

        public C2255b(C2256h c2256h, View view) {
            this.f5766q = c2256h;
            super(view);
            this.f5763n = (ImageView) view.findViewById(C1142R.id.image);
            this.f5764o = (TextView) view.findViewById(C1142R.id.title);
            this.f5765p = view.findViewById(C1142R.id.lyt_parent);
        }
    }

    public C2256h(Context context, List<C2738l> list) {
        this.f5767a = list;
        this.f5768b = context;
    }

    public int mo94a() {
        return this.f5767a.size();
    }

    public void mo97a(C0102w c0102w, final int i) {
        if (c0102w instanceof C2255b) {
            C2255b c2255b = (C2255b) c0102w;
            C2738l c2738l = (C2738l) this.f5767a.get(i);
            c2255b.f5764o.setText(c2738l.f7042c);
            c2255b.f5763n.setImageDrawable(c2738l.f7041b);
            c2255b.f5765p.setOnClickListener(new OnClickListener(this) {
                final /* synthetic */ C2256h f5762b;

                public void onClick(View view) {
                    if (this.f5762b.f5769c != null) {
                        this.f5762b.f5769c.mo1970a(view, (C2738l) this.f5762b.f5767a.get(i), i);
                    }
                }
            });
        }
    }

    public void m10954a(C2254a c2254a) {
        this.f5769c = c2254a;
    }

    public C0102w mo99b(ViewGroup viewGroup, int i) {
        return new C2255b(this, LayoutInflater.from(viewGroup.getContext()).inflate(C1142R.layout.item_shop_category_card, viewGroup, false));
    }
}
