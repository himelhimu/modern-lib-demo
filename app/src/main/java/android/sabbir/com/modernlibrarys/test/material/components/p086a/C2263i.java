package android.sabbir.com.modernlibrarys.test.material.components.p086a;

import android.content.Context;
import android.support.v7.widget.RecyclerView.C0102w;
import android.support.v7.widget.RecyclerView.C0105a;
import android.support.v7.widget.at;
import android.support.v7.widget.at.C1085b;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.C1142R;
import com.material.components.p089f.C2746d;
import com.material.components.p091e.C2739m;
import java.util.ArrayList;
import java.util.List;

public class C2263i extends C0105a<C0102w> {
    private List<C2739m> f5783a = new ArrayList();
    private Context f5784b;
    private C2260a f5785c;
    private C2261b f5786d;

    public interface C2260a {
        void mo1973a(View view, C2739m c2739m, int i);
    }

    public interface C2261b {
        void mo1974a(View view, C2739m c2739m, MenuItem menuItem);
    }

    public class C2262c extends C0102w {
        public ImageView f5777n;
        public TextView f5778o;
        public TextView f5779p;
        public ImageButton f5780q;
        public View f5781r;
        final /* synthetic */ C2263i f5782s;

        public C2262c(C2263i c2263i, View view) {
            this.f5782s = c2263i;
            super(view);
            this.f5777n = (ImageView) view.findViewById(C1142R.id.image);
            this.f5778o = (TextView) view.findViewById(C1142R.id.title);
            this.f5779p = (TextView) view.findViewById(C1142R.id.price);
            this.f5780q = (ImageButton) view.findViewById(C1142R.id.more);
            this.f5781r = view.findViewById(C1142R.id.lyt_parent);
        }
    }

    public C2263i(Context context, List<C2739m> list) {
        this.f5783a = list;
        this.f5784b = context;
    }

    private void m10960a(final View view, final C2739m c2739m) {
        at atVar = new at(this.f5784b, view);
        atVar.m6271a(new C1085b(this) {
            final /* synthetic */ C2263i f5776c;

            public boolean mo1920a(MenuItem menuItem) {
                this.f5776c.f5786d.mo1974a(view, c2739m, menuItem);
                return true;
            }
        });
        atVar.m6270a((int) C1142R.menu.menu_product_more);
        atVar.m6272b();
    }

    public int mo94a() {
        return this.f5783a.size();
    }

    public void mo97a(C0102w c0102w, final int i) {
        if (c0102w instanceof C2262c) {
            C2262c c2262c = (C2262c) c0102w;
            final C2739m c2739m = (C2739m) this.f5783a.get(i);
            c2262c.f5778o.setText(c2739m.f7047c);
            c2262c.f5779p.setText(c2739m.f7048d);
            C2746d.m12254a(this.f5784b, c2262c.f5777n, c2739m.f7045a);
            c2262c.f5781r.setOnClickListener(new OnClickListener(this) {
                final /* synthetic */ C2263i f5771b;

                public void onClick(View view) {
                    if (this.f5771b.f5785c != null) {
                        this.f5771b.f5785c.mo1973a(view, (C2739m) this.f5771b.f5783a.get(i), i);
                    }
                }
            });
            c2262c.f5780q.setOnClickListener(new OnClickListener(this) {
                final /* synthetic */ C2263i f5773b;

                public void onClick(View view) {
                    if (this.f5773b.f5786d != null) {
                        this.f5773b.m10960a(view, c2739m);
                    }
                }
            });
        }
    }

    public void m10966a(C2260a c2260a) {
        this.f5785c = c2260a;
    }

    public void m10967a(C2261b c2261b) {
        this.f5786d = c2261b;
    }

    public C0102w mo99b(ViewGroup viewGroup, int i) {
        return new C2262c(this, LayoutInflater.from(viewGroup.getContext()).inflate(C1142R.layout.item_shop_product_card, viewGroup, false));
    }
}
