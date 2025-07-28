package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: jv  reason: default package */
public final class jv extends l5e implements i26 {
    public int X;
    public final /* synthetic */ fw Y;
    public final /* synthetic */ long Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jv(fw fwVar, long j, Continuation continuation) {
        super(2, continuation);
        this.Y = fwVar;
        this.Z = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new jv(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        Comparable comparable = pu3.a;
        int i = this.X;
        fw fwVar = this.Y;
        if (i == 0) {
            wx3.H(obj);
            k77[] k77Arr = fw.F;
            this.X = 1;
            obj = ((bv2) fwVar.p.getValue()).d(fwVar.a, this);
            if (obj == comparable) {
                return comparable;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else if (i == 2) {
            wx3.H(obj);
            fwVar.r(this.Z);
            return jue.a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        i22 i22 = (i22) obj;
        if (!i22.J()) {
            long j = i22.b.a;
            this.X = 2;
            if (((s76) fwVar.x.getValue()).a(j, true, this) == comparable) {
                return comparable;
            }
        }
        fwVar.r(this.Z);
        return jue.a;
    }
}
