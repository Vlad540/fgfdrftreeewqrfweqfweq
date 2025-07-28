package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: zp1  reason: default package */
public final class zp1 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ String Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zp1(String str, Continuation continuation) {
        super(2, continuation);
        this.Y = str;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((zp1) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new zp1(this.Y, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            udd.p("CallsNotification", "handle loading notification image", new Object[0]);
            String str = this.Y;
            if (str == null || h0e.c0(str)) {
                udd.p("CallsNotification", "avatar for call push is empty", new Object[0]);
                return null;
            }
            udd.p("CallsNotification", "start loading call push avatar", new Object[0]);
            yp1 yp1 = new yp1(str, (Continuation) null);
            this.X = 1;
            obj = ez3.m0(500, yp1, this);
            if (obj == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
