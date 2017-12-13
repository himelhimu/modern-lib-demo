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
import com.material.components.p086a.C2256h;
import com.material.components.p086a.C2256h.C2254a;
import com.material.components.p089f.C2746d;
import com.material.components.p090b.C2700a;
import com.material.components.p091e.C2738l;
import com.material.components.p093g.C2757c;

public class ShoppingCategoryCard extends C0818e {
    private View f6702m;
    private RecyclerView f6703n;
    private C2256h f6704o;

    class C26161 implements C2254a {
        final /* synthetic */ ShoppingCategoryCard f6701a;

        C26161(ShoppingCategoryCard shoppingCategoryCard) {
            this.f6701a = shoppingCategoryCard;
        }

        public void mo1970a(View view, C2738l c2738l, int i) {
            Snackbar.m1021a(this.f6701a.f6702m, "Item " + c2738l.f7042c + " clicked", -1).m1012a();
        }
    }

    private void m11843j() {
        Toolbar toolbar = (Toolbar) findViewById(C1142R.id.toolbar);
        toolbar.setNavigationIcon((int) C1142R.drawable.ic_menu);
        m4362a(toolbar);
        m4370f().mo760a((CharSequence) "Categories");
        m4370f().mo761a(true);
    }

    private void m11844k() {
        this.f6703n = (RecyclerView) findViewById(C1142R.id.recyclerView);
        this.f6703n.setLayoutManager(new GridLayoutManager(this, 2));
        this.f6703n.m358a(new C2757c(2, C2746d.m12248a((Context) this, 8), true));
        this.f6703n.setHasFixedSize(true);
        this.f6703n.setNestedScrollingEnabled(false);
        this.f6704o = new C2256h(this, C2700a.m12163g(this));
        this.f6703n.setAdapter(this.f6704o);
        this.f6704o.m10954a(new C26161(this));
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1142R.layout.activity_shopping_category_card);
        this.f6702m = findViewById(C1142R.id.parent_view);
        m11843j();
        m11844k();
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
