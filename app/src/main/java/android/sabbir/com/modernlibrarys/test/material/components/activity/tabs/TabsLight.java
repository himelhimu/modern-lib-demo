package android.sabbir.com.modernlibrarys.test.material.components.activity.tabs;

import android.app.Activity;
import android.graphics.PorterDuff.Mode;
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

public class TabsLight extends C0818e {
    private ViewPager f6935m;
    private TabLayout f6936n;

    private class C2692a extends C0378u {
        final /* synthetic */ TabsLight f6932a;
        private final List<C0227l> f6933b = new ArrayList();
        private final List<String> f6934c = new ArrayList();

        public C2692a(TabsLight tabsLight, C0365q c0365q) {
            this.f6932a = tabsLight;
            super(c0365q);
        }

        public C0227l mo1958a(int i) {
            return (C0227l) this.f6933b.get(i);
        }

        public void m12101a(C0227l c0227l, String str) {
            this.f6933b.add(c0227l);
            this.f6934c.add(str);
        }

        public int mo1933b() {
            return this.f6933b.size();
        }

        public CharSequence mo1959c(int i) {
            return (CharSequence) this.f6934c.get(i);
        }
    }

    private void m12104a(ViewPager viewPager) {
        ab c2692a = new C2692a(this, m1917e());
        c2692a.m12101a(C2722f.m12204a(), "ALL");
        c2692a.m12101a(C2722f.m12204a(), "CAMERA");
        c2692a.m12101a(C2722f.m12204a(), "RECENT");
        viewPager.setAdapter(c2692a);
    }

    private void m12105j() {
        Toolbar toolbar = (Toolbar) findViewById(C1142R.id.toolbar);
        toolbar.setNavigationIcon((int) C1142R.drawable.ic_menu);
        toolbar.getNavigationIcon().setColorFilter(getResources().getColor(C1142R.color.grey_60), Mode.SRC_ATOP);
        m4362a(toolbar);
        m4370f().mo760a((CharSequence) "Gallery");
        m4370f().mo761a(true);
        C2746d.m12253a((Activity) this, (int) C1142R.color.grey_20);
    }

    private void m12106k() {
        this.f6935m = (ViewPager) findViewById(C1142R.id.view_pager);
        m12104a(this.f6935m);
        this.f6936n = (TabLayout) findViewById(C1142R.id.tab_layout);
        this.f6936n.setupWithViewPager(this.f6935m);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1142R.layout.activity_tabs_light);
        m12105j();
        m12106k();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C1142R.menu.menu_search_setting, menu);
        C2746d.m12257a(menu, getResources().getColor(C1142R.color.grey_60));
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
