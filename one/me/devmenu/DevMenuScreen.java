package one.me.devmenu;

import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.sdk.sections.SectionRecyclerWidget;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lone/me/devmenu/DevMenuScreen;", "Lone/me/sdk/sections/SectionRecyclerWidget;", "Lf7d;", "Lvq7;", "<init>", "()V", "dev-menu_playGoogleRelease"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class DevMenuScreen extends SectionRecyclerWidget implements f7d, vq7 {
    public static final /* synthetic */ int x0 = 0;
    public final g7d X;
    public final i41 Y;
    public final List Z;
    public final sy6 o = sy6.d;
    public final yb9 w0;

    public DevMenuScreen() {
        ForkJoinPool commonPool = ForkJoinPool.commonPool();
        this.X = new g7d(this, commonPool);
        this.Y = new i41(commonPool, 5);
        this.Z = ff4.a.getAccessor().a(pf4.class);
        this.w0 = new yb9();
    }

    public static o7d o0(DevMenuScreen devMenuScreen, z14 z14, int i, int i2, int i3) {
        z14 z142 = z14;
        int i4 = (i3 & 8) != 0 ? z142.c : i2;
        devMenuScreen.getClass();
        b7d b7d = null;
        Integer valueOf = i4 != 0 ? Integer.valueOf(i4) : null;
        w14 w14 = w14.f;
        n06 n06 = z142.e;
        if (!hhd.f(n06, w14)) {
            if (hhd.f(n06, x14.f)) {
                b7d = w6d.a;
            } else if (n06 instanceof y14) {
                b7d = new z6d(((y14) n06).f, true);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        return new o7d(z142.a, i, z142.b, (d7d) null, (mge) null, valueOf, b7d, (u6d) null, z142.d, 0, (r6d) null, 1688);
    }

    public final void W(long j, boolean z) {
        Object obj;
        List<pf4> list = this.Z;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (pf4 pf4 : list) {
                Iterator it = ((Iterable) pf4.c().getValue()).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((z14) obj).a == j) {
                        break;
                    }
                }
                z14 z14 = (z14) obj;
                if (z14 != null) {
                    pf4.d(z14);
                    return;
                }
            }
        }
    }

    public final sy6 getInsetsConfig() {
        return this.o;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: one.me.sdk.arch.Widget} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: one.me.devmenu.utils.LongValueBottomSheet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: rr3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: rr3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: rr3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: rr3} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h(long r17) {
        /*
            r16 = this;
            r0 = r16
            java.util.List r1 = r0.Z
            boolean r2 = r1 instanceof java.util.Collection
            if (r2 == 0) goto L_0x000e
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L_0x00a2
        L_0x000e:
            java.util.Iterator r1 = r1.iterator()
        L_0x0012:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x00a2
            java.lang.Object r2 = r1.next()
            pf4 r2 = (defpackage.pf4) r2
            zqd r3 = r2.c()
            java.lang.Object r3 = r3.getValue()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
        L_0x002c:
            boolean r4 = r3.hasNext()
            r5 = 0
            if (r4 == 0) goto L_0x0041
            java.lang.Object r4 = r3.next()
            r6 = r4
            z14 r6 = (defpackage.z14) r6
            long r6 = r6.a
            int r6 = (r6 > r17 ? 1 : (r6 == r17 ? 0 : -1))
            if (r6 != 0) goto L_0x002c
            goto L_0x0042
        L_0x0041:
            r4 = r5
        L_0x0042:
            z14 r4 = (defpackage.z14) r4
            if (r4 == 0) goto L_0x0012
            boolean r1 = r2 instanceof defpackage.rzc
            if (r1 == 0) goto L_0x009f
            k77[] r1 = one.me.sdk.bottomsheet.BottomSheetWidget.B0
            rzc r2 = (defpackage.rzc) r2
            t97 r1 = r2.e
            java.lang.Object r1 = r1.getValue()
            sqc r1 = (sqc) r1
            ru.ok.tamtam.android.prefs.PmsKey r3 = r2.a
            long r7 = r1.n(r3)
            one.me.devmenu.utils.LongValueBottomSheet r1 = new one.me.devmenu.utils.LongValueBottomSheet
            long r9 = r4.a
            java.lang.String[] r11 = r2.c
            r6 = r1
            r6.<init>(r7, r9, r11)
            r1.setTargetController(r0)
            r2 = r0
        L_0x006a:
            rr3 r3 = r2.getParentController()
            if (r3 == 0) goto L_0x0075
            rr3 r2 = r2.getParentController()
            goto L_0x006a
        L_0x0075:
            boolean r3 = r2 instanceof ygc
            if (r3 == 0) goto L_0x007c
            ygc r2 = (ygc) r2
            goto L_0x007d
        L_0x007c:
            r2 = r5
        L_0x007d:
            if (r2 == 0) goto L_0x0083
            sgc r5 = r2.S()
        L_0x0083:
            r1.y0(r0)
            if (r5 == 0) goto L_0x00a2
            vgc r0 = new vgc
            r12 = 0
            r15 = -1
            r11 = 0
            r13 = 0
            r14 = 0
            r9 = r0
            r10 = r1
            r9.<init>(r10, r11, r12, r13, r14, r15)
            r1 = 0
            r2 = 1
            java.lang.String r3 = "BottomSheetWidget"
            rf0.k(r1, r0, r2, r3)
            r5.G(r0)
            goto L_0x00a2
        L_0x009f:
            r2.d(r4)
        L_0x00a2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.devmenu.DevMenuScreen.h(long):void");
    }

    public final i41 l0() {
        return this.Y;
    }

    public final g7d m0() {
        return this.X;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        CoordinatorLayout coordinatorLayout = new CoordinatorLayout(getContext(), (AttributeSet) null);
        coordinatorLayout.setId(cpb.oneme_devmenu_screen_view);
        fm fmVar = new fm(coordinatorLayout.getContext());
        fmVar.setId(cpb.oneme_devmenu_screen_view_appbar);
        fmVar.setElevation(0.0f);
        fmVar.setBackgroundColor(0);
        fmVar.setOutlineProvider((ViewOutlineProvider) null);
        Toolbar toolbar = new Toolbar(fmVar.getContext(), (AttributeSet) null);
        toolbar.setElevation(0.0f);
        toolbar.setId(cpb.oneme_devmenu_screen_view_toolbar);
        toolbar.setLayoutParams(new k23(-1, -2));
        toolbar.setNavigationIcon((Drawable) null);
        toolbar.u(0, 0);
        nea nea = new nea(toolbar.getContext(), 6);
        nea.setForm(fea.a);
        nea.setTextShimmerEnabled(false);
        nea.setId(cpb.oneme_devmenu_screen_view_oneme_toolbar);
        nea.setTitle("Dev menu");
        nea.setLeftActions(new vda(new t13(12)));
        toolbar.addView(nea, new sle(-1));
        fmVar.addView(toolbar, new dm(-1, -2));
        coordinatorLayout.addView(fmVar, new nt3(-1, -2));
        coordinatorLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        RecyclerView n0 = n0(16);
        nt3 nt3 = new nt3(-1, -1);
        nt3.setMargins(nt3.leftMargin, a24.X(((float) 12) * dh4.c().getDisplayMetrics().density), nt3.rightMargin, a24.X(((float) 64) * dh4.c().getDisplayMetrics().density));
        nt3.b(new AppBarLayout$ScrollingViewBehavior(coordinatorLayout.getContext(), (AttributeSet) null));
        coordinatorLayout.addView(n0, nt3);
        urd.B(new pf0(3, (Continuation) null, 4), coordinatorLayout);
        return coordinatorLayout;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [rr3, one.me.devmenu.DevMenuScreen] */
    public final void onDestroy() {
        DevMenuScreen.super.onDestroy();
        for (pf4 b : this.Z) {
            b.b();
        }
    }

    public final void onViewCreated(View view) {
        DevMenuScreen.super.onViewCreated(view);
        ArrayList arrayList = new ArrayList();
        List list = this.Z;
        for (Object next : list) {
            pf4 pf4 = (pf4) next;
            if ((pf4 instanceof hk7) || (pf4 instanceof fzc) || (pf4 instanceof rzc)) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            z14 z14 = (z14) o23.X((List) ((pf4) it.next()).c().getValue());
            if (z14 != null) {
                arrayList2.add(z14);
            }
        }
        List<z14> m0 = o23.m0(arrayList2, new if4(new bk(8, this), 0));
        ArrayList arrayList3 = new ArrayList(q23.H(m0, 10));
        for (z14 z142 : m0) {
            this.w0.f(z142.a, z142);
            int i = z142.c;
            if (i == 0) {
                i = l9a.t;
            }
            arrayList3.add(o0(this, z142, 0, i, 6));
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object next2 : list) {
            pf4 pf42 = (pf4) next2;
            if (!(pf42 instanceof hk7) && !(pf42 instanceof fzc) && !(pf42 instanceof rzc)) {
                arrayList4.add(next2);
            }
        }
        ArrayList arrayList5 = new ArrayList(q23.H(arrayList4, 10));
        Iterator it2 = arrayList4.iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            Object next3 = it2.next();
            int i3 = i2 + 1;
            if (i2 >= 0) {
                arrayList5.add(new nf4(((pf4) next3).c(), this, i2));
                i2 = i3;
            } else {
                p23.G();
                throw null;
            }
        }
        ez3.N(new ck5(new kf4((pj5[]) o23.s0(arrayList5).toArray(new pj5[0]), 0), new lf4(this, arrayList3, (Continuation) null), 5), getLifecycleScope());
    }
}
