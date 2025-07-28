package one.me.profile.screens.members;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.members.list.MembersListWidget;
import one.me.sdk.arch.Widget;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lone/me/profile/screens/members/ChatAdminsScreen;", "Lone/me/sdk/arch/Widget;", "Llc3;", "Loaa;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "chatId", "(J)V", "profile_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class ChatAdminsScreen extends Widget implements lc3, oaa {
    public static final /* synthetic */ k77[] A0;
    public final t97 X;
    public final t97 Y;
    public final t97 Z;
    public final jj7 a;
    public final sy6 b;
    public final jr c;
    public final String o;
    public final t97 w0;
    public final n0c x0;
    public gba y0;
    public final n0c z0;

    static {
        Class<ChatAdminsScreen> cls = ChatAdminsScreen.class;
        k77 khb = new khb(cls, ApiProtocol.PARAM_CHAT_ID, "getChatId()J", 0);
        n7c n7c = m7c.a;
        A0 = new k77[]{khb, wn6.e(n7c, cls, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), wn6.f(cls, "membersListRouter", "getMembersListRouter()Lone/me/sdk/arch/navigation/ChildSlotRouter;", 0, n7c)};
    }

    public ChatAdminsScreen(Bundle bundle) {
        super(bundle, 0, 2, (x54) null);
        this.a = new jj7(new p22(0), (s16) null, 6);
        this.b = sy6.d;
        this.c = new jr(Long.class, ApiProtocol.KEY_ID);
        this.o = us8.j(m0(), "profile:chatMembersList:{", "}");
        this.X = createViewModelLazy(y22.class, new s(22, new q22(this, 0)));
        this.Y = createViewModelLazy(lj8.class, new s(23, new q22(this, 1)));
        this.Z = ez3.O(3, new p22(1));
        this.w0 = ez3.O(3, new p22(2));
        this.x0 = viewBinding(j8a.F0);
        l05 l05 = n0().X;
        pc7 R = this.lifecycleOwner.R();
        ob7 ob7 = ob7.o;
        ez3.N(new ck5(wx3.e(l05, R, ob7), new r22(this, (Continuation) null), 5), getLifecycleScope());
        ez3.N(new ck5(wx3.e(l0().A0, this.lifecycleOwner.R(), ob7), new hp0(2, this, ChatAdminsScreen.class, "processEvents", "processEvents(Lone/me/profile/screens/members/ProfileListMembersEvents;)V", 4, 4), 5), getLifecycleScope());
        this.z0 = childSlotRouter(j8a.w0);
    }

    public final void I(CharSequence charSequence) {
        n0().u(String.valueOf(charSequence));
    }

    public final void T() {
        n0().u((String) null);
    }

    public final sy6 getInsetsConfig() {
        return this.b;
    }

    /* renamed from: getScopeId-IluPPks  reason: not valid java name */
    public final String m13getScopeIdIluPPks() {
        return this.o;
    }

    public final rnc getScreenDelegate() {
        return this.a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
        r2 = r3.getLongArray("profile:adminslist:ids_to_delete");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void i(int r2, android.os.Bundle r3) {
        /*
            r1 = this;
            int r0 = defpackage.j8a.x0
            if (r2 != r0) goto L_0x0039
            if (r3 == 0) goto L_0x0013
            java.lang.String r2 = "profile:adminslist:ids_to_delete"
            long[] r2 = r3.getLongArray(r2)
            if (r2 == 0) goto L_0x0013
            java.util.List r2 = cs.f0(r2)
            goto L_0x0014
        L_0x0013:
            r2 = 0
        L_0x0014:
            if (r2 != 0) goto L_0x0018
            hw4 r2 = hw4.a
        L_0x0018:
            lj8 r3 = r1.n0()
            r3.s(r2)
            y22 r1 = r1.l0()
            java.util.ArrayList r3 = r1.z0
            r3.addAll(r2)
            qcb r2 = new qcb
            int r3 = defpackage.l8a.b2
            hge r0 = new hge
            r0.<init>(r3)
            r2.<init>(r0)
            l05 r1 = r1.A0
            defpackage.taf.o(r1, r2)
        L_0x0039:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.profile.screens.members.ChatAdminsScreen.i(int, android.os.Bundle):void");
    }

    public final y22 l0() {
        return (y22) this.X.getValue();
    }

    public final long m0() {
        k77 k77 = A0[0];
        return ((Number) this.c.a(this)).longValue();
    }

    public final lj8 n0() {
        return (lj8) this.Y.getValue();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        nea nea = new nea(linearLayout.getContext(), 6);
        nea.setId(j8a.F0);
        nea.setTitle(l8a.s2);
        nea.setLeftActions(new vda(new l(21, this)));
        nea.setRightActions(new aea((jea) null, new iea(this)));
        linearLayout.addView(nea);
        FrameLayout frameLayout = new FrameLayout(linearLayout.getContext());
        frameLayout.setId(j8a.w0);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout.addView(frameLayout);
        return linearLayout;
    }

    public final void onDestroyView(View view) {
        bm3.r((nea) this.x0.T0(this, A0[1]));
        gba gba = this.y0;
        if (gba != null) {
            gba.a();
        }
        this.y0 = null;
        l0().r();
        ChatAdminsScreen.super.onDestroyView(view);
    }

    public final void onViewCreated(View view) {
        ax2 ax2 = (ax2) this.z0.T0(this, A0[2]);
        if (!hhd.f(ax2.b(), "admins_list_widget")) {
            vgc vgc = new vgc(new MembersListWidget(this.o, new aj8(m0(), ch2.ADMIN, (Integer) null, 12), (x54) null), (String) null, (wr3) null, (wr3) null, false, -1);
            vgc.d("admins_list_widget");
            ax2.a.R(vgc);
        }
    }

    public final void p() {
        n0().u((String) null);
    }

    public ChatAdminsScreen(long j) {
        this(jjd.j(new wia[]{new wia(ApiProtocol.KEY_ID, Long.valueOf(j))}));
    }
}
