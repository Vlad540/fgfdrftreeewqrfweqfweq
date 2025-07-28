package defpackage;

import android.os.IBinder;
import java.util.HashMap;

/* renamed from: l18  reason: default package */
public final class l18 implements IBinder.DeathRecipient {
    public final String a;
    public final int b;
    public final int c;
    public final pd8 d;
    public final u18 e;
    public final HashMap f = new HashMap();
    public final /* synthetic */ wd8 g;

    public l18(wd8 wd8, String str, int i, int i2, v18 v18) {
        this.g = wd8;
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = new pd8(str, i, i2);
        this.e = v18;
    }

    public final void binderDied() {
        this.g.Z.post(new vp6(10, this));
    }
}
