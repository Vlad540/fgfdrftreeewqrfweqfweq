package androidx.recyclerview.widget;

import android.animation.LayoutTransition;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import me.leolin.shortcutbadger.BuildConfig;

public class RecyclerView extends ViewGroup implements opc, eh9 {
    public static boolean P1 = false;
    public static boolean Q1 = false;
    public static final int[] R1 = {16843830};
    public static final float S1 = ((float) (Math.log(0.78d) / Math.log(0.9d)));
    public static final boolean T1 = true;
    public static final boolean U1 = true;
    public static final boolean V1 = true;
    public static final Class[] W1;
    public static final l27 X1 = new l27(2);
    public static final y6c Y1 = new Object();
    public final e6c A0;
    public boolean A1;
    public final Rect B0;
    public final za6 B1;
    public final Rect C0;
    public boolean C1;
    public final RectF D0;
    public d7c D1;
    public f6c E0;
    public final int[] E1;
    public a F0;
    public gh9 F1;
    public final ArrayList G0;
    public final int[] G1;
    public final ArrayList H0;
    public final int[] H1;
    public final ArrayList I0;
    public final int[] I1;
    public q6c J0;
    public final ArrayList J1;
    public boolean K0;
    public final e6c K1;
    public boolean L0;
    public boolean L1;
    public boolean M0;
    public int M1;
    public int N0;
    public int N1;
    public boolean O0;
    public final lv1 O1;
    public boolean P0;
    public boolean Q0;
    public int R0;
    public boolean S0;
    public final AccessibilityManager T0;
    public ArrayList U0;
    public boolean V0;
    public boolean W0;
    public int X0;
    public int Y0;
    public j6c Z0;
    public final float a;
    public EdgeEffect a1;
    public final jw4 b;
    public EdgeEffect b1;
    public final t6c c;
    public EdgeEffect c1;
    public EdgeEffect d1;
    public k6c e1;
    public int f1;
    public int g1;
    public VelocityTracker h1;
    public int i1;
    public int j1;
    public int k1;
    public int l1;
    public int m1;
    public p6c n1;
    public v6c o;
    public final int o1;
    public final int p1;
    public final float q1;
    public final float r1;
    public boolean s1;
    public final a7c t1;
    public p66 u1;
    public final ry2 v1;
    public final b9 w0;
    public final x6c w1;
    public final ope x0;
    public r6c x1;
    public final v2b y0;
    public ArrayList y1;
    public boolean z0;
    public boolean z1;

