package android.sabbir.com.modernlibrarys.test.material.components.activity.player;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.Snackbar;
import android.support.v7.app.C0818e;
import android.support.v7.widget.GridLayoutManager;
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
import com.material.components.p086a.C2240e;
import com.material.components.p086a.C2240e.C2238a;
import com.material.components.p089f.C2743c;
import com.material.components.p089f.C2746d;
import com.material.components.p090b.C2700a;
import com.material.components.p091e.C2731f;
import com.material.components.p093g.C2757c;

public class PlayerMusicAlbumGrid extends C0818e {
    private View f6484m;
    private RecyclerView f6485n;
    private ImageButton f6486o;
    private ProgressBar f6487p;
    private C2240e f6488q;
    private MediaPlayer f6489r;
    private Handler f6490s = new Handler();
    private C2743c f6491t;
    private Runnable f6492u = new C25384(this);

    class C25351 implements C2238a {
        final /* synthetic */ PlayerMusicAlbumGrid f6480a;

        C25351(PlayerMusicAlbumGrid playerMusicAlbumGrid) {
            this.f6480a = playerMusicAlbumGrid;
        }

        public void mo1963a(View view, C2731f c2731f, int i) {
            Snackbar.m1021a(this.f6480a.f6484m, "Item " + c2731f.f7018c + " clicked", -1).m1012a();
        }
    }

    class C25362 implements OnCompletionListener {
        final /* synthetic */ PlayerMusicAlbumGrid f6481a;

        C25362(PlayerMusicAlbumGrid playerMusicAlbumGrid) {
            this.f6481a = playerMusicAlbumGrid;
        }

        public void onCompletion(MediaPlayer mediaPlayer) {
            this.f6481a.f6486o.setImageResource(C1142R.drawable.ic_play_arrow);
        }
    }

    class C25373 implements OnClickListener {
        final /* synthetic */ PlayerMusicAlbumGrid f6482a;

        C25373(PlayerMusicAlbumGrid playerMusicAlbumGrid) {
            this.f6482a = playerMusicAlbumGrid;
        }

        public void onClick(View view) {
            if (this.f6482a.f6489r.isPlaying()) {
                this.f6482a.f6489r.pause();
                this.f6482a.f6486o.setImageResource(C1142R.drawable.ic_play_arrow);
                return;
            }
            this.f6482a.f6489r.start();
            this.f6482a.f6486o.setImageResource(C1142R.drawable.ic_pause);
            this.f6482a.f6490s.post(this.f6482a.f6492u);
        }
    }

    class C25384 implements Runnable {
        final /* synthetic */ PlayerMusicAlbumGrid f6483a;

        C25384(PlayerMusicAlbumGrid playerMusicAlbumGrid) {
            this.f6483a = playerMusicAlbumGrid;
        }

        public void run() {
            this.f6483a.m11621m();
            if (this.f6483a.f6489r.isPlaying()) {
                this.f6483a.f6490s.postDelayed(this, 100);
            }
        }
    }

    private void m11618j() {
        Toolbar toolbar = (Toolbar) findViewById(C1142R.id.toolbar);
        toolbar.setNavigationIcon((int) C1142R.drawable.ic_menu);
        m4362a(toolbar);
        m4370f().mo760a((CharSequence) "Albums");
        m4370f().mo761a(true);
    }

    private void m11619k() {
        this.f6484m = findViewById(C1142R.id.parent_view);
        this.f6485n = (RecyclerView) findViewById(C1142R.id.recyclerView);
        this.f6485n.setLayoutManager(new GridLayoutManager(this, 2));
        this.f6485n.m358a(new C2757c(2, C2746d.m12248a((Context) this, 4), true));
        this.f6485n.setHasFixedSize(true);
        this.f6488q = new C2240e(this, C2700a.m12166j(this));
        this.f6485n.setAdapter(this.f6488q);
        this.f6488q.m10920a(new C25351(this));
        this.f6486o = (ImageButton) findViewById(C1142R.id.bt_play);
        this.f6487p = (ProgressBar) findViewById(C1142R.id.song_progressbar);
        this.f6487p.setProgress(0);
        this.f6487p.setMax(10000);
        this.f6489r = new MediaPlayer();
        this.f6489r.setOnCompletionListener(new C25362(this));
        try {
            this.f6489r.setAudioStreamType(3);
            AssetFileDescriptor openFd = getAssets().openFd("short_music.mp3");
            this.f6489r.setDataSource(openFd.getFileDescriptor(), openFd.getStartOffset(), openFd.getLength());
            openFd.close();
            this.f6489r.prepare();
        } catch (Exception e) {
            Snackbar.m1021a(this.f6484m, "Cannot load audio file", -1).m1012a();
        }
        this.f6491t = new C2743c();
        m11620l();
    }

    private void m11620l() {
        this.f6486o.setOnClickListener(new C25373(this));
    }

    private void m11621m() {
        long currentPosition = (long) this.f6489r.getCurrentPosition();
        this.f6487p.setProgress(this.f6491t.m12243a(currentPosition, (long) this.f6489r.getDuration()));
    }

    public void controlClick(View view) {
        switch (view.getId()) {
            case C1142R.id.bt_expand:
                Snackbar.m1021a(this.f6484m, "Expand", -1).m1012a();
                return;
            default:
                return;
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1142R.layout.activity_player_music_album_grid);
        m11618j();
        m11619k();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C1142R.menu.menu_search, menu);
        return true;
    }

    public void onDestroy() {
        super.onDestroy();
        this.f6490s.removeCallbacks(this.f6492u);
        this.f6489r.release();
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
