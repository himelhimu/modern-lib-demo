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

public class MenuDrawerSimpleDark extends C0818e {
    private C0804a f6369m;
    private Toolbar f6370n;

    private void m11505j() {
        this.f6370n = (Toolbar) findViewById(C1142R.id.toolbar);
        m4362a(this.f6370n);
        this.f6369m = m4370f();
        this.f6369m.mo761a(true);
        this.f6369m.mo764b(true);
        this.f6369m.mo760a((CharSequence) "Drawer Simple Dark");
    }

    private void m11506k() {
        NavigationView navigationView = (NavigationView) findViewById(C1142R.id.nav_view);
        final DrawerLayout drawerLayout = (DrawerLayout) findViewById(C1142R.id.drawer_layout);
        Object c24891 = new C0813b(this, this, drawerLayout, this.f6370n, C1142R.string.navigation_drawer_open, C1142R.string.navigation_drawer_close) {
            final /* synthetic */ MenuDrawerSimpleDark f6366c;

            public void mo685a(View view) {
                super.mo685a(view);
            }
        };
        drawerLayout.setDrawerListener(c24891);
        c24891.m4331a();
        navigationView.setNavigationItemSelectedListener(new C0170a(this) {
            final /* synthetic */ MenuDrawerSimpleDark f6368b;

            public boolean mo1955a(MenuItem menuItem) {
                Toast.makeText(this.f6368b.getApplicationContext(), menuItem.getTitle() + " Selected", 0).show();
                this.f6368b.f6369m.mo760a(menuItem.getTitle());
                drawerLayout.m3855b();
                return true;
            }
        });
        drawerLayout.m3868e(8388611);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1142R.layout.activity_menu_drawer_simple_dark);
        m11505j();
        m11506k();
    }
}
