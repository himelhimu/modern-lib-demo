package android.sabbir.com.modernlibrarys.test.material.components.p086a;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.C0102w;
import android.support.v7.widget.RecyclerView.C0105a;
import android.support.v7.widget.RecyclerView.C0995m;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.C1142R;
import com.material.components.p089f.C2741a;
import com.material.components.p089f.C2746d;
import com.material.components.p091e.C2733h;
import java.util.ArrayList;
import java.util.List;

public class C2280m extends C0105a<C0102w> {
    private List<C2733h> f5823a = new ArrayList();
    private Context f5824b;
    private C2278a f5825c;
    private int f5826d = 0;
    private int f5827e = -1;
    private boolean f5828f = true;

    class C22772 extends C0995m {
        final /* synthetic */ C2280m f5818a;

        C22772(C2280m c2280m) {
            this.f5818a = c2280m;
        }

        public void mo1038a(RecyclerView recyclerView, int i) {
            this.f5818a.f5828f = false;
            super.mo1038a(recyclerView, i);
        }
    }

    public interface C2278a {
        void mo1948a(View view, C2733h c2733h, int i);
    }

    public class C2279b extends C0102w {
        public ImageView f5819n;
        public TextView f5820o;
        public View f5821p;
        final /* synthetic */ C2280m f5822q;

        public C2279b(C2280m c2280m, View view) {
            this.f5822q = c2280m;
            super(view);
            this.f5819n = (ImageView) view.findViewById(C1142R.id.image);
            this.f5820o = (TextView) view.findViewById(C1142R.id.name);
            this.f5821p = view.findViewById(C1142R.id.lyt_parent);
        }
    }

    public C2280m(Context context, List<C2733h> list, int i) {
        this.f5823a = list;
        this.f5824b = context;
        this.f5826d = i;
    }

    private void m10994a(View view, int i) {
        if (i > this.f5827e) {
            C2741a.m12237a(view, this.f5828f ? i : -1, this.f5826d);
            this.f5827e = i;
        }
    }

    public int mo94a() {
        return this.f5823a.size();
    }

    public void mo97a(C0102w c0102w, final int i) {
        Log.e("onBindViewHolder", "onBindViewHolder : " + i);
        if (c0102w instanceof C2279b) {
            C2279b c2279b = (C2279b) c0102w;
            C2733h c2733h = (C2733h) this.f5823a.get(i);
            c2279b.f5820o.setText(i + " | " + c2733h.f7027c);
            C2746d.m12264b(this.f5824b, c2279b.f5819n, c2733h.f7025a);
            c2279b.f5821p.setOnClickListener(new OnClickListener(this) {
                final /* synthetic */ C2280m f5817b;

                public void onClick(View view) {
                    if (this.f5817b.f5825c != null) {
                        this.f5817b.f5825c.mo1948a(view, (C2733h) this.f5817b.f5823a.get(i), i);
                    }
                }
            });
            m10994a(c2279b.a, i);
        }
    }

    public void mo1919a(RecyclerView recyclerView) {
        recyclerView.m362a(new C22772(this));
        super.mo1919a(recyclerView);
    }

    public void m11000a(C2278a c2278a) {
        this.f5825c = c2278a;
    }

    public C0102w mo99b(ViewGroup viewGroup, int i) {
        return new C2279b(this, LayoutInflater.from(viewGroup.getContext()).inflate(C1142R.layout.item_people_chat, viewGroup, false));
    }
}
