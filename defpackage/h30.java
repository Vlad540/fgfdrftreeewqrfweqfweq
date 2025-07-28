package defpackage;

import android.content.Context;
import android.media.MediaRecorder;
import android.os.PowerManager;
import java.util.Set;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.util.HandledException;

/* renamed from: h30  reason: default package */
public final class h30 implements MediaRecorder.OnInfoListener, ya9 {
    public static final /* synthetic */ int B0 = 0;
    public volatile long A0 = -1;
    public final t97 X;
    public final t97 Y;
    public final t97 Z;
    public final Context a;
    public final tt0 b;
    public final nb9 c;
    public final t97 o;
    public final r7e w0;
    public final r7e x0 = new r7e(new c30(this, 0));
    public final r7e y0 = new r7e(new c30(this, 1));
    public volatile long z0 = -1;

    public h30(Context context, tt0 tt0, t97 t97, nb9 nb9, t97 t972, t97 t973, t97 t974) {
        this.a = context;
        this.b = tt0;
        this.c = nb9;
        this.o = t97;
        this.X = t972;
        this.Y = t973;
        this.Z = t974;
        this.w0 = new r7e(new xq(1, t974));
        synchronized (nb9.o) {
            nb9.o.add(this);
        }
        tt0.d(this);
    }

    public static void o(PowerManager.WakeLock wakeLock, int i) {
        if (wakeLock.isHeld()) {
            udd.q("h30", "Releasing " + wakeLock);
            wakeLock.release(i);
        }
    }

    public final void a(long j, m68 m68) {
        r(j, m68, false);
    }

    public final void b(long j, m68 m68) {
        udd.s("h30", "onError " + j + " type " + m68, (Throwable) null);
        t();
        r(j, m68, false);
        n();
        if (m68 == m68.c) {
            p(j, 0);
        }
    }

    public final void c(long j, m68 m68, long j2, m68 m682) {
        StringBuilder sb = new StringBuilder("onAudioChanged prev=");
        sb.append(j);
        sb.append(" prevType=");
        sb.append(m68);
        hr1.s(sb, ", curr=", j2, " currType=");
        sb.append(m682);
        udd.q("h30", sb.toString());
        boolean z = this.c.A;
        if (j != -1 && m68 == m68.c && !z) {
            p(j, 0);
        }
        r(j, m68, false);
    }

    public final void d(long j, m68 m68) {
        udd.q("h30", "onBuffering " + j + " type " + m68);
        ns7 ns7 = m68.a;
        t();
        m68 m682 = m68.c;
        r7e r7e = this.y0;
        if (m68 == m682) {
            if (!l()) {
                ((PowerManager.WakeLock) r7e.getValue()).acquire();
            }
        } else if (l()) {
            o((PowerManager.WakeLock) r7e.getValue(), 0);
        }
        r(j, m68, false);
    }

    public final void e(long j, m68 m68, long j2) {
        udd.q("h30", "onStop " + j + " type " + m68);
        t();
        r(j, m68, false);
        n();
        if (m68 == m68.c) {
            p(j, j2);
        }
    }

    public final void f(long j, m68 m68) {
        udd.q("h30", "onPause " + j + " type " + m68);
        r(j, m68, false);
    }

    public final void g(long j, m68 m68) {
        udd.q("h30", "onSkipToPrevious " + j + " type " + m68);
        r(j, m68, false);
    }

    public final void h(long j, m68 m68) {
        udd.q("h30", "onPlay " + j + " type " + m68);
        ns7 ns7 = m68.a;
        t();
        m68 m682 = m68.c;
        r7e r7e = this.y0;
        if (m68 == m682) {
            if (!l()) {
                ((PowerManager.WakeLock) r7e.getValue()).acquire();
            }
        } else if (l()) {
            o((PowerManager.WakeLock) r7e.getValue(), 0);
        }
        r(j, m68, true);
    }

    public final void i(long j, m68 m68) {
        udd.q("h30", "onPause " + j + " type " + m68);
        r(j, m68, false);
        if (m68 == m68.c) {
            if (l()) {
                o((PowerManager.WakeLock) this.y0.getValue(), 0);
            }
            p(j, this.c.o());
        }
    }

