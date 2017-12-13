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

public class CardWizardOverlap extends C0818e {
    C0190f f6139m = new C24043(this);
    private ViewPager f6140n;
    private Button f6141o;
    private C2405a f6142p;
    private String[] f6143q = new String[]{"Ready to Travel", "Pick the Ticket", "Flight to Destination", "Enjoy Holiday"};
    private String[] f6144r = new String[]{"Choose your destination, plan Your trip. Pick the best place for Your holiday", "Select the day, pick Your ticket. We give you the best prices. We guarantee!", "Safe and Comfort flight is our priority. Professional crew and services.", "Enjoy your holiday, Don't forget to feel the moment and take a photo!"};
    private int[] f6145s = new int[]{C1142R.drawable.img_wizard_1, C1142R.drawable.img_wizard_2, C1142R.drawable.img_wizard_3, C1142R.drawable.img_wizard_4};

    class C24021 implements C0190f {
        final /* synthetic */ CardWizardOverlap f6134a;

        C24021(CardWizardOverlap cardWizardOverlap) {
            this.f6134a = cardWizardOverlap;
        }

        public void mo180a(int i) {
        }

        public void mo181a(int i, float f, int i2) {
        }

        public void mo182b(int i) {
            if (this.f6134a.f6140n.getCurrentItem() == this.f6134a.f6143q.length - 1) {
                this.f6134a.f6141o.setText("Get Started");
            } else {
                this.f6134a.f6141o.setText("Next");
            }
        }
    }

    class C24032 implements OnClickListener {
        final /* synthetic */ CardWizardOverlap f6135a;

        C24032(CardWizardOverlap cardWizardOverlap) {
            this.f6135a = cardWizardOverlap;
        }

        public void onClick(View view) {
            int currentItem = this.f6135a.f6140n.getCurrentItem() + 1;
            if (currentItem < 4) {
                this.f6135a.f6140n.setCurrentItem(currentItem);
            } else {
                this.f6135a.finish();
            }
        }
    }

    class C24043 implements C0190f {
        final /* synthetic */ CardWizardOverlap f6136a;

        C24043(CardWizardOverlap cardWizardOverlap) {
            this.f6136a = cardWizardOverlap;
        }

        public void mo180a(int i) {
        }

        public void mo181a(int i, float f, int i2) {
        }

        public void mo182b(int i) {
            this.f6136a.m11281b(i);
        }
    }

    public class C2405a extends ab {
        final /* synthetic */ CardWizardOverlap f6137a;
        private LayoutInflater f6138b;

        public C2405a(CardWizardOverlap cardWizardOverlap) {
            this.f6137a = cardWizardOverlap;
        }

        public Object mo338a(ViewGroup viewGroup, int i) {
            this.f6138b = (LayoutInflater) this.f6137a.getSystemService("layout_inflater");
            View inflate = this.f6138b.inflate(C1142R.layout.item_card_wizard, viewGroup, false);
            ((TextView) inflate.findViewById(C1142R.id.title)).setText(this.f6137a.f6143q[i]);
            ((TextView) inflate.findViewById(C1142R.id.description)).setText(this.f6137a.f6144r[i]);
            ((ImageView) inflate.findViewById(C1142R.id.image)).setImageResource(this.f6137a.f6145s[i]);
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
            return this.f6137a.f6143q.length;
        }
    }

    private void m11281b(int i) {
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
        setContentView((int) C1142R.layout.activity_card_wizard_overlap);
        this.f6140n = (ViewPager) findViewById(C1142R.id.view_pager);
        this.f6141o = (Button) findViewById(C1142R.id.btn_next);
        m11281b(0);
        this.f6142p = new C2405a(this);
        this.f6140n.setAdapter(this.f6142p);
        this.f6140n.m2551a(this.f6139m);
        this.f6140n.setPageMargin(getResources().getDimensionPixelOffset(C1142R.dimen.viewpager_margin_overlap));
        this.f6140n.setOffscreenPageLimit(4);
        this.f6140n.m2551a(new C24021(this));
        this.f6141o.setOnClickListener(new C24032(this));
        C2746d.m12253a((Activity) this, (int) C1142R.color.grey_20);
    }
}
