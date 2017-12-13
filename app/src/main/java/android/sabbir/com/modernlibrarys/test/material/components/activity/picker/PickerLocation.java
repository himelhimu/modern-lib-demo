package android.sabbir.com.modernlibrarys.test.material.components.activity.picker;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.C0818e;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.Toast;
import butterknife.C1142R;
import com.google.android.gms.common.C1886c;
import com.google.android.gms.common.C1887d;
import com.google.android.gms.common.C1889e;
import com.google.android.gms.location.places.p079a.C1991a;
import com.google.android.gms.location.places.p079a.C1991a.C1989a;
import com.material.components.p089f.C2746d;

public class PickerLocation extends C0818e {
    private View f6447m;

    class C25191 implements OnClickListener {
        final /* synthetic */ PickerLocation f6445a;

        C25191(PickerLocation pickerLocation) {
            this.f6445a = pickerLocation;
        }

        public void onClick(View view) {
            this.f6445a.m11573b(500);
        }
    }

    class C25202 implements OnClickListener {
        final /* synthetic */ PickerLocation f6446a;

        C25202(PickerLocation pickerLocation) {
            this.f6446a = pickerLocation;
        }

        public void onClick(View view) {
            this.f6446a.m11573b(600);
        }
    }

    private void m11573b(int i) {
        try {
            startActivityForResult(new C1989a(2).mo1488a(this), i);
        } catch (C1889e e) {
            C1886c.m9331a().m9333a((Activity) this, e.m9352a(), 0).show();
        } catch (C1887d e2) {
            Snackbar.m1021a(this.f6447m, "Google Play Services is not available: " + C1886c.m9331a().mo1466b(e2.f5169a), -1).m1012a();
        }
    }

    private void m11574j() {
        Toolbar toolbar = (Toolbar) findViewById(C1142R.id.toolbar);
        toolbar.setNavigationIcon((int) C1142R.drawable.ic_menu);
        m4362a(toolbar);
        m4370f().mo760a(null);
        m4370f().mo761a(true);
        C2746d.m12253a((Activity) this, (int) C1142R.color.grey_90);
    }

    private void m11575k() {
        ((TextView) findViewById(C1142R.id.tv_origin)).setOnClickListener(new C25191(this));
        ((TextView) findViewById(C1142R.id.tv_destination)).setOnClickListener(new C25202(this));
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 500) {
            if (i2 == -1) {
                ((TextView) findViewById(C1142R.id.tv_origin)).setText(C1991a.m9626a(this, intent).mo1489a());
            } else if (i2 == 2) {
                Snackbar.m1021a(this.f6447m, C1991a.m9627b(this, intent).toString(), -1).m1012a();
            }
        }
        if (i != 600) {
            return;
        }
        if (i2 == -1) {
            ((TextView) findViewById(C1142R.id.tv_destination)).setText(C1991a.m9626a(this, intent).mo1489a());
        } else if (i2 == 2) {
            Snackbar.m1021a(this.f6447m, C1991a.m9627b(this, intent).toString(), -1).m1012a();
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1142R.layout.activity_picker_location);
        this.f6447m = findViewById(16908290);
        m11574j();
        m11575k();
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
