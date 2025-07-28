package defpackage;

import android.view.View;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.chatscreen.ChatScreen;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* renamed from: hl2  reason: default package */
public final class hl2 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hl2(Continuation continuation, ChatScreen chatScreen) {
        super(2, continuation);
        this.Y = chatScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((hl2) n(obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        hl2 hl2 = new hl2(continuation, this.Y);
        hl2.X = obj;
        return hl2;
    }

    public final Object o(Object obj) {
        MessageWriteWidget C0;
        View view;
        wx3.H(obj);
        lx8 lx8 = (mx8) this.X;
        boolean z = lx8 instanceof lx8;
        ChatScreen chatScreen = this.Y;
        if (z) {
            k77[] k77Arr = ChatScreen.n1;
            Long w = chatScreen.B0().w();
            lx8 lx82 = lx8;
            long j = lx82.a;
            if (!(w == null || w.longValue() != j || (C0 = chatScreen.C0()) == null || (view = C0.getView()) == null)) {
                view.requestFocus();
            }
            chatScreen.B0().D(new Long(lx82.a));
        } else if (lx8 instanceof kx8) {
            k77[] k77Arr2 = ChatScreen.n1;
            nu8 B0 = chatScreen.B0();
            Long l = new Long(((kx8) lx8).a);
            MessageWriteWidget C02 = chatScreen.C0();
            Integer num = null;
            CharSequence text = C02 != null ? C02.p0().getText() : null;
            MessageWriteWidget C03 = chatScreen.C0();
            if (C03 != null) {
                num = new Integer(C03.p0().getCursorPosition());
            }
            nu8.C(B0, l, text, num, 8);
        } else if (lx8 instanceof ix8) {
            k77[] k77Arr3 = ChatScreen.n1;
            if (chatScreen.G0().getState() == paa.c || chatScreen.G0().getState() == paa.o) {
                chatScreen.G0().b();
            }
        } else if (lx8 instanceof jx8) {
            k77[] k77Arr4 = ChatScreen.n1;
            nn2 L0 = chatScreen.L0();
            String str = ((jx8) lx8).a;
            Long w2 = chatScreen.B0().w();
            pt8 v = chatScreen.B0().v();
            i22 i22 = (i22) L0.Z0.a.getValue();
            if (i22 != null) {
                L0.R0.o1(L0, nn2.g1[5], xs7.D(L0.a, L0.u().b(), ru3.b, new um2(str, i22, L0, w2, v, (Continuation) null)));
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return jue.a;
    }
}
