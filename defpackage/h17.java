package defpackage;

import android.view.View;
import kotlin.coroutines.Continuation;
import one.me.inviteactions.invitebyphone.InviteByPhoneScreen;

/* renamed from: h17  reason: default package */
public final class h17 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ InviteByPhoneScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h17(Continuation continuation, InviteByPhoneScreen inviteByPhoneScreen) {
        super(2, continuation);
        this.Y = inviteByPhoneScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((h17) n((sg9) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        h17 h17 = new h17(continuation, this.Y);
        h17.X = obj;
        return h17;
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [rr3, one.me.inviteactions.invitebyphone.InviteByPhoneScreen, java.lang.Object] */
    public final Object o(Object obj) {
        wx3.H(obj);
        a34 a34 = (sg9) this.X;
        if (a34 instanceof a34) {
            z07.c.R1(a34);
        }
        ? r3 = this.Y;
        bm3.p(r3);
        View view = r3.getView();
        if (view != null) {
            view.postDelayed(new eq6(1, r3), 600);
        }
        return jue.a;
    }
}
