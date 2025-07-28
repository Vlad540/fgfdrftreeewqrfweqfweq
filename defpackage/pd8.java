package defpackage;

import android.media.session.MediaSessionManager;
import android.text.TextUtils;

/* renamed from: pd8  reason: default package */
public final class pd8 {
    public final nd8 a;

    public pd8(String str, int i, int i2) {
        if (str == null) {
            throw new NullPointerException("package shouldn't be null");
        } else if (!TextUtils.isEmpty(str)) {
            nd8 nd8 = new nd8(str, i, i2);
            new MediaSessionManager.RemoteUserInfo(str, i, i2);
            this.a = nd8;
        } else {
            throw new IllegalArgumentException("packageName should be nonempty");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pd8)) {
            return false;
        }
        return this.a.equals(((pd8) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public pd8(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        String packageName = remoteUserInfo.getPackageName();
        if (packageName == null) {
            throw new NullPointerException("package shouldn't be null");
        } else if (!TextUtils.isEmpty(packageName)) {
            this.a = new nd8(remoteUserInfo.getPackageName(), remoteUserInfo.getPid(), remoteUserInfo.getUid());
        } else {
            throw new IllegalArgumentException("packageName should be nonempty");
        }
    }
}
