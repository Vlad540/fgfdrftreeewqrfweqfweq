package ru.ok.messages.media.trim;

import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;

public class ActTrimVideo extends r5 implements r98 {
    public wf8 Y0;
    public q98 Z0;

    public final String Z() {
        return null;
    }

    public final q98 b() {
        if (this.Z0 == null) {
            this.Z0 = ((k93) this.O0.b).k().m(t98.c, new z40(true, false, false));
        }
        return this.Z0;
    }

    public final q98 i() {
        udd.s("ru.ok.messages.media.trim.ActTrimVideo", "Trim is only for video", (Throwable) null);
        s98 k = ((k93) this.O0.b).k();
        t98 t98 = t98.a;
        k.getClass();
        return k.m(t98, new z40(false, false, true));
    }

    public final void onConfigurationChanged(Configuration configuration) {
        ActTrimVideo.super.onConfigurationChanged(configuration);
        at7.Q(new b(6, (Object) this), 300);
    }

    /* JADX WARNING: type inference failed for: r12v0, types: [android.content.Context, androidx.fragment.app.b, r5, ru.ok.messages.media.trim.ActTrimVideo, android.app.Activity] */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().getAttributes().layoutInDisplayCutoutMode = 1;
        this.Z0 = b();
        setContentView(zrb.act_trim_video);
        f0(t().L);
        if (bundle == null) {
            Uri uri = (Uri) getIntent().getParcelableExtra("ru.ok.tamtam.extra.VIDEO_URI");
            long longExtra = getIntent().getLongExtra("ru.ok.tamtam.extra.START_POSITION", 0);
            long longExtra2 = getIntent().getLongExtra("ru.ok.tamtam.extra.END_POSITION", -1);
            boolean booleanExtra = getIntent().getBooleanExtra("ru.ok.tamtam.extra.MUTE", false);
            if (longExtra2 == -1) {
                longExtra2 = x87.U(this, uri);
            }
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("ru.ok.tamtam.extra.VIDEO_URI", uri);
            bundle2.putLong("ru.ok.tamtam.extra.START_POSITION", longExtra);
            bundle2.putLong("ru.ok.tamtam.extra.END_POSITION", longExtra2);
            bundle2.putBoolean("ru.ok.tamtam.extra.MUTE", booleanExtra);
            FrgTrimVideo frgTrimVideo = new FrgTrimVideo();
            frgTrimVideo.Y0(bundle2);
            kjd.c(P(), yqb.act_trim_video__container, frgTrimVideo, "ru.ok.messages.media.trim.FrgTrimVideo");
            return;
        }
        al7 al7 = (al7) this.Z0;
        al7.h = bundle.getFloat(al7.b("MediaPlayerController.Volume"));
        al7.i = bundle.getBoolean(al7.b("MediaPlayerController.Looping"));
        al7.j = bundle.getBoolean(al7.b("MediaPlayerController.PlayWhenReady"));
    }

    public final void onDestroy() {
        super.onDestroy();
        if (this.Z0 != null) {
            ((k93) this.O0.b).k().r(this.Z0);
        }
    }

    public final void onPause() {
        super.onPause();
        if (this.Z0 != null) {
            ((k93) this.O0.b).k().n(this.Z0);
        }
    }

    public final void onResume() {
        super.onResume();
        if (this.Z0 != null) {
            ((k93) this.O0.b).k().k(this.Z0);
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        q98 q98 = this.Z0;
        if (q98 != null) {
            al7 al7 = (al7) q98;
            bundle.putFloat(al7.b("MediaPlayerController.Volume"), al7.h);
            bundle.putBoolean(al7.b("MediaPlayerController.Looping"), al7.i);
            bundle.putBoolean(al7.b("MediaPlayerController.PlayWhenReady"), al7.j);
        }
    }

    public final wce t() {
        if (this.Y0 == null) {
            this.Y0 = wf8.e0;
        }
        return this.Y0;
    }
}
