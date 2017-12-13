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

public class CardWizard extends C0818e {
    C0190f f6116m = new C23961(this);
    private ViewPager f6117n;
    private C2398a f6118o;
    private String[] f6119p = new String[]{"Ready to Travel", "Pick the Ticket", "Flight to Destination", "Enjoy Holiday"};
    private String[] f6120q = new String[]{"Choose your destination, plan Your trip. Pick the best place for Your holiday", "Select the day, pick Your ticket. We give you the best prices. We guarantee!", "Safe and Comfort flight is our priority. Professional crew and services.", "Enjoy your holiday, Don't forget to feel the moment and take a photo!"};
    private int[] f6121r = new int[]{C1142R.drawable.img_wizard_1, C1142R.drawable.img_wizard_2, C1142R.drawable.img_wizard_3, C1142R.drawable.img_wizard_4};
    private int[] f6122s = new int[]{C1142R.drawable.image_15, C1142R.drawable.image_10, C1142R.drawable.image_3, C1142R.drawable.image_12};

    class C23961 implements C0190f {
        final /* synthetic */ CardWizard f6111a;

        C23961(CardWizard cardWizard) {
            this.f6111a = cardWizard;
        }

        public void mo180a(int i) {
        }

        public void mo181a(int i, float f, int i2) {
        }

        public void mo182b(int i) {
            this.f6111a.m11251b(i);
        }
    }

    public class C2398a extends ab {
        final /* synthetic */ CardWizard f6113a;
        private LayoutInflater f6114b;
        private Button f6115c;

        class C23971 implements OnClickListener {
            final /* synthetic */ C2398a f6112a;

            C23971(C2398a c2398a) {
                this.f6112a = c2398a;
            }

            public void onClick(View view) {
                int currentItem = this.f6112a.f6113a.f6117n.getCurrentItem() + 1;
                if (currentItem < 4) {
                    this.f6112a.f6113a.f6117n.setCurrentItem(currentItem);
                } else {
                    this.f6112a.f6113a.finish();
                }
            }
        }

        public C2398a(CardWizard cardWizard) {
            this.f6113a = cardWizard;
        }

        public Object mo338a(ViewGroup viewGroup, int i) {
            this.f6114b = (LayoutInflater) this.f6113a.getSystemService("layout_inflater");
            View inflate = this.f6114b.inflate(C1142R.layout.item_card_wizard_bg, viewGroup, false);
            ((TextView) inflate.findViewById(C1142R.id.title)).setText(this.f6113a.f6119p[i]);
            ((TextView) inflate.findViewById(C1142R.id.description)).setText(this.f6113a.f6120q[i]);
            ((ImageView) inflate.findViewById(C1142R.id.image)).setImageResource(this.f6113a.f6121r[i]);
            ((ImageView) inflate.findViewById(C1142R.id.image_bg)).setImageResource(this.f6113a.f6122s[i]);
            this.f6115c = (Button) inflate.findViewById(C1142R.id.btn_next);
            if (i == this.f6113a.f6119p.length - 1) {
                this.f6115c.setText("Get Started");
            } else {
                this.f6115c.setText("Next");
            }
            this.f6115c.setOnClickListener(new C23971(this));
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
            return this.f6113a.f6119p.length;
        }
    }

    private void m11251b(int i) {
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
            imageViewArr[i].setColorFilter(getResources().getColor(C1142R.color.light_green_600), Mode.SRC_IN);
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1142R.layout.activity_card_wizard);
        this.f6117n = (ViewPager) findViewById(C1142R.id.view_pager);
        m11251b(0);
        this.f6118o = new C2398a(this);
        this.f6117n.setAdapter(this.f6118o);
        this.f6117n.m2551a(this.f6116m);
        C2746d.m12253a((Activity) this, (int) C1142R.color.grey_20);
    }
}
