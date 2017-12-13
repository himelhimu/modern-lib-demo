package android.sabbir.com.modernlibrarys.test.material.components.p086a;

import android.content.Context;
import android.support.v7.widget.RecyclerView.C0102w;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import butterknife.C1142R;
import com.material.components.p086a.ab.C2213d;
import com.material.components.p086a.ab.C2214a;
import com.material.components.p086a.ab.C2215b;
import com.material.components.p086a.ab.C2216c;
import com.material.components.p091e.C2730e;
import java.util.List;

public class ac extends ab<C2219c> {
    private Context f5691h;
    private C2220d f5692i = null;

    public class C2217a extends C2213d {
        TextView f5672n;
        final /* synthetic */ ac f5673o;

        public C2217a(ac acVar, View view) {
            this.f5673o = acVar;
            super(acVar, view);
            this.f5672n = (TextView) view.findViewById(C1142R.id.item_menu_divider_name);
        }

        public void m10884c(int i) {
            if (((C2219c) this.f5673o.c.get(i)).f5679d == null) {
                this.f5672n.setVisibility(8);
                return;
            }
            this.f5672n.setVisibility(0);
            this.f5672n.setText(((C2219c) this.f5673o.c.get(i)).f5679d);
        }
    }

    public class C2218b extends C2214a {
        TextView f5674q;
        ImageView f5675r;
        final /* synthetic */ ac f5676s;

        public C2218b(ac acVar, View view) {
            this.f5676s = acVar;
            super(acVar, view, (ImageView) view.findViewById(C1142R.id.item_arrow));
            this.f5674q = (TextView) view.findViewById(C1142R.id.item_menu_group_name);
            this.f5675r = (ImageView) view.findViewById(C1142R.id.item_menu_group_image);
        }

        public void mo1917c(int i) {
            super.mo1917c(i);
            this.f5674q.setText(((C2219c) this.f5676s.c.get(i)).f5679d);
            this.f5675r.setImageResource(((C2219c) this.f5676s.c.get(i)).f5678c);
        }
    }

    public static class C2219c extends C2215b {
        public int f5677b = -1;
        public int f5678c = -1;
        public String f5679d;

        public C2219c(int i, String str, int i2, C2730e c2730e) {
            super(c2730e.m12225a());
            this.f5677b = i;
            this.f5679d = str;
            this.f5678c = i2;
        }
    }

    public interface C2220d {
        void mo1924a(View view, int i);
    }

    public class C2222e extends C2216c {
        View f5682o;
        TextView f5683q;
        ImageView f5684r;
        final /* synthetic */ ac f5685s;

        public C2222e(ac acVar, View view) {
            this.f5685s = acVar;
            super(acVar, view);
            this.f5682o = view;
            this.f5683q = (TextView) view.findViewById(C1142R.id.item_menu_group_name);
            this.f5684r = (ImageView) view.findViewById(C1142R.id.item_menu_group_image);
        }

        public void mo1918c(final int i) {
            this.f5683q.setText(((C2219c) this.f5685s.c.get(i)).f5679d);
            this.f5684r.setImageResource(((C2219c) this.f5685s.c.get(i)).f5678c);
            this.f5682o.setOnClickListener(new OnClickListener(this) {
                final /* synthetic */ C2222e f5681b;

                public void onClick(View view) {
                    this.f5681b.f5685s.f5692i.mo1924a(view, ((C2219c) this.f5681b.f5685s.c.get(i)).f5677b);
                }
            });
        }
    }

    public class C2224f extends C2213d {
        View f5688n;
        TextView f5689o;
        final /* synthetic */ ac f5690q;

        public C2224f(ac acVar, View view) {
            this.f5690q = acVar;
            super(acVar, view);
            this.f5688n = view;
            this.f5689o = (TextView) view.findViewById(C1142R.id.item_menu_sub_group_name);
        }

        public void m10888c(final int i) {
            this.f5689o.setText(((C2219c) this.f5690q.c.get(i)).f5679d);
            this.f5688n.setOnClickListener(new OnClickListener(this) {
                final /* synthetic */ C2224f f5687b;

                public void onClick(View view) {
                    this.f5687b.f5690q.f5692i.mo1924a(view, ((C2219c) this.f5687b.f5690q.c.get(i)).f5677b);
                }
            });
        }
    }

    public ac(Context context, List<C2219c> list, C2220d c2220d) {
        super(context);
        this.f5691h = context;
        this.f5692i = c2220d;
        m10876a((List) list);
    }

    public C2213d m10890a(ViewGroup viewGroup, int i) {
        View view = new View(this.f5691h);
        view.setLayoutParams(new LayoutParams(-1, 2));
        view.setBackgroundColor(this.f5691h.getResources().getColor(C1142R.color.grey_60));
        return i == d ? new C2222e(this, m10875a((int) C1142R.layout.item_menu_plain, viewGroup)) : i == e ? new C2218b(this, m10875a((int) C1142R.layout.item_menu_group, viewGroup)) : i == f ? new C2224f(this, m10875a((int) C1142R.layout.item_menu_sub_group, viewGroup)) : i == g ? new C2217a(this, m10875a((int) C1142R.layout.item_menu_divider, viewGroup)) : new C2222e(this, m10875a((int) C1142R.layout.item_menu_group, viewGroup));
    }

    public void m10892a(C2213d c2213d, int i) {
        int b = mo98b(i);
        if (b == d) {
            ((C2222e) c2213d).mo1918c(i);
        } else if (b == e) {
            ((C2218b) c2213d).mo1917c(i);
        } else if (b == f) {
            ((C2224f) c2213d).m10888c(i);
        } else if (b == g) {
            ((C2217a) c2213d).m10884c(i);
        } else {
            ((C2224f) c2213d).m10888c(i);
        }
    }

    public /* synthetic */ C0102w mo99b(ViewGroup viewGroup, int i) {
        return m10890a(viewGroup, i);
    }
}
