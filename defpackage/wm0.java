package defpackage;

import android.net.Uri;

/* renamed from: wm0  reason: default package */
public interface wm0 {
    ch7 c(Uri uri);

    ch7 h(z78 z78) {
        byte[] bArr = z78.k;
        if (bArr != null) {
            return n(bArr);
        }
        Uri uri = z78.m;
        if (uri != null) {
            return c(uri);
        }
        return null;
    }

    ch7 n(byte[] bArr);
}
