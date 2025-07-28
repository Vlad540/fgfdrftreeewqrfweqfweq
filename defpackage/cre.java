package defpackage;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: cre  reason: default package */
public abstract class cre implements Cloneable {
    public static final Animator[] R0 = new Animator[0];
    public static final int[] S0 = {2, 1, 3, 4};
    public static final hk9 T0 = new hk9(18);
    public static final ThreadLocal U0 = new ThreadLocal();
    public final int[] A0 = S0;
    public ArrayList B0;
    public ArrayList C0;
    public zqe[] D0;
    public final ArrayList E0 = new ArrayList();
    public Animator[] F0 = R0;
    public int G0 = 0;
    public boolean H0 = false;
    public boolean I0 = false;
    public cre J0 = null;
    public ArrayList K0 = null;
    public ArrayList L0 = new ArrayList();
    public zed M0;
    public fja N0;
    public hk9 O0 = T0;
    public long P0;
    public long Q0;
    public final ArrayList X = new ArrayList();
    public final ArrayList Y = new ArrayList();
    public ArrayList Z = null;
    public final String a = getClass().getName();
    public long b = -1;
    public long c = -1;
    public TimeInterpolator o = null;
    public ArrayList w0 = null;
    public nxc x0 = new nxc(16);
    public nxc y0 = new nxc(16);
    public kre z0 = null;

    public static boolean A(mre mre, mre mre2, String str) {
        Object obj = mre.a.get(str);
        Object obj2 = mre2.a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public static void d(nxc nxc, View view, mre mre) {
        ((yr) nxc.a).put(view, mre);
        int id = view.getId();
        if (id >= 0) {
            SparseArray sparseArray = (SparseArray) nxc.b;
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, (Object) null);
            } else {
                sparseArray.put(id, view);
            }
        }
        WeakHashMap weakHashMap = eaf.a;
        String k = t9f.k(view);
        if (k != null) {
            yr yrVar = (yr) nxc.o;
            if (yrVar.containsKey(k)) {
                yrVar.put(k, (Object) null);
            } else {
                yrVar.put(k, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                uq7 uq7 = (uq7) nxc.c;
                if (uq7.d(itemIdAtPosition) >= 0) {
                    View view2 = (View) uq7.c(itemIdAtPosition);
                    if (view2 != null) {
                        view2.setHasTransientState(false);
                        uq7.f(itemIdAtPosition, (Object) null);
                        return;
                    }
                    return;
                }
                view.setHasTransientState(true);
                uq7.f(itemIdAtPosition, view);
            }
        }
    }

    public static ArrayList p(ArrayList arrayList, int i) {
        if (i > 0) {
            Integer valueOf = Integer.valueOf(i);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            if (!arrayList.contains(valueOf)) {
                arrayList.add(valueOf);
            }
        }
        return arrayList;
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [kgd, yr, java.lang.Object] */
    public static yr u() {
        ThreadLocal threadLocal = U0;
        yr yrVar = (yr) threadLocal.get();
        if (yrVar != null) {
            return yrVar;
        }
        ? kgd = new kgd();
        threadLocal.set(kgd);
        return kgd;
    }

    public final void B(cre cre, bre bre, boolean z) {
        cre cre2 = this.J0;
        if (cre2 != null) {
            cre2.B(cre, bre, z);
        }
        ArrayList arrayList = this.K0;
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = this.K0.size();
            zqe[] zqeArr = this.D0;
            if (zqeArr == null) {
                zqeArr = new zqe[size];
            }
            this.D0 = null;
            zqe[] zqeArr2 = (zqe[]) this.K0.toArray(zqeArr);
            for (int i = 0; i < size; i++) {
                bre.c(zqeArr2[i], cre, z);
                zqeArr2[i] = null;
            }
            this.D0 = zqeArr2;
        }
    }

    public void C(View view) {
        if (!this.I0) {
            ArrayList arrayList = this.E0;
            int size = arrayList.size();
            Animator[] animatorArr = (Animator[]) arrayList.toArray(this.F0);
            this.F0 = R0;
            for (int i = size - 1; i >= 0; i--) {
                Animator animator = animatorArr[i];
                animatorArr[i] = null;
                animator.pause();
            }
            this.F0 = animatorArr;
            B(this, bre.i0, false);
            this.H0 = true;
        }
    }

