package defpackage;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;

/* renamed from: rsf  reason: default package */
public final class rsf extends Binder {
    public final za6 c;

    public rsf(za6 za6) {
        this.c = za6;
    }

    public final void a(ssf ssf) {
        if (Binder.getCallingUid() == Process.myUid()) {
            Intent intent = ssf.a;
            zy4 zy4 = (zy4) this.c.a;
            zy4.getClass();
            vde vde = new vde();
            zy4.a.execute(new px4((Object) zy4, (Object) intent, (Object) vde, 2));
            vde.a.b(new gr(2), new xle(18, ssf));
            return;
        }
        throw new SecurityException("Binding only allowed within app");
    }
}
