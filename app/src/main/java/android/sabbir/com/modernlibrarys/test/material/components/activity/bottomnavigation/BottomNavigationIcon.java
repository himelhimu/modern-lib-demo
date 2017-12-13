package android.sabbir.com.modernlibrarys.test.material.components.activity.bottomnavigation;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff.Mode;
import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.TabLayout;
import android.support.design.widget.TabLayout.C0182b;
import android.support.design.widget.TabLayout.C0189e;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.app.C0804a;
import android.support.v7.app.C0818e;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.Toast;

import com.material.components.p089f.C2746d;
import com.material.components.p089f.C2754e;

import butterknife.C1142R;

public class BottomNavigationIcon extends BottomNavigationView {
    private TabLayout f6028m;
    private C0804a f6029n;
    private NestedScrollView f6030o;

    private void m11173j() {
        Toolbar toolbar = (Toolbar) findViewById(C1142R.id.toolbar);
        toolbar.setNavigationIcon((int) C1142R.drawable.ic_menu);
        toolbar.getNavigationIcon().setColorFilter(getResources().getColor(C1142R.color.grey_60), Mode.SRC_ATOP);
        m4362a(toolbar);
        this.f6029n = m4370f();
        this.f6029n.mo760a((CharSequence) "Home");
        this.f6029n.mo761a(true);
        C2746d.m12253a((Activity) this, (int) C1142R.color.grey_20);
    }

    private void m11174k() {
        this.f6030o = (NestedScrollView) findViewById(C1142R.id.nested_scroll_view);
        this.f6028m = (TabLayout) findViewById(C1142R.id.tab_layout);
        this.f6028m.m1125a(this.f6028m.m1119a().m1079c(C1142R.drawable.ic_home), 0);
        this.f6028m.m1125a(this.f6028m.m1119a().m1079c(C1142R.drawable.ic_search), 1);
        this.f6028m.m1125a(this.f6028m.m1119a().m1079c(C1142R.drawable.ic_add_box), 2);
        this.f6028m.m1125a(this.f6028m.m1119a().m1079c(C1142R.drawable.ic_favorite_border), 3);
        this.f6028m.m1125a(this.f6028m.m1119a().m1079c(C1142R.drawable.ic_person), 4);
        this.f6028m.m1120a(0).m1075b().setColorFilter(getResources().getColor(C1142R.color.deep_orange_500), Mode.SRC_IN);
        this.f6028m.m1120a(1).m1075b().setColorFilter(getResources().getColor(C1142R.color.grey_60), Mode.SRC_IN);
        this.f6028m.m1120a(2).m1075b().setColorFilter(getResources().getColor(C1142R.color.grey_60), Mode.SRC_IN);
        this.f6028m.m1120a(3).m1075b().setColorFilter(getResources().getColor(C1142R.color.grey_60), Mode.SRC_IN);
        this.f6028m.m1120a(4).m1075b().setColorFilter(getResources().getColor(C1142R.color.grey_60), Mode.SRC_IN);
        this.f6028m.m1123a(new C23601(this));
        C2746d.m12254a((Context) this, (ImageView) findViewById(C1142R.id.image_1), (int) C1142R.drawable.image_8);
        C2746d.m12254a((Context) this, (ImageView) findViewById(C1142R.id.image_2), (int) C1142R.drawable.image_9);
        C2746d.m12254a((Context) this, (ImageView) findViewById(C1142R.id.image_3), (int) C1142R.drawable.image_15);
        C2746d.m12254a((Context) this, (ImageView) findViewById(C1142R.id.image_4), (int) C1142R.drawable.image_14);
        C2746d.m12254a((Context) this, (ImageView) findViewById(C1142R.id.image_5), (int) C1142R.drawable.image_12);
        C2746d.m12254a((Context) this, (ImageView) findViewById(C1142R.id.image_6), (int) C1142R.drawable.image_2);
        C2746d.m12254a((Context) this, (ImageView) findViewById(C1142R.id.image_7), (int) C1142R.drawable.image_5);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1142R.layout.activity_bottom_navigation_icon);
        m11173j();
        m11174k();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C1142R.menu.menu_search, menu);
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

    class C23601 implements C0182b {
        final /* synthetic */ BottomNavigationIcon f6027a;

        C23601(BottomNavigationIcon bottomNavigationIcon) {
            this.f6027a = bottomNavigationIcon;
        }

        public void mo183a(C0189e c0189e) {
            c0189e.m1075b().setColorFilter(this.f6027a.getResources().getColor(C1142R.color.deep_orange_500), Mode.SRC_IN);
            switch (c0189e.m1078c()) {
                case 0:
                    this.f6027a.f6029n.mo760a((CharSequence) "Home");
                    break;
                case 1:
                    this.f6027a.f6029n.mo760a((CharSequence) "Explore");
                    break;
                case 2:
                    this.f6027a.f6029n.mo760a((CharSequence) "Story");
                    break;
                case 3:
                    this.f6027a.f6029n.mo760a((CharSequence) "Activity");
                    break;
                case 4:
                    this.f6027a.f6029n.mo760a((CharSequence) "Profile");
                    break;
            }
            C2754e.m12275g(this.f6027a.f6030o);
        }

        public void mo184b(C0189e c0189e) {
            c0189e.m1075b().setColorFilter(this.f6027a.getResources().getColor(C1142R.color.grey_60), Mode.SRC_IN);
        }

        public void mo185c(C0189e c0189e) {
        }
    }
}
