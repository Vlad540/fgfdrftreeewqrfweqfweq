package defpackage;

import android.widget.LinearLayout;
import kotlin.coroutines.Continuation;

/* renamed from: jc1  reason: default package */
public final class jc1 extends l5e implements k26 {
    public final /* synthetic */ int X;
    public /* synthetic */ LinearLayout Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jc1(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.X = i2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LinearLayout linearLayout = (LinearLayout) obj;
        pda pda = (pda) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.X) {
            case 0:
                jc1 jc1 = new jc1(3, continuation, 0);
                jc1.Y = linearLayout;
                jue jue = jue.a;
                jc1.o(jue);
                return jue;
            case 1:
                jc1 jc12 = new jc1(3, continuation, 1);
                jc12.Y = linearLayout;
                jue jue2 = jue.a;
                jc12.o(jue2);
                return jue2;
            default:
                jc1 jc13 = new jc1(3, continuation, 2);
                jc13.Y = linearLayout;
                jue jue3 = jue.a;
                jc13.o(jue3);
                return jue3;
        }
    }

    public final Object o(Object obj) {
        switch (this.X) {
            case 0:
                wx3.H(obj);
                this.Y.setBackgroundColor(-14342611);
                return jue.a;
            case 1:
                wx3.H(obj);
                LinearLayout linearLayout = this.Y;
                linearLayout.setBackgroundColor(km4.y0.r(linearLayout).b().k);
                return jue.a;
            default:
                wx3.H(obj);
                LinearLayout linearLayout2 = this.Y;
                linearLayout2.setBackgroundColor(km4.y0.r(linearLayout2).b().h);
                return jue.a;
        }
    }
}
