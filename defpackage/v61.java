package defpackage;

import android.os.Bundle;

/* renamed from: v61  reason: default package */
public final /* synthetic */ class v61 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wg6 b;

    public /* synthetic */ v61(wg6 wg6, int i) {
        this.a = i;
        this.b = wg6;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                j61.c.P1().b(":call-join-link?link=".concat(((sg6) this.b).e), (Bundle) null);
                return jue.a;
            default:
                j61.c.P1().b(":call-join-link?link=".concat(((tg6) this.b).a), (Bundle) null);
                return jue.a;
        }
    }
}
