package one.me.profile.screens.changeowner;

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

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0006\u0010\f¨\u0006\r"}, d2 = {"Lone/me/profile/screens/changeowner/ChangeOwnerScreen;", "Lone/me/sdk/arch/Widget;", "Loaa;", "Llc3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "chatId", "", "leaveFromChat", "(JZ)V", "profile_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class ChangeOwnerScreen extends Widget implements oaa, lc3 {
    public static final /* synthetic */ k77[] y0;
    public final String X;
    public final t97 Y;
    public final t97 Z;
    public final jj7 a;
    public final sy6 b;
    public final jr c;
    public final jr o;
    public final n0c w0;
    public final n0c x0;

    static {
        Class<ChangeOwnerScreen> cls = ChangeOwnerScreen.class;
        k77 khb = new khb(cls, ApiProtocol.PARAM_CHAT_ID, "getChatId()J", 0);
        n7c n7c = m7c.a;
        y0 = new k77[]{khb, wn6.e(n7c, cls, "leaveFromChat", "getLeaveFromChat()Z", 0), wn6.f(cls, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0, n7c), wn6.f(cls, "membersListRouter", "getMembersListRouter()Lone/me/sdk/arch/navigation/ChildSlotRouter;", 0, n7c)};
    }

    public ChangeOwnerScreen(Bundle bundle) {
        super(bundle, 0, 2, (x54) null);
        this.a = new jj7(new di1(27), (s16) null, 6);
        this.b = sy6.d;
        this.c = new jr(Long.class, "chat_id");
        this.o = new jr(Boolean.class, "leave_chat");
        this.X = us8.j(l0(), "profile:chatMembersList:{", "}");
        this.Y = createViewModelLazy(e02.class, new s(20, new nl1(4, this)));
        this.Z = createViewModelLazy(lj8.class, new s(21, new di1(28)));
        this.w0 = viewBinding(j8a.t);
        this.x0 = childSlotRouter(j8a.s);
    }

    public final void I(CharSequence charSequence) {
        ((lj8) this.Z.getValue()).u(String.valueOf(charSequence));
    }

    public final void T() {
        ((lj8) this.Z.getValue()).u((String) null);
    }

    public final sy6 getInsetsConfig() {
        return this.b;
    }

    /* renamed from: getScopeId-IluPPks  reason: not valid java name */
    public final String m12getScopeIdIluPPks() {
        return this.X;
    }

    public final rnc getScreenDelegate() {
        return this.a;
    }

    public final void i(int i, Bundle bundle) {
        if (i == j8a.q && bundle != null) {
            long j = bundle.getLong("new_owner_id");
            e02 e02 = (e02) this.Y.getValue();
            boolean m0 = m0();
            long j2 = e02.b;
            i22 i22 = (i22) ((aw2) ((bv2) e02.o.getValue())).m(j2).a.getValue();
            if (i22 != null) {
                ((gy9) ((pk) e02.c.getValue())).h(e02.b, i22.b.a, j);
                l05 l05 = e02.w0;
                if (m0) {
                    taf.n(e02, ((pae) e02.Y.getValue()).b(), (ru3) null, new d02(e02, (Continuation) null), 2);
                    taf.o(l05, new b02(new hge(l8a.c0), Integer.valueOf(phc.A)));
                    return;
                }
                taf.o(l05, new b02(new hge(l8a.j0), Integer.valueOf(phc.A)));
                taf.o(e02.Z, new vdb(j2, r6b.LOCAL_CHAT));
            }
        }
    }

    public final long l0() {
        k77 k77 = y0[0];
        return ((Number) this.c.a(this)).longValue();
    }

    public final boolean m0() {
        k77 k77 = y0[1];
        return ((Boolean) this.o.a(this)).booleanValue();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        nea nea = new nea(linearLayout.getContext(), 6);
        nea.setId(j8a.t);
        nea.setTitle(l8a.l0);
        nea.setLeftActions(new vda(new l(20, this)));
        nea.setRightActions(new aea((jea) null, new iea(this)));
        linearLayout.addView(nea);
        FrameLayout frameLayout = new FrameLayout(linearLayout.getContext());
        frameLayout.setId(j8a.s);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout.addView(frameLayout);
        return linearLayout;
    }

    public final void onDestroyView(View view) {
        bm3.r((nea) this.w0.T0(this, y0[2]));
        ChangeOwnerScreen.super.onDestroyView(view);
    }

    public final void onViewCreated(View view) {
        ax2 ax2 = (ax2) this.x0.T0(this, y0[3]);
        if (!hhd.f(ax2.b(), "change_owner_widget")) {
            vgc vgc = new vgc(new MembersListWidget(this.X, new aj8(l0(), ch2.MEMBER, (Integer) null, 12), (x54) null), (String) null, (wr3) null, (wr3) null, false, -1);
            vgc.d("change_owner_widget");
            ax2.a.R(vgc);
        }
        l05 l05 = ((lj8) this.Z.getValue()).X;
        ob7 ob7 = ob7.o;
        ez3.N(new ck5(wx3.e(l05, getViewLifecycleOwner().R(), ob7), new yz1((Continuation) null, this), 5), getViewLifecycleScope());
        t97 t97 = this.Y;
        ez3.N(new ck5(wx3.e(((e02) t97.getValue()).Z, getViewLifecycleOwner().R(), ob7), new zz1((Continuation) null, this), 5), getViewLifecycleScope());
        ez3.N(new ck5(wx3.e(((e02) t97.getValue()).w0, getViewLifecycleOwner().R(), ob7), new a02((Continuation) null, this), 5), getViewLifecycleScope());
    }

    public final void p() {
        ((lj8) this.Z.getValue()).u((String) null);
    }

    public ChangeOwnerScreen(long j, boolean z) {
        this(jjd.j(new wia[]{new wia("chat_id", Long.valueOf(j)), new wia("leave_chat", Boolean.valueOf(z))}));
    }
}
