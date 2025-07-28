package defpackage;

import androidx.recyclerview.widget.a;
import com.google.android.material.tabs.TabLayout;
import kotlin.coroutines.Continuation;
import one.me.login.neuroavatars.NeuroAvatarsScreen;

/* renamed from: hj9  reason: default package */
public final class hj9 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ NeuroAvatarsScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hj9(Continuation continuation, NeuroAvatarsScreen neuroAvatarsScreen) {
        super(2, continuation);
        this.Y = neuroAvatarsScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n(obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        hj9 hj9 = new hj9(continuation, this.Y);
        hj9.X = obj;
        return hj9;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        ni9 ni9 = (ni9) this.X;
        Integer num = ni9.b;
        NeuroAvatarsScreen neuroAvatarsScreen = this.Y;
        if (num != null && num.intValue() >= 0) {
            k77[] k77Arr = NeuroAvatarsScreen.Q0;
            neuroAvatarsScreen.m0().E0();
            neuroAvatarsScreen.N0.c = true;
            yi9 yi9 = new yi9(neuroAvatarsScreen.getContext(), 0);
            yi9.a = num.intValue();
            a layoutManager = neuroAvatarsScreen.m0().getLayoutManager();
            if (layoutManager != null) {
                layoutManager.J0(yi9);
            }
        }
        int i = ni9.a;
        if (i >= 0) {
            k77[] k77Arr2 = NeuroAvatarsScreen.Q0;
            if (neuroAvatarsScreen.p0().getSelectedTabPosition() != i) {
                neuroAvatarsScreen.p0().stopNestedScroll();
                j9e h = neuroAvatarsScreen.p0().h(i);
                if (h != null) {
                    TabLayout tabLayout = h.f;
                    if (tabLayout != null) {
                        tabLayout.o(h, true);
                    } else {
                        throw new IllegalArgumentException("Tab not attached to a TabLayout");
                    }
                }
            }
        }
        return jue.a;
    }
}
