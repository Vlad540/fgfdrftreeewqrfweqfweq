package defpackage;

import android.os.RemoteException;
import android.util.Log;

/* renamed from: d5g  reason: default package */
public final class d5g extends j5g {
    public final /* synthetic */ Object X;
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ vde c;
    public final /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d5g(y5g y5g, vde vde, String str, vde vde2) {
        super(vde);
        this.X = y5g;
        this.o = str;
        this.c = vde2;
    }

    /* JADX WARNING: type inference failed for: r2v3, types: [m3g, android.os.IInterface] */
    public final void a() {
        switch (this.b) {
            case 0:
                vde vde = this.c;
                y5g y5g = (y5g) this.X;
                String str = (String) this.o;
                try {
                    y5g.a.m.o(y5g.b, y5g.a(y5g, str), new t5g(y5g, vde, str));
                    return;
                } catch (RemoteException e) {
                    o15 o15 = y5g.e;
                    Object[] objArr = {str};
                    if (Log.isLoggable("PlayCore", 6)) {
                        o15.c(o15.a, "requestUpdateInfo(%s)", objArr);
                    } else {
                        o15.getClass();
                    }
                    vde.c(new RuntimeException(e));
                    return;
                }
            default:
                synchronized (((r6g) this.X).f) {
                    try {
                        r6g r6g = (r6g) this.X;
                        vde vde2 = this.c;
                        r6g.e.add(vde2);
                        vde2.a.i(new s5c(r6g, vde2, false, 13));
                        if (((r6g) this.X).k.getAndIncrement() > 0) {
                            ((r6g) this.X).b.b("Already connected to the service.", new Object[0]);
                        }
                        r6g.b((r6g) this.X, (j5g) this.o);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d5g(r6g r6g, vde vde, vde vde2, d5g d5g) {
        super(vde);
        this.X = r6g;
        this.c = vde2;
        this.o = d5g;
    }
}
