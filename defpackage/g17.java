package defpackage;

import kotlin.coroutines.Continuation;
import me.leolin.shortcutbadger.BuildConfig;
import one.me.inviteactions.invitebyphone.InviteByPhoneScreen;

/* renamed from: g17  reason: default package */
public final class g17 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ InviteByPhoneScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g17(Continuation continuation, InviteByPhoneScreen inviteByPhoneScreen) {
        super(2, continuation);
        this.Y = inviteByPhoneScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((g17) n(obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        g17 g17 = new g17(continuation, this.Y);
        g17.X = obj;
        return g17;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        iv3 iv3 = (iv3) this.X;
        v3a v3a = iv3.a;
        k77[] k77Arr = InviteByPhoneScreen.F0;
        InviteByPhoneScreen inviteByPhoneScreen = this.Y;
        inviteByPhoneScreen.getClass();
        k77 k77 = InviteByPhoneScreen.F0[6];
        inviteByPhoneScreen.D0.b(inviteByPhoneScreen, v3a);
        b07 b07 = inviteByPhoneScreen.C0;
        t97 t97 = inviteByPhoneScreen.B0;
        int i = iv3.b;
        v3a v3a2 = iv3.a;
        if (b07 == null) {
            b07 b072 = new b07((loa) t97.getValue(), v3a2.a, v3a2.b, i);
            inviteByPhoneScreen.C0 = b072;
            inviteByPhoneScreen.n0().A0.addTextChangedListener(b072);
        } else {
            b07.b(v3a2.b, v3a2.a);
            b07 b073 = inviteByPhoneScreen.C0;
            if (b073 != null) {
                b073.Y = i;
            }
        }
        r17 o0 = inviteByPhoneScreen.o0();
        loa loa = (loa) t97.getValue();
        cpa e = loa.e(v3a2.a);
        o0.D0 = !loa.m(e) ? Integer.MAX_VALUE : loa.d(e, 1).length();
        CharSequence a = iv3.c.a(inviteByPhoneScreen.getContext());
        if (a == null) {
            a = BuildConfig.FLAVOR;
        }
        y7a n0 = inviteByPhoneScreen.n0();
        n0.setHint(a);
        n0.setCountry(v3a2);
        return jue.a;
    }
}
