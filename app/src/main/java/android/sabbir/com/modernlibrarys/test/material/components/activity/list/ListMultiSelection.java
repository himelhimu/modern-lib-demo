package android.sabbir.com.modernlibrarys.test.material.components.activity.list;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.C0818e;
import android.support.v7.view.C0869b;
import android.support.v7.view.C0869b.C0847a;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import butterknife.C1142R;
import com.material.components.p086a.C2308r;
import com.material.components.p086a.C2308r.C2306a;
import com.material.components.p089f.C2746d;
import com.material.components.p090b.C2700a;
import com.material.components.p091e.C2729d;
import com.material.components.p093g.C2755a;
import java.util.List;

public class ListMultiSelection extends C0818e {
    private View f6329m;
    private RecyclerView f6330n;
    private C2308r f6331o;
    private C2479a f6332p;
    private C0869b f6333q;
    private Toolbar f6334r;

    class C24781 implements C2306a {
        final /* synthetic */ ListMultiSelection f6327a;

        C24781(ListMultiSelection listMultiSelection) {
            this.f6327a = listMultiSelection;
        }

        public void mo1952a(View view, C2729d c2729d, int i) {
            if (this.f6327a.f6331o.m11060c() > 0) {
                this.f6327a.m11466b(i);
                return;
            }
            Toast.makeText(this.f6327a.getApplicationContext(), "Read: " + this.f6327a.f6331o.m11061f(i).f7005c, 0).show();
        }

        public void mo1953b(View view, C2729d c2729d, int i) {
            this.f6327a.m11466b(i);
        }
    }

    private class C2479a implements C0847a {
        final /* synthetic */ ListMultiSelection f6328a;

        private C2479a(ListMultiSelection listMultiSelection) {
            this.f6328a = listMultiSelection;
        }

        public void mo749a(C0869b c0869b) {
            this.f6328a.f6331o.m11059b();
            this.f6328a.f6333q = null;
            C2746d.m12253a(this.f6328a, (int) C1142R.color.red_600);
        }

        public boolean mo750a(C0869b c0869b, Menu menu) {
            C2746d.m12253a(this.f6328a, (int) C1142R.color.blue_grey_700);
            c0869b.mo775a().inflate(C1142R.menu.menu_delete, menu);
            return true;
        }

        public boolean mo751a(C0869b c0869b, MenuItem menuItem) {
            if (menuItem.getItemId() != C1142R.id.action_delete) {
                return false;
            }
            this.f6328a.m11471l();
            c0869b.mo783c();
            return true;
        }

        public boolean mo752b(C0869b c0869b, Menu menu) {
            return false;
        }
    }

    private void m11466b(int i) {
        if (this.f6333q == null) {
            this.f6333q = m4365b(this.f6332p);
        }
        m11468c(i);
    }

    private void m11468c(int i) {
        this.f6331o.m11063g(i);
        int c = this.f6331o.m11060c();
        if (c == 0) {
            this.f6333q.mo783c();
            return;
        }
        this.f6333q.mo782b(String.valueOf(c));
        this.f6333q.mo784d();
    }

    private void m11469j() {
        this.f6334r = (Toolbar) findViewById(C1142R.id.toolbar);
        this.f6334r.setNavigationIcon((int) C1142R.drawable.ic_menu);
        m4362a(this.f6334r);
        m4370f().mo760a((CharSequence) "Inbox");
        m4370f().mo761a(true);
        C2746d.m12253a((Activity) this, (int) C1142R.color.red_600);
    }

    private void m11470k() {
        this.f6330n = (RecyclerView) findViewById(C1142R.id.recyclerView);
        this.f6330n.setLayoutManager(new LinearLayoutManager(this));
        this.f6330n.m358a(new C2755a(this, 1));
        this.f6330n.setHasFixedSize(true);
        this.f6331o = new C2308r(this, C2700a.m12161e(this));
        this.f6330n.setAdapter(this.f6331o);
        this.f6331o.m11056a(new C24781(this));
        this.f6332p = new C2479a();
    }

    private void m11471l() {
        List g = this.f6331o.m11062g();
        for (int size = g.size() - 1; size >= 0; size--) {
            this.f6331o.m11064h(((Integer) g.get(size)).intValue());
        }
        this.f6331o.m602f();
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1142R.layout.activity_list_multi_selection);
        this.f6329m = findViewById(C1142R.id.lyt_parent);
        m11469j();
        m11470k();
        Toast.makeText(this, "Long press for multi selection", 0).show();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C1142R.menu.menu_search_setting, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            finish();
        } else {
            Toast.makeText(getApplicationContext(), menuItem.getTitle(), 0).show();
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
