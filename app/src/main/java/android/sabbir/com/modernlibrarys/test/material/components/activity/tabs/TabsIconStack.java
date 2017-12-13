package android.sabbir.com.modernlibrarys.test.material.components.activity.tabs;

import android.app.Activity;
import android.graphics.PorterDuff.Mode;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.design.widget.TabLayout.C0182b;
import android.support.design.widget.TabLayout.C0189e;
import android.support.v4.p008b.C0227l;
import android.support.v4.p008b.C0365q;
import android.support.v4.p008b.C0378u;
import android.support.v4.view.ViewPager;
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

public class TabsIconStack extends C0818e {
    private ViewPager f6929m;
    private C2691a f6930n;
    private TabLayout f6931o;

    class C26901 implements C0182b {
        final /* synthetic */ TabsIconStack f6925a;

        C26901(TabsIconStack tabsIconStack) {
            this.f6925a = tabsIconStack;
        }

        public void mo183a(C0189e c0189e) {
            this.f6925a.m4370f().mo760a(this.f6925a.f6930n.m12095e(c0189e.m1078c()));
            c0189e.m1075b().setColorFilter(this.f6925a.getResources().getColor(C1142R.color.deep_orange_500), Mode.SRC_IN);
        }

        public void mo184b(C0189e c0189e) {
            c0189e.m1075b().setColorFilter(this.f6925a.getResources().getColor(C1142R.color.grey_20), Mode.SRC_IN);
        }

        public void mo185c(C0189e c0189e) {
        }
    }

    private class C2691a extends C0378u {
        final /* synthetic */ TabsIconStack f6926a;
        private final List<C0227l> f6927b = new ArrayList();
        private final List<String> f6928c = new ArrayList();

        public C2691a(TabsIconStack tabsIconStack, C0365q c0365q) {
            this.f6926a = tabsIconStack;
            super(c0365q);
        }

        public C0227l mo1958a(int i) {
            return (C0227l) this.f6927b.get(i);
        }

        public void m12092a(C0227l c0227l, String str) {
            this.f6927b.add(c0227l);
            this.f6928c.add(str);
        }

        public int mo1933b() {
            return this.f6927b.size();
        }

        public CharSequence mo1959c(int i) {
            return null;
        }

        public String m12095e(int i) {
            return (String) this.f6928c.get(i);
        }
    }

    private void m12097a(ViewPager viewPager) {
        this.f6930n = new C2691a(this, m1917e());
        this.f6930n.m12092a(C2723g.m12206a(), "Music");
        this.f6930n.m12092a(C2723g.m12206a(), "Movies");
        this.f6930n.m12092a(C2723g.m12206a(), "Books");
        this.f6930n.m12092a(C2723g.m12206a(), "Games");
        viewPager.setAdapter(this.f6930n);
    }

    private void m12098j() {
        Toolbar toolbar = (Toolbar) findViewById(C1142R.id.toolbar);
        toolbar.setNavigationIcon((int) C1142R.drawable.ic_menu);
        m4362a(toolbar);
        m4370f().mo760a((CharSequence) "Music");
        m4370f().mo761a(true);
        C2746d.m12253a((Activity) this, (int) C1142R.color.deep_orange_700);
    }

    private void m12099k() {
        this.f6929m = (ViewPager) findViewById(C1142R.id.view_pager);
        this.f6931o = (TabLayout) findViewById(C1142R.id.tab_layout);
        m12097a(this.f6929m);
        this.f6931o.setupWithViewPager(this.f6929m);
        this.f6931o.m1120a(0).m1079c(C1142R.drawable.ic_music);
        this.f6931o.m1120a(1).m1079c(C1142R.drawable.ic_movie);
        this.f6931o.m1120a(2).m1079c(C1142R.drawable.ic_book);
        this.f6931o.m1120a(3).m1079c(C1142R.drawable.ic_games);
        this.f6931o.m1120a(0).m1075b().setColorFilter(getResources().getColor(C1142R.color.deep_orange_500), Mode.SRC_IN);
        this.f6931o.m1120a(1).m1075b().setColorFilter(getResources().getColor(C1142R.color.grey_20), Mode.SRC_IN);
        this.f6931o.m1120a(2).m1075b().setColorFilter(getResources().getColor(C1142R.color.grey_20), Mode.SRC_IN);
        this.f6931o.m1120a(3).m1075b().setColorFilter(getResources().getColor(C1142R.color.grey_20), Mode.SRC_IN);
        this.f6931o.m1123a(new C26901(this));
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1142R.layout.activity_tabs_icon_stack);
        m12098j();
        m12099k();
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
