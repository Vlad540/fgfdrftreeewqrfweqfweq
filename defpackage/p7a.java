package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: p7a  reason: default package */
public final class p7a {
    public final t97 a;
    public final t97 b;
    public final t97 c;
    public final t97 d;

    public p7a(t97 t97, t97 t972, t97 t973, t97 t974) {
        this.a = t97;
        this.b = t972;
        this.c = t973;
        this.d = t974;
    }

    public final void a(long j) {
        m14 b2 = b();
        b2.getClass();
        String str = m14.k;
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            fn6.d(tn7.X, str, us8.i(j, "cancelServerChatId "), (Throwable) null);
        }
        b2.c(new f14(j, b2, (Continuation) null));
    }

    public final m14 b() {
        return (m14) this.d.getValue();
    }

    public final void c() {
        m14 b2 = b();
        b2.getClass();
        String str = m14.k;
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            fn6.d(tn7.X, str, "notifyAllChats", (Throwable) null);
        }
        b2.c(new e14(b2, (Continuation) null, 3));
        h();
    }

    public final void d(long j) {
        m14 b2 = b();
        b2.getClass();
        String str = m14.k;
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            fn6.d(tn7.X, str, us8.i(j, "notify #"), (Throwable) null);
        }
        b2.c(new e14(b2, (Continuation) null, 1));
        h();
    }

    public final void e(zb9 zb9) {
        m14 b2 = b();
        b2.getClass();
        if (!zb9.i()) {
            String str = m14.k;
            fn6 fn6 = udd.e;
            if (fn6 != null && fn6.c()) {
                fn6.d(tn7.X, str, "notifyLocalChats", (Throwable) null);
            }
            b2.c(new e14(b2, (Continuation) null, 2));
        }
        h();
    }

    public final void f(long j) {
        m14 b2 = b();
        b2.getClass();
        String str = m14.k;
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            fn6.d(tn7.X, str, us8.i(j, "notifyServerChatIds #"), (Throwable) null);
        }
        b2.c(new f14(b2, j, (Continuation) null));
        h();
    }

    public final void g(zb9 zb9) {
        m14 b2 = b();
        b2.getClass();
        String str = m14.k;
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            fn6.d(tn7.X, str, "notifyServerChatIds ".concat(zb9.k(zb9, (String) null, (String) null, 31)), (Throwable) null);
        }
        if (!zb9.i()) {
            b2.c(new k14(b2, zb9, (Continuation) null, 0));
        }
        h();
    }

    public final void h() {
        ((ydd) this.c.getValue()).d();
    }
}
