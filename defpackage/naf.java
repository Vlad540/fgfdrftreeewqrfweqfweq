package defpackage;

import android.view.View;
import android.view.ViewGroup;
import kotlin.coroutines.Continuation;

/* renamed from: naf  reason: default package */
public final class naf extends icc implements i26 {
    public final /* synthetic */ View X;
    public int c;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public naf(View view, Continuation continuation) {
        super(2, continuation);
        this.X = view;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((naf) n((gyc) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        naf naf = new naf(this.X, continuation);
        naf.o = obj;
        return naf;
    }

    public final Object o(Object obj) {
        Object obj2;
        Object obj3 = pu3.a;
        int i = this.c;
        View view = this.X;
        if (i != 0) {
            Object obj4 = jue.a;
            if (i == 1) {
                gyc gyc = (gyc) this.o;
                wx3.H(obj);
                if (view instanceof ViewGroup) {
                    this.o = null;
                    this.c = 2;
                    gyc.getClass();
                    uqe uqe = new uqe(new u1(4, (ViewGroup) view));
                    if (!uqe.b.hasNext()) {
                        obj2 = obj4;
                    } else {
                        gyc.c = uqe;
                        gyc.a = 2;
                        gyc.o = this;
                        obj2 = obj3;
                    }
                    if (obj2 != obj3) {
                        obj2 = obj4;
                    }
                    if (obj2 == obj3) {
                        return obj3;
                    }
                }
            } else if (i == 2) {
                wx3.H(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj4;
        }
        wx3.H(obj);
        gyc gyc2 = (gyc) this.o;
        this.o = gyc2;
        this.c = 1;
        gyc2.b(view, this);
        return obj3;
    }
}
