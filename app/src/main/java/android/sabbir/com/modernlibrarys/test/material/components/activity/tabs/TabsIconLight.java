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

public class TabsIconLight extends C0818e {
    private ViewPager f6922m;
    private C2689a f6923n;
    private TabLayout f6924o;

    class C26881 implements C0182b {
        final /* synthetic */ TabsIconLight f6918a;

        C26881(TabsIconLight tabsIconLight) {
            this.f6918a = tabsIconLight;
        }

        public void mo183a(C0189e c0189e) {
            this.f6918a.m4370f().mo760a(this.f6918a.f6923n.m12083e(c0189e.m1078c()));
            c0189e.m1075b().setColorFilter(this.f6918a.getResources().getColor(C1142R.color.deep_orange_500), Mode.SRC_IN);
        }

        public void mo184b(C0189e c0189e) {
            c0189e.m1075b().setColorFilter(this.f6918a.getResources().getColor(C1142R.color.grey_60), Mode.SRC_IN);
        }

        public void mo185c(C0189e c0189e) {
        }
    }

    private class C2689a extends C0378u {
        final /* synthetic */ TabsIconLight f6919a;
        private final List<C0227l> f6920b = new ArrayList();
        private final List<String> f6921c = new ArrayList();

        public C2689a(TabsIconLight tabsIconLight, C0365q c0365q) {
            this.f6919a = tabsIconLight;
            super(c0365q);
        }

        public C0227l mo1958a(int i) {
            return (C0227l) this.f6920b.get(i);
        }

        public void m12080a(C0227l c0227l, String str) {
            this.f6920b.add(c0227l);
            this.f6921c.add(str);
        }

        public int mo1933b() {
            return this.f6920b.size();
        }

        public CharSequence mo1959c(int i) {
            return null;
        }

        public String m12083e(int i) {
            return (String) this.f6921c.get(i);
        }
    }

    private void m12085a(ViewPager viewPager) {
        this.f6923n = new C2689a(this, m1917e());
        this.f6923n.m12080a(C2723g.m12206a(), "Music");
        this.f6923n.m12080a(C2723g.m12206a(), "Movies");
        this.f6923n.m12080a(C2723g.m12206a(), "Books");
        this.f6923n.m12080a(C2723g.m12206a(), "Games");
        viewPager.setAdapter(this.f6923n);
    }

    private void m12086j() {
        Toolbar toolbar = (Toolbar) findViewById(C1142R.id.toolbar);
        toolbar.setNavigationIcon((int) C1142R.drawable.ic_menu);
        toolbar.getNavigationIcon().setColorFilter(getResources().getColor(C1142R.color.grey_60), Mode.SRC_ATOP);
        m4362a(toolbar);
        m4370f().mo760a((CharSequence) "Music");
        m4370f().mo761a(true);
        C2746d.m12253a((Activity) this, (int) C1142R.color.grey_20);
    }

    private void m12087k() {
        this.f6922m = (ViewPager) findViewById(C1142R.id.view_pager);
        this.f6924o = (TabLayout) findViewById(C1142R.id.tab_layout);
        m12085a(this.f6922m);
        this.f6924o.setupWithViewPager(this.f6922m);
        this.f6924o.m1120a(0).m1079c(C1142R.drawable.ic_music);
        this.f6924o.m1120a(1).m1079c(C1142R.drawable.ic_movie);
        this.f6924o.m1120a(2).m1079c(C1142R.drawable.ic_book);
        this.f6924o.m1120a(3).m1079c(C1142R.drawable.ic_games);
        this.f6924o.m1120a(0).m1075b().setColorFilter(getResources().getColor(C1142R.color.deep_orange_500), Mode.SRC_IN);
        this.f6924o.m1120a(1).m1075b().setColorFilter(getResources().getColor(C1142R.color.grey_60), Mode.SRC_IN);
        this.f6924o.m1120a(2).m1075b().setColorFilter(getResources().getColor(C1142R.color.grey_60), Mode.SRC_IN);
        this.f6924o.m1120a(3).m1075b().setColorFilter(getResources().getColor(C1142R.color.grey_60), Mode.SRC_IN);
        this.f6924o.m1123a(new C26881(this));
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1142R.layout.activity_tabs_icon_light);
        m12086j();
        m12087k();
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
