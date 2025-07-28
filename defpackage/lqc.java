package defpackage;

import android.content.Context;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.Continuation;

/* renamed from: lqc  reason: default package */
public abstract class lqc extends f3 implements f03 {
    public final hcd h = icd.a(1, 0, 1);
    public volatile xw2 i;
    public cg4 j;
    public Locale k;

    public lqc(Context context, we5 we5) {
        super(context, "user.prefs", we5);
    }

    public final void A(Long l) {
        k("user.Id", l);
        this.h.g(l);
    }

    public synchronized void b() {
        super.b();
        this.i = null;
        this.h.g(Long.valueOf(s()));
    }

    public final long m() {
        return e("server.timeDelta", 0) + System.currentTimeMillis();
    }

    public final synchronized long n() {
        xw2 xw2;
        try {
            if (this.i == null) {
                this.i = new xw2(new kqc(this, 1), new sic(2, this));
            }
            xw2 = this.i;
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
        return xw2.b + ((long) ((AtomicInteger) xw2.c).getAndIncrement());
    }

    public final long o() {
        return e("user.chatsLastSync", 0);
    }

    public final String p() {
        return this.g.getString("user.deviceAvatarPath", (String) null);
    }

    public final String q() {
        return f("user.lang", "ru");
    }

    public final long r() {
        return this.g.getLong("user.stickersLastSync", 0);
    }

    public final long s() {
        return e("user.Id", -1);
    }

    public final n73 t() {
        return new n73(2, new w48(new ck5(this.h, new zm5(new kqc(this, 0), (Continuation) null))));
    }

    public final Locale u() {
        if (this.k == null) {
            this.k = new Locale(q());
        }
        return this.k;
    }

    public final void v(long j2) {
        if (j2 > o()) {
            udd.p(this.e, "setChatsLastSync %d", new Object[]{Long.valueOf(j2)});
            k("user.chatsLastSync", Long.valueOf(j2));
        }
    }

    public final void w(boolean z) {
        i("app.forceConnection", z);
    }

    public final void x(long j2) {
        k("app.last.login.time", Long.valueOf(j2));
    }

    public final void y(long j2) {
        k("app.reset.at.time", Long.valueOf(j2));
    }

    public final void z(long j2) {
        k("server.timeDelta", Long.valueOf(j2));
    }
}
