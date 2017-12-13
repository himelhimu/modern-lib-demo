package android.sabbir.com.modernlibrarys.test.material.components.activity.stepper;

import android.graphics.PorterDuff.Mode;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.C0818e;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import butterknife.C1142R;
import com.material.components.p089f.C2746d;
import com.material.components.p089f.C2754e;
import com.wdullaer.materialdatetimepicker.date.C2815b;
import com.wdullaer.materialdatetimepicker.date.C2815b.C2515b;
import com.wdullaer.materialdatetimepicker.time.C2858f;
import com.wdullaer.materialdatetimepicker.time.C2858f.C2522c;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class StepperVertical extends C0818e {
    private List<View> f6869m = new ArrayList();
    private List<RelativeLayout> f6870n = new ArrayList();
    private int f6871o = 0;
    private int f6872p = 0;
    private View f6873q;
    private Date f6874r = null;
    private String f6875s = null;

    class C26711 implements OnClickListener {
        final /* synthetic */ StepperVertical f6863a;

        C26711(StepperVertical stepperVertical) {
            this.f6863a = stepperVertical;
        }

        public void onClick(View view) {
            this.f6863a.m12008a((TextView) view);
        }
    }

    class C26722 implements OnClickListener {
        final /* synthetic */ StepperVertical f6864a;

        C26722(StepperVertical stepperVertical) {
            this.f6864a = stepperVertical;
        }

        public void onClick(View view) {
            this.f6864a.m12011b((TextView) view);
        }
    }

    private void m12008a(final TextView textView) {
        Calendar instance = Calendar.getInstance();
        C2858f a = C2858f.m12631a(new C2522c(this) {
            final /* synthetic */ StepperVertical f6866b;

            public void mo1962a(C2858f c2858f, int i, int i2, int i3) {
                this.f6866b.f6875s = (i > 9 ? i + "" : "0" + i) + ":" + i2;
                textView.setText(this.f6866b.f6875s);
            }
        }, instance.get(11), instance.get(12), true);
        a.m12660a(false);
        a.m12662b(getResources().getColor(C1142R.color.colorPrimary));
        a.show(getFragmentManager(), "Timepickerdialog");
    }

    private void m12010b(int i) {
        C2754e.m12269b((View) this.f6869m.get(i));
        m12013c(i);
        int i2 = i + 1;
        this.f6872p = i2;
        this.f6871o = i2 > this.f6871o ? i2 : this.f6871o;
        C2754e.m12266a((View) this.f6869m.get(i2));
    }

    private void m12011b(final TextView textView) {
        Calendar instance = Calendar.getInstance();
        C2815b a = C2815b.m12461a(new C2515b(this) {
            final /* synthetic */ StepperVertical f6868b;

            public void mo1960a(C2815b c2815b, int i, int i2, int i3) {
                Calendar instance = Calendar.getInstance();
                instance.set(1, i);
                instance.set(2, i2);
                instance.set(5, i3);
                long timeInMillis = instance.getTimeInMillis();
                this.f6868b.f6874r = new Date(timeInMillis);
                textView.setText(C2746d.m12250a(Long.valueOf(timeInMillis)));
            }
        }, instance.get(1), instance.get(2), instance.get(5));
        a.m12471a(false);
        a.m12472b(getResources().getColor(C1142R.color.colorPrimary));
        a.m12470a(instance);
        a.show(getFragmentManager(), "Datepickerdialog");
    }

    private void m12013c(int i) {
        RelativeLayout relativeLayout = (RelativeLayout) this.f6870n.get(i);
        relativeLayout.removeAllViews();
        View imageButton = new ImageButton(this);
        imageButton.setImageResource(C1142R.drawable.ic_done);
        imageButton.setBackgroundColor(0);
        imageButton.setColorFilter(-1, Mode.SRC_IN);
        relativeLayout.addView(imageButton);
    }

    private void m12014k() {
        Toolbar toolbar = (Toolbar) findViewById(C1142R.id.toolbar);
        toolbar.setNavigationIcon((int) C1142R.drawable.ic_menu);
        m4362a(toolbar);
        m4370f().mo760a((CharSequence) "New Event");
        m4370f().mo761a(true);
    }

    private void m12015l() {
        this.f6869m.add(findViewById(C1142R.id.lyt_title));
        this.f6869m.add(findViewById(C1142R.id.lyt_description));
        this.f6869m.add(findViewById(C1142R.id.lyt_time));
        this.f6869m.add(findViewById(C1142R.id.lyt_date));
        this.f6869m.add(findViewById(C1142R.id.lyt_confirmation));
        this.f6870n.add((RelativeLayout) findViewById(C1142R.id.step_title));
        this.f6870n.add((RelativeLayout) findViewById(C1142R.id.step_description));
        this.f6870n.add((RelativeLayout) findViewById(C1142R.id.step_time));
        this.f6870n.add((RelativeLayout) findViewById(C1142R.id.step_date));
        this.f6870n.add((RelativeLayout) findViewById(C1142R.id.step_confirmation));
        for (View visibility : this.f6869m) {
            visibility.setVisibility(8);
        }
        ((View) this.f6869m.get(0)).setVisibility(0);
        m12017j();
        ((TextView) findViewById(C1142R.id.tv_time)).setOnClickListener(new C26711(this));
        ((TextView) findViewById(C1142R.id.tv_date)).setOnClickListener(new C26722(this));
    }

    private void m12016m() {
        for (View b : this.f6869m) {
            C2754e.m12269b(b);
        }
    }

    public void clickAction(View view) {
        switch (view.getId()) {
            case C1142R.id.bt_continue_title:
                if (((EditText) findViewById(C1142R.id.et_title)).getText().toString().trim().equals("")) {
                    Snackbar.m1021a(this.f6873q, "Title cannot empty", -1).m1012a();
                    return;
                } else {
                    m12010b(0);
                    return;
                }
            case C1142R.id.bt_continue_description:
                if (((EditText) findViewById(C1142R.id.et_description)).getText().toString().trim().equals("")) {
                    Snackbar.m1021a(this.f6873q, "Description cannot empty", -1).m1012a();
                    return;
                } else {
                    m12010b(1);
                    return;
                }
            case C1142R.id.bt_continue_time:
                if (this.f6875s == null) {
                    Snackbar.m1021a(this.f6873q, "Please set event time", -1).m1012a();
                    return;
                } else {
                    m12010b(2);
                    return;
                }
            case C1142R.id.bt_continue_date:
                if (this.f6874r == null) {
                    Snackbar.m1021a(this.f6873q, "Please set event date", -1).m1012a();
                    return;
                } else {
                    m12010b(3);
                    return;
                }
            case C1142R.id.bt_add_event:
                finish();
                return;
            default:
                return;
        }
    }

    public void clickLabel(View view) {
        switch (view.getId()) {
            case C1142R.id.tv_label_title:
                if (this.f6871o >= 0 && this.f6872p != 0) {
                    this.f6872p = 0;
                    m12016m();
                    C2754e.m12266a((View) this.f6869m.get(0));
                    return;
                }
                return;
            case C1142R.id.tv_label_description:
                if (this.f6871o >= 1 && this.f6872p != 1) {
                    this.f6872p = 1;
                    m12016m();
                    C2754e.m12266a((View) this.f6869m.get(1));
                    return;
                }
                return;
            case C1142R.id.tv_label_time:
                if (this.f6871o >= 2 && this.f6872p != 2) {
                    this.f6872p = 2;
                    m12016m();
                    C2754e.m12266a((View) this.f6869m.get(2));
                    return;
                }
                return;
            case C1142R.id.tv_label_date:
                if (this.f6871o >= 3 && this.f6872p != 3) {
                    this.f6872p = 3;
                    m12016m();
                    C2754e.m12266a((View) this.f6869m.get(3));
                    return;
                }
                return;
            case C1142R.id.tv_label_confirmation:
                if (this.f6871o >= 4 && this.f6872p != 4) {
                    this.f6872p = 4;
                    m12016m();
                    C2754e.m12266a((View) this.f6869m.get(4));
                    return;
                }
                return;
            default:
                return;
        }
    }

    public void m12017j() {
        getWindow().setSoftInputMode(2);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1142R.layout.activity_stepper_vertical);
        this.f6873q = findViewById(16908290);
        m12014k();
        m12015l();
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
