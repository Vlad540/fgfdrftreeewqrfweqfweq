package defpackage;

import kotlin.coroutines.Continuation;
import one.me.main.MainScreen;

/* renamed from: is7  reason: default package */
public final class is7 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MainScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public is7(MainScreen mainScreen, Continuation continuation) {
        super(2, continuation);
        this.Y = mainScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((dv3) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        is7 is7 = new is7(this.Y, continuation);
        is7.X = obj;
        return is7;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        j06 j06 = MainScreen.Z;
        n0a n0 = this.Y.n0();
        int i = k6a.e;
        int i2 = ((dv3) this.X).a;
        n0.getClass();
        int i3 = 0;
        while (true) {
            if (!(i3 < n0.getChildCount())) {
                return jue.a;
            }
            int i4 = i3 + 1;
            sp0 childAt = n0.getChildAt(i3);
            if (childAt != null) {
                Object E = hhd.E(childAt, wqb.tag_tab_item);
                m0a m0a = E instanceof m0a ? (m0a) E : null;
                if (m0a != null && m0a.c == i) {
                    childAt.setCounter(i2);
                }
                i3 = i4;
            } else {
                throw new IndexOutOfBoundsException();
            }
        }
    }
}
