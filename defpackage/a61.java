package defpackage;

import android.os.Vibrator;

/* renamed from: a61  reason: default package */
public final class a61 {
    public final t97 a;
    public final t97 b;

    public a61(t97 t97, t97 t972) {
        this.a = t97;
        this.b = t972;
    }

    public final void a() {
        udd.p("HandleSilenceMode", "try mute ringtones", new Object[0]);
        cg1 a2 = ((fdc) this.b.getValue()).a();
        if (a2.g == null && ((Vibrator) a2.e.getValue()) == null) {
            udd.p("RingtoneManagerTag", " mute already set", new Object[0]);
            return;
        }
        udd.p("RingtoneManagerTag", " set mute", new Object[0]);
        a2.c();
    }
}
