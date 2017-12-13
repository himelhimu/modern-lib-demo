package android.sabbir.com.modernlibrarys.test.material.components.p086a;

import android.content.Context;
import android.support.v7.widget.RecyclerView.C0102w;
import android.support.v7.widget.RecyclerView.C0105a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.C1142R;
import com.material.components.p091e.C2738l;
import java.util.ArrayList;
import java.util.List;

public class C2328v extends C0105a<C0102w> {
    private List<C2738l> f5950a = new ArrayList();
    private Context f5951b;
    private C2326a f5952c;

    public interface C2326a {
        void mo1971a(View view, C2738l c2738l, int i);
    }

    public class C2327b extends C0102w {
        public ImageView f5945n;
        public TextView f5946o;
        public Button f5947p;
        public View f5948q;
        final /* synthetic */ C2328v f5949r;

        public C2327b(C2328v c2328v, View view) {
            this.f5949r = c2328v;
            super(view);
            this.f5945n = (ImageView) view.findViewById(C1142R.id.image_bg);
            this.f5946o = (TextView) view.findViewById(C1142R.id.title);
            this.f5947p = (Button) view.findViewById(C1142R.id.brief);
            this.f5948q = view.findViewById(C1142R.id.lyt_parent);
        }
    }

    public C2328v(Context context, List<C2738l> list) {
        this.f5950a = list;
        this.f5951b = context;
    }

    public int mo94a() {
        return this.f5950a.size();
    }

    public void mo97a(C0102w c0102w, final int i) {
        if (c0102w instanceof C2327b) {
            C2327b c2327b = (C2327b) c0102w;
            C2738l c2738l = (C2738l) this.f5950a.get(i);
            c2327b.f5946o.setText(c2738l.f7042c);
            c2327b.f5947p.setText(c2738l.f7043d);
            c2327b.f5945n.setImageResource(c2738l.f7044e);
            c2327b.f5948q.setOnClickListener(new OnClickListener(this) {
                final /* synthetic */ C2328v f5944b;

                public void onClick(View view) {
                    if (this.f5944b.f5952c != null) {
                        this.f5944b.f5952c.mo1971a(view, (C2738l) this.f5944b.f5950a.get(i), i);
                    }
                }
            });
        }
    }

    public void m11099a(C2326a c2326a) {
        this.f5952c = c2326a;
    }

    public C0102w mo99b(ViewGroup viewGroup, int i) {
        return new C2327b(this, LayoutInflater.from(viewGroup.getContext()).inflate(C1142R.layout.item_shop_category_image, viewGroup, false));
    }
}
