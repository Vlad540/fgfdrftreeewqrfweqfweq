package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: vk8  reason: default package */
public final class vk8 extends l5e implements i26 {
    public i22 X;
    public int Y;
    public final /* synthetic */ cl8 Z;
    public final /* synthetic */ boolean w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vk8(cl8 cl8, boolean z, Continuation continuation) {
        super(2, continuation);
        this.Z = cl8;
        this.w0 = z;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new vk8(this.Z, this.w0, continuation);
    }

    public final Object o(Object obj) {
        i22 i22;
        pu3 pu3 = pu3.a;
        int i = this.Y;
        jue jue = jue.a;
        cl8 cl8 = this.Z;
        if (i == 0) {
            wx3.H(obj);
            udd.q(cl8.N0, "load members with read status");
            i22 = cl8.t();
            if (i22 == null) {
                return jue;
            }
            this.X = i22;
            this.Y = 1;
            if (cl8.r(cl8, i22, this) == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            i22 = this.X;
            wx3.H(obj);
        } else if (i == 2) {
            wx3.H(obj);
            cl8.q(cl8);
            return jue;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (!this.w0) {
            return jue;
        }
        this.X = null;
        this.Y = 2;
        if (cl8.s(cl8, i22, this) == pu3) {
            return pu3;
        }
        cl8.q(cl8);
        return jue;
    }
}
