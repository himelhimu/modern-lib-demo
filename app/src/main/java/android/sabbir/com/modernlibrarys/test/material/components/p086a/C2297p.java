package android.sabbir.com.modernlibrarys.test.material.components.p086a;

import android.content.Context;
import android.support.v7.widget.RecyclerView.C0102w;
import android.support.v7.widget.RecyclerView.C0105a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.C1142R;
import com.material.components.p089f.C2746d;
import com.material.components.p089f.C2754e;
import com.material.components.p091e.C2740n;
import java.util.ArrayList;
import java.util.List;

public class C2297p extends C0105a<C0102w> {
    private List<C2740n> f5863a = new ArrayList();
    private Context f5864b;
    private C2295a f5865c;

    public interface C2295a {
        void mo1951a(View view, C2740n c2740n, int i);
    }

    public class C2296b extends C0102w {
        public ImageView f5857n;
        public TextView f5858o;
        public ImageButton f5859p;
        public View f5860q;
        public View f5861r;
        final /* synthetic */ C2297p f5862s;

        public C2296b(C2297p c2297p, View view) {
            this.f5862s = c2297p;
            super(view);
            this.f5857n = (ImageView) view.findViewById(C1142R.id.image);
            this.f5858o = (TextView) view.findViewById(C1142R.id.name);
            this.f5859p = (ImageButton) view.findViewById(C1142R.id.bt_expand);
            this.f5860q = view.findViewById(C1142R.id.lyt_expand);
            this.f5861r = view.findViewById(C1142R.id.lyt_parent);
        }
    }

    public C2297p(Context context, List<C2740n> list) {
        this.f5863a = list;
        this.f5864b = context;
    }

    private boolean m11029a(boolean z, View view, View view2) {
        C2746d.m12259a(z, view);
        if (z) {
            C2754e.m12266a(view2);
        } else {
            C2754e.m12269b(view2);
        }
        return z;
    }

    public int mo94a() {
        return this.f5863a.size();
    }

    public void mo97a(C0102w c0102w, final int i) {
        if (c0102w instanceof C2296b) {
            final C2296b c2296b = (C2296b) c0102w;
            final C2740n c2740n = (C2740n) this.f5863a.get(i);
            c2296b.f5858o.setText(c2740n.f7051c);
            C2746d.m12254a(this.f5864b, c2296b.f5857n, c2740n.f7049a);
            c2296b.f5861r.setOnClickListener(new OnClickListener(this) {
                final /* synthetic */ C2297p f5852b;

                public void onClick(View view) {
                    if (this.f5852b.f5865c != null) {
                        this.f5852b.f5865c.mo1951a(view, (C2740n) this.f5852b.f5863a.get(i), i);
                    }
                }
            });
            c2296b.f5859p.setOnClickListener(new OnClickListener(this) {
                final /* synthetic */ C2297p f5856d;

                public void onClick(View view) {
                    ((C2740n) this.f5856d.f5863a.get(i)).f7052d = this.f5856d.m11029a(!c2740n.f7052d, view, c2296b.f5860q);
                }
            });
            if (c2740n.f7052d) {
                c2296b.f5860q.setVisibility(0);
            } else {
                c2296b.f5860q.setVisibility(8);
            }
            C2746d.m12260a(c2740n.f7052d, c2296b.f5859p, false);
        }
    }

    public void m11033a(C2295a c2295a) {
        this.f5865c = c2295a;
    }

    public C0102w mo99b(ViewGroup viewGroup, int i) {
        return new C2296b(this, LayoutInflater.from(viewGroup.getContext()).inflate(C1142R.layout.item_expand, viewGroup, false));
    }
}
