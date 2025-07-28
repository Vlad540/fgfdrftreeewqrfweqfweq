package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chatscreen.ChatScreen;

/* renamed from: mk2  reason: default package */
public final class mk2 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ ChatScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mk2(Continuation continuation, ChatScreen chatScreen) {
        super(2, continuation);
        this.Y = chatScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((mk2) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new mk2(continuation, this.Y);
    }

    /* JADX WARNING: type inference failed for: r10v1, types: [rr3, one.me.chatscreen.ChatScreen, java.lang.Object] */
    public final Object o(Object obj) {
        Object obj2 = pu3.a;
        int i = this.X;
        Object obj3 = jue.a;
        if (i == 0) {
            wx3.H(obj);
            ? r10 = this.Y;
            if (r10.getView() == null) {
                return obj3;
            }
            pj5 z = ez3.z(new v11(r10.F0().Y, r10.L0().e1, new c3(r10, (Continuation) null, 6), 4));
            lk2 lk2 = new lk2((Continuation) null, r10);
            this.X = 1;
            Object c = z.c(new bk5(bl9.a, lk2, 4), this);
            if (c != obj2) {
                c = obj3;
            }
            if (c != obj2) {
                c = obj3;
            }
            if (c == obj2) {
                return obj2;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj3;
    }
}
