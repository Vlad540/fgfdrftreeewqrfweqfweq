package defpackage;

import android.view.ViewGroup;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.chatscreen.mediabar.MediaBarWidget;

/* renamed from: t08  reason: default package */
public final class t08 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MediaBarWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t08(Continuation continuation, MediaBarWidget mediaBarWidget) {
        super(2, continuation);
        this.Y = mediaBarWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((t08) n((e56) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        t08 t08 = new t08(continuation, this.Y);
        t08.X = obj;
        return t08;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        z46 z46 = (e56) this.X;
        if (!(z46 instanceof y46)) {
            boolean z = z46 instanceof z46;
            MediaBarWidget mediaBarWidget = this.Y;
            if (z) {
                k77[] k77Arr = MediaBarWidget.h1;
                i08 A0 = mediaBarWidget.A0();
                A0.B0.m((Object) null, z46.a);
            } else if (z46 instanceof a56) {
                a56 a56 = (a56) z46;
                tk7 N = kjd.N(a56.c);
                k77[] k77Arr2 = MediaBarWidget.h1;
                mediaBarWidget.B0(N, a56.a, a56.b);
            } else if (z46 instanceof c56) {
                k77[] k77Arr3 = MediaBarWidget.h1;
                lt1 r0 = mediaBarWidget.r0();
                int i = ((c56) z46).a;
                r0.w0 = i;
                r0.x0 = i;
                ViewGroup.LayoutParams layoutParams = r0.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.width = i;
                    layoutParams.height = i;
                    r0.setLayoutParams(layoutParams);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
            } else if (z46 instanceof d56) {
                mediaBarWidget.I0 = ((d56) z46).a;
                MediaBarWidget.n0(mediaBarWidget);
            } else if (z46 instanceof b56) {
                MediaBarWidget.m0(mediaBarWidget, ((b56) z46).a);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        return jue.a;
    }
}
