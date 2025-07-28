package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.ExecutorService;
import kotlin.coroutines.Continuation;

/* renamed from: rzb  reason: default package */
public final class rzb {
    public final Context a;
    public qzb b;
    public final twd c;
    public final RecyclerView d;

    public rzb(Context context, ExecutorService executorService) {
        this.a = context;
        twd twd = new twd(executorService, new hzb(context), new e98(26, this), new u5b(5, this));
        this.c = twd;
        eu3 eu3 = new eu3(dh4.c().getDisplayMetrics().density * 24.0f);
        RecyclerView recyclerView = new RecyclerView(context, (AttributeSet) null);
        recyclerView.setId(xqb.one_chat_react_panel_layout);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new GridLayoutManager(8));
        recyclerView.j(new vp5(a24.X(((float) (pfa.w(context) >= 360 ? 10 : 8)) * dh4.c().getDisplayMetrics().density), new py9(0, 1, rzb.class, this, "isExpanded", "isExpanded()Z")));
        recyclerView.setOutlineProvider(eu3);
        recyclerView.setVisibility(0);
        recyclerView.setAdapter(twd);
        recyclerView.setOverScrollMode(2);
        recyclerView.setItemAnimator((k6c) null);
        recyclerView.setClipToPadding(false);
        recyclerView.setClipChildren(false);
        recyclerView.setClipToOutline(false);
        float f = (float) 8;
        float f2 = (float) 12;
        recyclerView.setPadding(a24.X(dh4.c().getDisplayMetrics().density * f2), a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(f2 * dh4.c().getDisplayMetrics().density), a24.X(f * dh4.c().getDisplayMetrics().density));
        urd.B(new wua(this, (Continuation) null, 6, false), recyclerView);
        this.d = recyclerView;
    }

    public final void a(lg7 lg7, int i) {
        if (lg7.getSize() > 8) {
            RecyclerView recyclerView = this.d;
            ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
            if (layoutParams != null) {
                int X = a24.X(((float) 240) * dh4.c().getDisplayMetrics().density);
                if (i > 0) {
                    X = Math.min(X, i);
                }
                layoutParams.height = X;
                recyclerView.setLayoutParams(layoutParams);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
        this.c.F(lg7, new pzb(0, this));
    }
}
