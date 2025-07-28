package defpackage;

import android.view.View;
import kotlin.coroutines.Continuation;

/* renamed from: a3  reason: default package */
public final class a3 extends l5e implements k26 {
    public final /* synthetic */ int X;
    public /* synthetic */ View Y;
    public /* synthetic */ pda Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a3(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.X = i2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        View view = (View) obj;
        pda pda = (pda) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.X) {
            case 0:
                a3 a3Var = new a3(3, continuation, 0);
                a3Var.Y = view;
                a3Var.Z = pda;
                jue jue = jue.a;
                a3Var.o(jue);
                return jue;
            case 1:
                a3 a3Var2 = new a3(3, continuation, 1);
                a3Var2.Y = view;
                a3Var2.Z = pda;
                jue jue2 = jue.a;
                a3Var2.o(jue2);
                return jue2;
            default:
                a3 a3Var3 = new a3(3, continuation, 2);
                a3Var3.Y = view;
                a3Var3.Z = pda;
                jue jue3 = jue.a;
                a3Var3.o(jue3);
                return jue3;
        }
    }

    public final Object o(Object obj) {
        switch (this.X) {
            case 0:
                wx3.H(obj);
                this.Y.setBackgroundColor(this.Z.h().j);
                return jue.a;
            case 1:
                wx3.H(obj);
                this.Y.setBackgroundColor(this.Z.h().k);
                return jue.a;
            default:
                wx3.H(obj);
                this.Y.setBackgroundColor(this.Z.b().i);
                return jue.a;
        }
    }
}
