package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* renamed from: fe  reason: default package */
public class fe implements jld {
    public static final ee f = new ee();
    public final Method a;
    public final Method b;
    public final Method c;
    public final Method d;
    public final Class e;

    public fe(Class cls) {
        this.e = cls;
        this.a = cls.getDeclaredMethod("setUseSessionTickets", new Class[]{Boolean.TYPE});
        this.b = cls.getMethod("setHostname", new Class[]{String.class});
        this.c = cls.getMethod("getAlpnSelectedProtocol", (Class[]) null);
        this.d = cls.getMethod("setAlpnProtocols", new Class[]{byte[].class});
    }

    public final boolean a(SSLSocket sSLSocket) {
        return this.e.isInstance(sSLSocket);
    }

    public final boolean b() {
        boolean z = yd.e;
        return yd.e;
    }

    public final String c(SSLSocket sSLSocket) {
        if (!this.e.isInstance(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.c.invoke(sSLSocket, (Object[]) null);
            if (bArr != null) {
                return new String(bArr, StandardCharsets.UTF_8);
            }
            return null;
        } catch (NullPointerException e2) {
            if (hhd.f(e2.getMessage(), "ssl == null")) {
                return null;
            }
            throw e2;
        } catch (IllegalAccessException e3) {
            throw new AssertionError(e3);
        } catch (InvocationTargetException e4) {
            throw new AssertionError(e4);
        }
    }

    public final void d(SSLSocket sSLSocket, String str, List list) {
        if (this.e.isInstance(sSLSocket)) {
            try {
                this.a.invoke(sSLSocket, new Object[]{Boolean.TRUE});
                if (str != null) {
                    this.b.invoke(sSLSocket, new Object[]{str});
                }
                Method method = this.d;
                kxa kxa = kxa.a;
                method.invoke(sSLSocket, new Object[]{oa2.z(list)});
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            } catch (InvocationTargetException e3) {
                throw new AssertionError(e3);
            }
        }
    }
}
