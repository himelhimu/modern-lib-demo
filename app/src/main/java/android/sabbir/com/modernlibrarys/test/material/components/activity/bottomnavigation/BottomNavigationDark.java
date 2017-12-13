package android.sabbir.com.modernlibrarys.test.material.components.activity.bottomnavigation;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.BottomNavigationView.C0139b;
import android.support.v4.widget.NestedScrollView;
import android.support.v4.widget.NestedScrollView.C0702b;
import android.support.v7.app.C0804a;
import android.support.v7.app.C0818e;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import butterknife.C1142R;
import com.material.components.p089f.C2746d;

public class BottomNavigationDark extends C0818e {
    boolean f6022m = false;
    boolean f6023n = false;
    private BottomNavigationView f6024o;
    private View f6025p;
    private C0804a f6026q;

    class C23581 implements C0139b {
        final /* synthetic */ BottomNavigationDark f6020a;

        C23581(BottomNavigationDark bottomNavigationDark) {
            this.f6020a = bottomNavigationDark;
        }

        public boolean mo1926a(MenuItem menuItem) {
            switch (menuItem.getItemId()) {
                case C1142R.id.navigation_recent:
                    this.f6020a.f6026q.mo760a(menuItem.getTitle());
                    return true;
                case C1142R.id.navigation_favorites:
                    this.f6020a.f6026q.mo760a(menuItem.getTitle());
                    return true;
                case C1142R.id.navigation_nearby:
                    this.f6020a.f6026q.mo760a(menuItem.getTitle());
                    return true;
                default:
                    return false;
            }
        }
    }

    class C23592 implements C0702b {
        final /* synthetic */ BottomNavigationDark f6021a;

        C23592(BottomNavigationDark bottomNavigationDark) {
            this.f6021a = bottomNavigationDark;
        }

        public void mo678a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
            if (i2 < i4) {
                this.f6021a.m11164b(false);
                this.f6021a.m11165c(false);
            }
            if (i2 > i4) {
                this.f6021a.m11164b(true);
                this.f6021a.m11165c(true);
            }
        }
    }

    private void m11164b(boolean z) {
        if (!this.f6022m || !z) {
            if (this.f6022m || z) {
                this.f6022m = z;
                this.f6024o.animate().translationY((float) (z ? this.f6024o.getHeight() * 2 : 0)).setStartDelay(100).setDuration(300).start();
            }
        }
    }

    private void m11165c(boolean z) {
        if (!this.f6023n || !z) {
            if (this.f6023n || z) {
                this.f6023n = z;
                this.f6025p.animate().translationY((float) (z ? -(this.f6025p.getHeight() * 2) : 0)).setStartDelay(100).setDuration(300).start();
            }
        }
    }

    private void m11166j() {
        Toolbar toolbar = (Toolbar) findViewById(C1142R.id.toolbar);
        toolbar.setNavigationIcon((int) C1142R.drawable.ic_menu);
        m4362a(toolbar);
        this.f6026q = m4370f();
        this.f6026q.mo760a((CharSequence) "Recents");
        this.f6026q.mo761a(true);
        C2746d.m12253a((Activity) this, (int) C1142R.color.grey_1000);
    }

    private void m11167k() {
        this.f6025p = findViewById(C1142R.id.search_bar);
        this.f6024o = (BottomNavigationView) findViewById(C1142R.id.navigation);
        this.f6024o.setOnNavigationItemSelectedListener(new C23581(this));
        ((NestedScrollView) findViewById(C1142R.id.nested_scroll_view)).setOnScrollChangeListener(new C23592(this));
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
        setContentView((int) C1142R.layout.activity_bottom_navigation_dark);
        m11166j();
        m11167k();
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
