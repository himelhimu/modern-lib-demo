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
import com.material.components.p086a.C2284n;
import com.material.components.p086a.C2284n.C2282a;
import com.material.components.p090b.C2700a;
import com.material.components.p091e.C2733h;
import java.util.List;

public class ListBasic extends C0818e {
    private View f6314m;
    private RecyclerView f6315n;
    private C2284n f6316o;

    class C24741 implements C2282a {
        final /* synthetic */ ListBasic f6313a;

        C24741(ListBasic listBasic) {
            this.f6313a = listBasic;
        }

        public void mo1938a(View view, C2733h c2733h, int i) {
            Snackbar.m1021a(this.f6313a.f6314m, "Item " + c2733h.f7027c + " clicked", -1).m1012a();
        }
    }

    private void m11445j() {
        Toolbar toolbar = (Toolbar) findViewById(C1142R.id.toolbar);
        toolbar.setNavigationIcon((int) C1142R.drawable.ic_menu);
        m4362a(toolbar);
        m4370f().mo760a((CharSequence) "Basic");
        m4370f().mo761a(true);
    }

    private void m11446k() {
        this.f6315n = (RecyclerView) findViewById(C1142R.id.recyclerView);
        this.f6315n.setLayoutManager(new LinearLayoutManager(this));
        this.f6315n.setHasFixedSize(true);
        List c = C2700a.m12159c(this);
        c.addAll(C2700a.m12159c(this));
        c.addAll(C2700a.m12159c(this));
        this.f6316o = new C2284n(this, c);
        this.f6315n.setAdapter(this.f6316o);
        this.f6316o.m11007a(new C24741(this));
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1142R.layout.activity_list_basic);
        this.f6314m = findViewById(16908290);
        m11445j();
        m11446k();
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
