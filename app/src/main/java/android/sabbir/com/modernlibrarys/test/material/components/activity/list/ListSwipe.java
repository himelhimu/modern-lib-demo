package android.sabbir.com.modernlibrarys.test.material.components.activity.list;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.C0818e;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.p025a.C1045a;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import butterknife.C1142R;
import com.material.components.p086a.C2336w;
import com.material.components.p086a.C2336w.C2332a;
import com.material.components.p087d.C2725b;
import com.material.components.p090b.C2700a;
import com.material.components.p091e.C2740n;

public class ListSwipe extends C0818e {
    private View f6340m;
    private RecyclerView f6341n;
    private C2336w f6342o;
    private C1045a f6343p;

    class C24811 implements C2332a {
        final /* synthetic */ ListSwipe f6339a;

        C24811(ListSwipe listSwipe) {
            this.f6339a = listSwipe;
        }

        public void mo1954a(View view, C2740n c2740n, int i) {
            Snackbar.m1021a(this.f6339a.f6340m, "Item " + c2740n.f7051c + " clicked", -1).m1012a();
        }
    }

    private void m11478j() {
        Toolbar toolbar = (Toolbar) findViewById(C1142R.id.toolbar);
        toolbar.setNavigationIcon((int) C1142R.drawable.ic_menu);
        m4362a(toolbar);
        m4370f().mo760a((CharSequence) "Swipe");
        m4370f().mo761a(true);
    }

    private void m11479k() {
        this.f6341n = (RecyclerView) findViewById(C1142R.id.recyclerView);
        this.f6341n.setLayoutManager(new LinearLayoutManager(this));
        this.f6341n.setHasFixedSize(true);
        this.f6342o = new C2336w(this, C2700a.m12160d(this));
        this.f6341n.setAdapter(this.f6342o);
        this.f6342o.m11115a(new C24811(this));
        this.f6343p = new C1045a(new C2725b(this.f6342o));
        this.f6343p.m5980a(this.f6341n);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1142R.layout.activity_list_swipe);
        this.f6340m = findViewById(16908290);
        m11478j();
        m11479k();
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
