package one.me.chats.picker.members;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0011\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B%\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0006\u0010\u000e¨\u0006\u000f"}, d2 = {"Lone/me/chats/picker/members/PickerMembersListWidget;", "Lone/me/sdk/arch/Widget;", "Lfra;", "", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Linc;", "scopeId", "", "chatId", "", "decorsEnabled", "(Ljava/lang/String;JZLx54;)V", "chats-list_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class PickerMembersListWidget extends Widget implements fra {
    public static final /* synthetic */ k77[] B0;
    public ryd A0;
    public final ExecutorService X;
    public final gra Y;
    public final gra Z;
    public final jr a;
    public final jr b;
    public final t97 c;
    public final t97 o;
    public final nl0 w0;
    public final nl0 x0;
    public ibe y0;
    public xj6 z0;

    static {
        Class<PickerMembersListWidget> cls = PickerMembersListWidget.class;
        khb khb = new khb(cls, "chatId", "getChatId()J", 0);
        n7c n7c = m7c.a;
        B0 = new k77[]{khb, wn6.e(n7c, cls, "decorsEnabled", "getDecorsEnabled()Z", 0), wn6.f(cls, "recyclerView", "getRecyclerView()Lone/me/sdk/lists/widgets/EndlessRecyclerView2;", 0, n7c)};
    }

    public PickerMembersListWidget(String str, long j, boolean z, x54 x54) {
        this(jjd.j(new wia("arg_key_scope_id", new inc(str)), new wia("chat_id", Long.valueOf(j)), new wia("decors_enabled", Boolean.valueOf(z))));
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [f6c, gra] */
    public final void l0(EndlessRecyclerView2 endlessRecyclerView2) {
        hj2 hj2 = new hj2(4, new e98(17, this));
        ryd ryd = new ryd(endlessRecyclerView2, this.Y, hj2);
        this.A0 = ryd;
        endlessRecyclerView2.j(ryd);
        xj6 xj6 = new xj6(hj2);
        this.z0 = xj6;
        endlessRecyclerView2.j(xj6);
        urd.B(new rb(ryd, (Continuation) null, 3), endlessRecyclerView2);
    }

    public final boolean m0() {
        k77 k77 = B0[1];
        return ((Boolean) this.b.a(this)).booleanValue();
    }

    public final wra n0() {
        return (wra) this.c.getValue();
    }

    public final EndlessRecyclerView2 o0() {
        k77 k77 = B0[2];
        return (EndlessRecyclerView2) this.x0.getValue();
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [rr3, one.me.sdk.arch.Widget, one.me.chats.picker.members.PickerMembersListWidget] */
    public final void onContextAvailable(Context context) {
        PickerMembersListWidget.super.onContextAvailable(context);
        ez3.N(new ck5(n0().y0, new hp0(2, (kua) this.o.getValue(), kua.class, "onSearch", "onSearch(Ljava/lang/String;)V", 4, 27), 5), getLifecycleScope());
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        frameLayout.addView(o0());
        return frameLayout;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [rr3, one.me.chats.picker.members.PickerMembersListWidget] */
    public final void onDestroyView(View view) {
        ibe ibe = this.y0;
        if (ibe != null) {
            ibe.B(o0());
        }
        this.y0 = null;
        this.z0 = null;
        this.A0 = null;
        PickerMembersListWidget.super.onDestroyView(view);
    }

    public final void onViewCreated(View view) {
        PickerMembersListWidget.super.onViewCreated(view);
        ez3.N(new ck5(wx3.e(((kua) this.o.getValue()).Y, getViewLifecycleOwner().R(), ob7.o), new eua((Continuation) null, this, view), 5), getViewLifecycleScope());
        ez3.N(new ck5(n0().Z, new fua(this, (Continuation) null), 5), getViewLifecycleScope());
        ez3.N(new ck5(n0().y0, new gua(this, (Continuation) null), 5), getViewLifecycleScope());
    }

    public final void z(long j, yta yta) {
        n0().q(j, yta);
    }

    public PickerMembersListWidget(Bundle bundle) {
        super(bundle, 0, 2, (x54) null);
        t0c t0c;
        this.a = new jr(Long.class, 0L, "chat_id");
        this.b = new jr(Boolean.class, Boolean.TRUE, "decors_enabled");
        Class<inc> cls = inc.class;
        Object E = ek8.E(bundle, "arg_key_scope_id", cls);
        if (E != null) {
            this.c = getSharedViewModel-cp94BC8(((Parcelable) E).a, wra.class, (s16) null);
            t97 createViewModelLazy = createViewModelLazy(kua.class, new wq9(11, new cua(this, 0)));
            this.o = createViewModelLazy;
            ExecutorService a2 = tp2.a.c().a();
            this.X = a2;
            this.Y = new gra(this, a2, 0);
            this.Z = new gra(this, a2, 0);
            this.w0 = binding(new cua(this, 1));
            this.x0 = binding(new cua(this, 2));
            kua kua = (kua) createViewModelLazy.getValue();
            boolean r = kua.r();
            dk8 dk8 = kua.c;
            if (r) {
                w09 w09 = new w09(((pk8) dk8).k, kua, 5);
                hw4 hw4 = hw4.a;
                t0c = ez3.d0(w09, kua.a, ucd.a, hw4);
            } else {
                t0c = ((pk8) dk8).k;
            }
            ez3.N(new ck5(t0c, new dua(this, (Continuation) null), 5), getLifecycleScope());
            return;
        }
        throw new IllegalArgumentException(wn6.i("No value passed for key arg_key_scope_id of type ", cls.getSimpleName(), " in bundle").toString());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PickerMembersListWidget(String str, long j, boolean z, int i, x54 x54) {
        this(str, (i & 2) != 0 ? 0 : j, (i & 4) != 0 ? true : z, (x54) null);
    }
}
