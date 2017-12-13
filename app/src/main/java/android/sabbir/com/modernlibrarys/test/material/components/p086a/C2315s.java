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
import com.material.components.p091e.C2732g;
import java.util.ArrayList;
import java.util.List;

public class C2315s extends C0105a<C0102w> {
    private List<C2732g> f5917a = new ArrayList();
    private Context f5918b;
    private C2312a f5919c;
    private C2313b f5920d;

    public interface C2312a {
        void mo1964a(View view, C2732g c2732g, int i);
    }

    public interface C2313b {
        void mo1965a(View view, C2732g c2732g, MenuItem menuItem);
    }

    public class C2314c extends C0102w {
        public ImageView f5911n;
        public TextView f5912o;
        public TextView f5913p;
        public ImageButton f5914q;
        public View f5915r;
        final /* synthetic */ C2315s f5916s;

        public C2314c(C2315s c2315s, View view) {
            this.f5916s = c2315s;
            super(view);
            this.f5911n = (ImageView) view.findViewById(C1142R.id.image);
            this.f5912o = (TextView) view.findViewById(C1142R.id.title);
            this.f5913p = (TextView) view.findViewById(C1142R.id.brief);
            this.f5914q = (ImageButton) view.findViewById(C1142R.id.more);
            this.f5915r = view.findViewById(C1142R.id.lyt_parent);
        }
    }

    public C2315s(Context context, List<C2732g> list) {
        this.f5917a = list;
        this.f5918b = context;
    }

    private void m11069a(final View view, final C2732g c2732g) {
        at atVar = new at(this.f5918b, view);
        atVar.m6271a(new C1085b(this) {
            final /* synthetic */ C2315s f5910c;

            public boolean mo1920a(MenuItem menuItem) {
                this.f5910c.f5920d.mo1965a(view, c2732g, menuItem);
                return true;
            }
        });
        atVar.m6270a((int) C1142R.menu.menu_song_more);
        atVar.m6272b();
    }

    public int mo94a() {
        return this.f5917a.size();
    }

    public void mo97a(C0102w c0102w, final int i) {
        if (c0102w instanceof C2314c) {
            C2314c c2314c = (C2314c) c0102w;
            final C2732g c2732g = (C2732g) this.f5917a.get(i);
            c2314c.f5912o.setText(c2732g.f7023c);
            c2314c.f5913p.setText(c2732g.f7024d);
            C2746d.m12254a(this.f5918b, c2314c.f5911n, c2732g.f7021a);
            c2314c.f5915r.setOnClickListener(new OnClickListener(this) {
                final /* synthetic */ C2315s f5905b;

                public void onClick(View view) {
                    if (this.f5905b.f5919c != null) {
                        this.f5905b.f5919c.mo1964a(view, (C2732g) this.f5905b.f5917a.get(i), i);
                    }
                }
            });
            c2314c.f5914q.setOnClickListener(new OnClickListener(this) {
                final /* synthetic */ C2315s f5907b;

                public void onClick(View view) {
                    if (this.f5907b.f5920d != null) {
                        this.f5907b.m11069a(view, c2732g);
                    }
                }
            });
        }
    }

    public void m11075a(C2312a c2312a) {
        this.f5919c = c2312a;
    }

    public void m11076a(C2313b c2313b) {
        this.f5920d = c2313b;
    }

    public C0102w mo99b(ViewGroup viewGroup, int i) {
        return new C2314c(this, LayoutInflater.from(viewGroup.getContext()).inflate(C1142R.layout.item_music_song, viewGroup, false));
    }
}
