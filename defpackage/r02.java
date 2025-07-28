package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: r02  reason: default package */
public final class r02 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ pj5 Y;
    public final /* synthetic */ ayc Z;
    public final /* synthetic */ dxc w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r02(pj5 pj5, ayc ayc, gxc gxc, Continuation continuation) {
        super(2, continuation);
        this.Y = pj5;
        this.Z = ayc;
        this.w0 = gxc;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((r02) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new r02(this.Y, this.Z, (gxc) this.w0, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        dxc dxc = this.w0;
        if (i == 0) {
            wx3.H(obj);
            pj5 pj5 = this.Y;
            ayc ayc = this.Z;
            this.X = 1;
            if (pj5.c(ayc, this) == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            try {
                wx3.H(obj);
            } catch (Throwable th) {
                ((gxc) dxc).c();
                throw th;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ((gxc) dxc).c();
        return jue.a;
    }
}
