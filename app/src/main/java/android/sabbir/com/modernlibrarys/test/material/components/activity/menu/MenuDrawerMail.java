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
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.Toast;
import butterknife.C1142R;
import com.material.components.p089f.C2746d;
import com.mikhaellopez.circularimageview.CircularImageView;

public class MenuDrawerMail extends C0818e {
    private C0804a f6349m;
    private Toolbar f6350n;
    private Menu f6351o;
    private DrawerLayout f6352p;
    private View f6353q;
    private boolean f6354r = false;

    class C24832 implements C0170a {
        final /* synthetic */ MenuDrawerMail f6346a;

        C24832(MenuDrawerMail menuDrawerMail) {
            this.f6346a = menuDrawerMail;
        }

        public boolean mo1955a(MenuItem menuItem) {
            this.f6346a.m11484a(menuItem);
            return true;
        }
    }

    private void m11483a(NavigationView navigationView) {
        if (!this.f6354r) {
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
    }

    private void m11484a(MenuItem menuItem) {
        if (this.f6354r) {
            TextView textView = (TextView) this.f6353q.findViewById(C1142R.id.name);
            TextView textView2 = (TextView) this.f6353q.findViewById(C1142R.id.email);
            CircularImageView circularImageView = (CircularImageView) this.f6353q.findViewById(C1142R.id.avatar);
            switch (menuItem.getItemId()) {
                case 1000:
                    textView.setText("Evans Collins");
                    textView2.setText(menuItem.getTitle().toString());
                    circularImageView.setImageResource(C1142R.drawable.photo_male_5);
                    return;
                case 2000:
                    textView.setText("Adams Green");
                    textView2.setText(menuItem.getTitle().toString());
                    circularImageView.setImageResource(C1142R.drawable.photo_male_2);
                    return;
                default:
                    Toast.makeText(getApplicationContext(), menuItem.getTitle(), 0).show();
                    return;
            }
        }
        Toast.makeText(getApplicationContext(), menuItem.getTitle() + " Selected", 0).show();
        this.f6349m.mo760a(menuItem.getTitle());
        this.f6352p.m3855b();
    }

    private void m11488j() {
        this.f6350n = (Toolbar) findViewById(C1142R.id.toolbar);
        this.f6350n.setBackgroundColor(getResources().getColor(C1142R.color.pink_600));
        m4362a(this.f6350n);
        this.f6349m = m4370f();
        this.f6349m.mo761a(true);
        this.f6349m.mo764b(true);
        this.f6349m.mo760a((CharSequence) "Drawer News");
        C2746d.m12253a((Activity) this, (int) C1142R.color.pink_700);
    }

    private void m11489k() {
        final NavigationView navigationView = (NavigationView) findViewById(C1142R.id.nav_view);
        this.f6352p = (DrawerLayout) findViewById(C1142R.id.drawer_layout);
        Object c24821 = new C0813b(this, this, this.f6352p, this.f6350n, C1142R.string.navigation_drawer_open, C1142R.string.navigation_drawer_close) {
            final /* synthetic */ MenuDrawerMail f6345d;

            public void mo685a(View view) {
                this.f6345d.m11483a(navigationView);
                super.mo685a(view);
            }
        };
        this.f6352p.setDrawerListener(c24821);
        c24821.m4331a();
        navigationView.setNavigationItemSelectedListener(new C24832(this));
        this.f6352p.m3868e(8388611);
        m11483a(navigationView);
        this.f6351o = navigationView.getMenu();
        this.f6353q = navigationView.m1008c(0);
        this.f6353q.findViewById(C1142R.id.bt_account).setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ MenuDrawerMail f6348b;

            public void onClick(View view) {
                boolean a = C2746d.m12258a(view);
                this.f6348b.f6354r = a;
                this.f6348b.f6351o.clear();
                if (a) {
                    this.f6348b.f6351o.add(1, 1000, 100, "evans.collins@mail.com").setIcon(C1142R.drawable.ic_account_circle);
                    this.f6348b.f6351o.add(1, 2000, 100, "adams.green@mail.com").setIcon(C1142R.drawable.ic_account_circle);
                    this.f6348b.f6351o.add(1, 1, 100, "Add account").setIcon(C1142R.drawable.ic_add);
                    this.f6348b.f6351o.add(1, 2, 100, "Manage accounts").setIcon(C1142R.drawable.ic_settings);
                    return;
                }
                navigationView.m1005a((int) C1142R.menu.menu_navigation_drawer_mail);
                this.f6348b.m11483a(navigationView);
            }
        });
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1142R.layout.activity_menu_drawer_mail);
        m11488j();
        m11489k();
    }
}
