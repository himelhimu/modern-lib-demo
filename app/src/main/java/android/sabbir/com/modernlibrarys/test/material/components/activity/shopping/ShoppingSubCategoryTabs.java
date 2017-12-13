package android.sabbir.com.modernlibrarys.test.material.components.activity.shopping;

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
import android.view.View;
import android.widget.Toast;
import butterknife.C1142R;
import com.material.components.p088c.C2720e;
import java.util.ArrayList;
import java.util.List;

public class ShoppingSubCategoryTabs extends C0818e {
    public View f6743m;
    private ViewPager f6744n;
    private TabLayout f6745o;

    private class C2630a extends C0378u {
        final /* synthetic */ ShoppingSubCategoryTabs f6740a;
        private final List<C0227l> f6741b = new ArrayList();
        private final List<String> f6742c = new ArrayList();

        public C2630a(ShoppingSubCategoryTabs shoppingSubCategoryTabs, C0365q c0365q) {
            this.f6740a = shoppingSubCategoryTabs;
            super(c0365q);
        }

        public C0227l mo1958a(int i) {
            return (C0227l) this.f6741b.get(i);
        }

        public void m11876a(C0227l c0227l, String str) {
            this.f6741b.add(c0227l);
            this.f6742c.add(str);
        }

        public int mo1933b() {
            return this.f6741b.size();
        }

        public CharSequence mo1959c(int i) {
            return (CharSequence) this.f6742c.get(i);
        }
    }

    private void m11879a(ViewPager viewPager) {
        ab c2630a = new C2630a(this, m1917e());
        c2630a.m11876a(C2720e.m12201a(), "WOMEN");
        c2630a.m11876a(C2720e.m12201a(), "MEN");
        c2630a.m11876a(C2720e.m12201a(), "YOUNG BOYS");
        c2630a.m11876a(C2720e.m12201a(), "YOUNG GIRLS");
        c2630a.m11876a(C2720e.m12201a(), "ALL TIME");
        viewPager.setAdapter(c2630a);
    }

    private void m11880j() {
        m4362a((Toolbar) findViewById(C1142R.id.toolbar));
        m4370f().mo760a((CharSequence) "Fashion");
        m4370f().mo761a(true);
    }

    private void m11881k() {
        this.f6744n = (ViewPager) findViewById(C1142R.id.view_pager);
        m11879a(this.f6744n);
        this.f6745o = (TabLayout) findViewById(C1142R.id.tab_layout);
        this.f6745o.setupWithViewPager(this.f6744n);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1142R.layout.activity_shopping_sub_category_tabs);
        this.f6743m = findViewById(C1142R.id.parent_view);
        m11880j();
        m11881k();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C1142R.menu.menu_cart_setting, menu);
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
