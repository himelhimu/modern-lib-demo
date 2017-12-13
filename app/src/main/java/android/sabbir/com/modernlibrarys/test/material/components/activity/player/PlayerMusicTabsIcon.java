package android.sabbir.com.modernlibrarys.test.material.components.activity.player;

import android.content.res.AssetFileDescriptor;
import android.graphics.PorterDuff.Mode;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.design.widget.TabLayout.C0182b;
import android.support.design.widget.TabLayout.C0189e;
import android.support.v4.p008b.C0227l;
import android.support.v4.p008b.C0365q;
import android.support.v4.p008b.C0378u;
import android.support.v4.view.ViewPager;
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

public class PlayerMusicTabsIcon extends C0818e {
    public View f6563m;
    private ViewPager f6564n;
    private TabLayout f6565o;
    private C2563a f6566p;
    private ImageButton f6567q;
    private ProgressBar f6568r;
    private MediaPlayer f6569s;
    private Handler f6570t = new Handler();
    private C2743c f6571u;
    private Runnable f6572v = new C25624(this);

    class C25591 implements C0182b {
        final /* synthetic */ PlayerMusicTabsIcon f6556a;

        C25591(PlayerMusicTabsIcon playerMusicTabsIcon) {
            this.f6556a = playerMusicTabsIcon;
        }

        public void mo183a(C0189e c0189e) {
            this.f6556a.m4370f().mo760a(this.f6556a.f6566p.m11686e(c0189e.m1078c()));
            c0189e.m1075b().setColorFilter(-1, Mode.SRC_IN);
        }

        public void mo184b(C0189e c0189e) {
            c0189e.m1075b().setColorFilter(this.f6556a.getResources().getColor(C1142R.color.grey_20), Mode.SRC_IN);
        }

        public void mo185c(C0189e c0189e) {
        }
    }

    class C25602 implements OnCompletionListener {
        final /* synthetic */ PlayerMusicTabsIcon f6557a;

        C25602(PlayerMusicTabsIcon playerMusicTabsIcon) {
            this.f6557a = playerMusicTabsIcon;
        }

        public void onCompletion(MediaPlayer mediaPlayer) {
            this.f6557a.f6567q.setImageResource(C1142R.drawable.ic_play_arrow);
        }
    }

    class C25613 implements OnClickListener {
        final /* synthetic */ PlayerMusicTabsIcon f6558a;

        C25613(PlayerMusicTabsIcon playerMusicTabsIcon) {
            this.f6558a = playerMusicTabsIcon;
        }

        public void onClick(View view) {
            if (this.f6558a.f6569s.isPlaying()) {
                this.f6558a.f6569s.pause();
                this.f6558a.f6567q.setImageResource(C1142R.drawable.ic_play_arrow);
                return;
            }
            this.f6558a.f6569s.start();
            this.f6558a.f6567q.setImageResource(C1142R.drawable.ic_pause);
            this.f6558a.f6570t.post(this.f6558a.f6572v);
        }
    }

    class C25624 implements Runnable {
        final /* synthetic */ PlayerMusicTabsIcon f6559a;

        C25624(PlayerMusicTabsIcon playerMusicTabsIcon) {
            this.f6559a = playerMusicTabsIcon;
        }

        public void run() {
            this.f6559a.m11697m();
            if (this.f6559a.f6569s.isPlaying()) {
                this.f6559a.f6570t.postDelayed(this, 100);
            }
        }
    }

    private class C2563a extends C0378u {
        final /* synthetic */ PlayerMusicTabsIcon f6560a;
        private final List<C0227l> f6561b = new ArrayList();
        private final List<String> f6562c = new ArrayList();

        public C2563a(PlayerMusicTabsIcon playerMusicTabsIcon, C0365q c0365q) {
            this.f6560a = playerMusicTabsIcon;
            super(c0365q);
        }

        public C0227l mo1958a(int i) {
            return (C0227l) this.f6561b.get(i);
        }

        public void m11683a(C0227l c0227l, String str) {
            this.f6561b.add(c0227l);
            this.f6562c.add(str);
        }

