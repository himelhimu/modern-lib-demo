package android.sabbir.com.modernlibrarys.test.material.components.activity.picker;

import android.os.Bundle;
import android.support.v7.app.C0818e;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import butterknife.C1142R;
import com.material.components.p089f.C2746d;
import com.wdullaer.materialdatetimepicker.date.C2815b;
import com.wdullaer.materialdatetimepicker.date.C2815b.C2515b;
import java.util.Calendar;

public class PickerDateLight extends C0818e {

    class C25171 implements OnClickListener {
        final /* synthetic */ PickerDateLight f6443a;

        C25171(PickerDateLight pickerDateLight) {
            this.f6443a = pickerDateLight;
        }

        public void onClick(View view) {
            this.f6443a.m11568a((Button) view);
        }
    }

    class C25182 implements C2515b {
        final /* synthetic */ PickerDateLight f6444a;

        C25182(PickerDateLight pickerDateLight) {
            this.f6444a = pickerDateLight;
        }

        public void mo1960a(C2815b c2815b, int i, int i2, int i3) {
            Calendar instance = Calendar.getInstance();
            instance.set(1, i);
            instance.set(2, i2);
            instance.set(5, i3);
            ((TextView) this.f6444a.findViewById(C1142R.id.result)).setText(C2746d.m12250a(Long.valueOf(instance.getTimeInMillis())));
        }
    }

    private void m11568a(Button button) {
        Calendar instance = Calendar.getInstance();
        C2815b a = C2815b.m12461a(new C25182(this), instance.get(1), instance.get(2), instance.get(5));
        a.m12471a(false);
        a.m12472b(getResources().getColor(C1142R.color.colorPrimary));
        a.m12470a(instance);
        a.show(getFragmentManager(), "Datepickerdialog");
    }

    private void m11570j() {
        Toolbar toolbar = (Toolbar) findViewById(C1142R.id.toolbar);
        toolbar.setNavigationIcon((int) C1142R.drawable.ic_menu);
        m4362a(toolbar);
        m4370f().mo760a((CharSequence) "Date Light");
        m4370f().mo761a(true);
    }

    private void m11571k() {
        ((Button) findViewById(C1142R.id.bt_pick)).setOnClickListener(new C25171(this));
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1142R.layout.activity_picker_date_light);
        m11570j();
        m11571k();
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
