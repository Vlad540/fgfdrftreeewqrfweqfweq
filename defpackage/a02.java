package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.profile.screens.changeowner.ChangeOwnerScreen;
import one.me.sdk.arch.Widget;

/* renamed from: a02  reason: default package */
public final class a02 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChangeOwnerScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a02(Continuation continuation, ChangeOwnerScreen changeOwnerScreen) {
        super(2, continuation);
        this.Y = changeOwnerScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n(obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        a02 a02 = new a02(continuation, this.Y);
        a02.X = obj;
        return a02;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        b02 b02 = (b02) this.X;
        if (b02 instanceof b02) {
            hba hba = new hba((Widget) this.Y);
            hba.h(b02.a);
            Integer num = b02.b;
            if (num != null) {
                hba.f(new vba(num.intValue()));
            }
            hba.j();
            return jue.a;
        }
        throw new NoWhenBranchMatchedException();
    }
}
