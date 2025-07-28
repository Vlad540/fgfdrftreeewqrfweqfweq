package one.me.profile.screens.members.compact;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\t¨\u0006\n"}, d2 = {"Lone/me/profile/screens/members/compact/ChatMembersCompactWidget;", "Lone/me/sdk/arch/Widget;", "Llc3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "chatId", "(J)V", "profile_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class ChatMembersCompactWidget extends Widget implements lc3 {
    public static final /* synthetic */ k77[] Z;
    public final t97 X;
    public final n0c Y;
    public final jr a;
    public final String b;
    public final t97 c;
    public gba o;

    static {
        Class<ChatMembersCompactWidget> cls = ChatMembersCompactWidget.class;
        Z = new k77[]{new khb(cls, ApiProtocol.PARAM_CHAT_ID, "getChatId()J", 0), wn6.e(m7c.a, cls, "membersListRouter", "getMembersListRouter()Lone/me/sdk/arch/navigation/ChildSlotRouter;", 0)};
    }

    public ChatMembersCompactWidget(Bundle bundle) {
        super(bundle, 0, 2, (x54) null);
        this.a = new jr(Long.class, ApiProtocol.KEY_ID);
        this.b = us8.j(l0(), "profile:compactChatMembersList:{", "}");
        this.c = createViewModelLazy(di2.class, new s(28, new eh2(this, 1)));
        this.X = createViewModelLazy(lj8.class, new s(29, new eh2(this, 2)));
        pj5 pj5 = m0().C0;
        pc7 R = this.lifecycleOwner.R();
        ob7 ob7 = ob7.o;
        ez3.N(wx3.e(pj5, R, ob7), getLifecycleScope());
        ez3.N(new ck5(wx3.e(n0().X, this.lifecycleOwner.R(), ob7), new gh2(this, (Continuation) null), 5), getLifecycleScope());
        ez3.N(new ck5(wx3.e(m0().B0, this.lifecycleOwner.R(), ob7), new hp0(2, this, ChatMembersCompactWidget.class, "processEvents", "processEvents(Lone/me/profile/screens/members/ProfileListMembersEvents;)V", 4, 5), 5), getLifecycleScope());
        this.Y = childSlotRouter(j8a.v0);
    }

    public final sy6 getInsetsConfig() {
        sy6 sy6 = sy6.c;
        return sy6.c;
    }

    /* renamed from: getScopeId-IluPPks  reason: not valid java name */
    public final String m15getScopeIdIluPPks() {
        return this.b;
    }

    public final void i(int i, Bundle bundle) {
        long[] longArray;
        long[] longArray2;
        int i2 = j8a.A0;
        List list = hw4.a;
        List list2 = null;
        if (i == i2) {
            if (!(bundle == null || (longArray2 = bundle.getLongArray("profile:memberslist:ids_to_delete")) == null)) {
                list2 = cs.f0(longArray2);
            }
            if (list2 != null) {
                list = list2;
            }
            n0().q();
            n0().s(list);
            m0().u(list, false);
        } else if (i == j8a.C0) {
            if (!(bundle == null || (longArray = bundle.getLongArray("profile:memberslist:ids_to_delete")) == null)) {
                list2 = cs.f0(longArray);
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
        k77 k77 = Z[0];
        return ((Number) this.a.a(this)).longValue();
    }

    public final di2 m0() {
        return (di2) this.c.getValue();
    }

    public final lj8 n0() {
        return (lj8) this.X.getValue();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setId(j8a.v0);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return frameLayout;
    }

    public final void onDestroyView(View view) {
        gba gba = this.o;
        if (gba != null) {
            gba.a();
        }
        this.o = null;
        m0().w();
        ChatMembersCompactWidget.super.onDestroyView(view);
    }

    public final void onViewCreated(View view) {
        ((ax2) this.Y.T0(this, Z[1])).c("compact_members_list_widget", new eh2(this, 0));
    }

    public ChatMembersCompactWidget(long j) {
        this(jjd.j(new wia[]{new wia(ApiProtocol.KEY_ID, Long.valueOf(j))}));
    }
}
