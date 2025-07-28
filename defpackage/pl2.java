package defpackage;

import kotlin.coroutines.Continuation;
import me.leolin.shortcutbadger.BuildConfig;
import one.me.chatscreen.ChatScreen;

/* renamed from: pl2  reason: default package */
public final class pl2 implements oaa {
    public final /* synthetic */ ChatScreen a;

    public pl2(ChatScreen chatScreen) {
        this.a = chatScreen;
    }

    public final void I(CharSequence charSequence) {
        k77[] k77Arr = ChatScreen.n1;
        hi2 hi2 = this.a.F0().o;
        hi2.getClass();
        if (charSequence != null) {
            charSequence.toString();
        }
        String obj = charSequence != null ? charSequence.toString() : null;
        if (obj == null) {
            obj = BuildConfig.FLAVOR;
        }
        String str = obj;
        ki2 ki2 = (ki2) hi2.a;
        ki2.getClass();
        udd.p("ki2", "Search text changed ".concat(str), new Object[0]);
        ki2.a();
        ki2.c = str;
        if (str.length() == 0) {
            hi2 hi22 = ki2.g;
            if (hi22 != null) {
                hi22.f();
                return;
            }
            return;
        }
        xs7.E(ki2.e, (hu3) null, (ru3) null, new ii2(ki2, str, 0, (Continuation) null), 3);
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [rr3, one.me.chatscreen.ChatScreen, java.lang.Object] */
    public final void T() {
        ? r4 = this.a;
        if (r4.getView() != null) {
            if (r4.J0().b()) {
                r4.J0().postDelayed(new ds1(9, r4), 200);
            } else {
                r4.J0().f(true);
            }
            r4.F0().q();
        }
    }

    public final void f() {
        k77[] k77Arr = ChatScreen.n1;
        this.a.J0().f(false);
    }

    public final void n() {
        k77[] k77Arr = ChatScreen.n1;
        this.a.F0().r(true);
    }
}
