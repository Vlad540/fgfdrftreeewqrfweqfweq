package defpackage;

import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Parcel;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: s38  reason: default package */
public final class s38 extends MediaController.Callback {
    public final WeakReference a;

    public s38(s48 s48) {
        this.a = new WeakReference(s48);
    }

    public final void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
        s48 s48 = (s48) this.a.get();
        if (s48 != null && playbackInfo != null) {
            s48.a(new w38(playbackInfo.getPlaybackType(), new m20(new l20(playbackInfo.getAudioAttributes())), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume()));
        }
    }

    public final void onExtrasChanged(Bundle bundle) {
        vc8.a(bundle);
        s48 s48 = (s48) this.a.get();
        if (s48 != null) {
            s48.c(bundle);
        }
    }

    public final void onMetadataChanged(MediaMetadata mediaMetadata) {
        a88 a88;
        s48 s48 = (s48) this.a.get();
        if (s48 != null) {
            yr yrVar = a88.c;
            if (mediaMetadata != null) {
                Parcel obtain = Parcel.obtain();
                mediaMetadata.writeToParcel(obtain, 0);
                obtain.setDataPosition(0);
                a88 = a88.CREATOR.createFromParcel(obtain);
                obtain.recycle();
                a88.b = mediaMetadata;
            } else {
                a88 = null;
            }
            s48.d(a88);
        }
    }

    public final void onPlaybackStateChanged(PlaybackState playbackState) {
        s48 s48 = (s48) this.a.get();
        if (s48 != null && s48.c == null) {
            s48.e(cya.a(playbackState));
        }
    }

    public final void onQueueChanged(List list) {
        s48 s48 = (s48) this.a.get();
        if (s48 != null) {
            s48.f(sc8.a(list));
        }
    }

    public final void onQueueTitleChanged(CharSequence charSequence) {
        s48 s48 = (s48) this.a.get();
        if (s48 != null) {
            s48.g(charSequence);
        }
    }

    public final void onSessionDestroyed() {
        s48 s48 = (s48) this.a.get();
        if (s48 != null) {
            s48.e.b.release();
        }
    }

    public final void onSessionEvent(String str, Bundle bundle) {
        vc8.a(bundle);
        s48 s48 = (s48) this.a.get();
        if (s48 != null) {
            s48.h(str, bundle);
        }
    }
}
