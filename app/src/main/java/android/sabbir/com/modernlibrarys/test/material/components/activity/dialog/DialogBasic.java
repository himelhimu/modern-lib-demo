package android.sabbir.com.modernlibrarys.test.material.components.activity.dialog;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnMultiChoiceClickListener;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.C0817d.C0816a;
import android.support.v7.app.C0818e;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import butterknife.C1142R;

public class DialogBasic extends C0818e {
    private static final String[] f6180n = new String[]{"None", "Callisto", "Ganymede", "Luna"};
    private static final String[] f6181p = new String[]{"Red", "Green", "Blue", "Purple", "Olive"};
    private View f6182m;
    private boolean[] f6183o = new boolean[f6181p.length];
    private String f6184q;

    class C24201 implements OnClickListener {
        final /* synthetic */ DialogBasic f6174a;

        C24201(DialogBasic dialogBasic) {
            this.f6174a = dialogBasic;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Snackbar.m1021a(this.f6174a.f6182m, "Agree clicked", -1).m1012a();
        }
    }

    class C24212 implements OnClickListener {
        final /* synthetic */ DialogBasic f6175a;

        C24212(DialogBasic dialogBasic) {
            this.f6175a = dialogBasic;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Snackbar.m1021a(this.f6175a.f6182m, "Discard clicked", -1).m1012a();
        }
    }

    class C24223 implements OnClickListener {
        final /* synthetic */ DialogBasic f6176a;

        C24223(DialogBasic dialogBasic) {
            this.f6176a = dialogBasic;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            this.f6176a.f6184q = DialogBasic.f6180n[i];
        }
    }

    class C24234 implements OnClickListener {
        final /* synthetic */ DialogBasic f6177a;

        C24234(DialogBasic dialogBasic) {
            this.f6177a = dialogBasic;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Snackbar.m1021a(this.f6177a.f6182m, "selected : " + this.f6177a.f6184q, -1).m1012a();
        }
    }

    class C24245 implements OnMultiChoiceClickListener {
        final /* synthetic */ DialogBasic f6178a;

        C24245(DialogBasic dialogBasic) {
            this.f6178a = dialogBasic;
        }

        public void onClick(DialogInterface dialogInterface, int i, boolean z) {
            this.f6178a.f6183o[i] = z;
        }
    }

    class C24256 implements OnClickListener {
        final /* synthetic */ DialogBasic f6179a;

        C24256(DialogBasic dialogBasic) {
            this.f6179a = dialogBasic;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Snackbar.m1021a(this.f6179a.f6182m, "Data submitted", -1).m1012a();
        }
    }

    private void m11318k() {
        Toolbar toolbar = (Toolbar) findViewById(C1142R.id.toolbar);
        toolbar.setNavigationIcon((int) C1142R.drawable.ic_menu);
        m4362a(toolbar);
        m4370f().mo760a((CharSequence) "Basic");
        m4370f().mo761a(true);
    }

    private void m11319l() {
        C0816a c0816a = new C0816a(this);
        c0816a.m4350a((CharSequence) "Use Google's location services ?");
        c0816a.m4344a((int) C1142R.string.middle_lorem_ipsum);
        c0816a.m4345a((int) C1142R.string.AGREE, new C24201(this));
        c0816a.m4354b(C1142R.string.DISAGREE, null);
        c0816a.m4356c();
    }

    private void m11320m() {
        C0816a c0816a = new C0816a(this);
        c0816a.m4350a((CharSequence) "Discard draft ?");
        c0816a.m4345a((int) C1142R.string.DISCARD, new C24212(this));
        c0816a.m4354b(C1142R.string.CANCEL, null);
        c0816a.m4356c();
    }

    private void m11321n() {
        this.f6184q = f6180n[0];
        C0816a c0816a = new C0816a(this);
        c0816a.m4350a((CharSequence) "Phone Ringtone");
        c0816a.m4352a(f6180n, 0, new C24223(this));
        c0816a.m4345a((int) C1142R.string.OK, new C24234(this));
        c0816a.m4354b(C1142R.string.CANCEL, null);
        c0816a.m4356c();
    }

    private void m11322o() {
        this.f6184q = f6180n[0];
        this.f6183o = new boolean[f6181p.length];
        C0816a c0816a = new C0816a(this);
        c0816a.m4350a((CharSequence) "Your preferred colors");
        c0816a.m4353a(f6181p, this.f6183o, new C24245(this));
        c0816a.m4345a((int) C1142R.string.OK, new C24256(this));
        c0816a.m4354b(C1142R.string.CANCEL, null);
        c0816a.m4356c();
    }

    public void clickAction(View view) {
        switch (view.getId()) {
            case C1142R.id.confirm_dialog:
                m11319l();
                return;
            case C1142R.id.alert_dialog:
                m11320m();
                return;
            case C1142R.id.single_choice_dialog:
                m11321n();
                return;
            case C1142R.id.multi_choice_dialog:
                m11322o();
                return;
            default:
                return;
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1142R.layout.activity_dialog_basic);
        this.f6182m = findViewById(16908290);
        m11318k();
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
