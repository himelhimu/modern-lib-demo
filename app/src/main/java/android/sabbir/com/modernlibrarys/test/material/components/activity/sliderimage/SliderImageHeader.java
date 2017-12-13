package android.sabbir.com.modernlibrarys.test.material.components.activity.sliderimage;

import android.app.Activity;
import android.graphics.PorterDuff.Mode;
import android.os.Bundle;
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
import android.widget.Toast;
import butterknife.C1142R;
import com.balysv.materialripple.MaterialRippleLayout;
import com.material.components.p089f.C2746d;
import com.material.components.p091e.C2728c;
import java.util.ArrayList;
import java.util.List;

public class SliderImageHeader extends C0818e {
    private static int[] f6817p = new int[]{C1142R.drawable.image_shop_9, C1142R.drawable.image_shop_10, C1142R.drawable.image_shop_11, C1142R.drawable.image_shop_12, C1142R.drawable.image_shop_13};
    private ViewPager f6818m;
    private LinearLayout f6819n;
    private C2649a f6820o;

    class C26461 implements C0190f {
        final /* synthetic */ SliderImageHeader f6811a;

        C26461(SliderImageHeader sliderImageHeader) {
            this.f6811a = sliderImageHeader;
        }

        public void mo180a(int i) {
        }

        public void mo181a(int i, float f, int i2) {
        }

        public void mo182b(int i) {
            this.f6811a.m11944a(this.f6811a.f6819n, this.f6811a.f6820o.mo1933b(), i);
        }
    }

    private static class C2649a extends ab {
        private Activity f6814a;
        private List<C2728c> f6815b;
        private C2648a f6816c;

        private interface C2648a {
            void m11936a(View view, C2728c c2728c);
        }

        private C2649a(Activity activity, List<C2728c> list) {
            this.f6814a = activity;
            this.f6815b = list;
        }

        public Object mo338a(ViewGroup viewGroup, int i) {
            final C2728c c2728c = (C2728c) this.f6815b.get(i);
            View inflate = ((LayoutInflater) this.f6814a.getSystemService("layout_inflater")).inflate(C1142R.layout.item_slider_image, viewGroup, false);
            MaterialRippleLayout materialRippleLayout = (MaterialRippleLayout) inflate.findViewById(C1142R.id.lyt_parent);
            C2746d.m12254a(this.f6814a, (ImageView) inflate.findViewById(C1142R.id.image), c2728c.f6998a);
            materialRippleLayout.setOnClickListener(new OnClickListener(this) {
                final /* synthetic */ C2649a f6813b;

                public void onClick(View view) {
                    if (this.f6813b.f6816c != null) {
                        this.f6813b.f6816c.m11936a(view, c2728c);
                    }
                }
            });
            ((ViewPager) viewGroup).addView(inflate);
            return inflate;
        }

        public void mo341a(ViewGroup viewGroup, int i, Object obj) {
            ((ViewPager) viewGroup).removeView((RelativeLayout) obj);
        }

        public void m11940a(List<C2728c> list) {
            this.f6815b = list;
            m2106c();
        }

        public boolean mo342a(View view, Object obj) {
            return view == ((RelativeLayout) obj);
        }

        public int mo1933b() {
            return this.f6815b.size();
        }
    }

    private void m11944a(LinearLayout linearLayout, int i, int i2) {
        ImageView[] imageViewArr = new ImageView[i];
        linearLayout.removeAllViews();
        for (int i3 = 0; i3 < imageViewArr.length; i3++) {
            imageViewArr[i3] = new ImageView(this);
            LayoutParams layoutParams = new LinearLayout.LayoutParams(new LayoutParams(15, 15));
            layoutParams.setMargins(10, 10, 10, 10);
            imageViewArr[i3].setLayoutParams(layoutParams);
            imageViewArr[i3].setImageResource(C1142R.drawable.shape_circle);
            imageViewArr[i3].setColorFilter(C0289a.m1645c(this, C1142R.color.overlay_dark_10), Mode.SRC_ATOP);
            linearLayout.addView(imageViewArr[i3]);
        }
        if (imageViewArr.length > 0) {
            imageViewArr[i2].setColorFilter(C0289a.m1645c(this, C1142R.color.colorPrimaryLight), Mode.SRC_ATOP);
        }
    }

    private void m11947j() {
        Toolbar toolbar = (Toolbar) findViewById(C1142R.id.toolbar);
        toolbar.setNavigationIcon((int) C1142R.drawable.ic_menu);
        m4362a(toolbar);
        m4370f().mo760a((CharSequence) "Product");
        m4370f().mo761a(true);
    }

    private void m11948k() {
        this.f6819n = (LinearLayout) findViewById(C1142R.id.layout_dots);
        this.f6818m = (ViewPager) findViewById(C1142R.id.pager);
        this.f6820o = new C2649a(this, new ArrayList());
        List arrayList = new ArrayList();
        for (int i : f6817p) {
            C2728c c2728c = new C2728c();
            c2728c.f6998a = i;
            c2728c.f6999b = getResources().getDrawable(c2728c.f6998a);
            arrayList.add(c2728c);
        }
        this.f6820o.m11940a(arrayList);
        this.f6818m.setAdapter(this.f6820o);
        this.f6818m.setCurrentItem(0);
        m11944a(this.f6819n, this.f6820o.mo1933b(), 0);
        this.f6818m.m2551a(new C26461(this));
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1142R.layout.activity_slider_image_header);
        m11947j();
        m11948k();
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
