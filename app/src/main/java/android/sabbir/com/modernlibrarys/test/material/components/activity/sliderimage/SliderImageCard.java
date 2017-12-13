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

public class SliderImageCard extends C0818e {
    private static int[] f6790p = new int[]{C1142R.drawable.image_shop_9, C1142R.drawable.image_shop_10, C1142R.drawable.image_shop_11, C1142R.drawable.image_shop_12, C1142R.drawable.image_shop_13};
    private ViewPager f6791m;
    private LinearLayout f6792n;
    private C2640a f6793o;

    class C26371 implements C0190f {
        final /* synthetic */ SliderImageCard f6784a;

        C26371(SliderImageCard sliderImageCard) {
            this.f6784a = sliderImageCard;
        }

        public void mo180a(int i) {
        }

        public void mo181a(int i, float f, int i2) {
        }

        public void mo182b(int i) {
            this.f6784a.m11908a(this.f6784a.f6792n, this.f6784a.f6793o.mo1933b(), i);
        }
    }

    private static class C2640a extends ab {
        private Activity f6787a;
        private List<C2728c> f6788b;
        private C2639a f6789c;

        private interface C2639a {
            void m11900a(View view, C2728c c2728c);
        }

        private C2640a(Activity activity, List<C2728c> list) {
            this.f6787a = activity;
            this.f6788b = list;
        }

        public Object mo338a(ViewGroup viewGroup, int i) {
            final C2728c c2728c = (C2728c) this.f6788b.get(i);
            View inflate = ((LayoutInflater) this.f6787a.getSystemService("layout_inflater")).inflate(C1142R.layout.item_slider_image, viewGroup, false);
            MaterialRippleLayout materialRippleLayout = (MaterialRippleLayout) inflate.findViewById(C1142R.id.lyt_parent);
            C2746d.m12254a(this.f6787a, (ImageView) inflate.findViewById(C1142R.id.image), c2728c.f6998a);
            materialRippleLayout.setOnClickListener(new OnClickListener(this) {
                final /* synthetic */ C2640a f6786b;

                public void onClick(View view) {
                    if (this.f6786b.f6789c != null) {
                        this.f6786b.f6789c.m11900a(view, c2728c);
                    }
                }
            });
            ((ViewPager) viewGroup).addView(inflate);
            return inflate;
        }

        public void mo341a(ViewGroup viewGroup, int i, Object obj) {
            ((ViewPager) viewGroup).removeView((RelativeLayout) obj);
        }

        public void m11904a(List<C2728c> list) {
            this.f6788b = list;
            m2106c();
        }

        public boolean mo342a(View view, Object obj) {
            return view == ((RelativeLayout) obj);
        }

        public int mo1933b() {
            return this.f6788b.size();
        }
    }

    private void m11908a(LinearLayout linearLayout, int i, int i2) {
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

    private void m11911j() {
        Toolbar toolbar = (Toolbar) findViewById(C1142R.id.toolbar);
        toolbar.setNavigationIcon((int) C1142R.drawable.ic_menu);
        m4362a(toolbar);
        m4370f().mo760a((CharSequence) "Product");
        m4370f().mo761a(true);
    }

    private void m11912k() {
        this.f6792n = (LinearLayout) findViewById(C1142R.id.layout_dots);
        this.f6791m = (ViewPager) findViewById(C1142R.id.pager);
        this.f6793o = new C2640a(this, new ArrayList());
        List arrayList = new ArrayList();
        for (int i : f6790p) {
            C2728c c2728c = new C2728c();
            c2728c.f6998a = i;
            c2728c.f6999b = getResources().getDrawable(c2728c.f6998a);
            arrayList.add(c2728c);
        }
        this.f6793o.m11904a(arrayList);
        this.f6791m.setAdapter(this.f6793o);
        this.f6791m.setCurrentItem(0);
        m11908a(this.f6792n, this.f6793o.mo1933b(), 0);
        this.f6791m.m2551a(new C26371(this));
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1142R.layout.activity_slider_image_card);
        m11911j();
        m11912k();
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
