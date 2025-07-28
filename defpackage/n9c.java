package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* renamed from: n9c  reason: default package */
public final class n9c implements dc7 {
    public final /* synthetic */ yv1 X;
    public final /* synthetic */ qc9 Y;
    public final /* synthetic */ i26 Z;
    public final /* synthetic */ nb7 a;
    public final /* synthetic */ l7c b;
    public final /* synthetic */ ou3 c;
    public final /* synthetic */ nb7 o;

    public n9c(nb7 nb7, l7c l7c, ou3 ou3, nb7 nb72, zv1 zv1, tc9 tc9, i26 i26) {
        this.a = nb7;
        this.b = l7c;
        this.c = ou3;
        this.o = nb72;
        this.X = zv1;
        this.Y = tc9;
        this.Z = i26;
    }

    public final void m(nc7 nc7, nb7 nb7) {
        nb7 nb72 = this.a;
        l7c l7c = this.b;
        if (nb7 == nb72) {
            l7c.a = xs7.E(this.c, (hu3) null, (ru3) null, new m9c(this.Y, this.Z, (Continuation) null), 3);
            return;
        }
        if (nb7 == this.o) {
            g37 g37 = (g37) l7c.a;
            if (g37 != null) {
                g37.cancel((CancellationException) null);
            }
            l7c.a = null;
        }
        if (nb7 == nb7.ON_DESTROY) {
            this.X.resumeWith(jue.a);
        }
    }
}
