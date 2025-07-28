package defpackage;

import kotlin.coroutines.Continuation;
import one.me.login.inputname.InputNameScreen;

/* renamed from: nx6  reason: default package */
public final class nx6 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ InputNameScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nx6(Continuation continuation, InputNameScreen inputNameScreen) {
        super(2, continuation);
        this.Y = inputNameScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n(obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        nx6 nx6 = new nx6(continuation, this.Y);
        nx6.X = obj;
        return nx6;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        boolean booleanValue = ((Boolean) this.X).booleanValue();
        InputNameScreen inputNameScreen = this.Y;
        if (booleanValue) {
            k77[] k77Arr = InputNameScreen.F0;
            boolean b = ((qna) inputNameScreen.Y.getValue()).b(qna.f);
            t97 t97 = inputNameScreen.Y;
            t97 t972 = inputNameScreen.Z;
            if (!b) {
                ((lqc) ((f03) t972.getValue())).i("app.writeConctatsRequested", true);
                ((qna) t97.getValue()).e(new jrf(inputNameScreen, 1));
            } else if (!((qna) t97.getValue()).b(qna.g)) {
                lqc lqc = (lqc) ((f03) t972.getValue());
                lqc.getClass();
                if (!((i03) lqc).g.getBoolean("app.writeConctatsRequested", false)) {
                    ((lqc) ((f03) t972.getValue())).i("app.writeConctatsRequested", true);
                    ((qna) t97.getValue()).e(new jrf(inputNameScreen, 1));
                }
            }
        } else {
            int i = e87.a;
            if (!e87.b(e87.c)) {
                k77[] k77Arr2 = InputNameScreen.F0;
                bm3.H(inputNameScreen.m0().a);
            }
        }
        return jue.a;
    }
}
