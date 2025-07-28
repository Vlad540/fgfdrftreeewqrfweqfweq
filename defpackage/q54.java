package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.net.SocketFactory;

/* renamed from: q54  reason: default package */
public final class q54 extends yg0 {
    public volatile List j = new ArrayList();
    public int k = 0;
    public final AtomicBoolean l = new AtomicBoolean();

    public q54(it4 it4, String str, String str2, und und, yd3 yd3, qmc qmc) {
        super(it4, new cd3(str, str2, true), und, yd3);
        s();
    }

    public final void close() {
    }

    public final Socket connect() {
        try {
            Socket connect = super.connect();
            this.k = 0;
            return connect;
        } catch (Exception e) {
            synchronized (this) {
                this.k = (this.k + 1) % this.j.size();
                throw e;
            }
        }
    }

    public final int d() {
        return ((Number) r().d.getValue()).intValue();
    }

    public final void g(boolean z) {
        this.l.set(z);
    }

    public final String i() {
        return r().a;
    }

    public final int j() {
        return 15000;
    }

    public final Socket m(SocketFactory socketFactory, String str, int i) {
        udd.q("q54", "createConnection");
        int i2 = 3000;
        while (this.l.get()) {
            Socket n = yg0.n(socketFactory);
            udd.p("q54", "try to connect socket, timeout=%dms, max=%dms ...", new Object[]{Integer.valueOf(i2), 15000});
            long currentTimeMillis = System.currentTimeMillis();
            try {
                l(n, str, i, i2);
                return n;
            } catch (ConnectException | SocketTimeoutException e) {
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                yg0.q(n);
                if (i2 < 15000) {
                    udd.R("q54", e, "socket failed to connect, after=%dms (timeout=%dms), try again ...", new Object[]{Long.valueOf(currentTimeMillis2), Integer.valueOf(i2)});
                    i2 += 1000;
                } else {
                    throw e;
                }
            } catch (IOException e2) {
                yg0.q(n);
                throw e2;
            } catch (Throwable th) {
                yg0.q(n);
                throw new IOException("Failed to create connection", th);
            }
        }
        throw new InterruptedIOException("Socket connection canceled");
    }

    public final synchronized cd3 r() {
        return (cd3) this.j.get(this.k);
    }

    public final synchronized void s() {
        List list;
        try {
            this.j.clear();
            cd3 r = hhd.r(this.a);
            if (r != null) {
                udd.p("q54", "default host = %s", new Object[]{r.toString()});
                this.j.add(r);
            }
            ((rf4) this.a.a).e();
            this.j.addAll(hhd.v(this.a));
            this.j.add(this.f);
            List list2 = this.j;
            if (list2.size() <= 1) {
                list = Collections.unmodifiableList(list2);
            } else {
                ArrayList arrayList = new ArrayList();
                for (Object next : list2) {
                    if (!arrayList.contains(next)) {
                        arrayList.add(next);
                    }
                }
                list = arrayList;
            }
            this.j = list;
            this.k = 0;
        } finally {
            while (true) {
            }
        }
    }
}
