package one.me.calls.ui.ui.call.panels;

import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\n\u000bB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\t¨\u0006\f"}, d2 = {"Lone/me/calls/ui/ui/call/panels/CallEventsWidget;", "Lone/me/sdk/arch/Widget;", "Lms3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Linc;", "scopeId", "(Ljava/lang/String;Lx54;)V", "kg1", "u41", "calls-ui_release"}, k = 1, mv = {2, 0, 0})
public final class CallEventsWidget extends Widget implements ms3 {
    public static final /* synthetic */ int X = 0;
    public final i41 a;
    public final t97 b;
    public final ArrayList c;
    public final u41 o;

    public CallEventsWidget(String str, x54 x54) {
        this(jjd.j(new wia("arg_key_scope_id", new inc(str))));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [rr3, one.me.calls.ui.ui.call.panels.CallEventsWidget] */
    public final List H(ks3 ks3, ks3 ks32) {
        View view = getView();
        return view != null ? Collections.singletonList(ct0.r(view, ks32.d)) : hw4.a;
    }

    /* JADX WARNING: type inference failed for: r3v4, types: [f6c, i41] */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RecyclerView recyclerView = new RecyclerView(getContext(), (AttributeSet) null);
        recyclerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        recyclerView.setId(uob.call_events_recyclerview);
        recyclerView.setAdapter(this.a);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, true));
        recyclerView.j(new iq(1));
        u41 u41 = this.o;
        u41.a = recyclerView;
        recyclerView.setItemAnimator(new t41(u41));
        recyclerView.addOnLayoutChangeListener(new s41(0, this));
        return recyclerView;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [rr3, one.me.calls.ui.ui.call.panels.CallEventsWidget] */
    public final void onDestroyView(View view) {
        CallEventsWidget.super.onDestroyView(view);
        this.c.clear();
        this.o.a = null;
    }

    public final void onViewCreated(View view) {
        CallEventsWidget.super.onViewCreated(view);
        ez3.N(new ck5(wx3.e(((r41) this.b.getValue()).X, getViewLifecycleOwner().R(), ob7.o), new v41((Continuation) null, this), 5), getViewLifecycleScope());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: ju3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: r15} */
    /* JADX WARNING: type inference failed for: r4v6, types: [u41, java.lang.Object] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public CallEventsWidget(android.os.Bundle r4) {
        /*
            r3 = this;
            r0 = 0
            r1 = 2
            r2 = 0
            r3.<init>(r4, r0, r1, r2)
            i41 r4 = new i41
            bh1 r0 = defpackage.bh1.a
            w4 r0 = r0.getAccessor()
            java.lang.Class<pae> r1 = pae.class
            java.lang.Object r0 = r0.c(r1)
            pae r0 = (pae) r0
            n3a r0 = (defpackage.n3a) r0
            ju3 r0 = r0.a()
            boolean r1 = r0 instanceof defpackage.r15
            if (r1 == 0) goto L_0x0023
            r2 = r0
            r15 r2 = (defpackage.r15) r2
        L_0x0023:
            if (r2 == 0) goto L_0x002b
            java.util.concurrent.Executor r1 = r2.n()
            if (r1 != 0) goto L_0x0030
        L_0x002b:
            ni4 r1 = new ni4
            r1.<init>(r0)
        L_0x0030:
            r0 = 0
            r4.<init>(r1, r0)
            r3.a = r4
            a01 r4 = new a01
            r0 = 8
            r4.<init>(r0)
            s r0 = new s
            r1 = 8
            r0.<init>(r1, r4)
            java.lang.Class<r41> r4 = defpackage.r41.class
            t97 r4 = r3.createViewModelLazy(r4, r0)
            r3.b = r4
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r3.c = r4
            u41 r4 = new u41
            r4.<init>()
            r3.o = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.calls.ui.ui.call.panels.CallEventsWidget.<init>(android.os.Bundle):void");
    }
}
