package defpackage;

import android.view.View;
import kotlin.coroutines.Continuation;
import one.me.profile.ProfileScreen;
import one.me.profile.screens.members.compact.ChatMembersCompactWidget;

/* renamed from: heb  reason: default package */
public final class heb extends l5e implements i26 {
    public final /* synthetic */ ProfileScreen X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public heb(Continuation continuation, ProfileScreen profileScreen) {
        super(2, continuation);
        this.X = profileScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new heb(continuation, this.X);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        ProfileScreen profileScreen = this.X;
        View view = profileScreen.getView();
        jue jue = jue.a;
        if (view != null && !profileScreen.q0().T0.r() && !profileScreen.q0().T0.p()) {
            ax2 ax2 = (ax2) profileScreen.D0.T0(profileScreen, ProfileScreen.H0[11]);
            if (!hhd.f(ax2.b(), "profile_members_list_widget")) {
                vgc vgc = new vgc(new ChatMembersCompactWidget(profileScreen.getArgs().getLong("profile:id")), (String) null, (wr3) null, (wr3) null, false, -1);
                vgc.d("profile_members_list_widget");
                ax2.a.R(vgc);
            }
        }
        return jue;
    }
}
