package android.sabbir.com.modernlibrarys.test.material.components.activity.form;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.C0818e;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import android.widget.Toast;
import butterknife.C1142R;

public class FormLogin extends C0818e {
    private static final String[] f6271m = new String[]{"foo@example.com:hello", "bar@example.com:world"};
    private C2463a f6272n = null;
    private AutoCompleteTextView f6273o;
    private EditText f6274p;
    private View f6275q;
    private View f6276r;

    class C24611 implements OnEditorActionListener {
        final /* synthetic */ FormLogin f6266a;

        C24611(FormLogin formLogin) {
            this.f6266a = formLogin;
        }

        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i != C1142R.id.login && i != 0) {
                return false;
            }
            this.f6266a.m11403l();
            return true;
        }
    }

    class C24622 implements OnClickListener {
        final /* synthetic */ FormLogin f6267a;

        C24622(FormLogin formLogin) {
            this.f6267a = formLogin;
        }

        public void onClick(View view) {
            this.f6267a.m11403l();
        }
    }

    public class C2463a extends AsyncTask<Void, Void, Boolean> {
        final /* synthetic */ FormLogin f6268a;
        private final String f6269b;
        private final String f6270c;

        C2463a(FormLogin formLogin, String str, String str2) {
            this.f6268a = formLogin;
            this.f6269b = str;
            this.f6270c = str2;
        }

        protected Boolean m11392a(Void... voidArr) {
            try {
                Thread.sleep(2000);
                for (String split : FormLogin.f6271m) {
                    String[] split2 = split.split(":");
                    if (split2[0].equals(this.f6269b)) {
                        return Boolean.valueOf(split2[1].equals(this.f6270c));
                    }
                }
                return Boolean.valueOf(true);
            } catch (InterruptedException e) {
                return Boolean.valueOf(false);
            }
        }

        protected void m11393a(Boolean bool) {
            this.f6268a.f6272n = null;
            this.f6268a.m11399b(false);
            if (bool.booleanValue()) {
                this.f6268a.m11399b(false);
                Toast.makeText(this.f6268a.getApplicationContext(), "Login Success", 0).show();
                return;
            }
            this.f6268a.f6274p.setError("Incorrect password");
            this.f6268a.f6274p.requestFocus();
        }

        protected /* synthetic */ Object doInBackground(Object[] objArr) {
            return m11392a((Void[]) objArr);
        }

        protected void onCancelled() {
            this.f6268a.f6272n = null;
            this.f6268a.m11399b(false);
        }

        protected /* synthetic */ void onPostExecute(Object obj) {
            m11393a((Boolean) obj);
        }
    }

    private boolean m11397a(String str) {
        return !TextUtils.isEmpty(str) && Patterns.EMAIL_ADDRESS.matcher(str).matches();
    }

    private void m11399b(boolean z) {
        int i = 8;
        this.f6275q.setVisibility(z ? 0 : 8);
        View view = this.f6276r;
        if (!z) {
            i = 0;
        }
        view.setVisibility(i);
    }

    private boolean m11400b(String str) {
        return str.length() > 4;
    }

    private void m11402k() {
        this.f6273o = (AutoCompleteTextView) findViewById(C1142R.id.email);
        this.f6274p = (EditText) findViewById(C1142R.id.password);
        this.f6274p.setOnEditorActionListener(new C24611(this));
        ((Button) findViewById(C1142R.id.email_sign_in_button)).setOnClickListener(new C24622(this));
        this.f6276r = findViewById(C1142R.id.login_form);
        this.f6275q = findViewById(C1142R.id.login_progress);
    }

    private void m11403l() {
        if (this.f6272n == null) {
            View view;
            boolean z;
            this.f6273o.setError(null);
            this.f6274p.setError(null);
            String obj = this.f6273o.getText().toString();
            String trim = this.f6274p.getText().toString().trim();
            if (TextUtils.isEmpty(trim) || m11400b(trim)) {
                view = null;
                z = false;
            } else {
                this.f6274p.setError("invalid_password");
                view = this.f6274p;
                z = true;
            }
            if (TextUtils.isEmpty(obj)) {
                this.f6273o.setError("Field required");
                view = this.f6273o;
                z = true;
            } else if (!m11397a(obj)) {
                this.f6273o.setError("Invalid email");
                view = this.f6273o;
                z = true;
            }
            if (z) {
                view.requestFocus();
                return;
            }
            m11399b(true);
            this.f6272n = new C2463a(this, obj, trim);
            this.f6272n.execute(new Void[]{(Void) null});
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1142R.layout.activity_form_login);
        m11402k();
    }
}
