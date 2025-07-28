package defpackage;

import javax.net.ssl.SSLSocket;

/* renamed from: ee  reason: default package */
public final class ee implements ed4 {
    public final String a;

    public ee(String str) {
        this.a = str;
    }

    public static ee c(yze yze) {
        String str;
        yze.I(2);
        int v = yze.v();
        int i = v >> 1;
        int v2 = ((yze.v() >> 3) & 31) | ((v & 1) << 5);
        if (i == 4 || i == 5 || i == 7) {
            str = "dvhe";
        } else if (i == 8) {
            str = "hev1";
        } else if (i != 9) {
            return null;
        } else {
            str = "avc3";
        }
        String str2 = v2 < 10 ? ".0" : ".";
        StringBuilder sb = new StringBuilder(str2.length() + str.length() + 24);
        sb.append(str);
        sb.append(".0");
        sb.append(i);
        sb.append(str2);
        sb.append(v2);
        return new ee(sb.toString());
    }

    public boolean a(SSLSocket sSLSocket) {
        String name = sSLSocket.getClass().getName();
        return p0e.Q(name, this.a + '.', false);
    }

    public jld b(SSLSocket sSLSocket) {
        Class<?> cls = sSLSocket.getClass();
        Class<?> cls2 = cls;
        while (!cls2.getSimpleName().equals("OpenSSLSocketImpl")) {
            cls2 = cls2.getSuperclass();
            if (cls2 == null) {
                throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
            }
        }
        return new fe(cls2);
    }

    public ee() {
        this.a = "com.google.android.gms.org.conscrypt";
    }
}
