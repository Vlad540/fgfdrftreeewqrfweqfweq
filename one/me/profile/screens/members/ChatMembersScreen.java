package one.me.profile.screens.members;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0006\u0010\f¨\u0006\r"}, d2 = {"Lone/me/profile/screens/members/ChatMembersScreen;", "Lone/me/sdk/arch/Widget;", "Llc3;", "Loaa;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "chatId", "Lch2;", "chatMemberType", "(JLch2;)V", "profile_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class ChatMembersScreen extends Widget implements lc3, oaa {
    public static final /* synthetic */ k77[] y0;
    public final t97 X;
    public final t97 Y;
    public final n0c Z;
    public final jj7 a;
    public final sy6 b;
    public final jr c;
    public final String o;
    public final n0c w0;
    public gba x0;

    static {
        Class<ChatMembersScreen> cls = ChatMembersScreen.class;
        k77 khb = new khb(cls, ApiProtocol.PARAM_CHAT_ID, "getChatId()J", 0);
        n7c n7c = m7c.a;
        y0 = new k77[]{khb, wn6.e(n7c, cls, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), wn6.f(cls, "membersListRouter", "getMembersListRouter()Lone/me/sdk/arch/navigation/ChildSlotRouter;", 0, n7c)};
    }

    public ChatMembersScreen(Bundle bundle) {
        super(bundle, 0, 2, (x54) null);
        this.a = new jj7(new p22(21), (s16) null, 6);
        this.b = sy6.d;
        this.c = new jr(Long.class, "profile:memberslist:id");
        this.o = us8.j(l0(), "profile:chatMembersList:{", "}");
        this.X = createViewModelLazy(di2.class, new rh2(0, new jh2(this, 0)));
        this.Y = createViewModelLazy(lj8.class, new rh2(1, new jh2(this, 1)));
        this.Z = viewBinding(j8a.E0);
        pj5 pj5 = m0().C0;
        pc7 R = this.lifecycleOwner.R();
        ob7 ob7 = ob7.o;
        ez3.N(new ck5(wx3.e(pj5, R, ob7), new lh2((Continuation) null, this), 5), getLifecycleScope());
        ez3.N(new ck5(wx3.e(n0().X, this.lifecycleOwner.R(), ob7), new mh2((Continuation) null, this), 5), getLifecycleScope());
        ez3.N(new ck5(wx3.e(m0().B0, this.lifecycleOwner.R(), ob7), new hp0(2, this, ChatMembersScreen.class, "processEvents", "processEvents(Lone/me/profile/screens/members/ProfileListMembersEvents;)V", 4, 6), 5), getLifecycleScope());
        this.w0 = childSlotRouter(j8a.v0);
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
    public final String m14getScopeIdIluPPks() {
        return this.o;
    }

    public final rnc getScreenDelegate() {
        return this.a;
    }

    public final void i(int i, Bundle bundle) {
        long[] longArray;
        long[] longArray2;
        int i2 = j8a.A0;
        List list = hw4.a;
        List list2 = null;
        if (i == i2 || i == j8a.z0) {
            if (!(bundle == null || (longArray = bundle.getLongArray("profile:memberslist:ids_to_delete")) == null)) {
                list2 = cs.f0(longArray);
            }
            if (list2 != null) {
                list = list2;
            }
            n0().q();
            n0().s(list);
            m0().u(list, false);
        } else if (i == j8a.C0) {
            if (!(bundle == null || (longArray2 = bundle.getLongArray("profile:memberslist:ids_to_delete")) == null)) {
                list2 = cs.f0(longArray2);
            }
            if (list2 != null) {
                list = list2;
            }
            n0().q();
            n0().s(list);
            m0().u(list, true);
        }
    }

    public final long l0() {
        k77 k77 = y0[0];
        return ((Number) this.c.a(this)).longValue();
    }

    public final di2 m0() {
        return (di2) this.X.getValue();
    }

    public final lj8 n0() {
        return (lj8) this.Y.getValue();
    }

    public final nea o0() {
        return (nea) this.Z.T0(this, y0[1]);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        nea nea = new nea(linearLayout.getContext(), 6);
        nea.setId(j8a.E0);
        nea.setLeftActions(new vda(new kh2(this, 0)));
        linearLayout.addView(nea);
        FrameLayout frameLayout = new FrameLayout(linearLayout.getContext());
        frameLayout.setId(j8a.v0);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout.addView(frameLayout);
        return linearLayout;
    }

    public final void onDestroyView(View view) {
        bm3.r(o0());
        n0().q();
        gba gba = this.x0;
        if (gba != null) {
            gba.a();
        }
        this.x0 = null;
        m0().w();
        ChatMembersScreen.super.onDestroyView(view);
    }

    public final void onViewCreated(View view) {
        ex9 h = getRouter().h();
        if (h != null) {
            h.a(getViewLifecycleOwner(), new or3(this, 4));
        }
        ((ax2) this.w0.T0(this, y0[2])).c("members_list_widget", new jh2(this, 2));
        ez3.N(new ck5(wx3.e(n0().w0, getViewLifecycleOwner().R(), ob7.o), new nh2((Continuation) null, this), 5), getViewLifecycleScope());
    }

    public final void p() {
        n0().u((String) null);
    }

    public ChatMembersScreen(long j, ch2 ch2) {
        this(jjd.j(new wia[]{new wia("profile:memberslist:id", Long.valueOf(j)), new wia("profile:memberslist:type", ch2.a)}));
    }
}
