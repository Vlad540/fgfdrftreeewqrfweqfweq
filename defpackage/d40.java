package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: d40  reason: default package */
public final class d40 extends l5e implements i26 {
    public final /* synthetic */ e40 X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d40(e40 e40, Continuation continuation) {
        super(2, continuation);
        this.X = e40;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new d40(this.X, continuation);
    }

    public final Object o(Object obj) {
        Object value;
        Object value2;
        boolean z;
        Float f;
        Object value3;
        wx3.H(obj);
        e40 e40 = this.X;
        k77[] k77Arr = e40.h;
        long l = ((nb9) e40.b()).l();
        Long l2 = this.X.e;
        jue jue = jue.a;
        if (l2 == null || l != l2.longValue()) {
            grd grd = this.X.f;
            do {
                value = grd.getValue();
                ((ah7) value).getClass();
            } while (!grd.b(value, new ah7((Float) null, false)));
            return jue;
        } else if (this.X.b().b()) {
            grd grd2 = this.X.f;
            do {
                value3 = grd2.getValue();
                ah7 ah7 = (ah7) value3;
            } while (!grd2.b(value3, new ah7((Float) null, false)));
            return jue;
        } else {
            e40 e402 = this.X;
            grd grd3 = e402.f;
            do {
                value2 = grd3.getValue();
                ah7 ah72 = (ah7) value2;
                z = ((nb9) e402.b()).x;
                f = ah72.a;
                ah72.getClass();
            } while (!grd3.b(value2, new ah7(f, z)));
            return jue;
        }
    }
}
