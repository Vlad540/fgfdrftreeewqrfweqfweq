package defpackage;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import javax.net.ssl.SSLHandshakeException;
import ru.ok.tamtam.ExceptionHandler$HandledException;
import ru.ok.tamtam.api.SessionSendLimitException;

/* renamed from: u1d  reason: default package */
public final class u1d {
    public static final AtomicInteger D = new AtomicInteger(0);
    public boolean A;
    public final i0a B;
    public final k3d C;
    public final String a;
    public final AtomicInteger b = new AtomicInteger(0);
    public final AtomicInteger c = new AtomicInteger(0);
    public final AtomicLong d = new AtomicLong(0);
    public final AtomicBoolean e = new AtomicBoolean(false);
    public final AtomicInteger f = new AtomicInteger(0);
    public final AtomicBoolean g = new AtomicBoolean(false);
    public final AtomicInteger h = new AtomicInteger(0);
    public final AtomicLong i = new AtomicLong(0);
    public final int j;
    public final AtomicBoolean k = new AtomicBoolean(false);
    public final AtomicBoolean l = new AtomicBoolean(false);
    public final zz2 m;
    public final ypc n;
    public final yz9 o;
    public Socket p;
    public DataOutputStream q;
    public DataInputStream r;
    public final kd3 s;
    public final wl9 t;
    public final ConcurrentHashMap u = new ConcurrentHashMap();
    public final List v;
    public final Object w = new Object();
    public final djb x;
    public final AtomicInteger y = new AtomicInteger();
    public final int z;

    public u1d(sf8 sf8) {
        this.n = (ypc) sf8.d;
        this.o = (yz9) sf8.g;
        int incrementAndGet = D.incrementAndGet();
        this.j = incrementAndGet;
        String h2 = wn6.h(incrementAndGet, "TTSession#");
        this.a = h2;
        this.m = (zz2) sf8.b;
        this.s = (kd3) sf8.f;
        this.t = (wl9) sf8.e;
        this.B = (i0a) sf8.h;
        int max = Math.max(0, sf8.a);
        this.z = max;
        udd.p(h2, "init, sendLimitIfNoSession=%d", new Object[]{Integer.valueOf(max)});
        this.x = new djb();
        k3d k3d = (k3d) sf8.c;
        this.C = k3d;
        u1d u1d = (u1d) sf8.i;
        if (u1d != null) {
            fn6 fn6 = udd.e;
            if (fn6 != null && fn6.c()) {
                tn7 tn7 = tn7.X;
                fn6.d(tn7, h2, "init, has parent_session=" + u1d + ", take its sender_tasks ...", (Throwable) null);
            }
            synchronized (u1d.w) {
                this.v = u1d.v;
                u1d.v = new ArrayList();
            }
            fn6 fn62 = udd.e;
            if (fn62 != null && fn62.c()) {
                tn7 tn72 = tn7.X;
                fn62.d(tn72, h2, "init, parent_session=" + u1d + " tasks was imported to " + this, (Throwable) null);
            }
        } else {
            this.v = new ArrayList();
        }
        k3d.a("session-conn-handler", new r1d(this)).start();
    }

    public static boolean a(u1d u1d, nia nia, Class cls) {
        u1d.getClass();
        mia mia = nia.b;
        if (mia == null || !cls.isInstance(mia.a)) {
            throw new IllegalStateException("wrong usage of method 'containsInPacketReader'");
        }
        for (Map.Entry value : u1d.u.entrySet()) {
            mia mia2 = ((lia) value.getValue()).b.b;
            if (mia2 != null && cls.isInstance(mia2.a)) {
                return true;
            }
        }
        return false;
    }

    public static void b(u1d u1d, kia kia) {
        synchronized (u1d.w) {
            List list = u1d.v;
            int i2 = m77.a;
            int i3 = zp4.o;
            list.add(new nia(2, (mia) null, mt0.Q(System.currentTimeMillis(), eq4.c), kia));
        }
    }

