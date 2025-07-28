package defpackage;

import android.view.View;

/* renamed from: w1c  reason: default package */
public final class w1c extends chd {
    /* JADX WARNING: type inference failed for: r5v0, types: [w1c, b7c] */
    /* renamed from: F */
    public final void A(t1c t1c) {
        boolean z = t1c.Z;
        View view = this.a;
        if (z) {
            ((v1c) view).setAvatarShape(fz9.a);
        }
        String str = t1c.c;
        ((v1c) view).setAvatar(str);
        if (str == null) {
            ((v1c) view).setAbbreviation(new ub0(t1c.o, this.X));
        }
        ((v1c) view).setName(t1c.b);
        ((v1c) view).setVerified(t1c.Y);
        ((v1c) view).setOnline(t1c.X);
    }
}
