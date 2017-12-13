package android.sabbir.com.modernlibrarys.test.material.components.p086a;

import android.content.Context;
import android.support.v7.widget.RecyclerView.C0102w;
import android.support.v7.widget.RecyclerView.C0105a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.C1142R;
import com.material.components.p089f.C2746d;
import com.material.components.p091e.C2733h;
import java.util.ArrayList;
import java.util.List;

public class C2340x extends C0105a<C0102w> {
    private List<C2733h> f5975a = new ArrayList();
    private Context f5976b;
    private C2338a f5977c;

    public interface C2338a {
        void mo1927a(View view, C2733h c2733h, int i);
    }

    public class C2339b extends C0102w {
        public ImageView f5971n;
        public TextView f5972o;
        public LinearLayout f5973p;
        final /* synthetic */ C2340x f5974q;

        public C2339b(C2340x c2340x, View view) {
            this.f5974q = c2340x;
            super(view);
            this.f5971n = (ImageView) view.findViewById(C1142R.id.image);
            this.f5972o = (TextView) view.findViewById(C1142R.id.name);
            this.f5973p = (LinearLayout) view.findViewById(C1142R.id.lyt_parent);
        }
    }

    public C2340x(Context context, List<C2733h> list) {
        this.f5975a = list;
        this.f5976b = context;
    }

    public int mo94a() {
        return this.f5975a.size();
    }

    public void mo97a(C0102w c0102w, final int i) {
        if (c0102w instanceof C2339b) {
            C2339b c2339b = (C2339b) c0102w;
            final C2733h c2733h = (C2733h) this.f5975a.get(i);
            c2339b.f5972o.setText(c2733h.f7027c);
            C2746d.m12264b(this.f5976b, c2339b.f5971n, c2733h.f7025a);
            c2339b.f5973p.setOnClickListener(new OnClickListener(this) {
                final /* synthetic */ C2340x f5970c;

                public void onClick(View view) {
                    if (this.f5970c.f5977c != null) {
                        this.f5970c.f5977c.mo1927a(view, c2733h, i);
                    }
                }
            });
        }
    }

    public void m11122a(C2338a c2338a) {
        this.f5977c = c2338a;
    }

    public C0102w mo99b(ViewGroup viewGroup, int i) {
        return new C2339b(this, LayoutInflater.from(viewGroup.getContext()).inflate(C1142R.layout.item_people, viewGroup, false));
    }

    public C2733h m11124f(int i) {
        return (C2733h) this.f5975a.get(i);
    }
}
