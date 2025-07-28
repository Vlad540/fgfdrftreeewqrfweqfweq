package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.Continuation;

/* renamed from: w77  reason: default package */
public final class w77 extends l5e implements k26 {
    public final /* synthetic */ int X;
    public /* synthetic */ RecyclerView Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w77(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.X = i2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        RecyclerView recyclerView = (RecyclerView) obj;
        pda pda = (pda) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.X) {
            case 0:
                w77 w77 = new w77(3, continuation, 0);
                w77.Y = recyclerView;
                jue jue = jue.a;
                w77.o(jue);
                return jue;
            case 1:
                w77 w772 = new w77(3, continuation, 1);
                w772.Y = recyclerView;
                jue jue2 = jue.a;
                w772.o(jue2);
                return jue2;
            default:
                w77 w773 = new w77(3, continuation, 2);
                w773.Y = recyclerView;
                jue jue3 = jue.a;
                w773.o(jue3);
                return jue3;
        }
    }

    public final Object o(Object obj) {
        switch (this.X) {
            case 0:
                wx3.H(obj);
                RecyclerView recyclerView = this.Y;
                recyclerView.setBackgroundColor(km4.y0.r(recyclerView).b().j);
                return jue.a;
            case 1:
                wx3.H(obj);
                RecyclerView recyclerView2 = this.Y;
                recyclerView2.setBackgroundColor(km4.y0.r(recyclerView2).b().k);
                return jue.a;
            default:
                wx3.H(obj);
                RecyclerView recyclerView3 = this.Y;
                s59 s59 = km4.y0;
                recyclerView3.setBackgroundColor(s59.r(recyclerView3).b().j);
                km4.d(s59.n(recyclerView3.getContext()), recyclerView3);
                return jue.a;
        }
    }
}
