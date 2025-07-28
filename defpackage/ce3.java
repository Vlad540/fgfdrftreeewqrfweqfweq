package defpackage;

import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* renamed from: ce3  reason: default package */
public final class ce3 implements ed4 {
    public final boolean a(SSLSocket sSLSocket) {
        boolean z = be3.d;
        return zd3.b() && Conscrypt.isConscrypt(sSLSocket);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [jld, java.lang.Object] */
    public final jld b(SSLSocket sSLSocket) {
        return new Object();
    }
}
