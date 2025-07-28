package defpackage;

import java.io.IOException;
import java.net.SocketTimeoutException;

/* renamed from: wk6  reason: default package */
public final class wk6 extends rde {
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ long f;
    public final /* synthetic */ Object g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wk6(String str, long j, k1c k1c) {
        super(str, true);
        this.f = j;
        this.g = k1c;
    }

    public final long a() {
        gl6 gl6;
        boolean z;
        switch (this.e) {
            case 0:
                synchronized (((gl6) this.g)) {
                    gl6 = (gl6) this.g;
                    long j = gl6.C0;
                    long j2 = gl6.B0;
                    if (j < j2) {
                        z = true;
                    } else {
                        gl6.B0 = j2 + 1;
                        z = false;
                    }
                }
                if (z) {
                    gl6.a(2, 2, (IOException) null);
                    return -1;
                }
                try {
                    gl6.N0.n(1, 0, false);
                } catch (IOException e2) {
                    gl6.a(2, 2, e2);
                }
                return this.f;
            default:
                k1c k1c = (k1c) this.g;
                synchronized (k1c) {
                    try {
                        if (!k1c.o) {
                            ppf ppf = k1c.e;
                            if (ppf != null) {
                                int i = k1c.q ? k1c.p : -1;
                                k1c.p++;
                                k1c.q = true;
                                if (i != -1) {
                                    StringBuilder sb = new StringBuilder("sent ping but didn't receive pong within ");
                                    sb.append(k1c.u);
                                    sb.append("ms (after ");
                                    k1c.c(new SocketTimeoutException(wn6.j(sb, i - 1, " successful ping/pongs)")));
                                } else {
                                    try {
                                        ppf.a(9, uu0.o);
                                    } catch (IOException e3) {
                                        k1c.c(e3);
                                    }
                                }
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return this.f;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wk6(String str, gl6 gl6, long j) {
        super(str, true);
        this.g = gl6;
        this.f = j;
    }
}
