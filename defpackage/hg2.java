package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: hg2  reason: default package */
public final class hg2 extends l5e implements i26 {
    public long X;
    public int Y;
    public final /* synthetic */ ah2 Z;
    public final /* synthetic */ int w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hg2(ah2 ah2, int i, Continuation continuation) {
        super(2, continuation);
        this.Z = ah2;
        this.w0 = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((hg2) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new hg2(this.Z, this.w0, continuation);
    }

    public final Object o(Object obj) {
        long j;
        Object obj2;
        pu3 pu3 = pu3.a;
        int i = this.Y;
        jue jue = jue.a;
        ah2 ah2 = this.Z;
        if (i == 0) {
            wx3.H(obj);
            v2f v2f = ((cg2) ah2.a1.a.getValue()).b;
            String str = ah2.A0;
            if (v2f == null) {
                udd.p(str, "Can't load frame for preview because videoContent is null", new Object[0]);
                return jue;
            }
            t97 t97 = ah2.H0;
            if (!hhd.f(((xy5) t97.getValue()).c().a, v2f)) {
                ((xy5) t97.getValue()).f(new uy5(v2f, 6));
                if (!((xy5) t97.getValue()).d()) {
                    udd.p(str, "Can't load frame for preview because can't extract frame", new Object[0]);
                    return jue;
                }
                ((xy5) t97.getValue()).prepare();
            }
            long j2 = ah2.Q0.get();
            int i2 = (v2f.c() > 0 ? 1 : (v2f.c() == 0 ? 0 : -1));
            int i3 = this.w0;
            if (i2 == 0 || Math.abs((double) (j2 - ((long) i3))) > ((double) v2f.c()) * 0.01d) {
                grd grd = ah2.V0;
                grd.m((Object) null, yf2.a((yf2) grd.getValue(), new xf2((vy5) null, true, false, 5)));
                j = (long) i3;
                this.X = j;
                this.Y = 1;
                obj2 = ((xy5) t97.getValue()).e(j, this);
                if (obj2 == pu3) {
                    return pu3;
                }
            }
            return jue;
        } else if (i == 1) {
            long j3 = this.X;
            wx3.H(obj);
            j = j3;
            obj2 = obj;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        grd grd2 = ah2.V0;
        grd2.m((Object) null, yf2.a((yf2) grd2.getValue(), new xf2((vy5) obj2, false, false, 6)));
        ah2.Q0.updateAndGet(new gg2(j));
        return jue;
    }
}
