package defpackage;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* renamed from: yd  reason: default package */
public final class yd extends kxa {
    public static final boolean e;
    public final ArrayList c;
    public final it4 d;

    static {
        boolean z = false;
        if (oa2.E() && Build.VERSION.SDK_INT < 30) {
            z = true;
        }
        e = z;
    }

    public yd() {
        fe feVar;
        Method method;
        Method method2;
        Method method3 = null;
        try {
            Class<?> cls = Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketImpl"));
            Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketFactoryImpl"));
            Class.forName("com.android.org.conscrypt".concat(".SSLParametersImpl"));
            feVar = new fe(cls);
        } catch (Exception e2) {
            kxa.a.getClass();
            kxa.i(5, "unable to load android socket classes", e2);
            feVar = null;
        }
        ArrayList X = cs.X(new jld[]{feVar, new fd4(fe.f), new fd4(de3.a), new fd4(lq0.a)});
        ArrayList arrayList = new ArrayList();
        Iterator it = X.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((jld) next).b()) {
                arrayList.add(next);
            }
        }
        this.c = arrayList;
        try {
            Class<?> cls2 = Class.forName("dalvik.system.CloseGuard");
            Method method4 = cls2.getMethod("get", (Class[]) null);
            method = cls2.getMethod("open", new Class[]{String.class});
            method2 = cls2.getMethod("warnIfOpen", (Class[]) null);
            method3 = method4;
        } catch (Exception unused) {
            method2 = null;
            method = null;
        }
        this.d = new it4(method3, method, method2);
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

    public final gse c(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", new Class[]{X509Certificate.class});
            declaredMethod.setAccessible(true);
            return new xd(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.c(x509TrustManager);
        }
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

    public final void e(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        socket.connect(inetSocketAddress, i);
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

    public final Object g() {
        it4 it4 = this.d;
        Method method = (Method) it4.a;
        if (method == null) {
            return null;
        }
        try {
            Object invoke = method.invoke((Object) null, (Object[]) null);
            ((Method) it4.b).invoke(invoke, new Object[]{"response.body().close()"});
            return invoke;
        } catch (Exception unused) {
            return null;
        }
    }

    public final boolean h(String str) {
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    public final void j(Object obj, String str) {
        it4 it4 = this.d;
        it4.getClass();
        if (obj != null) {
            try {
                ((Method) it4.c).invoke(obj, (Object[]) null);
                return;
            } catch (Exception unused) {
            }
        }
        kxa.i(5, str, (Throwable) null);
    }
}
