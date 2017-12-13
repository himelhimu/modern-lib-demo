package android.sabbir.com.modernlibrarys.test.material.components.activity.list;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.C0818e;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import butterknife.C1142R;
import com.material.components.p086a.C2297p;
import com.material.components.p086a.C2297p.C2295a;
import com.material.components.p090b.C2700a;
import com.material.components.p091e.C2740n;
import com.material.components.p093g.C2755a;

public class ListExpand extends C0818e {
    private View f6324m;
    private RecyclerView f6325n;
    private C2297p f6326o;

    class C24771 implements C2295a {
        final /* synthetic */ ListExpand f6323a;

        C24771(ListExpand listExpand) {
            this.f6323a = listExpand;
        }

        public void mo1951a(View view, C2740n c2740n, int i) {
            Snackbar.m1021a(this.f6323a.f6324m, "Item " + c2740n.f7051c + " clicked", -1).m1012a();
        }
    }

    private void m11455j() {
        Toolbar toolbar = (Toolbar) findViewById(C1142R.id.toolbar);
        toolbar.setNavigationIcon((int) C1142R.drawable.ic_menu);
        m4362a(toolbar);
        m4370f().mo760a((CharSequence) "Expandable");
        m4370f().mo761a(true);
    }

    private void m11456k() {
        this.f6325n = (RecyclerView) findViewById(C1142R.id.recyclerView);
        this.f6325n.setLayoutManager(new LinearLayoutManager(this));
        this.f6325n.m358a(new C2755a(this, 1));
        this.f6325n.setHasFixedSize(true);
        this.f6326o = new C2297p(this, C2700a.m12160d(this));
        this.f6325n.setAdapter(this.f6326o);
        this.f6326o.m11033a(new C24771(this));
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1142R.layout.activity_list_expand);
        this.f6324m = findViewById(16908290);
        m11455j();
        m11456k();
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
