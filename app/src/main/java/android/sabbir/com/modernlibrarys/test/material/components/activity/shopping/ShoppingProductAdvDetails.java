package android.sabbir.com.modernlibrarys.test.material.components.activity.shopping;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.C0818e;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import butterknife.C1142R;
import com.material.components.p089f.C2746d;

public class ShoppingProductAdvDetails extends C0818e {
    private static int[] f6717o = new int[]{C1142R.id.fab_color_blue, C1142R.id.fab_color_pink, C1142R.id.fab_color_grey, C1142R.id.fab_color_green};
    private static int[] f6718p = new int[]{C1142R.id.bt_size_s, C1142R.id.bt_size_m, C1142R.id.bt_size_l, C1142R.id.bt_size_xl};
    private View f6719m;
    private TextView f6720n;

    class C26191 implements OnClickListener {
        final /* synthetic */ ShoppingProductAdvDetails f6713a;

        C26191(ShoppingProductAdvDetails shoppingProductAdvDetails) {
            this.f6713a = shoppingProductAdvDetails;
        }

        public void onClick(View view) {
            int parseInt = Integer.parseInt(this.f6713a.f6720n.getText().toString());
            if (parseInt > 1) {
                this.f6713a.f6720n.setText((parseInt - 1) + "");
            }
        }
    }

    class C26202 implements OnClickListener {
        final /* synthetic */ ShoppingProductAdvDetails f6714a;

        C26202(ShoppingProductAdvDetails shoppingProductAdvDetails) {
            this.f6714a = shoppingProductAdvDetails;
        }

        public void onClick(View view) {
            int parseInt = Integer.parseInt(this.f6714a.f6720n.getText().toString());
            if (parseInt < 10) {
                this.f6714a.f6720n.setText((parseInt + 1) + "");
            }
        }
    }

    class C26213 implements OnClickListener {
        final /* synthetic */ ShoppingProductAdvDetails f6715a;

        C26213(ShoppingProductAdvDetails shoppingProductAdvDetails) {
            this.f6715a = shoppingProductAdvDetails;
        }

        public void onClick(View view) {
            Snackbar.m1021a(this.f6715a.f6719m, "Add to Wishlist", -1).m1012a();
        }
    }

    class C26224 implements OnClickListener {
        final /* synthetic */ ShoppingProductAdvDetails f6716a;

        C26224(ShoppingProductAdvDetails shoppingProductAdvDetails) {
            this.f6716a = shoppingProductAdvDetails;
        }

        public void onClick(View view) {
            Snackbar.m1021a(this.f6716a.f6719m, "Add to Cart", -1).m1012a();
        }
    }

    private void m11857j() {
        m4362a((Toolbar) findViewById(C1142R.id.toolbar));
        m4370f().mo760a((CharSequence) "Ecommerce");
        m4370f().mo761a(true);
    }

    private void m11858k() {
        C2746d.m12254a((Context) this, (ImageView) findViewById(C1142R.id.image_1), (int) C1142R.drawable.image_shop_9);
        C2746d.m12254a((Context) this, (ImageView) findViewById(C1142R.id.image_2), (int) C1142R.drawable.image_shop_10);
        C2746d.m12254a((Context) this, (ImageView) findViewById(C1142R.id.image_3), (int) C1142R.drawable.image_shop_11);
        C2746d.m12254a((Context) this, (ImageView) findViewById(C1142R.id.image_4), (int) C1142R.drawable.image_shop_12);
        C2746d.m12254a((Context) this, (ImageView) findViewById(C1142R.id.image_5), (int) C1142R.drawable.image_shop_13);
        this.f6720n = (TextView) findViewById(C1142R.id.tv_qty);
        ((FloatingActionButton) findViewById(C1142R.id.fab_qty_sub)).setOnClickListener(new C26191(this));
        ((FloatingActionButton) findViewById(C1142R.id.fab_qty_add)).setOnClickListener(new C26202(this));
        ((AppCompatButton) findViewById(C1142R.id.bt_add_to_wishlist)).setOnClickListener(new C26213(this));
        ((AppCompatButton) findViewById(C1142R.id.bt_add_to_cart)).setOnClickListener(new C26224(this));
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1142R.layout.activity_shopping_product_adv_details);
        this.f6719m = findViewById(C1142R.id.parent_view);
        m11857j();
        m11858k();
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

    public void setColor(View view) {
        ((FloatingActionButton) view).setImageResource(C1142R.drawable.ic_done);
        for (int i : f6717o) {
            if (view.getId() != i) {
                ((FloatingActionButton) findViewById(i)).setImageResource(17170445);
            }
        }
    }

    public void setSize(View view) {
        int i = 0;
        Button button = (Button) view;
        button.setEnabled(false);
        button.setTextColor(-1);
        int[] iArr = f6718p;
        int length = iArr.length;
        while (i < length) {
            int i2 = iArr[i];
            if (view.getId() != i2) {
                button = (Button) findViewById(i2);
                button.setEnabled(true);
                button.setTextColor(-16777216);
            }
            i++;
        }
    }
}
