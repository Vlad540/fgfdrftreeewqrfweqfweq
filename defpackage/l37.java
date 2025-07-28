package defpackage;

import android.content.Intent;

/* renamed from: l37  reason: default package */
public final class l37 implements m37 {
    public final Intent a;
    public final int b;
    public final /* synthetic */ r37 c;

    public l37(r37 r37, Intent intent, int i) {
        this.c = r37;
        this.a = intent;
        this.b = i;
    }

    public final void a() {
        this.c.stopSelf(this.b);
    }

    public final Intent getIntent() {
        return this.a;
    }
}
