package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.login.neuroavatars.NeuroAvatarsScreen;

/* renamed from: cj9  reason: default package */
public final class cj9 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ NeuroAvatarsScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cj9(Continuation continuation, NeuroAvatarsScreen neuroAvatarsScreen) {
        super(2, continuation);
        this.Y = neuroAvatarsScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n(obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        cj9 cj9 = new cj9(continuation, this.Y);
        cj9.X = obj;
        return cj9;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        List list = (List) this.X;
        k77[] k77Arr = NeuroAvatarsScreen.Q0;
        NeuroAvatarsScreen neuroAvatarsScreen = this.Y;
        neuroAvatarsScreen.getClass();
        int i = 8;
        int i2 = 0;
        ((lj9) neuroAvatarsScreen.B0.T0(neuroAvatarsScreen, NeuroAvatarsScreen.Q0[8])).setVisibility(list.isEmpty() ? 0 : 8);
        hda p0 = neuroAvatarsScreen.p0();
        if (!list.isEmpty()) {
            i = 0;
        }
        p0.setVisibility(i);
        hda p02 = neuroAvatarsScreen.p0();
        neuroAvatarsScreen.O0.getClass();
        p02.k();
        for (Object next : list) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                gda gda = new gda(p02.getContext());
                gda.setTabItem((sz9) next);
                j9e i4 = p02.i();
                i4.e = gda;
                l9e l9e = i4.g;
                if (l9e != null) {
                    l9e.e();
                }
                ArrayList arrayList = p02.b;
                p02.b(i4, arrayList.size(), arrayList.isEmpty());
                i2 = i3;
            } else {
                p23.G();
                throw null;
            }
        }
        return jue.a;
    }
}
