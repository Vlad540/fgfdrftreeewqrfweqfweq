package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: wl1  reason: default package */
public final class wl1 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ yl1 Y;
    public final /* synthetic */ long Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wl1(yl1 yl1, long j, Continuation continuation) {
        super(2, continuation);
        this.Y = yl1;
        this.Z = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((wl1) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new wl1(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        yl1 yl1 = this.Y;
        if (i == 0) {
            wx3.H(obj);
            this.X = 1;
            obj = ((bv2) yl1.f.getValue()).u(this.Z, this);
            if (obj == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        long j = ((i22) obj).a;
        iq1 iq1 = (iq1) yl1.e.getValue();
        po1 po1 = yl1.b;
        String str = ((zw3) po1.b().getValue()).c;
        boolean z = ((zw3) po1.b().getValue()).h;
        iq1.getClass();
        iq1.c(iq1, "CHAT_OPENED", str, (String) null, (Integer) null, (String) null, (String) null, z, 60);
        hcd hcd = yl1.i;
        oc1.c.getClass();
        hcd.g(new a34(":chats?id=" + j + "&type=local"));
        return jue.a;
    }
}
