package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Spannable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.Continuation;
import one.me.android.root.RootController;
import one.me.sdk.arch.Widget;

/* renamed from: a06  reason: default package */
public abstract class a06 {
    public static zwa a = null;
    public static volatile boolean b = false;
    public static final float[] c = new float[0];
    public static final long[] d = {-9187201950435737345L, -1};
    public static final long[] e = new long[0];
    public static final Object[] f = new Object[0];
    public static final gf6 g = new gf6(18);
    public static Handler h;

    public static final void C(Continuation continuation) {
        boolean z = v14.a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = u14.a;
        u14 u14 = v14.c;
        if (atomicIntegerFieldUpdater.get(u14) <= 0) {
            return;
        }
        if (!v14.a || continuation.getContext() != bw4.a) {
            qu3 qu3 = null;
            if ("RUNNING".equals("RUNNING")) {
                if (continuation instanceof qu3) {
                    qu3 = (qu3) continuation;
                }
                if (qu3 != null && atomicIntegerFieldUpdater.get(u14) > 0) {
                    hr1.r(v14.b.remove(qu3));
                    do {
                        qu3 = qu3.getCallerFrame();
                    } while (qu3 != null);
                    return;
                }
                return;
            }
            if (continuation instanceof qu3) {
                qu3 = (qu3) continuation;
            }
            if (qu3 != null) {
                do {
                    qu3 = qu3.getCallerFrame();
                } while (qu3 != null);
            }
        }
    }

    public static final void D(CharSequence charSequence) {
        Object[] objArr = null;
        Spannable spannable = charSequence instanceof Spannable ? (Spannable) charSequence : null;
        if (spannable != null) {
            try {
                objArr = spannable.getSpans(0, spannable.length(), sj.class);
            } catch (Throwable unused) {
            }
            sj[] sjVarArr = (sj[]) objArr;
            if (sjVarArr != null) {
                for (sj sjVar : sjVarArr) {
                    mt0.C(spannable, ite.class, spannable.getSpanStart(sjVar), spannable.getSpanEnd(sjVar));
                }
            }
        }
    }

    public static void E(Context context, int i) {
        H(0, context, context.getString(i));
    }

