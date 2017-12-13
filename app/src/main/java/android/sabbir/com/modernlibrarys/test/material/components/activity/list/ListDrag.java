package android.sabbir.com.modernlibrarys.test.material.components.activity.list;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.C0818e;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.C0102w;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.p025a.C1045a;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import butterknife.C1142R;
import com.material.components.p086a.C2292o;
import com.material.components.p086a.C2292o.C2287a;
import com.material.components.p086a.C2292o.C2288b;
import com.material.components.p087d.C2724a;
import com.material.components.p090b.C2700a;
import com.material.components.p091e.C2740n;

public class ListDrag extends C0818e {
    private View f6319m;
    private RecyclerView f6320n;
    private C2292o f6321o;
    private C1045a f6322p;

    class C24751 implements C2287a {
        final /* synthetic */ ListDrag f6317a;

        C24751(ListDrag listDrag) {
            this.f6317a = listDrag;
        }

        public void mo1949a(View view, C2740n c2740n, int i) {
            Snackbar.m1021a(this.f6317a.f6319m, "Item " + c2740n.f7051c + " clicked", -1).m1012a();
        }
    }

    class C24762 implements C2288b {
        final /* synthetic */ ListDrag f6318a;

        C24762(ListDrag listDrag) {
            this.f6318a = listDrag;
        }

        public void mo1950a(C0102w c0102w) {
            this.f6318a.f6322p.m5988b(c0102w);
        }
    }

    private void m11451j() {
        Toolbar toolbar = (Toolbar) findViewById(C1142R.id.toolbar);
        toolbar.setNavigationIcon((int) C1142R.drawable.ic_menu);
        m4362a(toolbar);
        m4370f().mo760a((CharSequence) "Drag");
        m4370f().mo761a(true);
    }

    private void m11452k() {
        this.f6320n = (RecyclerView) findViewById(C1142R.id.recyclerView);
        this.f6320n.setLayoutManager(new LinearLayoutManager(this));
        this.f6320n.setHasFixedSize(true);
        this.f6321o = new C2292o(this, C2700a.m12160d(this));
        this.f6320n.setAdapter(this.f6321o);
        this.f6321o.m11022a(new C24751(this));
        this.f6321o.m11023a(new C24762(this));
        this.f6322p = new C1045a(new C2724a(this.f6321o));
        this.f6322p.m5980a(this.f6320n);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1142R.layout.activity_list_drag);
        this.f6319m = findViewById(16908290);
        m11451j();
        m11452k();
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
