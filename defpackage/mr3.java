package defpackage;

import android.content.Intent;
import android.os.Bundle;

/* renamed from: mr3  reason: default package */
public final /* synthetic */ class mr3 implements tgc {
    public final /* synthetic */ rr3 a;
    public final /* synthetic */ Intent b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Bundle d;

    public /* synthetic */ mr3(rr3 rr3, Intent intent, int i, Bundle bundle) {
        this.a = rr3;
        this.b = intent;
        this.c = i;
        this.d = bundle;
    }

    public final void a() {
        rr3 rr3 = this.a;
        rr3.router.V(rr3.instanceId, this.b, this.c, this.d);
    }
}
