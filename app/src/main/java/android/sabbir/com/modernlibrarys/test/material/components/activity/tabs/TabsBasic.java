package android.sabbir.com.modernlibrarys.test.material.components.activity.tabs;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.p008b.C0227l;
import android.support.v4.p008b.C0365q;
import android.support.v4.p008b.C0378u;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ab;
import android.support.v7.app.C0818e;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import butterknife.C1142R;
import java.util.ArrayList;
import java.util.List;

public class TabsBasic extends C0818e {
    private ViewPager f6904m;
    private TabLayout f6905n;

    public static class C2683a extends C0227l {
        public static C2683a m12048c(int i) {
            C2683a c2683a = new C2683a();
            Bundle bundle = new Bundle();
            bundle.putInt("section_number", i);
            c2683a.mo1505g(bundle);
            return c2683a;
        }

        public View mo1503a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            View inflate = layoutInflater.inflate(C1142R.layout.fragment_tabs_basic, viewGroup, false);
            ((TextView) inflate.findViewById(C1142R.id.section_label)).setText(m1262a((int) C1142R.string.section_format, Integer.valueOf(m1308h().getInt("section_number"))));
            return inflate;
        }
    }

    private class C2684b extends C0378u {
        final /* synthetic */ TabsBasic f6901a;
        private final List<C0227l> f6902b = new ArrayList();
        private final List<String> f6903c = new ArrayList();

        public C2684b(TabsBasic tabsBasic, C0365q c0365q) {
            this.f6901a = tabsBasic;
            super(c0365q);
        }

        public C0227l mo1958a(int i) {
            return (C0227l) this.f6902b.get(i);
        }

        public void m12051a(C0227l c0227l, String str) {
            this.f6902b.add(c0227l);
            this.f6903c.add(str);
        }

        public int mo1933b() {
            return this.f6902b.size();
        }

        public CharSequence mo1959c(int i) {
            return (CharSequence) this.f6903c.get(i);
        }
    }

    private void m12054a(ViewPager viewPager) {
        ab c2684b = new C2684b(this, m1917e());
        c2684b.m12051a(C2683a.m12048c(1), "ITEM ONE");
        c2684b.m12051a(C2683a.m12048c(2), "ITEM TWO");
        c2684b.m12051a(C2683a.m12048c(3), "ITEM THREE");
        viewPager.setAdapter(c2684b);
    }

    private void m12055j() {
        Toolbar toolbar = (Toolbar) findViewById(C1142R.id.toolbar);
        toolbar.setNavigationIcon((int) C1142R.drawable.ic_menu);
        m4362a(toolbar);
        m4370f().mo760a((CharSequence) "Basic");
        m4370f().mo761a(true);
    }

    private void m12056k() {
        this.f6904m = (ViewPager) findViewById(C1142R.id.view_pager);
        m12054a(this.f6904m);
        this.f6905n = (TabLayout) findViewById(C1142R.id.tab_layout);
        this.f6905n.setupWithViewPager(this.f6904m);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1142R.layout.activity_tabs_basic);
        m12055j();
        m12056k();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C1142R.menu.menu_search_setting, menu);
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
