package defpackage;

import android.view.View;
import kotlin.coroutines.Continuation;

/* renamed from: uo3  reason: default package */
public final class uo3 extends l5e implements k26 {
    public final /* synthetic */ int X;
    public /* synthetic */ View Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uo3(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.X = i2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        View view = (View) obj;
        pda pda = (pda) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.X) {
            case 0:
                uo3 uo3 = new uo3(3, continuation, 0);
                uo3.Y = view;
                jue jue = jue.a;
                uo3.o(jue);
                return jue;
            default:
                uo3 uo32 = new uo3(3, continuation, 1);
                uo32.Y = view;
                jue jue2 = jue.a;
                uo32.o(jue2);
                return jue2;
        }
    }

    public final Object o(Object obj) {
        switch (this.X) {
            case 0:
                wx3.H(obj);
                View view = this.Y;
                view.setBackgroundColor(km4.y0.r(view).b().i);
                return jue.a;
            default:
                wx3.H(obj);
                View view2 = this.Y;
                view2.setBackgroundColor(km4.y0.r(view2).h().k);
                return jue.a;
        }
    }
}
