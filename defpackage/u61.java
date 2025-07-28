package defpackage;

import android.os.Bundle;

/* renamed from: u61  reason: default package */
public final /* synthetic */ class u61 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ u61(Object obj, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = z;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                j61 j61 = j61.c;
                long j = ((ug6) ((wg6) this.c)).a;
                d34 P1 = j61.P1();
                StringBuilder k = hr1.k(j, ":call-user?opponent_id=", "&video_enabled=");
                k.append(this.b);
                k.append("&microphone_enabled=true");
                P1.b(k.toString(), (Bundle) null);
                return jue.a;
            default:
                hl1.x((hl1) this.c, this.b);
                return jue.a;
        }
    }
}
