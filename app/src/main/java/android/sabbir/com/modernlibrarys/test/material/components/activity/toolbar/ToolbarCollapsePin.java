package android.sabbir.com.modernlibrarys.test.material.components.activity.toolbar;

import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.AppBarLayout.C0135b;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.view.ai;
import android.support.v7.app.C0818e;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import butterknife.C1142R;

public class ToolbarCollapsePin extends C0818e {
    private void m12152j() {
        final FloatingActionButton floatingActionButton = (FloatingActionButton) findViewById(C1142R.id.fab);
        m4362a((Toolbar) findViewById(C1142R.id.toolbar));
        m4370f().mo760a(null);
        m4370f().mo761a(true);
        final CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(C1142R.id.collapsing_toolbar);
        ((AppBarLayout) findViewById(C1142R.id.app_bar_layout)).m797a(new C0135b(this) {
            final /* synthetic */ ToolbarCollapsePin f6961c;

            public void mo156a(AppBarLayout appBarLayout, int i) {
                if (collapsingToolbarLayout.getHeight() + i < ai.m3323q(collapsingToolbarLayout) * 2) {
                    floatingActionButton.m990a();
                } else {
                    floatingActionButton.m994b();
                }
            }
        });
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1142R.layout.activity_toolbar_collapse_pin);
        m12152j();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C1142R.menu.menu_basic, menu);
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
