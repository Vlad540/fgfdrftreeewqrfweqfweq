package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.Map;

/* renamed from: d0g  reason: default package */
public final class d0g extends hzf {
    public final ms6 b;
    public final vde c;
    public final hk9 d;

    public d0g(int i, ms6 ms6, vde vde, hk9 hk9) {
        super(i);
        this.c = vde;
        this.b = ms6;
        this.d = hk9;
        if (i == 2 && ms6.a) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    public final void a(Status status) {
        this.d.getClass();
        this.c.c(e07.s(status));
    }

    public final void b(RuntimeException runtimeException) {
        this.c.c(runtimeException);
    }

    public final void c(dzf dzf) {
        vde vde = this.c;
        try {
            this.b.g(dzf.d, vde);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            a(j0g.e(e2));
        } catch (RuntimeException e3) {
            vde.c(e3);
        }
    }

    public final void d(d4b d4b, boolean z) {
        Boolean valueOf = Boolean.valueOf(z);
        vde vde = this.c;
        ((Map) d4b.c).put(vde, valueOf);
        vde.a.i(new j1c(d4b, vde, false, 14));
    }

    public final boolean f(dzf dzf) {
        return this.b.a;
    }

    public final ib5[] g(dzf dzf) {
        return (ib5[]) this.b.c;
    }
}
