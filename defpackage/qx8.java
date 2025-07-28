package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: qx8  reason: default package */
public final class qx8 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ zz8 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qx8(zz8 zz8, Continuation continuation) {
        super(2, continuation);
        this.Y = zz8;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((qp8) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        qx8 qx8 = new qx8(this.Y, continuation);
        qx8.X = obj;
        return qx8;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        qp8 qp8 = (qp8) this.X;
        String str = this.Y.F0;
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            tn7 tn7 = tn7.X;
            fn6.d(tn7, str, "Got MessageEvent=" + qp8, (Throwable) null);
        }
        if (qp8 instanceof kp8) {
            zz8 zz8 = this.Y;
            zz8.getClass();
            if (((kp8) qp8).b) {
                String str2 = zz8.F0;
                fn6 fn62 = udd.e;
                if (fn62 != null && fn62.c()) {
                    fn62.d(tn7.X, str2, "handleMessageAddEvent: delayed scroll for outgoing message", (Throwable) null);
                }
                epc epc = zz8.A1;
                epc.getClass();
                epc.a.setValue(new bpc(Long.MAX_VALUE, false, false, true, true));
            }
        }
        return jue.a;
    }
}
