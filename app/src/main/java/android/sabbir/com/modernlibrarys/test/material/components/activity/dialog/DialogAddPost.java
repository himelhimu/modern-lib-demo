package android.sabbir.com.modernlibrarys.test.material.components.activity.dialog;

import android.app.Dialog;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.C0818e;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.WindowManager.LayoutParams;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;
import butterknife.C1142R;

public class DialogAddPost extends C0818e {

    class C24101 implements OnClickListener {
        final /* synthetic */ DialogAddPost f6154a;

        C24101(DialogAddPost dialogAddPost) {
            this.f6154a = dialogAddPost;
        }

        public void onClick(View view) {
            this.f6154a.m11305l();
        }
    }

    class C24134 implements OnClickListener {
        final /* synthetic */ DialogAddPost f6159a;

        C24134(DialogAddPost dialogAddPost) {
            this.f6159a = dialogAddPost;
        }

        public void onClick(View view) {
            Toast.makeText(this.f6159a.getApplicationContext(), "Post Photo Clicked", 0).show();
        }
    }

    class C24145 implements OnClickListener {
        final /* synthetic */ DialogAddPost f6160a;

        C24145(DialogAddPost dialogAddPost) {
            this.f6160a = dialogAddPost;
        }

        public void onClick(View view) {
            Toast.makeText(this.f6160a.getApplicationContext(), "Post Link Clicked", 0).show();
        }
    }

    class C24156 implements OnClickListener {
        final /* synthetic */ DialogAddPost f6161a;

        C24156(DialogAddPost dialogAddPost) {
            this.f6161a = dialogAddPost;
        }

        public void onClick(View view) {
            Toast.makeText(this.f6161a.getApplicationContext(), "Post File Clicked", 0).show();
        }
    }

    class C24167 implements OnClickListener {
        final /* synthetic */ DialogAddPost f6162a;

        C24167(DialogAddPost dialogAddPost) {
            this.f6162a = dialogAddPost;
        }

        public void onClick(View view) {
            Toast.makeText(this.f6162a.getApplicationContext(), "Post Setting Clicked", 0).show();
        }
    }

    private void m11303j() {
        Toolbar toolbar = (Toolbar) findViewById(C1142R.id.toolbar);
        toolbar.setNavigationIcon((int) C1142R.drawable.ic_menu);
        m4362a(toolbar);
        m4370f().mo760a((CharSequence) "Add Post");
        m4370f().mo761a(true);
    }

    private void m11304k() {
        ((FloatingActionButton) findViewById(C1142R.id.fab_add)).setOnClickListener(new C24101(this));
    }

    private void m11305l() {
        final Dialog dialog = new Dialog(this);
        dialog.requestWindowFeature(1);
        dialog.setContentView(C1142R.layout.dialog_add_post);
        dialog.setCancelable(true);
        LayoutParams layoutParams = new LayoutParams();
        layoutParams.copyFrom(dialog.getWindow().getAttributes());
        layoutParams.width = -1;
        layoutParams.height = -1;
        final AppCompatButton appCompatButton = (AppCompatButton) dialog.findViewById(C1142R.id.bt_submit);
        ((EditText) dialog.findViewById(C1142R.id.et_post)).addTextChangedListener(new TextWatcher(this) {
            final /* synthetic */ DialogAddPost f6156b;

            public void afterTextChanged(Editable editable) {
            }

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                appCompatButton.setEnabled(!charSequence.toString().trim().isEmpty());
            }
        });
        appCompatButton.setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ DialogAddPost f6158b;

            public void onClick(View view) {
                dialog.dismiss();
                Toast.makeText(this.f6158b.getApplicationContext(), "Post Submitted", 0).show();
            }
        });
        ((ImageButton) dialog.findViewById(C1142R.id.bt_photo)).setOnClickListener(new C24134(this));
        ((ImageButton) dialog.findViewById(C1142R.id.bt_link)).setOnClickListener(new C24145(this));
        ((ImageButton) dialog.findViewById(C1142R.id.bt_file)).setOnClickListener(new C24156(this));
        ((ImageButton) dialog.findViewById(C1142R.id.bt_setting)).setOnClickListener(new C24167(this));
        dialog.show();
        dialog.getWindow().setAttributes(layoutParams);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1142R.layout.activity_dialog_add_post);
        m11303j();
        m11304k();
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
