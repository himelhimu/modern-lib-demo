package android.sabbir.com.modernlibrarys.test.material.components.activity.bottomnavigation;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.widget.NestedScrollView;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;



public class BottomNavigationBasic extends BottomNavigationView {
    boolean f6015m = false;
    boolean f6016n = false;
    private TextView f6017o;
    private BottomNavigationView f6018p;
    private View f6019q;

    class C23551 implements C0139b {
        final /* synthetic */ BottomNavigationBasic f6012a;

        C23551(BottomNavigationBasic bottomNavigationBasic) {
            this.f6012a = bottomNavigationBasic;
        }

        public boolean mo1926a(MenuItem menuItem) {
            switch (menuItem.getItemId()) {
                case C1142R.id.navigation_recent:
                    this.f6012a.f6017o.setText(menuItem.getTitle());
                    return true;
                case C1142R.id.navigation_favorites:
                    this.f6012a.f6017o.setText(menuItem.getTitle());
                    return true;
                case C1142R.id.navigation_nearby:
                    this.f6012a.f6017o.setText(menuItem.getTitle());
                    return true;
                default:
                    return false;
            }
        }
    }

    class C23562 implements C0702b {
        final /* synthetic */ BottomNavigationBasic f6013a;

        C23562(BottomNavigationBasic bottomNavigationBasic) {
            this.f6013a = bottomNavigationBasic;
        }

        public void mo678a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
            if (i2 < i4) {
                this.f6013a.m11156b(false);
                this.f6013a.m11157c(false);
            }
            if (i2 > i4) {
                this.f6013a.m11156b(true);
                this.f6013a.m11157c(true);
            }
        }
    }

    class C23573 implements OnClickListener {
        final /* synthetic */ BottomNavigationBasic f6014a;

        C23573(BottomNavigationBasic bottomNavigationBasic) {
            this.f6014a = bottomNavigationBasic;
        }

        public void onClick(View view) {
            this.f6014a.finish();
        }
    }

    private void m11156b(boolean z) {
        if (!this.f6015m || !z) {
            if (this.f6015m || z) {
                this.f6015m = z;
                this.f6018p.animate().translationY((float) (z ? this.f6018p.getHeight() * 2 : 0)).setStartDelay(100).setDuration(300).start();
            }
        }
    }

    private void m11157c(boolean z) {
        if (!this.f6016n || !z) {
            if (this.f6016n || z) {
                this.f6016n = z;
                this.f6019q.animate().translationY((float) (z ? -(this.f6019q.getHeight() * 2) : 0)).setStartDelay(100).setDuration(300).start();
            }
        }
    }

    private void m11158j() {
        this.f6019q = findViewById(C1142R.id.search_bar);
        this.f6017o = (TextView) findViewById(C1142R.id.search_text);
        this.f6018p = (BottomNavigationView) findViewById(C1142R.id.navigation);
        this.f6018p.setOnNavigationItemSelectedListener(new C23551(this));
        ((NestedScrollView) findViewById(C1142R.id.nested_scroll_view)).setOnScrollChangeListener(new C23562(this));
        C2746d.m12254a((Context) this, (ImageView) findViewById(C1142R.id.image_1), (int) C1142R.drawable.image_8);
        C2746d.m12254a((Context) this, (ImageView) findViewById(C1142R.id.image_2), (int) C1142R.drawable.image_9);
        C2746d.m12254a((Context) this, (ImageView) findViewById(C1142R.id.image_3), (int) C1142R.drawable.image_15);
        C2746d.m12254a((Context) this, (ImageView) findViewById(C1142R.id.image_4), (int) C1142R.drawable.image_14);
        C2746d.m12254a((Context) this, (ImageView) findViewById(C1142R.id.image_5), (int) C1142R.drawable.image_12);
        C2746d.m12254a((Context) this, (ImageView) findViewById(C1142R.id.image_6), (int) C1142R.drawable.image_2);
        C2746d.m12254a((Context) this, (ImageView) findViewById(C1142R.id.image_7), (int) C1142R.drawable.image_5);
        ((ImageButton) findViewById(C1142R.id.bt_menu)).setOnClickListener(new C23573(this));
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1142R.layout.activity_bottom_navigation_basic);
        m11158j();
    }
}
