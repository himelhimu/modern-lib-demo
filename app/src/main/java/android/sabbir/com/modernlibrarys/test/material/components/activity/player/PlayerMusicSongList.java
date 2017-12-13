package android.sabbir.com.modernlibrarys.test.material.components.activity.player;

import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.Snackbar;
import android.support.v7.app.C0818e;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.Toast;
import butterknife.C1142R;
import com.material.components.p086a.C2315s;
import com.material.components.p086a.C2315s.C2312a;
import com.material.components.p086a.C2315s.C2313b;
import com.material.components.p089f.C2743c;
import com.material.components.p090b.C2700a;
import com.material.components.p091e.C2732g;

public class PlayerMusicSongList extends C0818e {
    private View f6532m;
    private RecyclerView f6533n;
    private ImageButton f6534o;
    private ProgressBar f6535p;
    private C2315s f6536q;
    private MediaPlayer f6537r;
    private Handler f6538s = new Handler();
    private C2743c f6539t;
    private Runnable f6540u = new C25545(this);

    class C25501 implements C2312a {
        final /* synthetic */ PlayerMusicSongList f6527a;

        C25501(PlayerMusicSongList playerMusicSongList) {
            this.f6527a = playerMusicSongList;
        }

        public void mo1964a(View view, C2732g c2732g, int i) {
            Snackbar.m1021a(this.f6527a.f6532m, "Item " + c2732g.f7023c + " clicked", -1).m1012a();
        }
    }

    class C25512 implements C2313b {
        final /* synthetic */ PlayerMusicSongList f6528a;

        C25512(PlayerMusicSongList playerMusicSongList) {
            this.f6528a = playerMusicSongList;
        }

        public void mo1965a(View view, C2732g c2732g, MenuItem menuItem) {
            Snackbar.m1021a(this.f6528a.f6532m, c2732g.f7023c + " (" + menuItem.getTitle() + ") clicked", -1).m1012a();
        }
    }

    class C25523 implements OnCompletionListener {
        final /* synthetic */ PlayerMusicSongList f6529a;

        C25523(PlayerMusicSongList playerMusicSongList) {
            this.f6529a = playerMusicSongList;
        }

        public void onCompletion(MediaPlayer mediaPlayer) {
            this.f6529a.f6534o.setImageResource(C1142R.drawable.ic_play_arrow);
        }
    }

    class C25534 implements OnClickListener {
        final /* synthetic */ PlayerMusicSongList f6530a;

        C25534(PlayerMusicSongList playerMusicSongList) {
            this.f6530a = playerMusicSongList;
        }

        public void onClick(View view) {
            if (this.f6530a.f6537r.isPlaying()) {
                this.f6530a.f6537r.pause();
                this.f6530a.f6534o.setImageResource(C1142R.drawable.ic_play_arrow);
                return;
            }
            this.f6530a.f6537r.start();
            this.f6530a.f6534o.setImageResource(C1142R.drawable.ic_pause);
            this.f6530a.f6538s.post(this.f6530a.f6540u);
        }
    }

    class C25545 implements Runnable {
        final /* synthetic */ PlayerMusicSongList f6531a;

        C25545(PlayerMusicSongList playerMusicSongList) {
            this.f6531a = playerMusicSongList;
        }

        public void run() {
            this.f6531a.m11664m();
            if (this.f6531a.f6537r.isPlaying()) {
                this.f6531a.f6538s.postDelayed(this, 100);
            }
        }
    }

    private void m11661j() {
        Toolbar toolbar = (Toolbar) findViewById(C1142R.id.toolbar);
        toolbar.setNavigationIcon((int) C1142R.drawable.ic_menu);
        m4362a(toolbar);
        m4370f().mo760a((CharSequence) "Songs");
        m4370f().mo761a(true);
    }

    private void m11662k() {
        this.f6532m = findViewById(C1142R.id.parent_view);
        this.f6533n = (RecyclerView) findViewById(C1142R.id.recyclerView);
        this.f6533n.setLayoutManager(new LinearLayoutManager(this));
        this.f6533n.setHasFixedSize(true);
        this.f6536q = new C2315s(this, C2700a.m12165i(this));
        this.f6533n.setAdapter(this.f6536q);
        this.f6536q.m11075a(new C25501(this));
        this.f6536q.m11076a(new C25512(this));
        this.f6534o = (ImageButton) findViewById(C1142R.id.bt_play);
        this.f6535p = (ProgressBar) findViewById(C1142R.id.song_progressbar);
        this.f6535p.setProgress(0);
        this.f6535p.setMax(10000);
        this.f6537r = new MediaPlayer();
        this.f6537r.setOnCompletionListener(new C25523(this));
        try {
            this.f6537r.setAudioStreamType(3);
            AssetFileDescriptor openFd = getAssets().openFd("short_music.mp3");
            this.f6537r.setDataSource(openFd.getFileDescriptor(), openFd.getStartOffset(), openFd.getLength());
            openFd.close();
            this.f6537r.prepare();
        } catch (Exception e) {
            Snackbar.m1021a(this.f6532m, "Cannot load audio file", -1).m1012a();
        }
        this.f6539t = new C2743c();
        m11663l();
    }

    private void m11663l() {
        this.f6534o.setOnClickListener(new C25534(this));
    }

    private void m11664m() {
        long currentPosition = (long) this.f6537r.getCurrentPosition();
        this.f6535p.setProgress(this.f6539t.m12243a(currentPosition, (long) this.f6537r.getDuration()));
    }

    public void controlClick(View view) {
        switch (view.getId()) {
            case C1142R.id.bt_expand:
                Snackbar.m1021a(this.f6532m, "Expand", -1).m1012a();
                return;
            default:
                return;
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1142R.layout.activity_player_music_song_list);
        m11661j();
        m11662k();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C1142R.menu.menu_search, menu);
        return true;
    }

    public void onDestroy() {
        super.onDestroy();
        this.f6538s.removeCallbacks(this.f6540u);
        this.f6537r.release();
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
