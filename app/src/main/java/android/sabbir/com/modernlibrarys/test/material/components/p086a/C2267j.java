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
import java.util.ArrayList;
import java.util.List;

public class C2267j extends C0105a<C0102w> {
    private List<Integer> f5793a = new ArrayList();
    private Context f5794b;
    private C2265a f5795c;

    public interface C2265a {
        void mo1946a(View view, Integer num, int i);
    }

    public class C2266b extends C0102w {
        public ImageView f5789n;
        public TextView f5790o;
        public View f5791p;
        final /* synthetic */ C2267j f5792q;

        public C2266b(C2267j c2267j, View view) {
            this.f5792q = c2267j;
            super(view);
            this.f5789n = (ImageView) view.findViewById(C1142R.id.image);
            this.f5790o = (TextView) view.findViewById(C1142R.id.name);
            this.f5791p = view.findViewById(C1142R.id.lyt_parent);
        }
    }

    public C2267j(Context context, List<Integer> list) {
        this.f5793a = list;
        this.f5794b = context;
    }

    public int mo94a() {
        return this.f5793a.size();
    }

    public void mo97a(C0102w c0102w, final int i) {
        if (c0102w instanceof C2266b) {
            C2266b c2266b = (C2266b) c0102w;
            C2746d.m12254a(this.f5794b, c2266b.f5789n, ((Integer) this.f5793a.get(i)).intValue());
            c2266b.f5790o.setText("IMG_" + i + ".jpg");
            c2266b.f5791p.setOnClickListener(new OnClickListener(this) {
                final /* synthetic */ C2267j f5788b;

                public void onClick(View view) {
                    if (this.f5788b.f5795c != null) {
                        this.f5788b.f5795c.mo1946a(view, (Integer) this.f5788b.f5793a.get(i), i);
                    }
                }
            });
        }
    }

    public void m10974a(C2265a c2265a) {
        this.f5795c = c2265a;
    }

    public C0102w mo99b(ViewGroup viewGroup, int i) {
        return new C2266b(this, LayoutInflater.from(viewGroup.getContext()).inflate(C1142R.layout.item_grid_image_single_line, viewGroup, false));
    }
}
