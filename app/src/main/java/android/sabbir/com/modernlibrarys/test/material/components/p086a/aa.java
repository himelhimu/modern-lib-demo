package android.sabbir.com.modernlibrarys.test.material.components.p086a;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.widget.RecyclerView.C0102w;
import android.support.v7.widget.RecyclerView.C0105a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.C1142R;
import com.google.p067a.C1742e;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class aa extends C0105a<aa.C2211c> {
    private List<String> f5652a = new ArrayList();
    private C2209a f5653b;
    private SharedPreferences f5654c;

    public interface C2209a {
        void mo1969a(View view, String str, int i);
    }

    private class C2210b implements Serializable {
        public List<String> f5647a = new ArrayList();
        final /* synthetic */ aa f5648b;

        public C2210b(aa aaVar, List<String> list) {
            this.f5648b = aaVar;
            this.f5647a = list;
        }
    }

    public class C2211c extends C0102w {
        public TextView f5649n;
        public LinearLayout f5650o;
        final /* synthetic */ aa f5651p;

        public C2211c(aa aaVar, View view) {
            this.f5651p = aaVar;
            super(view);
            this.f5649n = (TextView) view.findViewById(C1142R.id.title);
            this.f5650o = (LinearLayout) view.findViewById(C1142R.id.lyt_parent);
        }
    }

    public aa(Context context) {
        this.f5654c = context.getSharedPreferences("PREF_RECENT_SEARCH", 0);
        this.f5652a = m10859c();
        Collections.reverse(this.f5652a);
    }

    private List<String> m10859c() {
        String string = this.f5654c.getString("_SEARCH_HISTORY_KEY", "");
        return string.equals("") ? new ArrayList() : ((C2210b) new C1742e().m8834a(string, C2210b.class)).f5647a;
    }

    public int mo94a() {
        return this.f5652a.size();
    }

    public C2211c m10861a(ViewGroup viewGroup, int i) {
        return new C2211c(this, LayoutInflater.from(viewGroup.getContext()).inflate(C1142R.layout.item_suggestion, viewGroup, false));
    }

    public void m10863a(C2209a c2209a) {
        this.f5653b = c2209a;
    }

    public void m10864a(C2211c c2211c, final int i) {
        final String str = (String) this.f5652a.get(i);
        c2211c.f5649n.setText(str);
        c2211c.f5650o.setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ aa f5646c;

            public void onClick(View view) {
                this.f5646c.f5653b.mo1969a(view, str, i);
            }
        });
    }

    public void m10865a(String str) {
        Object c2210b = new C2210b(this, m10859c());
        if (c2210b.f5647a.contains(str)) {
            c2210b.f5647a.remove(str);
        }
        c2210b.f5647a.add(str);
        if (c2210b.f5647a.size() > 5) {
            c2210b.f5647a.remove(0);
        }
        this.f5654c.edit().putString("_SEARCH_HISTORY_KEY", new C1742e().m8836a(c2210b, (Type) C2210b.class)).apply();
    }

    public /* synthetic */ C0102w mo99b(ViewGroup viewGroup, int i) {
        return m10861a(viewGroup, i);
    }

    public void m10867b() {
        this.f5652a = m10859c();
        Collections.reverse(this.f5652a);
        m602f();
    }
}
