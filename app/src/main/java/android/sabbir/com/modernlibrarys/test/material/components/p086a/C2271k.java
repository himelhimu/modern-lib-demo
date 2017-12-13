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

public class C2271k extends C0105a<C0102w> {
    private List<C2728c> f5803a = new ArrayList();
    private Context f5804b;
    private C2269a f5805c;

    public interface C2269a {
        void mo1947a(View view, C2728c c2728c, int i);
    }

    public class C2270b extends C0102w {
        public ImageView f5798n;
        public TextView f5799o;
        public TextView f5800p;
        public View f5801q;
        final /* synthetic */ C2271k f5802r;

        public C2270b(C2271k c2271k, View view) {
            this.f5802r = c2271k;
            super(view);
            this.f5798n = (ImageView) view.findViewById(C1142R.id.image);
            this.f5799o = (TextView) view.findViewById(C1142R.id.name);
            this.f5800p = (TextView) view.findViewById(C1142R.id.brief);
            this.f5801q = view.findViewById(C1142R.id.lyt_parent);
        }
    }

    public C2271k(Context context, List<C2728c> list) {
        this.f5803a = list;
        this.f5804b = context;
    }

    public int mo94a() {
        return this.f5803a.size();
    }

    public void mo97a(C0102w c0102w, final int i) {
        C2728c c2728c = (C2728c) this.f5803a.get(i);
        if (c0102w instanceof C2270b) {
            C2270b c2270b = (C2270b) c0102w;
            c2270b.f5799o.setText(c2728c.f7000c);
            c2270b.f5800p.setText(c2728c.f7001d);
            C2746d.m12254a(this.f5804b, c2270b.f5798n, c2728c.f6998a);
            c2270b.f5801q.setOnClickListener(new OnClickListener(this) {
                final /* synthetic */ C2271k f5797b;

                public void onClick(View view) {
                    if (this.f5797b.f5805c != null) {
                        this.f5797b.f5805c.mo1947a(view, (C2728c) this.f5797b.f5803a.get(i), i);
                    }
                }
            });
        }
    }

    public void m10981a(C2269a c2269a) {
        this.f5805c = c2269a;
    }

    public C0102w mo99b(ViewGroup viewGroup, int i) {
        return new C2270b(this, LayoutInflater.from(viewGroup.getContext()).inflate(C1142R.layout.item_grid_image_two_line, viewGroup, false));
    }
}
