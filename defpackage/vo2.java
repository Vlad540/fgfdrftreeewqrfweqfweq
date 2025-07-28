package defpackage;

import android.content.ActivityNotFoundException;
import kotlin.coroutines.Continuation;
import one.me.startconversation.chattitleicon.ChatTitleIconScreen;

/* renamed from: vo2  reason: default package */
public final class vo2 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatTitleIconScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vo2(Continuation continuation, ChatTitleIconScreen chatTitleIconScreen) {
        super(2, continuation);
        this.Y = chatTitleIconScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n(obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        vo2 vo2 = new vo2(continuation, this.Y);
        vo2.X = obj;
        return vo2;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        sg9 sg9 = (sg9) this.X;
        boolean z = sg9 instanceof ko2;
        ChatTitleIconScreen chatTitleIconScreen = this.Y;
        if (z) {
            bm3.p(chatTitleIconScreen);
            chatTitleIconScreen.startActivityForResult(((ko2) sg9).b, 666);
        } else if (sg9 instanceof oo2) {
            bm3.p(chatTitleIconScreen);
            try {
                chatTitleIconScreen.startActivityForResult(((oo2) sg9).b, 777);
                xg9.g((xg9) chatTitleIconScreen.w0.getValue(), mnc.AVATAR_PICKER_CAMERA);
            } catch (ActivityNotFoundException unused) {
                k77[] k77Arr = ChatTitleIconScreen.D0;
                chatTitleIconScreen.q0().t();
                udd.s(ChatTitleIconScreen.class.getName(), "failed open camera", (Throwable) null);
            }
        } else if (sg9 instanceof no2) {
            k77[] k77Arr2 = ChatTitleIconScreen.D0;
            chatTitleIconScreen.o0().setProgressEnabled(false);
            mpd.c.b2(new wo2(chatTitleIconScreen, sg9, 0));
        } else if (sg9 instanceof mo2) {
            k77[] k77Arr3 = ChatTitleIconScreen.D0;
            chatTitleIconScreen.o0().setProgressEnabled(false);
            mpd.c.b2(new wo2(chatTitleIconScreen, sg9, 1));
        } else if (sg9 instanceof lo2) {
            k77[] k77Arr4 = ChatTitleIconScreen.D0;
            chatTitleIconScreen.o0().setProgressEnabled(false);
            mpd.c.b2(new wo2(chatTitleIconScreen, sg9, 2));
        } else if (hhd.f(sg9, po2.b)) {
            k77[] k77Arr5 = ChatTitleIconScreen.D0;
            ((qna) chatTitleIconScreen.Z.getValue()).g(new jrf(chatTitleIconScreen, 1));
        }
        return jue.a;
    }
}
