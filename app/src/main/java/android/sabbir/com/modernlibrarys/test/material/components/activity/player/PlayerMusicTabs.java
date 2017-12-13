package android.sabbir.com.modernlibrarys.test.material.components.activity.player;

import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.p008b.C0227l;
import android.support.v4.p008b.C0365q;
import android.support.v4.p008b.C0378u;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ab;
import android.support.v7.app.C0818e;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.Toast;
import butterknife.C1142R;
import com.material.components.p088c.C2714c;
import com.material.components.p088c.C2717d;
import com.material.components.p089f.C2743c;
import java.util.ArrayList;
import java.util.List;

public class PlayerMusicTabs extends C0818e {
    public View f6547m;
    private ViewPager f6548n;
    private TabLayout f6549o;
    private ImageButton f6550p;
    private ProgressBar f6551q;
    private MediaPlayer f6552r;
    private Handler f6553s = new Handler();
    private C2743c f6554t;
    private Runnable f6555u = new C25573(this);

    class C25551 implements OnCompletionListener {
        final /* synthetic */ PlayerMusicTabs f6541a;

        C25551(PlayerMusicTabs playerMusicTabs) {
            this.f6541a = playerMusicTabs;
        }

        public void onCompletion(MediaPlayer mediaPlayer) {
            this.f6541a.f6550p.setImageResource(C1142R.drawable.ic_play_arrow);
        }
    }

    class C25562 implements OnClickListener {
        final /* synthetic */ PlayerMusicTabs f6542a;

        C25562(PlayerMusicTabs playerMusicTabs) {
            this.f6542a = playerMusicTabs;
        }

        public void onClick(View view) {
            if (this.f6542a.f6552r.isPlaying()) {
                this.f6542a.f6552r.pause();
                this.f6542a.f6550p.setImageResource(C1142R.drawable.ic_play_arrow);
                return;
            }
            this.f6542a.f6552r.start();
            this.f6542a.f6550p.setImageResource(C1142R.drawable.ic_pause);
            this.f6542a.f6553s.post(this.f6542a.f6555u);
        }
    }

    class C25573 implements Runnable {
        final /* synthetic */ PlayerMusicTabs f6543a;

        C25573(PlayerMusicTabs playerMusicTabs) {
            this.f6543a = playerMusicTabs;
        }

        public void run() {
            this.f6543a.m11678m();
            if (this.f6543a.f6552r.isPlaying()) {
                this.f6543a.f6553s.postDelayed(this, 100);
            }
        }
    }

    private class C2558a extends C0378u {
        final /* synthetic */ PlayerMusicTabs f6544a;
        private final List<C0227l> f6545b = new ArrayList();
        private final List<String> f6546c = new ArrayList();

        public C2558a(PlayerMusicTabs playerMusicTabs, C0365q c0365q) {
            this.f6544a = playerMusicTabs;
            super(c0365q);
        }

        public C0227l mo1958a(int i) {
            return (C0227l) this.f6545b.get(i);
        }

        public void m11666a(C0227l c0227l, String str) {
            this.f6545b.add(c0227l);
            this.f6546c.add(str);
        }

        public int mo1933b() {
            return this.f6545b.size();
        }

        public CharSequence mo1959c(int i) {
            return (CharSequence) this.f6546c.get(i);
        }
    }

    private void m11670a(ViewPager viewPager) {
        ab c2558a = new C2558a(this, m1917e());
        c2558a.m11666a(C2717d.m12197a(), "SONGS");
        c2558a.m11666a(C2714c.m12193a(), "ALBUMS");
        c2558a.m11666a(C2714c.m12193a(), "ARTISTS");
        c2558a.m11666a(C2717d.m12197a(), "PLAYLIST");
        viewPager.setAdapter(c2558a);
    }

    private void m11675j() {
        Toolbar toolbar = (Toolbar) findViewById(C1142R.id.toolbar);
        toolbar.setNavigationIcon((int) C1142R.drawable.ic_menu);
        m4362a(toolbar);
        m4370f().mo760a((CharSequence) "Music Player");
        m4370f().mo761a(true);
    }

    private void m11676k() {
        this.f6548n = (ViewPager) findViewById(C1142R.id.view_pager);
        m11670a(this.f6548n);
        this.f6549o = (TabLayout) findViewById(C1142R.id.tab_layout);
        this.f6549o.setupWithViewPager(this.f6548n);
        this.f6550p = (ImageButton) findViewById(C1142R.id.bt_play);
        this.f6551q = (ProgressBar) findViewById(C1142R.id.song_progressbar);
        this.f6551q.setProgress(0);
        this.f6551q.setMax(10000);
        this.f6552r = new MediaPlayer();
        this.f6552r.setOnCompletionListener(new C25551(this));
        try {
            this.f6552r.setAudioStreamType(3);
            AssetFileDescriptor openFd = getAssets().openFd("short_music.mp3");
            this.f6552r.setDataSource(openFd.getFileDescriptor(), openFd.getStartOffset(), openFd.getLength());
            openFd.close();
            this.f6552r.prepare();
        } catch (Exception e) {
            Snackbar.m1021a(this.f6547m, "Cannot load audio file", -1).m1012a();
        }
        this.f6554t = new C2743c();
        m11677l();
    }

    private void m11677l() {
        this.f6550p.setOnClickListener(new C25562(this));
    }

    private void m11678m() {
        long currentPosition = (long) this.f6552r.getCurrentPosition();
        this.f6551q.setProgress(this.f6554t.m12243a(currentPosition, (long) this.f6552r.getDuration()));
    }

    public void controlClick(View view) {
        switch (view.getId()) {
            case C1142R.id.bt_expand:
                Snackbar.m1021a(this.f6547m, "Expand", -1).m1012a();
                return;
            default:
                return;
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1142R.layout.activity_player_music_tabs);
        this.f6547m = findViewById(C1142R.id.parent_view);
        m11675j();
        m11676k();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C1142R.menu.menu_search_setting, menu);
        return true;
    }

    public void onDestroy() {
        super.onDestroy();
        this.f6553s.removeCallbacks(this.f6555u);
        this.f6552r.release();
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