    public void D() {
        yr u = u();
        this.P0 = 0;
        for (int i = 0; i < this.L0.size(); i++) {
            Animator animator = (Animator) this.L0.get(i);
            wqe wqe = (wqe) u.get(animator);
            if (!(animator == null || wqe == null)) {
                long j = this.c;
                int i2 = (j > 0 ? 1 : (j == 0 ? 0 : -1));
                Animator animator2 = wqe.f;
                if (i2 >= 0) {
                    animator2.setDuration(j);
                }
                long j2 = this.b;
                if (j2 >= 0) {
                    animator2.setStartDelay(animator2.getStartDelay() + j2);
                }
                TimeInterpolator timeInterpolator = this.o;
                if (timeInterpolator != null) {
                    animator2.setInterpolator(timeInterpolator);
                }
                this.E0.add(animator);
                this.P0 = Math.max(this.P0, xqe.a(animator));
            }
        }
        this.L0.clear();
    }

    public cre E(zqe zqe) {
        cre cre;
        ArrayList arrayList = this.K0;
        if (arrayList == null) {
            return this;
        }
        if (!arrayList.remove(zqe) && (cre = this.J0) != null) {
            cre.E(zqe);
        }
        if (this.K0.size() == 0) {
            this.K0 = null;
        }
        return this;
    }

    public void F(View view) {
        this.Y.remove(view);
    }

