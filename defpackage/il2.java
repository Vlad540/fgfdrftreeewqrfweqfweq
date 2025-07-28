package defpackage;

import android.net.Uri;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.chatscreen.ChatScreen;

/* renamed from: il2  reason: default package */
public final class il2 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public il2(Continuation continuation, ChatScreen chatScreen) {
        super(2, continuation);
        this.Y = chatScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((il2) n(obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        il2 il2 = new il2(continuation, this.Y);
        il2.X = obj;
        return il2;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        wt8 wt8 = (au8) this.X;
        k77[] k77Arr = ChatScreen.n1;
        ChatScreen chatScreen = this.Y;
        chatScreen.getClass();
        if (wt8 instanceof wt8) {
            chatScreen.L0().s();
            nn2 L0 = chatScreen.L0();
            jv5 jv5 = wt8.a;
            i22 i22 = (i22) L0.Z0.a.getValue();
            if (i22 != null) {
                taf.n(L0, L0.u().b(), (ru3) null, new km2(i22.a, L0, jv5, (Continuation) null), 2);
            }
        } else if (wt8 instanceof xt8) {
            nn2 L02 = chatScreen.L0();
            Uri uri = ((xt8) wt8).a;
            Long w = chatScreen.B0().w();
            qod D = xs7.D(L02.a, L02.u().b(), ru3.b, new xm2(L02, uri, w, (Continuation) null));
            L02.M0.o1(L02, nn2.g1[0], D);
        } else if (wt8 instanceof yt8) {
            ((yt8) wt8).getClass();
            chatScreen.N0(true);
        } else if (hhd.f(wt8, zt8.a)) {
            chatScreen.O0();
        } else if (wt8 instanceof vt8) {
            nn2 L03 = chatScreen.L0();
            CharSequence charSequence = ((vt8) wt8).a;
            Long u = chatScreen.B0().u();
            k77[] k77Arr2 = nn2.g1;
            L03.t(charSequence, u, (List) null, false);
            nu8.C(chatScreen.B0(), (Long) null, (CharSequence) null, (Integer) null, 14);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return jue.a;
    }
}
