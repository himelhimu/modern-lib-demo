package android.sabbir.com.modernlibrarys.test.material.components.activity.dialog;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v7.app.C0818e;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatCheckBox;
import android.support.v7.widget.AppCompatSpinner;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.WindowManager.LayoutParams;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;
import butterknife.C1142R;
import com.material.components.p091e.C2726a;

public class DialogCustom extends C0818e {

    class C24261 implements OnClickListener {
        final /* synthetic */ DialogCustom f6185a;

        C24261(DialogCustom dialogCustom) {
            this.f6185a = dialogCustom;
        }

        public void onClick(View view) {
            this.f6185a.m11327k();
        }
    }

    private void m11325a(C2726a c2726a) {
        ((TextView) findViewById(C1142R.id.tv_email)).setText(c2726a.f6986a);
        ((TextView) findViewById(C1142R.id.tv_name)).setText(c2726a.f6987b);
        ((TextView) findViewById(C1142R.id.tv_location)).setText(c2726a.f6988c);
        ((TextView) findViewById(C1142R.id.tv_from)).setText(c2726a.f6989d);
        ((TextView) findViewById(C1142R.id.tv_to)).setText(c2726a.f6990e);
        ((TextView) findViewById(C1142R.id.tv_allday)).setText(c2726a.f6991f.toString());
        ((TextView) findViewById(C1142R.id.tv_timezone)).setText(c2726a.f6992g);
    }

    private void m11326j() {
        Toolbar toolbar = (Toolbar) findViewById(C1142R.id.toolbar);
        toolbar.setNavigationIcon((int) C1142R.drawable.ic_menu);
        m4362a(toolbar);
        m4370f().mo760a((CharSequence) "Custom");
        m4370f().mo761a(true);
    }

    private void m11327k() {
        final Dialog dialog = new Dialog(this);
        dialog.requestWindowFeature(1);
        dialog.setContentView(C1142R.layout.dialog_event);
        dialog.setCancelable(true);
        LayoutParams layoutParams = new LayoutParams();
        layoutParams.copyFrom(dialog.getWindow().getAttributes());
        layoutParams.width = -1;
        layoutParams.height = -2;
        final Button button = (Button) dialog.findViewById(C1142R.id.spn_from_date);
        final Button button2 = (Button) dialog.findViewById(C1142R.id.spn_from_time);
        final Button button3 = (Button) dialog.findViewById(C1142R.id.spn_to_date);
        final Button button4 = (Button) dialog.findViewById(C1142R.id.spn_to_time);
        final TextView textView = (TextView) dialog.findViewById(C1142R.id.tv_email);
        final EditText editText = (EditText) dialog.findViewById(C1142R.id.et_name);
        final EditText editText2 = (EditText) dialog.findViewById(C1142R.id.et_location);
        final AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) dialog.findViewById(C1142R.id.cb_allday);
        final AppCompatSpinner appCompatSpinner = (AppCompatSpinner) dialog.findViewById(C1142R.id.spn_timezone);
        SpinnerAdapter arrayAdapter = new ArrayAdapter(this, C1142R.layout.simple_spinner_item, getResources().getStringArray(C1142R.array.timezone));
        arrayAdapter.setDropDownViewResource(C1142R.layout.simple_spinner_dropdown_item);
        appCompatSpinner.setAdapter(arrayAdapter);
        appCompatSpinner.setSelection(0);
        ((ImageButton) dialog.findViewById(C1142R.id.bt_close)).setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ DialogCustom f6187b;

            public void onClick(View view) {
                dialog.dismiss();
            }
        });
        ((Button) dialog.findViewById(C1142R.id.bt_save)).setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ DialogCustom f6198k;

            public void onClick(View view) {
                C2726a c2726a = new C2726a();
                c2726a.f6986a = textView.getText().toString();
                c2726a.f6987b = editText.getText().toString();
                c2726a.f6988c = editText2.getText().toString();
                c2726a.f6989d = button.getText().toString() + " (" + button2.getText().toString() + ")";
                c2726a.f6990e = button3.getText().toString() + " (" + button4.getText().toString() + ")";
                c2726a.f6991f = Boolean.valueOf(appCompatCheckBox.isChecked());
                c2726a.f6992g = appCompatSpinner.getSelectedItem().toString();
                this.f6198k.m11325a(c2726a);
                dialog.dismiss();
            }
        });
        dialog.show();
        dialog.getWindow().setAttributes(layoutParams);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1142R.layout.activity_dialog_custom);
        m11326j();
        ((AppCompatButton) findViewById(C1142R.id.custom_dialog)).setOnClickListener(new C24261(this));
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
