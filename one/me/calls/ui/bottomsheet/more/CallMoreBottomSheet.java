package one.me.calls.ui.bottomsheet.more;

import android.content.Context;
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
import one.me.sdk.bottomsheet.BaseBottomSheetWidget;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\u000b"}, d2 = {"Lone/me/calls/ui/bottomsheet/more/CallMoreBottomSheet;", "Lone/me/sdk/bottomsheet/BaseBottomSheetWidget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Linc;", "scopeId", "Lgc1;", "type", "(Ljava/lang/String;Lgc1;Lx54;)V", "calls-ui_release"}, k = 1, mv = {2, 0, 0})
public final class CallMoreBottomSheet extends BaseBottomSheetWidget {
    public static final /* synthetic */ k77[] B0;
    public final fc1 A0;
    public final t97 w0;
    public final t97 x0;
    public final n0c y0;
    public final t97 z0;

    static {
        Class<CallMoreBottomSheet> cls = CallMoreBottomSheet.class;
        B0 = new k77[]{new khb(cls, "parentScopeId", "getParentScopeId-IluPPks()Ljava/lang/String;", 0), wn6.e(m7c.a, cls, "recycler", "getRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0)};
    }

    public CallMoreBottomSheet(String str, gc1 gc1, x54 x54) {
        this(jjd.j(new wia("arg_key_scope_id", new inc(str)), new wia("open_type", gc1.name())));
    }

    public final void onDestroyView(View view) {
        ((RecyclerView) this.y0.T0(this, B0[1])).setAdapter((f6c) null);
        CallMoreBottomSheet.super.onDestroyView(view);
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [fc1, ig7] */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004c, code lost:
        r1 = ((defpackage.py0) ((defpackage.vx0) r1.X.getValue())).d().a();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r12) {
        /*
            r11 = this;
            r12 = 5
            t97 r0 = r11.x0
            java.lang.Object r1 = r0.getValue()
            nc1 r1 = (defpackage.nc1) r1
            aj1 r2 = r1.c
            t0c r3 = r2.G0
            zqd r3 = r3.a
            java.lang.Object r3 = r3.getValue()
            u81 r3 = (defpackage.u81) r3
            gc1 r4 = r1.b
            int r4 = r4.ordinal()
            if (r4 == 0) goto L_0x0101
            r5 = 1
            if (r4 == r5) goto L_0x0033
            r1 = 2
            if (r4 != r1) goto L_0x002d
            jx0 r1 = defpackage.cja.a
            yh1 r1 = r3.j
            lg7 r1 = defpackage.cja.b(r1)
            goto L_0x0103
        L_0x002d:
            kotlin.NoWhenBranchMatchedException r11 = new kotlin.NoWhenBranchMatchedException
            r11.<init>()
            throw r11
        L_0x0033:
            boolean r4 = r3.g
            ai1 r6 = r3.i
            if (r4 == 0) goto L_0x00db
            jx0 r4 = defpackage.cja.a
            t97 r4 = r1.Y
            java.lang.Object r4 = r4.getValue()
            jb5 r4 = (jb5) r4
            kb5 r4 = (kb5) r4
            boolean r4 = r4.p()
            r7 = 0
            if (r4 == 0) goto L_0x0065
            t97 r1 = r1.X
            java.lang.Object r1 = r1.getValue()
            vx0 r1 = (defpackage.vx0) r1
            py0 r1 = (defpackage.py0) r1
            bt3 r1 = r1.d()
            ru.ok.android.externcalls.sdk.Conversation r1 = r1.a()
            if (r1 == 0) goto L_0x0065
            boolean r1 = r1.isMeCreatorOrAdmin()
            goto L_0x0066
        L_0x0065:
            r1 = r7
        L_0x0066:
            r7e r4 = r2.D0
            java.lang.Object r4 = r4.getValue()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            r7e r8 = r2.F0
            java.lang.Object r8 = r8.getValue()
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            t0c r2 = r2.R0
            zqd r2 = r2.a
            java.lang.Object r2 = r2.getValue()
            raf r2 = (defpackage.raf) r2
            lg7 r9 = defpackage.hwf.c()
            boolean r10 = r3.l
            if (r10 == 0) goto L_0x0098
            boolean r10 = r6.a()
            if (r10 == 0) goto L_0x0097
            goto L_0x0098
        L_0x0097:
            r5 = r7
        L_0x0098:
            raf r7 = defpackage.raf.c
            if (r2 != r7) goto L_0x00a4
            if (r5 == 0) goto L_0x00a4
            jx0 r2 = defpackage.cja.m
            r9.add(r2)
            goto L_0x00bf
        L_0x00a4:
            if (r2 != r7) goto L_0x00ac
            jx0 r2 = defpackage.cja.l
            r9.add(r2)
            goto L_0x00bf
        L_0x00ac:
            raf r7 = defpackage.raf.a
            if (r2 != r7) goto L_0x00b8
            if (r5 == 0) goto L_0x00b8
            jx0 r2 = defpackage.cja.k
            r9.add(r2)
            goto L_0x00bf
        L_0x00b8:
            if (r2 != r7) goto L_0x00bf
            jx0 r2 = defpackage.cja.j
            r9.add(r2)
        L_0x00bf:
            if (r4 == 0) goto L_0x00c4
            defpackage.cja.a(r9, r6)
        L_0x00c4:
            if (r8 == 0) goto L_0x00cf
            yh1 r2 = r3.j
            lg7 r2 = defpackage.cja.b(r2)
            r9.addAll(r2)
        L_0x00cf:
            if (r1 == 0) goto L_0x00d6
            jx0 r1 = defpackage.cja.n
            r9.add(r1)
        L_0x00d6:
            lg7 r1 = defpackage.hwf.a(r9)
            goto L_0x0103
        L_0x00db:
            jx0 r1 = defpackage.cja.a
            r7e r1 = r2.E0
            java.lang.Object r1 = r1.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            lg7 r2 = defpackage.hwf.c()
            if (r1 == 0) goto L_0x00f2
            defpackage.cja.a(r2, r6)
        L_0x00f2:
            jx0 r1 = defpackage.cja.b
            r2.add(r1)
            jx0 r1 = defpackage.cja.a
            r2.add(r1)
            lg7 r1 = defpackage.hwf.a(r2)
            goto L_0x0103
        L_0x0101:
            hw4 r1 = defpackage.hw4.a
        L_0x0103:
            fc1 r2 = r11.A0
            r2.E(r1)
            java.lang.Object r1 = r0.getValue()
            nc1 r1 = (defpackage.nc1) r1
            bc r1 = r1.Z
            ob7 r2 = defpackage.ob7.o
            nc7 r3 = r11.getViewLifecycleOwner()
            pc7 r3 = r3.R()
            rn1 r1 = defpackage.wx3.e(r1, r3, r2)
            hc1 r3 = new hc1
            r4 = 0
            r3.<init>(r4, r11)
            ck5 r5 = new ck5
            r5.<init>(r1, r3, r12)
            yb7 r1 = r11.getViewLifecycleScope()
            defpackage.ez3.N(r5, r1)
            java.lang.Object r0 = r0.getValue()
            nc1 r0 = (defpackage.nc1) r0
            l05 r0 = r0.w0
            nc7 r1 = r11.getViewLifecycleOwner()
            pc7 r1 = r1.R()
            rn1 r0 = defpackage.wx3.e(r0, r1, r2)
            ic1 r1 = new ic1
            r1.<init>(r4, r11)
            ck5 r2 = new ck5
            r2.<init>(r0, r1, r12)
            yb7 r11 = r11.getViewLifecycleScope()
            defpackage.ez3.N(r2, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.calls.ui.bottomsheet.more.CallMoreBottomSheet.onViewCreated(android.view.View):void");
    }

    public final pda p0() {
        return qda.a;
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [f6c, fc1] */
    public final void v0(FrameLayout frameLayout, LayoutInflater layoutInflater, Bundle bundle) {
        Context context = layoutInflater.getContext();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        FrameLayout frameLayout2 = new FrameLayout(linearLayout.getContext());
        frameLayout2.setId(o1a.l0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(a24.X(((float) 36) * dh4.c().getDisplayMetrics().density), a24.X(((float) 5) * dh4.c().getDisplayMetrics().density));
        layoutParams2.gravity = 49;
        float f = (float) 12;
        layoutParams2.topMargin = a24.X(dh4.c().getDisplayMetrics().density * f);
        layoutParams2.bottomMargin = a24.X(f * dh4.c().getDisplayMetrics().density);
        frameLayout2.setLayoutParams(layoutParams2);
        frameLayout2.setOutlineProvider(new eu3(dh4.c().getDisplayMetrics().density * 40.0f));
        frameLayout2.setBackgroundColor(1207959551);
        linearLayout.addView(frameLayout2);
        RecyclerView recyclerView = new RecyclerView(linearLayout.getContext(), (AttributeSet) null);
        recyclerView.setId(o1a.j0);
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(this.A0);
        recyclerView.setItemAnimator((k6c) null);
        recyclerView.j(new ix0(0));
        linearLayout.addView(recyclerView);
        urd.B(new jc1(3, (Continuation) null, 0), linearLayout);
        frameLayout.addView(linearLayout);
    }

    public CallMoreBottomSheet(Bundle bundle) {
        super(bundle);
        jr jrVar = new jr(inc.class, new inc("default"), "arg_key_scope_id");
        k77 k77 = B0[0];
        this.w0 = getSharedViewModel-cp94BC8(((inc) jrVar.a(this)).a, aj1.class, (s16) null);
        this.x0 = createViewModelLazy(nc1.class, new s(15, new x2(bundle, (Widget) this, 12)));
        this.y0 = viewBinding(o1a.j0);
        t97 O = ez3.O(3, new a01(16));
        this.z0 = O;
        this.A0 = new fc1(new u5g(5, (Object) this), (w4c) O.getValue(), ((x4a) bh1.a.getAccessor().c(x4a.class)).a());
    }
}
