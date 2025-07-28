package defpackage;

import java.util.NoSuchElementException;
import one.me.profileedit.screens.adminpermissions.ProfileEditAdminPermissionsWidget;

/* renamed from: a8b  reason: default package */
public final /* synthetic */ class a8b implements i34 {
    public final /* synthetic */ long a;
    public final /* synthetic */ long b;
    public final /* synthetic */ String c;

    public /* synthetic */ a8b(long j, String str, long j2) {
        this.a = j;
        this.b = j2;
        this.c = str;
    }

    public final Object a() {
        b7b b7b;
        b7b.b.getClass();
        u1 it = b7b.Y.iterator();
        do {
            u1 u1Var = it;
            if (u1Var.hasNext()) {
                b7b = (b7b) u1Var.next();
            } else {
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        } while (!hhd.f(b7b.a, this.c));
        return new ProfileEditAdminPermissionsWidget(this.a, this.b, b7b);
    }
}
