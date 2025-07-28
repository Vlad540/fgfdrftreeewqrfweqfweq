package defpackage;

import kotlin.coroutines.Continuation;
import one.me.profileedit.screens.adminpermissions.ProfileEditAdminPermissionsWidget;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: w7b  reason: default package */
public final class w7b extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ProfileEditAdminPermissionsWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public w7b(Continuation continuation, ProfileEditAdminPermissionsWidget profileEditAdminPermissionsWidget) {
        super(2, continuation);
        this.Y = profileEditAdminPermissionsWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n(obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        w7b w7b = new w7b(continuation, this.Y);
        w7b.X = obj;
        return w7b;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        f7b f7b = (f7b) this.X;
        ProfileEditAdminPermissionsWidget profileEditAdminPermissionsWidget = this.Y;
        ebc ebc = profileEditAdminPermissionsWidget.y0;
        if (ebc.a()) {
            ((OneMeButton) ebc.getValue()).setVisibility(f7b.b ? 0 : 8);
            profileEditAdminPermissionsWidget.o0();
        }
        profileEditAdminPermissionsWidget.Z.E(f7b.a);
        return jue.a;
    }
}
