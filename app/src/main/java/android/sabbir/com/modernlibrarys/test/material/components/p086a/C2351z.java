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
import com.material.components.p091e.C2733h;
import java.util.ArrayList;
import java.util.List;

public class C2351z extends C0105a<C0102w> {
    private List<C2733h> f6001a = new ArrayList();
    private Context f6002b;
    private C2348a f6003c;
    private C2349b f6004d;

    public interface C2348a {
        void mo1956a(View view, C2733h c2733h, int i);
    }

    public interface C2349b {
        void mo1957a(View view, C2733h c2733h, MenuItem menuItem);
    }

    public class C2350c extends C0102w {
        public ImageView f5996n;
        public TextView f5997o;
        public ImageButton f5998p;
        public View f5999q;
        final /* synthetic */ C2351z f6000r;

        public C2350c(C2351z c2351z, View view) {
            this.f6000r = c2351z;
            super(view);
            this.f5996n = (ImageView) view.findViewById(C1142R.id.image);
            this.f5997o = (TextView) view.findViewById(C1142R.id.name);
            this.f5998p = (ImageButton) view.findViewById(C1142R.id.more);
            this.f5999q = view.findViewById(C1142R.id.lyt_parent);
        }
    }

    public C2351z(Context context, List<C2733h> list) {
        this.f6001a = list;
        this.f6002b = context;
    }

    private void m11136a(final View view, final C2733h c2733h) {
        at atVar = new at(this.f6002b, view);
        atVar.m6271a(new C1085b(this) {
            final /* synthetic */ C2351z f5995c;

            public boolean mo1920a(MenuItem menuItem) {
                this.f5995c.f6004d.mo1957a(view, c2733h, menuItem);
                return true;
            }
        });
        atVar.m6270a((int) C1142R.menu.menu_people_more);
        atVar.m6272b();
    }

    public int mo94a() {
        return this.f6001a.size();
    }

    public void mo97a(C0102w c0102w, final int i) {
        if (c0102w instanceof C2350c) {
            C2350c c2350c = (C2350c) c0102w;
            final C2733h c2733h = (C2733h) this.f6001a.get(i);
            c2350c.f5997o.setText(c2733h.f7027c);
            C2746d.m12264b(this.f6002b, c2350c.f5996n, c2733h.f7025a);
            c2350c.f5999q.setOnClickListener(new OnClickListener(this) {
                final /* synthetic */ C2351z f5990c;

                public void onClick(View view) {
                    if (this.f5990c.f6003c != null) {
                        this.f5990c.f6003c.mo1956a(view, c2733h, i);
                    }
                }
            });
            c2350c.f5998p.setOnClickListener(new OnClickListener(this) {
                final /* synthetic */ C2351z f5992b;

                public void onClick(View view) {
                    if (this.f5992b.f6004d != null) {
                        this.f5992b.m11136a(view, c2733h);
                    }
                }
            });
        }
    }

    public void m11141a(C2348a c2348a) {
        this.f6003c = c2348a;
    }

    public void m11142a(C2349b c2349b) {
        this.f6004d = c2349b;
    }

    public C0102w mo99b(ViewGroup viewGroup, int i) {
        return new C2350c(this, LayoutInflater.from(viewGroup.getContext()).inflate(C1142R.layout.item_people_with_more, viewGroup, false));
    }
}
