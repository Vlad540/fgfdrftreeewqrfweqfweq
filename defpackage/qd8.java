package defpackage;

import android.media.session.MediaSessionManager;
import android.text.TextUtils;

/* renamed from: qd8  reason: default package */
public final class qd8 {
    public sd8 a;

    public qd8(String str, int i, int i2) {
        if (str == null) {
            throw new NullPointerException("package shouldn't be null");
        } else if (!TextUtils.isEmpty(str)) {
            sd8 sd8 = new sd8(str, i, i2);
            new MediaSessionManager.RemoteUserInfo(str, i, i2);
            this.a = sd8;
        } else {
            throw new IllegalArgumentException("packageName should be nonempty");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qd8)) {
            return false;
        }
        return this.a.equals(((qd8) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
