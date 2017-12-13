package android.sabbir.com.modernlibrarys.test.material.components.activity.gridlist;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.C0818e;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import butterknife.C1142R;
import com.material.components.p086a.C2236d;
import com.material.components.p086a.C2236d.C2234a;
import com.material.components.p089f.C2746d;
import com.material.components.p090b.C2700a;
import com.material.components.p091e.C2733h;
import com.material.components.p093g.C2757c;

public class GridCaller extends C0818e {
    private View f6290m;
    private RecyclerView f6291n;
    private C2236d f6292o;

    class C24681 implements C2234a {
        final /* synthetic */ GridCaller f6289a;

        C24681(GridCaller gridCaller) {
            this.f6289a = gridCaller;
        }

        public void mo1944a(View view, C2733h c2733h, int i) {
            Snackbar.m1021a(this.f6289a.f6290m, c2733h.f7027c + " clicked", -1).m1012a();
        }
    }

    private void m11422j() {
        this.f6291n = (RecyclerView) findViewById(C1142R.id.recyclerView);
        this.f6291n.setLayoutManager(new GridLayoutManager(this, 2));
        this.f6291n.m358a(new C2757c(2, C2746d.m12248a((Context) this, 3), true));
        this.f6291n.setHasFixedSize(true);
        this.f6292o = new C2236d(this, C2700a.m12159c(this));
        this.f6291n.setAdapter(this.f6292o);
        this.f6292o.m10913a(new C24681(this));
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1142R.layout.activity_grid_caller);
        this.f6290m = findViewById(16908290);
        m11422j();
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
