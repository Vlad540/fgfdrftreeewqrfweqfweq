package defpackage;

import android.net.Uri;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.chatscreen.mediabar.MediaBarWidget;

/* renamed from: u08  reason: default package */
public final class u08 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MediaBarWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u08(Continuation continuation, MediaBarWidget mediaBarWidget) {
        super(2, continuation);
        this.Y = mediaBarWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((u08) n((ug8) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        u08 u08 = new u08(continuation, this.Y);
        u08.X = obj;
        return u08;
    }

    public final Object o(Object obj) {
        int i;
        wx3.H(obj);
        ug8 ug8 = (ug8) this.X;
        boolean f = hhd.f(ug8, qg8.a);
        MediaBarWidget mediaBarWidget = this.Y;
        if (f) {
            k77[] k77Arr = MediaBarWidget.h1;
            mediaBarWidget.w0().j(true);
            i08 A0 = mediaBarWidget.A0();
            taf.o(A0.A0, sz7.a);
        } else if (hhd.f(ug8, rg8.a)) {
            k77[] k77Arr2 = MediaBarWidget.h1;
            i08 A02 = mediaBarWidget.A0();
            int ordinal = ((qz) A02.w0.getValue()).ordinal();
            if (ordinal == 0) {
                A02.w0.m((Object) null, qz.b);
                pwc r = A02.r();
                int i2 = pz.$EnumSwitchMapping$0[1];
                if (i2 != 1) {
                    i = 2;
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    i = 3;
                }
                r.p(i);
            } else if (ordinal == 1) {
                A02.x0.n(az7.a);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else if (ug8 instanceof sg8) {
            k77[] k77Arr3 = MediaBarWidget.h1;
            i08 A03 = mediaBarWidget.A0();
            Uri uri = ((sg8) ug8).a;
            A03.getClass();
            taf.o(A03.A0, new tz7(uri));
        } else if (ug8 instanceof tg8) {
            k77[] k77Arr4 = MediaBarWidget.h1;
            i08 A04 = mediaBarWidget.A0();
            tg8 tg8 = (tg8) ug8;
            dm7 dm7 = tg8.a;
            A04.getClass();
            taf.o(A04.A0, new uz7(dm7, tg8.b, tg8.c));
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return jue.a;
    }
}
