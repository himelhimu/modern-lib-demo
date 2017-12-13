package android.sabbir.com.modernlibrarys.test.material.components.activity.stepper;

import android.os.Bundle;
import android.support.v7.app.C0818e;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import butterknife.C1142R;
import com.material.components.p089f.C2754e;

public class StepperText extends C0818e {
    private int f6861m = 1;
    private TextView f6862n;

    class C26691 implements OnClickListener {
        final /* synthetic */ StepperText f6859a;

        C26691(StepperText stepperText) {
            this.f6859a = stepperText;
        }

        public void onClick(View view) {
            this.f6859a.m12000c(this.f6859a.f6861m);
        }
    }

    class C26702 implements OnClickListener {
        final /* synthetic */ StepperText f6860a;

        C26702(StepperText stepperText) {
            this.f6860a = stepperText;
        }

        public void onClick(View view) {
            this.f6860a.m11998b(this.f6860a.f6861m);
        }
    }

    private void m11998b(int i) {
        if (i < 5) {
            this.f6861m = i + 1;
            C2754e.m12275g(this.f6862n);
        }
        CharSequence format = String.format(getString(C1142R.string.step_of), new Object[]{Integer.valueOf(this.f6861m), Integer.valueOf(5)});
        ((TextView) findViewById(C1142R.id.tv_steps)).setText(format);
        this.f6862n.setText(format);
    }

    private void m12000c(int i) {
        if (i > 1) {
            this.f6861m = i - 1;
            C2754e.m12275g(this.f6862n);
        }
        CharSequence format = String.format(getString(C1142R.string.step_of), new Object[]{Integer.valueOf(this.f6861m), Integer.valueOf(5)});
        ((TextView) findViewById(C1142R.id.tv_steps)).setText(format);
        this.f6862n.setText(format);
    }

    private void m12001j() {
        Toolbar toolbar = (Toolbar) findViewById(C1142R.id.toolbar);
        toolbar.setNavigationIcon((int) C1142R.drawable.ic_menu);
        m4362a(toolbar);
        m4370f().mo760a((CharSequence) "Text");
        m4370f().mo761a(true);
    }

    private void m12002k() {
        this.f6862n = (TextView) findViewById(C1142R.id.status);
        ((LinearLayout) findViewById(C1142R.id.lyt_back)).setOnClickListener(new C26691(this));
        ((LinearLayout) findViewById(C1142R.id.lyt_next)).setOnClickListener(new C26702(this));
        CharSequence format = String.format(getString(C1142R.string.step_of), new Object[]{Integer.valueOf(this.f6861m), Integer.valueOf(5)});
        ((TextView) findViewById(C1142R.id.tv_steps)).setText(format);
        this.f6862n.setText(format);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1142R.layout.activity_stepper_text);
        m12001j();
        m12002k();
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
