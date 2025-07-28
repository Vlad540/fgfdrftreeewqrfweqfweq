package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import java.util.List;

/* renamed from: s48  reason: default package */
public final class s48 implements IBinder.DeathRecipient {
    public final s38 a = new s38(this);
    public r64 b;
    public u38 c;
    public final Handler d;
    public final /* synthetic */ u48 e;

    public s48(u48 u48, Looper looper) {
        this.e = u48;
        this.d = new Handler(looper, new fi4(5, this));
    }

    public final void a(w38 w38) {
        u48 u48 = this.e;
        t48 t48 = u48.l;
        int i = t48.g;
        w38 w382 = w38;
        u48.l = new t48(w382, t48.b, t48.c, t48.d, t48.e, t48.f, i, t48.h);
        k();
    }

    public final void b(boolean z) {
        r38 r38 = this.e.b;
        r38.getClass();
        oyb.k(Looper.myLooper() == r38.X.getLooper());
        new Bundle().putBoolean("androidx.media3.session.ARGUMENT_CAPTIONING_ENABLED", z);
        new v1d("androidx.media3.session.SESSION_COMMAND_ON_CAPTIONING_ENABLED_CHANGED", Bundle.EMPTY);
        r38.o.getClass();
        p38.a();
    }

    public final void binderDied() {
        i(8, (Object) null, (Bundle) null);
    }

    public final void c(Bundle bundle) {
        u48 u48 = this.e;
        yd3 yd3 = u48.m;
        u48.m = new yd3((fza) yd3.a, (w1d) yd3.b, (eya) yd3.c, (ws6) yd3.d, bundle, (f2d) null);
        r38 r38 = u48.b;
        r38.getClass();
        oyb.k(Looper.myLooper() == r38.X.getLooper());
        r38 r382 = u48.b;
        r38.o.getClass();
    }

    public final void d(a88 a88) {
        u48 u48 = this.e;
        t48 t48 = u48.l;
        int i = t48.g;
        a88 a882 = a88;
        u48.l = new t48(t48.a, t48.b, a882, t48.d, t48.e, t48.f, i, t48.h);
        k();
    }

    public final void e(cya cya) {
        u48 u48 = this.e;
        t48 t48 = u48.l;
        cya j = u48.j(cya);
        int i = t48.g;
        u48.l = new t48(t48.a, j, t48.c, t48.d, t48.e, t48.f, i, t48.h);
        k();
    }

    public final void f(List list) {
        u48 u48 = this.e;
        t48 t48 = u48.l;
        List i = u48.i(list);
        int i2 = t48.g;
        u48.l = new t48(t48.a, t48.b, t48.c, i, t48.e, t48.f, i2, t48.h);
        k();
    }

    public final void g(CharSequence charSequence) {
        u48 u48 = this.e;
        t48 t48 = u48.l;
        int i = t48.g;
        CharSequence charSequence2 = charSequence;
        u48.l = new t48(t48.a, t48.b, t48.c, t48.d, charSequence2, t48.f, i, t48.h);
        k();
    }

    public final void h(String str, Bundle bundle) {
        if (str != null) {
            r38 r38 = this.e.b;
            r38.getClass();
            oyb.k(Looper.myLooper() == r38.X.getLooper());
            new v1d(str, Bundle.EMPTY);
            r38.o.getClass();
            p38.a();
        }
    }

    public final void i(int i, Object obj, Bundle bundle) {
        r64 r64 = this.b;
        if (r64 != null) {
            Message obtainMessage = r64.obtainMessage(i, obj);
            if (bundle != null) {
                obtainMessage.setData(bundle);
            }
            obtainMessage.sendToTarget();
        }
    }

    public final void j(Handler handler) {
        if (handler == null) {
            r64 r64 = this.b;
            if (r64 != null) {
                r64.b = false;
                r64.removeCallbacksAndMessages((Object) null);
                this.b = null;
                return;
            }
            return;
        }
        r64 r642 = new r64(this, handler.getLooper());
        this.b = r642;
        r642.b = true;
    }

    public final void k() {
        Handler handler = this.d;
        if (!handler.hasMessages(1)) {
            handler.sendEmptyMessageDelayed(1, 500);
        }
    }
}
