package android.sabbir.com.modernlibrarys.test.material.components.activity.dialog;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.PorterDuff.Mode;
import android.os.Bundle;
import android.support.v7.app.C0818e;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.WindowManager.LayoutParams;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import butterknife.C1142R;
import com.material.components.p086a.C2284n;
import com.material.components.p086a.C2284n.C2282a;
import com.material.components.p089f.C2746d;
import com.material.components.p090b.C2700a;
import com.material.components.p091e.C2733h;
import de.hdodenhof.circleimageview.CircleImageView;
import java.util.List;

public class DialogCustomLight extends C0818e {
    private View f6213m;
    private RecyclerView f6214n;
    private C2284n f6215o;

    class C24341 implements C2282a {
        final /* synthetic */ DialogCustomLight f6209a;

        C24341(DialogCustomLight dialogCustomLight) {
            this.f6209a = dialogCustomLight;
        }

        public void mo1938a(View view, C2733h c2733h, int i) {
            this.f6209a.m11338a(c2733h);
        }
    }

    class C24363 implements OnClickListener {
        final /* synthetic */ DialogCustomLight f6212a;

        C24363(DialogCustomLight dialogCustomLight) {
            this.f6212a = dialogCustomLight;
        }

        public void onClick(View view) {
            Toast.makeText(this.f6212a.getApplicationContext(), "Follow Clicked", 0).show();
        }
    }

    private void m11338a(C2733h c2733h) {
        final Dialog dialog = new Dialog(this);
        dialog.requestWindowFeature(1);
        dialog.setContentView(C1142R.layout.dialog_light);
        dialog.setCancelable(true);
        LayoutParams layoutParams = new LayoutParams();
        layoutParams.copyFrom(dialog.getWindow().getAttributes());
        layoutParams.width = -2;
        layoutParams.height = -2;
        ((TextView) dialog.findViewById(C1142R.id.title)).setText(c2733h.f7027c);
        ((CircleImageView) dialog.findViewById(C1142R.id.image)).setImageResource(c2733h.f7025a);
        ((ImageButton) dialog.findViewById(C1142R.id.bt_close)).setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ DialogCustomLight f6211b;

            public void onClick(View view) {
                dialog.dismiss();
            }
        });
        ((AppCompatButton) dialog.findViewById(C1142R.id.bt_follow)).setOnClickListener(new C24363(this));
        dialog.show();
        dialog.getWindow().setAttributes(layoutParams);
    }

    private void m11339j() {
        Toolbar toolbar = (Toolbar) findViewById(C1142R.id.toolbar);
        toolbar.setNavigationIcon((int) C1142R.drawable.ic_menu);
        toolbar.getNavigationIcon().setColorFilter(getResources().getColor(C1142R.color.grey_60), Mode.SRC_ATOP);
        m4362a(toolbar);
        m4370f().mo760a((CharSequence) "Custom Light");
        m4370f().mo761a(true);
        C2746d.m12253a((Activity) this, (int) C1142R.color.grey_20);
    }

    private void m11340k() {
        this.f6214n = (RecyclerView) findViewById(C1142R.id.recyclerView);
        this.f6214n.setLayoutManager(new LinearLayoutManager(this));
        this.f6214n.setHasFixedSize(true);
        List c = C2700a.m12159c(this);
        c.addAll(C2700a.m12159c(this));
        c.addAll(C2700a.m12159c(this));
        this.f6215o = new C2284n(this, c);
        this.f6214n.setAdapter(this.f6215o);
        this.f6215o.m11007a(new C24341(this));
        m11338a((C2733h) c.get(0));
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1142R.layout.activity_dialog_custom_light);
        this.f6213m = findViewById(16908290);
        m11339j();
        m11340k();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C1142R.menu.menu_search_setting, menu);
        C2746d.m12257a(menu, getResources().getColor(C1142R.color.grey_60));
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
