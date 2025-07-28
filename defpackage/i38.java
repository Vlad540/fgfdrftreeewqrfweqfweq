package defpackage;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.Surface;
import androidx.media3.exoplayer.ExoPlaybackException;

/* renamed from: i38  reason: default package */
public final class i38 implements Handler.Callback {
    public final /* synthetic */ int a = 0;
    public final Handler b;
    public final /* synthetic */ Object c;

    public i38(j38 j38, i28 i28) {
        this.c = j38;
        Handler m = mze.m(this);
        this.b = m;
        i28.n(this, m);
    }

    public void a(long j) {
        Surface surface;
        k38 k38 = (k38) this.c;
        if (this == k38.y2 && k38.a1 != null) {
            if (j == Long.MAX_VALUE) {
                k38.N1 = true;
                return;
            }
            try {
                k38.y0(j);
                k38.E0(k38.t2);
                k38.P1.f++;
                n4f n4f = k38.Z1;
                boolean z = n4f.e != 3;
                n4f.e = 3;
                n4f.l.getClass();
                n4f.g = oze.S(SystemClock.elapsedRealtime());
                if (z && (surface = k38.h2) != null) {
                    v4b v4b = k38.W1;
                    Handler handler = (Handler) v4b.b;
                    if (handler != null) {
                        handler.post(new v82(v4b, surface, SystemClock.elapsedRealtime(), 8));
                    }
                    k38.k2 = true;
                }
                k38.g0(j);
            } catch (ExoPlaybackException e) {
                k38.O1 = e;
            }
        }
    }

    public final boolean handleMessage(Message message) {
        switch (this.a) {
            case 0:
                if (message.what != 0) {
                    return false;
                }
                int i = message.arg1;
                int i2 = message.arg2;
                int i3 = mze.a;
                long j = (((long) i2) & 4294967295L) | ((((long) i) & 4294967295L) << 32);
                j38 j38 = (j38) this.c;
                if (this != j38.B2) {
                    return true;
                }
                if (j == Long.MAX_VALUE) {
                    j38.N1 = true;
                    return true;
                }
                try {
                    j38.q0(j);
                    j38.y0();
                    j38.P1.f++;
                    j38.x0();
                    j38.a0(j);
                    return true;
                } catch (com.google.android.exoplayer2.ExoPlaybackException e) {
                    j38.O1 = e;
                    return true;
                }
            default:
                if (message.what != 0) {
                    return false;
                }
                int i4 = message.arg1;
                int i5 = message.arg2;
                int i6 = oze.a;
                a((((long) i5) & 4294967295L) | ((((long) i4) & 4294967295L) << 32));
                return true;
        }
    }

    public i38(k38 k38, j28 j28) {
        this.c = k38;
        Handler o = oze.o(this);
        this.b = o;
        j28.p(this, o);
    }
}
