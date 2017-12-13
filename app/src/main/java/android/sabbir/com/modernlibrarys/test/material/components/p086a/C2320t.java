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
import com.material.components.p091e.C2733h;
import java.util.ArrayList;
import java.util.List;

public class C2320t extends C0105a<C0102w> {
    private final int f5928a = 1;
    private final int f5929b = 0;
    private List<C2733h> f5930c = new ArrayList();
    private Context f5931d;
    private C2317a f5932e;

    public interface C2317a {
        void mo1932a(View view, C2733h c2733h, int i);
    }

    public class C2318b extends C0102w {
        public ImageView f5923n;
        public TextView f5924o;
        public View f5925p;
        final /* synthetic */ C2320t f5926q;

        public C2318b(C2320t c2320t, View view) {
            this.f5926q = c2320t;
            super(view);
            this.f5923n = (ImageView) view.findViewById(C1142R.id.image);
            this.f5924o = (TextView) view.findViewById(C1142R.id.name);
            this.f5925p = view.findViewById(C1142R.id.lyt_parent);
        }
    }

    public static class C2319c extends C0102w {
        public TextView f5927n;

        public C2319c(View view) {
            super(view);
            this.f5927n = (TextView) view.findViewById(C1142R.id.title_section);
        }
    }

    public C2320t(Context context, List<C2733h> list) {
        this.f5930c = list;
        this.f5931d = context;
    }

    public int mo94a() {
        return this.f5930c.size();
    }

    public void m11082a(int i, C2733h c2733h) {
        this.f5930c.add(i, c2733h);
        m597d(i);
    }

    public void mo97a(C0102w c0102w, final int i) {
        C2733h c2733h = (C2733h) this.f5930c.get(i);
        if (c0102w instanceof C2318b) {
            C2318b c2318b = (C2318b) c0102w;
            c2318b.f5924o.setText(c2733h.f7027c);
            C2746d.m12264b(this.f5931d, c2318b.f5923n, c2733h.f7025a);
            c2318b.f5925p.setOnClickListener(new OnClickListener(this) {
                final /* synthetic */ C2320t f5922b;

                public void onClick(View view) {
                    if (this.f5922b.f5932e != null) {
                        this.f5922b.f5932e.mo1932a(view, (C2733h) this.f5922b.f5930c.get(i), i);
                    }
                }
            });
            return;
        }
        ((C2319c) c0102w).f5927n.setText(c2733h.f7027c);
    }

    public void m11084a(C2317a c2317a) {
        this.f5932e = c2317a;
    }

    public int mo98b(int i) {
        return ((C2733h) this.f5930c.get(i)).f7029e ? 0 : 1;
    }

    public C0102w mo99b(ViewGroup viewGroup, int i) {
        return i == 1 ? new C2318b(this, LayoutInflater.from(viewGroup.getContext()).inflate(C1142R.layout.item_people_chat, viewGroup, false)) : new C2319c(LayoutInflater.from(viewGroup.getContext()).inflate(C1142R.layout.item_section, viewGroup, false));
    }
}
