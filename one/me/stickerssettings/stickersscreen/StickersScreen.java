package one.me.stickerssettings.stickersscreen;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\bB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u001b\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0006\u0010\f¨\u0006\r"}, d2 = {"Lone/me/stickerssettings/stickersscreen/StickersScreen;", "Lone/me/sdk/arch/Widget;", "Ltq3;", "Llc3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lmvd;", "mode", "", "setId", "(Lmvd;J)V", "stickers-settings_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class StickersScreen extends Widget implements tq3, lc3 {
    public static final /* synthetic */ k77[] z0;
    public final n0c X;
    public final nl0 Y;
    public final nl0 Z;
    public final mvd a;
    public final jr b;
    public final t97 c;
    public final n0c o;
    public final t97 w0;
    public final er7 x0;
    public final cpf y0;

    static {
        Class<StickersScreen> cls = StickersScreen.class;
        k77 khb = new khb(cls, "stickersSetId", "getStickersSetId()J", 0);
        n7c n7c = m7c.a;
        z0 = new k77[]{khb, wn6.e(n7c, cls, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), wn6.f(cls, "recycler", "getRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0, n7c)};
    }

    public StickersScreen(mvd mvd, long j) {
        this(jjd.j(new wia[]{new wia("mode", mvd.a), new wia("set_id", Long.valueOf(j))}));
    }

    public final sy6 getInsetsConfig() {
        sy6 sy6 = sy6.c;
        return sy6.d;
    }

    public final void i(int i, Bundle bundle) {
        kyd n0 = n0();
        n0.getClass();
        int i2 = rca.e;
        ru3 ru3 = ru3.b;
        e3 e3Var = n0.y0;
        ContextScope contextScope = n0.a;
        n3a n3a = n0.X;
        if (i == i2) {
            e3Var.o1(n0, kyd.G0[0], xs7.D(contextScope, n3a.b(), ru3, new yxd(n0, (Continuation) null)));
        } else if (i == rca.d) {
            e3Var.o1(n0, kyd.G0[0], xs7.D(contextScope, n3a.b(), ru3, new xxd(n0, (Continuation) null)));
        } else {
            int i3 = rca.c;
            k77[] k77Arr = kyd.G0;
            if (i == i3) {
                qod D = xs7.D(contextScope, n3a.b(), ru3, new ayd(n0, ((q99) n0.r().e.a.getValue()).b, (Continuation) null));
                n0.z0.o1(n0, k77Arr[1], D);
                n0.r().a();
            } else if (i == rca.b) {
                qod D2 = xs7.D(contextScope, n3a.b(), ru3, new zxd(n0, n0.c, (Continuation) null));
                n0.A0.o1(n0, k77Arr[2], D2);
            }
        }
    }

    public final RecyclerView l0() {
        return (RecyclerView) this.X.T0(this, z0[2]);
    }

    public final nea m0() {
        return (nea) this.o.T0(this, z0[1]);
    }

    public final kyd n0() {
        return (kyd) this.c.getValue();
    }

    public final void onActivityPaused(Activity activity) {
        ((fr7) this.w0.getValue()).a(this.x0);
    }

    public final void onActivityResumed(Activity activity) {
        ((fr7) this.w0.getValue()).b(this.x0);
    }

    public final void onChangeStarted(wr3 wr3, xr3 xr3) {
        super.onChangeStarted(wr3, xr3);
        xr3 xr32 = xr3.X;
        t97 t97 = this.w0;
        er7 er7 = this.x0;
        if (xr3 == xr32 || xr3 == xr3.c) {
            ((fr7) t97.getValue()).b(er7);
        } else if (xr3 == xr3.o) {
            ((fr7) t97.getValue()).a(er7);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context = layoutInflater.getContext();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(layoutParams);
        RecyclerView recyclerView = new RecyclerView(frameLayout.getContext(), (AttributeSet) null);
        recyclerView.setId(rca.f);
        recyclerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 48));
        float f = (float) 12;
        recyclerView.setPadding(a24.X(dh4.c().getDisplayMetrics().density * f), recyclerView.getPaddingTop(), a24.X(f * dh4.c().getDisplayMetrics().density), recyclerView.getPaddingBottom());
        recyclerView.setAdapter(this.y0);
        int t = gp0.t(recyclerView.getContext());
        recyclerView.getContext();
        recyclerView.setLayoutManager(new GridLayoutManager(t));
        recyclerView.j(new ix0(t, a24.X(((float) 4) * dh4.c().getDisplayMetrics().density), 7));
        recyclerView.k(new i87(3, this));
        frameLayout.addView(recyclerView);
        nea nea = new nea(frameLayout.getContext(), 6);
        nea.setId(rca.x);
        nea.setLayoutParams(new FrameLayout.LayoutParams(-1, -2, 48));
        nea.setForm(fea.a);
        nea.setLeftActions(new vda(new ljc(7, this)));
        urd.B(new t7b(3, (Continuation) null, 1), nea);
        frameLayout.addView(nea);
        return frameLayout;
    }

    public final void onDestroyView(View view) {
        this.x0.b();
        l0().setAdapter((f6c) null);
        StickersScreen.super.onDestroyView(view);
    }

    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        nea m0 = m0();
        afa.a(m0, new q36(m0, 20, this));
        t0c t0c = n0().C0;
        ob7 ob7 = ob7.o;
        ez3.N(new ck5(wx3.e(t0c, getViewLifecycleOwner().R(), ob7), new nvd((Continuation) null, this, view), 5), getViewLifecycleScope());
        ez3.N(new ck5(wx3.e(new ik5(n0().D0, 2), getViewLifecycleOwner().R(), ob7), new ovd((Continuation) null, this), 5), getViewLifecycleScope());
        ez3.N(new ck5(wx3.e(n0().E0, getViewLifecycleOwner().R(), ob7), new pvd((Continuation) null, this), 5), getViewLifecycleScope());
        RecyclerView l0 = l0();
        w99 r = n0().r();
        ca9 ca9 = new ca9(l0, this.y0, r, m0());
        ez3.N(new ck5(r.e, new hp0(2, ca9, ca9.class, "handleNewSelectedMessages", "handleNewSelectedMessages(Lone/me/stickerssettings/stickersscreen/multiselection/MultiSelectionLogic$Data;)V", 4, 22), 5), getViewLifecycleScope());
    }

    public final void y(int i, Bundle bundle) {
        kyd n0 = n0();
        n0.getClass();
        p6d p6d = null;
        if (i == rca.u) {
            n0.r().d.m((Object) null, new q99(true, 6));
            return;
        }
        int i2 = rca.w;
        l05 l05 = n0.E0;
        if (i == i2) {
            taf.o(l05, new n6d(new hge(sca.B), new hge(sca.A), p23.B(new kc3[]{new kc3(rca.e, new hge(sca.D), 1, false), new kc3(rca.a, new hge(sca.i), 2, false)})));
        } else if (i == rca.t) {
            taf.o(l05, new n6d(new hge(sca.w), new hge(sca.v), p23.B(new kc3[]{new kc3(rca.d, new hge(sca.D), 1, false), new kc3(rca.a, new hge(sca.i), 2, false)})));
        } else if (i == rca.i) {
            wxd wxd = (wxd) n0.D0.a.getValue();
            String str = wxd != null ? wxd.c : null;
            if (str != null && str.length() != 0) {
                hhd.q(n0.o, str);
                if (hhd.y()) {
                    p6d = new p6d(phc.u, new hge(sca.g));
                }
                if (p6d != null) {
                    taf.o(l05, p6d);
                }
            }
        } else if (i == rca.j) {
            taf.o(l05, new n6d(new hge(sca.k), new hge(sca.j), p23.B(new kc3[]{new kc3(rca.b, new hge(sca.h), 1, false), new kc3(rca.a, new hge(sca.i), 2, false)})));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: mvd} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: mvd} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: mvd} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: mvd} */
    /* JADX WARNING: type inference failed for: r0v12, types: [java.lang.Object, er7] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public StickersScreen(android.os.Bundle r6) {
        /*
            r5 = this;
            r0 = 0
            r1 = 2
            r2 = 0
            r5.<init>(r6, r0, r1, r2)
            gf6 r0 = defpackage.mvd.b
            java.lang.String r1 = "mode"
            java.lang.String r6 = r6.getString(r1)
            java.lang.String r1 = "Required value was null."
            if (r6 == 0) goto L_0x00c5
            r0.getClass()
            pz4 r0 = defpackage.mvd.Z
            java.util.Iterator r0 = r0.iterator()
        L_0x001b:
            r3 = r0
            u1 r3 = (u1) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0034
            java.lang.Object r3 = r3.next()
            r4 = r3
            mvd r4 = (defpackage.mvd) r4
            java.lang.String r4 = r4.a
            boolean r4 = hhd.f(r4, r6)
            if (r4 == 0) goto L_0x001b
            r2 = r3
        L_0x0034:
            if (r2 == 0) goto L_0x00bb
            mvd r2 = (defpackage.mvd) r2
            r5.a = r2
            r0 = -1
            java.lang.Long r6 = java.lang.Long.valueOf(r0)
            jr r0 = new jr
            java.lang.Class<java.lang.Long> r1 = java.lang.Long.class
            java.lang.String r2 = "set_id"
            r0.<init>(r1, r6, r2)
            r5.b = r0
            lvd r6 = new lvd
            r0 = 0
            r6.<init>(r5, r0)
            ypd r0 = new ypd
            r1 = 4
            r0.<init>(r1, r6)
            java.lang.Class<kyd> r6 = defpackage.kyd.class
            t97 r6 = r5.createViewModelLazy(r6, r0)
            r5.c = r6
            int r6 = defpackage.rca.x
            n0c r6 = r5.viewBinding(r6)
            r5.o = r6
            int r6 = defpackage.rca.f
            n0c r6 = r5.viewBinding(r6)
            r5.X = r6
            lvd r6 = new lvd
            r0 = 1
            r6.<init>(r5, r0)
            nl0 r6 = r5.binding(r6)
            r5.Y = r6
            lvd r6 = new lvd
            r0 = 2
            r6.<init>(r5, r0)
            nl0 r6 = r5.binding(r6)
            r5.Z = r6
            uwd r6 = defpackage.uwd.a
            w4 r0 = r6.getAccessor()
            java.lang.Class<fr7> r1 = defpackage.fr7.class
            r7e r0 = r0.d(r1)
            r5.w0 = r0
            er7 r0 = new er7
            r0.<init>()
            r5.x0 = r0
            cpf r0 = new cpf
            w4 r6 = r6.getAccessor()
            java.lang.Class<x4a> r1 = defpackage.x4a.class
            java.lang.Object r6 = r6.c(r1)
            x4a r6 = (defpackage.x4a) r6
            java.util.concurrent.ExecutorService r6 = r6.a()
            c9 r1 = new c9
            r2 = 22
            r1.<init>(r2, r5)
            r0.<init>(r6, r1)
            r5.y0 = r0
            return
        L_0x00bb:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = r1.toString()
            r5.<init>(r6)
            throw r5
        L_0x00c5:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = r1.toString()
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.stickerssettings.stickersscreen.StickersScreen.<init>(android.os.Bundle):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StickersScreen(mvd mvd, long j, int i, x54 x54) {
        this(mvd, (i & 2) != 0 ? -1 : j);
    }
}
