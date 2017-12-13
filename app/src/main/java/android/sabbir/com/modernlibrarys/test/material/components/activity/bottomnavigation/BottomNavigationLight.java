package android.sabbir.com.modernlibrarys.test.material.components.activity.bottomnavigation;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.BottomNavigationView.C0139b;
import android.support.v4.widget.NestedScrollView;
import android.support.v4.widget.NestedScrollView.C0702b;
import android.support.v7.app.C0818e;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.C1142R;
import com.material.components.p089f.C2746d;

public class BottomNavigationLight extends C0818e {
    boolean f6034m = false;
    boolean f6035n = false;
    private TextView f6036o;
    private BottomNavigationView f6037p;
    private View f6038q;

    class C23611 implements C0139b {
        final /* synthetic */ BottomNavigationLight f6031a;

        C23611(BottomNavigationLight bottomNavigationLight) {
            this.f6031a = bottomNavigationLight;
        }

        public boolean mo1926a(MenuItem menuItem) {
            switch (menuItem.getItemId()) {
                case C1142R.id.navigation_recent:
                    this.f6031a.f6036o.setText(menuItem.getTitle());
                    return true;
                case C1142R.id.navigation_favorites:
                    this.f6031a.f6036o.setText(menuItem.getTitle());
                    return true;
                case C1142R.id.navigation_nearby:
                    this.f6031a.f6036o.setText(menuItem.getTitle());
                    return true;
                default:
                    return false;
            }
        }
    }

    class C23622 implements C0702b {
        final /* synthetic */ BottomNavigationLight f6032a;

        C23622(BottomNavigationLight bottomNavigationLight) {
            this.f6032a = bottomNavigationLight;
        }

        public void mo678a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
            if (i2 < i4) {
                this.f6032a.m11180b(false);
                this.f6032a.m11181c(false);
            }
            if (i2 > i4) {
                this.f6032a.m11180b(true);
                this.f6032a.m11181c(true);
            }
        }
    }

    class C23633 implements OnClickListener {
        final /* synthetic */ BottomNavigationLight f6033a;

        C23633(BottomNavigationLight bottomNavigationLight) {
            this.f6033a = bottomNavigationLight;
        }

        public void onClick(View view) {
            this.f6033a.finish();
        }
    }

    private void m11180b(boolean z) {
        if (!this.f6034m || !z) {
            if (this.f6034m || z) {
                this.f6034m = z;
                this.f6037p.animate().translationY((float) (z ? this.f6037p.getHeight() * 2 : 0)).setStartDelay(100).setDuration(300).start();
            }
        }
    }

    private void m11181c(boolean z) {
        if (!this.f6035n || !z) {
            if (this.f6035n || z) {
                this.f6035n = z;
                this.f6038q.animate().translationY((float) (z ? -(this.f6038q.getHeight() * 2) : 0)).setStartDelay(100).setDuration(300).start();
            }
        }
    }

    private void m11182j() {
        this.f6038q = findViewById(C1142R.id.search_bar);
        this.f6036o = (TextView) findViewById(C1142R.id.search_text);
        this.f6037p = (BottomNavigationView) findViewById(C1142R.id.navigation);
        this.f6037p.setOnNavigationItemSelectedListener(new C23611(this));
        ((NestedScrollView) findViewById(C1142R.id.nested_scroll_view)).setOnScrollChangeListener(new C23622(this));
        C2746d.m12254a((Context) this, (ImageView) findViewById(C1142R.id.image_1), (int) C1142R.drawable.image_8);
        C2746d.m12254a((Context) this, (ImageView) findViewById(C1142R.id.image_2), (int) C1142R.drawable.image_9);
        C2746d.m12254a((Context) this, (ImageView) findViewById(C1142R.id.image_3), (int) C1142R.drawable.image_15);
        C2746d.m12254a((Context) this, (ImageView) findViewById(C1142R.id.image_4), (int) C1142R.drawable.image_14);
        C2746d.m12254a((Context) this, (ImageView) findViewById(C1142R.id.image_5), (int) C1142R.drawable.image_12);
        C2746d.m12254a((Context) this, (ImageView) findViewById(C1142R.id.image_6), (int) C1142R.drawable.image_2);
        C2746d.m12254a((Context) this, (ImageView) findViewById(C1142R.id.image_7), (int) C1142R.drawable.image_5);
        ((ImageButton) findViewById(C1142R.id.bt_menu)).setOnClickListener(new C23633(this));
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1142R.layout.activity_bottom_navigation_light);
        m11182j();
        C2746d.m12253a((Activity) this, (int) C1142R.color.grey_20);
    }
}
