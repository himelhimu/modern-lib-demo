package android.sabbir.com.modernlibrarys.test.material.components.activity.chip;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v7.app.C0818e;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.C0105a;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.WindowManager.LayoutParams;
import android.widget.ImageButton;
import android.widget.Toast;
import butterknife.C1142R;
import com.material.components.p086a.C2207a;
import com.material.components.p086a.C2207a.C2205a;
import com.material.components.p090b.C2700a;
import com.material.components.p091e.C2733h;
import com.material.components.p091e.C2735i;
import com.pchmn.materialchips.ChipsInput;
import com.pchmn.materialchips.ChipsInput.C2407b;
import com.pchmn.materialchips.p092b.C2734b;
import java.util.ArrayList;
import java.util.List;

public class ChipBasic extends C0818e {
    private ChipsInput f6150m;
    private List<C2735i> f6151n = new ArrayList();
    private List<C2734b> f6152o = new ArrayList();
    private List<C2733h> f6153p = new ArrayList();

    class C24061 implements OnClickListener {
        final /* synthetic */ ChipBasic f6146a;

        C24061(ChipBasic chipBasic) {
            this.f6146a = chipBasic;
        }

        public void onClick(View view) {
            this.f6146a.m11299m();
        }
    }

    class C24082 implements C2407b {
        final /* synthetic */ ChipBasic f6147a;

        C24082(ChipBasic chipBasic) {
            this.f6147a = chipBasic;
        }

        public void mo1934a(C2734b c2734b, int i) {
            this.f6147a.f6152o.add(c2734b);
        }

        public void mo1935a(CharSequence charSequence) {
        }

        public void mo1936b(C2734b c2734b, int i) {
            this.f6147a.f6152o.remove(c2734b);
        }
    }

    private void m11296j() {
        Toolbar toolbar = (Toolbar) findViewById(C1142R.id.toolbar);
        toolbar.setNavigationIcon((int) C1142R.drawable.ic_menu);
        m4362a(toolbar);
        m4370f().mo760a((CharSequence) "Basic");
        m4370f().mo761a(true);
    }

    private void m11297k() {
        this.f6153p = C2700a.m12159c(this);
        ((ImageButton) findViewById(C1142R.id.contacts)).setOnClickListener(new C24061(this));
        this.f6150m = (ChipsInput) findViewById(C1142R.id.chips_input);
        m11298l();
        this.f6150m.m12318a(new C24082(this));
    }

    private void m11298l() {
        Integer valueOf = Integer.valueOf(0);
        Integer num = valueOf;
        for (C2733h c2733h : this.f6153p) {
            this.f6151n.add(new C2735i(num.toString(), c2733h.f7026b, c2733h.f7027c, c2733h.f7028d));
            num = Integer.valueOf(num.intValue() + 1);
        }
        this.f6150m.setFilterableList(this.f6151n);
    }

    private void m11299m() {
        final Dialog dialog = new Dialog(this);
        dialog.requestWindowFeature(1);
        dialog.setContentView(C1142R.layout.dialog_contacts);
        dialog.setCancelable(true);
        LayoutParams layoutParams = new LayoutParams();
        layoutParams.copyFrom(dialog.getWindow().getAttributes());
        layoutParams.width = -1;
        layoutParams.height = -2;
        RecyclerView recyclerView = (RecyclerView) dialog.findViewById(C1142R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        C0105a c2207a = new C2207a(this, this.f6153p);
        recyclerView.setAdapter(c2207a);
        c2207a.m10855a(new C2205a(this) {
            final /* synthetic */ ChipBasic f6149b;

            public void mo1937a(View view, C2733h c2733h, int i) {
                this.f6149b.f6150m.m12317a(c2733h.f7026b, c2733h.f7027c, c2733h.f7028d);
                dialog.hide();
            }
        });
        dialog.show();
        dialog.getWindow().setAttributes(layoutParams);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1142R.layout.activity_chip_basic);
        m11296j();
        m11297k();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C1142R.menu.menu_chips, menu);
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
