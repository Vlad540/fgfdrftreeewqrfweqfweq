package defpackage;

import java.util.List;
import javax.net.ssl.SSLSocket;

/* renamed from: fd4  reason: default package */
public final class fd4 implements jld {
    public jld a;
    public final ed4 b;

    public fd4(ed4 ed4) {
        this.b = ed4;
    }

    public final boolean a(SSLSocket sSLSocket) {
        return this.b.a(sSLSocket);
    }

    public final boolean b() {
        return true;
    }

    public final String c(SSLSocket sSLSocket) {
        jld e = e(sSLSocket);
        if (e != null) {
            return e.c(sSLSocket);
        }
        return null;
    }

    public final void d(SSLSocket sSLSocket, String str, List list) {
        jld e = e(sSLSocket);
        if (e != null) {
            e.d(sSLSocket, str, list);
        }
    }

    public final synchronized jld e(SSLSocket sSLSocket) {
        try {
            if (this.a == null && this.b.a(sSLSocket)) {
                this.a = this.b.b(sSLSocket);
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
        return this.a;
    }
}
