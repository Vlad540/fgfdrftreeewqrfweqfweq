package defpackage;

import android.widget.FrameLayout;
import kotlin.coroutines.Continuation;

/* renamed from: d78  reason: default package */
public final class d78 extends l5e implements k26 {
    public final /* synthetic */ int X;
    public /* synthetic */ FrameLayout Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d78(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.X = i2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        FrameLayout frameLayout = (FrameLayout) obj;
        pda pda = (pda) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.X) {
            case 0:
                d78 d78 = new d78(3, continuation, 0);
                d78.Y = frameLayout;
                jue jue = jue.a;
                d78.o(jue);
                return jue;
            case 1:
                d78 d782 = new d78(3, continuation, 1);
                d782.Y = frameLayout;
                jue jue2 = jue.a;
                d782.o(jue2);
                return jue2;
            case 2:
                d78 d783 = new d78(3, continuation, 2);
                d783.Y = frameLayout;
                jue jue3 = jue.a;
                d783.o(jue3);
                return jue3;
            case 3:
                d78 d784 = new d78(3, continuation, 3);
                d784.Y = frameLayout;
                jue jue4 = jue.a;
                d784.o(jue4);
                return jue4;
            default:
                d78 d785 = new d78(3, continuation, 4);
                d785.Y = frameLayout;
                jue jue5 = jue.a;
                d785.o(jue5);
                return jue5;
        }
    }

    public final Object o(Object obj) {
        switch (this.X) {
            case 0:
                wx3.H(obj);
                FrameLayout frameLayout = this.Y;
                frameLayout.setBackgroundColor(km4.y0.r(frameLayout).b().j);
                return jue.a;
            case 1:
                wx3.H(obj);
                FrameLayout frameLayout2 = this.Y;
                frameLayout2.setBackgroundColor(km4.y0.r(frameLayout2).b().k);
                return jue.a;
            case 2:
                wx3.H(obj);
                FrameLayout frameLayout3 = this.Y;
                frameLayout3.setBackgroundColor(km4.y0.r(frameLayout3).a().d().a.a);
                return jue.a;
            case 3:
                wx3.H(obj);
                FrameLayout frameLayout4 = this.Y;
                frameLayout4.setBackgroundColor(km4.y0.r(frameLayout4).b().i);
                return jue.a;
            default:
                wx3.H(obj);
                FrameLayout frameLayout5 = this.Y;
                frameLayout5.setBackgroundColor(km4.y0.r(frameLayout5).b().i);
                return jue.a;
        }
    }
}
