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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lone/me/webapp/settings/WebAppsSettingScreen;", "Lone/me/sdk/arch/Widget;", "<init>", "()V", "web-app_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class WebAppsSettingScreen extends Widget {
    public static final /* synthetic */ k77[] X;
    public final jj7 a = new jj7(new vif(6), (s16) null, 6);
    public final t97 b;
    public final n0c c;
    public final cpf o;

    static {
        k77 khb = new khb(WebAppsSettingScreen.class, "recycler", "getRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0);
        m7c.a.getClass();
        X = new k77[]{khb};
    }

    public WebAppsSettingScreen() {
        super((Bundle) null, 0, 3, (x54) null);
        t97 createViewModelLazy = createViewModelLazy(ipf.class, new ypd(11, new vif(7)));
        this.b = createViewModelLazy;
        this.c = viewBinding(vea.f);
        this.o = new cpf(((x4a) uif.a.getAccessor().c(x4a.class)).a(), (Object) new fpf(this), 0);
        ez3.N(new ck5(((ipf) createViewModelLazy.getValue()).Y, new dpf((Continuation) null, this), 5), getLifecycleScope());
    }

    public final sy6 getInsetsConfig() {
        sy6 sy6 = sy6.c;
        return sy6.d;
    }

    public final rnc getScreenDelegate() {
        return this.a;
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
        nea.setTitle(xea.l);
        nea.setForm(fea.a);
        nea.setLeftActions(new vda(new ljc(14, this)));
        linearLayout.addView(nea);
        RecyclerView recyclerView = new RecyclerView(linearLayout.getContext(), (AttributeSet) null);
        recyclerView.setId(vea.f);
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        float f = (float) 12;
        recyclerView.setPadding(a24.X(dh4.c().getDisplayMetrics().density * f), recyclerView.getPaddingTop(), a24.X(f * dh4.c().getDisplayMetrics().density), recyclerView.getPaddingBottom());
        recyclerView.setAdapter(this.o);
        recyclerView.j(new qtc(km4.y0.r(recyclerView), new xle(16, (Object) this), (o8) null, 12));
        recyclerView.j(new n51());
        linearLayout.addView(recyclerView);
        urd.B(new o(3, (Continuation) null, 16), linearLayout);
        return linearLayout;
    }

    public final void onDestroyView(View view) {
        ((RecyclerView) this.c.T0(this, X[0])).setAdapter((f6c) null);
        WebAppsSettingScreen.super.onDestroyView(view);
    }

    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        ez3.N(new ck5(wx3.e(((ipf) this.b.getValue()).Z, getViewLifecycleOwner().R(), ob7.o), new epf((Continuation) null, this), 5), getViewLifecycleScope());
    }
}
