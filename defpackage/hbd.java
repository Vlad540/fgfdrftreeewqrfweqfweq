package defpackage;

import kotlin.coroutines.Continuation;
import one.me.sharedata.ShareDataPickerScreen;

/* renamed from: hbd  reason: default package */
public final class hbd extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ShareDataPickerScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hbd(ShareDataPickerScreen shareDataPickerScreen, Continuation continuation) {
        super(2, continuation);
        this.Y = shareDataPickerScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((abd) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        hbd hbd = new hbd(this.Y, continuation);
        hbd.X = obj;
        return hbd;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        if (hhd.f((abd) this.X, abd.a)) {
            ShareDataPickerScreen shareDataPickerScreen = this.Y;
            String string = shareDataPickerScreen.getArgs().getString("tag");
            if (string != null) {
                jbd g = shareDataPickerScreen.getRouter().g(string);
                if ((g instanceof jbd ? g : null) != null) {
                    kdb.c.f2();
                }
            }
            vad.c.P1().d();
        }
        return jue.a;
    }
}
