package defpackage;

import android.os.Looper;
import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;

/* renamed from: jo4  reason: default package */
public final class jo4 implements no4 {
    public final zn4 a(fo4 fo4, xu5 xu5) {
        if (xu5.r == null) {
            return null;
        }
        return new a05(new DrmSession$DrmSessionException(new Exception(), 6001));
    }

    public final void c(Looper looper, cza cza) {
    }

    public final int d(xu5 xu5) {
        return xu5.r != null ? 1 : 0;
    }
}
