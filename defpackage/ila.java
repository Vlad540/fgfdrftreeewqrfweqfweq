package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ila  reason: default package */
public final class ila extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ pc7 Z;
    public final /* synthetic */ ob7 w0;
    public final /* synthetic */ i26 x0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ila(pc7 pc7, ob7 ob7, i26 i26, Continuation continuation) {
        super(2, continuation);
        this.Z = pc7;
        this.w0 = ob7;
        this.x0 = i26;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ila) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        ila ila = new ila(this.Z, this.w0, this.x0, continuation);
        ila.Y = obj;
        return ila;
    }

    public final Object o(Object obj) {
        tb7 tb7;
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            g37 g37 = (g37) ((ou3) this.Y).getCoroutineContext().get(xhd.c);
            if (g37 != null) {
                hla hla = new hla();
                tb7 tb72 = new tb7(this.Z, this.w0, hla.a, g37);
                try {
                    i26 i26 = this.x0;
                    this.Y = tb72;
                    this.X = 1;
                    obj = xs7.U(hla, i26, this);
                    if (obj == pu3) {
                        return pu3;
                    }
                    tb7 = tb72;
                } catch (Throwable th) {
                    th = th;
                    tb7 = tb72;
                    tb7.a();
                    throw th;
                }
            } else {
                throw new IllegalStateException("when[State] methods should have a parent job".toString());
            }
        } else if (i == 1) {
            tb7 = (tb7) this.Y;
            try {
                wx3.H(obj);
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        tb7.a();
        return obj;
    }
}
