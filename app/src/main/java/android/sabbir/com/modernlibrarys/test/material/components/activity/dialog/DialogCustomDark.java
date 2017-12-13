package android.sabbir.com.modernlibrarys.test.material.components.activity.dialog;

import android.app.Activity;
import android.app.Dialog;
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

public class DialogCustomDark extends C0818e {
    private View f6203m;
    private RecyclerView f6204n;
    private C2284n f6205o;

    class C24291 implements C2282a {
        final /* synthetic */ DialogCustomDark f6199a;

        C24291(DialogCustomDark dialogCustomDark) {
            this.f6199a = dialogCustomDark;
        }

        public void mo1938a(View view, C2733h c2733h, int i) {
            this.f6199a.m11330a(c2733h);
        }
    }

    class C24313 implements OnClickListener {
        final /* synthetic */ DialogCustomDark f6202a;

        C24313(DialogCustomDark dialogCustomDark) {
            this.f6202a = dialogCustomDark;
        }

        public void onClick(View view) {
            Toast.makeText(this.f6202a.getApplicationContext(), "Follow Clicked", 0).show();
        }
    }

    private void m11330a(C2733h c2733h) {
        final Dialog dialog = new Dialog(this);
        dialog.requestWindowFeature(1);
        dialog.setContentView(C1142R.layout.dialog_dark);
        dialog.setCancelable(true);
        LayoutParams layoutParams = new LayoutParams();
        layoutParams.copyFrom(dialog.getWindow().getAttributes());
        layoutParams.width = -2;
        layoutParams.height = -2;
        ((TextView) dialog.findViewById(C1142R.id.title)).setText(c2733h.f7027c);
        ((CircleImageView) dialog.findViewById(C1142R.id.image)).setImageResource(c2733h.f7025a);
        ((ImageButton) dialog.findViewById(C1142R.id.bt_close)).setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ DialogCustomDark f6201b;

            public void onClick(View view) {
                dialog.dismiss();
            }
        });
        ((AppCompatButton) dialog.findViewById(C1142R.id.bt_follow)).setOnClickListener(new C24313(this));
        dialog.show();
        dialog.getWindow().setAttributes(layoutParams);
    }

    private void m11331j() {
        Toolbar toolbar = (Toolbar) findViewById(C1142R.id.toolbar);
        toolbar.setNavigationIcon((int) C1142R.drawable.ic_menu);
        m4362a(toolbar);
        m4370f().mo760a((CharSequence) "Dialog Dark");
        m4370f().mo761a(true);
        C2746d.m12253a((Activity) this, (int) C1142R.color.grey_1000);
    }

    private void m11332k() {
        this.f6204n = (RecyclerView) findViewById(C1142R.id.recyclerView);
        this.f6204n.setLayoutManager(new LinearLayoutManager(this));
        this.f6204n.setHasFixedSize(true);
        List c = C2700a.m12159c(this);
        c.addAll(C2700a.m12159c(this));
        c.addAll(C2700a.m12159c(this));
        this.f6205o = new C2284n(this, c);
        this.f6204n.setAdapter(this.f6205o);
        this.f6205o.m11007a(new C24291(this));
        m11330a((C2733h) c.get(0));
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1142R.layout.activity_dialog_custom_dark);
        this.f6203m = findViewById(16908290);
        m11331j();
        m11332k();
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
