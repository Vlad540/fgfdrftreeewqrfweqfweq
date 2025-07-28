package defpackage;

import android.view.View;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.profile.screens.media.ChatMediaListWidget;

/* renamed from: uc2  reason: default package */
public final class uc2 extends l5e implements i26 {
    public final /* synthetic */ ChatMediaListWidget X;
    public final /* synthetic */ rh8 Y;
    public final /* synthetic */ View Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public uc2(ChatMediaListWidget chatMediaListWidget, rh8 rh8, View view, Continuation continuation) {
        super(2, continuation);
        this.X = chatMediaListWidget;
        this.Y = rh8;
        this.Z = view;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((ou3) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new uc2(this.X, this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        lg7 lg7;
        int i;
        wx3.H(obj);
        ChatMediaListWidget chatMediaListWidget = this.X;
        rh8 rh8 = this.Y;
        chatMediaListWidget.a = rh8;
        mq3 j = pfa.a(1).a().j(this.Z);
        gf2 m0 = chatMediaListWidget.m0();
        m0.getClass();
        boolean z = rh8 instanceof oh8;
        r7e r7e = m0.K0;
        if (z) {
            gb2 gb2 = (gb2) r7e.getValue();
            gb2.getClass();
            lg7 c = hwf.c();
            c.add((pq3) gb2.b.getValue());
            c.add(gb2.a(l8a.v1));
            c.add((pq3) gb2.a.getValue());
            lg7 = hwf.a(c);
        } else if (rh8 instanceof ph8) {
            gb2 gb22 = (gb2) r7e.getValue();
            gb22.getClass();
            lg7 c2 = hwf.c();
            c2.add(new pq3(j8a.V, (mge) new hge(l8a.s1), Integer.valueOf(l9a.e), (Integer) null, 20));
            c2.add(new pq3(j8a.c0, (mge) new hge(l8a.D1), Integer.valueOf(l9a.z), (Integer) null, 20));
            c2.add((pq3) gb22.b.getValue());
            c2.add(gb2.a(l8a.x1));
            c2.add((pq3) gb22.a.getValue());
            lg7 = hwf.a(c2);
        } else {
            boolean z2 = rh8 instanceof qh8;
            if (z2) {
                gb2 gb23 = (gb2) r7e.getValue();
                gb23.getClass();
                if (z2) {
                    qh8 qh8 = (qh8) rh8;
                    int t = hr1.t(qh8.X);
                    if (t == 0) {
                        i = l8a.y1;
                    } else if (t == 1) {
                        i = l8a.z1;
                    } else if (t == 2) {
                        i = l8a.w1;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                    lg7 c3 = hwf.c();
                    c3.add(new pq3(j8a.b0, (mge) new hge(l8a.C1), Integer.valueOf(l9a.f), (Integer) null, 20));
                    c3.add((pq3) gb23.b.getValue());
                    c3.add(gb2.a(i));
                    if (!qh8.w0) {
                        c3.add((pq3) gb23.a.getValue());
                    }
                    lg7 = hwf.a(c3);
                } else {
                    lg7 = hw4.a;
                }
            } else if (rh8 instanceof jh8) {
                gb2 gb24 = (gb2) r7e.getValue();
                gb24.getClass();
                lg7 c4 = hwf.c();
                c4.add((pq3) gb24.b.getValue());
                c4.add(gb2.a(l8a.u1));
                c4.add((pq3) gb24.a.getValue());
                lg7 = hwf.a(c4);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        j.e(lg7).build().q(chatMediaListWidget);
        return jue.a;
    }
}
