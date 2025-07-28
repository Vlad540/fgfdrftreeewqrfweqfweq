package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* renamed from: co2  reason: default package */
public final class co2 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ fo2 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public co2(fo2 fo2, Continuation continuation) {
        super(2, continuation);
        this.Y = fo2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        co2 co2 = new co2(this.Y, continuation);
        co2.X = obj;
        return co2;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        ou3 ou3 = (ou3) this.X;
        boolean booleanValue = ((Boolean) this.Y.d.invoke()).booleanValue();
        jue jue = jue.a;
        if (!booleanValue) {
            return jue;
        }
        this.Y.j = false;
        g37 g37 = this.Y.f;
        if (g37 != null) {
            g37.cancel((CancellationException) null);
        }
        fo2 fo2 = this.Y;
        fo2.f = xs7.E(ou3, fo2.l, (ru3) null, new yn2(fo2, (Continuation) null), 2);
        fo2 fo22 = this.Y;
        bc bcVar = new bc(new ik5(((aw2) fo22.c).m(fo22.a), 2), 13, this.Y);
        int i = zp4.o;
        ez3.N(new bc(new ck5(ez3.x(bcVar, ek8.b0(mt0.P(10, eq4.o))), new zn2(this.Y, (Continuation) null), 5), 17, new ao2(3, (Continuation) null, 0)), ou3);
        return jue;
    }
}
