package defpackage;

import android.animation.AnimatorSet;
import kotlin.coroutines.Continuation;
import one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget;

/* renamed from: n4c  reason: default package */
public final class n4c extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ RecordControlsWidget Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n4c(Continuation continuation, RecordControlsWidget recordControlsWidget) {
        super(2, continuation);
        this.Z = recordControlsWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        n4c n4c = new n4c(continuation, this.Z);
        n4c.Y = obj;
        return n4c;
    }

    public final Object o(Object obj) {
        ou3 ou3;
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            ou3 = (ou3) this.Y;
        } else if (i == 1) {
            ou3 = (ou3) this.Y;
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        while (n1g.A(ou3)) {
            k77[] k77Arr = RecordControlsWidget.m1;
            RecordControlsWidget recordControlsWidget = this.Z;
            int a = recordControlsWidget.L0().v().a();
            recordControlsWidget.r0().clearAnimation();
            float f = 1.45f;
            float f2 = ((((float) a) * 1.45f) / ((float) 32768)) + ((float) 1);
            if (f2 <= 1.45f) {
                f = f2;
            }
            lg7 M = z3d.M(recordControlsWidget.r0(), recordControlsWidget.c1, f, 100, 0);
            AnimatorSet animatorSet = new AnimatorSet();
            recordControlsWidget.g1 = animatorSet;
            animatorSet.setInterpolator((p85) recordControlsWidget.X0.getValue());
            AnimatorSet animatorSet2 = recordControlsWidget.g1;
            if (animatorSet2 != null) {
                animatorSet2.playTogether(M);
            }
            AnimatorSet animatorSet3 = recordControlsWidget.g1;
            if (animatorSet3 != null) {
                animatorSet3.start();
            }
            recordControlsWidget.c1 = f;
            this.Y = ou3;
            this.X = 1;
            if (ek8.q(100, this) == pu3) {
                return pu3;
            }
        }
        return jue.a;
    }
}