        public int mo1933b() {
            return this.f6561b.size();
        }

        public CharSequence mo1959c(int i) {
            return null;
        }

        public String m11686e(int i) {
            return (String) this.f6562c.get(i);
        }
    }

    private void m11688a(ViewPager viewPager) {
        this.f6566p = new C2563a(this, m1917e());
        this.f6566p.m11683a(C2717d.m12197a(), "Songs");
        this.f6566p.m11683a(C2714c.m12193a(), "Albums");
        this.f6566p.m11683a(C2714c.m12193a(), "Artists");
        this.f6566p.m11683a(C2717d.m12197a(), "Playlist");
        viewPager.setAdapter(this.f6566p);
    }

    private void m11694j() {
        Toolbar toolbar = (Toolbar) findViewById(C1142R.id.toolbar);
        toolbar.setNavigationIcon((int) C1142R.drawable.ic_menu);
        m4362a(toolbar);
        m4370f().mo760a((CharSequence) "Songs");
        m4370f().mo761a(true);
    }

    private void m11695k() {
        this.f6564n = (ViewPager) findViewById(C1142R.id.view_pager);
        this.f6565o = (TabLayout) findViewById(C1142R.id.tab_layout);
        m11688a(this.f6564n);
        this.f6565o.setupWithViewPager(this.f6564n);
        this.f6565o.m1120a(0).m1079c(C1142R.drawable.ic_music);
        this.f6565o.m1120a(1).m1079c(C1142R.drawable.ic_adjust);
        this.f6565o.m1120a(2).m1079c(C1142R.drawable.ic_person);
        this.f6565o.m1120a(3).m1079c(C1142R.drawable.ic_queue_music);
        this.f6565o.m1120a(0).m1075b().setColorFilter(-1, Mode.SRC_IN);
        this.f6565o.m1120a(1).m1075b().setColorFilter(getResources().getColor(C1142R.color.grey_20), Mode.SRC_IN);
        this.f6565o.m1120a(2).m1075b().setColorFilter(getResources().getColor(C1142R.color.grey_20), Mode.SRC_IN);
        this.f6565o.m1120a(3).m1075b().setColorFilter(getResources().getColor(C1142R.color.grey_20), Mode.SRC_IN);
        this.f6565o.m1123a(new C25591(this));
        this.f6567q = (ImageButton) findViewById(C1142R.id.bt_play);
        this.f6568r = (ProgressBar) findViewById(C1142R.id.song_progressbar);
        this.f6568r.setProgress(0);
        this.f6568r.setMax(10000);
        this.f6569s = new MediaPlayer();
        this.f6569s.setOnCompletionListener(new C25602(this));
        try {
            this.f6569s.setAudioStreamType(3);
            AssetFileDescriptor openFd = getAssets().openFd("short_music.mp3");
            this.f6569s.setDataSource(openFd.getFileDescriptor(), openFd.getStartOffset(), openFd.getLength());
            openFd.close();
            this.f6569s.prepare();
        } catch (Exception e) {
            Snackbar.m1021a(this.f6563m, "Cannot load audio file", -1).m1012a();
        }
        this.f6571u = new C2743c();
        m11696l();
    }

    private void m11696l() {
        this.f6567q.setOnClickListener(new C25613(this));
    }

    private void m11697m() {
        long currentPosition = (long) this.f6569s.getCurrentPosition();
        this.f6568r.setProgress(this.f6571u.m12243a(currentPosition, (long) this.f6569s.getDuration()));
    }

    public void controlClick(View view) {
        switch (view.getId()) {
            case C1142R.id.bt_expand:
                Snackbar.m1021a(this.f6563m, "Expand", -1).m1012a();
                return;
            default:
                return;
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1142R.layout.activity_player_music_tabs_icon);
        this.f6563m = findViewById(C1142R.id.parent_view);
        m11694j();
        m11695k();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C1142R.menu.menu_search_setting, menu);
        return true;
    }

    public void onDestroy() {
        super.onDestroy();
        this.f6570t.removeCallbacks(this.f6572v);
        this.f6569s.release();
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
