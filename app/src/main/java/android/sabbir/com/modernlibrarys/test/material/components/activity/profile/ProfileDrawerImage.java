package android.sabbir.com.modernlibrarys.test.material.components.activity.profile;

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

public class ProfileDrawerImage extends C0818e {
    private C0804a f6576m;
    private Toolbar f6577n;

    private void m11703j() {
        this.f6577n = (Toolbar) findViewById(C1142R.id.toolbar);
        m4362a(this.f6577n);
        this.f6576m = m4370f();
        this.f6576m.mo761a(true);
        this.f6576m.mo764b(true);
        this.f6576m.mo760a((CharSequence) "Drawer Image");
    }

    private void m11704k() {
        NavigationView navigationView = (NavigationView) findViewById(C1142R.id.nav_view);
        final DrawerLayout drawerLayout = (DrawerLayout) findViewById(C1142R.id.drawer_layout);
        Object c25641 = new C0813b(this, this, drawerLayout, this.f6577n, C1142R.string.navigation_drawer_open, C1142R.string.navigation_drawer_close) {
            final /* synthetic */ ProfileDrawerImage f6573c;

            public void mo685a(View view) {
                super.mo685a(view);
            }
        };
        drawerLayout.setDrawerListener(c25641);
        c25641.m4331a();
        navigationView.setNavigationItemSelectedListener(new C0170a(this) {
            final /* synthetic */ ProfileDrawerImage f6575b;

            public boolean mo1955a(MenuItem menuItem) {
                Toast.makeText(this.f6575b.getApplicationContext(), menuItem.getTitle() + " Selected", 0).show();
                this.f6575b.f6576m.mo760a(menuItem.getTitle());
                drawerLayout.m3855b();
                return true;
            }
        });
        drawerLayout.m3868e(8388611);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1142R.layout.activity_profile_drawer_image);
        m11703j();
        m11704k();
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
