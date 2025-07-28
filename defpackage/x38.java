package defpackage;

import android.media.session.MediaController;
import android.os.Bundle;
import android.support.v4.media.session.MediaSessionCompat;

/* renamed from: x38  reason: default package */
public abstract class x38 extends xs7 {
    public final MediaController.TransportControls E;

    public x38(MediaController.TransportControls transportControls) {
        this.E = transportControls;
    }

    public final void V(String str, Bundle bundle) {
        if (str != null && ((str.equals(MediaSessionCompat.ACTION_FOLLOW) || str.equals(MediaSessionCompat.ACTION_UNFOLLOW)) && (bundle == null || !bundle.containsKey(MediaSessionCompat.ARGUMENT_MEDIA_ATTRIBUTE)))) {
            throw new IllegalArgumentException(wn6.i("An extra field android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE is required for this action ", str, "."));
        }
        this.E.sendCustomAction(str, bundle);
    }
}
