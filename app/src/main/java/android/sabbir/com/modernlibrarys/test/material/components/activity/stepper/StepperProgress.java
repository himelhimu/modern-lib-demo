package android.sabbir.com.modernlibrarys.test.material.components.activity.stepper;

import android.graphics.PorterDuff.Mode;
import android.os.Bundle;
import android.support.v7.app.C0818e;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import butterknife.C1142R;
import com.material.components.p089f.C2754e;

public class StepperProgress extends C0818e {
    private int f6856m = 1;
    private ProgressBar f6857n;
    private TextView f6858o;

    class C26671 implements OnClickListener {
        final /* synthetic */ StepperProgress f6854a;

        C26671(StepperProgress stepperProgress) {
            this.f6854a = stepperProgress;
        }

        public void onClick(View view) {
            this.f6854a.m11993c(this.f6854a.f6856m);
        }
    }

    class C26682 implements OnClickListener {
        final /* synthetic */ StepperProgress f6855a;

        C26682(StepperProgress stepperProgress) {
            this.f6855a = stepperProgress;
        }

        public void onClick(View view) {
            this.f6855a.m11991b(this.f6855a.f6856m);
        }
    }

    private void m11991b(int i) {
        if (i < 20) {
            this.f6856m = i + 1;
            C2754e.m12275g(this.f6858o);
        }
        this.f6858o.setText(String.format(getString(C1142R.string.step_of), new Object[]{Integer.valueOf(this.f6856m), Integer.valueOf(20)}));
        this.f6857n.setProgress(this.f6856m);
    }

    private void m11993c(int i) {
        if (i > 1) {
            this.f6856m = i - 1;
            C2754e.m12275g(this.f6858o);
        }
        this.f6858o.setText(String.format(getString(C1142R.string.step_of), new Object[]{Integer.valueOf(this.f6856m), Integer.valueOf(20)}));
        this.f6857n.setProgress(this.f6856m);
    }

    private void m11994j() {
        Toolbar toolbar = (Toolbar) findViewById(C1142R.id.toolbar);
        toolbar.setNavigationIcon((int) C1142R.drawable.ic_menu);
        m4362a(toolbar);
        m4370f().mo760a((CharSequence) "Progress");
        m4370f().mo761a(true);
    }

    private void m11995k() {
        this.f6858o = (TextView) findViewById(C1142R.id.status);
        this.f6857n = (ProgressBar) findViewById(C1142R.id.progress);
        this.f6857n.setMax(20);
        this.f6857n.setProgress(this.f6856m);
        this.f6857n.getProgressDrawable().setColorFilter(getResources().getColor(C1142R.color.colorPrimary), Mode.SRC_IN);
        ((LinearLayout) findViewById(C1142R.id.lyt_back)).setOnClickListener(new C26671(this));
        ((LinearLayout) findViewById(C1142R.id.lyt_next)).setOnClickListener(new C26682(this));
        this.f6858o.setText(String.format(getString(C1142R.string.step_of), new Object[]{Integer.valueOf(this.f6856m), Integer.valueOf(20)}));
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1142R.layout.activity_stepper_progress);
        m11994j();
        m11995k();
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
