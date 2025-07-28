package defpackage;

import android.os.Looper;
import com.google.android.exoplayer2.drm.DrmSession$DrmSessionException;

/* renamed from: io4  reason: default package */
public final class io4 implements mo4 {
    public final yn4 a(eo4 eo4, vu5 vu5) {
        if (vu5.D0 == null) {
            return null;
        }
        return new zz4(new DrmSession$DrmSessionException(new Exception(), 6001));
    }

    public final int b(vu5 vu5) {
        return vu5.D0 != null ? 1 : 0;
    }

    public final void c(Looper looper, bza bza) {
    }
}
