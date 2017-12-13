package android.sabbir.com.modernlibrarys.test.material.components.p086a;

import android.content.Context;
import android.support.v7.widget.RecyclerView.C0102w;
import android.support.v7.widget.RecyclerView.C0105a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import butterknife.C1142R;
import com.material.components.p089f.C2746d;
import java.util.ArrayList;
import java.util.List;

public class C2232c extends C0105a<C0102w> {
    private List<Integer> f5708a = new ArrayList();
    private Context f5709b;
    private C2230a f5710c;

    public interface C2230a {
        void mo1943a(View view, Integer num, int i);
    }

    public class C2231b extends C0102w {
        public ImageView f5705n;
        public View f5706o;
        final /* synthetic */ C2232c f5707p;

        public C2231b(C2232c c2232c, View view) {
            this.f5707p = c2232c;
            super(view);
            this.f5705n = (ImageView) view.findViewById(C1142R.id.image);
            this.f5706o = view.findViewById(C1142R.id.lyt_parent);
        }
    }

    public C2232c(Context context, List<Integer> list) {
        this.f5708a = list;
        this.f5709b = context;
    }

    public int mo94a() {
        return this.f5708a.size();
    }

    public void mo97a(C0102w c0102w, final int i) {
        if (c0102w instanceof C2231b) {
            C2231b c2231b = (C2231b) c0102w;
            C2746d.m12254a(this.f5709b, c2231b.f5705n, ((Integer) this.f5708a.get(i)).intValue());
            c2231b.f5706o.setOnClickListener(new OnClickListener(this) {
                final /* synthetic */ C2232c f5704b;

                public void onClick(View view) {
                    if (this.f5704b.f5710c != null) {
                        this.f5704b.f5710c.mo1943a(view, (Integer) this.f5704b.f5708a.get(i), i);
                    }
                }
            });
        }
    }

    public void m10906a(C2230a c2230a) {
        this.f5710c = c2230a;
    }

    public C0102w mo99b(ViewGroup viewGroup, int i) {
        return new C2231b(this, LayoutInflater.from(viewGroup.getContext()).inflate(C1142R.layout.item_grid_image, viewGroup, false));
    }
}
