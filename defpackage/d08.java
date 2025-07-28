package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* renamed from: d08  reason: default package */
public final class d08 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ i08 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d08(i08 i08, Continuation continuation) {
        super(2, continuation);
        this.Y = i08;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((d08) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new d08(this.Y, continuation);
    }

    public final Object o(Object obj) {
        boolean z;
        int i;
        pu3 pu3 = pu3.a;
        int i2 = this.X;
        if (i2 == 0) {
            wx3.H(obj);
            i08 i08 = this.Y;
            CharSequence charSequence = i08.q(i08).f.k;
            t97 t97 = i08.o;
            ((wk7) t97.getValue()).f.k = null;
            grd grd = i08.w0;
            int ordinal = ((qz) grd.getValue()).ordinal();
            if (ordinal == 0) {
                z = false;
            } else if (ordinal == 1) {
                z = true;
            } else {
                throw new NoWhenBranchMatchedException();
            }
            pwc pwc = ((wk7) t97.getValue()).f;
            qz qzVar = (qz) grd.getValue();
            qzVar.getClass();
            int i3 = pz.$EnumSwitchMapping$0[qzVar.ordinal()];
            if (i3 != 1) {
                i = 2;
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                i = 3;
            }
            pwc.p(i);
            taf.o(i08.A0, new vz7(charSequence, ((wk7) t97.getValue()).f.d(), z));
            vy7 vy7 = new vy7(true);
            this.X = 1;
            if (i08.x0.o(vy7, this) == pu3) {
                return pu3;
            }
        } else if (i2 == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return jue.a;
    }
}
