package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.chatscreen.mediabar.MediaBarWidget;

/* renamed from: s08  reason: default package */
public final class s08 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MediaBarWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public s08(Continuation continuation, MediaBarWidget mediaBarWidget) {
        super(2, continuation);
        this.Y = mediaBarWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((s08) n(obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        s08 s08 = new s08(continuation, this.Y);
        s08.X = obj;
        return s08;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        mkb mkb = (pkb) this.X;
        boolean z = mkb instanceof mkb;
        MediaBarWidget mediaBarWidget = this.Y;
        if (z) {
            mkb mkb2 = mkb;
            tk7 tk7 = mkb2.a;
            k77[] k77Arr = MediaBarWidget.h1;
            mediaBarWidget.B0(tk7, mkb2.b, "SELECTED_MEDIA_ALBUM");
        } else if (mkb instanceof okb) {
            k77[] k77Arr2 = MediaBarWidget.h1;
            ((qna) mediaBarWidget.c.getValue()).h(new jrf(mediaBarWidget, 1));
        } else if (mkb instanceof nkb) {
            k77[] k77Arr3 = MediaBarWidget.h1;
            qna qna = (qna) mediaBarWidget.c.getValue();
            jrf jrf = new jrf(mediaBarWidget, 1);
            qna.getClass();
            String[] strArr = qna.h;
            int i = iub.permissions_audio_for_video_request;
            int i2 = baa.a;
            int i3 = baa.g;
            if (qna.i(jrf, strArr)) {
                jrf.c(strArr, 171, i2, i, i3);
            } else {
                qna.f(jrf, strArr, 171);
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return jue.a;
    }
}
