package android.sabbir.com.modernlibrarys.test.material.components.activity.player;

import android.app.Activity;
import android.content.res.AssetFileDescriptor;
import android.graphics.PorterDuff.Mode;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.C0818e;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import butterknife.C1142R;
import com.material.components.p089f.C2743c;
import com.material.components.p089f.C2746d;

public class PlayerMusicAlbumSimple extends C0818e {
    private View f6496m;
    private FloatingActionButton f6497n;
    private ProgressBar f6498o;
    private MediaPlayer f6499p;
    private Handler f6500q = new Handler();
    private C2743c f6501r;
    private Runnable f6502s = new C25413(this);

    class C25391 implements OnCompletionListener {
        final /* synthetic */ PlayerMusicAlbumSimple f6493a;

        C25391(PlayerMusicAlbumSimple playerMusicAlbumSimple) {
            this.f6493a = playerMusicAlbumSimple;
        }

        public void onCompletion(MediaPlayer mediaPlayer) {
            this.f6493a.f6497n.setImageResource(C1142R.drawable.ic_play_arrow);
        }
    }

    class C25402 implements OnClickListener {
        final /* synthetic */ PlayerMusicAlbumSimple f6494a;

        C25402(PlayerMusicAlbumSimple playerMusicAlbumSimple) {
            this.f6494a = playerMusicAlbumSimple;
        }

        public void onClick(View view) {
            if (this.f6494a.f6499p.isPlaying()) {
                this.f6494a.f6499p.pause();
                this.f6494a.f6497n.setImageResource(C1142R.drawable.ic_play_arrow);
                return;
            }
            this.f6494a.f6499p.start();
            this.f6494a.f6497n.setImageResource(C1142R.drawable.ic_pause);
            this.f6494a.f6500q.post(this.f6494a.f6502s);
        }
    }

    class C25413 implements Runnable {
        final /* synthetic */ PlayerMusicAlbumSimple f6495a;

        C25413(PlayerMusicAlbumSimple playerMusicAlbumSimple) {
            this.f6495a = playerMusicAlbumSimple;
        }

        public void run() {
            this.f6495a.m11631m();
            if (this.f6495a.f6499p.isPlaying()) {
                this.f6495a.f6500q.postDelayed(this, 100);
            }
        }
    }

    private boolean m11623a(ImageButton imageButton) {
        if (((String) imageButton.getTag(imageButton.getId())) != null) {
            imageButton.setColorFilter(getResources().getColor(C1142R.color.red_500), Mode.SRC_ATOP);
            imageButton.setTag(imageButton.getId(), null);
            return false;
        }
        imageButton.setTag(imageButton.getId(), "selected");
        imageButton.setColorFilter(getResources().getColor(C1142R.color.red_500), Mode.SRC_ATOP);
        return true;
    }

    private void m11628j() {
        Toolbar toolbar = (Toolbar) findViewById(C1142R.id.toolbar);
        toolbar.setNavigationIcon((int) C1142R.drawable.ic_menu);
        toolbar.getNavigationIcon().setColorFilter(getResources().getColor(C1142R.color.colorPrimary), Mode.SRC_ATOP);
        m4362a(toolbar);
        m4370f().mo761a(true);
        m4370f().mo760a(null);
        C2746d.m12253a((Activity) this, (int) C1142R.color.grey_20);
    }

    private void m11629k() {
        this.f6496m = findViewById(C1142R.id.parent_view);
        this.f6497n = (FloatingActionButton) findViewById(C1142R.id.bt_play);
        this.f6498o = (ProgressBar) findViewById(C1142R.id.song_progressbar);
        this.f6498o.setProgress(0);
        this.f6498o.setMax(10000);
        this.f6499p = new MediaPlayer();
        this.f6499p.setOnCompletionListener(new C25391(this));
        try {
            this.f6499p.setAudioStreamType(3);
            AssetFileDescriptor openFd = getAssets().openFd("short_music.mp3");
            this.f6499p.setDataSource(openFd.getFileDescriptor(), openFd.getStartOffset(), openFd.getLength());
            openFd.close();
            this.f6499p.prepare();
        } catch (Exception e) {
            Snackbar.m1021a(this.f6496m, "Cannot load audio file", -1).m1012a();
        }
        this.f6501r = new C2743c();
        m11630l();
    }

    private void m11630l() {
        this.f6497n.setOnClickListener(new C25402(this));
    }

    private void m11631m() {
        long currentPosition = (long) this.f6499p.getCurrentPosition();
        this.f6498o.setProgress(this.f6501r.m12243a(currentPosition, (long) this.f6499p.getDuration()));
    }

    public void controlClick(View view) {
        switch (view.getId()) {
            case C1142R.id.bt_prev:
                m11623a((ImageButton) view);
                Snackbar.m1021a(this.f6496m, "Previous", -1).m1012a();
                return;
            case C1142R.id.bt_next:
                m11623a((ImageButton) view);
                Snackbar.m1021a(this.f6496m, "Next", -1).m1012a();
                return;
            default:
                return;
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1142R.layout.activity_player_music_album_simple);
        m11628j();
        m11629k();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C1142R.menu.menu_setting_round, menu);
        C2746d.m12257a(menu, getResources().getColor(C1142R.color.colorPrimary));
        return true;
    }

    public void onDestroy() {
        super.onDestroy();
        this.f6500q.removeCallbacks(this.f6502s);
        this.f6499p.release();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            finish();
        } else {
            Snackbar.m1021a(this.f6496m, menuItem.getTitle(), -1).m1012a();
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
