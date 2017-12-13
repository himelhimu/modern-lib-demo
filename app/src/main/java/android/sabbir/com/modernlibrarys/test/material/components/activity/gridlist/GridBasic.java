package android.sabbir.com.modernlibrarys.test.material.components.activity.gridlist;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.C0818e;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import butterknife.C1142R;
import com.material.components.p086a.C2232c;
import com.material.components.p086a.C2232c.C2230a;
import com.material.components.p089f.C2746d;
import com.material.components.p090b.C2700a;
import com.material.components.p093g.C2757c;
import java.util.List;

public class GridBasic extends C0818e {
    private View f6286m;
    private RecyclerView f6287n;
    private C2232c f6288o;

    class C24671 implements C2230a {
        final /* synthetic */ GridBasic f6285a;

        C24671(GridBasic gridBasic) {
            this.f6285a = gridBasic;
        }

        public void mo1943a(View view, Integer num, int i) {
            Snackbar.m1021a(this.f6285a.f6286m, "Item " + i + " clicked", -1).m1012a();
        }
    }

    private void m11418j() {
        Toolbar toolbar = (Toolbar) findViewById(C1142R.id.toolbar);
        toolbar.setNavigationIcon((int) C1142R.drawable.ic_menu);
        m4362a(toolbar);
        m4370f().mo760a((CharSequence) "Basic");
        m4370f().mo761a(true);
    }

    private void m11419k() {
        this.f6287n = (RecyclerView) findViewById(C1142R.id.recyclerView);
        this.f6287n.setLayoutManager(new GridLayoutManager(this, 3));
        this.f6287n.m358a(new C2757c(3, C2746d.m12248a((Context) this, 2), true));
        this.f6287n.setHasFixedSize(true);
        List a = C2700a.m12156a((Context) this);
        a.addAll(C2700a.m12156a((Context) this));
        a.addAll(C2700a.m12156a((Context) this));
        a.addAll(C2700a.m12156a((Context) this));
        this.f6288o = new C2232c(this, a);
        this.f6287n.setAdapter(this.f6288o);
        this.f6288o.m10906a(new C24671(this));
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1142R.layout.activity_grid_basic);
        this.f6286m = findViewById(16908290);
        m11418j();
        m11419k();
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