    public void G(View view) {
        if (this.H0) {
            if (!this.I0) {
                ArrayList arrayList = this.E0;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.F0);
                this.F0 = R0;
                for (int i = size - 1; i >= 0; i--) {
                    Animator animator = animatorArr[i];
                    animatorArr[i] = null;
                    animator.resume();
                }
                this.F0 = animatorArr;
                B(this, bre.j0, false);
            }
            this.H0 = false;
        }
    }

    public void H() {
        P();
        yr u = u();
        Iterator it = this.L0.iterator();
        while (it.hasNext()) {
            Animator animator = (Animator) it.next();
            if (u.containsKey(animator)) {
                P();
                if (animator != null) {
                    animator.addListener(new eh(this, u, false, 5));
                    long j = this.c;
                    if (j >= 0) {
                        animator.setDuration(j);
                    }
                    long j2 = this.b;
                    if (j2 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j2);
                    }
                    TimeInterpolator timeInterpolator = this.o;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new l6(10, (Object) this));
                    animator.start();
                }
            }
        }
        this.L0.clear();
        o();
    }

    public void I(long j, long j2) {
        long j3 = j;
        long j4 = this.P0;
        boolean z = j3 < j2;
        int i = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
        if ((i < 0 && j3 >= 0) || (j2 > j4 && j3 <= j4)) {
            this.I0 = false;
            B(this, bre.f0, z);
        }
        ArrayList arrayList = this.E0;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.F0);
        this.F0 = R0;
        for (int i2 = 0; i2 < size; i2++) {
            Animator animator = animatorArr[i2];
            animatorArr[i2] = null;
            xqe.b(animator, Math.min(Math.max(0, j3), xqe.a(animator)));
        }
        this.F0 = animatorArr;
        int i3 = (j3 > j4 ? 1 : (j3 == j4 ? 0 : -1));
        if ((i3 > 0 && j2 <= j4) || (j3 < 0 && i >= 0)) {
            if (i3 > 0) {
                this.I0 = true;
            }
            B(this, bre.g0, z);
        }
    }

    public void J(long j) {
        this.c = j;
    }

    public void K(fja fja) {
        this.N0 = fja;
    }

    public void L(TimeInterpolator timeInterpolator) {
        this.o = timeInterpolator;
    }

    public void M(hk9 hk9) {
        if (hk9 == null) {
            this.O0 = T0;
        } else {
            this.O0 = hk9;
        }
    }

    public void N(zed zed) {
        this.M0 = zed;
    }

    public void O(long j) {
        this.b = j;
    }

    public final void P() {
        if (this.G0 == 0) {
            B(this, bre.f0, false);
            this.I0 = false;
        }
        this.G0++;
    }

    public String Q(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.c != -1) {
            sb.append("dur(");
            sb.append(this.c);
            sb.append(") ");
        }
        if (this.b != -1) {
            sb.append("dly(");
            sb.append(this.b);
            sb.append(") ");
        }
        if (this.o != null) {
            sb.append("interp(");
            sb.append(this.o);
            sb.append(") ");
        }
        ArrayList arrayList = this.X;
        int size = arrayList.size();
        ArrayList arrayList2 = this.Y;
        if (size > 0 || arrayList2.size() > 0) {
            sb.append("tgts(");
            if (arrayList.size() > 0) {
                for (int i = 0; i < arrayList.size(); i++) {
                    if (i > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList.get(i));
                }
            }
            if (arrayList2.size() > 0) {
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    if (i2 > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList2.get(i2));
                }
            }
            sb.append(")");
        }
        return sb.toString();
    }

    public void a(zqe zqe) {
        if (this.K0 == null) {
            this.K0 = new ArrayList();
        }
        this.K0.add(zqe);
    }

    public void b(int i) {
        if (i != 0) {
            this.X.add(Integer.valueOf(i));
        }
    }

    public void c(View view) {
        this.Y.add(view);
    }

    public void e() {
        ArrayList arrayList = this.E0;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.F0);
        this.F0 = R0;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.cancel();
        }
        this.F0 = animatorArr;
        B(this, bre.h0, false);
    }

    public abstract void f(mre mre);

    public final void g(View view, boolean z) {
        if (view != null) {
            int id = view.getId();
            ArrayList arrayList = this.Z;
            if (arrayList == null || !arrayList.contains(Integer.valueOf(id))) {
                if (view.getParent() instanceof ViewGroup) {
                    mre mre = new mre(view);
                    if (z) {
                        i(mre);
                    } else {
                        f(mre);
                    }
                    mre.c.add(this);
                    h(mre);
                    if (z) {
                        d(this.x0, view, mre);
                    } else {
                        d(this.y0, view, mre);
                    }
                }
                if (view instanceof ViewGroup) {
                    ArrayList arrayList2 = this.w0;
                    if (arrayList2 == null || !arrayList2.contains(Integer.valueOf(id))) {
                        ViewGroup viewGroup = (ViewGroup) view;
                        for (int i = 0; i < viewGroup.getChildCount(); i++) {
                            g(viewGroup.getChildAt(i), z);
                        }
                    }
                }
            }
        }
    }

    public void h(mre mre) {
        if (this.M0 != null) {
            HashMap hashMap = mre.a;
            if (!hashMap.isEmpty()) {
                this.M0.getClass();
                String[] strArr = zed.c;
                for (int i = 0; i < 2; i++) {
                    if (!hashMap.containsKey(strArr[i])) {
                        this.M0.getClass();
                        Integer num = (Integer) hashMap.get("android:visibility:visibility");
                        View view = mre.b;
                        if (num == null) {
                            num = Integer.valueOf(view.getVisibility());
                        }
                        hashMap.put("android:visibilityPropagation:visibility", num);
                        int[] iArr = new int[2];
                        view.getLocationOnScreen(iArr);
                        int round = Math.round(view.getTranslationX()) + iArr[0];
                        iArr[0] = round;
                        iArr[0] = (view.getWidth() / 2) + round;
                        int round2 = Math.round(view.getTranslationY()) + iArr[1];
                        iArr[1] = round2;
                        iArr[1] = (view.getHeight() / 2) + round2;
                        hashMap.put("android:visibilityPropagation:center", iArr);
                        return;
                    }
                }
            }
        }
    }

    public abstract void i(mre mre);

    public final void j(ViewGroup viewGroup, boolean z) {
        k(z);
        ArrayList arrayList = this.X;
        int size = arrayList.size();
        ArrayList arrayList2 = this.Y;
        if (size > 0 || arrayList2.size() > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                View findViewById = viewGroup.findViewById(((Integer) arrayList.get(i)).intValue());
                if (findViewById != null) {
                    mre mre = new mre(findViewById);
                    if (z) {
                        i(mre);
                    } else {
                        f(mre);
                    }
                    mre.c.add(this);
                    h(mre);
                    if (z) {
                        d(this.x0, findViewById, mre);
                    } else {
                        d(this.y0, findViewById, mre);
                    }
                }
            }
            for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                View view = (View) arrayList2.get(i2);
                mre mre2 = new mre(view);
                if (z) {
                    i(mre2);
                } else {
                    f(mre2);
                }
                mre2.c.add(this);
                h(mre2);
                if (z) {
                    d(this.x0, view, mre2);
                } else {
                    d(this.y0, view, mre2);
                }
            }
            return;
        }
        g(viewGroup, z);
    }

    public final void k(boolean z) {
        if (z) {
            ((yr) this.x0.a).clear();
            ((SparseArray) this.x0.b).clear();
            ((uq7) this.x0.c).a();
            return;
        }
        ((yr) this.y0.a).clear();
        ((SparseArray) this.y0.b).clear();
        ((uq7) this.y0.c).a();
    }

    /* renamed from: l */
    public cre clone() {
        try {
            cre cre = (cre) super.clone();
            cre.L0 = new ArrayList();
            cre.x0 = new nxc(16);
            cre.y0 = new nxc(16);
            cre.B0 = null;
            cre.C0 = null;
            cre.getClass();
            cre.J0 = this;
            cre.K0 = null;
            return cre;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public Animator m(ViewGroup viewGroup, mre mre, mre mre2) {
        return null;
    }

    /* JADX WARNING: type inference failed for: r1v11, types: [java.lang.Object, wqe] */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01a5, code lost:
        if (r27.getLayoutDirection() == 1) goto L_0x01a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01a9, code lost:
        r1 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01b6, code lost:
        if (r27.getLayoutDirection() == 1) goto L_0x01a9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x01e7  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0202  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0207  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0215  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0182  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x018b  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01a0  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01bb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void n(android.view.ViewGroup r27, nxc r28, nxc r29, java.util.ArrayList r30, java.util.ArrayList r31) {
        /*
            r26 = this;
            r0 = r26
            r1 = r27
            yr r2 = u()
            android.util.SparseIntArray r3 = new android.util.SparseIntArray
            r3.<init>()
            int r4 = r30.size()
            cre r5 = r26.t()
            r5.getClass()
            r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r9 = 0
        L_0x001e:
            if (r9 >= r4) goto L_0x025d
            r10 = r30
            java.lang.Object r11 = r10.get(r9)
            mre r11 = (defpackage.mre) r11
            r12 = r31
            java.lang.Object r13 = r12.get(r9)
            mre r13 = (defpackage.mre) r13
            if (r11 == 0) goto L_0x003b
            java.util.ArrayList r15 = r11.c
            boolean r15 = r15.contains(r0)
            if (r15 != 0) goto L_0x003b
            r11 = 0
        L_0x003b:
            if (r13 == 0) goto L_0x0046
            java.util.ArrayList r15 = r13.c
            boolean r15 = r15.contains(r0)
            if (r15 != 0) goto L_0x0046
            r13 = 0
        L_0x0046:
            if (r11 != 0) goto L_0x0052
            if (r13 != 0) goto L_0x0052
        L_0x004a:
            r18 = r4
            r20 = r9
        L_0x004e:
            r17 = 0
            goto L_0x0255
        L_0x0052:
            if (r11 == 0) goto L_0x005c
            if (r13 == 0) goto L_0x005c
            boolean r15 = r0.y(r11, r13)
            if (r15 == 0) goto L_0x004a
        L_0x005c:
            android.animation.Animator r15 = r0.m(r1, r11, r13)
            if (r15 == 0) goto L_0x004a
            java.lang.String r14 = r0.a
            if (r13 == 0) goto L_0x00e3
            java.lang.String[] r6 = r26.v()
            android.view.View r5 = r13.b
            r18 = r4
            if (r6 == 0) goto L_0x00dc
            int r4 = r6.length
            if (r4 <= 0) goto L_0x00dc
            mre r4 = new mre
            r4.<init>(r5)
            r10 = r29
            java.lang.Object r12 = r10.a
            yr r12 = (defpackage.yr) r12
            java.lang.Object r12 = r12.get(r5)
            mre r12 = (defpackage.mre) r12
            if (r12 == 0) goto L_0x00a7
            r19 = r15
            r10 = 0
        L_0x0089:
            int r15 = r6.length
            if (r10 >= r15) goto L_0x00a4
            java.util.HashMap r15 = r4.a
            r20 = r9
            r9 = r6[r10]
            r21 = r6
            java.util.HashMap r6 = r12.a
            java.lang.Object r6 = r6.get(r9)
            r15.put(r9, r6)
            int r10 = r10 + 1
            r9 = r20
            r6 = r21
            goto L_0x0089
        L_0x00a4:
            r20 = r9
            goto L_0x00ab
        L_0x00a7:
            r20 = r9
            r19 = r15
        L_0x00ab:
            int r6 = r2.c
            r9 = 0
        L_0x00ae:
            if (r9 >= r6) goto L_0x00d9
            java.lang.Object r10 = r2.f(r9)
            android.animation.Animator r10 = (android.animation.Animator) r10
            java.lang.Object r10 = r2.get(r10)
            wqe r10 = (defpackage.wqe) r10
            mre r12 = r10.c
            if (r12 == 0) goto L_0x00d6
            android.view.View r12 = r10.a
            if (r12 != r5) goto L_0x00d6
            java.lang.String r12 = r10.b
            boolean r12 = r12.equals(r14)
            if (r12 == 0) goto L_0x00d6
            mre r10 = r10.c
            boolean r10 = r10.equals(r4)
            if (r10 == 0) goto L_0x00d6
            r15 = 0
            goto L_0x00ec
        L_0x00d6:
            int r9 = r9 + 1
            goto L_0x00ae
        L_0x00d9:
            r15 = r19
            goto L_0x00ec
        L_0x00dc:
            r20 = r9
            r19 = r15
            r15 = r19
            goto L_0x00eb
        L_0x00e3:
            r18 = r4
            r20 = r9
            r19 = r15
            android.view.View r5 = r11.b
        L_0x00eb:
            r4 = 0
        L_0x00ec:
            if (r15 == 0) goto L_0x004e
            zed r6 = r0.M0
            if (r6 == 0) goto L_0x0232
            if (r11 != 0) goto L_0x00fe
            if (r13 != 0) goto L_0x00fe
            r28 = r2
            r9 = 0
            r17 = 0
            goto L_0x0223
        L_0x00fe:
            fja r12 = r0.N0
            if (r12 != 0) goto L_0x0104
            r12 = 0
            goto L_0x0108
        L_0x0104:
            android.graphics.Rect r12 = r12.l()
        L_0x0108:
            r19 = -1
            if (r13 == 0) goto L_0x0128
            r21 = 8
            if (r11 != 0) goto L_0x0111
            goto L_0x0122
        L_0x0111:
            java.util.HashMap r9 = r11.a
            java.lang.String r10 = "android:visibilityPropagation:visibility"
            java.lang.Object r9 = r9.get(r10)
            java.lang.Integer r9 = (java.lang.Integer) r9
            if (r9 != 0) goto L_0x011e
            goto L_0x0122
        L_0x011e:
            int r21 = r9.intValue()
        L_0x0122:
            if (r21 != 0) goto L_0x0125
            goto L_0x0128
        L_0x0125:
            r11 = r13
            r9 = 1
            goto L_0x012a
        L_0x0128:
            r9 = r19
        L_0x012a:
            java.lang.String r10 = "android:visibilityPropagation:center"
            if (r11 != 0) goto L_0x0131
        L_0x012e:
            r13 = r19
            goto L_0x0140
        L_0x0131:
            java.util.HashMap r13 = r11.a
            java.lang.Object r13 = r13.get(r10)
            int[] r13 = (int[]) r13
            if (r13 != 0) goto L_0x013c
            goto L_0x012e
        L_0x013c:
            r17 = 0
            r13 = r13[r17]
        L_0x0140:
            if (r11 != 0) goto L_0x0144
        L_0x0142:
            r11 = 1
            goto L_0x0152
        L_0x0144:
            java.util.HashMap r11 = r11.a
            java.lang.Object r10 = r11.get(r10)
            int[] r10 = (int[]) r10
            if (r10 != 0) goto L_0x014f
            goto L_0x0142
        L_0x014f:
            r11 = 1
            r19 = r10[r11]
        L_0x0152:
            r10 = 2
            int[] r11 = new int[r10]
            r1.getLocationOnScreen(r11)
            r17 = 0
            r21 = r11[r17]
            float r22 = r27.getTranslationX()
            int r22 = java.lang.Math.round(r22)
            int r22 = r22 + r21
            r16 = 1
            r11 = r11[r16]
            float r21 = r27.getTranslationY()
            int r21 = java.lang.Math.round(r21)
            int r21 = r21 + r11
            int r11 = r27.getWidth()
            int r11 = r11 + r22
            int r23 = r27.getHeight()
            int r23 = r23 + r21
            if (r12 == 0) goto L_0x018b
            int r10 = r12.centerX()
            int r12 = r12.centerY()
            goto L_0x0197
        L_0x018b:
            int r12 = r22 + r11
            int r12 = r12 / r10
            int r24 = r21 + r23
            int r10 = r24 / 2
            r25 = r12
            r12 = r10
            r10 = r25
        L_0x0197:
            int r1 = r6.b
            r28 = r2
            r2 = 8388611(0x800003, float:1.1754948E-38)
            if (r1 != r2) goto L_0x01ac
            int r1 = r27.getLayoutDirection()
            r2 = 1
            if (r1 != r2) goto L_0x01a9
        L_0x01a7:
            r1 = 5
            goto L_0x01aa
        L_0x01a9:
            r1 = 3
        L_0x01aa:
            r2 = 3
            goto L_0x01b9
        L_0x01ac:
            r2 = 8388613(0x800005, float:1.175495E-38)
            if (r1 != r2) goto L_0x01aa
            int r1 = r27.getLayoutDirection()
            r2 = 1
            if (r1 != r2) goto L_0x01a7
            goto L_0x01a9
        L_0x01b9:
            if (r1 == r2) goto L_0x01e7
            r2 = 5
            if (r1 == r2) goto L_0x01dd
            r2 = 48
            if (r1 == r2) goto L_0x01d3
            r2 = 80
            if (r1 == r2) goto L_0x01c9
            r1 = r17
            goto L_0x01ef
        L_0x01c9:
            int r19 = r19 - r21
            int r10 = r10 - r13
            int r1 = java.lang.Math.abs(r10)
            int r1 = r1 + r19
            goto L_0x01ef
        L_0x01d3:
            int r23 = r23 - r19
            int r10 = r10 - r13
            int r1 = java.lang.Math.abs(r10)
            int r1 = r1 + r23
            goto L_0x01ef
        L_0x01dd:
            int r13 = r13 - r22
            int r12 = r12 - r19
            int r1 = java.lang.Math.abs(r12)
            int r1 = r1 + r13
            goto L_0x01ef
        L_0x01e7:
            int r11 = r11 - r13
            int r12 = r12 - r19
            int r1 = java.lang.Math.abs(r12)
            int r1 = r1 + r11
        L_0x01ef:
            float r1 = (float) r1
            int r2 = r6.b
            r10 = 3
            if (r2 == r10) goto L_0x0207
            r10 = 5
            if (r2 == r10) goto L_0x0207
            r10 = 8388611(0x800003, float:1.1754948E-38)
            if (r2 == r10) goto L_0x0207
            r10 = 8388613(0x800005, float:1.175495E-38)
            if (r2 == r10) goto L_0x0207
            int r2 = r27.getHeight()
            goto L_0x020b
        L_0x0207:
            int r2 = r27.getWidth()
        L_0x020b:
            float r2 = (float) r2
            float r1 = r1 / r2
            long r10 = r0.c
            r12 = 0
            int r2 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r2 >= 0) goto L_0x0217
            r10 = 300(0x12c, double:1.48E-321)
        L_0x0217:
            long r12 = (long) r9
            long r10 = r10 * r12
            float r2 = (float) r10
            float r6 = r6.a
            float r2 = r2 / r6
            float r2 = r2 * r1
            int r1 = java.lang.Math.round(r2)
            long r9 = (long) r1
        L_0x0223:
            java.util.ArrayList r1 = r0.L0
            int r1 = r1.size()
            int r2 = (int) r9
            r3.put(r1, r2)
            long r7 = java.lang.Math.min(r9, r7)
            goto L_0x0236
        L_0x0232:
            r28 = r2
            r17 = 0
        L_0x0236:
            wqe r1 = new wqe
            android.view.WindowId r2 = r27.getWindowId()
            r1.<init>()
            r1.a = r5
            r1.b = r14
            r1.c = r4
            r1.d = r2
            r1.e = r0
            r1.f = r15
            r2 = r28
            r2.put(r15, r1)
            java.util.ArrayList r1 = r0.L0
            r1.add(r15)
        L_0x0255:
            int r9 = r20 + 1
            r1 = r27
            r4 = r18
            goto L_0x001e
        L_0x025d:
            r17 = 0
            int r1 = r3.size()
            if (r1 == 0) goto L_0x0294
            r5 = r17
        L_0x0267:
            int r1 = r3.size()
            if (r5 >= r1) goto L_0x0294
            int r1 = r3.keyAt(r5)
            java.util.ArrayList r4 = r0.L0
            java.lang.Object r1 = r4.get(r1)
            android.animation.Animator r1 = (android.animation.Animator) r1
            java.lang.Object r1 = r2.get(r1)
            wqe r1 = (defpackage.wqe) r1
            int r4 = r3.valueAt(r5)
            long r9 = (long) r4
            long r9 = r9 - r7
            android.animation.Animator r4 = r1.f
            long r11 = r4.getStartDelay()
            long r11 = r11 + r9
            android.animation.Animator r1 = r1.f
            r1.setStartDelay(r11)
            int r5 = r5 + 1
            goto L_0x0267
        L_0x0294:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cre.n(android.view.ViewGroup, nxc, nxc, java.util.ArrayList, java.util.ArrayList):void");
    }

    public final void o() {
        int i = this.G0 - 1;
        this.G0 = i;
        if (i == 0) {
            B(this, bre.g0, false);
            for (int i2 = 0; i2 < ((uq7) this.x0.c).h(); i2++) {
                View view = (View) ((uq7) this.x0.c).i(i2);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i3 = 0; i3 < ((uq7) this.y0.c).h(); i3++) {
                View view2 = (View) ((uq7) this.y0.c).i(i3);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.I0 = true;
        }
    }

    public void q(int i) {
        this.Z = p(this.Z, i);
    }

    public void r(ViewGroup viewGroup) {
        yr u = u();
        int i = u.c;
        if (viewGroup != null && i != 0) {
            WindowId windowId = viewGroup.getWindowId();
            yr yrVar = new yr(u);
            u.clear();
            for (int i2 = i - 1; i2 >= 0; i2--) {
                wqe wqe = (wqe) yrVar.i(i2);
                if (wqe.a != null && windowId.equals(wqe.d)) {
                    ((Animator) yrVar.f(i2)).end();
                }
            }
        }
    }

    public final mre s(View view, boolean z) {
        kre kre = this.z0;
        if (kre != null) {
            return kre.s(view, z);
        }
        ArrayList arrayList = z ? this.B0 : this.C0;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            }
            mre mre = (mre) arrayList.get(i);
            if (mre == null) {
                return null;
            }
            if (mre.b == view) {
                break;
            }
            i++;
        }
        if (i < 0) {
            return null;
        }
        return (mre) (z ? this.C0 : this.B0).get(i);
    }

    public final cre t() {
        kre kre = this.z0;
        return kre != null ? kre.t() : this;
    }

    public final String toString() {
        return Q(BuildConfig.FLAVOR);
    }

    public String[] v() {
        return null;
    }

    public final mre w(View view, boolean z) {
        kre kre = this.z0;
        if (kre != null) {
            return kre.w(view, z);
        }
        return (mre) ((yr) (z ? this.x0 : this.y0).a).get(view);
    }

    public boolean x() {
        return !this.E0.isEmpty();
    }

    public boolean y(mre mre, mre mre2) {
        if (mre == null || mre2 == null) {
            return false;
        }
        String[] v = v();
        if (v != null) {
            int length = v.length;
            int i = 0;
            while (i < length) {
                if (!A(mre, mre2, v[i])) {
                    i++;
                }
            }
            return false;
        }
        for (String A : mre.a.keySet()) {
            if (A(mre, mre2, A)) {
            }
        }
        return false;
        return true;
    }

    public final boolean z(View view) {
        int id = view.getId();
        ArrayList arrayList = this.Z;
        if (arrayList != null && arrayList.contains(Integer.valueOf(id))) {
            return false;
        }
        ArrayList arrayList2 = this.X;
        int size = arrayList2.size();
        ArrayList arrayList3 = this.Y;
        return (size == 0 && arrayList3.size() == 0) || arrayList2.contains(Integer.valueOf(id)) || arrayList3.contains(view);
    }
}
