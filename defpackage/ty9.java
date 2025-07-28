package defpackage;

import android.content.res.Configuration;
import kotlin.coroutines.Continuation;
import one.me.android.OneMeApplication;

/* renamed from: ty9  reason: default package */
public final class ty9 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ OneMeApplication Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ty9(OneMeApplication oneMeApplication, Continuation continuation) {
        super(2, continuation);
        this.Y = oneMeApplication;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((ty9) n((yq4) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        ty9 ty9 = new ty9(this.Y, continuation);
        ty9.X = obj;
        return ty9;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        int ordinal = ((yq4) this.X).ordinal();
        udd.p("OneMeDynamicFont", "change dynamic font to " + ordinal, new Object[0]);
        OneMeApplication oneMeApplication = this.Y;
        Configuration configuration = new Configuration(oneMeApplication.getResources().getConfiguration());
        int floatToRawIntBits = Float.floatToRawIntBits(configuration.fontScale);
        kxb.a.getClass();
        configuration.fontScale = Float.intBitsToFloat(floatToRawIntBits + (kxb.b.b() ? -1 : 1));
        oneMeApplication.getResources().updateConfiguration(configuration, oneMeApplication.getResources().getDisplayMetrics());
        oneMeApplication.onConfigurationChanged(configuration);
        return jue.a;
    }
}
