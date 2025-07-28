package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: oo1  reason: default package */
public final class oo1 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ po1 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public oo1(po1 po1, Continuation continuation) {
        super(2, continuation);
        this.Y = po1;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((oo1) n((vye) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        oo1 oo1 = new oo1(this.Y, continuation);
        oo1.X = obj;
        return oo1;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        vye vye = (vye) this.X;
        vye vye2 = vye.a;
        po1 po1 = this.Y;
        if (vye == vye2) {
            zw3 zw3 = (zw3) po1.b().getValue();
            iq1 iq1 = (iq1) po1.m.getValue();
            String str = zw3.c;
            iq1.getClass();
            iq1.c(iq1, "BAD_CONNECTION_ALERT", str, "VPN", (Integer) null, (String) null, (String) null, zw3.h, 56);
        }
        po1.m(vye);
        return jue.a;
    }
}
