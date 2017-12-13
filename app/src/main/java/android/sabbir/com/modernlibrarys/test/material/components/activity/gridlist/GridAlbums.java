package android.sabbir.com.modernlibrarys.test.material.components.activity.gridlist;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff.Mode;
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
import com.material.components.p086a.C2228b;
import com.material.components.p086a.C2228b.C2226a;
import com.material.components.p089f.C2746d;
import com.material.components.p090b.C2700a;
import com.material.components.p091e.C2728c;
import com.material.components.p093g.C2757c;

public class GridAlbums extends C0818e {
    private View f6282m;
    private RecyclerView f6283n;
    private C2228b f6284o;

    class C24661 implements C2226a {
        final /* synthetic */ GridAlbums f6281a;

        C24661(GridAlbums gridAlbums) {
            this.f6281a = gridAlbums;
        }

        public void mo1942a(View view, C2728c c2728c, int i) {
            Snackbar.m1021a(this.f6281a.f6282m, "Item " + i + " clicked", -1).m1012a();
        }
    }

    private void m11414j() {
        Toolbar toolbar = (Toolbar) findViewById(C1142R.id.toolbar);
        toolbar.setNavigationIcon((int) C1142R.drawable.ic_menu);
        toolbar.getNavigationIcon().setColorFilter(getResources().getColor(C1142R.color.grey_60), Mode.SRC_ATOP);
        m4362a(toolbar);
        m4370f().mo760a((CharSequence) "Albums");
        m4370f().mo761a(true);
        C2746d.m12253a((Activity) this, (int) C1142R.color.grey_20);
    }

    private void m11415k() {
        this.f6283n = (RecyclerView) findViewById(C1142R.id.recyclerView);
        this.f6283n.setLayoutManager(new GridLayoutManager(this, 2));
        this.f6283n.m358a(new C2757c(2, C2746d.m12248a((Context) this, 4), true));
        this.f6283n.setHasFixedSize(true);
        this.f6284o = new C2228b(this, C2700a.m12162f(this));
        this.f6283n.setAdapter(this.f6284o);
        this.f6284o.m10899a(new C24661(this));
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1142R.layout.activity_grid_albums);
        this.f6282m = findViewById(16908290);
        m11414j();
        m11415k();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C1142R.menu.menu_search, menu);
        C2746d.m12257a(menu, getResources().getColor(C1142R.color.grey_60));
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
