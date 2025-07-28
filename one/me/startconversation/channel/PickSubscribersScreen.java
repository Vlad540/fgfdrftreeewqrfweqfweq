package one.me.startconversation.channel;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.util.Collections;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.chats.picker.AbstractPickerScreen;
import one.me.chats.picker.members.PickerMembersListWidget;
import one.me.sdk.arch.Widget;
import one.me.sdk.uikit.common.button.OneMeButton;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\t¨\u0006\n"}, d2 = {"Lone/me/startconversation/channel/PickSubscribersScreen;", "Lone/me/chats/picker/AbstractPickerScreen;", "Lgqa;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "chatId", "(J)V", "start-conversation_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class PickSubscribersScreen extends AbstractPickerScreen<gqa> {
    public static final /* synthetic */ k77[] D0;
    public gba A0;
    public final grd B0;
    public final nl0 C0;
    public final jr x0;
    public final jr y0;
    public final r7e z0;

    static {
        Class<PickSubscribersScreen> cls = PickSubscribersScreen.class;
        D0 = new k77[]{new hc9(cls, "selectedIds", "getSelectedIds()[J"), m4b.g(m7c.a, cls, ApiProtocol.PARAM_CHAT_ID, "getChatId()J", 0), new khb(cls, "confirmButton", "getConfirmButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0)};
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [one.me.startconversation.channel.PickSubscribersScreen, rr3, one.me.sdk.arch.Widget, one.me.chats.picker.AbstractPickerScreen] */
    public PickSubscribersScreen(Bundle bundle) {
        super(bundle);
        this.x0 = new jr(long[].class, "selected_ids");
        this.y0 = new jr(Long.class, ApiProtocol.KEY_ID);
        this.z0 = new r7e(new qga(2));
        this.B0 = hrd.a(new hge(lca.w));
        this.C0 = binding(new nqa(this, 0));
        ez3.N(new ck5(u0().Z, new pqa(this, (Continuation) null), 5), getLifecycleScope());
        hq0 hq0 = new hq0((rr3) this, (s16) new nqa(this, 1));
        if (getRouter() != null) {
            getRouter().a(hq0);
        } else {
            addLifecycleListener(new s9(this, hq0, 11));
        }
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [one.me.startconversation.channel.PickSubscribersScreen, one.me.sdk.arch.Widget, one.me.chats.picker.AbstractPickerScreen] */
    public final Iterable l0() {
        ez3.N(new ck5(u0().Z, new rqa(this, (Continuation) null), 5), getViewLifecycleScope());
        return Collections.singletonList(w0());
    }

    public final lta m0() {
        return (ni8) ipd.a.getAccessor().c(ni8.class);
    }

    public final Widget n0(String str) {
        return new PickerMembersListWidget(str, 0, false, 6, (x54) null);
    }

    public final nea o0(Context context) {
        nea nea = new nea(context, 6);
        nea.setId(kca.p);
        nea.setTitle(lca.e);
        nea.setForm(fea.a);
        nea.setLeftActions(new vda(new oqa(this, 0)));
        return nea;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [one.me.startconversation.channel.PickSubscribersScreen, one.me.sdk.arch.Widget, one.me.chats.picker.AbstractPickerScreen] */
    public final void onViewCreated(View view) {
        PickSubscribersScreen.super.onViewCreated(view);
        ez3.N(new ck5(u0().c.h, new sqa(this, (Continuation) null), 5), getViewLifecycleScope());
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [one.me.startconversation.channel.PickSubscribersScreen, one.me.sdk.arch.Widget] */
    public final mua p0() {
        k77 k77 = D0[1];
        long longValue = ((Number) this.y0.a(this)).longValue();
        ipd ipd = ipd.a;
        return new gqa(longValue, ipd.getAccessor().d(pk.class), ipd.getAccessor().d(pae.class), ipd.getAccessor().d(bv2.class), ipd.getAccessor().d(mqa.class), ipd.getAccessor().d(ed3.class));
    }

    public final zqd r0() {
        return this.B0;
    }

    public final Set v0(Bundle bundle) {
        long[] longArray = bundle.getLongArray("selected_ids");
        Set h0 = longArray != null ? cs.h0(longArray) : null;
        return h0 == null ? qw4.a : h0;
    }

    public final OneMeButton w0() {
        k77 k77 = D0[2];
        return (OneMeButton) this.C0.getValue();
    }

    public PickSubscribersScreen(long j) {
        this(jjd.j(new wia[]{new wia(ApiProtocol.KEY_ID, Long.valueOf(j))}));
    }
}
