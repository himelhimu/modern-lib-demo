package android.sabbir.com.modernlibrarys.test.material.components.activity.stepper;

import android.app.Activity;
import android.graphics.PorterDuff.Mode;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.C0190f;
import android.support.v4.view.ab;
import android.support.v7.app.C0818e;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.C1142R;
import com.material.components.p089f.C2746d;

public class StepperWizardColor extends C0818e {
    C0190f f6881m = new C26773(this);
    private ViewPager f6882n;
    private C2678a f6883o;
    private Button f6884p;
    private String[] f6885q = new String[]{"Ready to Travel", "Pick the Ticket", "Flight to Destination", "Enjoy Holiday"};
    private String[] f6886r = new String[]{"Choose your destination, plan Your trip. Pick the best place for Your holiday", "Select the day, pick Your ticket. We give you the best prices. We guarantee!", "Safe and Comfort flight is our priority. Professional crew and services.", "Enjoy your holiday, Dont forget to feel the moment and take a photo!"};
    private int[] f6887s = new int[]{C1142R.drawable.img_wizard_1, C1142R.drawable.img_wizard_2, C1142R.drawable.img_wizard_3, C1142R.drawable.img_wizard_4};
    private int[] f6888t = new int[]{C1142R.color.red_600, C1142R.color.blue_grey_600, C1142R.color.purple_600, C1142R.color.deep_orange_600};

    class C26751 implements OnClickListener {
        final /* synthetic */ StepperWizardColor f6876a;

        C26751(StepperWizardColor stepperWizardColor) {
            this.f6876a = stepperWizardColor;
        }

        public void onClick(View view) {
            this.f6876a.finish();
        }
    }

    class C26762 implements OnClickListener {
        final /* synthetic */ StepperWizardColor f6877a;

        C26762(StepperWizardColor stepperWizardColor) {
            this.f6877a = stepperWizardColor;
        }

        public void onClick(View view) {
            this.f6877a.finish();
        }
    }

    class C26773 implements C0190f {
        final /* synthetic */ StepperWizardColor f6878a;

        C26773(StepperWizardColor stepperWizardColor) {
            this.f6878a = stepperWizardColor;
        }

        public void mo180a(int i) {
        }

        public void mo181a(int i, float f, int i2) {
        }

        public void mo182b(int i) {
            this.f6878a.m12028b(i);
            if (i == this.f6878a.f6885q.length - 1) {
                this.f6878a.f6884p.setVisibility(0);
            } else {
                this.f6878a.f6884p.setVisibility(8);
            }
        }
    }

    public class C2678a extends ab {
        final /* synthetic */ StepperWizardColor f6879a;
        private LayoutInflater f6880b;

        public C2678a(StepperWizardColor stepperWizardColor) {
            this.f6879a = stepperWizardColor;
        }

        public Object mo338a(ViewGroup viewGroup, int i) {
            this.f6880b = (LayoutInflater) this.f6879a.getSystemService("layout_inflater");
            View inflate = this.f6880b.inflate(C1142R.layout.item_stepper_wizard_color, viewGroup, false);
            ((TextView) inflate.findViewById(C1142R.id.title)).setText(this.f6879a.f6885q[i]);
            ((TextView) inflate.findViewById(C1142R.id.description)).setText(this.f6879a.f6886r[i]);
            ((ImageView) inflate.findViewById(C1142R.id.image)).setImageResource(this.f6879a.f6887s[i]);
            ((RelativeLayout) inflate.findViewById(C1142R.id.lyt_parent)).setBackgroundColor(this.f6879a.getResources().getColor(this.f6879a.f6888t[i]));
            viewGroup.addView(inflate);
            return inflate;
        }

        public void mo341a(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
        }

        public boolean mo342a(View view, Object obj) {
            return view == obj;
        }

        public int mo1933b() {
            return this.f6879a.f6885q.length;
        }
    }

    private void m12028b(int i) {
        LinearLayout linearLayout = (LinearLayout) findViewById(C1142R.id.layoutDots);
        ImageView[] imageViewArr = new ImageView[4];
        linearLayout.removeAllViews();
        for (int i2 = 0; i2 < imageViewArr.length; i2++) {
            imageViewArr[i2] = new ImageView(this);
            LayoutParams layoutParams = new LinearLayout.LayoutParams(new LayoutParams(15, 15));
            layoutParams.setMargins(10, 10, 10, 10);
            imageViewArr[i2].setLayoutParams(layoutParams);
            imageViewArr[i2].setImageResource(C1142R.drawable.shape_circle);
            imageViewArr[i2].setColorFilter(getResources().getColor(C1142R.color.overlay_dark_30), Mode.SRC_IN);
            linearLayout.addView(imageViewArr[i2]);
        }
        if (imageViewArr.length > 0) {
            imageViewArr[i].setImageResource(C1142R.drawable.shape_circle);
            imageViewArr[i].setColorFilter(getResources().getColor(C1142R.color.grey_10), Mode.SRC_IN);
        }
    }

    private void m12032j() {
        this.f6882n = (ViewPager) findViewById(C1142R.id.view_pager);
        this.f6884p = (Button) findViewById(C1142R.id.btn_got_it);
        m12028b(0);
        this.f6883o = new C2678a(this);
        this.f6882n.setAdapter(this.f6883o);
        this.f6882n.m2551a(this.f6881m);
        this.f6884p.setVisibility(8);
        this.f6884p.setOnClickListener(new C26751(this));
        ((Button) findViewById(C1142R.id.btn_skip)).setOnClickListener(new C26762(this));
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1142R.layout.activity_stepper_wizard_color);
        m12032j();
        C2746d.m12263b((Activity) this);
    }
}
