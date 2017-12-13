package android.sabbir.com.modernlibrarys.test.material.components.p086a;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.C0102w;
import android.support.v7.widget.RecyclerView.C0105a;
import android.support.v7.widget.RecyclerView.C0995m;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.C1142R;
import com.material.components.p087d.C2725b.C2333b;
import com.material.components.p087d.C2725b.C2335a;
import com.material.components.p089f.C2746d;
import com.material.components.p091e.C2740n;
import java.util.ArrayList;
import java.util.List;

public class C2336w extends C0105a<C0102w> implements C2335a {
    private List<C2740n> f5964a = new ArrayList();
    private List<C2740n> f5965b = new ArrayList();
    private Context f5966c;
    private C2332a f5967d;

    class C23313 extends C0995m {
        final /* synthetic */ C2336w f5957a;

        C23313(C2336w c2336w) {
            this.f5957a = c2336w;
        }

        public void mo1038a(RecyclerView recyclerView, int i) {
            for (C2740n indexOf : this.f5957a.f5965b) {
                int indexOf2 = this.f5957a.f5964a.indexOf(indexOf);
                if (indexOf2 != -1) {
                    this.f5957a.f5964a.remove(indexOf2);
                    this.f5957a.m600e(indexOf2);
                }
            }
            this.f5957a.f5965b.clear();
            super.mo1038a(recyclerView, i);
        }
    }

    public interface C2332a {
        void mo1954a(View view, C2740n c2740n, int i);
    }

    public class C2334b extends C0102w implements C2333b {
        public ImageView f5958n;
        public TextView f5959o;
        public ImageButton f5960p;
        public Button f5961q;
        public View f5962r;
        final /* synthetic */ C2336w f5963s;

        public C2334b(C2336w c2336w, View view) {
            this.f5963s = c2336w;
            super(view);
            this.f5958n = (ImageView) view.findViewById(C1142R.id.image);
            this.f5959o = (TextView) view.findViewById(C1142R.id.name);
            this.f5960p = (ImageButton) view.findViewById(C1142R.id.bt_move);
            this.f5961q = (Button) view.findViewById(C1142R.id.bt_undo);
            this.f5962r = view.findViewById(C1142R.id.lyt_parent);
        }

        public void mo1916y() {
            this.a.setBackgroundColor(this.f5963s.f5966c.getResources().getColor(C1142R.color.grey_5));
        }

        public void mo1921z() {
            this.a.setBackgroundColor(0);
        }
    }

    public C2336w(Context context, List<C2740n> list) {
        this.f5964a = list;
        this.f5966c = context;
    }

    public int mo94a() {
        return this.f5964a.size();
    }

    public void mo97a(C0102w c0102w, final int i) {
        if (c0102w instanceof C2334b) {
            C2334b c2334b = (C2334b) c0102w;
            C2740n c2740n = (C2740n) this.f5964a.get(i);
            c2334b.f5959o.setText(c2740n.f7051c);
            C2746d.m12254a(this.f5966c, c2334b.f5958n, c2740n.f7049a);
            c2334b.f5962r.setOnClickListener(new OnClickListener(this) {
                final /* synthetic */ C2336w f5954b;

                public void onClick(View view) {
                    if (this.f5954b.f5967d != null) {
                        this.f5954b.f5967d.mo1954a(view, (C2740n) this.f5954b.f5964a.get(i), i);
                    }
                }
            });
            c2334b.f5961q.setOnClickListener(new OnClickListener(this) {
                final /* synthetic */ C2336w f5956b;

                public void onClick(View view) {
                    ((C2740n) this.f5956b.f5964a.get(i)).f7054f = false;
                    this.f5956b.f5965b.remove(this.f5956b.f5964a.get(i));
                    this.f5956b.m594c(i);
                }
            });
            if (c2740n.f7054f) {
                c2334b.f5962r.setVisibility(8);
            } else {
                c2334b.f5962r.setVisibility(0);
            }
        }
    }

    public void mo1919a(RecyclerView recyclerView) {
        recyclerView.m362a(new C23313(this));
        super.mo1919a(recyclerView);
    }

    public void m11115a(C2332a c2332a) {
        this.f5967d = c2332a;
    }

    public C0102w mo99b(ViewGroup viewGroup, int i) {
        return new C2334b(this, LayoutInflater.from(viewGroup.getContext()).inflate(C1142R.layout.item_swipe, viewGroup, false));
    }

    public void mo1923f(int i) {
        if (((C2740n) this.f5964a.get(i)).f7054f) {
            this.f5965b.remove(this.f5964a.get(i));
            this.f5964a.remove(i);
            m600e(i);
            return;
        }
        ((C2740n) this.f5964a.get(i)).f7054f = true;
        this.f5965b.add(this.f5964a.get(i));
        m594c(i);
    }
}
