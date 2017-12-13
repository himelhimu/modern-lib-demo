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
import com.wdullaer.materialdatetimepicker.time.C2858f;
import com.wdullaer.materialdatetimepicker.time.C2858f.C2522c;
import java.util.Calendar;

public class PickerTimeLight extends C0818e {

    class C25241 implements OnClickListener {
        final /* synthetic */ PickerTimeLight f6450a;

        C25241(PickerTimeLight pickerTimeLight) {
            this.f6450a = pickerTimeLight;
        }

        public void onClick(View view) {
            this.f6450a.m11583a((Button) view);
        }
    }

    class C25252 implements C2522c {
        final /* synthetic */ PickerTimeLight f6451a;

        C25252(PickerTimeLight pickerTimeLight) {
            this.f6451a = pickerTimeLight;
        }

        public void mo1962a(C2858f c2858f, int i, int i2, int i3) {
            ((TextView) this.f6451a.findViewById(C1142R.id.result)).setText(i + " : " + i2);
        }
    }

    private void m11583a(Button button) {
        Calendar instance = Calendar.getInstance();
        C2858f a = C2858f.m12631a(new C25252(this), instance.get(11), instance.get(12), true);
        a.m12660a(false);
        a.m12662b(getResources().getColor(C1142R.color.colorPrimary));
        a.show(getFragmentManager(), "Timepickerdialog");
    }

    private void m11585j() {
        Toolbar toolbar = (Toolbar) findViewById(C1142R.id.toolbar);
        toolbar.setNavigationIcon((int) C1142R.drawable.ic_menu);
        m4362a(toolbar);
        m4370f().mo760a((CharSequence) "Time Light");
        m4370f().mo761a(true);
    }

    private void m11586k() {
        ((Button) findViewById(C1142R.id.bt_pick)).setOnClickListener(new C25241(this));
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1142R.layout.activity_picker_time_light);
        m11585j();
        m11586k();
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
