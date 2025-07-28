package defpackage;

import java.util.List;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* renamed from: up1  reason: default package */
public final class up1 extends l5e implements i26 {
    public final /* synthetic */ List X;
    public final /* synthetic */ nxc Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public up1(List list, nxc nxc, Continuation continuation) {
        super(2, continuation);
        this.X = list;
        this.Y = nxc;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((up1) n((ou3) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new up1(this.X, this.Y, continuation);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        for (wg6 wg6 : this.X) {
            boolean z = wg6 instanceof sg6;
            nxc nxc = this.Y;
            if (z) {
                sg6 sg6 = (sg6) wg6;
                ((luf) ((t97) nxc.b).getValue()).a(new j0d(sg6.b, sg6.d, (j63) null, false, md4.X));
            } else if (wg6 instanceof ug6) {
                ug6 ug6 = (ug6) wg6;
                ((luf) ((t97) nxc.b).getValue()).a(new j0d(ug6.b, ug6.c, (j63) null, false, md4.X));
            } else if (wg6 instanceof tg6) {
                String str = ((tg6) wg6).d;
                phd h = ((nb1) ((t97) nxc.c).getValue()).a.n().h(s59.a);
                mb1 mb1 = new mb1(0, str);
                bw1 bw1 = new bw1(1);
                Objects.requireNonNull(bw1, "observer is null");
                try {
                    pn1 pn1 = new pn1(bw1, 7, mb1);
                    bw1.d(pn1);
                    h.k(pn1);
                } catch (NullPointerException e) {
                    throw e;
                } catch (Throwable th) {
                    ek8.a0(th);
                    xs7.F(th);
                    NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
                    nullPointerException.initCause(th);
                    throw nullPointerException;
                }
            } else if (!(wg6 instanceof vg6)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return jue.a;
    }
}
