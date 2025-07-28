package defpackage;

import java.util.List;
import javax.net.ssl.SSLSocket;
import me.leolin.shortcutbadger.BuildConfig;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

/* renamed from: lq0  reason: default package */
public final class lq0 implements jld {
    public static final kq0 a = new Object();

    public final boolean a(SSLSocket sSLSocket) {
        return false;
    }

    public final boolean b() {
        boolean z = jq0.d;
        return jq0.d;
    }

    public final String c(SSLSocket sSLSocket) {
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol != null && (applicationProtocol.hashCode() != 0 || !applicationProtocol.equals(BuildConfig.FLAVOR))) {
            return applicationProtocol;
        }
        return null;
    }

    public final void d(SSLSocket sSLSocket, String str, List list) {
        if (a(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            kxa kxa = kxa.a;
            Object[] array = oa2.y(list).toArray(new String[0]);
            if (array != null) {
                parameters.setApplicationProtocols((String[]) array);
                bCSSLSocket.setParameters(parameters);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
    }
}
