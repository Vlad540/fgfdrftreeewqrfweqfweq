package defpackage;

import android.os.Bundle;

/* renamed from: uu2  reason: default package */
public final class uu2 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ sg9 b;

    public /* synthetic */ uu2(sg9 sg9, int i) {
        this.a = i;
        this.b = sg9;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                qo3 qo3 = qo3.c;
                apd apd = this.b;
                qo3.Z1(apd.b, apd.c);
                return jue.a;
            case 1:
                kdb kdb = kdb.c;
                udb udb = this.b;
                long j = udb.b;
                d34 P1 = kdb.P1();
                P1.b(":call-user?opponent_id=" + j + "&video_enabled=" + udb.d, (Bundle) null);
                return jue.a;
            case 2:
                kdb.c.P1().b(":call-join-link?link=".concat(this.b.e), (Bundle) null);
                return jue.a;
            default:
                kdb kdb2 = kdb.c;
                udb udb2 = this.b;
                long j2 = udb2.b;
                d34 P12 = kdb2.P1();
                P12.b(":call-chat?chat_id=" + j2 + "&video_enabled=" + udb2.d, (Bundle) null);
                return jue.a;
        }
    }
}
