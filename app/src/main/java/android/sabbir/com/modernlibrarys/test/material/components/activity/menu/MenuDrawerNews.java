package android.sabbir.com.modernlibrarys.test.material.components.activity.menu;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.design.widget.NavigationView.C0170a;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.C0804a;
import android.support.v7.app.C0813b;
import android.support.v7.app.C0818e;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import butterknife.C1142R;

public class MenuDrawerNews extends C0818e {
    private C0804a f6358m;
    private Toolbar f6359n;

    private void m11493j() {
        this.f6359n = (Toolbar) findViewById(C1142R.id.toolbar);
        m4362a(this.f6359n);
        this.f6358m = m4370f();
        this.f6358m.mo761a(true);
        this.f6358m.mo764b(true);
        this.f6358m.mo760a((CharSequence) "Drawer News");
    }

    private void m11494k() {
        NavigationView navigationView = (NavigationView) findViewById(C1142R.id.nav_view);
        final DrawerLayout drawerLayout = (DrawerLayout) findViewById(C1142R.id.drawer_layout);
        Object c24851 = new C0813b(this, this, drawerLayout, this.f6359n, C1142R.string.navigation_drawer_open, C1142R.string.navigation_drawer_close) {
            final /* synthetic */ MenuDrawerNews f6355c;

            public void mo685a(View view) {
                super.mo685a(view);
            }
        };
        drawerLayout.setDrawerListener(c24851);
        c24851.m4331a();
        navigationView.setNavigationItemSelectedListener(new C0170a(this) {
            final /* synthetic */ MenuDrawerNews f6357b;

            public boolean mo1955a(MenuItem menuItem) {
                Toast.makeText(this.f6357b.getApplicationContext(), menuItem.getTitle() + " Selected", 0).show();
                this.f6357b.f6358m.mo760a(menuItem.getTitle());
                drawerLayout.m3855b();
                return true;
            }
        });
        drawerLayout.m3868e(8388611);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1142R.layout.activity_menu_drawer_news);
        m11493j();
        m11494k();
    }
}
