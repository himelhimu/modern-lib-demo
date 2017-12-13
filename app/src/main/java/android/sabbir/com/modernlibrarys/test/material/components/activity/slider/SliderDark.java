package android.sabbir.com.modernlibrarys.test.material.components.activity.slider;

import android.graphics.PorterDuff.Mode;
import android.os.Bundle;
import android.support.v7.app.C0818e;
import android.support.v7.widget.AppCompatSeekBar;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import butterknife.C1142R;

public class SliderDark extends C0818e {
    private AppCompatSeekBar f6776m;
    private AppCompatSeekBar f6777n;
    private AppCompatSeekBar f6778o;
    private AppCompatSeekBar f6779p;

    private void m11893j() {
        Toolbar toolbar = (Toolbar) findViewById(C1142R.id.toolbar);
        toolbar.setNavigationIcon((int) C1142R.drawable.ic_menu);
        m4362a(toolbar);
        m4370f().mo760a((CharSequence) "Dark");
        m4370f().mo761a(true);
    }

    private void m11894k() {
        this.f6776m = (AppCompatSeekBar) findViewById(C1142R.id.seekbar_accent_dark);
        this.f6776m.getProgressDrawable().setColorFilter(getResources().getColor(C1142R.color.colorAccent), Mode.SRC_IN);
        this.f6777n = (AppCompatSeekBar) findViewById(C1142R.id.seekbar_primary_dark);
        this.f6777n.getProgressDrawable().setColorFilter(getResources().getColor(C1142R.color.colorPrimary), Mode.SRC_IN);
        this.f6778o = (AppCompatSeekBar) findViewById(C1142R.id.seekbar_accent_dark_outline);
        this.f6778o.getProgressDrawable().setColorFilter(getResources().getColor(C1142R.color.colorAccent), Mode.SRC_IN);
        this.f6779p = (AppCompatSeekBar) findViewById(C1142R.id.seekbar_primary_dark_outline);
        this.f6779p.getProgressDrawable().setColorFilter(getResources().getColor(C1142R.color.colorPrimary), Mode.SRC_IN);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1142R.layout.activity_slider_dark);
        m11893j();
        m11894k();
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
