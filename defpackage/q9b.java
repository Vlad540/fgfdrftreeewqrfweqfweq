package defpackage;

import androidx.coordinatorlayout.widget.CoordinatorLayout;
import kotlin.coroutines.Continuation;

/* renamed from: q9b  reason: default package */
public final class q9b extends l5e implements k26 {
    public final /* synthetic */ int X;
    public /* synthetic */ CoordinatorLayout Y;
    public /* synthetic */ pda Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q9b(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.X = i2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) obj;
        pda pda = (pda) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.X) {
            case 0:
                q9b q9b = new q9b(3, continuation, 0);
                q9b.Y = coordinatorLayout;
                q9b.Z = pda;
                jue jue = jue.a;
                q9b.o(jue);
                return jue;
            default:
                q9b q9b2 = new q9b(3, continuation, 1);
                q9b2.Y = coordinatorLayout;
                q9b2.Z = pda;
                jue jue2 = jue.a;
                q9b2.o(jue2);
                return jue2;
        }
    }

    public final Object o(Object obj) {
        switch (this.X) {
            case 0:
                wx3.H(obj);
                this.Y.setBackgroundColor(this.Z.b().h);
                return jue.a;
            default:
                wx3.H(obj);
                this.Y.setBackgroundColor(this.Z.b().h);
                return jue.a;
        }
    }
}
