package defpackage;

import java.util.Collections;
import kotlin.coroutines.Continuation;

/* renamed from: pfb  reason: default package */
public final class pfb extends l5e implements i26 {
    public final /* synthetic */ fgb X;
    public final /* synthetic */ long Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pfb(fgb fgb, long j, Continuation continuation) {
        super(2, continuation);
        this.X = fgb;
        this.Y = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new pfb(this.X, this.Y, continuation);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        fgb fgb = this.X;
        oec oec = (oec) fgb.Z.getValue();
        oec.getClass();
        ioa ioa = (ioa) o23.X(oec.f(Collections.singletonList(Long.valueOf(this.Y))));
        jue jue = jue.a;
        if (ioa != null) {
            taf.o(fgb.F0, new ndb(ioa.o));
        }
        return jue;
    }
}
