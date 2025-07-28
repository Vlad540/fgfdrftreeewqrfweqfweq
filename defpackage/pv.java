package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: pv  reason: default package */
public final class pv extends l5e implements i26 {
    public int X;
    public final /* synthetic */ fw Y;
    public final /* synthetic */ long Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pv(fw fwVar, long j, Continuation continuation) {
        super(2, continuation);
        this.Y = fwVar;
        this.Z = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new pv(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        Object value;
        Object obj2;
        pu3 pu3 = pu3.a;
        int i = this.X;
        long j = this.Z;
        fw fwVar = this.Y;
        if (i == 0) {
            wx3.H(obj);
            o8c o8c = fwVar.k;
            this.X = 1;
            obj = fw.b(fwVar, o8c, j, this);
            if (obj == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (((Number) obj).intValue() >= 0) {
            grd grd = fwVar.C;
            Object tuVar = new tu(j, true);
            do {
                value = grd.getValue();
                Object obj3 = (uu) value;
                obj2 = obj3 instanceof ru ? (ru) obj3 : null;
                if (obj2 == null) {
                    obj2 = tuVar;
                }
            } while (!grd.b(value, obj2));
        }
        return jue.a;
    }
}
