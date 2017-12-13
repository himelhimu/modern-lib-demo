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

public class SliderLight extends C0818e {
    private AppCompatSeekBar f6780m;
    private AppCompatSeekBar f6781n;
    private AppCompatSeekBar f6782o;
    private AppCompatSeekBar f6783p;

    private void m11895j() {
        Toolbar toolbar = (Toolbar) findViewById(C1142R.id.toolbar);
        toolbar.setNavigationIcon((int) C1142R.drawable.ic_menu);
        m4362a(toolbar);
        m4370f().mo760a((CharSequence) "Light");
        m4370f().mo761a(true);
    }

    private void m11896k() {
        this.f6780m = (AppCompatSeekBar) findViewById(C1142R.id.seekbar_accent_light);
        this.f6780m.getProgressDrawable().setColorFilter(getResources().getColor(C1142R.color.colorAccent), Mode.SRC_IN);
        this.f6781n = (AppCompatSeekBar) findViewById(C1142R.id.seekbar_primary_light);
        this.f6781n.getProgressDrawable().setColorFilter(getResources().getColor(C1142R.color.colorPrimary), Mode.SRC_IN);
        this.f6782o = (AppCompatSeekBar) findViewById(C1142R.id.seekbar_accent_light_outline);
        this.f6782o.getProgressDrawable().setColorFilter(getResources().getColor(C1142R.color.colorAccent), Mode.SRC_IN);
        this.f6783p = (AppCompatSeekBar) findViewById(C1142R.id.seekbar_primary_light_outline);
        this.f6783p.getProgressDrawable().setColorFilter(getResources().getColor(C1142R.color.colorPrimary), Mode.SRC_IN);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1142R.layout.activity_slider_light);
        m11895j();
        m11896k();
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
