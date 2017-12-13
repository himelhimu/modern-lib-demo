package android.sabbir.com.modernlibrarys.test.material.components.activity.shopping;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.app.C0818e;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import butterknife.C1142R;
import com.material.components.p089f.C2746d;
import com.material.components.p089f.C2754e;
import com.material.components.p089f.C2754e.C2447a;

public class ShoppingProductDetails extends C0818e {
    private View f6727m;
    private ImageButton f6728n;
    private ImageButton f6729o;
    private ImageButton f6730p;
    private View f6731q;
    private View f6732r;
    private View f6733s;
    private NestedScrollView f6734t;

    class C26231 implements OnClickListener {
        final /* synthetic */ ShoppingProductDetails f6721a;

        C26231(ShoppingProductDetails shoppingProductDetails) {
            this.f6721a = shoppingProductDetails;
        }

        public void onClick(View view) {
            this.f6721a.m11861a(view, this.f6721a.f6731q);
        }
    }

    class C26242 implements OnClickListener {
        final /* synthetic */ ShoppingProductDetails f6722a;

        C26242(ShoppingProductDetails shoppingProductDetails) {
            this.f6722a = shoppingProductDetails;
        }

        public void onClick(View view) {
            this.f6722a.m11861a(view, this.f6722a.f6732r);
        }
    }

    class C26253 implements OnClickListener {
        final /* synthetic */ ShoppingProductDetails f6723a;

        C26253(ShoppingProductDetails shoppingProductDetails) {
            this.f6723a = shoppingProductDetails;
        }

        public void onClick(View view) {
            this.f6723a.m11861a(view, this.f6723a.f6733s);
        }
    }

    class C26264 implements OnClickListener {
        final /* synthetic */ ShoppingProductDetails f6724a;

        C26264(ShoppingProductDetails shoppingProductDetails) {
            this.f6724a = shoppingProductDetails;
        }

        public void onClick(View view) {
            Snackbar.m1021a(this.f6724a.f6727m, "Add to Cart", -1).m1012a();
        }
    }

    private void m11861a(View view, final View view2) {
        if (mo1941a(view)) {
            C2754e.m12267a(view2, new C2447a(this) {
                final /* synthetic */ ShoppingProductDetails f6726b;

                public void mo1940a() {
                    C2746d.m12256a(this.f6726b.f6734t, view2);
                }
            });
        } else {
            C2754e.m12269b(view2);
        }
    }

    private void m11867j() {
        m4362a((Toolbar) findViewById(C1142R.id.toolbar));
        m4370f().mo760a((CharSequence) "Fashion");
    }

    private void m11868k() {
        this.f6734t = (NestedScrollView) findViewById(C1142R.id.nested_scroll_view);
        this.f6728n = (ImageButton) findViewById(C1142R.id.bt_toggle_reviews);
        this.f6731q = findViewById(C1142R.id.lyt_expand_reviews);
        this.f6728n.setOnClickListener(new C26231(this));
        this.f6729o = (ImageButton) findViewById(C1142R.id.bt_toggle_warranty);
        this.f6732r = findViewById(C1142R.id.lyt_expand_warranty);
        this.f6729o.setOnClickListener(new C26242(this));
        this.f6730p = (ImageButton) findViewById(C1142R.id.bt_toggle_description);
        this.f6733s = findViewById(C1142R.id.lyt_expand_description);
        this.f6730p.setOnClickListener(new C26253(this));
        mo1941a(this.f6730p);
        this.f6733s.setVisibility(0);
        ((FloatingActionButton) findViewById(C1142R.id.fab)).setOnClickListener(new C26264(this));
    }

    public boolean mo1941a(View view) {
        if (view.getRotation() == 0.0f) {
            view.animate().setDuration(200).rotation(180.0f);
            return true;
        }
        view.animate().setDuration(200).rotation(0.0f);
        return false;
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1142R.layout.activity_shopping_product_details);
        this.f6727m = findViewById(C1142R.id.parent_view);
        m11867j();
        m11868k();
    }
}
