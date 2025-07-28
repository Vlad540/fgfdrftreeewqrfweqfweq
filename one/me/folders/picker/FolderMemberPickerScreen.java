package one.me.folders.picker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.chats.picker.AbstractPickerScreen;
import one.me.chats.picker.chats.PickerChatsListWidget2;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B!\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0005\u0010\f¨\u0006\r"}, d2 = {"Lone/me/folders/picker/FolderMemberPickerScreen;", "Lone/me/chats/picker/AbstractPickerScreen;", "Lwq5;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "folderId", "resultTag", "", "membersIds", "(Ljava/lang/String;Ljava/lang/String;[J)V", "folders_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class FolderMemberPickerScreen extends AbstractPickerScreen<wq5> {
    public static final /* synthetic */ k77[] C0;
    public final jr A0;
    public final jr B0;
    public final sy6 x0;
    public final grd y0;
    public final j54 z0;

    static {
        Class<FolderMemberPickerScreen> cls = FolderMemberPickerScreen.class;
        C0 = new k77[]{new khb(cls, "folderId", "getFolderId()Ljava/lang/String;", 0), wn6.e(m7c.a, cls, "tag", "getTag()Ljava/lang/String;", 0)};
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [rr3, java.lang.Object, one.me.folders.picker.FolderMemberPickerScreen] */
    public FolderMemberPickerScreen(Bundle bundle) {
        super(bundle);
        this.x0 = sy6.d;
        this.y0 = hrd.a(new hge(h2a.a0));
        as5 as5 = as5.a;
        this.z0 = new j54((t97) as5.getAccessor().d(f03.class), (t97) as5.getAccessor().d(pae.class), (t97) as5.getAccessor().d(bv2.class), v0(bundle));
        Class<String> cls = String.class;
        this.A0 = new jr(cls, "folder_id");
        this.B0 = new jr(cls, "result_tag");
        hq0 hq0 = new hq0(this, new gz3(13, this));
        if (getRouter() != null) {
            getRouter().a(hq0);
        } else {
            addLifecycleListener(new s9(this, hq0, 5));
        }
    }

    public final sy6 getInsetsConfig() {
        return this.x0;
    }

    public final Iterable l0() {
        return hw4.a;
    }

    public final lta m0() {
        as5 as5 = as5.a;
        return new b0d(this.z0, new sp2(as5.getAccessor().d(bv2.class)), as5.getAccessor().d(ap3.class), as5.getAccessor().d(f03.class), 11);
    }

    public final Widget n0(String str) {
        return new PickerChatsListWidget2("all.chat.folder", str, (q72) null, false, false, (u16) null, 52, (x54) null);
    }

    public final nea o0(Context context) {
        nea nea = new nea(context, 6);
        nea.setId(d5a.a);
        nea.setTransitionName(context.getString(h2a.q));
        nea.setTitle(h2a.b0);
        nea.setForm(fea.a);
        nea.setLeftActions(new vda(new gw2(13, this)));
        return nea;
    }

    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        ez3.N(new ck5(wx3.e(u0().Z, getViewLifecycleOwner().R(), ob7.o), new xq5((Continuation) null, this), 5), getViewLifecycleScope());
        ez3.N(new ck5(((wq5) u0().c).e, new yq5((Continuation) null, this), 5), getViewLifecycleScope());
    }

    public final mua p0() {
        as5 as5 = as5.a;
        return new wq5(this.z0, as5.getAccessor().d(v72.class), as5.getAccessor().d(pae.class));
    }

    public final zqd r0() {
        return this.y0;
    }

    public final Set v0(Bundle bundle) {
        long[] longArray = bundle.getLongArray("preselected_ids");
        return longArray != null ? cs.h0(longArray) : qw4.a;
    }

    public FolderMemberPickerScreen(String str, String str2, long[] jArr) {
        this(jjd.j(new wia("folder_id", str), new wia("result_tag", str2), new wia("preselected_ids", jArr)));
    }
}
