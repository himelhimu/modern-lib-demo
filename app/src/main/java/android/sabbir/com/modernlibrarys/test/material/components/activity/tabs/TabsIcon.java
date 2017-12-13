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

public class TabsIcon extends C0818e {
    private ViewPager f6915m;
    private C2687a f6916n;
    private TabLayout f6917o;

    class C26861 implements C0182b {
        final /* synthetic */ TabsIcon f6911a;

        C26861(TabsIcon tabsIcon) {
            this.f6911a = tabsIcon;
        }

        public void mo183a(C0189e c0189e) {
            this.f6911a.m4370f().mo760a(this.f6911a.f6916n.m12071e(c0189e.m1078c()));
            c0189e.m1075b().setColorFilter(-1, Mode.SRC_IN);
        }

        public void mo184b(C0189e c0189e) {
            c0189e.m1075b().setColorFilter(this.f6911a.getResources().getColor(C1142R.color.grey_20), Mode.SRC_IN);
        }

        public void mo185c(C0189e c0189e) {
        }
    }

    private class C2687a extends C0378u {
        final /* synthetic */ TabsIcon f6912a;
        private final List<C0227l> f6913b = new ArrayList();
        private final List<String> f6914c = new ArrayList();

        public C2687a(TabsIcon tabsIcon, C0365q c0365q) {
            this.f6912a = tabsIcon;
            super(c0365q);
        }

        public C0227l mo1958a(int i) {
            return (C0227l) this.f6913b.get(i);
        }

        public void m12068a(C0227l c0227l, String str) {
            this.f6913b.add(c0227l);
            this.f6914c.add(str);
        }

        public int mo1933b() {
            return this.f6913b.size();
        }

        public CharSequence mo1959c(int i) {
            return null;
        }

        public String m12071e(int i) {
            return (String) this.f6914c.get(i);
        }
    }

    private void m12073a(ViewPager viewPager) {
        this.f6916n = new C2687a(this, m1917e());
        this.f6916n.m12068a(C2723g.m12206a(), "Music");
        this.f6916n.m12068a(C2723g.m12206a(), "Movies");
        this.f6916n.m12068a(C2723g.m12206a(), "Books");
        this.f6916n.m12068a(C2723g.m12206a(), "Games");
        viewPager.setAdapter(this.f6916n);
    }

    private void m12074j() {
        Toolbar toolbar = (Toolbar) findViewById(C1142R.id.toolbar);
        toolbar.setNavigationIcon((int) C1142R.drawable.ic_menu);
        m4362a(toolbar);
        m4370f().mo760a((CharSequence) "Music");
        m4370f().mo761a(true);
        C2746d.m12253a((Activity) this, (int) C1142R.color.blue_grey_600);
    }

    private void m12075k() {
        this.f6915m = (ViewPager) findViewById(C1142R.id.view_pager);
        this.f6917o = (TabLayout) findViewById(C1142R.id.tab_layout);
        m12073a(this.f6915m);
        this.f6917o.setupWithViewPager(this.f6915m);
        this.f6917o.m1120a(0).m1079c(C1142R.drawable.ic_music);
        this.f6917o.m1120a(1).m1079c(C1142R.drawable.ic_movie);
        this.f6917o.m1120a(2).m1079c(C1142R.drawable.ic_book);
        this.f6917o.m1120a(3).m1079c(C1142R.drawable.ic_games);
        this.f6917o.m1120a(0).m1075b().setColorFilter(-1, Mode.SRC_IN);
        this.f6917o.m1120a(1).m1075b().setColorFilter(getResources().getColor(C1142R.color.grey_20), Mode.SRC_IN);
        this.f6917o.m1120a(2).m1075b().setColorFilter(getResources().getColor(C1142R.color.grey_20), Mode.SRC_IN);
        this.f6917o.m1120a(3).m1075b().setColorFilter(getResources().getColor(C1142R.color.grey_20), Mode.SRC_IN);
        this.f6917o.m1123a(new C26861(this));
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1142R.layout.activity_tabs_icon);
        m12074j();
        m12075k();
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
