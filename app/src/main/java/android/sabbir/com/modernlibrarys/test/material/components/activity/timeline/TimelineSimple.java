package android.sabbir.com.modernlibrarys.test.material.components.activity.timeline;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.widget.NestedScrollView;
import android.support.v4.widget.NestedScrollView.C0702b;
import android.support.v7.app.C0818e;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import butterknife.C1142R;
import com.material.components.p089f.C2746d;

public class TimelineSimple extends C0818e {
    boolean f6956m = false;

    class C26971 implements C0702b {
        final /* synthetic */ TimelineSimple f6955a;

        C26971(TimelineSimple timelineSimple) {
            this.f6955a = timelineSimple;
        }

        public void mo678a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
            if (i2 < i4) {
                this.f6955a.m12141b(false);
            }
            if (i2 > i4) {
                this.f6955a.m12141b(true);
            }
        }
    }

    private void m12141b(boolean z) {
        FloatingActionButton floatingActionButton = (FloatingActionButton) findViewById(C1142R.id.fab_add);
        if (!this.f6956m || !z) {
            if (this.f6956m || z) {
                this.f6956m = z;
                floatingActionButton.animate().translationY((float) (z ? floatingActionButton.getHeight() * 2 : 0)).setStartDelay(100).setDuration(300).start();
            }
        }
    }

    private void m12142j() {
        Toolbar toolbar = (Toolbar) findViewById(C1142R.id.toolbar);
        toolbar.setNavigationIcon((int) C1142R.drawable.ic_menu);
        m4362a(toolbar);
        m4370f().mo760a((CharSequence) "Activity");
        m4370f().mo761a(true);
        C2746d.m12253a((Activity) this, (int) C1142R.color.green_800);
    }

    private void m12143k() {
        ((NestedScrollView) findViewById(C1142R.id.nested_scroll_view)).setOnScrollChangeListener(new C26971(this));
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1142R.layout.activity_timeline_simple);
        m12142j();
        m12143k();
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
