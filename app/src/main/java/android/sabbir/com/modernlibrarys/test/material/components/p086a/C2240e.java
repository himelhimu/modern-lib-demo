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
import com.material.components.p091e.C2731f;
import java.util.ArrayList;
import java.util.List;

public class C2240e extends C0105a<C0102w> {
    private List<C2731f> f5729a = new ArrayList();
    private Context f5730b;
    private C2238a f5731c;

    public interface C2238a {
        void mo1963a(View view, C2731f c2731f, int i);
    }

    public class C2239b extends C0102w {
        public ImageView f5723n;
        public TextView f5724o;
        public TextView f5725p;
        public LinearLayout f5726q;
        public View f5727r;
        final /* synthetic */ C2240e f5728s;

        public C2239b(C2240e c2240e, View view) {
            this.f5728s = c2240e;
            super(view);
            this.f5723n = (ImageView) view.findViewById(C1142R.id.image);
            this.f5724o = (TextView) view.findViewById(C1142R.id.name);
            this.f5725p = (TextView) view.findViewById(C1142R.id.brief);
            this.f5726q = (LinearLayout) view.findViewById(C1142R.id.lyt_bottom);
            this.f5727r = view.findViewById(C1142R.id.lyt_parent);
        }
    }

    public C2240e(Context context, List<C2731f> list) {
        this.f5729a = list;
        this.f5730b = context;
    }

    public int mo94a() {
        return this.f5729a.size();
    }

    public void mo97a(C0102w c0102w, final int i) {
        C2731f c2731f = (C2731f) this.f5729a.get(i);
        if (c0102w instanceof C2239b) {
            C2239b c2239b = (C2239b) c0102w;
            c2239b.f5724o.setText(c2731f.f7018c);
            c2239b.f5725p.setText(c2731f.f7019d);
            C2746d.m12254a(this.f5730b, c2239b.f5723n, c2731f.f7016a);
            c2239b.f5726q.setBackgroundColor(c2731f.f7020e);
            c2239b.f5727r.setOnClickListener(new OnClickListener(this) {
                final /* synthetic */ C2240e f5722b;

                public void onClick(View view) {
                    if (this.f5722b.f5731c != null) {
                        this.f5722b.f5731c.mo1963a(view, (C2731f) this.f5722b.f5729a.get(i), i);
                    }
                }
            });
        }
    }

    public void m10920a(C2238a c2238a) {
        this.f5731c = c2238a;
    }

    public C0102w mo99b(ViewGroup viewGroup, int i) {
        return new C2239b(this, LayoutInflater.from(viewGroup.getContext()).inflate(C1142R.layout.item_music_album, viewGroup, false));
    }
}
