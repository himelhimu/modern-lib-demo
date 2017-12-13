package android.sabbir.com.modernlibrarys.test.material.components.activity.profile;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.design.widget.NavigationView.C0170a;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.C0804a;
import android.support.v7.app.C0813b;
import android.support.v7.app.C0818e;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import butterknife.C1142R;
import com.material.components.p089f.C2746d;

public class ProfileDrawerSimple extends C0818e {
    private C0804a f6581m;
    private Toolbar f6582n;

    private void m11708j() {
        this.f6582n = (Toolbar) findViewById(C1142R.id.toolbar);
        m4362a(this.f6582n);
        this.f6581m = m4370f();
        this.f6581m.mo761a(true);
        this.f6581m.mo764b(true);
        this.f6581m.mo760a((CharSequence) "Drawer Simple");
        C2746d.m12253a((Activity) this, (int) C1142R.color.light_green_700);
    }

    private void m11709k() {
        NavigationView navigationView = (NavigationView) findViewById(C1142R.id.nav_view);
        final DrawerLayout drawerLayout = (DrawerLayout) findViewById(C1142R.id.drawer_layout);
        Object c25661 = new C0813b(this, this, drawerLayout, this.f6582n, C1142R.string.navigation_drawer_open, C1142R.string.navigation_drawer_close) {
            final /* synthetic */ ProfileDrawerSimple f6578c;

            public void mo685a(View view) {
                super.mo685a(view);
            }
        };
        drawerLayout.setDrawerListener(c25661);
        c25661.m4331a();
        navigationView.setNavigationItemSelectedListener(new C0170a(this) {
            final /* synthetic */ ProfileDrawerSimple f6580b;

            public boolean mo1955a(MenuItem menuItem) {
                Toast.makeText(this.f6580b.getApplicationContext(), menuItem.getTitle() + " Selected", 0).show();
                this.f6580b.f6581m.mo760a(menuItem.getTitle());
                drawerLayout.m3855b();
                return true;
            }
        });
        drawerLayout.m3868e(8388611);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1142R.layout.activity_profile_drawer_simple);
        m11708j();
        m11709k();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C1142R.menu.menu_search_setting, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            Toast.makeText(getApplicationContext(), menuItem.getTitle(), 0).show();
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
