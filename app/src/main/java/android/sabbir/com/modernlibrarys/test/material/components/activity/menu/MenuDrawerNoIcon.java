package android.sabbir.com.modernlibrarys.test.material.components.activity.menu;

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
import android.widget.TextView;
import android.widget.Toast;
import butterknife.C1142R;
import com.material.components.p089f.C2746d;

public class MenuDrawerNoIcon extends C0818e {
    private C0804a f6364m;
    private Toolbar f6365n;

    private void m11498a(NavigationView navigationView) {
        Menu menu = navigationView.getMenu();
        ((TextView) menu.findItem(C1142R.id.nav_all_inbox).getActionView().findViewById(C1142R.id.text)).setText("75");
        ((TextView) menu.findItem(C1142R.id.nav_inbox).getActionView().findViewById(C1142R.id.text)).setText("68");
        TextView textView = (TextView) menu.findItem(C1142R.id.nav_priority_inbox).getActionView().findViewById(C1142R.id.text);
        textView.setText("3 new");
        textView.setBackgroundColor(getResources().getColor(C1142R.color.colorPrimaryLight));
        textView = (TextView) menu.findItem(C1142R.id.nav_social).getActionView().findViewById(C1142R.id.text);
        textView.setText("51 new");
        textView.setBackgroundColor(getResources().getColor(C1142R.color.green_500));
        ((TextView) menu.findItem(C1142R.id.nav_spam).getActionView().findViewById(C1142R.id.text)).setText("13");
    }

    private void m11500j() {
        this.f6365n = (Toolbar) findViewById(C1142R.id.toolbar);
        this.f6365n.setBackgroundColor(getResources().getColor(C1142R.color.pink_600));
        m4362a(this.f6365n);
        this.f6364m = m4370f();
        this.f6364m.mo761a(true);
        this.f6364m.mo764b(true);
        this.f6364m.mo760a((CharSequence) "Drawer No Icon");
        C2746d.m12253a((Activity) this, (int) C1142R.color.pink_700);
    }

    private void m11501k() {
        final NavigationView navigationView = (NavigationView) findViewById(C1142R.id.nav_view);
        final DrawerLayout drawerLayout = (DrawerLayout) findViewById(C1142R.id.drawer_layout);
        Object c24871 = new C0813b(this, this, drawerLayout, this.f6365n, C1142R.string.navigation_drawer_open, C1142R.string.navigation_drawer_close) {
            final /* synthetic */ MenuDrawerNoIcon f6361d;

            public void mo685a(View view) {
                this.f6361d.m11498a(navigationView);
                super.mo685a(view);
            }
        };
        drawerLayout.setDrawerListener(c24871);
        c24871.m4331a();
        navigationView.setNavigationItemSelectedListener(new C0170a(this) {
            final /* synthetic */ MenuDrawerNoIcon f6363b;

            public boolean mo1955a(MenuItem menuItem) {
                Toast.makeText(this.f6363b.getApplicationContext(), menuItem.getTitle() + " Selected", 0).show();
                this.f6363b.f6364m.mo760a(menuItem.getTitle());
                drawerLayout.m3855b();
                return true;
            }
        });
        drawerLayout.m3868e(8388611);
        m11498a(navigationView);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1142R.layout.activity_menu_drawer_no_icon);
        m11500j();
        m11501k();
    }
}
