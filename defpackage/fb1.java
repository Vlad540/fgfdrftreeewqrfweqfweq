package defpackage;

import android.content.Intent;
import kotlin.coroutines.Continuation;
import one.me.calllist.ui.callinfo.CallLinkInfoScreen;

/* renamed from: fb1  reason: default package */
public final class fb1 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ CallLinkInfoScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fb1(Continuation continuation, CallLinkInfoScreen callLinkInfoScreen) {
        super(2, continuation);
        this.Y = callLinkInfoScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((fb1) n(obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        fb1 fb1 = new fb1(continuation, this.Y);
        fb1.X = obj;
        return fb1;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        a34 a34 = (sg9) this.X;
        if (a34 instanceof a34) {
            j61.c.R1(a34);
        } else {
            boolean z = a34 instanceof q81;
            CallLinkInfoScreen callLinkInfoScreen = this.Y;
            if (z) {
                k77[] k77Arr = CallLinkInfoScreen.F0;
                callLinkInfoScreen.l0().d(2, 1);
                j61 j61 = j61.c;
                String string = callLinkInfoScreen.getContext().getString(j1a.o);
                String obj2 = ((q81) a34).b.toString();
                String name = CallLinkInfoScreen.class.getName();
                j61.getClass();
                Intent intent = new Intent();
                intent.setAction("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.TEXT", obj2);
                intent.setType("text/plain");
                j61.P1().b(":chats/share", jjd.j(new wia("ru.ok.tamtam.extra.DATA", intent), new wia("ru.ok.tamtam.extra.SHARE_TITLE", string), new wia("tag", name)));
            } else if (a34 instanceof r81) {
                k77[] k77Arr2 = CallLinkInfoScreen.F0;
                callLinkInfoScreen.l0().d(3, 1);
                String str = oyb.g;
                oyb.R(callLinkInfoScreen.getContext(), ((r81) a34).b);
            } else if (a34 instanceof p81) {
                k77[] k77Arr3 = CallLinkInfoScreen.F0;
                callLinkInfoScreen.l0().d(1, 1);
                hhd.q(callLinkInfoScreen.getContext(), ((p81) a34).b.toString());
                if (hhd.y()) {
                    hge hge = new hge(j1a.n);
                    int i = h1a.e;
                    hba hba = new hba(callLinkInfoScreen);
                    hba.h(hge);
                    hba.f(new vba(i));
                    hba.j();
                }
            } else if (a34 instanceof s81) {
                mge mge = ((s81) a34).b;
                k77[] k77Arr4 = CallLinkInfoScreen.F0;
                callLinkInfoScreen.getClass();
                hba hba2 = new hba(callLinkInfoScreen);
                hba2.h(mge);
                hba2.f(wba.a);
                hba2.j();
            }
        }
        return jue.a;
    }
}
