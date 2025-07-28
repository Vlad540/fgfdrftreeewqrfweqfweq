package one.me.profile.screens.addadmins.fromcontacts;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;
import one.me.sdk.uikit.common.views.EmptySearchView;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0019\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0005\u0010\u000b¨\u0006\f"}, d2 = {"Lone/me/profile/screens/addadmins/fromcontacts/AdminsFromContactsScreen;", "Lone/me/sdk/arch/Widget;", "Llb;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Linc;", "scopeId", "", "chatId", "(Ljava/lang/String;JLx54;)V", "profile_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class AdminsFromContactsScreen extends Widget implements lb {
    public static final /* synthetic */ k77[] y0;
    public final n0c X;
    public kme Y;
    public ryd Z;
    public final jr a;
    public final t97 b;
    public final t97 c;
    public final n0c o;
    public final ExecutorService w0;
    public final mr5 x0;

    static {
        Class<AdminsFromContactsScreen> cls = AdminsFromContactsScreen.class;
        k77 khb = new khb(cls, ApiProtocol.PARAM_CHAT_ID, "getChatId()J", 0);
        n7c n7c = m7c.a;
        y0 = new k77[]{khb, wn6.e(n7c, cls, "recyclerView", "getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0), wn6.f(cls, "emptySearchView", "getEmptySearchView()Lone/me/sdk/uikit/common/views/EmptySearchView;", 0, n7c)};
    }

    public AdminsFromContactsScreen(String str, long j, x54 x54) {
        this(jjd.j(new wia[]{new wia("arg_scope_id", new inc(str)), new wia("profile:add_admins_from_contacts:chat_id", Long.valueOf(j))}));
    }

    public final void l0(RecyclerView recyclerView) {
        ryd ryd = new ryd(recyclerView, this.x0, new hj2(4, new l(6, this)));
        this.Z = ryd;
        recyclerView.j(ryd);
        urd.B(new rb(ryd, (Continuation) null, 0), recyclerView);
    }

    public final RecyclerView m0() {
        return (RecyclerView) this.o.T0(this, y0[1]);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        RecyclerView recyclerView = new RecyclerView(frameLayout.getContext(), (AttributeSet) null);
        recyclerView.setId(j8a.b);
        recyclerView.setItemAnimator((k6c) null);
        recyclerView.setAdapter(this.x0);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setClipToPadding(false);
        this.Y = gp0.l(recyclerView);
        l0(recyclerView);
        frameLayout.addView(recyclerView);
        EmptySearchView emptySearchView = new EmptySearchView(frameLayout.getContext(), (AttributeSet) null);
        emptySearchView.setId(j8a.a);
        emptySearchView.setGravity(17);
        emptySearchView.setTitle(rhc.c0);
        emptySearchView.setDescription(rhc.b0);
        emptySearchView.setIsButtonVisible(false);
        frameLayout.addView(emptySearchView);
        return frameLayout;
    }

    public final void onDestroyView(View view) {
        kme kme = this.Y;
        if (kme != null) {
            kme.B(m0());
        }
        this.Y = null;
        this.Z = null;
        AdminsFromContactsScreen.super.onDestroyView(view);
    }

    public final void onViewCreated(View view) {
        bc bcVar = ((cc) this.c.getValue()).w0;
        ob7 ob7 = ob7.o;
        ez3.N(new ck5(wx3.e(bcVar, getViewLifecycleOwner().R(), ob7), new sb((Continuation) null, this), 5), getViewLifecycleScope());
        ez3.N(new ck5(wx3.e(((lj8) this.b.getValue()).y0, getViewLifecycleOwner().R(), ob7), new tb((Continuation) null, this), 5), getViewLifecycleScope());
    }

    public AdminsFromContactsScreen(Bundle bundle) {
        super(bundle, 0, 2, (x54) null);
        this.a = new jr(Long.class, "profile:add_admins_from_contacts:chat_id");
        Class<inc> cls = inc.class;
        Object E = ek8.E(bundle, "arg_scope_id", cls);
        if (E != null) {
            this.b = m25getSharedViewModelcp94BC8(((inc) ((Parcelable) E)).a, lj8.class, (s16) null);
            this.c = createViewModelLazy(cc.class, new s(4, new c6(4, this)));
            this.o = viewBinding(j8a.b);
            this.X = viewBinding(j8a.a);
            ExecutorService a2 = ((x4a) i6b.a.getAccessor().c(x4a.class)).a();
            this.w0 = a2;
            this.x0 = new mr5(this, a2, 2);
            return;
        }
        throw new IllegalArgumentException(wn6.i("No value passed for key arg_scope_id of type ", cls.getSimpleName(), " in bundle").toString());
    }
}
