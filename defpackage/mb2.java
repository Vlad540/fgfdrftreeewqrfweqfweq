package defpackage;

import kotlin.coroutines.Continuation;
import one.me.dialogs.share.media.ChatMediaDownloadBottomSheet;

/* renamed from: mb2  reason: default package */
public final class mb2 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatMediaDownloadBottomSheet Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mb2(Continuation continuation, ChatMediaDownloadBottomSheet chatMediaDownloadBottomSheet) {
        super(2, continuation);
        this.Y = chatMediaDownloadBottomSheet;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((mb2) n(obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        mb2 mb2 = new mb2(continuation, this.Y);
        mb2.X = obj;
        return mb2;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        ((d00) this.Y.D0.getValue()).setLevel(a24.X(((Number) this.X).floatValue() * ((float) 100)));
        return jue.a;
    }
}
