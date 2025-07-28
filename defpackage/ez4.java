package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.settings.privacy.ui.SettingsPrivacyScreen;
import one.me.settings.privacy.ui.pincode.EnterPinCodeScreen;

/* renamed from: ez4  reason: default package */
public final class ez4 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ EnterPinCodeScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ez4(Continuation continuation, EnterPinCodeScreen enterPinCodeScreen) {
        super(2, continuation);
        this.Y = enterPinCodeScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n(obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        ez4 ez4 = new ez4(continuation, this.Y);
        ez4.X = obj;
        return ez4;
    }

    /* JADX WARNING: type inference failed for: r7v8, types: [v5d, sg9] */
    /* JADX WARNING: type inference failed for: r7v9, types: [v5d, sg9] */
    /* JADX WARNING: type inference failed for: r7v10, types: [v5d, sg9] */
    public final Object o(Object obj) {
        wx3.H(obj);
        jz4 jz4 = (jz4) this.X;
        EnterPinCodeScreen enterPinCodeScreen = this.Y;
        dz4 targetController = enterPinCodeScreen.getTargetController();
        dz4 dz4 = targetController instanceof dz4 ? targetController : null;
        int ordinal = jz4.ordinal();
        n0c n0c = enterPinCodeScreen.o;
        if (ordinal == 0) {
            ((hva) n0c.T0(enterPinCodeScreen, EnterPinCodeScreen.X[0])).setState(ec3.SUCCESS);
        } else if (ordinal == 1) {
            ((hva) n0c.T0(enterPinCodeScreen, EnterPinCodeScreen.X[0])).setState(ec3.ERROR);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        if (dz4 != null) {
            t9d l0 = ((SettingsPrivacyScreen) dz4).l0();
            l0.getClass();
            int ordinal2 = jz4.ordinal();
            if (ordinal2 == 0) {
                long j = l0.M0;
                if (j == waa.g) {
                    taf.n(l0, l0.o.a(), (ru3) null, new m9d(l0, (Continuation) null), 2);
                } else if (j == waa.h) {
                    l0.w(v5d.i);
                } else if (j == waa.d) {
                    l0.w(v5d.h);
                } else if (j == waa.b) {
                    l0.w(v5d.j);
                }
                l0.M0 = 0;
            } else if (ordinal2 != 1) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return jue.a;
    }
}
