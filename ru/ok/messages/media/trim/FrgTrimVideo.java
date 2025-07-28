package ru.ok.messages.media.trim;

import android.content.res.Configuration;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import ru.ok.messages.views.fragments.base.FrgBase;

public class FrgTrimVideo extends FrgBase {
    public MediaMetadataRetriever F1;
    public de9 G1;
    public Uri H1;

    public final void I0() {
        super.I0();
        de9 de9 = this.G1;
        if (de9 != null) {
            de9.pause();
        }
    }

    public final void M0(Bundle bundle) {
        super.M0(bundle);
        de9 de9 = this.G1;
        if (de9 != null) {
            bundle.putLong("ru.ok.tamtam.extra.POINTER_POSITION", de9.y0);
            bundle.putLong("ru.ok.tamtam.extra.START_POSITION", de9.w0);
            bundle.putLong("ru.ok.tamtam.extra.END_POSITION", de9.x0);
        }
    }

    public final String g1() {
        return "TRIM_VIDEO";
    }

    public final boolean o1() {
        s1();
        return false;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        this.W0 = true;
        de9 de9 = this.G1;
        ((jf9) ((ge9) de9.b)).A(de9.y0, de9.w0, de9.x0, de9.Z);
    }

    public final void s1() {
        MediaMetadataRetriever mediaMetadataRetriever = this.F1;
        if (mediaMetadataRetriever != null) {
            try {
                mediaMetadataRetriever.release();
            } catch (Throwable th) {
                udd.s("ru.ok.messages.media.trim.FrgTrimVideo", "fail to release", th);
            }
            this.F1 = null;
        }
        de9 de9 = this.G1;
        if (de9 != null) {
            ((jf9) ((ge9) de9.b)).x0.b();
            al7 al7 = (al7) de9.Y;
            if (al7.g == de9) {
                al7.t();
                al7.e = null;
                al7.q((Surface) null);
                al7.g = null;
            }
            tic.b(de9.B0);
            de9.B0 = null;
            tic.b(de9.A0);
            de9.A0 = null;
            this.G1 = null;
        }
    }

    public final View y0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2 = bundle;
        this.H1 = (Uri) this.Z.getParcelable("ru.ok.tamtam.extra.VIDEO_URI");
        c0().g0((View.OnSystemUiVisibilityChangeListener) null);
        jf9 jf9 = new jf9(layoutInflater.getContext(), viewGroup, this, new mn(this), this, ((k93) this.t1.b).c());
        jf9 jf92 = jf9;
        String str = "ru.ok.tamtam.extra.END_POSITION";
        de9 de9 = new de9(jf9, this, ((k93) this.t1.b).b(), this.H1.toString(), c0().b(), this.Z.getLong("ru.ok.tamtam.extra.START_POSITION", 0), this.Z.getLong("ru.ok.tamtam.extra.END_POSITION", 0), this.Z.getBoolean("ru.ok.tamtam.extra.MUTE"));
        this.G1 = de9;
        if (bundle2 != null) {
            de9.y0 = bundle2.getLong("ru.ok.tamtam.extra.POINTER_POSITION");
            de9.w0 = bundle2.getLong("ru.ok.tamtam.extra.START_POSITION");
            long j = bundle2.getLong(str);
            de9.x0 = j;
            jf92.A(de9.y0, de9.w0, j, de9.Z);
            de9.c2();
        }
        return (View) jf92.c;
    }

    public final void z0() {
        super.z0();
        s1();
    }
}
