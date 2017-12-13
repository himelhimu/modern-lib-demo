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

public class TabsScroll extends C0818e {
    private ViewPager f6941m;
    private TabLayout f6942n;

    private class C2693a extends C0378u {
        final /* synthetic */ TabsScroll f6938a;
        private final List<C0227l> f6939b = new ArrayList();
        private final List<String> f6940c = new ArrayList();

        public C2693a(TabsScroll tabsScroll, C0365q c0365q) {
            this.f6938a = tabsScroll;
            super(c0365q);
        }

        public C0227l mo1958a(int i) {
            return (C0227l) this.f6939b.get(i);
        }

        public void m12110a(C0227l c0227l, String str) {
            this.f6939b.add(c0227l);
            this.f6940c.add(str);
        }

        public int mo1933b() {
            return this.f6939b.size();
        }

        public CharSequence mo1959c(int i) {
            return (CharSequence) this.f6940c.get(i);
        }
    }

    private void m12113a(ViewPager viewPager) {
        ab c2693a = new C2693a(this, m1917e());
        c2693a.m12110a(C2723g.m12206a(), "HOME");
        c2693a.m12110a(C2723g.m12206a(), "TOP ARTISTS");
        c2693a.m12110a(C2723g.m12206a(), "TOP ALBUMS");
        c2693a.m12110a(C2723g.m12206a(), "NEW RELEASES");
        c2693a.m12110a(C2723g.m12206a(), "TOP SONGS");
        viewPager.setAdapter(c2693a);
    }

    private void m12114j() {
        Toolbar toolbar = (Toolbar) findViewById(C1142R.id.toolbar);
        toolbar.setNavigationIcon((int) C1142R.drawable.ic_menu);
        m4362a(toolbar);
        m4370f().mo760a((CharSequence) "Scroll");
        m4370f().mo761a(true);
        C2746d.m12253a((Activity) this, (int) C1142R.color.blue_600);
    }

    private void m12115k() {
        this.f6941m = (ViewPager) findViewById(C1142R.id.view_pager);
        m12113a(this.f6941m);
        this.f6942n = (TabLayout) findViewById(C1142R.id.tab_layout);
        this.f6942n.setupWithViewPager(this.f6941m);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1142R.layout.activity_tabs_scroll);
        m12114j();
        m12115k();
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
