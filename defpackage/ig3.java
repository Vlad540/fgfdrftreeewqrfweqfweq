package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.profile.screens.avatars.ContactAvatarsScreen;
import one.me.sdk.arch.Widget;

/* renamed from: ig3  reason: default package */
public final class ig3 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ContactAvatarsScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ig3(Continuation continuation, ContactAvatarsScreen contactAvatarsScreen) {
        super(2, continuation);
        this.Y = contactAvatarsScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n(obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        ig3 ig3 = new ig3(continuation, this.Y);
        ig3.X = obj;
        return ig3;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        ug3 ug3 = (ug3) this.X;
        boolean f = hhd.f(ug3, tg3.a);
        ContactAvatarsScreen contactAvatarsScreen = this.Y;
        if (f) {
            k77[] k77Arr = ContactAvatarsScreen.D0;
            contactAvatarsScreen.u0(true);
        } else if (hhd.f(ug3, pg3.a)) {
            k77[] k77Arr2 = ContactAvatarsScreen.D0;
            contactAvatarsScreen.u0(false);
        } else if (hhd.f(ug3, og3.a)) {
            k77[] k77Arr3 = ContactAvatarsScreen.D0;
            contactAvatarsScreen.getRouter().C();
        } else if (ug3 instanceof rg3) {
            k77[] k77Arr4 = ContactAvatarsScreen.D0;
            contactAvatarsScreen.getClass();
            String str = oyb.g;
            oyb.Q(contactAvatarsScreen.getContext(), ((rg3) ug3).a, "image/*");
        } else if (ug3 instanceof qg3) {
            qg3 qg3 = (qg3) ug3;
            k77[] k77Arr5 = ContactAvatarsScreen.D0;
            contactAvatarsScreen.getClass();
            CharSequence a = qg3.a.a(contactAvatarsScreen.getContext());
            if (a != null) {
                int i = qg3.b ? phc.J : phc.n;
                hba hba = new hba((Widget) contactAvatarsScreen);
                hba.f(new vba(i));
                hba.i(a);
                hba.j();
            }
        } else if (ug3 instanceof sg3) {
            sg3 sg3 = (sg3) ug3;
            int size = contactAvatarsScreen.A0.A0.size();
            int i2 = sg3.a;
            if (i2 >= 0 && i2 < size) {
                contactAvatarsScreen.z0().e(sg3.a, true);
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return jue.a;
    }
}
