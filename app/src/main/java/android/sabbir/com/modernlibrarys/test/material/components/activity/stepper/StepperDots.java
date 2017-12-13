package android.sabbir.com.modernlibrarys.test.material.components.activity.stepper;

import android.graphics.PorterDuff.Mode;
import android.os.Bundle;
import android.support.v7.app.C0818e;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import butterknife.C1142R;
import com.material.components.p089f.C2754e;

public class StepperDots extends C0818e {
    private int f6852m = 1;
    private TextView f6853n;

    class C26651 implements OnClickListener {
        final /* synthetic */ StepperDots f6850a;

        C26651(StepperDots stepperDots) {
            this.f6850a = stepperDots;
        }

        public void onClick(View view) {
            this.f6850a.m11984c(this.f6850a.f6852m);
            this.f6850a.m11986d(this.f6850a.f6852m);
        }
    }

    class C26662 implements OnClickListener {
        final /* synthetic */ StepperDots f6851a;

        C26662(StepperDots stepperDots) {
            this.f6851a = stepperDots;
        }

        public void onClick(View view) {
            this.f6851a.m11982b(this.f6851a.f6852m);
            this.f6851a.m11986d(this.f6851a.f6852m);
        }
    }

    private void m11982b(int i) {
        if (i < 6) {
            this.f6852m = i + 1;
            C2754e.m12275g(this.f6853n);
        }
        this.f6853n.setText(String.format(getString(C1142R.string.step_of), new Object[]{Integer.valueOf(this.f6852m), Integer.valueOf(6)}));
    }

    private void m11984c(int i) {
        if (i > 1) {
            this.f6852m = i - 1;
            C2754e.m12275g(this.f6853n);
        }
        this.f6853n.setText(String.format(getString(C1142R.string.step_of), new Object[]{Integer.valueOf(this.f6852m), Integer.valueOf(6)}));
    }

    private void m11986d(int i) {
        int i2 = i - 1;
        LinearLayout linearLayout = (LinearLayout) findViewById(C1142R.id.layoutDots);
        ImageView[] imageViewArr = new ImageView[6];
        linearLayout.removeAllViews();
        for (int i3 = 0; i3 < imageViewArr.length; i3++) {
            imageViewArr[i3] = new ImageView(this);
            LayoutParams layoutParams = new LinearLayout.LayoutParams(new LayoutParams(15, 15));
            layoutParams.setMargins(10, 10, 10, 10);
            imageViewArr[i3].setLayoutParams(layoutParams);
            imageViewArr[i3].setImageResource(C1142R.drawable.shape_circle);
            imageViewArr[i3].setColorFilter(getResources().getColor(C1142R.color.grey_20), Mode.SRC_IN);
            linearLayout.addView(imageViewArr[i3]);
        }
        if (imageViewArr.length > 0) {
            imageViewArr[i2].setImageResource(C1142R.drawable.shape_circle);
            imageViewArr[i2].setColorFilter(getResources().getColor(C1142R.color.colorPrimary), Mode.SRC_IN);
        }
    }

    private void m11987j() {
        Toolbar toolbar = (Toolbar) findViewById(C1142R.id.toolbar);
        toolbar.setNavigationIcon((int) C1142R.drawable.ic_menu);
        m4362a(toolbar);
        m4370f().mo760a((CharSequence) "Dots");
        m4370f().mo761a(true);
    }

    private void m11988k() {
        this.f6853n = (TextView) findViewById(C1142R.id.status);
        ((LinearLayout) findViewById(C1142R.id.lyt_back)).setOnClickListener(new C26651(this));
        ((LinearLayout) findViewById(C1142R.id.lyt_next)).setOnClickListener(new C26662(this));
        this.f6853n.setText(String.format(getString(C1142R.string.step_of), new Object[]{Integer.valueOf(this.f6852m), Integer.valueOf(6)}));
        m11986d(this.f6852m);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1142R.layout.activity_stepper_dots);
        m11987j();
        m11988k();
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
