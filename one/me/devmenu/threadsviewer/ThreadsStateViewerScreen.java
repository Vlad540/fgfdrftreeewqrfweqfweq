package one.me.devmenu.threadsviewer;

import android.annotation.SuppressLint;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lone/me/devmenu/threadsviewer/ThreadsStateViewerScreen;", "Lone/me/sdk/arch/Widget;", "<init>", "()V", "mr5", "rq3", "threads-viewer_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class ThreadsStateViewerScreen extends Widget {
    public static final /* synthetic */ k77[] X;
    public final sy6 a = sy6.d;
    public final nl0 b = binding(new q6e(6, this));
    public final t97 c = createViewModelLazy(mie.class, new ypd(8, new opd(21)));
    public final mr5 o = new mr5(this, ((x4a) nie.a.getAccessor().c(x4a.class)).a());

    static {
        khb khb = new khb(ThreadsStateViewerScreen.class, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0);
        m7c.a.getClass();
        X = new k77[]{khb};
    }

    public ThreadsStateViewerScreen() {
        super((Bundle) null, 0, 3, (x54) null);
    }

    public final sy6 getInsetsConfig() {
        return this.a;
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [mr5, f6c] */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = new LinearLayout(layoutInflater.getContext());
        linearLayout.setOrientation(1);
        k77 k77 = X[0];
        linearLayout.addView((nea) this.b.getValue(), new FrameLayout.LayoutParams(-1, -2));
        RecyclerView recyclerView = new RecyclerView(linearLayout.getContext(), (AttributeSet) null);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        float f = (float) 12;
        recyclerView.setPadding(a24.X(dh4.c().getDisplayMetrics().density * f), recyclerView.getPaddingTop(), a24.X(f * dh4.c().getDisplayMetrics().density), recyclerView.getPaddingBottom());
        recyclerView.setAdapter(this.o);
        recyclerView.j(new xj6(new ColorDrawable(-16777216)));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 112;
        linearLayout.addView(recyclerView, layoutParams);
        return linearLayout;
    }

    public final void onViewCreated(View view) {
        ThreadsStateViewerScreen.super.onViewCreated(view);
        ez3.N(new ck5(wx3.e(((mie) this.c.getValue()).b, getViewLifecycleOwner().R(), ob7.o), new pie((Continuation) null, this), 5), getViewLifecycleScope());
    }
}
