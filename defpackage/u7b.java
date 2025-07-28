package defpackage;

import android.os.Bundle;
import kotlin.coroutines.Continuation;
import one.me.profileedit.screens.adminpermissions.ProfileEditAdminPermissionsWidget;

/* renamed from: u7b  reason: default package */
public final class u7b extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ProfileEditAdminPermissionsWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u7b(Continuation continuation, ProfileEditAdminPermissionsWidget profileEditAdminPermissionsWidget) {
        super(2, continuation);
        this.Y = profileEditAdminPermissionsWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n(obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        u7b u7b = new u7b(continuation, this.Y);
        u7b.X = obj;
        return u7b;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        a34 a34 = (sg9) this.X;
        if (a34 instanceof a7b) {
            s8b.c.P1().b(us8.j(((a7b) a34).b, ":chats?id=", "&type=local"), (Bundle) null);
        } else if (a34 instanceof v03) {
            ProfileEditAdminPermissionsWidget profileEditAdminPermissionsWidget = this.Y;
            bm3.p(profileEditAdminPermissionsWidget);
            profileEditAdminPermissionsWidget.getRouter().B(profileEditAdminPermissionsWidget);
        } else if (a34 instanceof a34) {
            s8b.c.R1(a34);
        }
        return jue.a;
    }
}
