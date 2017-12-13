package android.sabbir.com.modernlibrarys.test.material.components.activity.profile;

import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.AppBarLayout.Behavior;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v4.view.ai;
import android.support.v7.app.C0818e;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;


public class ProfilePolygon extends Behavior {
    private void m11717j() {
        Toolbar toolbar = (Toolbar) findViewById(C1142R.id.toolbar);
        toolbar.setNavigationIcon((int) C1142R.drawable.ic_menu);
        m4362a(toolbar);
        m4370f().mo760a((CharSequence) "Profile");
        m4370f().mo761a(true);
    }

    private void m11718k() {
        final CircularImageView circularImageView = (CircularImageView) findViewById(C1142R.id.image);
        final CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(C1142R.id.collapsing_toolbar);
        ((AppBarLayout) findViewById(C1142R.id.app_bar_layout)).m797a(new C0135b(this) {
            final /* synthetic */ ProfilePolygon f6585c;

            public void mo156a(AppBarLayout appBarLayout, int i) {
                int q = ai.m3323q(collapsingToolbarLayout) * 2;
                float f = ((float) (q + i)) / ((float) q);
                circularImageView.setScaleX(f >= 0.0f ? f : 0.0f);
                CircularImageView circularImageView = circularImageView;
                if (f < 0.0f) {
                    f = 0.0f;
                }
                circularImageView.setScaleY(f);
            }
        });
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1142R.layout.activity_profile_polygon);
        m11717j();
        m11718k();
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
