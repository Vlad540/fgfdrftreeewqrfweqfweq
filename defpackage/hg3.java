package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.profile.screens.avatars.ContactAvatarsScreen;

/* renamed from: hg3  reason: default package */
public final class hg3 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ContactAvatarsScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hg3(Continuation continuation, ContactAvatarsScreen contactAvatarsScreen) {
        super(2, continuation);
        this.Y = contactAvatarsScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n(obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        hg3 hg3 = new hg3(continuation, this.Y);
        hg3.X = obj;
        return hg3;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        List list = (List) this.X;
        ContactAvatarsScreen contactAvatarsScreen = this.Y;
        eg3 eg3 = contactAvatarsScreen.A0;
        if (!eg3.A0.isEmpty() || !(!list.isEmpty())) {
            ug4 e = iu7.e(new l61(1, eg3.A0, list));
            eg3.A0 = list;
            e.a(new c9(0, eg3));
        } else {
            eg3.A0 = list;
            eg3.p(0, list.size());
        }
        ContactAvatarsScreen.t0(contactAvatarsScreen, contactAvatarsScreen.z0().getCurrentItem());
        return jue.a;
    }
}
