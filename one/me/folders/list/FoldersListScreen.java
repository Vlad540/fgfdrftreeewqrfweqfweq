package one.me.folders.list;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lone/me/folders/list/FoldersListScreen;", "Lone/me/sdk/arch/Widget;", "Lh27;", "Llc3;", "Ltq3;", "<init>", "()V", "folders_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class FoldersListScreen extends Widget implements h27, lc3, tq3 {
    public static final /* synthetic */ k77[] Z;
    public final ds5 X = new ds5(((x4a) as5.a.getAccessor().c(x4a.class)).a(), new f(1, this, FoldersListScreen.class, "onFolderClick", "onFolderClick(Lone/me/folders/list/adapter/UserFolderListItem;)V", 0, 23), new ps0(3, this, FoldersListScreen.class, "onActionMenuClick", "onActionMenuClick(Landroid/view/View;Lone/me/folders/list/adapter/UserFolderListItem;I)V", 0, 2), new za6((Object) this));
    public final n0c Y = viewBinding(d5a.m);
    public final jj7 a = new jj7((s16) new fs5(0), (s16) null, 6);
    public final sy6 b = sy6.d;
    public final t97 c = createViewModelLazy(os5.class, new js5(0, new fs5(1)));
    public final o27 o = new o27(new j27(this));

    static {
        khb khb = new khb(FoldersListScreen.class, "foldersRecycler", "getFoldersRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0);
        m7c.a.getClass();
        Z = new k77[]{khb};
    }

    public FoldersListScreen() {
        super((Bundle) null, 0, 3, (x54) null);
    }

    public final void V(int i, int i2) {
        this.X.V(i, i2);
    }

    public final sy6 getInsetsConfig() {
        return this.b;
    }

    public final rnc getScreenDelegate() {
        return this.a;
    }

    public final void i(int i, Bundle bundle) {
        if (i == d5a.c) {
            os5 l0 = l0();
            xs7.E(l0.a, l0.c.a(), (ru3) null, new ls5(l0, (Continuation) null), 2);
        }
    }

    public final os5 l0() {
        return (os5) this.c.getValue();
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [f6c, ds5] */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        nea nea = new nea(getContext(), 6);
        nea.setId(d5a.o);
        nea.setForm(fea.a);
        nea.setTitle(f5a.c);
        nea.setLeftActions(new vda(new gw2(14, this)));
        RecyclerView recyclerView = new RecyclerView(getContext(), (AttributeSet) null);
        recyclerView.setId(d5a.m);
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        recyclerView.setItemAnimator((k6c) null);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(this.X);
        this.o.i(recyclerView);
        recyclerView.j(new iq(6));
        s59 s59 = km4.y0;
        s59.r(recyclerView);
        recyclerView.j(new ku7(2));
        recyclerView.j(new es5((Context) as5.a.getAccessor().c(Context.class)));
        recyclerView.j(new es5(s59.r(recyclerView)));
        LinearLayout linearLayout = new LinearLayout(viewGroup.getContext());
        linearLayout.setId(d5a.n);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout.setOrientation(1);
        linearLayout.addView(nea);
        linearLayout.addView(recyclerView);
        urd.B(new o(3, (Continuation) null, 4), linearLayout);
        return linearLayout;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [rr3, one.me.folders.list.FoldersListScreen] */
    public final void onDestroyView(View view) {
        FoldersListScreen.super.onDestroyView(view);
        this.o.i((RecyclerView) null);
    }

    public final void onViewCreated(View view) {
        l05 l05 = l0().Z;
        ob7 ob7 = ob7.o;
        ez3.N(new ck5(wx3.e(l05, getViewLifecycleOwner().R(), ob7), new gs5((Continuation) null, this), 5), getViewLifecycleScope());
        ez3.N(new ck5(wx3.e(l0().Y, getViewLifecycleOwner().R(), ob7), new hs5((Continuation) null, this), 5), getViewLifecycleScope());
    }

    public final void y(int i, Bundle bundle) {
        xye xye;
        ep5 ep5;
        CharSequence charSequence;
        ep5 ep52;
        String str;
        if (i == d5a.j) {
            os5 l0 = l0();
            xye xye2 = l0.x0;
            if (xye2 != null && (ep52 = xye2.a) != null && (str = ep52.a) != null) {
                er5.c.getClass();
                taf.o(l0.Z, new a34(":settings/folder/edit?id=".concat(str)));
            }
        } else if (i == d5a.k && (xye = l0().x0) != null && (ep5 = xye.a) != null && (charSequence = ep5.b) != null) {
            jjd.P(charSequence, this);
        }
    }
}
