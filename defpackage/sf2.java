package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;

/* renamed from: sf2  reason: default package */
public final class sf2 extends l5e implements i26 {
    public /* synthetic */ long X;
    public final /* synthetic */ ChatMediaViewerScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sf2(Continuation continuation, ChatMediaViewerScreen chatMediaViewerScreen) {
        super(2, continuation);
        this.Y = chatMediaViewerScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((sf2) n(new zp4(((zp4) obj).a), (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        sf2 sf2 = new sf2(continuation, this.Y);
        sf2.X = ((zp4) obj).a;
        return sf2;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        long j = this.X;
        ChatMediaViewerScreen chatMediaViewerScreen = this.Y;
        boolean z = chatMediaViewerScreen.L0;
        jue jue = jue.a;
        if (z) {
            return jue;
        }
        cw6 y0 = chatMediaViewerScreen.y0();
        long e = zp4.e(j);
        k7f z0 = chatMediaViewerScreen.z0();
        y0.c(e, z0.Z != null ? z0.o.e0() : 0, chatMediaViewerScreen.z0().G0());
        return jue;
    }
}
