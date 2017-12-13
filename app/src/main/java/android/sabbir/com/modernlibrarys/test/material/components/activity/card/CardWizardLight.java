package android.sabbir.com.modernlibrarys.test.material.components.activity.card;

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
import android.widget.TextView;
import butterknife.C1142R;
import com.material.components.p089f.C2746d;

public class CardWizardLight extends C0818e {
    C0190f f6128m = new C23991(this);
    private ViewPager f6129n;
    private C2401a f6130o;
    private String[] f6131p = new String[]{"Ready to Travel", "Pick the Ticket", "Flight to Destination", "Enjoy Holiday"};
    private String[] f6132q = new String[]{"Choose your destination, plan Your trip. Pick the best place for Your holiday", "Select the day, pick Your ticket. We give you the best prices. We guarantee!", "Safe and Comfort flight is our priority. Professional crew and services.", "Enjoy your holiday, Dont forget to feel the moment and take a photo!"};
    private int[] f6133r = new int[]{C1142R.drawable.img_wizard_1, C1142R.drawable.img_wizard_2, C1142R.drawable.img_wizard_3, C1142R.drawable.img_wizard_4};

    class C23991 implements C0190f {
        final /* synthetic */ CardWizardLight f6123a;

        C23991(CardWizardLight cardWizardLight) {
            this.f6123a = cardWizardLight;
        }

        public void mo180a(int i) {
        }

        public void mo181a(int i, float f, int i2) {
        }

        public void mo182b(int i) {
            this.f6123a.m11265b(i);
        }
    }

    public class C2401a extends ab {
        final /* synthetic */ CardWizardLight f6125a;
        private LayoutInflater f6126b;
        private Button f6127c;

        class C24001 implements OnClickListener {
            final /* synthetic */ C2401a f6124a;

            C24001(C2401a c2401a) {
                this.f6124a = c2401a;
            }

            public void onClick(View view) {
                int currentItem = this.f6124a.f6125a.f6129n.getCurrentItem() + 1;
                if (currentItem < 4) {
                    this.f6124a.f6125a.f6129n.setCurrentItem(currentItem);
                } else {
                    this.f6124a.f6125a.finish();
                }
            }
        }

        public C2401a(CardWizardLight cardWizardLight) {
            this.f6125a = cardWizardLight;
        }

        public Object mo338a(ViewGroup viewGroup, int i) {
            this.f6126b = (LayoutInflater) this.f6125a.getSystemService("layout_inflater");
            View inflate = this.f6126b.inflate(C1142R.layout.item_card_wizard_light, viewGroup, false);
            ((TextView) inflate.findViewById(C1142R.id.title)).setText(this.f6125a.f6131p[i]);
            ((TextView) inflate.findViewById(C1142R.id.description)).setText(this.f6125a.f6132q[i]);
            ((ImageView) inflate.findViewById(C1142R.id.image)).setImageResource(this.f6125a.f6133r[i]);
            this.f6127c = (Button) inflate.findViewById(C1142R.id.btn_next);
            if (i == this.f6125a.f6131p.length - 1) {
                this.f6127c.setText("Get Started");
            } else {
                this.f6127c.setText("Next");
            }
            this.f6127c.setOnClickListener(new C24001(this));
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
            return this.f6125a.f6131p.length;
        }
    }

    private void m11265b(int i) {
        LinearLayout linearLayout = (LinearLayout) findViewById(C1142R.id.layoutDots);
        ImageView[] imageViewArr = new ImageView[4];
        linearLayout.removeAllViews();
        for (int i2 = 0; i2 < imageViewArr.length; i2++) {
            imageViewArr[i2] = new ImageView(this);
            LayoutParams layoutParams = new LinearLayout.LayoutParams(new LayoutParams(15, 15));
            layoutParams.setMargins(10, 10, 10, 10);
            imageViewArr[i2].setLayoutParams(layoutParams);
            imageViewArr[i2].setImageResource(C1142R.drawable.shape_circle);
            imageViewArr[i2].setColorFilter(-1, Mode.SRC_IN);
            linearLayout.addView(imageViewArr[i2]);
        }
        if (imageViewArr.length > 0) {
            imageViewArr[i].setImageResource(C1142R.drawable.shape_circle);
            imageViewArr[i].setColorFilter(getResources().getColor(C1142R.color.light_green_600), Mode.SRC_IN);
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1142R.layout.activity_card_wizard_light);
        this.f6129n = (ViewPager) findViewById(C1142R.id.view_pager);
        m11265b(0);
        this.f6130o = new C2401a(this);
        this.f6129n.setAdapter(this.f6130o);
        this.f6129n.m2551a(this.f6128m);
        C2746d.m12253a((Activity) this, (int) C1142R.color.grey_20);
    }
}
