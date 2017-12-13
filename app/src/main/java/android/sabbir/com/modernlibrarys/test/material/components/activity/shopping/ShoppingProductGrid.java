package android.sabbir.com.modernlibrarys.test.material.components.activity.shopping;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.C0818e;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import butterknife.C1142R;
import com.material.components.p086a.C2263i;
import com.material.components.p086a.C2263i.C2260a;
import com.material.components.p086a.C2263i.C2261b;
import com.material.components.p089f.C2746d;
import com.material.components.p090b.C2700a;
import com.material.components.p091e.C2739m;
import com.material.components.p093g.C2757c;

public class ShoppingProductGrid extends C0818e {
    private View f6737m;
    private RecyclerView f6738n;
    private C2263i f6739o;

    class C26281 implements C2260a {
        final /* synthetic */ ShoppingProductGrid f6735a;

        C26281(ShoppingProductGrid shoppingProductGrid) {
            this.f6735a = shoppingProductGrid;
        }

        public void mo1973a(View view, C2739m c2739m, int i) {
            Snackbar.m1021a(this.f6735a.f6737m, "Item " + c2739m.f7047c + " clicked", -1).m1012a();
        }
    }

    class C26292 implements C2261b {
        final /* synthetic */ ShoppingProductGrid f6736a;

        C26292(ShoppingProductGrid shoppingProductGrid) {
            this.f6736a = shoppingProductGrid;
        }

        public void mo1974a(View view, C2739m c2739m, MenuItem menuItem) {
            Snackbar.m1021a(this.f6736a.f6737m, c2739m.f7047c + " (" + menuItem.getTitle() + ") clicked", -1).m1012a();
        }
    }

    private void m11873j() {
        Toolbar toolbar = (Toolbar) findViewById(C1142R.id.toolbar);
        toolbar.setNavigationIcon((int) C1142R.drawable.ic_menu);
        m4362a(toolbar);
        m4370f().mo760a((CharSequence) "Products");
        m4370f().mo761a(true);
    }

    private void m11874k() {
        this.f6738n = (RecyclerView) findViewById(C1142R.id.recyclerView);
        this.f6738n.setLayoutManager(new GridLayoutManager(this, 2));
        this.f6738n.m358a(new C2757c(2, C2746d.m12248a((Context) this, 8), true));
        this.f6738n.setHasFixedSize(true);
        this.f6738n.setNestedScrollingEnabled(false);
        this.f6739o = new C2263i(this, C2700a.m12164h(this));
        this.f6738n.setAdapter(this.f6739o);
        this.f6739o.m10966a(new C26281(this));
        this.f6739o.m10967a(new C26292(this));
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1142R.layout.activity_shopping_product_grid);
        this.f6737m = findViewById(C1142R.id.parent_view);
        m11873j();
        m11874k();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C1142R.menu.menu_cart_setting, menu);
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
