package defpackage;

import kotlin.coroutines.Continuation;
import one.me.calls.ui.ui.call.CallScreen;
import one.me.calls.ui.ui.call.panels.CallTopPanelWidget;

/* renamed from: sg1  reason: default package */
public final class sg1 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ CallScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sg1(Continuation continuation, CallScreen callScreen) {
        super(2, continuation);
        this.Y = callScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((sg1) n(obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        sg1 sg1 = new sg1(continuation, this.Y);
        sg1.X = obj;
        return sg1;
    }

    /* JADX WARNING: type inference failed for: r3v4, types: [one.me.calls.ui.ui.call.panels.CallTopPanelWidget, rr3] */
    /* JADX WARNING: type inference failed for: r0v5, types: [one.me.calls.ui.ui.call.panels.CallTopPanelWidget, rr3] */
    /* JADX WARNING: type inference failed for: r3v7, types: [one.me.calls.ui.ui.call.panels.CallTopPanelWidget, rr3] */
    /* JADX WARNING: type inference failed for: r4v7, types: [one.me.calls.ui.ui.call.panels.CallTopPanelWidget, rr3] */
    public final Object o(Object obj) {
        wx3.H(obj);
        yk1 yk1 = (yk1) this.X;
        smc smc = CallScreen.T0;
        CallScreen callScreen = this.Y;
        callScreen.getClass();
        int i = yk1 != null ? yk1.a : 0;
        int i2 = i == 0 ? -1 : mg1.$EnumSwitchMapping$0[hr1.t(i)];
        if (i2 == 1) {
            kl1 s0 = callScreen.s0();
            if (s0 != null) {
                CharSequence charSequence = yk1.b;
                ? r0 = (CallTopPanelWidget) s0;
                if (r0.getView() != null) {
                    r0.l0().setTitle(charSequence);
                }
            }
            kl1 s02 = callScreen.s0();
            if (s02 != null) {
                CharSequence charSequence2 = yk1.c;
                ? r3 = (CallTopPanelWidget) s02;
                if (r3.getView() != null) {
                    r3.l0().setStatus(charSequence2);
                }
            }
        } else if (i2 == 2) {
            kl1 s03 = callScreen.s0();
            if (s03 != null) {
                ? r4 = (CallTopPanelWidget) s03;
                if (r4.getView() != null) {
                    r4.l0().setTitle((CharSequence) null);
                }
            }
            kl1 s04 = callScreen.s0();
            if (s04 != null) {
                ? r32 = (CallTopPanelWidget) s04;
                if (r32.getView() != null) {
                    r32.l0().setStatus((CharSequence) null);
                }
            }
        }
        return jue.a;
    }
}
