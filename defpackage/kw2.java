package defpackage;

import kotlin.coroutines.Continuation;
import me.leolin.shortcutbadger.BuildConfig;
import one.me.chats.tab.ChatsTabWidget;

/* renamed from: kw2  reason: default package */
public final class kw2 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatsTabWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kw2(Continuation continuation, ChatsTabWidget chatsTabWidget) {
        super(2, continuation);
        this.Y = chatsTabWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((kw2) n((we6) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        kw2 kw2 = new kw2(continuation, this.Y);
        kw2.X = obj;
        return kw2;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        we6 we6 = (we6) this.X;
        ChatsTabWidget chatsTabWidget = this.Y;
        k77[] k77Arr = ChatsTabWidget.F0;
        String name = ChatsTabWidget.class.getName();
        fn6 fn6 = udd.e;
        CharSequence charSequence = null;
        if (fn6 != null) {
            chatsTabWidget.getClass();
            if (fn6.c()) {
                tn7 tn7 = tn7.X;
                fn6.d(tn7, name, "handleHeaderStateUpdate: state=" + we6, (Throwable) null);
            }
        }
        ire.b(chatsTabWidget.n0());
        i80 i80 = new i80();
        boolean z = false;
        i80.W(0);
        ire.a(chatsTabWidget.n0(), i80);
        nea n0 = chatsTabWidget.n0();
        CharSequence a = we6.a.a(chatsTabWidget.getContext());
        if (a == null) {
            a = BuildConfig.FLAVOR;
        }
        n0.setTitle(a);
        nea n02 = chatsTabWidget.n0();
        mge mge = we6.b;
        if (mge != null) {
            charSequence = mge.a(chatsTabWidget.getContext());
        }
        n02.setSubtitle(charSequence);
        nea n03 = chatsTabWidget.n0();
        if (we6.b != null) {
            z = true;
        }
        n03.setTextShimmerEnabled(z);
        return jue.a;
    }
}
