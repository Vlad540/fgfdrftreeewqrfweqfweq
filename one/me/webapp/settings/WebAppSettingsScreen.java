package one.me.webapp.settings;

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

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\t¨\u0006\n"}, d2 = {"Lone/me/webapp/settings/WebAppSettingsScreen;", "Lone/me/sdk/arch/Widget;", "Llc3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "botId", "(J)V", "web-app_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class WebAppSettingsScreen extends Widget implements lc3 {
    public static final /* synthetic */ k77[] w0;
    public final n0c X;
    public mif Y;
    public final cpf Z;
    public final jj7 a;
    public final sy6 b;
    public final t97 c;
    public final n0c o;

    static {
        Class<WebAppSettingsScreen> cls = WebAppSettingsScreen.class;
        k77 khb = new khb(cls, "botId", "getBotId()J", 0);
        n7c n7c = m7c.a;
        w0 = new k77[]{khb, wn6.e(n7c, cls, "recycler", "getRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0), wn6.f(cls, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0, n7c)};
    }

    public WebAppSettingsScreen(Bundle bundle) {
        super(bundle, 0, 2, (x54) null);
        this.a = new jj7(new vif(5), (s16) null, 6);
        this.b = sy6.d;
        this.c = createViewModelLazy(anf.class, new ypd(10, new fe2(bundle, 10)));
        this.o = viewBinding(vea.f);
        this.X = viewBinding(vea.i);
        this.Z = new cpf(((x4a) uif.a.getAccessor().c(x4a.class)).a(), (Object) new tmf(this), 0);
    }

    public final sy6 getInsetsConfig() {
        return this.b;
    }

    public final rnc getScreenDelegate() {
        return this.a;
    }

    public final void i(int i, Bundle bundle) {
    }

    public final anf l0() {
        return (anf) this.c.getValue();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context = layoutInflater.getContext();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        nea nea = new nea(linearLayout.getContext(), 6);
        nea.setId(vea.i);
        nea.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        nea.setForm(fea.a);
        nea.setLeftActions(new vda(new ljc(13, this)));
        linearLayout.addView(nea);
        RecyclerView recyclerView = new RecyclerView(linearLayout.getContext(), (AttributeSet) null);
        recyclerView.setId(vea.f);
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(this.Z);
        float f = (float) 12;
        recyclerView.setPadding(a24.X(dh4.c().getDisplayMetrics().density * f), recyclerView.getPaddingTop(), a24.X(f * dh4.c().getDisplayMetrics().density), recyclerView.getPaddingBottom());
        recyclerView.j(new qtc(km4.y0.r(recyclerView), new xle(15, (Object) this), (o8) null, 12));
        recyclerView.j(new n51());
        linearLayout.addView(recyclerView);
        urd.B(new o(3, (Continuation) null, 15), linearLayout);
        return linearLayout;
    }

    public final void onDestroyView(View view) {
        ((RecyclerView) this.o.T0(this, w0[1])).setAdapter((f6c) null);
        this.Y = null;
        WebAppSettingsScreen.super.onDestroyView(view);
    }

    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.Y = new mif(requireActivity(), new e78(0, l0(), anf.class, "onBiometrySuccess", "onBiometrySuccess()V", 0, 20), new e78(0, l0(), anf.class, "onBiometryFail", "onBiometryFail()V", 0, 21));
        t0c t0c = l0().y0;
        ob7 ob7 = ob7.o;
        ez3.N(new ck5(wx3.e(t0c, getViewLifecycleOwner().R(), ob7), new qmf((Continuation) null, this), 5), getViewLifecycleScope());
        ez3.N(new ck5(wx3.e(l0().z0, getViewLifecycleOwner().R(), ob7), new rmf((Continuation) null, this), 5), getViewLifecycleScope());
        ez3.N(new ck5(wx3.e(l0().A0, getViewLifecycleOwner().R(), ob7), new smf((Continuation) null, this), 5), getViewLifecycleScope());
    }

    public WebAppSettingsScreen(long j) {
        this(jjd.j(new wia[]{new wia("bot_id_arg", Long.valueOf(j))}));
    }
}
