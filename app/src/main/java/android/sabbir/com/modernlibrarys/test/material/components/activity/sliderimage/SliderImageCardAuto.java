package android.sabbir.com.modernlibrarys.test.material.components.activity.sliderimage;

import android.app.Activity;
import android.graphics.PorterDuff.Mode;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.p012c.C0289a;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.C0190f;
import android.support.v4.view.ab;
import android.support.v7.app.C0818e;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import butterknife.C1142R;
import com.balysv.materialripple.MaterialRippleLayout;
import com.material.components.p089f.C2746d;
import com.material.components.p091e.C2728c;
import java.util.ArrayList;
import java.util.List;

public class SliderImageCardAuto extends C0818e {
    private static int[] f6803r = new int[]{C1142R.drawable.image_12, C1142R.drawable.image_13, C1142R.drawable.image_14, C1142R.drawable.image_15, C1142R.drawable.image_8};
    private static String[] f6804s = new String[]{"Dui fringilla ornare finibus, orci odio", "Mauris sagittis non elit quis fermentum", "Mauris ultricies augue sit amet est sollicitudin", "Suspendisse ornare est ac auctor pulvinar", "Vivamus laoreet aliquam ipsum eget pretium"};
    private static String[] f6805t = new String[]{"Foggy Hill", "The Backpacker", "River Forest", "Mist Mountain", "Side Park"};
    private ViewPager f6806m;
    private LinearLayout f6807n;
    private C2645a f6808o;
    private Runnable f6809p = null;
    private Handler f6810q = new Handler();

    private static class C2645a extends ab {
        private Activity f6800a;
        private List<C2728c> f6801b;
        private C2644a f6802c;

        private interface C2644a {
            void m11916a(View view, C2728c c2728c);
        }

        private C2645a(Activity activity, List<C2728c> list) {
            this.f6800a = activity;
            this.f6801b = list;
        }

        public Object mo338a(ViewGroup viewGroup, int i) {
            final C2728c c2728c = (C2728c) this.f6801b.get(i);
            View inflate = ((LayoutInflater) this.f6800a.getSystemService("layout_inflater")).inflate(C1142R.layout.item_slider_image, viewGroup, false);
            MaterialRippleLayout materialRippleLayout = (MaterialRippleLayout) inflate.findViewById(C1142R.id.lyt_parent);
            C2746d.m12254a(this.f6800a, (ImageView) inflate.findViewById(C1142R.id.image), c2728c.f6998a);
            materialRippleLayout.setOnClickListener(new OnClickListener(this) {
                final /* synthetic */ C2645a f6799b;

                public void onClick(View view) {
                    if (this.f6799b.f6802c != null) {
                        this.f6799b.f6802c.m11916a(view, c2728c);
                    }
                }
            });
            ((ViewPager) viewGroup).addView(inflate);
            return inflate;
        }

        public void mo341a(ViewGroup viewGroup, int i, Object obj) {
            ((ViewPager) viewGroup).removeView((RelativeLayout) obj);
        }

        public void m11920a(List<C2728c> list) {
            this.f6801b = list;
            m2106c();
        }

        public boolean mo342a(View view, Object obj) {
            return view == ((RelativeLayout) obj);
        }

        public int mo1933b() {
            return this.f6801b.size();
        }
    }

    private void m11924a(LinearLayout linearLayout, int i, int i2) {
        ImageView[] imageViewArr = new ImageView[i];
        linearLayout.removeAllViews();
        for (int i3 = 0; i3 < imageViewArr.length; i3++) {
            imageViewArr[i3] = new ImageView(this);
            LayoutParams layoutParams = new LinearLayout.LayoutParams(new LayoutParams(15, 15));
            layoutParams.setMargins(10, 0, 10, 0);
            imageViewArr[i3].setLayoutParams(layoutParams);
            imageViewArr[i3].setImageResource(C1142R.drawable.shape_circle_outline);
            imageViewArr[i3].setColorFilter(C0289a.m1645c(this, C1142R.color.grey_40), Mode.SRC_ATOP);
            linearLayout.addView(imageViewArr[i3]);
        }
        if (imageViewArr.length > 0) {
            imageViewArr[i2].setImageResource(C1142R.drawable.shape_circle);
            imageViewArr[i2].setColorFilter(C0289a.m1645c(this, C1142R.color.grey_40), Mode.SRC_ATOP);
        }
    }

    private void m11927b(final int i) {
        this.f6809p = new Runnable(this) {
            final /* synthetic */ SliderImageCardAuto f6797b;

            public void run() {
                int currentItem = this.f6797b.f6806m.getCurrentItem() + 1;
                if (currentItem >= i) {
                    currentItem = 0;
                }
                this.f6797b.f6806m.setCurrentItem(currentItem);
                this.f6797b.f6810q.postDelayed(this.f6797b.f6809p, 3000);
            }
        };
        this.f6810q.postDelayed(this.f6809p, 3000);
    }

    private void m11931j() {
        Toolbar toolbar = (Toolbar) findViewById(C1142R.id.toolbar);
        toolbar.setNavigationIcon((int) C1142R.drawable.ic_menu);
        m4362a(toolbar);
        m4370f().mo760a((CharSequence) "Places");
        m4370f().mo761a(true);
    }

    private void m11932k() {
        this.f6807n = (LinearLayout) findViewById(C1142R.id.layout_dots);
        this.f6806m = (ViewPager) findViewById(C1142R.id.pager);
        this.f6808o = new C2645a(this, new ArrayList());
        final List arrayList = new ArrayList();
        for (int i = 0; i < f6803r.length; i++) {
            C2728c c2728c = new C2728c();
            c2728c.f6998a = f6803r[i];
            c2728c.f6999b = getResources().getDrawable(c2728c.f6998a);
            c2728c.f7000c = f6804s[i];
            c2728c.f7001d = f6805t[i];
            arrayList.add(c2728c);
        }
        this.f6808o.m11920a(arrayList);
        this.f6806m.setAdapter(this.f6808o);
        this.f6806m.setCurrentItem(0);
        m11924a(this.f6807n, this.f6808o.mo1933b(), 0);
        ((TextView) findViewById(C1142R.id.title)).setText(((C2728c) arrayList.get(0)).f7000c);
        ((TextView) findViewById(C1142R.id.brief)).setText(((C2728c) arrayList.get(0)).f7001d);
        this.f6806m.m2551a(new C0190f(this) {
            final /* synthetic */ SliderImageCardAuto f6795b;

            public void mo180a(int i) {
            }

            public void mo181a(int i, float f, int i2) {
            }

            public void mo182b(int i) {
                ((TextView) this.f6795b.findViewById(C1142R.id.title)).setText(((C2728c) arrayList.get(i)).f7000c);
                ((TextView) this.f6795b.findViewById(C1142R.id.brief)).setText(((C2728c) arrayList.get(i)).f7001d);
                this.f6795b.m11924a(this.f6795b.f6807n, this.f6795b.f6808o.mo1933b(), i);
            }
        });
        m11927b(this.f6808o.mo1933b());
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1142R.layout.activity_slider_image_card_auto);
        m11931j();
        m11932k();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C1142R.menu.menu_setting, menu);
        return true;
    }

    public void onDestroy() {
        if (this.f6809p != null) {
            this.f6810q.removeCallbacks(this.f6809p);
        }
        super.onDestroy();
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
