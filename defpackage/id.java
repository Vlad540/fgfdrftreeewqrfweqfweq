package defpackage;

import android.net.http.X509TrustManagerExtensions;
import android.security.NetworkSecurityPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* renamed from: id  reason: default package */
public final class id extends kxa {
    public static final boolean d = oa2.E();
    public final ArrayList c;

    public id() {
        ArrayList X = cs.X(new jld[]{oa2.E() ? new Object() : null, new fd4(fe.f), new fd4(de3.a), new fd4(lq0.a)});
        ArrayList arrayList = new ArrayList();
        Iterator it = X.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((jld) next).b()) {
                arrayList.add(next);
            }
        }
        this.c = arrayList;
    }

    public final n06 b(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        kd kdVar = null;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        if (x509TrustManagerExtensions != null) {
            kdVar = new kd(x509TrustManager, x509TrustManagerExtensions);
        }
        return kdVar != null ? kdVar : super.b(x509TrustManager);
    }

    public final void d(SSLSocket sSLSocket, String str, List list) {
        Object obj;
        Iterator it = this.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((jld) obj).a(sSLSocket)) {
                break;
            }
        }
        jld jld = (jld) obj;
        if (jld != null) {
            jld.d(sSLSocket, str, list);
        }
    }

    public final String f(SSLSocket sSLSocket) {
        Object obj;
        Iterator it = this.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((jld) obj).a(sSLSocket)) {
                break;
            }
        }
        jld jld = (jld) obj;
        if (jld != null) {
            return jld.c(sSLSocket);
        }
        return null;
    }

    public final boolean h(String str) {
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }
}
