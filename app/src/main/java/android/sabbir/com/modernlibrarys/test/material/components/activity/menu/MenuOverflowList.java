package android.sabbir.com.modernlibrarys.test.material.components.activity.menu;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.C0818e;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import butterknife.C1142R;
import com.material.components.p086a.C2351z;
import com.material.components.p086a.C2351z.C2348a;
import com.material.components.p086a.C2351z.C2349b;
import com.material.components.p089f.C2746d;
import com.material.components.p090b.C2700a;
import com.material.components.p091e.C2733h;
import com.material.components.p093g.C2756b;

public class MenuOverflowList extends C0818e {
    private RecyclerView f6378m;
    private C2351z f6379n;

    class C24931 implements C2348a {
        final /* synthetic */ MenuOverflowList f6376a;

        C24931(MenuOverflowList menuOverflowList) {
            this.f6376a = menuOverflowList;
        }

        public void mo1956a(View view, C2733h c2733h, int i) {
            Toast.makeText(this.f6376a.getApplicationContext(), c2733h.f7027c, 0).show();
        }
    }

    class C24942 implements C2349b {
        final /* synthetic */ MenuOverflowList f6377a;

        C24942(MenuOverflowList menuOverflowList) {
            this.f6377a = menuOverflowList;
        }

        public void mo1957a(View view, C2733h c2733h, MenuItem menuItem) {
            Toast.makeText(this.f6377a.getApplicationContext(), c2733h.f7027c + " (" + menuItem.getTitle() + ") clicked", 0).show();
        }
    }

    private void m11514j() {
        Toolbar toolbar = (Toolbar) findViewById(C1142R.id.toolbar);
        toolbar.setNavigationIcon((int) C1142R.drawable.ic_menu);
        m4362a(toolbar);
        m4370f().mo760a(null);
        m4370f().mo761a(true);
        C2746d.m12252a((Activity) this);
    }

    private void m11515k() {
        this.f6378m = (RecyclerView) findViewById(C1142R.id.recyclerView);
        this.f6378m.setLayoutManager(new LinearLayoutManager(this));
        this.f6378m.m358a(new C2756b(10));
        this.f6379n = new C2351z(this, C2700a.m12159c(this));
        this.f6378m.setAdapter(this.f6379n);
        this.f6379n.m11141a(new C24931(this));
        this.f6379n.m11142a(new C24942(this));
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1142R.layout.activity_menu_overflow_list);
        m11514j();
        m11515k();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C1142R.menu.menu_search, menu);
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
