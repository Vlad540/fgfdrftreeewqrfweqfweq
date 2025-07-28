package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: zn2  reason: default package */
public final class zn2 extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ fo2 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zn2(fo2 fo2, Continuation continuation) {
        super(2, continuation);
        this.Z = fo2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((i22) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        zn2 zn2 = new zn2(this.Z, continuation);
        zn2.Y = obj;
        return zn2;
    }

    public final Object o(Object obj) {
        jue jue = pu3.a;
        int i = this.X;
        jue jue2 = jue.a;
        if (i == 0) {
            wx3.H(obj);
            o62 o62 = ((i22) this.Y).b;
            long j = o62.a;
            m62 m62 = o62.c;
            if (!(this.Z.h == j && this.Z.g == m62)) {
                this.Z.g = m62;
                this.Z.h = j;
                fo2 fo2 = this.Z;
                this.X = 1;
                fo2.c(j, this);
                if (jue2 == jue) {
                    return jue;
                }
            }
        } else if (i == 1) {
            try {
                wx3.H(obj);
            } catch (Throwable th) {
                udd.s("fo2", "catch error in chatUpdateFlow.onEach", th);
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return jue2;
    }
}