    /* JADX WARNING: type inference failed for: r0v10, types: [y6c, java.lang.Object] */
    static {
        Class cls = Integer.TYPE;
        W1 = new Class[]{Context.class, AttributeSet.class, cls, cls};
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, vlb.recyclerViewStyle);
    }

    public static RecyclerView L(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView L = L(viewGroup.getChildAt(i));
            if (L != null) {
                return L;
            }
        }
        return null;
    }

    public static int R(View view) {
        b7c U = U(view);
        if (U != null) {
            return U.g();
        }
        return -1;
    }

    public static int S(View view) {
        b7c U = U(view);
        if (U != null) {
            return U.i();
        }
        return -1;
    }

    public static b7c U(View view) {
        if (view == null) {
            return null;
        }
        return ((n6c) view.getLayoutParams()).a;
    }

    public static void V(Rect rect, View view) {
        n6c n6c = (n6c) view.getLayoutParams();
        Rect rect2 = n6c.b;
        rect.set((view.getLeft() - rect2.left) - n6c.leftMargin, (view.getTop() - rect2.top) - n6c.topMargin, view.getRight() + rect2.right + n6c.rightMargin, view.getBottom() + rect2.bottom + n6c.bottomMargin);
    }

    private gh9 getScrollingChildHelper() {
        if (this.F1 == null) {
            this.F1 = new gh9(this);
        }
        return this.F1;
    }

    public static void o(b7c b7c) {
        WeakReference weakReference = b7c.b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view != b7c.a) {
                    ViewParent parent = view.getParent();
                    view = parent instanceof View ? (View) parent : null;
                } else {
                    return;
                }
            }
            b7c.b = null;
        }
    }

    public static int r(int i, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i2) {
        if (i > 0 && edgeEffect != null && pa2.p(edgeEffect) != 0.0f) {
            int round = Math.round(pa2.D(edgeEffect, (((float) (-i)) * 4.0f) / ((float) i2), 0.5f) * (((float) (-i2)) / 4.0f));
            if (round != i) {
                edgeEffect.finish();
            }
            return i - round;
        } else if (i >= 0 || edgeEffect2 == null || pa2.p(edgeEffect2) == 0.0f) {
            return i;
        } else {
            float f = (float) i2;
            int round2 = Math.round(pa2.D(edgeEffect2, (((float) i) * 4.0f) / f, 0.5f) * (f / 4.0f));
            if (round2 != i) {
                edgeEffect2.finish();
            }
            return i - round2;
        }
    }

    public static void setDebugAssertionsEnabled(boolean z) {
        P1 = z;
    }

    public static void setVerboseLoggingEnabled(boolean z) {
        Q1 = z;
    }

    public final void A(int i, int i2) {
        this.Y0++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        r6c r6c = this.x1;
        if (r6c != null) {
            r6c.b(this, i, i2);
        }
        ArrayList arrayList = this.y1;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((r6c) this.y1.get(size)).b(this, i, i2);
            }
        }
        this.Y0--;
    }

    public final void A0(int i, int i2, boolean z) {
        a aVar = this.F0;
        if (aVar != null && !this.P0) {
            int i3 = 0;
            if (!aVar.e()) {
                i = 0;
            }
            if (!this.F0.f()) {
                i2 = 0;
            }
            if (i != 0 || i2 != 0) {
                if (z) {
                    if (i != 0) {
                        i3 = 1;
                    }
                    if (i2 != 0) {
                        i3 |= 2;
                    }
                    getScrollingChildHelper().h(i3, 1);
                }
                this.t1.c(i, i2, Integer.MIN_VALUE, (Interpolator) null);
            }
        }
    }

    public final void B() {
        if (this.d1 == null) {
            EdgeEffect a2 = this.Z0.a(this, 3);
            this.d1 = a2;
            if (this.z0) {
                a2.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                a2.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    public final void B0(int i) {
        a aVar;
        if (!this.P0 && (aVar = this.F0) != null) {
            aVar.I0(this, i);
        }
    }

    public final void C() {
        if (this.a1 == null) {
            EdgeEffect a2 = this.Z0.a(this, 0);
            this.a1 = a2;
            if (this.z0) {
                a2.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                a2.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    public final void C0() {
        int i = this.N0 + 1;
        this.N0 = i;
        if (i == 1 && !this.P0) {
            this.O0 = false;
        }
    }

    public final void D() {
        if (this.c1 == null) {
            EdgeEffect a2 = this.Z0.a(this, 2);
            this.c1 = a2;
            if (this.z0) {
                a2.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                a2.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    public final void D0(boolean z) {
        if (this.N0 < 1) {
            if (!P1) {
                this.N0 = 1;
            } else {
                throw new IllegalStateException(th2.g(this, new StringBuilder("stopInterceptRequestLayout was called more times than startInterceptRequestLayout.")));
            }
        }
        if (!z && !this.P0) {
            this.O0 = false;
        }
        if (this.N0 == 1) {
            if (z && this.O0 && !this.P0 && this.F0 != null && this.E0 != null) {
                v();
            }
            if (!this.P0) {
                this.O0 = false;
            }
        }
        this.N0--;
    }

    public final void E() {
        if (this.b1 == null) {
            EdgeEffect a2 = this.Z0.a(this, 1);
            this.b1 = a2;
            if (this.z0) {
                a2.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                a2.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    public final void E0() {
        hd7 hd7;
        setScrollState(0);
        a7c a7c = this.t1;
        a7c.Z.removeCallbacks(a7c);
        a7c.c.abortAnimation();
        a aVar = this.F0;
        if (aVar != null && (hd7 = aVar.e) != null) {
            hd7.k();
        }
    }

    public final String F() {
        return " " + super.toString() + ", adapter:" + this.E0 + ", layout:" + this.F0 + ", context:" + getContext();
    }

    public final void G(x6c x6c) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.t1.c;
            overScroller.getFinalX();
            overScroller.getCurrX();
            x6c.getClass();
            overScroller.getFinalY();
            overScroller.getCurrY();
            return;
        }
        x6c.getClass();
    }

    public final View H(float f, float f2) {
        for (int z = this.x0.z() - 1; z >= 0; z--) {
            View y = this.x0.y(z);
            float translationX = y.getTranslationX();
            float translationY = y.getTranslationY();
            if (f >= ((float) y.getLeft()) + translationX && f <= ((float) y.getRight()) + translationX && f2 >= ((float) y.getTop()) + translationY && f2 <= ((float) y.getBottom()) + translationY) {
                return y;
            }
        }
        return null;
    }

    public final View I(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = (View) parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    public final boolean J(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        ArrayList arrayList = this.I0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            q6c q6c = (q6c) arrayList.get(i);
            if (!q6c.c(this, motionEvent) || action == 3) {
                i++;
            } else {
                this.J0 = q6c;
                return true;
            }
        }
        return false;
    }

    public final void K(int[] iArr) {
        int z = this.x0.z();
        if (z == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < z; i3++) {
            b7c U = U(this.x0.y(i3));
            if (!U.w()) {
                int i4 = U.i();
                if (i4 < i) {
                    i = i4;
                }
                if (i4 > i2) {
                    i2 = i4;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    public final b7c M(int i) {
        b7c b7c = null;
        if (this.V0) {
            return null;
        }
        int D = this.x0.D();
        for (int i2 = 0; i2 < D; i2++) {
            b7c U = U(this.x0.C(i2));
            if (U != null && !U.p() && P(U) == i) {
                if (!this.x0.H(U.a)) {
                    return U;
                }
                b7c = U;
            }
        }
        return b7c;
    }

    public final b7c N(long j) {
        f6c f6c = this.E0;
        b7c b7c = null;
        if (f6c != null && f6c.b) {
            int D = this.x0.D();
            for (int i = 0; i < D; i++) {
                b7c U = U(this.x0.C(i));
                if (U != null && !U.p() && U.X == j) {
                    if (!this.x0.H(U.a)) {
                        return U;
                    }
                    b7c = U;
                }
            }
        }
        return b7c;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00d4 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00e4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean O(int r12, int r13) {
        /*
            r11 = this;
            androidx.recyclerview.widget.a r0 = r11.F0
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            boolean r2 = r11.P0
            if (r2 == 0) goto L_0x000b
            return r1
        L_0x000b:
            boolean r0 = r0.e()
            androidx.recyclerview.widget.a r2 = r11.F0
            boolean r2 = r2.f()
            int r3 = r11.o1
            if (r0 == 0) goto L_0x001f
            int r4 = java.lang.Math.abs(r12)
            if (r4 >= r3) goto L_0x0020
        L_0x001f:
            r12 = r1
        L_0x0020:
            if (r2 == 0) goto L_0x0028
            int r4 = java.lang.Math.abs(r13)
            if (r4 >= r3) goto L_0x0029
        L_0x0028:
            r13 = r1
        L_0x0029:
            if (r12 != 0) goto L_0x002e
            if (r13 != 0) goto L_0x002e
            return r1
        L_0x002e:
            r3 = 0
            if (r12 == 0) goto L_0x0071
            android.widget.EdgeEffect r4 = r11.a1
            if (r4 == 0) goto L_0x0053
            float r4 = pa2.p(r4)
            int r4 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r4 == 0) goto L_0x0053
            android.widget.EdgeEffect r4 = r11.a1
            int r5 = -r12
            int r6 = r11.getWidth()
            boolean r4 = r11.z0(r4, r5, r6)
            if (r4 == 0) goto L_0x0050
            android.widget.EdgeEffect r12 = r11.a1
            r12.onAbsorb(r5)
        L_0x004f:
            r12 = r1
        L_0x0050:
            r4 = r12
            r12 = r1
            goto L_0x0072
        L_0x0053:
            android.widget.EdgeEffect r4 = r11.c1
            if (r4 == 0) goto L_0x0071
            float r4 = pa2.p(r4)
            int r4 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r4 == 0) goto L_0x0071
            android.widget.EdgeEffect r4 = r11.c1
            int r5 = r11.getWidth()
            boolean r4 = r11.z0(r4, r12, r5)
            if (r4 == 0) goto L_0x0050
            android.widget.EdgeEffect r4 = r11.c1
            r4.onAbsorb(r12)
            goto L_0x004f
        L_0x0071:
            r4 = r1
        L_0x0072:
            if (r13 == 0) goto L_0x00b3
            android.widget.EdgeEffect r5 = r11.b1
            if (r5 == 0) goto L_0x0095
            float r5 = pa2.p(r5)
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x0095
            android.widget.EdgeEffect r3 = r11.b1
            int r5 = -r13
            int r6 = r11.getHeight()
            boolean r3 = r11.z0(r3, r5, r6)
            if (r3 == 0) goto L_0x0093
            android.widget.EdgeEffect r13 = r11.b1
            r13.onAbsorb(r5)
        L_0x0092:
            r13 = r1
        L_0x0093:
            r3 = r1
            goto L_0x00b5
        L_0x0095:
            android.widget.EdgeEffect r5 = r11.d1
            if (r5 == 0) goto L_0x00b3
            float r5 = pa2.p(r5)
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r3 == 0) goto L_0x00b3
            android.widget.EdgeEffect r3 = r11.d1
            int r5 = r11.getHeight()
            boolean r3 = r11.z0(r3, r13, r5)
            if (r3 == 0) goto L_0x0093
            android.widget.EdgeEffect r3 = r11.d1
            r3.onAbsorb(r13)
            goto L_0x0092
        L_0x00b3:
            r3 = r13
            r13 = r1
        L_0x00b5:
            a7c r5 = r11.t1
            int r6 = r11.p1
            if (r4 != 0) goto L_0x00bd
            if (r13 == 0) goto L_0x00d1
        L_0x00bd:
            int r7 = -r6
            int r4 = java.lang.Math.min(r4, r6)
            int r4 = java.lang.Math.max(r7, r4)
            int r13 = java.lang.Math.min(r13, r6)
            int r13 = java.lang.Math.max(r7, r13)
            r5.a(r4, r13)
        L_0x00d1:
            r7 = 1
            if (r12 != 0) goto L_0x00dc
            if (r3 != 0) goto L_0x00dc
            if (r4 != 0) goto L_0x00da
            if (r13 == 0) goto L_0x00db
        L_0x00da:
            r1 = r7
        L_0x00db:
            return r1
        L_0x00dc:
            float r13 = (float) r12
            float r4 = (float) r3
            boolean r8 = r11.dispatchNestedPreFling(r13, r4)
            if (r8 != 0) goto L_0x0155
            if (r0 != 0) goto L_0x00eb
            if (r2 == 0) goto L_0x00e9
            goto L_0x00eb
        L_0x00e9:
            r8 = r1
            goto L_0x00ec
        L_0x00eb:
            r8 = r7
        L_0x00ec:
            r11.dispatchNestedFling(r13, r4, r8)
            p6c r13 = r11.n1
            if (r13 == 0) goto L_0x0133
            e04 r13 = (e04) r13
            androidx.recyclerview.widget.RecyclerView r4 = r13.a
            androidx.recyclerview.widget.a r4 = r4.getLayoutManager()
            if (r4 != 0) goto L_0x00fe
            goto L_0x0133
        L_0x00fe:
            androidx.recyclerview.widget.RecyclerView r9 = r13.a
            f6c r9 = r9.getAdapter()
            if (r9 != 0) goto L_0x0107
            goto L_0x0133
        L_0x0107:
            androidx.recyclerview.widget.RecyclerView r9 = r13.a
            int r9 = r9.getMinFlingVelocity()
            int r10 = java.lang.Math.abs(r3)
            if (r10 > r9) goto L_0x0119
            int r10 = java.lang.Math.abs(r12)
            if (r10 <= r9) goto L_0x0133
        L_0x0119:
            boolean r9 = r4 instanceof defpackage.w6c
            if (r9 != 0) goto L_0x011e
            goto L_0x0133
        L_0x011e:
            hd7 r9 = r13.c(r4)
            if (r9 != 0) goto L_0x0125
            goto L_0x0133
        L_0x0125:
            int r13 = r13.j(r4, r12, r3)
            r10 = -1
            if (r13 != r10) goto L_0x012d
            goto L_0x0133
        L_0x012d:
            r9.a = r13
            r4.J0(r9)
            return r7
        L_0x0133:
            if (r8 == 0) goto L_0x0155
            if (r2 == 0) goto L_0x0139
            r0 = r0 | 2
        L_0x0139:
            gh9 r11 = r11.getScrollingChildHelper()
            r11.h(r0, r7)
            int r11 = -r6
            int r12 = java.lang.Math.min(r12, r6)
            int r12 = java.lang.Math.max(r11, r12)
            int r13 = java.lang.Math.min(r3, r6)
            int r11 = java.lang.Math.max(r11, r13)
            r5.a(r12, r11)
            return r7
        L_0x0155:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.O(int, int):boolean");
    }

    public final int P(b7c b7c) {
        if (b7c.k(524) || !b7c.m()) {
            return -1;
        }
        b9 b9Var = this.w0;
        int i = b7c.c;
        ArrayList arrayList = (ArrayList) b9Var.o;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            a9 a9Var = (a9) arrayList.get(i2);
            int i3 = a9Var.a;
            if (i3 != 1) {
                if (i3 == 2) {
                    int i4 = a9Var.b;
                    if (i4 <= i) {
                        int i5 = a9Var.d;
                        if (i4 + i5 > i) {
                            return -1;
                        }
                        i -= i5;
                    } else {
                        continue;
                    }
                } else if (i3 == 8) {
                    int i6 = a9Var.b;
                    if (i6 == i) {
                        i = a9Var.d;
                    } else {
                        if (i6 < i) {
                            i--;
                        }
                        if (a9Var.d <= i) {
                            i++;
                        }
                    }
                }
            } else if (a9Var.b <= i) {
                i += a9Var.d;
            }
        }
        return i;
    }

    public final long Q(b7c b7c) {
        return this.E0.b ? b7c.X : (long) b7c.c;
    }

    public final b7c T(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return U(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public final Rect W(View view) {
        n6c n6c = (n6c) view.getLayoutParams();
        boolean z = n6c.c;
        Rect rect = n6c.b;
        if (!z) {
            return rect;
        }
        x6c x6c = this.w1;
        if (x6c.h && (n6c.a.s() || n6c.a.n())) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        ArrayList arrayList = this.H0;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Rect rect2 = this.B0;
            rect2.set(0, 0, 0, 0);
            ((l6c) arrayList.get(i)).f(rect2, view, this, x6c);
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        n6c.c = false;
        return rect;
    }

    public final boolean X() {
        return !this.M0 || this.V0 || this.w0.D();
    }

    public void Y() {
        if (this.H0.size() != 0) {
            a aVar = this.F0;
            if (aVar != null) {
                aVar.c("Cannot invalidate item decorations during a scroll or layout");
            }
            b0();
            requestLayout();
        }
    }

    public final boolean Z() {
        return this.X0 > 0;
    }

    public final void a(int i) {
        getScrollingChildHelper().i(i);
    }

    public final void a0(int i) {
        if (this.F0 != null) {
            setScrollState(2);
            this.F0.y0(i);
            awakenScrollBars();
        }
    }

    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        a aVar = this.F0;
        if (aVar != null) {
            aVar.getClass();
        }
        super.addFocusables(arrayList, i, i2);
    }

    public final void b0() {
        int D = this.x0.D();
        for (int i = 0; i < D; i++) {
            ((n6c) this.x0.C(i).getLayoutParams()).c = true;
        }
        t6c t6c = this.c;
        int size = t6c.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            n6c n6c = (n6c) ((b7c) t6c.c.get(i2)).a.getLayoutParams();
            if (n6c != null) {
                n6c.c = true;
            }
        }
    }

    public final void c0(int i) {
        int z = this.x0.z();
        for (int i2 = 0; i2 < z; i2++) {
            this.x0.y(i2).offsetTopAndBottom(i);
        }
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof n6c) && this.F0.g((n6c) layoutParams);
    }

    public final int computeHorizontalScrollExtent() {
        a aVar = this.F0;
        if (aVar != null && aVar.e()) {
            return this.F0.k(this.w1);
        }
        return 0;
    }

    public final int computeHorizontalScrollOffset() {
        a aVar = this.F0;
        if (aVar != null && aVar.e()) {
            return this.F0.l(this.w1);
        }
        return 0;
    }

    public final int computeHorizontalScrollRange() {
        a aVar = this.F0;
        if (aVar != null && aVar.e()) {
            return this.F0.m(this.w1);
        }
        return 0;
    }

    public final int computeVerticalScrollExtent() {
        a aVar = this.F0;
        if (aVar != null && aVar.f()) {
            return this.F0.n(this.w1);
        }
        return 0;
    }

    public final int computeVerticalScrollOffset() {
        a aVar = this.F0;
        if (aVar != null && aVar.f()) {
            return this.F0.o(this.w1);
        }
        return 0;
    }

    public final int computeVerticalScrollRange() {
        a aVar = this.F0;
        if (aVar != null && aVar.f()) {
            return this.F0.p(this.w1);
        }
        return 0;
    }

    public final void d0(int i, int i2, boolean z) {
        int i3 = i + i2;
        int D = this.x0.D();
        for (int i4 = 0; i4 < D; i4++) {
            b7c U = U(this.x0.C(i4));
            if (U != null && !U.w()) {
                int i5 = U.c;
                x6c x6c = this.w1;
                if (i5 >= i3) {
                    if (Q1) {
                        U.toString();
                    }
                    U.t(-i2, z);
                    x6c.g = true;
                } else if (i5 >= i) {
                    if (Q1) {
                        U.toString();
                    }
                    U.f(8);
                    U.t(-i2, z);
                    U.c = i - 1;
                    x6c.g = true;
                }
            }
        }
        t6c t6c = this.c;
        for (int size = t6c.c.size() - 1; size >= 0; size--) {
            b7c b7c = (b7c) t6c.c.get(size);
            if (b7c != null) {
                int i6 = b7c.c;
                if (i6 >= i3) {
                    if (Q1) {
                        b7c.toString();
                    }
                    b7c.t(-i2, z);
                } else if (i6 >= i) {
                    b7c.f(8);
                    t6c.f(size);
                }
            }
        }
        requestLayout();
    }

    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().a(f, f2, z);
    }

    public final boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().b(f, f2);
    }

    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i, i2, 0, iArr, iArr2);
    }

    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().e(i, i2, i3, i4, iArr, 0, (int[]) null);
    }

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    public final void draw(Canvas canvas) {
        boolean z;
        boolean z2 = true;
        super.draw(canvas);
        ArrayList arrayList = this.H0;
        int size = arrayList.size();
        boolean z3 = false;
        for (int i = 0; i < size; i++) {
            ((l6c) arrayList.get(i)).h(canvas, this);
        }
        EdgeEffect edgeEffect = this.a1;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.z0 ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((float) ((-getHeight()) + paddingBottom), 0.0f);
            EdgeEffect edgeEffect2 = this.a1;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.b1;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.z0) {
                canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.b1;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.c1;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.z0 ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate((float) paddingTop, (float) (-width));
            EdgeEffect edgeEffect6 = this.c1;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.d1;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.z0) {
                canvas.translate((float) (getPaddingRight() + (-getWidth())), (float) (getPaddingBottom() + (-getHeight())));
            } else {
                canvas.translate((float) (-getWidth()), (float) (-getHeight()));
            }
            EdgeEffect edgeEffect8 = this.d1;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z3 = true;
            }
            z |= z3;
            canvas.restoreToCount(save4);
        }
        if (z || this.e1 == null || arrayList.size() <= 0 || !this.e1.f()) {
            z2 = z;
        }
        if (z2) {
            WeakHashMap weakHashMap = eaf.a;
            postInvalidateOnAnimation();
        }
    }

    public final boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    public final void e0() {
        this.X0++;
    }

    public final void f0(boolean z) {
        int i;
        AccessibilityManager accessibilityManager;
        int i2 = this.X0 - 1;
        this.X0 = i2;
        if (i2 >= 1) {
            return;
        }
        if (!P1 || i2 >= 0) {
            this.X0 = 0;
            if (z) {
                int i3 = this.R0;
                this.R0 = 0;
                if (!(i3 == 0 || (accessibilityManager = this.T0) == null || !accessibilityManager.isEnabled())) {
                    AccessibilityEvent obtain = AccessibilityEvent.obtain();
                    obtain.setEventType(2048);
                    obtain.setContentChangeTypes(i3);
                    sendAccessibilityEventUnchecked(obtain);
                }
                ArrayList arrayList = this.J1;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    b7c b7c = (b7c) arrayList.get(size);
                    if (b7c.a.getParent() == this && !b7c.w() && (i = b7c.F0) != -1) {
                        WeakHashMap weakHashMap = eaf.a;
                        b7c.a.setImportantForAccessibility(i);
                        b7c.F0 = -1;
                    }
                }
                arrayList.clear();
                return;
            }
            return;
        }
        throw new IllegalStateException(th2.g(this, new StringBuilder("layout or scroll counter cannot go below zero.Some calls are not matching")));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0162, code lost:
        if (r7 > 0) goto L_0x0193;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0179, code lost:
        if (r5 > 0) goto L_0x0193;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x017c, code lost:
        if (r7 < 0) goto L_0x0193;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x017f, code lost:
        if (r5 < 0) goto L_0x0193;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0187, code lost:
        if ((r5 * r6) <= 0) goto L_0x0192;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x018f, code lost:
        if ((r5 * r6) >= 0) goto L_0x0192;
     */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0196  */
    /* JADX WARNING: Removed duplicated region for block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0077  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View focusSearch(android.view.View r17, int r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            androidx.recyclerview.widget.a r3 = r0.F0
            r3.getClass()
            f6c r3 = r0.E0
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L_0x0021
            androidx.recyclerview.widget.a r3 = r0.F0
            if (r3 == 0) goto L_0x0021
            boolean r3 = r16.Z()
            if (r3 != 0) goto L_0x0021
            boolean r3 = r0.P0
            if (r3 != 0) goto L_0x0021
            r3 = r4
            goto L_0x0022
        L_0x0021:
            r3 = r5
        L_0x0022:
            android.view.FocusFinder r6 = android.view.FocusFinder.getInstance()
            x6c r7 = r0.w1
            r8 = 17
            r10 = 33
            r12 = 0
            r13 = 2
            if (r3 == 0) goto L_0x0093
            if (r2 == r13) goto L_0x0034
            if (r2 != r4) goto L_0x0093
        L_0x0034:
            androidx.recyclerview.widget.a r3 = r0.F0
            boolean r3 = r3.f()
            if (r3 == 0) goto L_0x004a
            if (r2 != r13) goto L_0x0041
            r3 = 130(0x82, float:1.82E-43)
            goto L_0x0042
        L_0x0041:
            r3 = r10
        L_0x0042:
            android.view.View r3 = r6.findNextFocus(r0, r1, r3)
            if (r3 != 0) goto L_0x004a
            r3 = r4
            goto L_0x004b
        L_0x004a:
            r3 = r5
        L_0x004b:
            if (r3 != 0) goto L_0x0075
            androidx.recyclerview.widget.a r14 = r0.F0
            boolean r14 = r14.e()
            if (r14 == 0) goto L_0x0075
            androidx.recyclerview.widget.a r3 = r0.F0
            int r3 = r3.H()
            if (r3 != r4) goto L_0x005f
            r3 = r4
            goto L_0x0060
        L_0x005f:
            r3 = r5
        L_0x0060:
            if (r2 != r13) goto L_0x0064
            r14 = r4
            goto L_0x0065
        L_0x0064:
            r14 = r5
        L_0x0065:
            r3 = r3 ^ r14
            if (r3 == 0) goto L_0x006b
            r3 = 66
            goto L_0x006c
        L_0x006b:
            r3 = r8
        L_0x006c:
            android.view.View r3 = r6.findNextFocus(r0, r1, r3)
            if (r3 != 0) goto L_0x0074
            r3 = r4
            goto L_0x0075
        L_0x0074:
            r3 = r5
        L_0x0075:
            if (r3 == 0) goto L_0x008e
            r16.s()
            android.view.View r3 = r16.I(r17)
            if (r3 != 0) goto L_0x0081
            return r12
        L_0x0081:
            r16.C0()
            androidx.recyclerview.widget.a r3 = r0.F0
            t6c r14 = r0.c
            r3.Y(r1, r2, r14, r7)
            r0.D0(r5)
        L_0x008e:
            android.view.View r3 = r6.findNextFocus(r0, r1, r2)
            goto L_0x00b5
        L_0x0093:
            android.view.View r6 = r6.findNextFocus(r0, r1, r2)
            if (r6 != 0) goto L_0x00b4
            if (r3 == 0) goto L_0x00b4
            r16.s()
            android.view.View r3 = r16.I(r17)
            if (r3 != 0) goto L_0x00a5
            return r12
        L_0x00a5:
            r16.C0()
            androidx.recyclerview.widget.a r3 = r0.F0
            t6c r6 = r0.c
            android.view.View r3 = r3.Y(r1, r2, r6, r7)
            r0.D0(r5)
            goto L_0x00b5
        L_0x00b4:
            r3 = r6
        L_0x00b5:
            if (r3 == 0) goto L_0x00cc
            boolean r6 = r3.hasFocusable()
            if (r6 != 0) goto L_0x00cc
            android.view.View r4 = r16.getFocusedChild()
            if (r4 != 0) goto L_0x00c8
            android.view.View r0 = super.focusSearch(r17, r18)
            return r0
        L_0x00c8:
            r0.t0(r3, r12)
            return r1
        L_0x00cc:
            if (r3 == 0) goto L_0x0192
            if (r3 == r0) goto L_0x0192
            if (r3 != r1) goto L_0x00d4
            goto L_0x0192
        L_0x00d4:
            android.view.View r6 = r0.I(r3)
            if (r6 != 0) goto L_0x00dd
            r4 = r5
            goto L_0x0193
        L_0x00dd:
            if (r1 != 0) goto L_0x00e1
            goto L_0x0193
        L_0x00e1:
            android.view.View r6 = r16.I(r17)
            if (r6 != 0) goto L_0x00e9
            goto L_0x0193
        L_0x00e9:
            int r6 = r17.getWidth()
            int r7 = r17.getHeight()
            android.graphics.Rect r12 = r0.B0
            r12.set(r5, r5, r6, r7)
            int r6 = r3.getWidth()
            int r7 = r3.getHeight()
            android.graphics.Rect r14 = r0.C0
            r14.set(r5, r5, r6, r7)
            r0.offsetDescendantRectToMyCoords(r1, r12)
            r0.offsetDescendantRectToMyCoords(r3, r14)
            androidx.recyclerview.widget.a r6 = r0.F0
            int r6 = r6.H()
            if (r6 != r4) goto L_0x0113
            r6 = -1
            goto L_0x0114
        L_0x0113:
            r6 = r4
        L_0x0114:
            int r15 = r12.left
            int r5 = r14.left
            if (r15 < r5) goto L_0x011e
            int r7 = r12.right
            if (r7 > r5) goto L_0x0126
        L_0x011e:
            int r7 = r12.right
            int r11 = r14.right
            if (r7 >= r11) goto L_0x0126
            r5 = r4
            goto L_0x0133
        L_0x0126:
            int r7 = r12.right
            int r11 = r14.right
            if (r7 > r11) goto L_0x012e
            if (r15 < r11) goto L_0x0132
        L_0x012e:
            if (r15 <= r5) goto L_0x0132
            r5 = -1
            goto L_0x0133
        L_0x0132:
            r5 = 0
        L_0x0133:
            int r7 = r12.top
            int r11 = r14.top
            if (r7 < r11) goto L_0x013d
            int r15 = r12.bottom
            if (r15 > r11) goto L_0x0145
        L_0x013d:
            int r15 = r12.bottom
            int r9 = r14.bottom
            if (r15 >= r9) goto L_0x0145
            r7 = r4
            goto L_0x0152
        L_0x0145:
            int r9 = r12.bottom
            int r12 = r14.bottom
            if (r9 > r12) goto L_0x014d
            if (r7 < r12) goto L_0x0151
        L_0x014d:
            if (r7 <= r11) goto L_0x0151
            r7 = -1
            goto L_0x0152
        L_0x0151:
            r7 = 0
        L_0x0152:
            if (r2 == r4) goto L_0x018a
            if (r2 == r13) goto L_0x0182
            if (r2 == r8) goto L_0x017f
            if (r2 == r10) goto L_0x017c
            r6 = 66
            if (r2 == r6) goto L_0x0179
            r6 = 130(0x82, float:1.82E-43)
            if (r2 != r6) goto L_0x0165
            if (r7 <= 0) goto L_0x0192
            goto L_0x0193
        L_0x0165:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Invalid direction: "
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r0 = th2.g(r0, r3)
            r1.<init>(r0)
            throw r1
        L_0x0179:
            if (r5 <= 0) goto L_0x0192
            goto L_0x0193
        L_0x017c:
            if (r7 >= 0) goto L_0x0192
            goto L_0x0193
        L_0x017f:
            if (r5 >= 0) goto L_0x0192
            goto L_0x0193
        L_0x0182:
            if (r7 > 0) goto L_0x0193
            if (r7 != 0) goto L_0x0192
            int r5 = r5 * r6
            if (r5 <= 0) goto L_0x0192
            goto L_0x0193
        L_0x018a:
            if (r7 < 0) goto L_0x0193
            if (r7 != 0) goto L_0x0192
            int r5 = r5 * r6
            if (r5 >= 0) goto L_0x0192
            goto L_0x0193
        L_0x0192:
            r4 = 0
        L_0x0193:
            if (r4 == 0) goto L_0x0196
            goto L_0x019a
        L_0x0196:
            android.view.View r3 = super.focusSearch(r17, r18)
        L_0x019a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    public final void g0(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.g1) {
            int i = actionIndex == 0 ? 1 : 0;
            this.g1 = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.k1 = x;
            this.i1 = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.l1 = y;
            this.j1 = y;
        }
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        a aVar = this.F0;
        if (aVar != null) {
            return aVar.s();
        }
        throw new IllegalStateException(th2.g(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        a aVar = this.F0;
        if (aVar != null) {
            return aVar.t(getContext(), attributeSet);
        }
        throw new IllegalStateException(th2.g(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public f6c getAdapter() {
        return this.E0;
    }

    public int getBaseline() {
        a aVar = this.F0;
        if (aVar == null) {
            return super.getBaseline();
        }
        aVar.getClass();
        return -1;
    }

    public final int getChildDrawingOrder(int i, int i2) {
        return super.getChildDrawingOrder(i, i2);
    }

    public boolean getClipToPadding() {
        return this.z0;
    }

    public d7c getCompatAccessibilityDelegate() {
        return this.D1;
    }

    public j6c getEdgeEffectFactory() {
        return this.Z0;
    }

    public k6c getItemAnimator() {
        return this.e1;
    }

    public int getItemDecorationCount() {
        return this.H0.size();
    }

    public a getLayoutManager() {
        return this.F0;
    }

    public int getMaxFlingVelocity() {
        return this.p1;
    }

    public int getMinFlingVelocity() {
        return this.o1;
    }

    public long getNanoTime() {
        if (V1) {
            return System.nanoTime();
        }
        return 0;
    }

    public p6c getOnFlingListener() {
        return this.n1;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.s1;
    }

    public b getRecycledViewPool() {
        return this.c.c();
    }

    public int getScrollState() {
        return this.f1;
    }

    public void h0() {
    }

    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().g(0);
    }

    public final void i(b7c b7c) {
        View view = b7c.a;
        boolean z = view.getParent() == this;
        this.c.k(T(view));
        if (b7c.r()) {
            this.x0.d(view, -1, view.getLayoutParams(), true);
        } else if (!z) {
            this.x0.a(-1, view, true);
        } else {
            ope ope = this.x0;
            int indexOfChild = ((u41) ope.o).a.indexOfChild(view);
            if (indexOfChild >= 0) {
                ((xw2) ope.X).b0(indexOfChild);
                ope.E(view);
                return;
            }
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    public final void i0() {
        if (!this.C1 && this.K0) {
            WeakHashMap weakHashMap = eaf.a;
            postOnAnimation(this.K1);
            this.C1 = true;
        }
    }

    public final boolean isAttachedToWindow() {
        return this.K0;
    }

    public final boolean isLayoutSuppressed() {
        return this.P0;
    }

    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().d;
    }

    public final void j(l6c l6c) {
        a aVar = this.F0;
        if (aVar != null) {
            aVar.c("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.H0;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(l6c);
        b0();
        requestLayout();
    }

    public final void j0() {
        boolean z;
        boolean z2 = false;
        if (this.V0) {
            b9 b9Var = this.w0;
            b9Var.N((ArrayList) b9Var.o);
            b9Var.N((ArrayList) b9Var.X);
            b9Var.b = 0;
            if (this.W0) {
                this.F0.e0();
            }
        }
        if (this.e1 == null || !this.F0.K0()) {
            this.w0.m();
        } else {
            this.w0.L();
        }
        boolean z3 = this.z1 || this.A1;
        boolean z4 = this.M0 && this.e1 != null && ((z = this.V0) || z3 || this.F0.f) && (!z || this.E0.b);
        x6c x6c = this.w1;
        x6c.k = z4;
        if (z4 && z3 && !this.V0 && this.e1 != null && this.F0.K0()) {
            z2 = true;
        }
        x6c.l = z2;
    }

    public final void k(o6c o6c) {
        if (this.U0 == null) {
            this.U0 = new ArrayList();
        }
        this.U0.add(o6c);
    }

    public final void k0(boolean z) {
        this.W0 = z | this.W0;
        this.V0 = true;
        int D = this.x0.D();
        for (int i = 0; i < D; i++) {
            b7c U = U(this.x0.C(i));
            if (U != null && !U.w()) {
                U.f(6);
            }
        }
        b0();
        t6c t6c = this.c;
        int size = t6c.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            b7c b7c = (b7c) t6c.c.get(i2);
            if (b7c != null) {
                b7c.f(6);
                b7c.f(LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
            }
        }
        f6c f6c = t6c.h.E0;
        if (f6c == null || !f6c.b) {
            t6c.e();
        }
    }

    public final void l(q6c q6c) {
        this.I0.add(q6c);
    }

    public final void l0(b7c b7c, ms msVar) {
        b7c.y0 &= -8193;
        boolean z = this.w1.i;
        v2b v2b = this.y0;
        if (z && b7c.s() && !b7c.p() && !b7c.w()) {
            ((uq7) v2b.c).f(Q(b7c), b7c);
        }
        kgd kgd = (kgd) v2b.b;
        maf maf = (maf) kgd.get(b7c);
        if (maf == null) {
            maf = maf.a();
            kgd.put(b7c, maf);
        }
        maf.b = msVar;
        maf.a |= 4;
    }

    public void m(r6c r6c) {
        if (this.y1 == null) {
            this.y1 = new ArrayList();
        }
        this.y1.add(r6c);
    }

    public final int m0(int i, float f) {
        float height = f / ((float) getHeight());
        float width = ((float) i) / ((float) getWidth());
        EdgeEffect edgeEffect = this.a1;
        float f2 = 0.0f;
        if (edgeEffect == null || pa2.p(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.c1;
            if (!(edgeEffect2 == null || pa2.p(edgeEffect2) == 0.0f)) {
                if (canScrollHorizontally(1)) {
                    this.c1.onRelease();
                } else {
                    float D = pa2.D(this.c1, width, height);
                    if (pa2.p(this.c1) == 0.0f) {
                        this.c1.onRelease();
                    }
                    f2 = D;
                }
                invalidate();
            }
        } else {
            if (canScrollHorizontally(-1)) {
                this.a1.onRelease();
            } else {
                float f3 = -pa2.D(this.a1, -width, 1.0f - height);
                if (pa2.p(this.a1) == 0.0f) {
                    this.a1.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        }
        return Math.round(f2 * ((float) getWidth()));
    }

    public final void n(String str) {
        if (Z()) {
            if (str == null) {
                throw new IllegalStateException(th2.g(this, new StringBuilder("Cannot call this method while RecyclerView is computing a layout or scrolling")));
            }
            throw new IllegalStateException(str);
        } else if (this.Y0 > 0) {
            new IllegalStateException(th2.g(this, new StringBuilder(BuildConfig.FLAVOR)));
        }
    }

    public final int n0(int i, float f) {
        float width = f / ((float) getWidth());
        float height = ((float) i) / ((float) getHeight());
        EdgeEffect edgeEffect = this.b1;
        float f2 = 0.0f;
        if (edgeEffect == null || pa2.p(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.d1;
            if (!(edgeEffect2 == null || pa2.p(edgeEffect2) == 0.0f)) {
                if (canScrollVertically(1)) {
                    this.d1.onRelease();
                } else {
                    float D = pa2.D(this.d1, height, 1.0f - width);
                    if (pa2.p(this.d1) == 0.0f) {
                        this.d1.onRelease();
                    }
                    f2 = D;
                }
                invalidate();
            }
        } else {
            if (canScrollVertically(-1)) {
                this.b1.onRelease();
            } else {
                float f3 = -pa2.D(this.b1, -height, width);
                if (pa2.p(this.b1) == 0.0f) {
                    this.b1.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        }
        return Math.round(f2 * ((float) getHeight()));
    }

    public final void o0() {
        k6c k6c = this.e1;
        if (k6c != null) {
            k6c.e();
        }
        a aVar = this.F0;
        if (aVar != null) {
            aVar.r0(this.c);
            this.F0.s0(this.c);
        }
        t6c t6c = this.c;
        t6c.a.clear();
        t6c.e();
    }

    /* JADX WARNING: type inference failed for: r1v5, types: [p66, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0063, code lost:
        if (r1 >= 30.0f) goto L_0x0068;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.X0 = r0
            r1 = 1
            r5.K0 = r1
            boolean r2 = r5.M0
            if (r2 == 0) goto L_0x0015
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L_0x0015
            r2 = r1
            goto L_0x0016
        L_0x0015:
            r2 = r0
        L_0x0016:
            r5.M0 = r2
            t6c r2 = r5.c
            r2.d()
            androidx.recyclerview.widget.a r2 = r5.F0
            if (r2 == 0) goto L_0x0026
            r2.g = r1
            r2.W(r5)
        L_0x0026:
            r5.C1 = r0
            boolean r0 = V1
            if (r0 == 0) goto L_0x0091
            java.lang.ThreadLocal r0 = defpackage.p66.X
            java.lang.Object r1 = r0.get()
            p66 r1 = (defpackage.p66) r1
            r5.u1 = r1
            if (r1 != 0) goto L_0x0074
            p66 r1 = new p66
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.a = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.o = r2
            r5.u1 = r1
            java.util.WeakHashMap r1 = defpackage.eaf.a
            android.view.Display r1 = r5.getDisplay()
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L_0x0066
            if (r1 == 0) goto L_0x0066
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L_0x0066
            goto L_0x0068
        L_0x0066:
            r1 = 1114636288(0x42700000, float:60.0)
        L_0x0068:
            p66 r2 = r5.u1
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.c = r3
            r0.set(r2)
        L_0x0074:
            p66 r0 = r5.u1
            r0.getClass()
            boolean r1 = P1
            java.util.ArrayList r0 = r0.a
            if (r1 == 0) goto L_0x008e
            boolean r1 = r0.contains(r5)
            if (r1 != 0) goto L_0x0086
            goto L_0x008e
        L_0x0086:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "RecyclerView already present in worker list!"
            r5.<init>(r0)
            throw r5
        L_0x008e:
            r0.add(r5)
        L_0x0091:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    public void onDetachedFromWindow() {
        p66 p66;
        super.onDetachedFromWindow();
        k6c k6c = this.e1;
        if (k6c != null) {
            k6c.e();
        }
        E0();
        int i = 0;
        this.K0 = false;
        a aVar = this.F0;
        if (aVar != null) {
            aVar.g = false;
            aVar.X(this);
        }
        this.J1.clear();
        removeCallbacks(this.K1);
        this.y0.getClass();
        do {
        } while (maf.d.h() != null);
        t6c t6c = this.c;
        for (int i2 = 0; i2 < t6c.c.size(); i2++) {
            l0b.a(((b7c) t6c.c.get(i2)).a);
        }
        f6c f6c = t6c.h.E0;
        b bVar = t6c.g;
        if (bVar != null) {
            bVar.detachForPoolingContainer(f6c, false);
        }
        int i3 = l0b.a;
        while (i < getChildCount()) {
            int i4 = i + 1;
            View childAt = getChildAt(i);
            if (childAt != null) {
                int i5 = l0b.a;
                m0b m0b = (m0b) childAt.getTag(i5);
                if (m0b == null) {
                    m0b = new m0b();
                    childAt.setTag(i5, m0b);
                }
                ArrayList arrayList = m0b.a;
                int A = p23.A(arrayList);
                if (-1 >= A) {
                    i = i4;
                } else {
                    hr1.r(arrayList.get(A));
                    throw null;
                }
            } else {
                throw new IndexOutOfBoundsException();
            }
        }
        if (V1 && (p66 = this.u1) != null) {
            boolean remove = p66.a.remove(this);
            if (!P1 || remove) {
                this.u1 = null;
                return;
            }
            throw new IllegalStateException("RecyclerView removal failed!");
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.H0;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((l6c) arrayList.get(i)).g(canvas, this, this.w1);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00dd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onGenericMotionEvent(android.view.MotionEvent r17) {
        /*
            r16 = this;
            r6 = r16
            r7 = r17
            androidx.recyclerview.widget.a r0 = r6.F0
            r8 = 0
            if (r0 != 0) goto L_0x000a
            return r8
        L_0x000a:
            boolean r0 = r6.P0
            if (r0 == 0) goto L_0x000f
            return r8
        L_0x000f:
            int r0 = r17.getAction()
            r1 = 8
            if (r0 != r1) goto L_0x00ef
            int r0 = r17.getSource()
            r0 = r0 & 2
            r1 = 0
            if (r0 == 0) goto L_0x0042
            androidx.recyclerview.widget.a r0 = r6.F0
            boolean r0 = r0.f()
            if (r0 == 0) goto L_0x0030
            r0 = 9
            float r0 = r7.getAxisValue(r0)
            float r0 = -r0
            goto L_0x0031
        L_0x0030:
            r0 = r1
        L_0x0031:
            androidx.recyclerview.widget.a r2 = r6.F0
            boolean r2 = r2.e()
            if (r2 == 0) goto L_0x0040
            r2 = 10
            float r2 = r7.getAxisValue(r2)
            goto L_0x0068
        L_0x0040:
            r2 = r1
            goto L_0x0068
        L_0x0042:
            int r0 = r17.getSource()
            r2 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r2
            if (r0 == 0) goto L_0x0066
            r0 = 26
            float r0 = r7.getAxisValue(r0)
            androidx.recyclerview.widget.a r2 = r6.F0
            boolean r2 = r2.f()
            if (r2 == 0) goto L_0x005b
            float r0 = -r0
            goto L_0x0040
        L_0x005b:
            androidx.recyclerview.widget.a r2 = r6.F0
            boolean r2 = r2.e()
            if (r2 == 0) goto L_0x0066
            r2 = r0
            r0 = r1
            goto L_0x0068
        L_0x0066:
            r0 = r1
            r2 = r0
        L_0x0068:
            int r3 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r3 != 0) goto L_0x0070
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 == 0) goto L_0x00ef
        L_0x0070:
            float r1 = r6.q1
            float r2 = r2 * r1
            int r1 = (int) r2
            float r2 = r6.r1
            float r0 = r0 * r2
            int r0 = (int) r0
            androidx.recyclerview.widget.a r2 = r6.F0
            if (r2 != 0) goto L_0x007e
            goto L_0x00ef
        L_0x007e:
            boolean r3 = r6.P0
            if (r3 == 0) goto L_0x0084
            goto L_0x00ef
        L_0x0084:
            int[] r9 = r6.I1
            r9[r8] = r8
            r10 = 1
            r9[r10] = r8
            boolean r11 = r2.e()
            androidx.recyclerview.widget.a r2 = r6.F0
            boolean r12 = r2.f()
            if (r12 == 0) goto L_0x009a
            r2 = r11 | 2
            goto L_0x009b
        L_0x009a:
            r2 = r11
        L_0x009b:
            float r3 = r17.getY()
            float r4 = r17.getX()
            int r3 = r6.m0(r1, r3)
            int r13 = r1 - r3
            int r1 = r6.n0(r0, r4)
            int r14 = r0 - r1
            gh9 r0 = r16.getScrollingChildHelper()
            r15 = 1
            r0.h(r2, r15)
            if (r11 == 0) goto L_0x00bb
            r1 = r13
            goto L_0x00bc
        L_0x00bb:
            r1 = r8
        L_0x00bc:
            if (r12 == 0) goto L_0x00c0
            r2 = r14
            goto L_0x00c1
        L_0x00c0:
            r2 = r8
        L_0x00c1:
            int[] r4 = r6.I1
            int[] r5 = r6.G1
            r0 = r16
            r3 = r15
            boolean r0 = r0.y(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x00d4
            r0 = r9[r8]
            int r13 = r13 - r0
            r0 = r9[r10]
            int r14 = r14 - r0
        L_0x00d4:
            if (r11 == 0) goto L_0x00d8
            r0 = r13
            goto L_0x00d9
        L_0x00d8:
            r0 = r8
        L_0x00d9:
            if (r12 == 0) goto L_0x00dd
            r1 = r14
            goto L_0x00de
        L_0x00dd:
            r1 = r8
        L_0x00de:
            r6.v0(r0, r1, r7, r15)
            p66 r0 = r6.u1
            if (r0 == 0) goto L_0x00ec
            if (r13 != 0) goto L_0x00e9
            if (r14 == 0) goto L_0x00ec
        L_0x00e9:
            r0.a(r6, r13, r14)
        L_0x00ec:
            r6.a(r15)
        L_0x00ef:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        if (this.P0) {
            return false;
        }
        this.J0 = null;
        if (J(motionEvent)) {
            u0();
            setScrollState(0);
            return true;
        }
        a aVar = this.F0;
        if (aVar == null) {
            return false;
        }
        boolean e = aVar.e();
        boolean f = this.F0.f();
        if (this.h1 == null) {
            this.h1 = VelocityTracker.obtain();
        }
        this.h1.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.Q0) {
                this.Q0 = false;
            }
            this.g1 = motionEvent.getPointerId(0);
            int x = (int) (motionEvent.getX() + 0.5f);
            this.k1 = x;
            this.i1 = x;
            int y = (int) (motionEvent.getY() + 0.5f);
            this.l1 = y;
            this.j1 = y;
            EdgeEffect edgeEffect = this.a1;
            if (edgeEffect == null || pa2.p(edgeEffect) == 0.0f || canScrollHorizontally(-1)) {
                z = false;
            } else {
                pa2.D(this.a1, 0.0f, 1.0f - (motionEvent.getY() / ((float) getHeight())));
                z = true;
            }
            EdgeEffect edgeEffect2 = this.c1;
            if (!(edgeEffect2 == null || pa2.p(edgeEffect2) == 0.0f || canScrollHorizontally(1))) {
                pa2.D(this.c1, 0.0f, motionEvent.getY() / ((float) getHeight()));
                z = true;
            }
            EdgeEffect edgeEffect3 = this.b1;
            if (!(edgeEffect3 == null || pa2.p(edgeEffect3) == 0.0f || canScrollVertically(-1))) {
                pa2.D(this.b1, 0.0f, motionEvent.getX() / ((float) getWidth()));
                z = true;
            }
            EdgeEffect edgeEffect4 = this.d1;
            if (!(edgeEffect4 == null || pa2.p(edgeEffect4) == 0.0f || canScrollVertically(1))) {
                pa2.D(this.d1, 0.0f, 1.0f - (motionEvent.getX() / ((float) getWidth())));
                z = true;
            }
            if (z || this.f1 == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                a(1);
            }
            int[] iArr = this.H1;
            iArr[1] = 0;
            iArr[0] = 0;
            if (f) {
                e |= true;
            }
            getScrollingChildHelper().h(e ? 1 : 0, 0);
        } else if (actionMasked == 1) {
            this.h1.clear();
            a(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.g1);
            if (findPointerIndex < 0) {
                return false;
            }
            int x2 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y2 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.f1 != 1) {
                int i = x2 - this.i1;
                int i2 = y2 - this.j1;
                if (!e || Math.abs(i) <= this.m1) {
                    z2 = false;
                } else {
                    this.k1 = x2;
                    z2 = true;
                }
                if (f && Math.abs(i2) > this.m1) {
                    this.l1 = y2;
                    z2 = true;
                }
                if (z2) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            u0();
            setScrollState(0);
        } else if (actionMasked == 5) {
            this.g1 = motionEvent.getPointerId(actionIndex);
            int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.k1 = x3;
            this.i1 = x3;
            int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.l1 = y3;
            this.j1 = y3;
        } else if (actionMasked == 6) {
            g0(motionEvent);
        }
        return this.f1 == 1;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Trace.beginSection("RV OnLayout");
        v();
        Trace.endSection();
        this.M0 = true;
    }

    public void onMeasure(int i, int i2) {
        a aVar = this.F0;
        if (aVar == null) {
            t(i, i2);
            return;
        }
        boolean Q = aVar.Q();
        boolean z = false;
        x6c x6c = this.w1;
        if (Q) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.F0.b.t(i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            this.L1 = z;
            if (!z && this.E0 != null) {
                if (x6c.e == 1) {
                    w();
                }
                this.F0.B0(i, i2);
                x6c.j = true;
                x();
                this.F0.D0(i, i2);
                if (this.F0.G0()) {
                    this.F0.B0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    x6c.j = true;
                    x();
                    this.F0.D0(i, i2);
                }
                this.M1 = getMeasuredWidth();
                this.N1 = getMeasuredHeight();
            }
        } else if (this.L0) {
            this.F0.b.t(i, i2);
        } else {
            if (this.S0) {
                C0();
                e0();
                j0();
                f0(true);
                if (x6c.l) {
                    x6c.h = true;
                } else {
                    this.w0.m();
                    x6c.h = false;
                }
                this.S0 = false;
                D0(false);
            } else if (x6c.l) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            f6c f6c = this.E0;
            if (f6c != null) {
                x6c.f = f6c.j();
            } else {
                x6c.f = 0;
            }
            C0();
            this.F0.b.t(i, i2);
            D0(false);
            x6c.h = false;
        }
    }

    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (Z()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof v6c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        v6c v6c = (v6c) parcelable;
        this.o = v6c;
        super.onRestoreInstanceState(v6c.a);
        requestLayout();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [v6c, android.os.Parcelable, z] */
    public final Parcelable onSaveInstanceState() {
        ? zVar = new z(super.onSaveInstanceState());
        v6c v6c = this.o;
        if (v6c != null) {
            zVar.c = v6c.c;
        } else {
            a aVar = this.F0;
            if (aVar != null) {
                zVar.c = aVar.m0();
            } else {
                zVar.c = null;
            }
        }
        return zVar;
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3 || i2 != i4) {
            this.d1 = null;
            this.b1 = null;
            this.c1 = null;
            this.a1 = null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00fb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r21) {
        /*
            r20 = this;
            r6 = r20
            r7 = r21
            boolean r0 = r6.P0
            r8 = 0
            if (r0 != 0) goto L_0x01fa
            boolean r0 = r6.Q0
            if (r0 == 0) goto L_0x000f
            goto L_0x01fa
        L_0x000f:
            q6c r0 = r6.J0
            r1 = 3
            r9 = 1
            if (r0 != 0) goto L_0x0022
            int r0 = r21.getAction()
            if (r0 != 0) goto L_0x001d
            r0 = r8
            goto L_0x0031
        L_0x001d:
            boolean r0 = r20.J(r21)
            goto L_0x0031
        L_0x0022:
            r0.a(r7)
            int r0 = r21.getAction()
            if (r0 == r1) goto L_0x002d
            if (r0 != r9) goto L_0x0030
        L_0x002d:
            r0 = 0
            r6.J0 = r0
        L_0x0030:
            r0 = r9
        L_0x0031:
            if (r0 == 0) goto L_0x003a
            r20.u0()
            r6.setScrollState(r8)
            return r9
        L_0x003a:
            androidx.recyclerview.widget.a r0 = r6.F0
            if (r0 != 0) goto L_0x003f
            return r8
        L_0x003f:
            boolean r10 = r0.e()
            androidx.recyclerview.widget.a r0 = r6.F0
            boolean r11 = r0.f()
            android.view.VelocityTracker r0 = r6.h1
            if (r0 != 0) goto L_0x0053
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r6.h1 = r0
        L_0x0053:
            int r0 = r21.getActionMasked()
            int r2 = r21.getActionIndex()
            int[] r12 = r6.H1
            if (r0 != 0) goto L_0x0063
            r12[r9] = r8
            r12[r8] = r8
        L_0x0063:
            android.view.MotionEvent r13 = android.view.MotionEvent.obtain(r21)
            r3 = r12[r8]
            float r3 = (float) r3
            r4 = r12[r9]
            float r4 = (float) r4
            r13.offsetLocation(r3, r4)
            r3 = 1056964608(0x3f000000, float:0.5)
            if (r0 == 0) goto L_0x01cc
            if (r0 == r9) goto L_0x018b
            r4 = 2
            if (r0 == r4) goto L_0x00ac
            if (r0 == r1) goto L_0x00a4
            r1 = 5
            if (r0 == r1) goto L_0x0088
            r1 = 6
            if (r0 == r1) goto L_0x0083
            goto L_0x01f1
        L_0x0083:
            r20.g0(r21)
            goto L_0x01f1
        L_0x0088:
            int r0 = r7.getPointerId(r2)
            r6.g1 = r0
            float r0 = r7.getX(r2)
            float r0 = r0 + r3
            int r0 = (int) r0
            r6.k1 = r0
            r6.i1 = r0
            float r0 = r7.getY(r2)
            float r0 = r0 + r3
            int r0 = (int) r0
            r6.l1 = r0
            r6.j1 = r0
            goto L_0x01f1
        L_0x00a4:
            r20.u0()
            r6.setScrollState(r8)
            goto L_0x01f1
        L_0x00ac:
            int r0 = r6.g1
            int r0 = r7.findPointerIndex(r0)
            if (r0 >= 0) goto L_0x00b5
            return r8
        L_0x00b5:
            float r1 = r7.getX(r0)
            float r1 = r1 + r3
            int r14 = (int) r1
            float r0 = r7.getY(r0)
            float r0 = r0 + r3
            int r15 = (int) r0
            int r0 = r6.k1
            int r0 = r0 - r14
            int r1 = r6.l1
            int r1 = r1 - r15
            int r2 = r6.f1
            if (r2 == r9) goto L_0x00fe
            if (r10 == 0) goto L_0x00e2
            if (r0 <= 0) goto L_0x00d7
            int r2 = r6.m1
            int r0 = r0 - r2
            int r0 = java.lang.Math.max(r8, r0)
            goto L_0x00de
        L_0x00d7:
            int r2 = r6.m1
            int r0 = r0 + r2
            int r0 = java.lang.Math.min(r8, r0)
        L_0x00de:
            if (r0 == 0) goto L_0x00e2
            r2 = r9
            goto L_0x00e3
        L_0x00e2:
            r2 = r8
        L_0x00e3:
            if (r11 == 0) goto L_0x00f9
            if (r1 <= 0) goto L_0x00ef
            int r3 = r6.m1
            int r1 = r1 - r3
            int r1 = java.lang.Math.max(r8, r1)
            goto L_0x00f6
        L_0x00ef:
            int r3 = r6.m1
            int r1 = r1 + r3
            int r1 = java.lang.Math.min(r8, r1)
        L_0x00f6:
            if (r1 == 0) goto L_0x00f9
            r2 = r9
        L_0x00f9:
            if (r2 == 0) goto L_0x00fe
            r6.setScrollState(r9)
        L_0x00fe:
            int r2 = r6.f1
            if (r2 != r9) goto L_0x01f1
            int[] r5 = r6.I1
            r5[r8] = r8
            r5[r9] = r8
            float r2 = r21.getY()
            int r2 = r6.m0(r0, r2)
            int r16 = r0 - r2
            float r0 = r21.getX()
            int r0 = r6.n0(r1, r0)
            int r17 = r1 - r0
            if (r10 == 0) goto L_0x0121
            r1 = r16
            goto L_0x0122
        L_0x0121:
            r1 = r8
        L_0x0122:
            if (r11 == 0) goto L_0x0127
            r2 = r17
            goto L_0x0128
        L_0x0127:
            r2 = r8
        L_0x0128:
            r3 = 0
            int[] r4 = r6.I1
            int[] r0 = r6.G1
            r18 = r0
            r0 = r20
            r19 = r5
            r5 = r18
            boolean r0 = r0.y(r1, r2, r3, r4, r5)
            int[] r1 = r6.G1
            if (r0 == 0) goto L_0x015a
            r0 = r19[r8]
            int r16 = r16 - r0
            r0 = r19[r9]
            int r17 = r17 - r0
            r0 = r12[r8]
            r2 = r1[r8]
            int r0 = r0 + r2
            r12[r8] = r0
            r0 = r12[r9]
            r2 = r1[r9]
            int r0 = r0 + r2
            r12[r9] = r0
            android.view.ViewParent r0 = r20.getParent()
            r0.requestDisallowInterceptTouchEvent(r9)
        L_0x015a:
            r0 = r16
            r2 = r17
            r3 = r1[r8]
            int r14 = r14 - r3
            r6.k1 = r14
            r1 = r1[r9]
            int r15 = r15 - r1
            r6.l1 = r15
            if (r10 == 0) goto L_0x016c
            r1 = r0
            goto L_0x016d
        L_0x016c:
            r1 = r8
        L_0x016d:
            if (r11 == 0) goto L_0x0171
            r3 = r2
            goto L_0x0172
        L_0x0171:
            r3 = r8
        L_0x0172:
            boolean r1 = r6.v0(r1, r3, r7, r8)
            if (r1 == 0) goto L_0x017f
            android.view.ViewParent r1 = r20.getParent()
            r1.requestDisallowInterceptTouchEvent(r9)
        L_0x017f:
            p66 r1 = r6.u1
            if (r1 == 0) goto L_0x01f1
            if (r0 != 0) goto L_0x0187
            if (r2 == 0) goto L_0x01f1
        L_0x0187:
            r1.a(r6, r0, r2)
            goto L_0x01f1
        L_0x018b:
            android.view.VelocityTracker r0 = r6.h1
            r0.addMovement(r13)
            android.view.VelocityTracker r0 = r6.h1
            int r1 = r6.p1
            float r1 = (float) r1
            r2 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r2, r1)
            r0 = 0
            if (r10 == 0) goto L_0x01a7
            android.view.VelocityTracker r1 = r6.h1
            int r2 = r6.g1
            float r1 = r1.getXVelocity(r2)
            float r1 = -r1
            goto L_0x01a8
        L_0x01a7:
            r1 = r0
        L_0x01a8:
            if (r11 == 0) goto L_0x01b4
            android.view.VelocityTracker r2 = r6.h1
            int r3 = r6.g1
            float r2 = r2.getYVelocity(r3)
            float r2 = -r2
            goto L_0x01b5
        L_0x01b4:
            r2 = r0
        L_0x01b5:
            int r3 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r3 != 0) goto L_0x01bd
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x01c5
        L_0x01bd:
            int r0 = (int) r1
            int r1 = (int) r2
            boolean r0 = r6.O(r0, r1)
            if (r0 != 0) goto L_0x01c8
        L_0x01c5:
            r6.setScrollState(r8)
        L_0x01c8:
            r20.u0()
            goto L_0x01f6
        L_0x01cc:
            int r0 = r7.getPointerId(r8)
            r6.g1 = r0
            float r0 = r21.getX()
            float r0 = r0 + r3
            int r0 = (int) r0
            r6.k1 = r0
            r6.i1 = r0
            float r0 = r21.getY()
            float r0 = r0 + r3
            int r0 = (int) r0
            r6.l1 = r0
            r6.j1 = r0
            if (r11 == 0) goto L_0x01ea
            r10 = r10 | 2
        L_0x01ea:
            gh9 r0 = r20.getScrollingChildHelper()
            r0.h(r10, r8)
        L_0x01f1:
            android.view.VelocityTracker r0 = r6.h1
            r0.addMovement(r13)
        L_0x01f6:
            r13.recycle()
            return r9
        L_0x01fa:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p() {
        int D = this.x0.D();
        for (int i = 0; i < D; i++) {
            b7c U = U(this.x0.C(i));
            if (!U.w()) {
                U.o = -1;
                U.Z = -1;
            }
        }
        t6c t6c = this.c;
        int size = t6c.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            b7c b7c = (b7c) t6c.c.get(i2);
            b7c.o = -1;
            b7c.Z = -1;
        }
        int size2 = t6c.a.size();
        for (int i3 = 0; i3 < size2; i3++) {
            b7c b7c2 = (b7c) t6c.a.get(i3);
            b7c2.o = -1;
            b7c2.Z = -1;
        }
        ArrayList arrayList = t6c.b;
        if (arrayList != null) {
            int size3 = arrayList.size();
            for (int i4 = 0; i4 < size3; i4++) {
                b7c b7c3 = (b7c) t6c.b.get(i4);
                b7c3.o = -1;
                b7c3.Z = -1;
            }
        }
    }

    public final void p0(l6c l6c) {
        a aVar = this.F0;
        if (aVar != null) {
            aVar.c("Cannot remove item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.H0;
        arrayList.remove(l6c);
        if (arrayList.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        b0();
        requestLayout();
    }

    public final void q(int i, int i2) {
        boolean z;
        EdgeEffect edgeEffect = this.a1;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            z = false;
        } else {
            this.a1.onRelease();
            z = this.a1.isFinished();
        }
        EdgeEffect edgeEffect2 = this.c1;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.c1.onRelease();
            z |= this.c1.isFinished();
        }
        EdgeEffect edgeEffect3 = this.b1;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.b1.onRelease();
            z |= this.b1.isFinished();
        }
        EdgeEffect edgeEffect4 = this.d1;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.d1.onRelease();
            z |= this.d1.isFinished();
        }
        if (z) {
            WeakHashMap weakHashMap = eaf.a;
            postInvalidateOnAnimation();
        }
    }

    public final void q0(o6c o6c) {
        ArrayList arrayList = this.U0;
        if (arrayList != null) {
            arrayList.remove(o6c);
        }
    }

    public final void r0(q6c q6c) {
        this.I0.remove(q6c);
        if (this.J0 == q6c) {
            this.J0 = null;
        }
    }

    public final void removeDetachedView(View view, boolean z) {
        b7c U = U(view);
        if (U != null) {
            if (U.r()) {
                U.y0 &= -257;
            } else if (!U.w()) {
                StringBuilder sb = new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(U);
                throw new IllegalArgumentException(th2.g(this, sb));
            }
        } else if (P1) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            throw new IllegalArgumentException(th2.g(this, sb2));
        }
        view.clearAnimation();
        u(view);
        super.removeDetachedView(view, z);
    }

    public final void requestChildFocus(View view, View view2) {
        hd7 hd7 = this.F0.e;
        if ((hd7 == null || !hd7.e) && !Z() && view2 != null) {
            t0(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.F0.v0(this, view, rect, z, false);
    }

    public final void requestDisallowInterceptTouchEvent(boolean z) {
        ArrayList arrayList = this.I0;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((q6c) arrayList.get(i)).e(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public final void requestLayout() {
        if (this.N0 != 0 || this.P0) {
            this.O0 = true;
        } else {
            super.requestLayout();
        }
    }

    public final void s() {
        if (!this.M0 || this.V0) {
            Trace.beginSection("RV FullInvalidate");
            v();
            Trace.endSection();
        } else if (this.w0.D()) {
            b9 b9Var = this.w0;
            int i = b9Var.b;
            if ((i & 4) != 0 && (i & 11) == 0) {
                Trace.beginSection("RV PartialInvalidate");
                C0();
                e0();
                this.w0.L();
                if (!this.O0) {
                    int z = this.x0.z();
                    int i2 = 0;
                    while (true) {
                        if (i2 < z) {
                            b7c U = U(this.x0.y(i2));
                            if (U != null && !U.w() && U.s()) {
                                v();
                                break;
                            }
                            i2++;
                        } else {
                            this.w0.l();
                            break;
                        }
                    }
                }
                D0(true);
                f0(true);
                Trace.endSection();
            } else if (b9Var.D()) {
                Trace.beginSection("RV FullInvalidate");
                v();
                Trace.endSection();
            }
        }
    }

    public void s0(r6c r6c) {
        ArrayList arrayList = this.y1;
        if (arrayList != null) {
            arrayList.remove(r6c);
        }
    }

    public final void scrollBy(int i, int i2) {
        a aVar = this.F0;
        if (aVar != null && !this.P0) {
            boolean e = aVar.e();
            boolean f = this.F0.f();
            if (e || f) {
                if (!e) {
                    i = 0;
                }
                if (!f) {
                    i2 = 0;
                }
                v0(i, i2, (MotionEvent) null, 0);
            }
        }
    }

    public final void scrollTo(int i, int i2) {
    }

    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (Z()) {
            int i = 0;
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            if (contentChangeTypes != 0) {
                i = contentChangeTypes;
            }
            this.R0 |= i;
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(d7c d7c) {
        this.D1 = d7c;
        eaf.j(this, d7c);
    }

    public void setAdapter(f6c f6c) {
        setLayoutFrozen(false);
        y0(f6c, false, true);
        k0(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(i6c i6c) {
        if (i6c != null) {
            setChildrenDrawingOrderEnabled(i6c != null);
        }
    }

    public void setClipToPadding(boolean z) {
        if (z != this.z0) {
            this.d1 = null;
            this.b1 = null;
            this.c1 = null;
            this.a1 = null;
        }
        this.z0 = z;
        super.setClipToPadding(z);
        if (this.M0) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(j6c j6c) {
        j6c.getClass();
        this.Z0 = j6c;
        this.d1 = null;
        this.b1 = null;
        this.c1 = null;
        this.a1 = null;
    }

    public void setHasFixedSize(boolean z) {
        this.L0 = z;
    }

    public void setItemAnimator(k6c k6c) {
        k6c k6c2 = this.e1;
        if (k6c2 != null) {
            k6c2.e();
            this.e1.a = null;
        }
        this.e1 = k6c;
        if (k6c != null) {
            k6c.a = this.B1;
        }
    }

    public void setItemViewCacheSize(int i) {
        t6c t6c = this.c;
        t6c.e = i;
        t6c.l();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    public void setLayoutManager(a aVar) {
        u41 u41;
        if (aVar != this.F0) {
            E0();
            if (this.F0 != null) {
                k6c k6c = this.e1;
                if (k6c != null) {
                    k6c.e();
                }
                this.F0.r0(this.c);
                this.F0.s0(this.c);
                t6c t6c = this.c;
                t6c.a.clear();
                t6c.e();
                if (this.K0) {
                    a aVar2 = this.F0;
                    aVar2.g = false;
                    aVar2.X(this);
                }
                this.F0.E0((RecyclerView) null);
                this.F0 = null;
            } else {
                t6c t6c2 = this.c;
                t6c2.a.clear();
                t6c2.e();
            }
            ope ope = this.x0;
            ((xw2) ope.X).a0();
            ArrayList arrayList = (ArrayList) ope.Y;
            int size = arrayList.size() - 1;
            while (true) {
                u41 = (u41) ope.o;
                if (size < 0) {
                    break;
                }
                u41.getClass();
                b7c U = U((View) arrayList.get(size));
                if (U != null) {
                    int i = U.E0;
                    RecyclerView recyclerView = u41.a;
                    if (recyclerView.Z()) {
                        U.F0 = i;
                        recyclerView.J1.add(U);
                    } else {
                        WeakHashMap weakHashMap = eaf.a;
                        U.a.setImportantForAccessibility(i);
                    }
                    U.E0 = 0;
                }
                arrayList.remove(size);
                size--;
            }
            RecyclerView recyclerView2 = u41.a;
            int childCount = recyclerView2.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = recyclerView2.getChildAt(i2);
                recyclerView2.u(childAt);
                childAt.clearAnimation();
            }
            recyclerView2.removeAllViews();
            this.F0 = aVar;
            if (aVar != null) {
                if (aVar.b == null) {
                    aVar.E0(this);
                    if (this.K0) {
                        a aVar3 = this.F0;
                        aVar3.g = true;
                        aVar3.W(this);
                    }
                } else {
                    StringBuilder sb = new StringBuilder("LayoutManager ");
                    sb.append(aVar);
                    sb.append(" is already attached to a RecyclerView:");
                    throw new IllegalArgumentException(th2.g(aVar.b, sb));
                }
            }
            this.c.l();
            requestLayout();
        }
    }

    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition((LayoutTransition) null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    public void setNestedScrollingEnabled(boolean z) {
        gh9 scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.d) {
            WeakHashMap weakHashMap = eaf.a;
            t9f.z(scrollingChildHelper.c);
        }
        scrollingChildHelper.d = z;
    }

    public void setOnFlingListener(p6c p6c) {
        this.n1 = p6c;
    }

    @Deprecated
    public void setOnScrollListener(r6c r6c) {
        this.x1 = r6c;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.s1 = z;
    }

    public void setRecycledViewPool(b bVar) {
        t6c t6c = this.c;
        RecyclerView recyclerView = t6c.h;
        f6c f6c = recyclerView.E0;
        b bVar2 = t6c.g;
        if (bVar2 != null) {
            bVar2.detachForPoolingContainer(f6c, false);
        }
        b bVar3 = t6c.g;
        if (bVar3 != null) {
            bVar3.detach();
        }
        t6c.g = bVar;
        if (!(bVar == null || recyclerView.getAdapter() == null)) {
            t6c.g.attach();
        }
        t6c.d();
    }

    @Deprecated
    public void setRecyclerListener(u6c u6c) {
    }

    public void setScrollState(int i) {
        hd7 hd7;
        if (i != this.f1) {
            if (Q1) {
                new Exception();
            }
            this.f1 = i;
            if (i != 2) {
                a7c a7c = this.t1;
                a7c.Z.removeCallbacks(a7c);
                a7c.c.abortAnimation();
                a aVar = this.F0;
                if (!(aVar == null || (hd7 = aVar.e) == null)) {
                    hd7.k();
                }
            }
            a aVar2 = this.F0;
            if (aVar2 != null) {
                aVar2.n0(i);
            }
            h0();
            r6c r6c = this.x1;
            if (r6c != null) {
                r6c.a(this, i);
            }
            ArrayList arrayList = this.y1;
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ((r6c) this.y1.get(size)).a(this, i);
                }
            }
        }
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 1) {
            this.m1 = viewConfiguration.getScaledTouchSlop();
        } else {
            this.m1 = viewConfiguration.getScaledPagingTouchSlop();
        }
    }

    public void setViewCacheExtension(z6c z6c) {
        this.c.getClass();
    }

    public final boolean startNestedScroll(int i) {
        return getScrollingChildHelper().h(i, 0);
    }

    public final void stopNestedScroll() {
        getScrollingChildHelper().i(0);
    }

    public final void suppressLayout(boolean z) {
        if (z != this.P0) {
            n("Do not suppressLayout in layout or scroll");
            if (!z) {
                this.P0 = false;
                if (!(!this.O0 || this.F0 == null || this.E0 == null)) {
                    requestLayout();
                }
                this.O0 = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.P0 = true;
            this.Q0 = true;
            E0();
        }
    }

    public final void t(int i, int i2) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = eaf.a;
        setMeasuredDimension(a.h(i, paddingRight, getMinimumWidth()), a.h(i2, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    public final void t0(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.B0;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof n6c) {
            n6c n6c = (n6c) layoutParams;
            if (!n6c.c) {
                int i = rect.left;
                Rect rect2 = n6c.b;
                rect.left = i - rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        this.F0.v0(this, view, this.B0, !this.M0, view2 == null);
    }

    public final void u(View view) {
        b7c U = U(view);
        f6c f6c = this.E0;
        if (!(f6c == null || U == null)) {
            f6c.x(U);
        }
        ArrayList arrayList = this.U0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((o6c) this.U0.get(size)).b(view);
            }
        }
    }

    public final void u0() {
        VelocityTracker velocityTracker = this.h1;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean z = false;
        a(0);
        EdgeEffect edgeEffect = this.a1;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = this.a1.isFinished();
        }
        EdgeEffect edgeEffect2 = this.b1;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z |= this.b1.isFinished();
        }
        EdgeEffect edgeEffect3 = this.c1;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z |= this.c1.isFinished();
        }
        EdgeEffect edgeEffect4 = this.d1;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z |= this.d1.isFinished();
        }
        if (z) {
            WeakHashMap weakHashMap = eaf.a;
            postInvalidateOnAnimation();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0319, code lost:
        if (((java.util.ArrayList) r0.x0.Y).contains(getFocusedChild()) == false) goto L_0x03a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0343, code lost:
        if (r3.hasFocusable() != false) goto L_0x0346;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0346, code lost:
        r6 = r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void v() {
        /*
            r17 = this;
            r0 = r17
            f6c r1 = r0.E0
            if (r1 != 0) goto L_0x0007
            return
        L_0x0007:
            androidx.recyclerview.widget.a r1 = r0.F0
            if (r1 != 0) goto L_0x000c
            return
        L_0x000c:
            x6c r1 = r0.w1
            r2 = 0
            r1.j = r2
            boolean r3 = r0.L1
            r4 = 1
            if (r3 == 0) goto L_0x0028
            int r3 = r0.M1
            int r5 = r17.getWidth()
            if (r3 != r5) goto L_0x0026
            int r3 = r0.N1
            int r5 = r17.getHeight()
            if (r3 == r5) goto L_0x0028
        L_0x0026:
            r3 = r4
            goto L_0x0029
        L_0x0028:
            r3 = r2
        L_0x0029:
            r0.M1 = r2
            r0.N1 = r2
            r0.L1 = r2
            int r5 = r1.e
            if (r5 != r4) goto L_0x003f
            r17.w()
            androidx.recyclerview.widget.a r3 = r0.F0
            r3.A0(r0)
            r17.x()
            goto L_0x007b
        L_0x003f:
            b9 r5 = r0.w0
            java.lang.Object r6 = r5.X
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            boolean r6 = r6.isEmpty()
            if (r6 != 0) goto L_0x0056
            java.lang.Object r5 = r5.o
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x0056
            goto L_0x0073
        L_0x0056:
            if (r3 != 0) goto L_0x0073
            androidx.recyclerview.widget.a r3 = r0.F0
            int r3 = r3.n
            int r5 = r17.getWidth()
            if (r3 != r5) goto L_0x0073
            androidx.recyclerview.widget.a r3 = r0.F0
            int r3 = r3.o
            int r5 = r17.getHeight()
            if (r3 == r5) goto L_0x006d
            goto L_0x0073
        L_0x006d:
            androidx.recyclerview.widget.a r3 = r0.F0
            r3.A0(r0)
            goto L_0x007b
        L_0x0073:
            androidx.recyclerview.widget.a r3 = r0.F0
            r3.A0(r0)
            r17.x()
        L_0x007b:
            r3 = 4
            r1.a(r3)
            r17.C0()
            r17.e0()
            r1.e = r4
            boolean r5 = r1.k
            r6 = 0
            v2b r7 = r0.y0
            if (r5 == 0) goto L_0x0277
            ope r5 = r0.x0
            int r5 = r5.z()
            int r5 = r5 - r4
        L_0x0095:
            if (r5 < 0) goto L_0x01a3
            ope r8 = r0.x0
            android.view.View r8 = r8.y(r5)
            b7c r8 = U(r8)
            boolean r9 = r8.w()
            if (r9 == 0) goto L_0x00a9
            goto L_0x019f
        L_0x00a9:
            long r9 = r0.Q(r8)
            k6c r11 = r0.e1
            r11.getClass()
            ms r11 = new ms
            r12 = 7
            r11.<init>(r12)
            r11.c(r8)
            java.lang.Object r12 = r7.c
            uq7 r12 = (defpackage.uq7) r12
            java.lang.Object r12 = r12.c(r9)
            b7c r12 = (defpackage.b7c) r12
            if (r12 == 0) goto L_0x019c
            boolean r13 = r12.w()
            if (r13 != 0) goto L_0x019c
            java.lang.Object r13 = r7.b
            kgd r13 = (defpackage.kgd) r13
            java.lang.Object r14 = r13.get(r12)
            maf r14 = (defpackage.maf) r14
            if (r14 == 0) goto L_0x00e0
            int r14 = r14.a
            r14 = r14 & r4
            if (r14 == 0) goto L_0x00e0
            r14 = r4
            goto L_0x00e1
        L_0x00e0:
            r14 = r2
        L_0x00e1:
            java.lang.Object r13 = r13.get(r8)
            maf r13 = (defpackage.maf) r13
            if (r13 == 0) goto L_0x00f0
            int r13 = r13.a
            r13 = r13 & r4
            if (r13 == 0) goto L_0x00f0
            r13 = r4
            goto L_0x00f1
        L_0x00f0:
            r13 = r2
        L_0x00f1:
            if (r14 == 0) goto L_0x00fa
            if (r12 != r8) goto L_0x00fa
            r7.c(r8, r11)
            goto L_0x019f
        L_0x00fa:
            ms r15 = r7.o(r12, r3)
            r7.c(r8, r11)
            r11 = 8
            ms r11 = r7.o(r8, r11)
            if (r15 != 0) goto L_0x0172
            ope r11 = r0.x0
            int r11 = r11.z()
            r13 = r2
        L_0x0110:
            if (r13 >= r11) goto L_0x0168
            ope r14 = r0.x0
            android.view.View r14 = r14.y(r13)
            b7c r14 = U(r14)
            if (r14 != r8) goto L_0x011f
            goto L_0x0165
        L_0x011f:
            long r15 = r0.Q(r14)
            int r15 = (r15 > r9 ? 1 : (r15 == r9 ? 0 : -1))
            if (r15 != 0) goto L_0x0165
            f6c r1 = r0.E0
            java.lang.String r2 = " \n View Holder 2:"
            if (r1 == 0) goto L_0x014b
            boolean r1 = r1.b
            if (r1 == 0) goto L_0x014b
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:"
            r3.<init>(r4)
            r3.append(r14)
            r3.append(r2)
            r3.append(r8)
            java.lang.String r0 = th2.g(r0, r3)
            r1.<init>(r0)
            throw r1
        L_0x014b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:"
            r3.<init>(r4)
            r3.append(r14)
            r3.append(r2)
            r3.append(r8)
            java.lang.String r0 = th2.g(r0, r3)
            r1.<init>(r0)
            throw r1
        L_0x0165:
            int r13 = r13 + 1
            goto L_0x0110
        L_0x0168:
            java.util.Objects.toString(r12)
            java.util.Objects.toString(r8)
            r17.F()
            goto L_0x019f
        L_0x0172:
            r12.v(r2)
            if (r14 == 0) goto L_0x017a
            r0.i(r12)
        L_0x017a:
            if (r12 == r8) goto L_0x0190
            if (r13 == 0) goto L_0x0181
            r0.i(r8)
        L_0x0181:
            r12.w0 = r8
            r0.i(r12)
            t6c r9 = r0.c
            r9.k(r12)
            r8.v(r2)
            r8.x0 = r12
        L_0x0190:
            k6c r9 = r0.e1
            boolean r8 = r9.a(r12, r8, r15, r11)
            if (r8 == 0) goto L_0x019f
            r17.i0()
            goto L_0x019f
        L_0x019c:
            r7.c(r8, r11)
        L_0x019f:
            int r5 = r5 + -1
            goto L_0x0095
        L_0x01a3:
            java.lang.Object r3 = r7.b
            kgd r3 = (defpackage.kgd) r3
            int r5 = r3.c
            int r5 = r5 - r4
        L_0x01aa:
            if (r5 < 0) goto L_0x0277
            java.lang.Object r8 = r3.f(r5)
            r10 = r8
            b7c r10 = (defpackage.b7c) r10
            java.lang.Object r8 = r3.g(r5)
            maf r8 = (defpackage.maf) r8
            int r9 = r8.a
            r11 = r9 & 3
            r12 = 3
            lv1 r13 = r0.O1
            if (r11 != r12) goto L_0x01d1
            java.lang.Object r9 = r13.b
            androidx.recyclerview.widget.RecyclerView r9 = (androidx.recyclerview.widget.RecyclerView) r9
            androidx.recyclerview.widget.a r11 = r9.F0
            android.view.View r10 = r10.a
            t6c r9 = r9.c
            r11.t0(r10, r9)
            goto L_0x0266
        L_0x01d1:
            r11 = r9 & 1
            if (r11 == 0) goto L_0x01ef
            ms r9 = r8.b
            if (r9 != 0) goto L_0x01e8
            java.lang.Object r9 = r13.b
            androidx.recyclerview.widget.RecyclerView r9 = (androidx.recyclerview.widget.RecyclerView) r9
            androidx.recyclerview.widget.a r11 = r9.F0
            android.view.View r10 = r10.a
            t6c r9 = r9.c
            r11.t0(r10, r9)
            goto L_0x0266
        L_0x01e8:
            ms r11 = r8.c
            r13.G(r10, r9, r11)
            goto L_0x0266
        L_0x01ef:
            r11 = r9 & 14
            r12 = 14
            if (r11 != r12) goto L_0x01fe
            ms r9 = r8.b
            ms r11 = r8.c
            r13.F(r10, r9, r11)
            goto L_0x0266
        L_0x01fe:
            r11 = r9 & 12
            r12 = 12
            if (r11 != r12) goto L_0x0250
            ms r9 = r8.b
            ms r11 = r8.c
            r13.getClass()
            r10.v(r2)
            java.lang.Object r12 = r13.b
            r15 = r12
            androidx.recyclerview.widget.RecyclerView r15 = (androidx.recyclerview.widget.RecyclerView) r15
            boolean r12 = r15.V0
            if (r12 == 0) goto L_0x0223
            k6c r12 = r15.e1
            boolean r9 = r12.a(r10, r10, r9, r11)
            if (r9 == 0) goto L_0x024e
            r15.i0()
            goto L_0x024e
        L_0x0223:
            k6c r12 = r15.e1
            w84 r12 = (defpackage.w84) r12
            r12.getClass()
            int r13 = r9.b
            int r14 = r11.b
            if (r13 != r14) goto L_0x023c
            int r4 = r9.c
            int r2 = r11.c
            if (r4 == r2) goto L_0x0237
            goto L_0x023c
        L_0x0237:
            r12.c(r10)
            r2 = 0
            goto L_0x0249
        L_0x023c:
            int r2 = r9.c
            int r4 = r11.c
            r9 = r12
            r11 = r13
            r12 = r2
            r13 = r14
            r14 = r4
            boolean r2 = r9.g(r10, r11, r12, r13, r14)
        L_0x0249:
            if (r2 == 0) goto L_0x024e
            r15.i0()
        L_0x024e:
            r2 = 0
            goto L_0x0266
        L_0x0250:
            r2 = r9 & 4
            if (r2 == 0) goto L_0x025a
            ms r2 = r8.b
            r13.G(r10, r2, r6)
            goto L_0x024e
        L_0x025a:
            r2 = r9 & 8
            if (r2 == 0) goto L_0x024e
            ms r2 = r8.b
            ms r4 = r8.c
            r13.F(r10, r2, r4)
            goto L_0x024e
        L_0x0266:
            r8.a = r2
            r8.b = r6
            r8.c = r6
            o0b r2 = defpackage.maf.d
            r2.g(r8)
            int r5 = r5 + -1
            r2 = 0
            r4 = 1
            goto L_0x01aa
        L_0x0277:
            androidx.recyclerview.widget.a r2 = r0.F0
            t6c r3 = r0.c
            r2.s0(r3)
            int r2 = r1.f
            r1.c = r2
            r2 = 0
            r0.V0 = r2
            r0.W0 = r2
            r1.k = r2
            r1.l = r2
            androidx.recyclerview.widget.a r3 = r0.F0
            r3.f = r2
            t6c r3 = r0.c
            java.util.ArrayList r3 = r3.b
            if (r3 == 0) goto L_0x0298
            r3.clear()
        L_0x0298:
            androidx.recyclerview.widget.a r3 = r0.F0
            boolean r4 = r3.k
            if (r4 == 0) goto L_0x02a7
            r3.j = r2
            r3.k = r2
            t6c r3 = r0.c
            r3.l()
        L_0x02a7:
            androidx.recyclerview.widget.a r3 = r0.F0
            r3.k0(r1)
            r3 = 1
            r0.f0(r3)
            r0.D0(r2)
            java.lang.Object r3 = r7.b
            kgd r3 = (defpackage.kgd) r3
            r3.clear()
            java.lang.Object r3 = r7.c
            uq7 r3 = (defpackage.uq7) r3
            r3.a()
            int[] r3 = r0.E1
            r4 = r3[r2]
            r5 = 1
            r7 = r3[r5]
            r0.K(r3)
            r8 = r3[r2]
            if (r8 != r4) goto L_0x02d6
            r3 = r3[r5]
            if (r3 == r7) goto L_0x02d4
            goto L_0x02d6
        L_0x02d4:
            r3 = r2
            goto L_0x02d7
        L_0x02d6:
            r3 = 1
        L_0x02d7:
            if (r3 == 0) goto L_0x02dc
            r0.A(r2, r2)
        L_0x02dc:
            boolean r3 = r0.s1
            r4 = -1
            r7 = -1
            if (r3 == 0) goto L_0x03a4
            f6c r3 = r0.E0
            if (r3 == 0) goto L_0x03a4
            boolean r3 = r17.hasFocus()
            if (r3 == 0) goto L_0x03a4
            int r3 = r17.getDescendantFocusability()
            r8 = 393216(0x60000, float:5.51013E-40)
            if (r3 == r8) goto L_0x03a4
            int r3 = r17.getDescendantFocusability()
            r8 = 131072(0x20000, float:1.83671E-40)
            if (r3 != r8) goto L_0x0305
            boolean r3 = r17.isFocused()
            if (r3 == 0) goto L_0x0305
            goto L_0x03a4
        L_0x0305:
            boolean r3 = r17.isFocused()
            if (r3 != 0) goto L_0x031d
            android.view.View r3 = r17.getFocusedChild()
            ope r8 = r0.x0
            java.lang.Object r8 = r8.Y
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            boolean r3 = r8.contains(r3)
            if (r3 != 0) goto L_0x031d
            goto L_0x03a4
        L_0x031d:
            long r8 = r1.n
            int r3 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r3 == 0) goto L_0x032e
            f6c r3 = r0.E0
            boolean r3 = r3.b
            if (r3 == 0) goto L_0x032e
            b7c r3 = r0.N(r8)
            goto L_0x032f
        L_0x032e:
            r3 = r6
        L_0x032f:
            if (r3 == 0) goto L_0x0348
            ope r8 = r0.x0
            java.lang.Object r8 = r8.Y
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            android.view.View r3 = r3.a
            boolean r8 = r8.contains(r3)
            if (r8 != 0) goto L_0x0348
            boolean r8 = r3.hasFocusable()
            if (r8 != 0) goto L_0x0346
            goto L_0x0348
        L_0x0346:
            r6 = r3
            goto L_0x038b
        L_0x0348:
            ope r3 = r0.x0
            int r3 = r3.z()
            if (r3 <= 0) goto L_0x038b
            int r3 = r1.m
            if (r3 == r7) goto L_0x0355
            r2 = r3
        L_0x0355:
            int r3 = r1.b()
            r8 = r2
        L_0x035a:
            if (r8 >= r3) goto L_0x0370
            b7c r9 = r0.M(r8)
            if (r9 != 0) goto L_0x0363
            goto L_0x0370
        L_0x0363:
            android.view.View r9 = r9.a
            boolean r10 = r9.hasFocusable()
            if (r10 == 0) goto L_0x036d
            r6 = r9
            goto L_0x038b
        L_0x036d:
            int r8 = r8 + 1
            goto L_0x035a
        L_0x0370:
            int r2 = java.lang.Math.min(r3, r2)
            r3 = 1
            int r2 = r2 - r3
        L_0x0376:
            if (r2 < 0) goto L_0x038b
            b7c r3 = r0.M(r2)
            if (r3 != 0) goto L_0x037f
            goto L_0x038b
        L_0x037f:
            android.view.View r3 = r3.a
            boolean r8 = r3.hasFocusable()
            if (r8 == 0) goto L_0x0388
            goto L_0x0346
        L_0x0388:
            int r2 = r2 + -1
            goto L_0x0376
        L_0x038b:
            if (r6 == 0) goto L_0x03a4
            int r0 = r1.o
            long r2 = (long) r0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x03a1
            android.view.View r0 = r6.findViewById(r0)
            if (r0 == 0) goto L_0x03a1
            boolean r2 = r0.isFocusable()
            if (r2 == 0) goto L_0x03a1
            r6 = r0
        L_0x03a1:
            r6.requestFocus()
        L_0x03a4:
            r1.n = r4
            r1.m = r7
            r1.o = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.v():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00ec  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean v0(int r19, int r20, android.view.MotionEvent r21, int r22) {
        /*
            r18 = this;
            r8 = r18
            r9 = r19
            r10 = r20
            r18.s()
            f6c r0 = r8.E0
            int[] r11 = r8.I1
            r12 = 1
            r13 = 0
            if (r0 == 0) goto L_0x0027
            r11[r13] = r13
            r11[r12] = r13
            r8.w0(r9, r10, r11)
            r0 = r11[r13]
            r1 = r11[r12]
            int r2 = r9 - r0
            int r3 = r10 - r1
            r14 = r0
            r15 = r1
            r16 = r2
            r17 = r3
            goto L_0x002d
        L_0x0027:
            r14 = r13
            r15 = r14
            r16 = r15
            r17 = r16
        L_0x002d:
            java.util.ArrayList r0 = r8.H0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0038
            r18.invalidate()
        L_0x0038:
            r11[r13] = r13
            r11[r12] = r13
            int[] r5 = r8.G1
            r0 = r18
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r17
            r6 = r22
            r7 = r11
            r0.z(r1, r2, r3, r4, r5, r6, r7)
            r0 = r11[r13]
            int r1 = r16 - r0
            r2 = r11[r12]
            int r3 = r17 - r2
            if (r0 != 0) goto L_0x005b
            if (r2 == 0) goto L_0x0059
            goto L_0x005b
        L_0x0059:
            r0 = r13
            goto L_0x005c
        L_0x005b:
            r0 = r12
        L_0x005c:
            int r2 = r8.k1
            int[] r4 = r8.G1
            r5 = r4[r13]
            int r2 = r2 - r5
            r8.k1 = r2
            int r2 = r8.l1
            r4 = r4[r12]
            int r2 = r2 - r4
            r8.l1 = r2
            int[] r2 = r8.H1
            r6 = r2[r13]
            int r6 = r6 + r5
            r2[r13] = r6
            r5 = r2[r12]
            int r5 = r5 + r4
            r2[r12] = r5
            int r2 = r18.getOverScrollMode()
            r4 = 2
            if (r2 == r4) goto L_0x0119
            if (r21 == 0) goto L_0x0116
            int r2 = r21.getSource()
            r4 = 8194(0x2002, float:1.1482E-41)
            r2 = r2 & r4
            if (r2 != r4) goto L_0x008c
            goto L_0x0116
        L_0x008c:
            float r2 = r21.getX()
            float r1 = (float) r1
            float r4 = r21.getY()
            float r3 = (float) r3
            r5 = 0
            int r6 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            r7 = 1065353216(0x3f800000, float:1.0)
            if (r6 >= 0) goto L_0x00b6
            r18.C()
            android.widget.EdgeEffect r6 = r8.a1
            float r11 = -r1
            int r12 = r18.getWidth()
            float r12 = (float) r12
            float r11 = r11 / r12
            int r12 = r18.getHeight()
            float r12 = (float) r12
            float r4 = r4 / r12
            float r4 = r7 - r4
            pa2.D(r6, r11, r4)
        L_0x00b4:
            r4 = 1
            goto L_0x00d1
        L_0x00b6:
            int r6 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r6 <= 0) goto L_0x00d0
            r18.D()
            android.widget.EdgeEffect r6 = r8.c1
            int r11 = r18.getWidth()
            float r11 = (float) r11
            float r11 = r1 / r11
            int r12 = r18.getHeight()
            float r12 = (float) r12
            float r4 = r4 / r12
            pa2.D(r6, r11, r4)
            goto L_0x00b4
        L_0x00d0:
            r4 = r13
        L_0x00d1:
            int r6 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r6 >= 0) goto L_0x00ec
            r18.E()
            android.widget.EdgeEffect r4 = r8.b1
            float r6 = -r3
            int r7 = r18.getHeight()
            float r7 = (float) r7
            float r6 = r6 / r7
            int r7 = r18.getWidth()
            float r7 = (float) r7
            float r2 = r2 / r7
            pa2.D(r4, r6, r2)
        L_0x00ea:
            r4 = 1
            goto L_0x0107
        L_0x00ec:
            int r6 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r6 <= 0) goto L_0x0107
            r18.B()
            android.widget.EdgeEffect r4 = r8.d1
            int r6 = r18.getHeight()
            float r6 = (float) r6
            float r6 = r3 / r6
            int r11 = r18.getWidth()
            float r11 = (float) r11
            float r2 = r2 / r11
            float r7 = r7 - r2
            pa2.D(r4, r6, r7)
            goto L_0x00ea
        L_0x0107:
            if (r4 != 0) goto L_0x0111
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0111
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L_0x0116
        L_0x0111:
            java.util.WeakHashMap r1 = defpackage.eaf.a
            r18.postInvalidateOnAnimation()
        L_0x0116:
            r18.q(r19, r20)
        L_0x0119:
            if (r14 != 0) goto L_0x011d
            if (r15 == 0) goto L_0x0120
        L_0x011d:
            r8.A(r14, r15)
        L_0x0120:
            boolean r1 = r18.awakenScrollBars()
            if (r1 != 0) goto L_0x0129
            r18.invalidate()
        L_0x0129:
            if (r0 != 0) goto L_0x0132
            if (r14 != 0) goto L_0x0132
            if (r15 == 0) goto L_0x0130
            goto L_0x0132
        L_0x0130:
            r12 = r13
            goto L_0x0133
        L_0x0132:
            r12 = 1
        L_0x0133:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.v0(int, int, android.view.MotionEvent, int):boolean");
    }

    public final void w() {
        maf maf;
        View I;
        x6c x6c = this.w1;
        x6c.a(1);
        G(x6c);
        x6c.j = false;
        C0();
        v2b v2b = this.y0;
        ((kgd) v2b.b).clear();
        uq7 uq7 = (uq7) v2b.c;
        uq7.a();
        e0();
        j0();
        b7c b7c = null;
        View focusedChild = (!this.s1 || !hasFocus() || this.E0 == null) ? null : getFocusedChild();
        if (!(focusedChild == null || (I = I(focusedChild)) == null)) {
            b7c = T(I);
        }
        long j = -1;
        if (b7c == null) {
            x6c.n = -1;
            x6c.m = -1;
            x6c.o = -1;
        } else {
            if (this.E0.b) {
                j = b7c.X;
            }
            x6c.n = j;
            x6c.m = this.V0 ? -1 : b7c.p() ? b7c.o : b7c.g();
            View view = b7c.a;
            int id = view.getId();
            while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
                view = ((ViewGroup) view).getFocusedChild();
                if (view.getId() != -1) {
                    id = view.getId();
                }
            }
            x6c.o = id;
        }
        x6c.i = x6c.k && this.A1;
        this.A1 = false;
        this.z1 = false;
        x6c.h = x6c.l;
        x6c.f = this.E0.j();
        K(this.E1);
        boolean z = x6c.k;
        kgd kgd = (kgd) v2b.b;
        if (z) {
            int z2 = this.x0.z();
            for (int i = 0; i < z2; i++) {
                b7c U = U(this.x0.y(i));
                if (!U.w() && (!U.n() || this.E0.b)) {
                    k6c k6c = this.e1;
                    k6c.b(U);
                    U.j();
                    k6c.getClass();
                    ms msVar = new ms(7);
                    msVar.c(U);
                    maf maf2 = (maf) kgd.get(U);
                    if (maf2 == null) {
                        maf2 = maf.a();
                        kgd.put(U, maf2);
                    }
                    maf2.b = msVar;
                    maf2.a |= 4;
                    if (x6c.i && U.s() && !U.p() && !U.w() && !U.n()) {
                        uq7.f(Q(U), U);
                    }
                }
            }
        }
        if (x6c.l) {
            int D = this.x0.D();
            int i2 = 0;
            while (i2 < D) {
                b7c U2 = U(this.x0.C(i2));
                if (!P1 || U2.c != -1 || U2.p()) {
                    if (!U2.w() && U2.o == -1) {
                        U2.o = U2.c;
                    }
                    i2++;
                } else {
                    throw new IllegalStateException(th2.g(this, new StringBuilder("view holder cannot have position -1 unless it is removed")));
                }
            }
            boolean z3 = x6c.g;
            x6c.g = false;
            this.F0.j0(this.c, x6c);
            x6c.g = z3;
            for (int i3 = 0; i3 < this.x0.z(); i3++) {
                b7c U3 = U(this.x0.y(i3));
                if (!U3.w() && ((maf = (maf) kgd.get(U3)) == null || (maf.a & 4) == 0)) {
                    k6c.b(U3);
                    boolean k = U3.k(8192);
                    k6c k6c2 = this.e1;
                    U3.j();
                    k6c2.getClass();
                    ms msVar2 = new ms(7);
                    msVar2.c(U3);
                    if (k) {
                        l0(U3, msVar2);
                    } else {
                        maf maf3 = (maf) kgd.get(U3);
                        if (maf3 == null) {
                            maf3 = maf.a();
                            kgd.put(U3, maf3);
                        }
                        maf3.a |= 2;
                        maf3.b = msVar2;
                    }
                }
            }
            p();
        } else {
            p();
        }
        f0(true);
        D0(false);
        x6c.e = 2;
    }

    public final void w0(int i, int i2, int[] iArr) {
        b7c b7c;
        C0();
        e0();
        Trace.beginSection("RV Scroll");
        x6c x6c = this.w1;
        G(x6c);
        int x02 = i != 0 ? this.F0.x0(i, this.c, x6c) : 0;
        int z02 = i2 != 0 ? this.F0.z0(i2, this.c, x6c) : 0;
        Trace.endSection();
        int z = this.x0.z();
        for (int i3 = 0; i3 < z; i3++) {
            View y = this.x0.y(i3);
            b7c T = T(y);
            if (!(T == null || (b7c = T.x0) == null)) {
                int left = y.getLeft();
                int top = y.getTop();
                View view = b7c.a;
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        f0(true);
        D0(false);
        if (iArr != null) {
            iArr[0] = x02;
            iArr[1] = z02;
        }
    }

    public final void x() {
        C0();
        e0();
        x6c x6c = this.w1;
        x6c.a(6);
        this.w0.m();
        x6c.f = this.E0.j();
        x6c.d = 0;
        if (this.o != null) {
            f6c f6c = this.E0;
            int t = hr1.t(f6c.c);
            if (t == 1 ? f6c.j() > 0 : t != 2) {
                Parcelable parcelable = this.o.c;
                if (parcelable != null) {
                    this.F0.l0(parcelable);
                }
                this.o = null;
            }
        }
        x6c.h = false;
        this.F0.j0(this.c, x6c);
        x6c.g = false;
        x6c.k = x6c.k && this.e1 != null;
        x6c.e = 4;
        f0(true);
        D0(false);
    }

    public final void x0(int i) {
        if (!this.P0) {
            E0();
            a aVar = this.F0;
            if (aVar != null) {
                aVar.y0(i);
                awakenScrollBars();
            }
        }
    }

    public final boolean y(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i, i2, i3, iArr, iArr2);
    }

    public final void y0(f6c f6c, boolean z, boolean z2) {
        f6c f6c2 = this.E0;
        jw4 jw4 = this.b;
        if (f6c2 != null) {
            f6c2.B(jw4);
            this.E0.u(this);
        }
        if (!z || z2) {
            o0();
        }
        b9 b9Var = this.w0;
        b9Var.N((ArrayList) b9Var.o);
        b9Var.N((ArrayList) b9Var.X);
        b9Var.b = 0;
        f6c f6c3 = this.E0;
        this.E0 = f6c;
        if (f6c != null) {
            f6c.z(jw4);
            f6c.q(this);
        }
        a aVar = this.F0;
        if (aVar != null) {
            aVar.V();
        }
        t6c t6c = this.c;
        f6c f6c4 = this.E0;
        t6c.a.clear();
        t6c.e();
        b bVar = t6c.g;
        if (bVar != null) {
            bVar.detachForPoolingContainer(f6c3, true);
        }
        t6c.c().onAdapterChanged(f6c3, f6c4, z);
        t6c.d();
        this.w1.g = true;
    }

    public final void z(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        getScrollingChildHelper().e(i, i2, i3, i4, iArr, i5, iArr2);
    }

    public final boolean z0(EdgeEffect edgeEffect, int i, int i2) {
        if (i > 0) {
            return true;
        }
        float f = this.a * 0.015f;
        double log = Math.log((double) ((((float) Math.abs(-i)) * 0.35f) / f));
        double d = (double) S1;
        return ((float) (Math.exp((d / (d - 1.0d)) * log) * ((double) f))) < pa2.p(edgeEffect) * ((float) i2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: ry2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v38, resolved type: ry2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v39, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v40, resolved type: ry2} */
    /* JADX WARNING: type inference failed for: r1v6, types: [x6c, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v19, types: [u41, java.lang.Object] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public RecyclerView(android.content.Context r20, android.util.AttributeSet r21, int r22) {
        /*
            r19 = this;
            r10 = r19
            r11 = r20
            r12 = r21
            r13 = r22
            r19.<init>(r20, r21, r22)
            jw4 r0 = new jw4
            r1 = 6
            r0.<init>(r1, r10)
            r10.b = r0
            t6c r0 = new t6c
            r0.<init>(r10)
            r10.c = r0
            v2b r0 = new v2b
            r1 = 14
            r0.<init>(r1)
            r10.y0 = r0
            e6c r0 = new e6c
            r14 = 0
            r0.<init>(r10, r14)
            r10.A0 = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r10.B0 = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r10.C0 = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r10.D0 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r10.G0 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r10.H0 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r10.I0 = r0
            r10.N0 = r14
            r10.V0 = r14
            r10.W0 = r14
            r10.X0 = r14
            r10.Y0 = r14
            y6c r0 = Y1
            r10.Z0 = r0
            w84 r0 = new w84
            r0.<init>()
            r10.e1 = r0
            r10.f1 = r14
            r0 = -1
            r10.g1 = r0
            r1 = 1
            r10.q1 = r1
            r10.r1 = r1
            r15 = 1
            r10.s1 = r15
            a7c r1 = new a7c
            r1.<init>(r10)
            r10.t1 = r1
            boolean r1 = V1
            r9 = 0
            if (r1 == 0) goto L_0x0089
            ry2 r1 = new ry2
            r1.<init>()
            goto L_0x008a
        L_0x0089:
            r1 = r9
        L_0x008a:
            r10.v1 = r1
            x6c r1 = new x6c
            r1.<init>()
            r1.a = r0
            r1.c = r14
            r1.d = r14
            r1.e = r15
            r1.f = r14
            r1.g = r14
            r1.h = r14
            r1.i = r14
            r1.j = r14
            r1.k = r14
            r1.l = r14
            r10.w1 = r1
            r10.z1 = r14
            r10.A1 = r14
            za6 r1 = new za6
            r1.<init>((java.lang.Object) r10)
            r10.B1 = r1
            r10.C1 = r14
            r8 = 2
            int[] r2 = new int[r8]
            r10.E1 = r2
            int[] r2 = new int[r8]
            r10.G1 = r2
            int[] r2 = new int[r8]
            r10.H1 = r2
            int[] r2 = new int[r8]
            r10.I1 = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r10.J1 = r2
            e6c r2 = new e6c
            r2.<init>(r10, r15)
            r10.K1 = r2
            r10.M1 = r14
            r10.N1 = r14
            lv1 r2 = new lv1
            r3 = 27
            r2.<init>(r3, r10)
            r10.O1 = r2
            r10.setScrollContainer(r15)
            r10.setFocusableInTouchMode(r15)
            android.view.ViewConfiguration r2 = android.view.ViewConfiguration.get(r20)
            int r3 = r2.getScaledTouchSlop()
            r10.m1 = r3
            float r3 = defpackage.faf.a(r2)
            r10.q1 = r3
            float r3 = defpackage.faf.b(r2)
            r10.r1 = r3
            int r3 = r2.getScaledMinimumFlingVelocity()
            r10.o1 = r3
            int r2 = r2.getScaledMaximumFlingVelocity()
            r10.p1 = r2
            android.content.res.Resources r2 = r20.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            r3 = 1126170624(0x43200000, float:160.0)
            float r2 = r2 * r3
            r3 = 1136724797(0x43c10b3d, float:386.0878)
            float r2 = r2 * r3
            r3 = 1062668861(0x3f570a3d, float:0.84)
            float r2 = r2 * r3
            r10.a = r2
            int r2 = r19.getOverScrollMode()
            if (r2 != r8) goto L_0x0129
            r2 = r15
            goto L_0x012a
        L_0x0129:
            r2 = r14
        L_0x012a:
            r10.setWillNotDraw(r2)
            k6c r2 = r10.e1
            r2.a = r1
            b9 r1 = new b9
            ea6 r2 = new ea6
            r3 = 24
            r2.<init>(r3, r10)
            r1.<init>((defpackage.ea6) r2)
            r10.w0 = r1
            ope r1 = new ope
            u41 r2 = new u41
            r2.<init>()
            r2.a = r10
            r1.<init>((defpackage.u41) r2)
            r10.x0 = r1
            java.util.WeakHashMap r1 = defpackage.eaf.a
            int r1 = defpackage.w9f.c(r19)
            if (r1 != 0) goto L_0x015a
            r1 = 8
            defpackage.w9f.m(r10, r1)
        L_0x015a:
            int r1 = r19.getImportantForAccessibility()
            if (r1 != 0) goto L_0x0163
            r10.setImportantForAccessibility(r15)
        L_0x0163:
            android.content.Context r1 = r19.getContext()
            java.lang.String r2 = "accessibility"
            java.lang.Object r1 = r1.getSystemService(r2)
            android.view.accessibility.AccessibilityManager r1 = (android.view.accessibility.AccessibilityManager) r1
            r10.T0 = r1
            d7c r1 = new d7c
            r1.<init>(r10)
            r10.setAccessibilityDelegateCompat(r1)
            int[] r1 = defpackage.svb.RecyclerView
            android.content.res.TypedArray r7 = r11.obtainStyledAttributes(r12, r1, r13, r14)
            int[] r3 = defpackage.svb.RecyclerView
            r16 = 0
            r1 = r19
            r2 = r20
            r4 = r21
            r5 = r7
            r6 = r22
            r14 = r7
            r7 = r16
            defpackage.z9f.d(r1, r2, r3, r4, r5, r6, r7)
            int r1 = defpackage.svb.RecyclerView_layoutManager
            java.lang.String r16 = r14.getString(r1)
            int r1 = defpackage.svb.RecyclerView_android_descendantFocusability
            int r1 = r14.getInt(r1, r0)
            if (r1 != r0) goto L_0x01a5
            r0 = 262144(0x40000, float:3.67342E-40)
            r10.setDescendantFocusability(r0)
        L_0x01a5:
            int r0 = defpackage.svb.RecyclerView_android_clipToPadding
            boolean r0 = r14.getBoolean(r0, r15)
            r10.z0 = r0
            int r0 = defpackage.svb.RecyclerView_fastScrollEnabled
            r1 = 0
            boolean r0 = r14.getBoolean(r0, r1)
            if (r0 == 0) goto L_0x0214
            int r0 = defpackage.svb.RecyclerView_fastScrollVerticalThumbDrawable
            android.graphics.drawable.Drawable r0 = r14.getDrawable(r0)
            r3 = r0
            android.graphics.drawable.StateListDrawable r3 = (android.graphics.drawable.StateListDrawable) r3
            int r0 = defpackage.svb.RecyclerView_fastScrollVerticalTrackDrawable
            android.graphics.drawable.Drawable r4 = r14.getDrawable(r0)
            int r0 = defpackage.svb.RecyclerView_fastScrollHorizontalThumbDrawable
            android.graphics.drawable.Drawable r0 = r14.getDrawable(r0)
            r5 = r0
            android.graphics.drawable.StateListDrawable r5 = (android.graphics.drawable.StateListDrawable) r5
            int r0 = defpackage.svb.RecyclerView_fastScrollHorizontalTrackDrawable
            android.graphics.drawable.Drawable r6 = r14.getDrawable(r0)
            if (r3 == 0) goto L_0x0203
            if (r4 == 0) goto L_0x0203
            if (r5 == 0) goto L_0x0203
            if (r6 == 0) goto L_0x0203
            android.content.Context r0 = r19.getContext()
            android.content.res.Resources r0 = r0.getResources()
            s85 r1 = new s85
            int r2 = defpackage.umb.fastscroll_default_thickness
            int r7 = r0.getDimensionPixelSize(r2)
            int r2 = defpackage.umb.fastscroll_minimum_range
            int r17 = r0.getDimensionPixelSize(r2)
            int r2 = defpackage.umb.fastscroll_margin
            int r0 = r0.getDimensionPixelOffset(r2)
            r2 = r19
            r18 = r8
            r8 = r17
            r9 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x0216
        L_0x0203:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Trying to set fast scroller without both required drawables."
            r1.<init>(r2)
            java.lang.String r1 = th2.g(r10, r1)
            r0.<init>(r1)
            throw r0
        L_0x0214:
            r18 = r8
        L_0x0216:
            r14.recycle()
            java.lang.String r1 = ": Could not instantiate the LayoutManager: "
            if (r16 == 0) goto L_0x0380
            java.lang.String r0 = r16.trim()
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L_0x0380
            r2 = 0
            char r3 = r0.charAt(r2)
            r2 = 46
            if (r3 != r2) goto L_0x0245
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r20.getPackageName()
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
        L_0x0243:
            r2 = r0
            goto L_0x026b
        L_0x0245:
            java.lang.String r3 = "."
            boolean r3 = r0.contains(r3)
            if (r3 == 0) goto L_0x024e
            goto L_0x0243
        L_0x024e:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.Class<androidx.recyclerview.widget.RecyclerView> r4 = androidx.recyclerview.widget.RecyclerView.class
            java.lang.Package r4 = r4.getPackage()
            java.lang.String r4 = r4.getName()
            r3.append(r4)
            r3.append(r2)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            goto L_0x0243
        L_0x026b:
            boolean r0 = r19.isInEditMode()     // Catch:{ ClassNotFoundException -> 0x0287, InvocationTargetException -> 0x0284, InstantiationException -> 0x0281, IllegalAccessException -> 0x027e, ClassCastException -> 0x027b }
            if (r0 == 0) goto L_0x028a
            java.lang.Class r0 = r19.getClass()     // Catch:{ ClassNotFoundException -> 0x0287, InvocationTargetException -> 0x0284, InstantiationException -> 0x0281, IllegalAccessException -> 0x027e, ClassCastException -> 0x027b }
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0287, InvocationTargetException -> 0x0284, InstantiationException -> 0x0281, IllegalAccessException -> 0x027e, ClassCastException -> 0x027b }
        L_0x0279:
            r3 = 0
            goto L_0x028f
        L_0x027b:
            r0 = move-exception
            goto L_0x02ee
        L_0x027e:
            r0 = move-exception
            goto L_0x030c
        L_0x0281:
            r0 = move-exception
            goto L_0x032a
        L_0x0284:
            r0 = move-exception
            goto L_0x0346
        L_0x0287:
            r0 = move-exception
            goto L_0x0362
        L_0x028a:
            java.lang.ClassLoader r0 = r20.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0287, InvocationTargetException -> 0x0284, InstantiationException -> 0x0281, IllegalAccessException -> 0x027e, ClassCastException -> 0x027b }
            goto L_0x0279
        L_0x028f:
            java.lang.Class r0 = java.lang.Class.forName(r2, r3, r0)     // Catch:{ ClassNotFoundException -> 0x0287, InvocationTargetException -> 0x0284, InstantiationException -> 0x0281, IllegalAccessException -> 0x027e, ClassCastException -> 0x027b }
            java.lang.Class<androidx.recyclerview.widget.a> r3 = androidx.recyclerview.widget.a.class
            java.lang.Class r3 = r0.asSubclass(r3)     // Catch:{ ClassNotFoundException -> 0x0287, InvocationTargetException -> 0x0284, InstantiationException -> 0x0281, IllegalAccessException -> 0x027e, ClassCastException -> 0x027b }
            java.lang.Class[] r0 = W1     // Catch:{ NoSuchMethodException -> 0x02b5 }
            java.lang.reflect.Constructor r0 = r3.getConstructor(r0)     // Catch:{ NoSuchMethodException -> 0x02b5 }
            r4 = 4
            java.lang.Object[] r9 = new java.lang.Object[r4]     // Catch:{ NoSuchMethodException -> 0x02b5 }
            r4 = 0
            r9[r4] = r11     // Catch:{ NoSuchMethodException -> 0x02b5 }
            r9[r15] = r12     // Catch:{ NoSuchMethodException -> 0x02b5 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r22)     // Catch:{ NoSuchMethodException -> 0x02b5 }
            r9[r18] = r5     // Catch:{ NoSuchMethodException -> 0x02b5 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)     // Catch:{ NoSuchMethodException -> 0x02b5 }
            r4 = 3
            r9[r4] = r5     // Catch:{ NoSuchMethodException -> 0x02b5 }
            goto L_0x02bd
        L_0x02b5:
            r0 = move-exception
            r5 = r0
            r4 = 0
            java.lang.reflect.Constructor r0 = r3.getConstructor(r4)     // Catch:{ NoSuchMethodException -> 0x02cb }
            r9 = r4
        L_0x02bd:
            r0.setAccessible(r15)     // Catch:{ ClassNotFoundException -> 0x0287, InvocationTargetException -> 0x0284, InstantiationException -> 0x0281, IllegalAccessException -> 0x027e, ClassCastException -> 0x027b }
            java.lang.Object r0 = r0.newInstance(r9)     // Catch:{ ClassNotFoundException -> 0x0287, InvocationTargetException -> 0x0284, InstantiationException -> 0x0281, IllegalAccessException -> 0x027e, ClassCastException -> 0x027b }
            androidx.recyclerview.widget.a r0 = (androidx.recyclerview.widget.a) r0     // Catch:{ ClassNotFoundException -> 0x0287, InvocationTargetException -> 0x0284, InstantiationException -> 0x0281, IllegalAccessException -> 0x027e, ClassCastException -> 0x027b }
            r10.setLayoutManager(r0)     // Catch:{ ClassNotFoundException -> 0x0287, InvocationTargetException -> 0x0284, InstantiationException -> 0x0281, IllegalAccessException -> 0x027e, ClassCastException -> 0x027b }
            goto L_0x0380
        L_0x02cb:
            r0 = move-exception
            r3 = r0
            r3.initCause(r5)     // Catch:{ ClassNotFoundException -> 0x0287, InvocationTargetException -> 0x0284, InstantiationException -> 0x0281, IllegalAccessException -> 0x027e, ClassCastException -> 0x027b }
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ ClassNotFoundException -> 0x0287, InvocationTargetException -> 0x0284, InstantiationException -> 0x0281, IllegalAccessException -> 0x027e, ClassCastException -> 0x027b }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException -> 0x0287, InvocationTargetException -> 0x0284, InstantiationException -> 0x0281, IllegalAccessException -> 0x027e, ClassCastException -> 0x027b }
            r4.<init>()     // Catch:{ ClassNotFoundException -> 0x0287, InvocationTargetException -> 0x0284, InstantiationException -> 0x0281, IllegalAccessException -> 0x027e, ClassCastException -> 0x027b }
            java.lang.String r5 = r21.getPositionDescription()     // Catch:{ ClassNotFoundException -> 0x0287, InvocationTargetException -> 0x0284, InstantiationException -> 0x0281, IllegalAccessException -> 0x027e, ClassCastException -> 0x027b }
            r4.append(r5)     // Catch:{ ClassNotFoundException -> 0x0287, InvocationTargetException -> 0x0284, InstantiationException -> 0x0281, IllegalAccessException -> 0x027e, ClassCastException -> 0x027b }
            java.lang.String r5 = ": Error creating LayoutManager "
            r4.append(r5)     // Catch:{ ClassNotFoundException -> 0x0287, InvocationTargetException -> 0x0284, InstantiationException -> 0x0281, IllegalAccessException -> 0x027e, ClassCastException -> 0x027b }
            r4.append(r2)     // Catch:{ ClassNotFoundException -> 0x0287, InvocationTargetException -> 0x0284, InstantiationException -> 0x0281, IllegalAccessException -> 0x027e, ClassCastException -> 0x027b }
            java.lang.String r4 = r4.toString()     // Catch:{ ClassNotFoundException -> 0x0287, InvocationTargetException -> 0x0284, InstantiationException -> 0x0281, IllegalAccessException -> 0x027e, ClassCastException -> 0x027b }
            r0.<init>(r4, r3)     // Catch:{ ClassNotFoundException -> 0x0287, InvocationTargetException -> 0x0284, InstantiationException -> 0x0281, IllegalAccessException -> 0x027e, ClassCastException -> 0x027b }
            throw r0     // Catch:{ ClassNotFoundException -> 0x0287, InvocationTargetException -> 0x0284, InstantiationException -> 0x0281, IllegalAccessException -> 0x027e, ClassCastException -> 0x027b }
        L_0x02ee:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r21.getPositionDescription()
            r3.append(r4)
            java.lang.String r4 = ": Class is not a LayoutManager "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2, r0)
            throw r1
        L_0x030c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r21.getPositionDescription()
            r3.append(r4)
            java.lang.String r4 = ": Cannot access non-public constructor "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2, r0)
            throw r1
        L_0x032a:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = r21.getPositionDescription()
            r4.append(r5)
            r4.append(r1)
            r4.append(r2)
            java.lang.String r1 = r4.toString()
            r3.<init>(r1, r0)
            throw r3
        L_0x0346:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = r21.getPositionDescription()
            r4.append(r5)
            r4.append(r1)
            r4.append(r2)
            java.lang.String r1 = r4.toString()
            r3.<init>(r1, r0)
            throw r3
        L_0x0362:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r21.getPositionDescription()
            r3.append(r4)
            java.lang.String r4 = ": Unable to find LayoutManager "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2, r0)
            throw r1
        L_0x0380:
            int[] r3 = R1
            r1 = 0
            android.content.res.TypedArray r0 = r11.obtainStyledAttributes(r12, r3, r13, r1)
            r7 = 0
            r1 = r19
            r2 = r20
            r4 = r21
            r5 = r0
            r6 = r22
            defpackage.z9f.d(r1, r2, r3, r4, r5, r6, r7)
            r1 = 0
            boolean r1 = r0.getBoolean(r1, r15)
            r0.recycle()
            r10.setNestedScrollingEnabled(r1)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            int r1 = defpackage.l0b.b
            r10.setTag(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        a aVar = this.F0;
        if (aVar != null) {
            return aVar.u(layoutParams);
        }
        throw new IllegalStateException(th2.g(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }
}
