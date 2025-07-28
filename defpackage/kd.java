package defpackage;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;

/* renamed from: kd  reason: default package */
public final class kd extends n06 {
    public final X509TrustManager f;
    public final X509TrustManagerExtensions g;

    public kd(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        this.f = x509TrustManager;
        this.g = x509TrustManagerExtensions;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof kd) && ((kd) obj).f == this.f;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f);
    }

    public final List k(String str, List list) {
        Object[] array = list.toArray(new X509Certificate[0]);
        if (array != null) {
            try {
                return this.g.checkServerTrusted((X509Certificate[]) array, "RSA", str);
            } catch (CertificateException e) {
                SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e.getMessage());
                sSLPeerUnverifiedException.initCause(e);
                throw sSLPeerUnverifiedException;
            }
        } else {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
    }
}
