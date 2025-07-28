package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: k76  reason: default package */
public final class k76 extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ ou3 Z;
    public final /* synthetic */ long w0;
    public final /* synthetic */ n76 x0;
    public final /* synthetic */ long y0;
    public final /* synthetic */ boolean z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k76(ou3 ou3, long j, n76 n76, long j2, boolean z, Continuation continuation) {
        super(2, continuation);
        this.Z = ou3;
        this.w0 = j;
        this.x0 = n76;
        this.y0 = j2;
        this.z0 = z;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((tf3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        k76 k76 = new k76(this.Z, this.w0, this.x0, this.y0, this.z0, continuation);
        k76.Y = obj;
        return k76;
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        ou3 ou3 = this.Z;
        n76 n76 = this.x0;
        long j = this.w0;
        if (i == 0) {
            wx3.H(obj);
            if (e07.A((tf3) this.Y)) {
                String name = ou3.getClass().getName();
                udd.q(name, "try to request info for #" + j);
                long j2 = this.w0;
                long j3 = this.y0;
                this.X = 1;
                if (((r59) n76.b.getValue()).s(j2, j3, this) == pu3) {
                    return pu3;
                }
            }
        } else if (i == 1) {
            try {
                wx3.H(obj);
            } catch (Throwable th) {
                String name2 = ou3.getClass().getName();
                udd.s(name2, "fail to fetch noncontact #" + j, th);
                return new tj5(3, this.z0 ? ((ap3) n76.a.getValue()).a(j) : null);
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return ((ap3) n76.a.getValue()).c(j);
    }
}
