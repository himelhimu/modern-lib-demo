package android.sabbir.com.modernlibrarys.test.material.components.activity.menu;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.C0818e;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import butterknife.C1142R;
import com.material.components.p086a.C2344y;
import com.material.components.p086a.C2344y.C2342a;
import com.material.components.p089f.C2746d;
import com.material.components.p090b.C2700a;
import com.material.components.p091e.C2733h;

public class MenuOverflowToolbar extends C0818e {
    private RecyclerView f6382m;
    private C2344y f6383n;

    class C24951 implements Runnable {
        final /* synthetic */ MenuOverflowToolbar f6380a;

        C24951(MenuOverflowToolbar menuOverflowToolbar) {
            this.f6380a = menuOverflowToolbar;
        }

        public void run() {
            ((Toolbar) this.f6380a.findViewById(C1142R.id.toolbar)).m5904d();
        }
    }

    class C24962 implements C2342a {
        final /* synthetic */ MenuOverflowToolbar f6381a;

        C24962(MenuOverflowToolbar menuOverflowToolbar) {
            this.f6381a = menuOverflowToolbar;
        }

        public void mo1929a(View view, C2733h c2733h, int i) {
        }
    }

    private void m11517j() {
        Toolbar toolbar = (Toolbar) findViewById(C1142R.id.toolbar);
        toolbar.setNavigationIcon((int) C1142R.drawable.ic_menu);
        m4362a(toolbar);
        m4370f().mo760a(null);
        m4370f().mo761a(true);
        C2746d.m12252a((Activity) this);
        new Handler().postDelayed(new C24951(this), 1000);
    }

    private void m11518k() {
        this.f6382m = (RecyclerView) findViewById(C1142R.id.recyclerView);
        this.f6382m.setLayoutManager(new LinearLayoutManager(this));
        this.f6383n = new C2344y(this, C2700a.m12159c(this));
        this.f6382m.setAdapter(this.f6383n);
        this.f6383n.m11129a(new C24962(this));
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1142R.layout.activity_menu_overflow_toolbar);
        m11517j();
        m11518k();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C1142R.menu.menu_complete, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            finish();
        } else {
            Toast.makeText(getApplicationContext(), menuItem.getTitle() + " clicked", 0).show();
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
