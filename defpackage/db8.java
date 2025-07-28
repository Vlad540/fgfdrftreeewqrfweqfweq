package defpackage;

import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaControllerCompat;

/* renamed from: db8  reason: default package */
public final class db8 extends MediaControllerCompat.Callback {
    public final /* synthetic */ jb8 a;

    public db8(jb8 jb8) {
        this.a = jb8;
    }

    public final void onMetadataChanged(MediaMetadataCompat mediaMetadataCompat) {
        MediaDescriptionCompat description = mediaMetadataCompat == null ? null : mediaMetadataCompat.getDescription();
        jb8 jb8 = this.a;
        jb8.a1 = description;
        jb8.h();
        jb8.l();
    }

    public final void onSessionDestroyed() {
        jb8 jb8 = this.a;
        MediaControllerCompat mediaControllerCompat = jb8.Y0;
        if (mediaControllerCompat != null) {
            mediaControllerCompat.unregisterCallback(jb8.Z0);
            jb8.Y0 = null;
        }
    }
}
