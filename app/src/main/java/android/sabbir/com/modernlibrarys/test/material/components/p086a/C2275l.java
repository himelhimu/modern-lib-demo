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
import com.material.components.p091e.C2728c;
import java.util.ArrayList;
import java.util.List;

public class C2275l extends C0105a<C0102w> {
    private List<C2728c> f5813a = new ArrayList();
    private Context f5814b;
    private C2273a f5815c;

    public interface C2273a {
        void mo1928a(View view, C2728c c2728c, int i);
    }

    public class C2274b extends C0102w {
        public ImageView f5808n;
        public TextView f5809o;
        public TextView f5810p;
        public View f5811q;
        final /* synthetic */ C2275l f5812r;

        public C2274b(C2275l c2275l, View view) {
            this.f5812r = c2275l;
            super(view);
            this.f5808n = (ImageView) view.findViewById(C1142R.id.image);
            this.f5809o = (TextView) view.findViewById(C1142R.id.name);
            this.f5810p = (TextView) view.findViewById(C1142R.id.brief);
            this.f5811q = view.findViewById(C1142R.id.lyt_parent);
        }
    }

    public C2275l(Context context, List<C2728c> list) {
        this.f5813a = list;
        this.f5814b = context;
    }

    public int mo94a() {
        return this.f5813a.size();
    }

    public void mo97a(C0102w c0102w, final int i) {
        C2728c c2728c = (C2728c) this.f5813a.get(i);
        if (c0102w instanceof C2274b) {
            C2274b c2274b = (C2274b) c0102w;
            c2274b.f5809o.setText(c2728c.f7000c);
            c2274b.f5810p.setText(c2728c.f7001d);
            C2746d.m12254a(this.f5814b, c2274b.f5808n, c2728c.f6998a);
            c2274b.f5811q.setOnClickListener(new OnClickListener(this) {
                final /* synthetic */ C2275l f5807b;

                public void onClick(View view) {
                    if (this.f5807b.f5815c != null) {
                        this.f5807b.f5815c.mo1928a(view, (C2728c) this.f5807b.f5813a.get(i), i);
                    }
                }
            });
        }
    }

    public void m10988a(C2273a c2273a) {
        this.f5815c = c2273a;
    }

    public C0102w mo99b(ViewGroup viewGroup, int i) {
        return new C2274b(this, LayoutInflater.from(viewGroup.getContext()).inflate(C1142R.layout.item_grid_image_two_line_light, viewGroup, false));
    }

    public C2728c m10990f(int i) {
        return (C2728c) this.f5813a.get(i);
    }
}
