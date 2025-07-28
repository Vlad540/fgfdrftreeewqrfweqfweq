package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.chatscreen.mediabar.MediaBarWidget;

/* renamed from: r08  reason: default package */
public final class r08 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MediaBarWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r08(Continuation continuation, MediaBarWidget mediaBarWidget) {
        super(2, continuation);
        this.Y = mediaBarWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((r08) n(obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        r08 r08 = new r08(continuation, this.Y);
        r08.X = obj;
        return r08;
    }

    public final Object o(Object obj) {
        String str;
        wx3.H(obj);
        fvc fvc = (ivc) this.X;
        boolean z = fvc instanceof hvc;
        MediaBarWidget mediaBarWidget = this.Y;
        if (z) {
            k77[] k77Arr = MediaBarWidget.h1;
            mediaBarWidget.y0().setVisibility(8);
        } else if (fvc instanceof fvc) {
            fvc fvc2 = fvc;
            mediaBarWidget.K0 = fvc2.a;
            MediaBarWidget.n0(mediaBarWidget);
            mediaBarWidget.z0().setDropdownRotationProgress(((float) fvc2.a) / 512.0f);
        } else if (fvc instanceof gvc) {
            k77[] k77Arr2 = MediaBarWidget.h1;
            f56 t0 = mediaBarWidget.t0();
            gvc gvc = (gvc) fvc;
            o46 o46 = gvc.a;
            t0.getClass();
            taf.o(t0.o, new v46(o46));
            d46 c = gvc.a.a.c();
            if (c instanceof d46) {
                str = mediaBarWidget.getContext().getString(c.a);
            } else if (c instanceof e46) {
                str = ((e46) c).a;
            } else {
                throw new NoWhenBranchMatchedException();
            }
            mediaBarWidget.z0().setTitle(str);
        }
        return jue.a;
    }
}
