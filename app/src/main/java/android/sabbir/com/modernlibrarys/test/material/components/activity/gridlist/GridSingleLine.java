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
import com.material.components.p086a.C2267j;
import com.material.components.p086a.C2267j.C2265a;
import com.material.components.p089f.C2746d;
import com.material.components.p090b.C2700a;
import com.material.components.p093g.C2757c;
import java.util.List;

public class GridSingleLine extends C0818e {
    private View f6298m;
    private RecyclerView f6299n;
    private C2267j f6300o;

    class C24701 implements C2265a {
        final /* synthetic */ GridSingleLine f6297a;

        C24701(GridSingleLine gridSingleLine) {
            this.f6297a = gridSingleLine;
        }

        public void mo1946a(View view, Integer num, int i) {
            Snackbar.m1021a(this.f6297a.f6298m, "Item " + i + " clicked", -1).m1012a();
        }
    }

    private void m11428j() {
        Toolbar toolbar = (Toolbar) findViewById(C1142R.id.toolbar);
        toolbar.setNavigationIcon((int) C1142R.drawable.ic_menu);
        m4362a(toolbar);
        m4370f().mo760a((CharSequence) "Singe Line");
        m4370f().mo761a(true);
    }

    private void m11429k() {
        this.f6299n = (RecyclerView) findViewById(C1142R.id.recyclerView);
        this.f6299n.setLayoutManager(new GridLayoutManager(this, 2));
        this.f6299n.m358a(new C2757c(2, C2746d.m12248a((Context) this, 3), true));
        this.f6299n.setHasFixedSize(true);
        List a = C2700a.m12156a((Context) this);
        a.addAll(C2700a.m12156a((Context) this));
        a.addAll(C2700a.m12156a((Context) this));
        a.addAll(C2700a.m12156a((Context) this));
        this.f6300o = new C2267j(this, a);
        this.f6299n.setAdapter(this.f6300o);
        this.f6300o.m10974a(new C24701(this));
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1142R.layout.activity_grid_single_line);
        this.f6298m = findViewById(16908290);
        m11428j();
        m11429k();
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
