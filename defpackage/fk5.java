package defpackage;

import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* renamed from: fk5  reason: default package */
public final class fk5 extends l5e implements i26 {
    public l7c X;
    public int Y;
    public /* synthetic */ Object Z;
    public final /* synthetic */ int w0;
    public final /* synthetic */ pj5 x0;
    public final /* synthetic */ u16 y0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fk5(int i, ck5 ck5, gw2 gw2, Continuation continuation) {
        super(2, continuation);
        this.w0 = i;
        this.x0 = ck5;
        this.y0 = gw2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((rj5) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        fk5 fk5 = new fk5(this.w0, this.x0, this.y0, continuation);
        fk5.Z = obj;
        return fk5;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [l7c, java.lang.Object] */
    public final Object o(Object obj) {
        l7c l7c;
        rj5 rj5;
        Object obj2 = pu3.a;
        int i = this.Y;
        if (i == 0) {
            wx3.H(obj);
            rj5 rj52 = (rj5) this.Z;
            int i2 = this.w0;
            if (i2 > 0) {
                ? obj3 = new Object();
                try {
                    pj5 pj5 = this.x0;
                    ek5 ek5 = new ek5(obj3, i2, rj52, 0);
                    this.Z = rj52;
                    this.X = obj3;
                    this.Y = 1;
                    if (pj5.c(ek5, this) == obj2) {
                        return obj2;
                    }
                    rj5 = rj52;
                    l7c = obj3;
                } catch (CancellationException e) {
                    e = e;
                    l7c = obj3;
                    ArrayList arrayList = (ArrayList) l7c.a;
                    if (arrayList != null) {
                        this.y0.invoke(arrayList);
                    }
                    throw e;
                }
            } else {
                throw new IllegalArgumentException("Chunk size must be greater than 0".toString());
            }
        } else if (i == 1) {
            l7c = this.X;
            rj5 = (rj5) this.Z;
            try {
                wx3.H(obj);
            } catch (CancellationException e2) {
                e = e2;
            }
        } else if (i == 2) {
            wx3.H(obj);
            return jue.a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ArrayList arrayList2 = (ArrayList) l7c.a;
        if (arrayList2 != null) {
            this.Z = null;
            this.X = null;
            this.Y = 2;
            if (rj5.a(arrayList2, this) == obj2) {
                return obj2;
            }
        }
        return jue.a;
    }
}
