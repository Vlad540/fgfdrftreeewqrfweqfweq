package one.me.settings.privacy.ui;

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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lone/me/settings/privacy/ui/SettingMediaScreen;", "Lone/me/sdk/arch/Widget;", "Llc3;", "<init>", "()V", "settings-media_release"}, k = 1, mv = {2, 0, 0})
public final class SettingMediaScreen extends Widget implements lc3 {
    public static final /* synthetic */ k77[] Y;
    public final e8d X;
    public final jj7 a = new jj7(new vfc(10), (s16) null, 6);
    public final sy6 b = sy6.d;
    public final t97 c = createViewModelLazy(i5d.class, new wq9(24, new vfc(11)));
    public final n0c o = viewBinding(saa.B);

    static {
        k77 khb = new khb(SettingMediaScreen.class, "recycler", "getRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0);
        m7c.a.getClass();
        Y = new k77[]{khb};
    }

    public SettingMediaScreen() {
        super((Bundle) null, 0, 3, (x54) null);
        e8d e8d = new e8d(new e3((Object) this), ((x4a) f8d.a.getAccessor().c(x4a.class)).a());
        this.X = e8d;
        ez3.N(new ck5(l0().Y, new kbb(2, e8d, e8d.class, "submitList", "submitList(Ljava/util/List;)V", 4, 2), 5), getLifecycleScope());
    }

    public final sy6 getInsetsConfig() {
        return this.b;
    }

    public final rnc getScreenDelegate() {
        return this.a;
    }

    public final void i(int i, Bundle bundle) {
        l0().s(i);
    }

    public final i5d l0() {
        return (i5d) this.c.getValue();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context = layoutInflater.getContext();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        nea nea = new nea(linearLayout.getContext(), 6);
        nea.setId(saa.E);
        nea.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        nea.setTitle(taa.u);
        nea.setForm(fea.a);
        nea.setLeftActions(new vda(new ljc(2, this)));
        linearLayout.addView(nea);
        RecyclerView recyclerView = new RecyclerView(linearLayout.getContext(), (AttributeSet) null);
        recyclerView.setId(saa.B);
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(this.X);
        recyclerView.setItemAnimator((k6c) null);
        recyclerView.j(new qtc(km4.y0.r(recyclerView), new sic(8, this), (o8) null, 12));
        recyclerView.j(new ix0(4));
        linearLayout.addView(recyclerView);
        urd.B(new o(3, (Continuation) null, 11), linearLayout);
        return linearLayout;
    }

    public final void onDestroyView(View view) {
        ((RecyclerView) this.o.T0(this, Y[0])).setAdapter((f6c) null);
        SettingMediaScreen.super.onDestroyView(view);
    }

    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        ez3.N(new ck5(wx3.e(l0().D0, getViewLifecycleOwner().R(), ob7.o), new x4d((Continuation) null, this), 5), getViewLifecycleScope());
    }
}
