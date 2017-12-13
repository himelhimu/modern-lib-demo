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

public class PickerTimeDark extends C0818e {

    class C25211 implements OnClickListener {
        final /* synthetic */ PickerTimeDark f6448a;

        C25211(PickerTimeDark pickerTimeDark) {
            this.f6448a = pickerTimeDark;
        }

        public void onClick(View view) {
            this.f6448a.m11578a((Button) view);
        }
    }

    class C25232 implements C2522c {
        final /* synthetic */ PickerTimeDark f6449a;

        C25232(PickerTimeDark pickerTimeDark) {
            this.f6449a = pickerTimeDark;
        }

        public void mo1962a(C2858f c2858f, int i, int i2, int i3) {
            ((TextView) this.f6449a.findViewById(C1142R.id.result)).setText(i + " : " + i2);
        }
    }

    private void m11578a(Button button) {
        Calendar instance = Calendar.getInstance();
        C2858f a = C2858f.m12631a(new C25232(this), instance.get(11), instance.get(12), true);
        a.m12660a(true);
        a.m12662b(getResources().getColor(C1142R.color.colorPrimary));
        a.show(getFragmentManager(), "Timepickerdialog");
    }

    private void m11580j() {
        Toolbar toolbar = (Toolbar) findViewById(C1142R.id.toolbar);
        toolbar.setNavigationIcon((int) C1142R.drawable.ic_menu);
        m4362a(toolbar);
        m4370f().mo760a((CharSequence) "Time Dark");
        m4370f().mo761a(true);
    }

    private void m11581k() {
        ((Button) findViewById(C1142R.id.bt_pick)).setOnClickListener(new C25211(this));
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1142R.layout.activity_picker_time_dark);
        m11580j();
        m11581k();
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
