package android.sabbir.com.modernlibrarys.test.material.components.activity.bottomnavigation;

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

public class BottomNavigationShifting extends C0818e {
    boolean f6042m = false;
    boolean f6043n = false;
    private TextView f6044o;
    private BottomNavigationView f6045p;
    private View f6046q;

    class C23641 implements C0139b {
        final /* synthetic */ BottomNavigationShifting f6039a;

        C23641(BottomNavigationShifting bottomNavigationShifting) {
            this.f6039a = bottomNavigationShifting;
        }

        public boolean mo1926a(MenuItem menuItem) {
            switch (menuItem.getItemId()) {
                case C1142R.id.navigation_movie:
                    this.f6039a.f6044o.setText(menuItem.getTitle());
                    this.f6039a.f6045p.setBackgroundColor(this.f6039a.getResources().getColor(C1142R.color.blue_grey_700));
                    return true;
                case C1142R.id.navigation_music:
                    this.f6039a.f6044o.setText(menuItem.getTitle());
                    this.f6039a.f6045p.setBackgroundColor(this.f6039a.getResources().getColor(C1142R.color.pink_800));
                    return true;
                case C1142R.id.navigation_books:
                    this.f6039a.f6044o.setText(menuItem.getTitle());
                    this.f6039a.f6045p.setBackgroundColor(this.f6039a.getResources().getColor(C1142R.color.grey_700));
                    return true;
                case C1142R.id.navigation_newsstand:
                    this.f6039a.f6044o.setText(menuItem.getTitle());
                    this.f6039a.f6045p.setBackgroundColor(this.f6039a.getResources().getColor(C1142R.color.teal_800));
                    return true;
                default:
                    return false;
            }
        }
    }

    class C23652 implements C0702b {
        final /* synthetic */ BottomNavigationShifting f6040a;

        C23652(BottomNavigationShifting bottomNavigationShifting) {
            this.f6040a = bottomNavigationShifting;
        }

        public void mo678a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
            if (i2 < i4) {
                this.f6040a.m11189b(false);
                this.f6040a.m11190c(false);
            }
            if (i2 > i4) {
                this.f6040a.m11189b(true);
                this.f6040a.m11190c(true);
            }
        }
    }

    class C23663 implements OnClickListener {
        final /* synthetic */ BottomNavigationShifting f6041a;

        C23663(BottomNavigationShifting bottomNavigationShifting) {
            this.f6041a = bottomNavigationShifting;
        }

        public void onClick(View view) {
            this.f6041a.finish();
        }
    }

    private void m11189b(boolean z) {
        if (!this.f6042m || !z) {
            if (this.f6042m || z) {
                this.f6042m = z;
                this.f6045p.animate().translationY((float) (z ? this.f6045p.getHeight() * 2 : 0)).setStartDelay(100).setDuration(300).start();
            }
        }
    }

    private void m11190c(boolean z) {
        if (!this.f6043n || !z) {
            if (this.f6043n || z) {
                this.f6043n = z;
                this.f6046q.animate().translationY((float) (z ? -(this.f6046q.getHeight() * 2) : 0)).setStartDelay(100).setDuration(300).start();
            }
        }
    }

    private void m11191j() {
        this.f6046q = findViewById(C1142R.id.search_bar);
        this.f6044o = (TextView) findViewById(C1142R.id.search_text);
        this.f6045p = (BottomNavigationView) findViewById(C1142R.id.navigation);
        this.f6045p.setOnNavigationItemSelectedListener(new C23641(this));
        ((NestedScrollView) findViewById(C1142R.id.nested_scroll_view)).setOnScrollChangeListener(new C23652(this));
        C2746d.m12254a((Context) this, (ImageView) findViewById(C1142R.id.image_1), (int) C1142R.drawable.image_8);
        C2746d.m12254a((Context) this, (ImageView) findViewById(C1142R.id.image_2), (int) C1142R.drawable.image_9);
        C2746d.m12254a((Context) this, (ImageView) findViewById(C1142R.id.image_3), (int) C1142R.drawable.image_15);
        C2746d.m12254a((Context) this, (ImageView) findViewById(C1142R.id.image_4), (int) C1142R.drawable.image_14);
        C2746d.m12254a((Context) this, (ImageView) findViewById(C1142R.id.image_5), (int) C1142R.drawable.image_12);
        C2746d.m12254a((Context) this, (ImageView) findViewById(C1142R.id.image_6), (int) C1142R.drawable.image_2);
        C2746d.m12254a((Context) this, (ImageView) findViewById(C1142R.id.image_7), (int) C1142R.drawable.image_5);
        ((ImageButton) findViewById(C1142R.id.bt_menu)).setOnClickListener(new C23663(this));
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1142R.layout.activity_bottom_navigation_shifting);
        m11191j();
    }
}
