package defpackage;

import android.net.Uri;
import java.util.Objects;
import java.util.concurrent.locks.ReentrantLock;
import javax.inject.Provider;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.android.api.core.ApiScopeException;

/* renamed from: te4  reason: default package */
public final class te4 implements uk {
    public final /* synthetic */ int a;
    public final vk b;
    public final t55 c;
    public final Provider d;
    public volatile boolean e;
    public final Object f;
    public final Object g;

    public te4(ql6 ql6, ew ewVar, rl rlVar, Provider provider) {
        this.a = 1;
        this.b = ql6;
        this.c = ewVar;
        this.f = rlVar;
        this.d = provider;
        this.g = new ReentrantLock();
    }

    public final Object a(yk ykVar) {
        ReentrantLock reentrantLock;
        switch (this.a) {
            case 0:
                ppc f2 = this.c.f();
                String str = f2.a.d;
                try {
                    if (this.e || str == null) {
                        synchronized (this.g) {
                            if (this.e || str == null) {
                                c(f2, str);
                            }
                        }
                    }
                    return ((ql6) this.b).a(ykVar, this.c.f().a);
                } catch (ApiInvocationException e2) {
                    if (ykVar.getScopeAfter() != ll.a || !xy6.u(e2)) {
                        throw e2;
                    }
                    t55 t55 = this.c;
                    ppc f3 = t55.f();
                    c(f3, f3.a.d);
                    return ((ql6) this.b).a(ykVar, t55.f().a);
                } catch (ApiScopeException unused) {
                    t55 t552 = this.c;
                    ppc f4 = t552.f();
                    c(f4, f4.a.d);
                    return ((ql6) this.b).a(ykVar, t552.f().a);
                }
            default:
                ppc f5 = this.c.f();
                String str2 = f5.a.d;
                try {
                    reentrantLock = (ReentrantLock) this.g;
                    reentrantLock.lock();
                    if (this.e || str2 == null) {
                        b(f5, str2);
                    }
                    reentrantLock.unlock();
                    return ((ql6) this.b).a(ykVar, this.c.f().a);
                } catch (ApiInvocationException e3) {
                    if (ykVar.getScopeAfter() != ll.a || !xy6.u(e3)) {
                        throw e3;
                    }
                    t55 t553 = this.c;
                    ppc f6 = t553.f();
                    b(f6, f6.a.d);
                    return ((ql6) this.b).a(ykVar, t553.f().a);
                } catch (ApiScopeException unused2) {
                    t55 t554 = this.c;
                    ppc f7 = t554.f();
                    b(f7, f7.a.d);
                    return ((ql6) this.b).a(ykVar, t554.f().a);
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
        }
    }

    public void b(ppc ppc, String str) {
        ReentrantLock reentrantLock = (ReentrantLock) this.g;
        reentrantLock.lock();
        try {
            if (!hhd.f(str, this.c.f().a.d)) {
                if (this.e) {
                }
                reentrantLock.unlock();
            }
            ql n = ((rl) this.f).n();
            ppc d2 = ppc.d(Uri.parse(n.b));
            this.c.g(d2);
            d(d2, n.a);
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public void c(ppc ppc, String str) {
        synchronized (this.g) {
            try {
                if (Objects.equals(str, this.c.f().a.d)) {
                    w4g w4g = new w4g(new i70(((mle) this.f).c(), (String) this.d.get()), dp7.g);
                    dp7 dp7 = (dp7) ((ql6) this.b).a(w4g, ppc.a);
                    this.c.g(ppc.c(dp7.b, dp7.c));
                    this.e = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void d(ppc ppc, String str) {
        ReentrantLock reentrantLock = (ReentrantLock) this.g;
        reentrantLock.lock();
        try {
            w4g w4g = new w4g(new i70(str, (String) this.d.get()), dp7.g);
            dp7 dp7 = (dp7) ((ql6) this.b).a(w4g, ppc.a);
            this.c.g(ppc.c(dp7.b, dp7.c));
            this.e = false;
        } finally {
            reentrantLock.unlock();
        }
    }

    public te4(ql6 ql6, fq3 fq3, mle mle, Provider provider) {
        this.a = 0;
        this.g = new Object();
        this.e = false;
        this.b = ql6;
        this.c = fq3;
        this.f = mle;
        this.d = provider;
    }
}
