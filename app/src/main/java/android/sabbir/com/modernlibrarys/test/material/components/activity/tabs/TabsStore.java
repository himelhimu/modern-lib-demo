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
import com.material.components.p088c.C2723g;
import com.material.components.p089f.C2746d;
import java.util.ArrayList;
import java.util.List;

public class TabsStore extends C0818e {
    private ViewPager f6946m;
    private TabLayout f6947n;

    private class C2694a extends C0378u {
        final /* synthetic */ TabsStore f6943a;
        private final List<C0227l> f6944b = new ArrayList();
        private final List<String> f6945c = new ArrayList();

        public C2694a(TabsStore tabsStore, C0365q c0365q) {
            this.f6943a = tabsStore;
            super(c0365q);
        }

        public C0227l mo1958a(int i) {
            return (C0227l) this.f6944b.get(i);
        }

        public void m12117a(C0227l c0227l, String str) {
            this.f6944b.add(c0227l);
            this.f6945c.add(str);
        }

        public int mo1933b() {
            return this.f6944b.size();
        }

        public CharSequence mo1959c(int i) {
            return (CharSequence) this.f6945c.get(i);
        }
    }

    private void m12120a(ViewPager viewPager) {
        ab c2694a = new C2694a(this, m1917e());
        c2694a.m12117a(C2723g.m12206a(), "MUSIC");
        c2694a.m12117a(C2723g.m12206a(), "MOVIES");
        c2694a.m12117a(C2723g.m12206a(), "BOOKS");
        c2694a.m12117a(C2723g.m12206a(), "GAMES");
        viewPager.setAdapter(c2694a);
    }

    private void m12121j() {
        Toolbar toolbar = (Toolbar) findViewById(C1142R.id.toolbar);
        toolbar.setNavigationIcon((int) C1142R.drawable.ic_menu);
        m4362a(toolbar);
        m4370f().mo760a((CharSequence) "Store");
        m4370f().mo761a(true);
        C2746d.m12253a((Activity) this, (int) C1142R.color.blue_grey_600);
    }

    private void m12122k() {
        this.f6946m = (ViewPager) findViewById(C1142R.id.view_pager);
        m12120a(this.f6946m);
        this.f6947n = (TabLayout) findViewById(C1142R.id.tab_layout);
        this.f6947n.setupWithViewPager(this.f6946m);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1142R.layout.activity_tabs_store);
        m12121j();
        m12122k();
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
