package android.sabbir.com.modernlibrarys.test.material.components.activity.tabs;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.p008b.C0227l;
import android.support.v4.p008b.C0365q;
import android.support.v4.p008b.C0378u;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ab;
import android.support.v7.app.C0818e;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import butterknife.C1142R;
import com.material.components.p088c.C2722f;
import com.material.components.p089f.C2746d;
import java.util.ArrayList;
import java.util.List;

public class TabsDark extends C0818e {
    private ViewPager f6909m;
    private TabLayout f6910n;

    private class C2685a extends C0378u {
        final /* synthetic */ TabsDark f6906a;
        private final List<C0227l> f6907b = new ArrayList();
        private final List<String> f6908c = new ArrayList();

        public C2685a(TabsDark tabsDark, C0365q c0365q) {
            this.f6906a = tabsDark;
            super(c0365q);
        }

        public C0227l mo1958a(int i) {
            return (C0227l) this.f6907b.get(i);
        }

        public void m12058a(C0227l c0227l, String str) {
            this.f6907b.add(c0227l);
            this.f6908c.add(str);
        }

        public int mo1933b() {
            return this.f6907b.size();
        }

        public CharSequence mo1959c(int i) {
            return (CharSequence) this.f6908c.get(i);
        }
    }

    private void m12061a(ViewPager viewPager) {
        ab c2685a = new C2685a(this, m1917e());
        c2685a.m12058a(C2722f.m12204a(), "ALL");
        c2685a.m12058a(C2722f.m12204a(), "CAMERA");
        c2685a.m12058a(C2722f.m12204a(), "RECENT");
        viewPager.setAdapter(c2685a);
    }

    private void m12062j() {
        Toolbar toolbar = (Toolbar) findViewById(C1142R.id.toolbar);
        toolbar.setNavigationIcon((int) C1142R.drawable.ic_menu);
        m4362a(toolbar);
        m4370f().mo760a((CharSequence) "Dark");
        m4370f().mo761a(true);
        C2746d.m12253a((Activity) this, (int) C1142R.color.grey_1000);
    }

    private void m12063k() {
        this.f6909m = (ViewPager) findViewById(C1142R.id.view_pager);
        m12061a(this.f6909m);
        this.f6910n = (TabLayout) findViewById(C1142R.id.tab_layout);
        this.f6910n.setupWithViewPager(this.f6909m);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1142R.layout.activity_tabs_dark);
        m12062j();
        m12063k();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C1142R.menu.menu_search_setting, menu);
        C2746d.m12257a(menu, -1);
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
