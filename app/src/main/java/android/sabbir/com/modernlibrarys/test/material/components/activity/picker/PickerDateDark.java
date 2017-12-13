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

public class PickerDateDark extends C0818e {

    class C25141 implements OnClickListener {
        final /* synthetic */ PickerDateDark f6441a;

        C25141(PickerDateDark pickerDateDark) {
            this.f6441a = pickerDateDark;
        }

        public void onClick(View view) {
            this.f6441a.m11563a((Button) view);
        }
    }

    class C25162 implements C2515b {
        final /* synthetic */ PickerDateDark f6442a;

        C25162(PickerDateDark pickerDateDark) {
            this.f6442a = pickerDateDark;
        }

        public void mo1960a(C2815b c2815b, int i, int i2, int i3) {
            Calendar instance = Calendar.getInstance();
            instance.set(1, i);
            instance.set(2, i2);
            instance.set(5, i3);
            ((TextView) this.f6442a.findViewById(C1142R.id.result)).setText(C2746d.m12250a(Long.valueOf(instance.getTimeInMillis())));
        }
    }

    private void m11563a(Button button) {
        Calendar instance = Calendar.getInstance();
        C2815b a = C2815b.m12461a(new C25162(this), instance.get(1), instance.get(2), instance.get(5));
        a.m12471a(true);
        a.m12472b(getResources().getColor(C1142R.color.colorPrimary));
        a.m12470a(instance);
        a.show(getFragmentManager(), "Datepickerdialog");
    }

    private void m11565j() {
        Toolbar toolbar = (Toolbar) findViewById(C1142R.id.toolbar);
        toolbar.setNavigationIcon((int) C1142R.drawable.ic_menu);
        m4362a(toolbar);
        m4370f().mo760a((CharSequence) "Date Dark");
        m4370f().mo761a(true);
    }

    private void m11566k() {
        ((Button) findViewById(C1142R.id.bt_pick)).setOnClickListener(new C25141(this));
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1142R.layout.activity_picker_date_dark);
        m11565j();
        m11566k();
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
