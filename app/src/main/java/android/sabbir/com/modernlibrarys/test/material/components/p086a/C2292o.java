package android.sabbir.com.modernlibrarys.test.material.components.p086a;

import android.content.Context;
import android.support.v4.view.C0685u;
import android.support.v7.widget.RecyclerView.C0102w;
import android.support.v7.widget.RecyclerView.C0105a;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.C1142R;
import com.material.components.p087d.C2724a.C2289b;
import com.material.components.p087d.C2724a.C2291a;
import com.material.components.p089f.C2746d;
import com.material.components.p091e.C2740n;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C2292o extends C0105a<C0102w> implements C2291a {
    private List<C2740n> f5847a = new ArrayList();
    private Context f5848b;
    private C2287a f5849c;
    private C2288b f5850d = null;

    public interface C2287a {
        void mo1949a(View view, C2740n c2740n, int i);
    }

    public interface C2288b {
        void mo1950a(C0102w c0102w);
    }

    public class C2290c extends C0102w implements C2289b {
        public ImageView f5842n;
        public TextView f5843o;
        public ImageButton f5844p;
        public View f5845q;
        final /* synthetic */ C2292o f5846r;

        public C2290c(C2292o c2292o, View view) {
            this.f5846r = c2292o;
            super(view);
            this.f5842n = (ImageView) view.findViewById(C1142R.id.image);
            this.f5843o = (TextView) view.findViewById(C1142R.id.name);
            this.f5844p = (ImageButton) view.findViewById(C1142R.id.bt_move);
            this.f5845q = view.findViewById(C1142R.id.lyt_parent);
        }

        public void mo1916y() {
            this.a.setBackgroundColor(this.f5846r.f5848b.getResources().getColor(C1142R.color.grey_5));
        }

        public void mo1921z() {
            this.a.setBackgroundColor(0);
        }
    }

    public C2292o(Context context, List<C2740n> list) {
        this.f5847a = list;
        this.f5848b = context;
    }

    public int mo94a() {
        return this.f5847a.size();
    }

    public void mo97a(final C0102w c0102w, final int i) {
        if (c0102w instanceof C2290c) {
            C2290c c2290c = (C2290c) c0102w;
            C2740n c2740n = (C2740n) this.f5847a.get(i);
            c2290c.f5843o.setText(c2740n.f7051c);
            C2746d.m12254a(this.f5848b, c2290c.f5842n, c2740n.f7049a);
            c2290c.f5845q.setOnClickListener(new OnClickListener(this) {
                final /* synthetic */ C2292o f5839b;

                public void onClick(View view) {
                    if (this.f5839b.f5849c != null) {
                        this.f5839b.f5849c.mo1949a(view, (C2740n) this.f5839b.f5847a.get(i), i);
                    }
                }
            });
            c2290c.f5844p.setOnTouchListener(new OnTouchListener(this) {
                final /* synthetic */ C2292o f5841b;

                public boolean onTouch(View view, MotionEvent motionEvent) {
                    if (C0685u.m3771a(motionEvent) == 0 && this.f5841b.f5850d != null) {
                        this.f5841b.f5850d.mo1950a(c0102w);
                    }
                    return false;
                }
            });
        }
    }

    public void m11022a(C2287a c2287a) {
        this.f5849c = c2287a;
    }

    public void m11023a(C2288b c2288b) {
        this.f5850d = c2288b;
    }

    public C0102w mo99b(ViewGroup viewGroup, int i) {
        return new C2290c(this, LayoutInflater.from(viewGroup.getContext()).inflate(C1142R.layout.item_drag, viewGroup, false));
    }

    public boolean mo1922d(int i, int i2) {
        Collections.swap(this.f5847a, i, i2);
        m579a(i, i2);
        return true;
    }
}