    public final void c(long j2) {
        udd.p(this.a, "cancel: %d", new Object[]{Long.valueOf(j2)});
        synchronized (this.w) {
            try {
                Iterator it = this.v.iterator();
                while (true) {
                    if (it.hasNext()) {
                        nia nia = (nia) it.next();
                        mia mia = nia.b;
                        if (mia != null && mia.c.f() == j2) {
                            this.v.remove(nia);
                            break;
                        }
                    } else {
                        break;
                    }
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        for (Map.Entry entry : this.u.entrySet()) {
            if (((lia) entry.getValue()).a.f() == j2) {
                this.u.remove(entry.getKey());
                return;
            }
        }
    }

    public final void d(boolean z2) {
        n(false);
        this.f.set(1);
        this.x.a();
        if (e()) {
            f(true, z2);
        }
        this.m.close();
        udd.q(this.a, "close, " + this + " closed");
    }

    public final boolean e() {
        Socket socket = this.p;
        if (socket == null || socket.isClosed()) {
            return false;
        }
        String str = this.a;
        udd.q(str, "closeSocket");
        try {
            this.p.close();
        } catch (Exception e2) {
            udd.s(str, "failed to close socket", e2);
            l(e2);
        }
        try {
            this.m.c(this.p);
        } catch (Exception e3) {
            udd.s(str, "failed to remove traffic stat from closed socket", e3);
        }
        DataInputStream dataInputStream = this.r;
        if (dataInputStream != null) {
            try {
                dataInputStream.close();
            } catch (SocketException unused) {
            } catch (Throwable th) {
                udd.S(str, "fail to close " + dataInputStream, th);
            }
        }
        DataOutputStream dataOutputStream = this.q;
        if (dataOutputStream == null) {
            return true;
        }
        try {
            dataOutputStream.close();
            return true;
        } catch (SocketException unused2) {
            return true;
        } catch (Throwable th2) {
            udd.S(str, "fail to close " + dataOutputStream, th2);
            return true;
        }
    }

    public final void f(boolean z2, boolean z3) {
        udd.p(this.a, "disconnect: clearSenderTasks %b", new Object[]{Boolean.valueOf(z2)});
        m(0);
        this.g.set(false);
        if (!this.l.get()) {
            k();
        }
        lae lae = new lae();
        for (Map.Entry value : this.u.entrySet()) {
            ((lia) value.getValue()).a.d(lae);
        }
        this.u.clear();
        if (z2) {
            synchronized (this.w) {
                try {
                    for (nia nia : this.v) {
                        mia mia = nia.b;
                        if (mia != null && !z3) {
                            mia.c.d(new lae());
                        }
                    }
                    this.v.clear();
                } finally {
                }
            }
        }
    }

    public final void g(ibe ibe, boolean z2, long j2, iae iae) {
        ibe ibe2;
        j(cn7.QUEUE, iae.f(), 0, ibe.N(), true, ete.S((HashMap) ibe.b));
        if (ibe instanceof kp7) {
            this.u.clear();
            synchronized (this.w) {
                this.v.clear();
            }
        }
        if (ibe.w()) {
            synchronized (this.w) {
                try {
                    ArrayList<Long> arrayList = null;
                    for (nia nia : this.v) {
                        mia mia = nia.b;
                        if (mia != null && (ibe2 = mia.a) != null && ibe2.N() == ibe.N() && nia.b.a.O() == ibe.O()) {
                            if (arrayList == null) {
                                arrayList = new ArrayList<>();
                            }
                            arrayList.add(Long.valueOf(nia.b.c.f()));
                            udd.p(this.a, "cancel duplicated task: %s", new Object[]{dfa.b(nia.b.a.N())});
                        }
                    }
                    if (arrayList != null) {
                        for (Long longValue : arrayList) {
                            c(longValue.longValue());
                        }
                    }
                } finally {
                }
            }
        }
        synchronized (this.w) {
            List list = this.v;
            mia mia2 = new mia(ibe, z2, iae);
            int i2 = zp4.o;
            list.add(new nia(1, mia2, mt0.Q(j2, eq4.c), (kia) null));
        }
    }

    public final boolean h() {
        return this.c.get() == 0;
    }

    public final boolean i() {
        return this.f.get() == 0 && !this.l.get();
    }

    public final void j(cn7 cn7, long j2, short s2, short s3, boolean z2, String str) {
        dfa.c.getClass();
        String l2 = jk9.l(s3);
        String str2 = dfa.b(s3) + "(" + l2 + ")";
        StringBuilder sb = new StringBuilder();
        sb.append(z2 ? "->" : "<-");
        sb.append(' ');
        sb.append(cn7.b);
        sb.append(" [");
        sb.append(j2);
        sb.append(',');
        sb.append(s2);
        sb.append("] ");
        sb.append(str2);
        sb.append(' ');
        if (str == null) {
            str = "";
        }
        sb.append(str);
        String sb2 = sb.toString();
        udd.K(cn7.a, this.a, sb2, new Object[0]);
        if (cn7 == cn7.ERROR) {
            l(new IllegalStateException(me4.i(str2, ": ", sb2)));
        }
    }

    public final void k() {
        if (i()) {
            h3d h3d = (h3d) this.s;
            h3d.i = 0;
            h3d.b();
        }
    }

    public final void l(Exception exc) {
        String message;
        if (i()) {
            h3d h3d = (h3d) this.s;
            h3d.getClass();
            boolean z2 = exc instanceof SessionSendLimitException;
            r4a r4a = h3d.b;
            if (z2) {
                r4a.a(new ExceptionHandler$HandledException((String) null, ((SessionSendLimitException) exc).c, exc));
                return;
            }
            boolean z3 = exc instanceof IOException;
            t97 t97 = h3d.c;
            if (!z3 && !(exc instanceof SecurityException)) {
                r4a.c(exc, true);
                ((rf4) t97.getValue()).getClass();
            }
            if ((exc instanceof SSLHandshakeException) && ((rf4) t97.getValue()).d() && (message = exc.getMessage()) != null) {
                if ((message.contains("current time") && message.contains("validation time")) || message.contains("not valid until")) {
                    ((rf4) t97.getValue()).getClass();
                }
            }
        }
    }

    public final void m(int i2) {
        String str = this.a;
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            fn6.d(tn7.X, str, "setConnectionsStatus ".concat(i2 != 0 ? i2 != 1 ? i2 != 2 ? "" : "CONNECTION_STATUS_LOGGED_IN" : "CONNECTION_STATUS_CONNECTED" : "CONNECTION_STATUS_DISCONNECTED"), (Throwable) null);
        }
        this.c.set(i2);
        this.x.a();
    }

    public final void n(boolean z2) {
        String str = this.a;
        udd.p(str, "setTryToConnect, tryToConnect=%b", new Object[]{Boolean.valueOf(z2)});
        AtomicBoolean atomicBoolean = this.e;
        if (atomicBoolean.compareAndSet(!z2, z2) && z2) {
            this.y.set(0);
            udd.q(str, "setTryToConnect, reset counter of failed attempts to connect");
        }
        atomicBoolean.set(z2);
        this.m.g(z2);
        this.x.a();
    }

    public final void o(Exception exc) {
        long j2;
        String str = this.a;
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            tn7 tn7 = tn7.X;
            Locale locale = Locale.US;
            int i2 = this.h.get();
            long j3 = this.i.get();
            fn6.d(tn7, str, "updateConnTimeoutAfterFail, curr_conn_errors=" + i2 + ", curr_next_conn_epoch=" + j3 + "ms", (Throwable) null);
        }
        AtomicInteger atomicInteger = this.y;
        atomicInteger.incrementAndGet();
        AtomicBoolean atomicBoolean = this.e;
        boolean z2 = atomicBoolean.get();
        AtomicInteger atomicInteger2 = this.h;
        if (!z2 || atomicInteger.get() >= 10) {
            atomicInteger2.incrementAndGet();
            j2 = this.m.h(atomicInteger2.get());
        } else {
            j2 = 1000;
        }
        AtomicLong atomicLong = this.i;
        atomicLong.set(TimeUnit.MILLISECONDS.convert(System.nanoTime(), TimeUnit.NANOSECONDS) + j2);
        udd.u(str, exc, "updateConnTimeoutAfterFail, try_to_connect=%b, fa=%d, conn_errors=%d, next_conn_epoch=%d, delay=%dms", new Object[]{Boolean.valueOf(atomicBoolean.get()), Integer.valueOf(atomicInteger.get()), Integer.valueOf(atomicInteger2.get()), Long.valueOf(atomicLong.get()), Long.valueOf(j2)});
    }

    public final String toString() {
        int size = this.v.size();
        StringBuilder sb = new StringBuilder(96);
        sb.append("Session@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append("(");
        int i2 = this.f.get();
        String str = "<UNKNOWN>";
        sb.append(i2 != 0 ? i2 != 1 ? str : "CLOSED" : "OPEN");
        sb.append('|');
        int i3 = this.c.get();
        if (i3 == 0) {
            str = "DISCONNECTED";
        } else if (i3 == 1) {
            str = "CONNECTED";
        } else if (i3 == 2) {
            str = "LOGGED_IN";
        }
        sb.append(str);
        sb.append("|conn=");
        sb.append(this.k.get());
        sb.append("|des=");
        sb.append(this.l.get());
        sb.append("|st=");
        sb.append(size);
        sb.append(')');
        return sb.toString();
    }
}
