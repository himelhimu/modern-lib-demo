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

public class C2228b extends C0105a<C0102w> {
    private List<C2728c> f5700a = new ArrayList();
    private Context f5701b;
    private C2226a f5702c;

    public interface C2226a {
        void mo1942a(View view, C2728c c2728c, int i);
    }

    public class C2227b extends C0102w {
        public ImageView f5695n;
        public TextView f5696o;
        public TextView f5697p;
        public View f5698q;
        final /* synthetic */ C2228b f5699r;

        public C2227b(C2228b c2228b, View view) {
            this.f5699r = c2228b;
            super(view);
            this.f5695n = (ImageView) view.findViewById(C1142R.id.image);
            this.f5696o = (TextView) view.findViewById(C1142R.id.name);
            this.f5697p = (TextView) view.findViewById(C1142R.id.counter);
            this.f5698q = view.findViewById(C1142R.id.lyt_parent);
        }
    }

    public C2228b(Context context, List<C2728c> list) {
        this.f5700a = list;
        this.f5701b = context;
    }

    public int mo94a() {
        return this.f5700a.size();
    }

    public void mo97a(C0102w c0102w, final int i) {
        C2728c c2728c = (C2728c) this.f5700a.get(i);
        if (c0102w instanceof C2227b) {
            C2227b c2227b = (C2227b) c0102w;
            c2227b.f5696o.setText(c2728c.f7000c);
            if (c2728c.f7002e == null) {
                c2227b.f5697p.setVisibility(8);
            } else {
                c2227b.f5697p.setText(c2728c.f7002e.toString());
                c2227b.f5697p.setVisibility(0);
            }
            C2746d.m12254a(this.f5701b, c2227b.f5695n, c2728c.f6998a);
            c2227b.f5698q.setOnClickListener(new OnClickListener(this) {
                final /* synthetic */ C2228b f5694b;

                public void onClick(View view) {
                    if (this.f5694b.f5702c != null) {
                        this.f5694b.f5702c.mo1942a(view, (C2728c) this.f5694b.f5700a.get(i), i);
                    }
                }
            });
        }
    }

    public void m10899a(C2226a c2226a) {
        this.f5702c = c2226a;
    }

    public C0102w mo99b(ViewGroup viewGroup, int i) {
        return new C2227b(this, LayoutInflater.from(viewGroup.getContext()).inflate(C1142R.layout.item_grid_image_albums, viewGroup, false));
    }
}
