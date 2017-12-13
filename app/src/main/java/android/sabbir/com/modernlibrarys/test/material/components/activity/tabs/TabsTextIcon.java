package android.sabbir.com.modernlibrarys.test.material.components.activity.tabs;

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
import java.util.ArrayList;
import java.util.List;

public class TabsTextIcon extends C0818e {
    private ViewPager f6952m;
    private C2696a f6953n;
    private TabLayout f6954o;

    class C26951 implements C0182b {
        final /* synthetic */ TabsTextIcon f6948a;

        C26951(TabsTextIcon tabsTextIcon) {
            this.f6948a = tabsTextIcon;
        }

        public void mo183a(C0189e c0189e) {
            c0189e.m1075b().setColorFilter(-1, Mode.SRC_IN);
        }

        public void mo184b(C0189e c0189e) {
            c0189e.m1075b().setColorFilter(this.f6948a.getResources().getColor(C1142R.color.grey_20), Mode.SRC_IN);
        }

        public void mo185c(C0189e c0189e) {
        }
    }

    private class C2696a extends C0378u {
        final /* synthetic */ TabsTextIcon f6949a;
        private final List<C0227l> f6950b = new ArrayList();
        private final List<String> f6951c = new ArrayList();

        public C2696a(TabsTextIcon tabsTextIcon, C0365q c0365q) {
            this.f6949a = tabsTextIcon;
            super(c0365q);
        }

        public C0227l mo1958a(int i) {
            return (C0227l) this.f6950b.get(i);
        }

        public void m12127a(C0227l c0227l, String str) {
            this.f6950b.add(c0227l);
            this.f6951c.add(str);
        }

        public int mo1933b() {
            return this.f6950b.size();
        }

        public CharSequence mo1959c(int i) {
            return (CharSequence) this.f6951c.get(i);
        }
    }

    private void m12130a(ViewPager viewPager) {
        this.f6953n = new C2696a(this, m1917e());
        this.f6953n.m12127a(C2723g.m12206a(), "MUSIC");
        this.f6953n.m12127a(C2723g.m12206a(), "MOVIES");
        this.f6953n.m12127a(C2723g.m12206a(), "BOOKS");
        viewPager.setAdapter(this.f6953n);
    }

    private void m12131j() {
        Toolbar toolbar = (Toolbar) findViewById(C1142R.id.toolbar);
        toolbar.setNavigationIcon((int) C1142R.drawable.ic_menu);
        m4362a(toolbar);
        m4370f().mo760a((CharSequence) "Store");
        m4370f().mo761a(true);
    }

    private void m12132k() {
        this.f6952m = (ViewPager) findViewById(C1142R.id.view_pager);
        this.f6954o = (TabLayout) findViewById(C1142R.id.tab_layout);
        m12130a(this.f6952m);
        this.f6954o.setupWithViewPager(this.f6952m);
        this.f6954o.m1120a(0).m1079c(C1142R.drawable.ic_music);
        this.f6954o.m1120a(1).m1079c(C1142R.drawable.ic_movie);
        this.f6954o.m1120a(2).m1079c(C1142R.drawable.ic_book);
        this.f6954o.m1120a(0).m1075b().setColorFilter(-1, Mode.SRC_IN);
        this.f6954o.m1120a(1).m1075b().setColorFilter(getResources().getColor(C1142R.color.grey_20), Mode.SRC_IN);
        this.f6954o.m1120a(2).m1075b().setColorFilter(getResources().getColor(C1142R.color.grey_20), Mode.SRC_IN);
        this.f6954o.m1123a(new C26951(this));
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1142R.layout.activity_tabs_text_icon);
        m12132k();
        m12131j();
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
