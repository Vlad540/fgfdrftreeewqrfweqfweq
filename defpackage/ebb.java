package defpackage;

import android.content.Intent;
import kotlin.coroutines.Continuation;
import one.me.profile.screens.invite.ProfileInviteScreen;
import org.apache.http.protocol.HTTP;

/* renamed from: ebb  reason: default package */
public final class ebb extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ProfileInviteScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ebb(ProfileInviteScreen profileInviteScreen, Continuation continuation) {
        super(2, continuation);
        this.Y = profileInviteScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((sg9) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        ebb ebb = new ebb(this.Y, continuation);
        ebb.X = obj;
        return ebb;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        a34 a34 = (sg9) this.X;
        boolean z = a34 instanceof bbb;
        ProfileInviteScreen profileInviteScreen = this.Y;
        if (z) {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.SEND");
            intent.putExtra("android.intent.extra.TEXT", ((bbb) a34).b);
            intent.setType(HTTP.PLAIN_TEXT_TYPE);
            vgc vgc = (vgc) o23.f0(profileInviteScreen.getRouter().e());
            kdb.c.P1().b(":chats/share", jjd.j(new wia[]{new wia("ru.ok.tamtam.extra.DATA", intent), new wia("tag", vgc != null ? vgc.b : null)}));
        } else if (a34 instanceof cbb) {
            swb.O(profileInviteScreen.getContext(), ((cbb) a34).b);
        } else if (a34 instanceof a34) {
            kdb.c.R1(a34);
        } else if (a34 instanceof v03) {
            profileInviteScreen.getRouter().B(profileInviteScreen);
        }
        return jue.a;
    }
}