    public static final void F(Activity activity, fca fca) {
        int i;
        vgc vgc = (vgc) o23.X(o2a.a.o().f().C().e());
        n0a n0a = null;
        rr3 rr3 = vgc != null ? vgc.a : null;
        Widget widget = rr3 instanceof Widget ? (Widget) rr3 : null;
        if (widget != null) {
            udd.p(activity.getClass().getName(), "detect snackbar", new Object[0]);
            pba pba = fca.X;
            if (pba.a == 2) {
                Widget widget2 = widget;
                while (widget2.getParentController() != null) {
                    widget2 = widget2.getParentController();
                }
                View view = widget2.getView();
                ViewParent parent = view != null ? view.getParent() : null;
                View view2 = parent instanceof View ? (View) parent : null;
                if (view2 != null) {
                    n0a = (n0a) view2.findViewById(k6a.a);
                }
                if (n0a != null) {
                    i = n0a.getHeight();
                    hba hba = new hba(widget);
                    hba.b = fca.a(fca, (zba) null, (CharSequence) null, (CharSequence) null, (eca) null, new pba(0, i + pba.c, 3), (tba) null, 47);
                    hba.j();
                    return;
                }
            }
            i = 0;
            hba hba2 = new hba(widget);
            hba2.b = fca.a(fca, (zba) null, (CharSequence) null, (CharSequence) null, (eca) null, new pba(0, i + pba.c, 3), (tba) null, 47);
            hba2.j();
            return;
        }
        udd.T(activity.getClass().getName(), "widget is null for snackbar", new Object[0]);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0031: MOVE  (r4v3 fca) = (r4v2 fca)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public static final void G(android.app.Activity r3, android.content.Intent r4) {
        /*
            if (r4 != 0) goto L_0x0006
            android.content.Intent r4 = r3.getIntent()
        L_0x0006:
            java.lang.String r0 = "snackbar"
            java.lang.Class<fca> r1 = fca.class
            java.lang.Object r4 = defpackage.fja.i(r4, r0, r1)     // Catch:{ all -> 0x0011 }
            fca r4 = (fca) r4     // Catch:{ all -> 0x0011 }
            goto L_0x0018
        L_0x0011:
            r4 = move-exception
            kcc r0 = new kcc
            r0.<init>(r4)
            r4 = r0
        L_0x0018:
            java.lang.Throwable r0 = defpackage.mcc.a(r4)
            if (r0 == 0) goto L_0x002b
            java.lang.Class r1 = r3.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "showSnackbarIfNeeded fail"
            defpackage.udd.S(r1, r2, r0)
        L_0x002b:
            boolean r0 = r4 instanceof defpackage.kcc
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0038
            fca r4 = (fca) r4
            if (r4 == 0) goto L_0x0038
            F(r3, r4)
        L_0x0038:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a06.G(android.app.Activity, android.content.Intent):void");
    }

    public static void H(int i, Context context, String str) {
        if (context != null && !TextUtils.isEmpty(str)) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                Toast.makeText(context, str, i).show();
                return;
            }
            if (h == null) {
                h = new Handler(Looper.getMainLooper());
            }
            h.post(new wg1((Object) context, (Object) str, i, 16));
        }
    }

    public static final yuf I(r57 r57, syc syc) {
        d8 e2 = syc.e();
        if (e2 instanceof d0b) {
            return yuf.POLY_OBJ;
        }
        if (hhd.f(e2, t0e.g)) {
            return yuf.LIST;
        }
        if (!hhd.f(e2, t0e.h)) {
            return yuf.OBJ;
        }
        syc i = i(syc.i(0), r57.b);
        d8 e3 = i.e();
        if ((e3 instanceof r3b) || hhd.f(e3, xyc.g)) {
            return yuf.MAP;
        }
        if (r57.a.d) {
            return yuf.LIST;
        }
        throw gp0.a(i);
    }

    public static final Set J(String str) {
        if (str.length() == 0) {
            return null;
        }
        int a0 = h0e.a0(str, ",", 0, false, 4);
        if (a0 == -1) {
            return Collections.singleton(str);
        }
        bs bsVar = new bs(10);
        int i = 0;
        do {
            bsVar.add(str.substring(i, a0));
            i = a0 + 1;
            a0 = h0e.a0(str, ",", i, false, 4);
        } while (a0 != -1);
        bsVar.add(str.substring(i, str.length()));
        return bsVar;
    }

    public static void K(mm mmVar, pc7 pc7) {
        ob7 ob7 = pc7.d;
        if (ob7 == ob7.b || ob7.a(ob7.o)) {
            mmVar.g();
        } else {
            pc7.a(new z84(pc7, 3, mmVar));
        }
    }

    public static Object a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    public static void b(Parcel parcel, Parcelable parcelable) {
        if (parcelable != null) {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
            return;
        }
        parcel.writeInt(0);
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [er3] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object c(defpackage.sie r4, defpackage.k26 r5, java.lang.Throwable r6, kotlin.coroutines.Continuation r7) {
        /*
            boolean r0 = r7 instanceof defpackage.el5
            if (r0 == 0) goto L_0x0013
            r0 = r7
            el5 r0 = (defpackage.el5) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Y = r1
            goto L_0x0018
        L_0x0013:
            el5 r0 = new el5
            r0.<init>(r7)
        L_0x0018:
            java.lang.Object r7 = r0.X
            pu3 r1 = defpackage.pu3.a
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.Throwable r6 = r0.o
            defpackage.wx3.H(r7)     // Catch:{ all -> 0x0029 }
            goto L_0x0041
        L_0x0029:
            r4 = move-exception
            goto L_0x0044
        L_0x002b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0033:
            defpackage.wx3.H(r7)
            r0.o = r6     // Catch:{ all -> 0x0029 }
            r0.Y = r3     // Catch:{ all -> 0x0029 }
            java.lang.Object r4 = r5.invoke(r4, r6, r0)     // Catch:{ all -> 0x0029 }
            if (r4 != r1) goto L_0x0041
            goto L_0x0043
        L_0x0041:
            jue r1 = defpackage.jue.a
        L_0x0043:
            return r1
        L_0x0044:
            if (r6 == 0) goto L_0x004b
            if (r6 == r4) goto L_0x004b
            defpackage.jjd.d(r4, r6)
        L_0x004b:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a06.c(sie, k26, java.lang.Throwable, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final ShapeDrawable d(int i) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.getPaint().setColor(i);
        shapeDrawable.getPaint().setAntiAlias(true);
        shapeDrawable.getPaint().setMaskFilter(new BlurMaskFilter(1000.0f, BlurMaskFilter.Blur.NORMAL));
        return shapeDrawable;
    }

    public static final void e(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("?");
            if (i2 < i - 1) {
                sb.append(",");
            }
        }
    }

    public static void f(Spannable spannable, ArrayList arrayList, fj fjVar) {
        ((ci) fjVar.a.get()).getClass();
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            hr1.r(it.next());
            throw null;
        }
    }

    public static String g(int i, int i2, String str) {
        if (i < 0) {
            return n06.x("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return n06.x("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IllegalArgumentException(wn6.h(i2, "negative size: "));
    }

    public static final void h(RootController rootController) {
        if (!rootController.C().n()) {
            h0a h0a = (h0a) o2a.a.getAccessor().c(h0a.class);
            if (h0a.a()) {
                h0a.b();
                return;
            }
            d34 P1 = js7.c.P1();
            bs7.b.getClass();
            P1.b(k34.a(bs7.e.a), (Bundle) null);
        }
    }

    public static final syc i(syc syc, hk9 hk9) {
        if (!hhd.f(syc.e(), xyc.f)) {
            return syc.isInline() ? i(syc.i(0), hk9) : syc;
        }
        iu7.u(syc);
        return syc;
    }

    public static void j(long j, String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(n06.x(str, Long.valueOf(j)));
        }
    }

    public static void k(int i, int i2) {
        String str;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                str = n06.x("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else if (i2 >= 0) {
                str = n06.x("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            } else {
                throw new IllegalArgumentException(wn6.h(i2, "negative size: "));
            }
            throw new IndexOutOfBoundsException(str);
        }
    }

    public static void l(long j, String str) {
        if (j < 0) {
            throw new IllegalArgumentException(str + " (" + j + ") must be >= 0");
        }
    }

    public static void m(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void n(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(g(i, i2, "index"));
        }
    }

    public static void o(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException((i < 0 || i > i3) ? g(i, i3, "start index") : (i2 < 0 || i2 > i3) ? g(i2, i3, "end index") : n06.x("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    public static bf3 p(ConstraintLayout constraintLayout) {
        bf3 bf3 = new bf3();
        bf3.c(constraintLayout);
        return bf3;
    }

    public static void q(long j, ija ija, bpe[] bpeArr) {
        int i;
        while (true) {
            boolean z = true;
            if (ija.a() > 1) {
                int i2 = 0;
                while (true) {
                    if (ija.a() != 0) {
                        int u = ija.u();
                        i2 += u;
                        if (u != 255) {
                            i = i2;
                            break;
                        }
                    } else {
                        i = -1;
                        break;
                    }
                }
                int i3 = 0;
                while (true) {
                    if (ija.a() != 0) {
                        int u2 = ija.u();
                        i3 += u2;
                        if (u2 != 255) {
                            break;
                        }
                    } else {
                        i3 = -1;
                        break;
                    }
                }
                int i4 = ija.b + i3;
                if (i3 == -1 || i3 > ija.a()) {
                    ez3.j0("Skipping remainder of malformed SEI NAL unit.");
                    i4 = ija.c;
                } else if (i == 4 && i3 >= 8) {
                    int u3 = ija.u();
                    int A = ija.A();
                    int g2 = A == 49 ? ija.g() : 0;
                    int u4 = ija.u();
                    if (A == 47) {
                        ija.H(1);
                    }
                    boolean z2 = u3 == 181 && (A == 49 || A == 47) && u4 == 3;
                    if (A == 49) {
                        if (g2 != 1195456820) {
                            z = false;
                        }
                        z2 &= z;
                    }
                    if (z2) {
                        r(j, ija, bpeArr);
                    }
                }
                ija.G(i4);
            } else {
                return;
            }
        }
    }

    public static void r(long j, ija ija, bpe[] bpeArr) {
        ija ija2 = ija;
        bpe[] bpeArr2 = bpeArr;
        int u = ija.u();
        if ((u & 64) != 0) {
            ija2.H(1);
            int i = (u & 31) * 3;
            int i2 = ija2.b;
            for (bpe bpe : bpeArr2) {
                ija2.G(i2);
                bpe.b(ija2, i, 0);
                oyb.k(j != -9223372036854775807L);
                bpe.a(j, 1, i, 0, (zoe) null);
            }
        }
    }

    public static final boolean s(int i, Set set) {
        String str;
        if ((set instanceof Collection) && set.isEmpty()) {
            return false;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            CharSequence charSequence = (CharSequence) it.next();
            switch (i) {
                case 1:
                    str = "MESSAGE_NORMAL_TEXT";
                    break;
                case 2:
                    str = "MESSAGE_BIG_EMOJI_TEXT";
                    break;
                case 3:
                    str = "MESSAGE_INPUT";
                    break;
                case 4:
                    str = "STICKERS_KEYBOARD";
                    break;
                case 5:
                    str = "CHATS_LIST";
                    break;
                case 6:
                    str = "REACTION_SELECT_PANEL";
                    break;
                case 7:
                    str = "REACTION_BADGE";
                    break;
                default:
                    throw null;
            }
            if (p0e.K(str, charSequence)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [rr3, one.me.android.root.RootController] */
    public static final RootController t(Activity activity) {
        efc efc = (efc) activity;
        if (efc.g().n()) {
            RootController rootController = (RootController) efc.g().g("RootController");
            efc.g().I();
            return rootController;
        }
        ? rootController2 = new RootController();
        sgc g2 = efc.g();
        vgc f2 = n06.f(rootController2, (wr3) null, (wr3) null);
        f2.d("RootController");
        g2.R(f2);
        return rootController2;
    }

    public static fr6 u() {
        return ir6.g().f();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x031a: MOVE  (r0v10 ejb) = (r0v9 ejb)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:122)
        	at jadx.core.dex.visitors.regions.TernaryMod.visitRegion(TernaryMod.java:34)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:73)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:31)
        */
    public static final void v(android.app.Activity r16, android.content.Intent r17) {
        /*
            r0 = r17
            r1 = 0
            r2 = 1
            o2a r3 = defpackage.o2a.a
            w4 r4 = r3.getAccessor()
            java.lang.Class<h0a> r5 = defpackage.h0a.class
            java.lang.Object r4 = r4.c(r5)
            h0a r4 = (defpackage.h0a) r4
            boolean r5 = r4.a()
            if (r5 == 0) goto L_0x001c
            r4.b()
            return
        L_0x001c:
            java.lang.String r4 = r17.getAction()
            r5 = 0
            if (r4 == 0) goto L_0x0092
            int r4 = r17.getFlags()
            r6 = 1048576(0x100000, float:1.469368E-39)
            r4 = r4 & r6
            if (r4 != 0) goto L_0x0092
            java.lang.String r4 = r17.getAction()
            if (r4 == 0) goto L_0x0092
            int r6 = r4.hashCode()
            r7 = -1173264947(0xffffffffba1165cd, float:-5.5464805E-4)
            if (r6 == r7) goto L_0x004a
            r7 = -58484670(0xfffffffffc839842, float:-5.4662324E36)
            if (r6 == r7) goto L_0x0041
            goto L_0x0092
        L_0x0041:
            java.lang.String r6 = "android.intent.action.SEND_MULTIPLE"
            boolean r4 = r4.equals(r6)
            if (r4 != 0) goto L_0x0052
            goto L_0x0092
        L_0x004a:
            java.lang.String r6 = "android.intent.action.SEND"
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L_0x0092
        L_0x0052:
            zu2 r3 = defpackage.zu2.c
            r3.getClass()
            android.os.Bundle r4 = r17.getExtras()
            if (r4 == 0) goto L_0x006f
            java.lang.String r6 = "android.intent.extra.shortcut.ID"
            java.lang.Object r4 = r4.get(r6)
            if (r4 == 0) goto L_0x006f
            java.lang.String r4 = r4.toString()
            if (r4 == 0) goto L_0x006f
            java.lang.Long r5 = defpackage.o0e.H(r4)
        L_0x006f:
            d34 r3 = r3.P1()
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            java.lang.String r6 = "ru.ok.tamtam.extra.DATA"
            r4.putParcelable(r6, r0)
            if (r5 == 0) goto L_0x008c
            long r5 = r5.longValue()
            long[] r0 = new long[r2]
            r0[r1] = r5
            java.lang.String r1 = "selected_ids"
            r4.putLongArray(r1, r0)
        L_0x008c:
            java.lang.String r0 = ":chats/share"
            r3.b(r0, r4)
            return
        L_0x0092:
            w4 r4 = r3.getAccessor()
            java.lang.Class<kx0> r6 = defpackage.kx0.class
            java.lang.Object r4 = r4.c(r6)
            kx0 r4 = (defpackage.kx0) r4
            r4.getClass()
            java.lang.String r4 = r17.getAction()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "handleCallRedirectActionIntent action="
            r6.<init>(r7)
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            java.lang.String r6 = "CallActionsProcessor"
            defpackage.udd.p(r6, r4, new java.lang.Object[0])
            y3a r3 = r3.o()
            ygc r3 = r3.f()
            sgc r3 = r3.C()
            java.lang.String r4 = r17.getAction()
            java.lang.Class<android.net.Uri> r6 = android.net.Uri.class
            java.lang.String r7 = "deep_link"
            if (r4 != 0) goto L_0x0110
            android.net.Uri r4 = r17.getData()
            if (r4 != 0) goto L_0x00da
            java.lang.Object r4 = defpackage.fja.i(r0, r7, r6)
            android.net.Uri r4 = (android.net.Uri) r4
        L_0x00da:
            if (r4 == 0) goto L_0x025d
            t97 r8 = defpackage.wp1.a
            java.lang.Object r8 = r8.getValue()
            java.util.List r8 = (java.util.List) r8
            boolean r9 = r8 instanceof java.util.Collection
            if (r9 == 0) goto L_0x00f0
            boolean r9 = r8.isEmpty()
            if (r9 == 0) goto L_0x00f0
            goto L_0x025d
        L_0x00f0:
            java.util.Iterator r8 = r8.iterator()
        L_0x00f4:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x025d
            java.lang.Object r9 = r8.next()
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r10 = r4.toString()
            boolean r9 = defpackage.h0e.R(r10, r9, r1)
            if (r9 == 0) goto L_0x00f4
            boolean r1 = defpackage.wp1.a(r3)
            goto L_0x025d
        L_0x0110:
            f91 r4 = lu7.a(r4)
            boolean r8 = r4 instanceof defpackage.b91
            if (r8 != 0) goto L_0x024a
            boolean r8 = r4 instanceof defpackage.w81
            if (r8 == 0) goto L_0x011e
            goto L_0x024a
        L_0x011e:
            boolean r8 = r4 instanceof defpackage.c91
            java.lang.String r9 = ""
            if (r8 == 0) goto L_0x01ab
            t97 r4 = defpackage.wp1.a
            java.lang.String r4 = ":call-incoming"
            rr3 r8 = r3.g(r4)
            if (r8 == 0) goto L_0x0130
            r8 = r4
            goto L_0x0131
        L_0x0130:
            r8 = r5
        L_0x0131:
            if (r8 != 0) goto L_0x015d
            java.util.ArrayList r8 = r3.e()
            java.util.Iterator r8 = r8.iterator()
        L_0x013b:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L_0x0153
            java.lang.Object r10 = r8.next()
            r11 = r10
            vgc r11 = (defpackage.vgc) r11
            java.lang.String r11 = r11.b
            if (r11 == 0) goto L_0x013b
            boolean r11 = defpackage.h0e.R(r11, r4, r1)
            if (r11 != r2) goto L_0x013b
            goto L_0x0154
        L_0x0153:
            r10 = r5
        L_0x0154:
            vgc r10 = (defpackage.vgc) r10
            if (r10 == 0) goto L_0x015c
            java.lang.String r4 = r10.b
            r8 = r4
            goto L_0x015d
        L_0x015c:
            r8 = r5
        L_0x015d:
            if (r8 == 0) goto L_0x0162
            r3.D(r8)
        L_0x0162:
            if (r8 == 0) goto L_0x0165
            goto L_0x01a8
        L_0x0165:
            java.lang.String r3 = "incoming_param_name"
            java.lang.String r3 = r0.getStringExtra(r3)
            if (r3 != 0) goto L_0x016e
            goto L_0x016f
        L_0x016e:
            r9 = r3
        L_0x016f:
            java.lang.String r3 = "incoming_param_avatar"
            java.lang.String r3 = r0.getStringExtra(r3)
            java.lang.String r4 = "incoming_param_chat_id"
            r10 = 0
            long r10 = r0.getLongExtra(r4, r10)
            java.lang.String r4 = "incoming_param_is_video"
            boolean r1 = r0.getBooleanExtra(r4, r1)
            sr7 r4 = defpackage.sr7.c
            d34 r4 = r4.P1()
            java.lang.String r8 = ":call-incoming?chat_id="
            java.lang.String r12 = "&call_name="
            java.lang.StringBuilder r8 = m4b.j(r8, r10, r12, r9)
            java.lang.String r9 = "&call_avatar="
            r8.append(r9)
            r8.append(r3)
            java.lang.String r3 = "&video_enabled="
            r8.append(r3)
            r8.append(r1)
            java.lang.String r1 = r8.toString()
            r4.b(r1, r5)
        L_0x01a8:
            r1 = r2
            goto L_0x025d
        L_0x01ab:
            boolean r8 = r4 instanceof defpackage.a91
            if (r8 == 0) goto L_0x01dd
            boolean r1 = defpackage.wp1.a(r3)
            if (r1 != 0) goto L_0x01a8
            java.lang.String r1 = "link_param"
            java.lang.String r1 = r0.getStringExtra(r1)
            if (r1 != 0) goto L_0x01be
            goto L_0x01bf
        L_0x01be:
            r9 = r1
        L_0x01bf:
            sr7 r1 = defpackage.sr7.c
            d34 r1 = r1.P1()
            mn r3 = new mn
            r4 = 12
            r3.<init>((int) r4)
            java.lang.String r4 = ":call-join-preview"
            r3.b = r4
            java.lang.String r4 = "link"
            r3.T(r9, r4)
            android.net.Uri r3 = r3.u()
            r1.c(r3, r5)
            goto L_0x01a8
        L_0x01dd:
            boolean r3 = r4 instanceof defpackage.d91
            if (r3 == 0) goto L_0x025d
            java.lang.String r3 = "call_id"
            java.lang.String r3 = r0.getStringExtra(r3)
            if (r3 != 0) goto L_0x01ea
            goto L_0x01eb
        L_0x01ea:
            r9 = r3
        L_0x01eb:
            java.lang.String r3 = "is_video"
            boolean r3 = r0.getBooleanExtra(r3, r1)
            java.lang.String r4 = "sdk_reasons"
            java.lang.String[] r4 = r0.getStringArrayExtra(r4)
            if (r4 != 0) goto L_0x01fb
            java.lang.String[] r4 = new java.lang.String[r1]
        L_0x01fb:
            sr7 r1 = defpackage.sr7.c
            java.util.List r10 = defpackage.cs.g0(r4)
            r1.getClass()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r11 = ":call-rate?call_id="
            r8.<init>(r11)
            r8.append(r9)
            java.lang.String r9 = "&is_video="
            r8.append(r9)
            r8.append(r3)
            java.lang.String r3 = r8.toString()
            r4.append(r3)
            boolean r3 = r10.isEmpty()
            r3 = r3 ^ r2
            if (r3 == 0) goto L_0x023d
            r13 = 0
            r14 = 0
            java.lang.String r11 = ","
            r12 = 0
            r15 = 62
            java.lang.String r3 = defpackage.o23.c0(r10, r11, r12, r13, r14, r15)
            java.lang.String r8 = "&sdk_reasons="
            java.lang.String r3 = r8.concat(r3)
            r4.append(r3)
        L_0x023d:
            java.lang.String r3 = r4.toString()
            d34 r1 = r1.P1()
            r1.b(r3, r5)
            goto L_0x01a8
        L_0x024a:
            boolean r1 = defpackage.wp1.a(r3)
            if (r1 != 0) goto L_0x01a8
            sr7 r1 = defpackage.sr7.c
            d34 r1 = r1.P1()
            java.lang.String r3 = ":call-active"
            r1.b(r3, r5)
            goto L_0x01a8
        L_0x025d:
            if (r1 == 0) goto L_0x026d
            java.lang.Class r0 = r16.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "call detect"
            defpackage.udd.p(r0, r1, new java.lang.Object[0])
            return
        L_0x026d:
            android.net.Uri r1 = r17.getData()
            if (r1 != 0) goto L_0x0279
            java.lang.Object r1 = defpackage.fja.i(r0, r7, r6)
            android.net.Uri r1 = (android.net.Uri) r1
        L_0x0279:
            if (r1 != 0) goto L_0x027c
            return
        L_0x027c:
            o2a r3 = defpackage.o2a.a
            w4 r4 = r3.getAccessor()
            java.lang.Class<d34> r6 = defpackage.d34.class
            java.lang.Object r4 = r4.c(r6)
            d34 r4 = (defpackage.d34) r4
            boolean r4 = r4.c(r1, r5)
            if (r4 != 0) goto L_0x0291
            return
        L_0x0291:
            java.lang.String r4 = "external_callback_param_arg"
            java.lang.String r4 = r0.getStringExtra(r4)
            if (r4 == 0) goto L_0x02b3
            sr7 r6 = defpackage.sr7.c
            d34 r6 = r6.P1()
            wia r7 = new wia
            java.lang.String r8 = "params"
            r7.<init>(r8, r4)
            wia[] r4 = new defpackage.wia[]{r7}
            android.os.Bundle r4 = defpackage.jjd.j(r4)
            java.lang.String r7 = ":external_callback"
            r6.b(r7, r4)
        L_0x02b3:
            java.lang.Class r4 = r16.getClass()
            java.lang.String r4 = r4.getName()
            fn6 r6 = defpackage.udd.e
            if (r6 != 0) goto L_0x02c0
            goto L_0x02d9
        L_0x02c0:
            boolean r7 = r6.c()
            if (r7 == 0) goto L_0x02d9
            tn7 r7 = tn7.X
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "deep link detect "
            r8.<init>(r9)
            r8.append(r1)
            java.lang.String r1 = r8.toString()
            r6.d(r7, r4, r1, r5)
        L_0x02d9:
            java.lang.String r1 = "push_action"
            java.lang.String r1 = r0.getStringExtra(r1)
            if (r1 != 0) goto L_0x02e2
            return
        L_0x02e2:
            java.lang.String r4 = "push_action_open_chat"
            boolean r4 = r1.equals(r4)
            java.lang.Class<mr9> r5 = mr9.class
            java.lang.String r6 = "p_op"
            java.lang.String r7 = "Action"
            if (r4 == 0) goto L_0x0384
            java.lang.String r1 = "push_info"
            java.lang.Class<ejb> r3 = ejb.class
            java.lang.Object r0 = defpackage.fja.i(r0, r1, r3)     // Catch:{ all -> 0x02fb }
            ejb r0 = (ejb) r0     // Catch:{ all -> 0x02fb }
            goto L_0x0302
        L_0x02fb:
            r0 = move-exception
            kcc r1 = new kcc
            r1.<init>(r0)
            r0 = r1
        L_0x0302:
            java.lang.Throwable r1 = defpackage.mcc.a(r0)
            if (r1 == 0) goto L_0x0315
            java.lang.Class r3 = r16.getClass()
            java.lang.String r3 = r3.getName()
            java.lang.String r4 = "fail to fetch push info"
            defpackage.udd.S(r3, r4, r1)
        L_0x0315:
            boolean r1 = r0 instanceof defpackage.kcc
            r1 = r1 ^ r2
            if (r1 == 0) goto L_0x03c8
            ejb r0 = (ejb) r0
            if (r0 == 0) goto L_0x03c8
            o2a r1 = defpackage.o2a.a
            w4 r1 = r1.getAccessor()
            java.lang.Object r1 = r1.c(r5)
            mr9 r1 = (mr9) r1
            nr9 r1 = r1.e()
            r1.getClass()
            java.lang.Object[] r3 = new java.lang.Object[]{r0}
            java.lang.String r4 = nr9.d
            java.lang.String r5 = "onNotificationOpenedForChat: %s"
            defpackage.udd.p(r4, r5, r3)
            java.lang.String r3 = r0.b
            if (r3 != 0) goto L_0x0342
            goto L_0x03c8
        L_0x0342:
            bd r5 = r1.b()     // Catch:{ Exception -> 0x036d }
            java.lang.String r8 = "trid"
            long r9 = r0.a     // Catch:{ Exception -> 0x036d }
            java.lang.Long r0 = java.lang.Long.valueOf(r9)     // Catch:{ Exception -> 0x036d }
            wia r9 = new wia     // Catch:{ Exception -> 0x036d }
            r9.<init>(r8, r0)     // Catch:{ Exception -> 0x036d }
            java.lang.String r0 = "eKey"
            wia r8 = new wia     // Catch:{ Exception -> 0x036d }
            r8.<init>(r0, r3)     // Catch:{ Exception -> 0x036d }
            java.lang.String r0 = "open_chat"
            wia r3 = new wia     // Catch:{ Exception -> 0x036d }
            r3.<init>(r6, r0)     // Catch:{ Exception -> 0x036d }
            wia[] r0 = new defpackage.wia[]{r9, r8, r3}     // Catch:{ Exception -> 0x036d }
            yr r0 = defpackage.jjd.h(r0)     // Catch:{ Exception -> 0x036d }
            r5.b(r7, r0)     // Catch:{ Exception -> 0x036d }
            goto L_0x03c8
        L_0x036d:
            r0 = move-exception
            java.lang.String r3 = "onNotificationOpenedForChat: failed"
            defpackage.udd.s(r4, r3, r0)
            g15 r1 = r1.c()
            ru.ok.tamtam.util.HandledException r3 = new ru.ok.tamtam.util.HandledException
            java.lang.String r4 = "failed to log notification open for chat"
            r3.<init>(r4, r0)
            r4a r1 = (defpackage.r4a) r1
            r1.c(r3, r2)
            goto L_0x03c8
        L_0x0384:
            java.lang.String r0 = "push_action_open_chats"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x03c8
            w4 r0 = r3.getAccessor()
            java.lang.Object r0 = r0.c(r5)
            mr9 r0 = (mr9) r0
            nr9 r1 = r0.e()
            r1.getClass()
            java.lang.String r3 = nr9.d
            java.lang.String r0 = "onNotificationOpened"
            defpackage.udd.p(r3, r0, new java.lang.Object[0])
            bd r0 = r1.b()     // Catch:{ Exception -> 0x03b2 }
            java.lang.String r4 = "open_chats"
            java.util.Map r4 = java.util.Collections.singletonMap(r6, r4)     // Catch:{ Exception -> 0x03b2 }
            r0.b(r7, r4)     // Catch:{ Exception -> 0x03b2 }
            goto L_0x03c8
        L_0x03b2:
            r0 = move-exception
            java.lang.String r4 = "onNotificationOpened: failed"
            defpackage.udd.s(r3, r4, r0)
            g15 r1 = r1.c()
            ru.ok.tamtam.util.HandledException r3 = new ru.ok.tamtam.util.HandledException
            java.lang.String r4 = "failed to log notification open"
            r3.<init>(r4, r0)
            r4a r1 = (defpackage.r4a) r1
            r1.c(r3, r2)
        L_0x03c8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a06.v(android.app.Activity, android.content.Intent):void");
    }

    public static y2b w(List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        mi9 mi9 = null;
        int i = 0;
        while (it.hasNext()) {
            int i2 = i + 1;
            si9 si9 = (si9) it.next();
            linkedHashMap.put(Integer.valueOf(i), si9.a);
            for (li9 li9 : si9.b) {
                Boolean bool = li9.c;
                boolean booleanValue = bool != null ? bool.booleanValue() : false;
                mi9 mi92 = new mi9(li9.a, li9.b, i, booleanValue);
                arrayList.add(mi92);
                if (booleanValue && mi9 == null) {
                    mi9 = mi92;
                }
            }
            i = i2;
        }
        return new y2b(linkedHashMap, arrayList, mi9);
    }

    public abstract void A(Throwable th);

    public abstract void B(o39 o39);

    public void x() {
    }

    public void y() {
    }

    public void z() {
    }
}