    public final void j(long j, m68 m68) {
        udd.q("h30", "onSkipToNext " + j + " type " + m68);
        r(j, m68, false);
    }

    public final boolean k() {
        Boolean bool;
        r7e r7e = this.x0;
        if (!r7e.a()) {
            return false;
        }
        try {
            bool = Boolean.valueOf(((PowerManager.WakeLock) r7e.getValue()).isHeld());
        } catch (Throwable th) {
            bool = new kcc(th);
        }
        Throwable a2 = mcc.a(bool);
        if (a2 != null) {
            ((g15) this.X.getValue()).c(new HandledException(a2), true);
        }
        Boolean bool2 = Boolean.FALSE;
        if (bool instanceof kcc) {
            bool = bool2;
        }
        return bool.booleanValue();
    }

    public final boolean l() {
        Boolean bool;
        r7e r7e = this.y0;
        if (!r7e.a()) {
            return false;
        }
        try {
            bool = Boolean.valueOf(((PowerManager.WakeLock) r7e.getValue()).isHeld());
        } catch (Throwable th) {
            bool = new kcc(th);
        }
        Throwable a2 = mcc.a(bool);
        if (a2 != null) {
            ((g15) this.X.getValue()).c(new HandledException(a2), true);
        }
        Boolean bool2 = Boolean.FALSE;
        if (bool instanceof kcc) {
            bool = bool2;
        }
        return bool.booleanValue();
    }

    public final void m() {
        udd.q("h30", "onDeviceAwayFromEar");
        if (k()) {
            r7e r7e = this.x0;
            boolean z = false;
            if (r7e.a()) {
                o((PowerManager.WakeLock) r7e.getValue(), 0);
            }
            nb9 nb9 = this.c;
            if (nb9.x) {
                if (nb9.m() == m68.c) {
                    z = true;
                }
                if (z) {
                    nb9.q();
                }
            }
        }
    }

    public final void n() {
        r7e r7e = this.y0;
        try {
            if (r7e.a()) {
                o((PowerManager.WakeLock) r7e.getValue(), 0);
            }
            r7e r7e2 = this.x0;
            if (r7e2.a()) {
                o((PowerManager.WakeLock) r7e2.getValue(), 1);
            }
        } catch (Throwable th) {
            ((g15) this.X.getValue()).c(new HandledException(th), true);
        }
    }

    @a1e
    public final void onEvent(l89 l89) {
        nb9 nb9 = this.c;
        if (l89.X.contains(Long.valueOf(nb9.l())) && nb9.C == null) {
            udd.q("h30", "stop");
            t();
            nb9.t();
            n();
        }
    }

    public final void onInfo(MediaRecorder mediaRecorder, int i, int i2) {
        if (i == 800 || i == 801) {
            this.b.c(new wt(1));
        }
    }

    public final void p(long j, long j2) {
        if (j != -1 && j2 >= 0) {
            xs7.E((ou3) this.w0.getValue(), (hu3) null, (ru3) null, new e30(this, j2, j, (Continuation) null), 3);
        }
    }

    public final void r(long j, m68 m68, boolean z) {
        udd.q("h30", "sendEvent " + j + ", " + m68 + ", " + z);
        if (j != -1) {
            if (j != this.z0 || this.A0 == -1) {
                udd.q("h30", "track changed, should update chatId");
                if (j != this.z0 || this.A0 == -1) {
                    xs7.E((ou3) this.w0.getValue(), (hu3) null, (ru3) null, new g30(this, j, m68, (Continuation) null), 3);
                    return;
                }
                s(j, m68, this.A0);
                return;
            }
            s(j, m68, this.A0);
        }
    }

    public final void s(long j, m68 m68, long j2) {
        udd.q("h30", "send event internal trackId=" + j + " trackType=" + m68 + " chatId=" + j2);
        this.b.c(new c50(m68.ordinal(), j, j2));
    }

    public final void t() {
        udd.q("h30", "unsubscribe sensors controller");
        cyc cyc = (cyc) this.o.getValue();
        Set set = cyc.c;
        if (set.remove(this) && set.size() == 0 && cyc.b != null) {
            cyc.a.unregisterListener(cyc);
        }
    }
}
