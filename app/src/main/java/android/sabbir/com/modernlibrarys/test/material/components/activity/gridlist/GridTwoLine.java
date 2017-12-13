package android.sabbir.com.modernlibrarys.test.material.components.activity.gridlist;

import android.app.Activity;
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
import com.material.components.p086a.C2271k;
import com.material.components.p086a.C2271k.C2269a;
import com.material.components.p089f.C2746d;
import com.material.components.p090b.C2700a;
import com.material.components.p091e.C2728c;
import com.material.components.p093g.C2757c;
import java.util.List;

public class GridTwoLine extends C0818e {
    private View f6302m;
    private RecyclerView f6303n;
    private C2271k f6304o;

    class C24711 implements C2269a {
        final /* synthetic */ GridTwoLine f6301a;

        C24711(GridTwoLine gridTwoLine) {
            this.f6301a = gridTwoLine;
        }

        public void mo1947a(View view, C2728c c2728c, int i) {
            Snackbar.m1021a(this.f6301a.f6302m, c2728c.f7000c + " clicked", -1).m1012a();
        }
    }

    private void m11432j() {
        Toolbar toolbar = (Toolbar) findViewById(C1142R.id.toolbar);
        toolbar.setNavigationIcon((int) C1142R.drawable.ic_menu);
        m4362a(toolbar);
        m4370f().mo760a((CharSequence) "Two Line");
        m4370f().mo761a(true);
        C2746d.m12253a((Activity) this, (int) C1142R.color.grey_1000);
    }

    private void m11433k() {
        this.f6303n = (RecyclerView) findViewById(C1142R.id.recyclerView);
        this.f6303n.setLayoutManager(new GridLayoutManager(this, 2));
        this.f6303n.m358a(new C2757c(2, C2746d.m12248a((Context) this, 3), true));
        this.f6303n.setHasFixedSize(true);
        List f = C2700a.m12162f(this);
        f.addAll(C2700a.m12162f(this));
        f.addAll(C2700a.m12162f(this));
        f.addAll(C2700a.m12162f(this));
        this.f6304o = new C2271k(this, f);
        this.f6303n.setAdapter(this.f6304o);
        this.f6304o.m10981a(new C24711(this));
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1142R.layout.activity_grid_two_line);
        this.f6302m = findViewById(16908290);
        m11432j();
        m11433k();
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
