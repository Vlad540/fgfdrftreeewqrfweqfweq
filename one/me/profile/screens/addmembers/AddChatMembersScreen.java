package one.me.profile.screens.addmembers;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import java.util.Collections;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.chats.picker.AbstractPickerScreen;
import one.me.chats.picker.members.PickerMembersListWidget;
import one.me.sdk.arch.Widget;
import one.me.sdk.uikit.common.button.OneMeButton;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lone/me/profile/screens/addmembers/AddChatMembersScreen;", "Lone/me/chats/picker/AbstractPickerScreen;", "Lo9;", "Llc3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "chatId", "(J)V", "profile_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class AddChatMembersScreen extends AbstractPickerScreen<o9> implements lc3 {
    public static final /* synthetic */ k77[] B0;
    public final grd A0;
    public final jr x0;
    public final jr y0;
    public final jj7 z0;

    static {
        Class<AddChatMembersScreen> cls = AddChatMembersScreen.class;
        B0 = new k77[]{new khb(cls, ApiProtocol.PARAM_CHAT_ID, "getChatId()J", 0), c3d.g(m7c.a, cls, "selectedIds", "getSelectedIds()[J")};
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [one.me.profile.screens.addmembers.AddChatMembersScreen, rr3, one.me.sdk.arch.Widget, java.lang.Object, one.me.chats.picker.AbstractPickerScreen] */
    public AddChatMembersScreen(Bundle bundle) {
        super(bundle);
        this.x0 = new jr(Long.class, 0L, "chat_id");
        this.y0 = new jr(long[].class, "selected_ids");
        this.z0 = new jj7(new m(2), (s16) null, 6);
        this.A0 = hrd.a(new hge(l8a.d));
        ez3.N(new ck5(u0().Z, new p9((Continuation) null, this), 5), getLifecycleScope());
        hq0 hq0 = new hq0((rr3) this, (s16) new c6(3, this));
        if (getRouter() != null) {
            getRouter().a(hq0);
        } else {
            addLifecycleListener(new s9(this, hq0, 0));
        }
    }

    public final rnc getScreenDelegate() {
        return this.z0;
    }

    public final void i(int i, Bundle bundle) {
        if (i != j8a.h) {
            o9 o9Var = u0().c;
            Set set = (Set) u0().Z.a.getValue();
            ou3 ou3 = o9Var.d;
            qod qod = null;
            if (ou3 != null) {
                qod = xs7.D(ou3, ((pae) o9Var.c.getValue()).b(), ru3.b, new n9(i, o9Var, set, (Continuation) null));
            }
            o9Var.g.o1(o9Var, o9.i[0], qod);
        }
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [one.me.profile.screens.addmembers.AddChatMembersScreen, one.me.sdk.arch.Widget, java.lang.Object, one.me.chats.picker.AbstractPickerScreen] */
    public final Iterable l0() {
        OneMeButton oneMeButton = new OneMeButton(getContext(), (AttributeSet) null);
        oneMeButton.setSize(v0a.c);
        oneMeButton.setAppearance(s0a.o);
        oneMeButton.setMode(u0a.a);
        oneMeButton.setText(u0().c.h ? l8a.c : l8a.b);
        oneMeButton.c(1, false);
        oneMeButton.setVisibility(8);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        int X = a24.X(((float) 12) * dh4.c().getDisplayMetrics().density);
        layoutParams.setMargins(X, X, X, X);
        oneMeButton.setLayoutParams(layoutParams);
        a24.a0(oneMeButton, new d5(5, (Object) this));
        ez3.N(new ck5(u0().Z, new q9(oneMeButton, (Continuation) null), 5), getViewLifecycleScope());
        return Collections.singletonList(oneMeButton);
    }

    public final lta m0() {
        return (ni8) i6b.a.getAccessor().c(ni8.class);
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [one.me.profile.screens.addmembers.AddChatMembersScreen, one.me.sdk.arch.Widget] */
    public final Widget n0(String str) {
        k77 k77 = B0[0];
        return new PickerMembersListWidget(str, ((Number) this.x0.a(this)).longValue(), true, (x54) null);
    }

    public final nea o0(Context context) {
        nea nea = new nea(context, 6);
        nea.setId(j8a.k);
        nea.setTitle(u0().c.h ? l8a.f : l8a.e);
        nea.setForm(fea.a);
        nea.setLeftActions(new vda(new l(3, this)));
        return nea;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [one.me.profile.screens.addmembers.AddChatMembersScreen, one.me.sdk.arch.Widget, one.me.chats.picker.AbstractPickerScreen] */
    public final void onViewCreated(View view) {
        AddChatMembersScreen.super.onViewCreated(view);
        ez3.N(new ck5(wx3.e(u0().c.f, getViewLifecycleOwner().R(), ob7.o), new r9((Continuation) null, this), 5), getViewLifecycleScope());
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [one.me.profile.screens.addmembers.AddChatMembersScreen, one.me.sdk.arch.Widget] */
    public final mua p0() {
        k77 k77 = B0[0];
        long longValue = ((Number) this.x0.a(this)).longValue();
        i6b i6b = i6b.a;
        return new o9(longValue, i6b.c(), i6b.f());
    }

    public final zqd r0() {
        return this.A0;
    }

    public final Set v0(Bundle bundle) {
        long[] longArray = bundle.getLongArray("selected_ids");
        Set h0 = longArray != null ? cs.h0(longArray) : null;
        return h0 == null ? qw4.a : h0;
    }

    public AddChatMembersScreen(long j) {
        this(jjd.j(new wia[]{new wia("chat_id", Long.valueOf(j))}));
    }
}
