package android.sabbir.com.modernlibrarys.test.material.components.p088c;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.p008b.C0228k;
import android.support.v7.widget.AppCompatCheckBox;
import android.support.v7.widget.AppCompatSpinner;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import butterknife.C1142R;
import com.material.components.p089f.C2746d;
import com.material.components.p091e.C2726a;
import com.wdullaer.materialdatetimepicker.date.C2815b;
import com.wdullaer.materialdatetimepicker.date.C2815b.C2515b;
import com.wdullaer.materialdatetimepicker.time.C2858f;
import com.wdullaer.materialdatetimepicker.time.C2858f.C2522c;
import java.util.Calendar;

public class C2709a extends C0228k {
    public C2440a aa;
    private int ab = 0;
    private View ac;
    private Button ad;
    private Button ae;
    private Button af;
    private Button ag;
    private TextView ah;
    private EditText ai;
    private EditText aj;
    private AppCompatCheckBox ak;
    private AppCompatSpinner al;

    public interface C2440a {
        void mo1939a(int i, Object obj);
    }

    class C27011 implements OnClickListener {
        final /* synthetic */ C2709a f6963a;

        C27011(C2709a c2709a) {
            this.f6963a = c2709a;
        }

        public void onClick(View view) {
            this.f6963a.mo209a();
        }
    }

    class C27022 implements OnClickListener {
        final /* synthetic */ C2709a f6964a;

        C27022(C2709a c2709a) {
            this.f6964a = c2709a;
        }

        public void onClick(View view) {
            this.f6964a.m12169X();
            this.f6964a.mo209a();
        }
    }

    class C27033 implements OnClickListener {
        final /* synthetic */ C2709a f6965a;

        C27033(C2709a c2709a) {
            this.f6965a = c2709a;
        }

        public void onClick(View view) {
            this.f6965a.m12170a((Button) view);
        }
    }

    class C27044 implements OnClickListener {
        final /* synthetic */ C2709a f6966a;

        C27044(C2709a c2709a) {
            this.f6966a = c2709a;
        }

        public void onClick(View view) {
            this.f6966a.m12173b((Button) view);
        }
    }

    class C27055 implements OnClickListener {
        final /* synthetic */ C2709a f6967a;

        C27055(C2709a c2709a) {
            this.f6967a = c2709a;
        }

        public void onClick(View view) {
            this.f6967a.m12170a((Button) view);
        }
    }

    class C27066 implements OnClickListener {
        final /* synthetic */ C2709a f6968a;

        C27066(C2709a c2709a) {
            this.f6968a = c2709a;
        }

        public void onClick(View view) {
            this.f6968a.m12173b((Button) view);
        }
    }

    private void m12169X() {
        C2726a c2726a = new C2726a();
        c2726a.f6986a = this.ah.getText().toString();
        c2726a.f6987b = this.ai.getText().toString();
        c2726a.f6988c = this.aj.getText().toString();
        c2726a.f6989d = this.ad.getText().toString() + " (" + this.ae.getText().toString() + ")";
        c2726a.f6990e = this.af.getText().toString() + " (" + this.ag.getText().toString() + ")";
        c2726a.f6991f = Boolean.valueOf(this.ak.isChecked());
        c2726a.f6992g = this.al.getSelectedItem().toString();
        if (this.aa != null) {
            this.aa.mo1939a(this.ab, c2726a);
        }
    }

    private void m12170a(final Button button) {
        Calendar instance = Calendar.getInstance();
        C2815b a = C2815b.m12461a(new C2515b(this) {
            final /* synthetic */ C2709a f6970b;

            public void mo1960a(C2815b c2815b, int i, int i2, int i3) {
                Calendar instance = Calendar.getInstance();
                instance.set(1, i);
                instance.set(2, i2);
                instance.set(5, i3);
                button.setText(C2746d.m12261b(Long.valueOf(instance.getTimeInMillis())));
            }
        }, instance.get(1), instance.get(2), instance.get(5));
        a.m12471a(false);
        a.m12472b(m1317k().getColor(C1142R.color.colorPrimary));
        a.m12470a(instance);
        a.show(m1314j().getFragmentManager(), "Datepickerdialog");
    }

    private void m12173b(final Button button) {
        Calendar instance = Calendar.getInstance();
        C2858f a = C2858f.m12631a(new C2522c(this) {
            final /* synthetic */ C2709a f6972b;

            public void mo1962a(C2858f c2858f, int i, int i2, int i3) {
                Calendar instance = Calendar.getInstance();
                instance.set(11, i);
                instance.set(12, i2);
                instance.set(9, instance.get(9));
                button.setText(C2746d.m12265c(Long.valueOf(instance.getTimeInMillis())));
            }
        }, instance.get(11), instance.get(12), true);
        a.m12660a(false);
        a.m12662b(m1317k().getColor(C1142R.color.colorPrimary));
        a.show(m1314j().getFragmentManager(), "Timepickerdialog");
    }

    public Dialog mo220a(Bundle bundle) {
        Dialog a = super.mo220a(bundle);
        a.requestWindowFeature(1);
        return a;
    }

    public View mo1503a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.ac = layoutInflater.inflate(C1142R.layout.dialog_event, viewGroup, false);
        this.ad = (Button) this.ac.findViewById(C1142R.id.spn_from_date);
        this.ae = (Button) this.ac.findViewById(C1142R.id.spn_from_time);
        this.af = (Button) this.ac.findViewById(C1142R.id.spn_to_date);
        this.ag = (Button) this.ac.findViewById(C1142R.id.spn_to_time);
        this.ah = (TextView) this.ac.findViewById(C1142R.id.tv_email);
        this.ai = (EditText) this.ac.findViewById(C1142R.id.et_name);
        this.aj = (EditText) this.ac.findViewById(C1142R.id.et_location);
        this.ak = (AppCompatCheckBox) this.ac.findViewById(C1142R.id.cb_allday);
        this.al = (AppCompatSpinner) this.ac.findViewById(C1142R.id.spn_timezone);
        ((ImageButton) this.ac.findViewById(C1142R.id.bt_close)).setOnClickListener(new C27011(this));
        ((Button) this.ac.findViewById(C1142R.id.bt_save)).setOnClickListener(new C27022(this));
        this.ad.setOnClickListener(new C27033(this));
        this.ae.setOnClickListener(new C27044(this));
        this.af.setOnClickListener(new C27055(this));
        this.ag.setOnClickListener(new C27066(this));
        SpinnerAdapter arrayAdapter = new ArrayAdapter(m1314j(), C1142R.layout.simple_spinner_item, m1317k().getStringArray(C1142R.array.timezone));
        arrayAdapter.setDropDownViewResource(C1142R.layout.simple_spinner_dropdown_item);
        this.al.setAdapter(arrayAdapter);
        this.al.setSelection(0);
        return this.ac;
    }

    public void m12177a(C2440a c2440a) {
        this.aa = c2440a;
    }

    public void m12178c(int i) {
        this.ab = i;
    }
}
