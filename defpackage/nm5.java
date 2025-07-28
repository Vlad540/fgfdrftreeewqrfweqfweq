package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: nm5  reason: default package */
public final class nm5 extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ pj5 Z;
    public final /* synthetic */ z63 w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nm5(pj5 pj5, a73 a73, Continuation continuation) {
        super(2, continuation);
        this.Z = pj5;
        this.w0 = a73;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((nm5) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        nm5 nm5 = new nm5(this.Z, (a73) this.w0, continuation);
        nm5.Y = obj;
        return nm5;
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        z63 z63 = this.w0;
        if (i == 0) {
            wx3.H(obj);
            ou3 ou3 = (ou3) this.Y;
            Object obj2 = new Object();
            pj5 pj5 = this.Z;
            a40 a40 = new a40(obj2, ou3, z63, 6);
            this.X = 1;
            if (pj5.c(a40, this) == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            try {
                wx3.H(obj);
            } catch (Throwable th) {
                a73 a73 = (a73) z63;
                a73.getClass();
                a73.makeCompleting$kotlinx_coroutines_core(new r73(th, false));
                throw th;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return jue.a;
    }
}
