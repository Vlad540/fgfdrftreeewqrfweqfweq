package defpackage;

import android.net.Uri;
import androidx.media3.common.ParserException;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.HttpDataSource$CleartextNotPermittedException;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import androidx.media3.exoplayer.upstream.Loader$UnexpectedLoaderException;
import com.google.android.gms.tasks.Task;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.api.http.NoHttpApiEndpointException;

/* renamed from: mk9  reason: default package */
public final class mk9 implements i0b, j26, i13, rl6, x89, bia, cr3 {
    public static final mk9 X = new mk9(4);
    public static final float[] Y = new float[8];
    public static final /* synthetic */ mk9 Z = new mk9(19);
    public static mk9 b;
    public static final mk9 c = new mk9(1);
    public static final mk9 o = new mk9(2);
    public final /* synthetic */ int a;

    public /* synthetic */ mk9(int i) {
        this.a = i;
    }

    public static final boolean c(int i) {
        int i2 = hye.b;
        char c2 = (char) i;
        return ('a' <= c2 && c2 < '{') || ('A' <= c2 && c2 < '[') || (('0' <= c2 && c2 < ':') || c2 == '-' || c2 == '_' || c2 == '.' || c2 == '~');
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x0035  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void d(ru.ok.android.externcalls.analytics.events.EventItemsMap r3, iw1 r4) {
        /*
            java.lang.String r0 = r4.b
            java.lang.String r1 = "local_connection_type"
            r3.set(r1, r0)
            java.lang.String r0 = r4.e
            java.lang.String r1 = "remote_connection_type"
            r3.set(r1, r0)
            java.lang.String r0 = r4.d
            java.lang.String r1 = "local_address"
            r3.set(r1, r0)
            java.lang.String r0 = r4.g
            java.lang.String r1 = "remote_address"
            r3.set(r1, r0)
            r0 = 0
            java.lang.String r1 = r4.h
            if (r1 == 0) goto L_0x003e
            p7c r2 = defpackage.xnc.a     // Catch:{ NumberFormatException -> 0x0032 }
            boolean r2 = r2.a(r1)     // Catch:{ NumberFormatException -> 0x0032 }
            if (r2 == 0) goto L_0x0032
            float r1 = java.lang.Float.parseFloat(r1)     // Catch:{ NumberFormatException -> 0x0032 }
            java.lang.Float r1 = java.lang.Float.valueOf(r1)     // Catch:{ NumberFormatException -> 0x0032 }
            goto L_0x0033
        L_0x0032:
            r1 = r0
        L_0x0033:
            if (r1 == 0) goto L_0x003e
            float r0 = r1.floatValue()
            int r0 = (int) r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x003e:
            java.lang.String r1 = "rtt"
            r3.set(r1, r0)
            java.lang.String r4 = r4.i
            java.lang.String r0 = "transport"
            r3.set(r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mk9.d(ru.ok.android.externcalls.analytics.events.EventItemsMap, iw1):void");
    }

    public static mz e(o10 o10, long j, long j2, Uri uri, boolean z) {
        o10 o102 = o10;
        if (o10.f()) {
            return new mz(o10, o102.b, j, j2, uri);
        } else if (!o10.i()) {
            return null;
        } else {
            n10 n10 = o102.d;
            return new mz(o10, n10, n10.b, j, j2, uri, z);
        }
    }

    public static /* synthetic */ mz g(o10 o10, long j, long j2, boolean z, int i) {
        if ((i & 16) != 0) {
            z = false;
        }
        return e(o10, j, j2, (Uri) null, z);
    }

    public static be5 h(String str, String str2) {
        return new be5(str, 1, str2.getBytes(e22.a));
    }

    public static sz0 i(nv4 nv4, wi7 wi7) {
        int i;
        IOException iOException = wi7.a;
        if (!(iOException instanceof HttpDataSource$InvalidResponseCodeException) || ((i = ((HttpDataSource$InvalidResponseCodeException) iOException).o) != 403 && i != 404 && i != 410 && i != 416 && i != 500 && i != 503)) {
            return null;
        }
        if (nv4.a(1)) {
            return new sz0(1, 3, 300000);
        }
        if (nv4.a(2)) {
            return new sz0(2, 3, 60000);
        }
        return null;
    }

    public static synchronized mk9 j() {
        mk9 mk9;
        synchronized (mk9.class) {
            try {
                if (b == null) {
                    b = new mk9(0);
                }
                mk9 = b;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return mk9;
    }

    public static long m(wi7 wi7) {
        Throwable th = wi7.a;
        if (!(th instanceof ParserException) && !(th instanceof FileNotFoundException) && !(th instanceof HttpDataSource$CleartextNotPermittedException) && !(th instanceof Loader$UnexpectedLoaderException)) {
            int i = DataSourceException.b;
            while (th != null) {
                if (!(th instanceof DataSourceException) || ((DataSourceException) th).a != 2008) {
                    th = th.getCause();
                }
            }
            return (long) Math.min((wi7.b - 1) * 1000, 5000);
        }
        return -9223372036854775807L;
    }

    public double a(double d, double d2, double d3, boolean z) {
        return 1.0d;
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 1:
                qmc qmc = (qmc) obj;
                return (qmc) ((mbe) y93.g.getValue()).e.getValue();
            default:
                List list = (List) obj;
                return list.isEmpty() ? hx7.a : ax7.e(list);
        }
    }

    public void b(double d) {
    }

    public Object f(ws8 ws8) {
        return jjd.M(ws8);
    }

    public int k(int i) {
        return i == 7 ? 6 : 3;
    }

    public /* synthetic */ Object l(Task task) {
        qe4 qe4 = l0g.A0;
        return null;
    }

    public lbe q(ws8 ws8) {
        int i;
        String str;
        if (!ws8.m()) {
            return null;
        }
        try {
            i = jjd.K(ws8);
        } catch (Throwable th) {
            udd.S("ServerPayload/PayloadCatching", "payloadCatching catch error", th);
            Iterator it = uzc.a.iterator();
            while (it.hasNext()) {
                ((ny9) it.next()).getClass();
                ny9.a(th);
            }
            int t = hr1.t(m4b.a);
            if (t == 0) {
                i = 0;
            } else if (t != 1) {
                throw new NoWhenBranchMatchedException();
            } else {
                throw th;
            }
        }
        Long l = null;
        for (int i2 = 0; i2 < i; i2++) {
            try {
                str = jjd.M(ws8);
            } catch (Throwable th2) {
                udd.S("ServerPayload/PayloadCatching", "payloadCatching catch error", th2);
                Iterator it2 = uzc.a.iterator();
                while (it2.hasNext()) {
                    ((ny9) it2.next()).getClass();
                    ny9.a(th2);
                }
                int t2 = hr1.t(m4b.a);
                if (t2 == 0) {
                    str = null;
                } else if (t2 != 1) {
                    throw new NoWhenBranchMatchedException();
                } else {
                    throw th2;
                }
            }
            if (str != null) {
                if (str.equals("timestamp")) {
                    long j = 0;
                    try {
                        j = jjd.J(ws8, 0);
                    } catch (Throwable th3) {
                        udd.S("ServerPayload/PayloadCatching", "payloadCatching catch error", th3);
                        Iterator it3 = uzc.a.iterator();
                        while (it3.hasNext()) {
                            ((ny9) it3.next()).getClass();
                            ny9.a(th3);
                        }
                        int t3 = hr1.t(m4b.a);
                        if (t3 != 0) {
                            if (t3 != 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            throw th3;
                        }
                    }
                    l = Long.valueOf(j);
                } else {
                    try {
                        ws8.z();
                    } catch (Throwable th4) {
                        udd.S("ServerPayload/PayloadCatching", "payloadCatching catch error", th4);
                        Iterator it4 = uzc.a.iterator();
                        while (it4.hasNext()) {
                            ((ny9) it4.next()).getClass();
                            ny9.a(th4);
                        }
                        int t4 = hr1.t(m4b.a);
                        if (t4 != 0) {
                            if (t4 != 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            throw th4;
                        }
                    }
                }
            }
        }
        return new e9c(l);
    }

    public void reset() {
    }

    public Uri u(String str) {
        if (str.equals("api")) {
            Uri uri = sl.a;
            return sl.a;
        }
        throw new NoHttpApiEndpointException(str);
    }
}
