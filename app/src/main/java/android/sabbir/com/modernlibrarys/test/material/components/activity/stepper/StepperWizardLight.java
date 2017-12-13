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
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.C1142R;
import com.material.components.p089f.C2746d;

public class StepperWizardLight extends C0818e {
    C0190f f6894m = new C26813(this);
    private ViewPager f6895n;
    private C2682a f6896o;
    private Button f6897p;
    private String[] f6898q = new String[]{"Ready to Travel", "Pick the Ticket", "Flight to Destination", "Enjoy Holiday"};
    private String[] f6899r = new String[]{"Choose your destination, plan Your trip. Pick the best place for Your holiday", "Select the day, pick Your ticket. We give you the best prices. We guarantee!", "Safe and Comfort flight is our priority. Professional crew and services.", "Enjoy your holiday, Dont forget to feel the moment and take a photo!"};
    private int[] f6900s = new int[]{C1142R.drawable.img_wizard_1, C1142R.drawable.img_wizard_2, C1142R.drawable.img_wizard_3, C1142R.drawable.img_wizard_4};

    class C26791 implements OnClickListener {
        final /* synthetic */ StepperWizardLight f6889a;

        C26791(StepperWizardLight stepperWizardLight) {
            this.f6889a = stepperWizardLight;
        }

        public void onClick(View view) {
            int currentItem = this.f6889a.f6895n.getCurrentItem() + 1;
            if (currentItem < 4) {
                this.f6889a.f6895n.setCurrentItem(currentItem);
            } else {
                this.f6889a.finish();
            }
        }
    }

    class C26802 implements OnClickListener {
        final /* synthetic */ StepperWizardLight f6890a;

        C26802(StepperWizardLight stepperWizardLight) {
            this.f6890a = stepperWizardLight;
        }

        public void onClick(View view) {
            this.f6890a.finish();
        }
    }

    class C26813 implements C0190f {
        final /* synthetic */ StepperWizardLight f6891a;

        C26813(StepperWizardLight stepperWizardLight) {
            this.f6891a = stepperWizardLight;
        }

        public void mo180a(int i) {
        }

        public void mo181a(int i, float f, int i2) {
        }

        public void mo182b(int i) {
            this.f6891a.m12042b(i);
            if (i == this.f6891a.f6898q.length - 1) {
                this.f6891a.f6897p.setText(this.f6891a.getString(C1142R.string.GOT_IT));
                this.f6891a.f6897p.setBackgroundColor(this.f6891a.getResources().getColor(C1142R.color.orange_400));
                this.f6891a.f6897p.setTextColor(-1);
                return;
            }
            this.f6891a.f6897p.setText(this.f6891a.getString(C1142R.string.NEXT));
            this.f6891a.f6897p.setBackgroundColor(this.f6891a.getResources().getColor(C1142R.color.grey_10));
            this.f6891a.f6897p.setTextColor(this.f6891a.getResources().getColor(C1142R.color.grey_90));
        }
    }

    public class C2682a extends ab {
        final /* synthetic */ StepperWizardLight f6892a;
        private LayoutInflater f6893b;

        public C2682a(StepperWizardLight stepperWizardLight) {
            this.f6892a = stepperWizardLight;
        }

        public Object mo338a(ViewGroup viewGroup, int i) {
            this.f6893b = (LayoutInflater) this.f6892a.getSystemService("layout_inflater");
            View inflate = this.f6893b.inflate(C1142R.layout.item_stepper_wizard, viewGroup, false);
            ((TextView) inflate.findViewById(C1142R.id.title)).setText(this.f6892a.f6898q[i]);
            ((TextView) inflate.findViewById(C1142R.id.description)).setText(this.f6892a.f6899r[i]);
            ((ImageView) inflate.findViewById(C1142R.id.image)).setImageResource(this.f6892a.f6900s[i]);
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
            return this.f6892a.f6898q.length;
        }
    }

    private void m12042b(int i) {
        LinearLayout linearLayout = (LinearLayout) findViewById(C1142R.id.layoutDots);
        ImageView[] imageViewArr = new ImageView[4];
        linearLayout.removeAllViews();
        for (int i2 = 0; i2 < imageViewArr.length; i2++) {
            imageViewArr[i2] = new ImageView(this);
            LayoutParams layoutParams = new LinearLayout.LayoutParams(new LayoutParams(15, 15));
            layoutParams.setMargins(10, 10, 10, 10);
            imageViewArr[i2].setLayoutParams(layoutParams);
            imageViewArr[i2].setImageResource(C1142R.drawable.shape_circle);
            imageViewArr[i2].setColorFilter(getResources().getColor(C1142R.color.grey_20), Mode.SRC_IN);
            linearLayout.addView(imageViewArr[i2]);
        }
        if (imageViewArr.length > 0) {
            imageViewArr[i].setImageResource(C1142R.drawable.shape_circle);
            imageViewArr[i].setColorFilter(getResources().getColor(C1142R.color.orange_400), Mode.SRC_IN);
        }
    }

    private void m12047j() {
        this.f6895n = (ViewPager) findViewById(C1142R.id.view_pager);
        this.f6897p = (Button) findViewById(C1142R.id.btn_next);
        m12042b(0);
        this.f6896o = new C2682a(this);
        this.f6895n.setAdapter(this.f6896o);
        this.f6895n.m2551a(this.f6894m);
        this.f6897p.setOnClickListener(new C26791(this));
        ((ImageButton) findViewById(C1142R.id.bt_close)).setOnClickListener(new C26802(this));
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1142R.layout.activity_stepper_wizard_light);
        m12047j();
        C2746d.m12253a((Activity) this, (int) C1142R.color.grey_20);
    }
}
