package one.me.startconversation.chat;

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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lone/me/startconversation/chat/PickChatMembers;", "Lone/me/chats/picker/AbstractPickerScreen;", "Lzpa;", "<init>", "()V", "start-conversation_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class PickChatMembers extends AbstractPickerScreen<zpa> {
    public static final /* synthetic */ k77[] B0;
    public final grd A0 = hrd.a(new hge(lca.w));
    public final jr x0 = new jr(long[].class, "selected_ids");
    public final t97 y0 = ipd.a.getAccessor().d(qna.class);
    public final jj7 z0 = new jj7(new qga(1), (s16) null, 6);

    static {
        k77 hc9 = new hc9(PickChatMembers.class, "selectedIds", "getSelectedIds()[J");
        m7c.a.getClass();
        B0 = new k77[]{hc9};
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [one.me.startconversation.chat.PickChatMembers, rr3, one.me.sdk.arch.Widget, java.lang.Object, one.me.chats.picker.AbstractPickerScreen] */
    public PickChatMembers() {
        super(new Bundle(0));
        ez3.N(new ck5(u0().Z, new vpa((Continuation) null, this), 5), getLifecycleScope());
        hq0 hq0 = new hq0((rr3) this, (s16) new qk8(25, this));
        if (getRouter() != null) {
            getRouter().a(hq0);
        } else {
            addLifecycleListener(new s9(this, hq0, 10));
        }
    }

    public final rnc getScreenDelegate() {
        return this.z0;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [one.me.startconversation.chat.PickChatMembers, one.me.sdk.arch.Widget, java.lang.Object, one.me.chats.picker.AbstractPickerScreen] */
    public final Iterable l0() {
        OneMeButton oneMeButton = new OneMeButton(getContext(), (AttributeSet) null);
        oneMeButton.setSize(v0a.c);
        oneMeButton.setAppearance(s0a.o);
        oneMeButton.setMode(u0a.a);
        oneMeButton.setText(h2a.Q);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        int X = a24.X(((float) 12) * dh4.c().getDisplayMetrics().density);
        layoutParams.setMargins(X, X, X, X);
        oneMeButton.setLayoutParams(layoutParams);
        a24.a0(oneMeButton, new eu5(24, this));
        ez3.N(new ck5(u0().Z, new wpa(oneMeButton, (Continuation) null), 5), getViewLifecycleScope());
        return Collections.singletonList(oneMeButton);
    }

    public final lta m0() {
        return (ni8) ipd.a.getAccessor().c(ni8.class);
    }

    public final Widget n0(String str) {
        return new PickerMembersListWidget(str, 0, false, 6, (x54) null);
    }

    public final nea o0(Context context) {
        nea nea = new nea(context, 6);
        nea.setId(kca.k);
        nea.setTitle(lca.g);
        nea.setForm(fea.a);
        nea.setLeftActions(new vda(new e98(12, this)));
        return nea;
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [one.me.startconversation.chat.PickChatMembers, one.me.sdk.arch.Widget] */
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 156) {
            jrf jrf = new jrf(this, 1);
            String[] strArr2 = qna.e;
            int i2 = cic.O1;
            int i3 = cic.U1;
            ((qna) this.y0.getValue()).getClass();
            qna.k(jrf, strArr, iArr, strArr2, i2, i3);
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [one.me.startconversation.chat.PickChatMembers, one.me.sdk.arch.Widget, one.me.chats.picker.AbstractPickerScreen] */
    public final void onViewCreated(View view) {
        PickChatMembers.super.onViewCreated(view);
        ez3.N(new ck5(wx3.e(u0().c.e, getViewLifecycleOwner().R(), ob7.o), new xpa((Continuation) null, this), 5), getViewLifecycleScope());
    }

    public final mua p0() {
        return new zpa();
    }

    public final zqd r0() {
        return this.A0;
    }

    public final Set v0(Bundle bundle) {
        long[] longArray = bundle.getLongArray("selected_ids");
        Set h0 = longArray != null ? cs.h0(longArray) : null;
        return h0 == null ? qw4.a : h0;
    }
}
