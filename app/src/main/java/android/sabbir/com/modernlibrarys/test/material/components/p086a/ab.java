package android.sabbir.com.modernlibrarys.test.material.components.p086a;

import android.content.Context;
import android.support.v7.widget.RecyclerView.C0102w;
import android.support.v7.widget.RecyclerView.C0105a;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.material.components.p091e.C2730e;
import java.util.ArrayList;
import java.util.List;

public abstract class ab<T extends C2215b> extends C0105a<C2213d> {
    public static final int f5662d = C2730e.f7010a.m12225a();
    public static final int f5663e = C2730e.f7011b.m12225a();
    public static final int f5664f = C2730e.f7012c.m12225a();
    public static final int f5665g = C2730e.f7013d.m12225a();
    protected Context f5666a;
    protected List<T> f5667b = new ArrayList();
    protected List<T> f5668c = new ArrayList();
    private List<Integer> f5669h = new ArrayList();
    private SparseIntArray f5670i = new SparseIntArray();
    private int f5671j;

    public class C2213d extends C0102w {
        final /* synthetic */ ab f5657p;

        public C2213d(ab abVar, View view) {
            this.f5657p = abVar;
            super(view);
        }
    }

    public class C2214a extends C2213d {
        ImageView f5658n;
        final /* synthetic */ ab f5659o;

        public C2214a(final ab abVar, View view, ImageView imageView) {
            this.f5659o = abVar;
            super(abVar, view);
            this.f5658n = imageView;
            view.setOnClickListener(new OnClickListener(this) {
                final /* synthetic */ C2214a f5656b;

                public void onClick(View view) {
                    this.f5656b.mo1916y();
                }
            });
        }

        public void mo1917c(int i) {
            this.f5658n.setRotation(this.f5659o.m10881f(i) ? 90.0f : 0.0f);
        }

        protected void mo1916y() {
            if (this.f5659o.m10877a(m556d(), false)) {
                ab.m10871a(this.f5658n);
            } else {
                ab.m10872b(this.f5658n);
            }
        }
    }

    public static class C2215b {
        public int f5660a;

        public C2215b(int i) {
            this.f5660a = i;
        }
    }

    public class C2216c extends C2213d {
        final /* synthetic */ ab f5661n;

        public C2216c(ab abVar, View view) {
            this.f5661n = abVar;
            super(abVar, view);
        }

        public void mo1918c(int i) {
        }
    }

    public ab(Context context) {
        this.f5666a = context;
    }

    public static void m10871a(View view) {
        view.animate().setDuration(100).rotation(180.0f);
    }

    public static void m10872b(View view) {
        view.animate().setDuration(100).rotation(0.0f);
    }

    public int mo94a() {
        return this.f5668c == null ? 0 : this.f5668c.size();
    }

    public long mo95a(int i) {
        return (long) i;
    }

    protected View m10875a(int i, ViewGroup viewGroup) {
        return LayoutInflater.from(this.f5666a).inflate(i, viewGroup, false);
    }

    public void m10876a(List<T> list) {
        this.f5667b = list;
        List arrayList = new ArrayList();
        this.f5670i.clear();
        this.f5669h.clear();
        for (int i = 0; i < list.size(); i++) {
            int i2 = ((C2215b) this.f5667b.get(i)).f5660a;
            if (i2 == f5663e || i2 == f5665g || i2 == f5662d) {
                this.f5669h.add(Integer.valueOf(i));
                arrayList.add(list.get(i));
            }
        }
        this.f5668c = arrayList;
        m602f();
    }

    public boolean m10877a(int i, boolean z) {
        if (m10881f(i)) {
            m10880c(i, z);
            return false;
        }
        m10879b(i, z);
        if (this.f5671j != 1) {
            return true;
        }
        m10882g(i);
        return true;
    }

    public int mo98b(int i) {
        return ((C2215b) this.f5668c.get(i)).f5660a;
    }

    public void m10879b(int i, boolean z) {
        int i2 = i;
        int i3 = 0;
        for (int intValue = ((Integer) this.f5669h.get(i)).intValue() + 1; intValue < this.f5667b.size(); intValue++) {
            int i4 = ((C2215b) this.f5667b.get(intValue)).f5660a;
            if (intValue >= this.f5667b.size() || i4 == f5663e || i4 == f5665g || i4 == f5662d) {
                break;
            }
            i2++;
            i3++;
            this.f5668c.add(i2, this.f5667b.get(intValue));
            this.f5669h.add(i2, Integer.valueOf(intValue));
        }
        m587b(i + 1, i3);
        this.f5670i.put(((Integer) this.f5669h.get(i)).intValue(), 1);
        if (z) {
            m594c(i);
        }
    }

    public void m10880c(int i, boolean z) {
        int i2 = 0;
        for (int intValue = ((Integer) this.f5669h.get(i)).intValue() + 1; intValue < this.f5667b.size(); intValue++) {
            int i3 = ((C2215b) this.f5667b.get(intValue)).f5660a;
            if (intValue >= this.f5667b.size() || i3 == f5663e || i3 == f5665g || i3 == f5662d) {
                break;
            }
            i2++;
            this.f5668c.remove(i + 1);
            this.f5669h.remove(i + 1);
        }
        m595c(i + 1, i2);
        this.f5670i.delete(((Integer) this.f5669h.get(i)).intValue());
        if (z) {
            m594c(i);
        }
    }

    protected boolean m10881f(int i) {
        return this.f5670i.get(((Integer) this.f5669h.get(i)).intValue(), -1) >= 0;
    }

    public void m10882g(int i) {
        int size = this.f5668c.size() - 1;
        while (size >= 0) {
            int b = mo98b(size);
            if (size != i && ((b == f5663e || b == f5665g || b == f5662d) && m10881f(size))) {
                m10880c(size, true);
            }
            size--;
        }
    }

    public void m10883h(int i) {
        this.f5671j = i;
    }
}
