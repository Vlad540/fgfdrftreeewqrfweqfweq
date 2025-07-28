package defpackage;

import java.util.Collections;
import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.chats.search.ChatsListSearchScreen;

/* renamed from: yr2  reason: default package */
public final class yr2 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatsListSearchScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yr2(Continuation continuation, ChatsListSearchScreen chatsListSearchScreen) {
        super(2, continuation);
        this.Y = chatsListSearchScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((yr2) n(obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        yr2 yr2 = new yr2(continuation, this.Y);
        yr2.X = obj;
        return yr2;
    }

    /* JADX WARNING: type inference failed for: r12v4, types: [i41, ig7] */
    /* JADX WARNING: type inference failed for: r11v3, types: [i41, ig7] */
    /* JADX WARNING: type inference failed for: r4v1, types: [i41, ig7] */
    /* JADX WARNING: type inference failed for: r4v3, types: [i41, ig7] */
    /* JADX WARNING: type inference failed for: r3v3, types: [i41, ig7] */
    /* JADX WARNING: type inference failed for: r3v4, types: [i41, ig7] */
    /* JADX WARNING: type inference failed for: r12v12, types: [i41, ig7] */
    /* JADX WARNING: type inference failed for: r2v7, types: [i41, ig7] */
    public final Object o(Object obj) {
        wx3.H(obj);
        js2 js2 = (js2) this.X;
        ChatsListSearchScreen chatsListSearchScreen = this.Y;
        k77[] k77Arr = ChatsListSearchScreen.N0;
        chatsListSearchScreen.getClass();
        Class<ChatsListSearchScreen> cls = ChatsListSearchScreen.class;
        String name = cls.getName();
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            tn7 tn7 = tn7.X;
            fn6.d(tn7, name, "updateState " + js2, (Throwable) null);
        }
        int ordinal = js2.a.ordinal();
        hw4 hw4 = hw4.a;
        if (ordinal == 0) {
            chatsListSearchScreen.l0();
            chatsListSearchScreen.E0.E(hw4);
            chatsListSearchScreen.G0.E(hw4);
            chatsListSearchScreen.F0.E(Collections.singletonList(rj7.a));
        } else if (ordinal != 2) {
            mnc mnc = mnc.C0;
            if (ordinal == 3) {
                List list = js2.d;
                boolean z = js2.e;
                chatsListSearchScreen.F0.E(hw4);
                chatsListSearchScreen.l0();
                chatsListSearchScreen.G0.E(hw4);
                chatsListSearchScreen.E0.F(list, new t50(z, (Object) chatsListSearchScreen, 8));
                xg9.g((xg9) chatsListSearchScreen.b.getValue(), mnc);
            } else if (ordinal == 4) {
                chatsListSearchScreen.F0.E(hw4);
                chatsListSearchScreen.l0();
                chatsListSearchScreen.E0.E(hw4);
                chatsListSearchScreen.G0.F(Collections.singletonList(ow4.a), new ds1(10, chatsListSearchScreen));
                xg9.g((xg9) chatsListSearchScreen.b.getValue(), mnc);
            }
        } else {
            dp6 dp6 = js2.c;
            boolean z2 = js2.e;
            chatsListSearchScreen.F0.E(hw4);
            chatsListSearchScreen.E0.E(hw4);
            chatsListSearchScreen.G0.E(hw4);
            String name2 = cls.getName();
            fn6 fn62 = udd.e;
            if (fn62 != null && fn62.c()) {
                fn62.d(tn7.X, name2, "idleSearchData.recentContacts = ".concat(o23.c0(dp6.a, (String) null, (String) null, (String) null, (u16) null, 63)), (Throwable) null);
            }
            chatsListSearchScreen.z0.F(Collections.singletonList(dp6.a), new vr2(z2, chatsListSearchScreen, dp6));
            xg9.g((xg9) chatsListSearchScreen.b.getValue(), mnc.B0);
        }
        return jue.a;
    }
}
