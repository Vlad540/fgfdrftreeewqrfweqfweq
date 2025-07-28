package defpackage;

import android.view.View;
import kotlin.coroutines.Continuation;
import one.me.main.MainScreen;

/* renamed from: hs7  reason: default package */
public final class hs7 extends l5e implements i26 {
    public /* synthetic */ boolean X;
    public final /* synthetic */ MainScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hs7(MainScreen mainScreen, Continuation continuation) {
        super(2, continuation);
        this.Y = mainScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        jue jue = jue.a;
        n(bool, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        hs7 hs7 = new hs7(this.Y, continuation);
        hs7.X = ((Boolean) obj).booleanValue();
        return hs7;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        boolean z = this.X;
        j06 j06 = MainScreen.Z;
        n0a n0 = this.Y.n0();
        int i = k6a.c;
        n0.getClass();
        int i2 = 0;
        while (true) {
            if (!(i2 < n0.getChildCount())) {
                break;
            }
            int i3 = i2 + 1;
            View childAt = n0.getChildAt(i2);
            if (childAt != null) {
                Object E = hhd.E(childAt, wqb.tag_tab_item);
                m0a m0a = E instanceof m0a ? (m0a) E : null;
                if (m0a != null && m0a.c == i) {
                    if ((childAt.getVisibility() == 0) == z) {
                        break;
                    }
                    childAt.setVisibility(z ? 0 : 8);
                    float weightSum = n0.getWeightSum();
                    float f = (float) 1;
                    n0.setWeightSum(z ? weightSum + f : weightSum - f);
                }
                i2 = i3;
            } else {
                throw new IndexOutOfBoundsException();
            }
        }
        return jue.a;
    }
}
