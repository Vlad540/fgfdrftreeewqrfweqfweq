package defpackage;

import kotlin.coroutines.Continuation;
import one.me.mediapicker.MediaPickerScreen;

/* renamed from: h98  reason: default package */
public final class h98 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MediaPickerScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h98(Continuation continuation, MediaPickerScreen mediaPickerScreen) {
        super(2, continuation);
        this.Y = mediaPickerScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n(obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        h98 h98 = new h98(continuation, this.Y);
        h98.X = obj;
        return h98;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        e56 e56 = (e56) this.X;
        if (e56 instanceof a56) {
            k77[] k77Arr = MediaPickerScreen.F0;
            n98 n98 = (n98) this.Y.w0.getValue();
            taf.n(n98, ((pae) n98.X.getValue()).b(), (ru3) null, new l98(n98, ((a56) e56).c, (Continuation) null), 2);
        }
        return jue.a;
    }
}
