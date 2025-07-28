package defpackage;

import java.util.Objects;

/* renamed from: aye  reason: default package */
public final /* synthetic */ class aye implements h73, yx7 {
    public final /* synthetic */ bye a;
    public final /* synthetic */ fwe b;

    public /* synthetic */ aye(bye bye, fwe fwe) {
        this.a = bye;
        this.b = fwe;
    }

    public void b(x63 x63) {
        bye bye = this.a;
        fwe fwe = this.b;
        bye.getClass();
        udd.q("bye", "removeUpload: upload=" + fwe);
        synchronized (bye) {
            bye.a.c(fwe).e(((zxe) bye.b.getValue()).c(fwe)).a();
        }
        if (!x63.h()) {
            x63.b();
        }
    }

    public void c(ex7 ex7) {
        wve wve;
        bye bye = this.a;
        fwe fwe = this.b;
        bye.getClass();
        udd.q("bye", "getUpload: upload=" + fwe);
        synchronized (bye) {
            try {
                wve = (wve) bye.a.d(fwe).b();
            } catch (Exception unused) {
                wve = null;
            }
        }
        if (wve == null) {
            try {
                ax7 d = ((zxe) bye.b.getValue()).d(fwe);
                dye dye = bye.a;
                Objects.requireNonNull(dye);
                wve = (wve) new zx7(d, new xle(7, (Object) dye), z3d.j, z3d.i).b();
            } catch (Exception unused2) {
            }
        }
        if (ex7.h()) {
            return;
        }
        if (wve == null) {
            ex7.b();
        } else {
            ex7.a(wve);
        }
    }
}
