package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;
import one.me.startconversation.channel.PickSubscribersScreen;

/* renamed from: sqa  reason: default package */
public final class sqa extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ PickSubscribersScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sqa(PickSubscribersScreen pickSubscribersScreen, Continuation continuation) {
        super(2, continuation);
        this.Y = pickSubscribersScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((cqa) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        sqa sqa = new sqa(this.Y, continuation);
        sqa.X = obj;
        return sqa;
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [one.me.startconversation.channel.PickSubscribersScreen, one.me.sdk.arch.Widget] */
    public final Object o(Object obj) {
        wx3.H(obj);
        cqa cqa = (cqa) this.X;
        boolean z = cqa instanceof bqa;
        ? r3 = this.Y;
        if (z) {
            k77[] k77Arr = PickSubscribersScreen.D0;
            r3.w0().setProgressEnabled(false);
            mpd.c.b2(new e98(r3, cqa, 13));
        } else if (hhd.f(cqa, aqa.a)) {
            k77[] k77Arr2 = PickSubscribersScreen.D0;
            r3.w0().setProgressEnabled(false);
            mpd.c.b2(new oqa(r3, 1));
            hba hba = new hba((Widget) r3);
            hba.h(new hge(lca.a));
            hba.f(new vba(phc.t1));
            hba.j();
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return jue.a;
    }
}
