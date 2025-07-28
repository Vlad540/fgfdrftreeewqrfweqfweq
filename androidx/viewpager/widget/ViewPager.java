package androidx.viewpager.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.fragment.app.a;
import androidx.fragment.app.c;
import com.google.android.material.tabs.TabLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class ViewPager extends ViewGroup {
    public static final int[] o1 = {16842931};
    public static final gu6 p1 = new gu6(16);
    public static final l27 q1 = new l27(4);
    public ClassLoader A0 = null;
    public final Scroller B0;
    public boolean C0;
    public cx3 D0;
    public int E0;
    public Drawable F0;
    public int G0;
    public int H0;
    public float I0 = -3.4028235E38f;
    public float J0 = Float.MAX_VALUE;
    public int K0;
    public boolean L0;
    public boolean M0;
    public boolean N0;
    public int O0 = 1;
    public boolean P0;
    public boolean Q0;
    public final int R0;
    public int S0;
    public final int T0;
    public float U0;
    public float V0;
    public float W0;
    public float X0;
    public int Y0 = -1;
    public VelocityTracker Z0;
    public int a;
    public final int a1;
    public final ArrayList b = new ArrayList();
    public final int b1;
    public final ibf c = new Object();
    public final int c1;
    public final int d1;
    public final EdgeEffect e1;
    public final EdgeEffect f1;
    public boolean g1 = true;
    public boolean h1;
    public int i1;
    public ArrayList j1;
    public kbf k1;
    public ArrayList l1;
    public final lde m1 = new lde(8, (Object) this);
    public int n1 = 0;
    public final Rect o = new Rect();
    public tia w0;
    public int x0;
    public int y0 = -1;
    public Parcelable z0 = null;

    /* JADX WARNING: type inference failed for: r4v2, types: [java.lang.Object, ibf] */
    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context2 = getContext();
        this.B0 = new Scroller(context2, q1);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context2);
        float f = context2.getResources().getDisplayMetrics().density;
        this.T0 = viewConfiguration.getScaledPagingTouchSlop();
        this.a1 = (int) (400.0f * f);
        this.b1 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.e1 = new EdgeEffect(context2);
        this.f1 = new EdgeEffect(context2);
        this.c1 = (int) (25.0f * f);
        this.d1 = (int) (2.0f * f);
        this.R0 = (int) (f * 16.0f);
        eaf.j(this, new cq0(5, this));
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        t9f.u(this, new j1c(this));
    }

    public static boolean d(int i, int i2, int i3, View view, boolean z) {
        int i4;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i5 = i2 + scrollX;
                if (i5 >= childAt.getLeft() && i5 < childAt.getRight() && (i4 = i3 + scrollY) >= childAt.getTop() && i4 < childAt.getBottom() && d(i, i5 - childAt.getLeft(), i4 - childAt.getTop(), childAt, true)) {
                    return true;
                }
            }
        }
        return z && view.canScrollHorizontally(-i);
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.M0 != z) {
            this.M0 = z;
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, ibf] */
    public final ibf a(int i, int i2) {
        Bundle bundle;
        ? obj = new Object();
        obj.b = i;
        fi5 fi5 = this.w0;
        String h = fi5.h(i);
        HashMap hashMap = fi5.g;
        a aVar = (a) hashMap.get(h);
        if (aVar != null) {
            udd.p("fi5", "CHECK instantiateItem use from cache f %s", aVar);
        } else {
            if (fi5.d == null) {
                c cVar = fi5.c;
                cVar.getClass();
                fi5.d = new hd0(cVar);
            }
            String h2 = fi5.h(i);
            a g = fi5.g(i);
            ei5 ei5 = (ei5) fi5.e.c(h2);
            if (ei5 != null) {
                udd.p("fi5", "CHECK instantiateItem use ImplSavedState for %d fe %s", Integer.valueOf(i), g);
                if (g.J0 == null) {
                    fx5 fx5 = ei5.b;
                    if (fx5 == null || (bundle = fx5.a) == null) {
                        bundle = null;
                    }
                    g.b = bundle;
                } else {
                    throw new IllegalStateException("Fragment already added");
                }
            } else {
                udd.p("fi5", "CHECK instantiateItem fr %s", g);
            }
            g.a1(false);
            g.d1(false);
            hashMap.put(h2, g);
            fi5.d.f(getId(), g, (String) null, 1);
            aVar = g;
        }
        obj.a = aVar;
        this.w0.getClass();
        obj.d = 1.0f;
        ArrayList arrayList = this.b;
        if (i2 < 0 || i2 >= arrayList.size()) {
            arrayList.add(obj);
        } else {
            arrayList.add(i2, obj);
        }
        return obj;
    }

    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        ibf i3;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                View childAt = getChildAt(i4);
                if (childAt.getVisibility() == 0 && (i3 = i(childAt)) != null && i3.b == this.x0) {
                    childAt.addFocusables(arrayList, i, i2);
                }
            }
        }
        if ((descendantFocusability == 262144 && size != arrayList.size()) || !isFocusable()) {
            return;
        }
        if ((i2 & 1) != 1 || !isInTouchMode() || isFocusableInTouchMode()) {
            arrayList.add(this);
        }
    }

    public final void addTouchables(ArrayList arrayList) {
        ibf i;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (i = i(childAt)) != null && i.b == this.x0) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateDefaultLayoutParams();
        }
        jbf jbf = (jbf) layoutParams;
        boolean z = jbf.a | (view.getClass().getAnnotation(hbf.class) != null);
        jbf.a = z;
        if (!this.L0) {
            super.addView(view, i, layoutParams);
        } else if (!z) {
            jbf.d = true;
            addViewInLayout(view, i, layoutParams);
        } else {
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
    }

    public final void b(kbf kbf) {
        if (this.j1 == null) {
            this.j1 = new ArrayList();
        }
        this.j1.add(kbf);
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x009c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean c(int r8) {
        /*
            r7 = this;
            android.view.View r0 = r7.findFocus()
            r1 = 0
            if (r0 != r7) goto L_0x0009
        L_0x0007:
            r0 = r1
            goto L_0x002b
        L_0x0009:
            if (r0 == 0) goto L_0x002b
            android.view.ViewParent r2 = r0.getParent()
        L_0x000f:
            boolean r3 = r2 instanceof android.view.ViewGroup
            if (r3 == 0) goto L_0x001b
            if (r2 != r7) goto L_0x0016
            goto L_0x002b
        L_0x0016:
            android.view.ViewParent r2 = r2.getParent()
            goto L_0x000f
        L_0x001b:
            android.view.ViewParent r0 = r0.getParent()
        L_0x001f:
            boolean r2 = r0 instanceof android.view.ViewGroup
            if (r2 == 0) goto L_0x0007
            r0.getClass()
            android.view.ViewParent r0 = r0.getParent()
            goto L_0x001f
        L_0x002b:
            android.view.FocusFinder r1 = android.view.FocusFinder.getInstance()
            android.view.View r1 = r1.findNextFocus(r7, r0, r8)
            r2 = 1
            r3 = 0
            r4 = 66
            r5 = 17
            if (r1 == 0) goto L_0x007e
            if (r1 == r0) goto L_0x007e
            android.graphics.Rect r6 = r7.o
            if (r8 != r5) goto L_0x0062
            android.graphics.Rect r4 = r7.h(r6, r1)
            int r4 = r4.left
            android.graphics.Rect r5 = r7.h(r6, r0)
            int r5 = r5.left
            if (r0 == 0) goto L_0x005c
            if (r4 < r5) goto L_0x005c
            int r0 = r7.x0
            if (r0 <= 0) goto L_0x0098
            int r0 = r0 - r2
            r7.N0 = r3
            r7.v(r0, r3, r2, r3)
            goto L_0x0099
        L_0x005c:
            boolean r0 = r1.requestFocus()
        L_0x0060:
            r3 = r0
            goto L_0x009a
        L_0x0062:
            if (r8 != r4) goto L_0x009a
            android.graphics.Rect r2 = r7.h(r6, r1)
            int r2 = r2.left
            android.graphics.Rect r3 = r7.h(r6, r0)
            int r3 = r3.left
            if (r0 == 0) goto L_0x0079
            if (r2 > r3) goto L_0x0079
            boolean r0 = r7.n()
            goto L_0x0060
        L_0x0079:
            boolean r0 = r1.requestFocus()
            goto L_0x0060
        L_0x007e:
            if (r8 == r5) goto L_0x008d
            if (r8 != r2) goto L_0x0083
            goto L_0x008d
        L_0x0083:
            if (r8 == r4) goto L_0x0088
            r0 = 2
            if (r8 != r0) goto L_0x009a
        L_0x0088:
            boolean r3 = r7.n()
            goto L_0x009a
        L_0x008d:
            int r0 = r7.x0
            if (r0 <= 0) goto L_0x0098
            int r0 = r0 - r2
            r7.N0 = r3
            r7.v(r0, r3, r2, r3)
            goto L_0x0099
        L_0x0098:
            r2 = r3
        L_0x0099:
            r3 = r2
        L_0x009a:
            if (r3 == 0) goto L_0x00a3
            int r8 = android.view.SoundEffectConstants.getContantForFocusDirection(r8)
            r7.playSoundEffect(r8)
        L_0x00a3:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.c(int):boolean");
    }

    public final boolean canScrollHorizontally(int i) {
        if (this.w0 == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        return i < 0 ? scrollX > ((int) (((float) clientWidth) * this.I0)) : i > 0 && scrollX < ((int) (((float) clientWidth) * this.J0));
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof jbf) && super.checkLayoutParams(layoutParams);
    }

    public final void computeScroll() {
        this.C0 = true;
        Scroller scroller = this.B0;
        if (scroller.isFinished() || !scroller.computeScrollOffset()) {
            e(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = scroller.getCurrX();
        int currY = scroller.getCurrY();
        if (!(scrollX == currX && scrollY == currY)) {
            scrollTo(currX, currY);
            if (!o(currX)) {
                scroller.abortAnimation();
                scrollTo(0, currY);
            }
        }
        WeakHashMap weakHashMap = eaf.a;
        postInvalidateOnAnimation();
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean dispatchKeyEvent(android.view.KeyEvent r6) {
        /*
            r5 = this;
            boolean r0 = super.dispatchKeyEvent(r6)
            r1 = 1
            if (r0 != 0) goto L_0x0066
            int r0 = r6.getAction()
            r2 = 0
            if (r0 != 0) goto L_0x0061
            int r0 = r6.getKeyCode()
            r3 = 21
            r4 = 2
            if (r0 == r3) goto L_0x0048
            r3 = 22
            if (r0 == r3) goto L_0x0036
            r3 = 61
            if (r0 == r3) goto L_0x0020
            goto L_0x0061
        L_0x0020:
            boolean r0 = r6.hasNoModifiers()
            if (r0 == 0) goto L_0x002b
            boolean r5 = r5.c(r4)
            goto L_0x0062
        L_0x002b:
            boolean r6 = r6.hasModifiers(r1)
            if (r6 == 0) goto L_0x0061
            boolean r5 = r5.c(r1)
            goto L_0x0062
        L_0x0036:
            boolean r6 = r6.hasModifiers(r4)
            if (r6 == 0) goto L_0x0041
            boolean r5 = r5.n()
            goto L_0x0062
        L_0x0041:
            r6 = 66
            boolean r5 = r5.c(r6)
            goto L_0x0062
        L_0x0048:
            boolean r6 = r6.hasModifiers(r4)
            if (r6 == 0) goto L_0x005a
            int r6 = r5.x0
            if (r6 <= 0) goto L_0x0061
            int r6 = r6 - r1
            r5.N0 = r2
            r5.v(r6, r2, r1, r2)
            r5 = r1
            goto L_0x0062
        L_0x005a:
            r6 = 17
            boolean r5 = r5.c(r6)
            goto L_0x0062
        L_0x0061:
            r5 = r2
        L_0x0062:
            if (r5 == 0) goto L_0x0065
            goto L_0x0066
        L_0x0065:
            r1 = r2
        L_0x0066:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        ibf i;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (i = i(childAt)) != null && i.b == this.x0 && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    public final void draw(Canvas canvas) {
        tia tia;
        EdgeEffect edgeEffect = this.f1;
        EdgeEffect edgeEffect2 = this.e1;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean z = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (tia = this.w0) != null && tia.b() > 1)) {
            if (!edgeEffect2.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((float) (getPaddingTop() + (-height)), this.I0 * ((float) width));
                edgeEffect2.setSize(height, width);
                z = edgeEffect2.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!edgeEffect.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate((float) (-getPaddingTop()), (-(this.J0 + 1.0f)) * ((float) width2));
                edgeEffect.setSize(height2, width2);
                z |= edgeEffect.draw(canvas);
                canvas.restoreToCount(save2);
            }
        } else {
            edgeEffect2.finish();
            edgeEffect.finish();
        }
        if (z) {
            WeakHashMap weakHashMap = eaf.a;
            postInvalidateOnAnimation();
        }
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.F0;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    public final void e(boolean z) {
        Scroller scroller = this.B0;
        boolean z2 = this.n1 == 2;
        if (z2) {
            setScrollingCacheEnabled(false);
            if (!scroller.isFinished()) {
                scroller.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = scroller.getCurrX();
                int currY = scroller.getCurrY();
                if (!(scrollX == currX && scrollY == currY)) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        o(currX);
                    }
                }
            }
        }
        this.N0 = false;
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                break;
            }
            ibf ibf = (ibf) arrayList.get(i);
            if (ibf.c) {
                ibf.c = false;
                z2 = true;
            }
            i++;
        }
        if (z2) {
            lde lde = this.m1;
            if (z) {
                WeakHashMap weakHashMap = eaf.a;
                postOnAnimation(lde);
                return;
            }
            lde.run();
        }
    }

    public final void f() {
        fi5 fi5;
        hd0 hd0;
        int b2 = this.w0.b();
        this.a = b2;
        ArrayList arrayList = this.b;
        boolean z = arrayList.size() < (this.O0 * 2) + 1 && arrayList.size() < b2;
        int i = this.x0;
        int i2 = 0;
        boolean z2 = false;
        while (i2 < arrayList.size()) {
            ibf ibf = (ibf) arrayList.get(i2);
            int c2 = this.w0.c(ibf.a);
            if (c2 != -1) {
                if (c2 == -2) {
                    arrayList.remove(i2);
                    i2--;
                    if (!z2) {
                        this.w0.f(this);
                        z2 = true;
                    }
                    this.w0.a(this, ibf.b, ibf.a);
                    int i3 = this.x0;
                    if (i3 == ibf.b) {
                        i = Math.max(0, Math.min(i3, b2 - 1));
                    }
                } else {
                    int i4 = ibf.b;
                    if (i4 != c2) {
                        if (i4 == this.x0) {
                            i = c2;
                        }
                        ibf.b = c2;
                    }
                }
                z = true;
            }
            i2++;
        }
        if (z2 && (hd0 = fi5.d) != null) {
            if (!hd0.g) {
                hd0.q.B(hd0, true);
                (fi5 = this.w0).d = null;
            } else {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
        }
        Collections.sort(arrayList, p1);
        if (z) {
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                jbf jbf = (jbf) getChildAt(i5).getLayoutParams();
                if (!jbf.a) {
                    jbf.c = 0.0f;
                }
            }
            v(i, 0, false, true);
            requestLayout();
        }
    }

    public final void g(int i) {
        kbf kbf = this.k1;
        if (kbf != null) {
            kbf.m(i);
        }
        ArrayList arrayList = this.j1;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                kbf kbf2 = (kbf) this.j1.get(i2);
                if (kbf2 != null) {
                    kbf2.m(i);
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [android.view.ViewGroup$LayoutParams, jbf] */
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        ? layoutParams = new ViewGroup.LayoutParams(-1, -1);
        layoutParams.c = 0.0f;
        return layoutParams;
    }

    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public tia getAdapter() {
        return this.w0;
    }

    public final int getChildDrawingOrder(int i, int i2) {
        throw null;
    }

    public int getCurrentItem() {
        return this.x0;
    }

    public int getOffscreenPageLimit() {
        return this.O0;
    }

    public int getPageMargin() {
        return this.E0;
    }

    public final Rect h(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left = viewGroup.getLeft() + rect.left;
            rect.right = viewGroup.getRight() + rect.right;
            rect.top = viewGroup.getTop() + rect.top;
            rect.bottom = viewGroup.getBottom() + rect.bottom;
            parent = viewGroup.getParent();
        }
        return rect;
    }

    public final ibf i(View view) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return null;
            }
            ibf ibf = (ibf) arrayList.get(i);
            fi5 fi5 = this.w0;
            a aVar = ibf.a;
            fi5.getClass();
            if (aVar.l0() == view) {
                return ibf;
            }
            i++;
        }
    }

    public final ibf j() {
        ibf ibf;
        int i;
        int clientWidth = getClientWidth();
        float f = 0.0f;
        float scrollX = clientWidth > 0 ? ((float) getScrollX()) / ((float) clientWidth) : 0.0f;
        float f2 = clientWidth > 0 ? ((float) this.E0) / ((float) clientWidth) : 0.0f;
        int i2 = 0;
        boolean z = true;
        ibf ibf2 = null;
        int i3 = -1;
        float f3 = 0.0f;
        while (true) {
            ArrayList arrayList = this.b;
            if (i2 >= arrayList.size()) {
                return ibf2;
            }
            ibf ibf3 = (ibf) arrayList.get(i2);
            if (z || ibf3.b == (i = i3 + 1)) {
                ibf = ibf3;
            } else {
                ibf ibf4 = this.c;
                ibf4.e = f + f3 + f2;
                ibf4.b = i;
                this.w0.getClass();
                ibf4.d = 1.0f;
                i2--;
                ibf = ibf4;
            }
            f = ibf.e;
            float f4 = ibf.d + f + f2;
            if (!z && scrollX < f) {
                return ibf2;
            }
            if (scrollX < f4 || i2 == arrayList.size() - 1) {
                return ibf;
            }
            int i4 = ibf.b;
            float f5 = ibf.d;
            i2++;
            z = false;
            ibf ibf5 = ibf;
            i3 = i4;
            f3 = f5;
            ibf2 = ibf5;
        }
        return ibf;
    }

    public final ibf k(int i) {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i2 >= arrayList.size()) {
                return null;
            }
            ibf ibf = (ibf) arrayList.get(i2);
            if (ibf.b == i) {
                return ibf;
            }
            i2++;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0065  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void l(int r12, float r13, int r14) {
        /*
            r11 = this;
            int r14 = r11.i1
            r0 = 0
            r1 = 1
            if (r14 <= 0) goto L_0x006c
            int r14 = r11.getScrollX()
            int r2 = r11.getPaddingLeft()
            int r3 = r11.getPaddingRight()
            int r4 = r11.getWidth()
            int r5 = r11.getChildCount()
            r6 = r0
        L_0x001b:
            if (r6 >= r5) goto L_0x006c
            android.view.View r7 = r11.getChildAt(r6)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            jbf r8 = (defpackage.jbf) r8
            boolean r9 = r8.a
            if (r9 != 0) goto L_0x002c
            goto L_0x0069
        L_0x002c:
            int r8 = r8.b
            r8 = r8 & 7
            if (r8 == r1) goto L_0x0050
            r9 = 3
            if (r8 == r9) goto L_0x004a
            r9 = 5
            if (r8 == r9) goto L_0x003a
            r8 = r2
            goto L_0x005d
        L_0x003a:
            int r8 = r4 - r3
            int r9 = r7.getMeasuredWidth()
            int r8 = r8 - r9
            int r9 = r7.getMeasuredWidth()
            int r3 = r3 + r9
        L_0x0046:
            r10 = r8
            r8 = r2
            r2 = r10
            goto L_0x005d
        L_0x004a:
            int r8 = r7.getWidth()
            int r8 = r8 + r2
            goto L_0x005d
        L_0x0050:
            int r8 = r7.getMeasuredWidth()
            int r8 = r4 - r8
            int r8 = r8 / 2
            int r8 = java.lang.Math.max(r8, r2)
            goto L_0x0046
        L_0x005d:
            int r2 = r2 + r14
            int r9 = r7.getLeft()
            int r2 = r2 - r9
            if (r2 == 0) goto L_0x0068
            r7.offsetLeftAndRight(r2)
        L_0x0068:
            r2 = r8
        L_0x0069:
            int r6 = r6 + 1
            goto L_0x001b
        L_0x006c:
            kbf r14 = r11.k1
            if (r14 == 0) goto L_0x0073
            r14.q(r12, r13)
        L_0x0073:
            java.util.ArrayList r14 = r11.j1
            if (r14 == 0) goto L_0x008d
            int r14 = r14.size()
        L_0x007b:
            if (r0 >= r14) goto L_0x008d
            java.util.ArrayList r2 = r11.j1
            java.lang.Object r2 = r2.get(r0)
            kbf r2 = (defpackage.kbf) r2
            if (r2 == 0) goto L_0x008a
            r2.q(r12, r13)
        L_0x008a:
            int r0 = r0 + 1
            goto L_0x007b
        L_0x008d:
            r11.h1 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.l(int, float, int):void");
    }

    public final void m(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.Y0) {
            int i = actionIndex == 0 ? 1 : 0;
            this.U0 = motionEvent.getX(i);
            this.Y0 = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.Z0;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final boolean n() {
        tia tia = this.w0;
        if (tia == null || this.x0 >= tia.b() - 1) {
            return false;
        }
        this.N0 = false;
        v(this.x0 + 1, 0, true, false);
        return true;
    }

    public final boolean o(int i) {
        if (this.b.size() != 0) {
            ibf j = j();
            int clientWidth = getClientWidth();
            int i2 = this.E0;
            int i3 = clientWidth + i2;
            float f = (float) clientWidth;
            int i4 = j.b;
            float f2 = ((((float) i) / f) - j.e) / (j.d + (((float) i2) / f));
            this.h1 = false;
            l(i4, f2, (int) (((float) i3) * f2));
            if (this.h1) {
                return true;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        } else if (this.g1) {
            return false;
        } else {
            this.h1 = false;
            l(0, 0.0f, 0);
            if (this.h1) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.g1 = true;
    }

    public final void onDetachedFromWindow() {
        removeCallbacks(this.m1);
        Scroller scroller = this.B0;
        if (scroller != null && !scroller.isFinished()) {
            this.B0.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x005c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onDraw(android.graphics.Canvas r19) {
        /*
            r18 = this;
            r0 = r18
            super.onDraw(r19)
            int r1 = r0.E0
            if (r1 <= 0) goto L_0x00a8
            android.graphics.drawable.Drawable r1 = r0.F0
            if (r1 == 0) goto L_0x00a8
            java.util.ArrayList r1 = r0.b
            int r2 = r1.size()
            if (r2 <= 0) goto L_0x00a8
            tia r2 = r0.w0
            if (r2 == 0) goto L_0x00a8
            int r2 = r18.getScrollX()
            int r3 = r18.getWidth()
            int r4 = r0.E0
            float r4 = (float) r4
            float r5 = (float) r3
            float r4 = r4 / r5
            r6 = 0
            java.lang.Object r7 = r1.get(r6)
            ibf r7 = (defpackage.ibf) r7
            float r8 = r7.e
            int r9 = r1.size()
            int r10 = r7.b
            int r11 = r9 + -1
            java.lang.Object r11 = r1.get(r11)
            ibf r11 = (defpackage.ibf) r11
            int r11 = r11.b
        L_0x003f:
            if (r10 >= r11) goto L_0x00a8
        L_0x0041:
            int r12 = r7.b
            if (r10 <= r12) goto L_0x0050
            if (r6 >= r9) goto L_0x0050
            int r6 = r6 + 1
            java.lang.Object r7 = r1.get(r6)
            ibf r7 = (defpackage.ibf) r7
            goto L_0x0041
        L_0x0050:
            if (r10 != r12) goto L_0x005c
            float r8 = r7.e
            float r12 = r7.d
            float r13 = r8 + r12
            float r13 = r13 * r5
            float r8 = r8 + r12
            float r8 = r8 + r4
            goto L_0x0069
        L_0x005c:
            tia r12 = r0.w0
            r12.getClass()
            r12 = 1065353216(0x3f800000, float:1.0)
            float r13 = r8 + r12
            float r13 = r13 * r5
            float r12 = r12 + r4
            float r12 = r12 + r8
            r8 = r12
        L_0x0069:
            int r12 = r0.E0
            float r12 = (float) r12
            float r12 = r12 + r13
            float r14 = (float) r2
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 <= 0) goto L_0x0093
            android.graphics.drawable.Drawable r12 = r0.F0
            int r14 = java.lang.Math.round(r13)
            int r15 = r0.G0
            r16 = r1
            int r1 = r0.E0
            float r1 = (float) r1
            float r1 = r1 + r13
            int r1 = java.lang.Math.round(r1)
            r17 = r4
            int r4 = r0.H0
            r12.setBounds(r14, r15, r1, r4)
            android.graphics.drawable.Drawable r1 = r0.F0
            r4 = r19
            r1.draw(r4)
            goto L_0x0099
        L_0x0093:
            r16 = r1
            r17 = r4
            r4 = r19
        L_0x0099:
            int r1 = r2 + r3
            float r1 = (float) r1
            int r1 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x00a1
            goto L_0x00a8
        L_0x00a1:
            int r10 = r10 + 1
            r1 = r16
            r4 = r17
            goto L_0x003f
        L_0x00a8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onDraw(android.graphics.Canvas):void");
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int i = this.T0;
        Scroller scroller = this.B0;
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            t();
            return false;
        }
        if (action != 0) {
            if (this.P0) {
                return true;
            }
            if (this.Q0) {
                return false;
            }
        }
        if (action == 0) {
            float x = motionEvent.getX();
            this.W0 = x;
            this.U0 = x;
            float y = motionEvent.getY();
            this.X0 = y;
            this.V0 = y;
            this.Y0 = motionEvent.getPointerId(0);
            this.Q0 = false;
            this.C0 = true;
            scroller.computeScrollOffset();
            if (this.n1 != 2 || Math.abs(scroller.getFinalX() - scroller.getCurrX()) <= this.d1) {
                e(false);
                this.P0 = false;
            } else {
                scroller.abortAnimation();
                this.N0 = false;
                q();
                this.P0 = true;
                ViewParent parent = getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                setScrollState(1);
            }
        } else if (action == 2) {
            int i2 = this.Y0;
            if (i2 != -1) {
                int findPointerIndex = motionEvent.findPointerIndex(i2);
                float x2 = motionEvent.getX(findPointerIndex);
                float f = x2 - this.U0;
                float abs = Math.abs(f);
                float y2 = motionEvent.getY(findPointerIndex);
                float abs2 = Math.abs(y2 - this.X0);
                int i3 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
                if (i3 != 0) {
                    float f2 = this.U0;
                    if ((f2 >= ((float) this.S0) || i3 <= 0) && ((f2 <= ((float) (getWidth() - this.S0)) || f >= 0.0f) && d((int) f, (int) x2, (int) y2, this, false))) {
                        this.U0 = x2;
                        this.V0 = y2;
                        this.Q0 = true;
                        return false;
                    }
                }
                float f3 = (float) i;
                if (abs > f3 && abs * 0.5f > abs2) {
                    this.P0 = true;
                    ViewParent parent2 = getParent();
                    if (parent2 != null) {
                        parent2.requestDisallowInterceptTouchEvent(true);
                    }
                    setScrollState(1);
                    float f4 = this.W0;
                    float f5 = (float) i;
                    this.U0 = i3 > 0 ? f4 + f5 : f4 - f5;
                    this.V0 = y2;
                    setScrollingCacheEnabled(true);
                } else if (abs2 > f3) {
                    this.Q0 = true;
                }
                if (this.P0 && p(x2)) {
                    WeakHashMap weakHashMap = eaf.a;
                    postInvalidateOnAnimation();
                }
            }
        } else if (action == 6) {
            m(motionEvent);
        }
        if (this.Z0 == null) {
            this.Z0 = VelocityTracker.obtain();
        }
        this.Z0.addMovement(motionEvent);
        return this.P0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0094  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            r18 = this;
            r0 = r18
            int r1 = r18.getChildCount()
            int r2 = r22 - r20
            int r3 = r23 - r21
            int r4 = r18.getPaddingLeft()
            int r5 = r18.getPaddingTop()
            int r6 = r18.getPaddingRight()
            int r7 = r18.getPaddingBottom()
            int r8 = r18.getScrollX()
            r10 = 0
            r11 = 0
        L_0x0020:
            r12 = 8
            if (r10 >= r1) goto L_0x00b8
            android.view.View r13 = r0.getChildAt(r10)
            int r14 = r13.getVisibility()
            if (r14 == r12) goto L_0x00b4
            android.view.ViewGroup$LayoutParams r12 = r13.getLayoutParams()
            jbf r12 = (defpackage.jbf) r12
            boolean r14 = r12.a
            if (r14 == 0) goto L_0x00b4
            int r12 = r12.b
            r14 = r12 & 7
            r12 = r12 & 112(0x70, float:1.57E-43)
            r15 = 1
            if (r14 == r15) goto L_0x0061
            r15 = 3
            if (r14 == r15) goto L_0x005b
            r15 = 5
            if (r14 == r15) goto L_0x0049
            r14 = r4
            goto L_0x006e
        L_0x0049:
            int r14 = r2 - r6
            int r15 = r13.getMeasuredWidth()
            int r14 = r14 - r15
            int r15 = r13.getMeasuredWidth()
            int r6 = r6 + r15
        L_0x0055:
            r17 = r14
            r14 = r4
            r4 = r17
            goto L_0x006e
        L_0x005b:
            int r14 = r13.getMeasuredWidth()
            int r14 = r14 + r4
            goto L_0x006e
        L_0x0061:
            int r14 = r13.getMeasuredWidth()
            int r14 = r2 - r14
            int r14 = r14 / 2
            int r14 = java.lang.Math.max(r14, r4)
            goto L_0x0055
        L_0x006e:
            r15 = 16
            if (r12 == r15) goto L_0x0094
            r15 = 48
            if (r12 == r15) goto L_0x008e
            r15 = 80
            if (r12 == r15) goto L_0x007c
            r12 = r5
            goto L_0x00a1
        L_0x007c:
            int r12 = r3 - r7
            int r15 = r13.getMeasuredHeight()
            int r12 = r12 - r15
            int r15 = r13.getMeasuredHeight()
            int r7 = r7 + r15
        L_0x0088:
            r17 = r12
            r12 = r5
            r5 = r17
            goto L_0x00a1
        L_0x008e:
            int r12 = r13.getMeasuredHeight()
            int r12 = r12 + r5
            goto L_0x00a1
        L_0x0094:
            int r12 = r13.getMeasuredHeight()
            int r12 = r3 - r12
            int r12 = r12 / 2
            int r12 = java.lang.Math.max(r12, r5)
            goto L_0x0088
        L_0x00a1:
            int r4 = r4 + r8
            int r15 = r13.getMeasuredWidth()
            int r15 = r15 + r4
            int r16 = r13.getMeasuredHeight()
            int r9 = r16 + r5
            r13.layout(r4, r5, r15, r9)
            int r11 = r11 + 1
            r5 = r12
            r4 = r14
        L_0x00b4:
            int r10 = r10 + 1
            goto L_0x0020
        L_0x00b8:
            int r2 = r2 - r4
            int r2 = r2 - r6
            r6 = 0
        L_0x00bb:
            if (r6 >= r1) goto L_0x0108
            android.view.View r8 = r0.getChildAt(r6)
            int r9 = r8.getVisibility()
            if (r9 == r12) goto L_0x0105
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            jbf r9 = (defpackage.jbf) r9
            boolean r10 = r9.a
            if (r10 != 0) goto L_0x0105
            ibf r10 = r0.i(r8)
            if (r10 == 0) goto L_0x0105
            float r13 = (float) r2
            float r10 = r10.e
            float r10 = r10 * r13
            int r10 = (int) r10
            int r10 = r10 + r4
            boolean r14 = r9.d
            if (r14 == 0) goto L_0x00f8
            r14 = 0
            r9.d = r14
            float r9 = r9.c
            float r13 = r13 * r9
            int r9 = (int) r13
            r13 = 1073741824(0x40000000, float:2.0)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r13)
            int r14 = r3 - r5
            int r14 = r14 - r7
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r13)
            r8.measure(r9, r13)
        L_0x00f8:
            int r9 = r8.getMeasuredWidth()
            int r9 = r9 + r10
            int r13 = r8.getMeasuredHeight()
            int r13 = r13 + r5
            r8.layout(r10, r5, r9, r13)
        L_0x0105:
            int r6 = r6 + 1
            goto L_0x00bb
        L_0x0108:
            r0.G0 = r5
            int r3 = r3 - r7
            r0.H0 = r3
            r0.i1 = r11
            boolean r1 = r0.g1
            if (r1 == 0) goto L_0x011a
            int r1 = r0.x0
            r2 = 0
            r0.u(r1, r2, r2, r2)
            goto L_0x011b
        L_0x011a:
            r2 = 0
        L_0x011b:
            r0.g1 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onLayout(boolean, int, int, int, int):void");
    }

    public final void onMeasure(int i, int i2) {
        jbf jbf;
        jbf jbf2;
        int i3;
        setMeasuredDimension(View.getDefaultSize(0, i), View.getDefaultSize(0, i2));
        int measuredWidth = getMeasuredWidth();
        this.S0 = Math.min(measuredWidth / 10, this.R0);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i4 = 0;
        while (true) {
            boolean z = true;
            int i5 = 1073741824;
            if (i4 >= childCount) {
                break;
            }
            View childAt = getChildAt(i4);
            if (!(childAt.getVisibility() == 8 || (jbf2 = (jbf) childAt.getLayoutParams()) == null || !jbf2.a)) {
                int i6 = jbf2.b;
                int i7 = i6 & 7;
                int i8 = i6 & 112;
                boolean z2 = i8 == 48 || i8 == 80;
                if (!(i7 == 3 || i7 == 5)) {
                    z = false;
                }
                int i9 = Integer.MIN_VALUE;
                if (z2) {
                    i3 = Integer.MIN_VALUE;
                    i9 = 1073741824;
                } else {
                    i3 = z ? 1073741824 : Integer.MIN_VALUE;
                }
                int i10 = jbf2.width;
                if (i10 != -2) {
                    if (i10 == -1) {
                        i10 = paddingLeft;
                    }
                    i9 = 1073741824;
                } else {
                    i10 = paddingLeft;
                }
                int i11 = jbf2.height;
                if (i11 == -2) {
                    i11 = measuredHeight;
                    i5 = i3;
                } else if (i11 == -1) {
                    i11 = measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i10, i9), View.MeasureSpec.makeMeasureSpec(i11, i5));
                if (z2) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i4++;
        }
        View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.K0 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.L0 = true;
        q();
        this.L0 = false;
        int childCount2 = getChildCount();
        for (int i12 = 0; i12 < childCount2; i12++) {
            View childAt2 = getChildAt(i12);
            if (childAt2.getVisibility() != 8 && ((jbf = (jbf) childAt2.getLayoutParams()) == null || !jbf.a)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (((float) paddingLeft) * jbf.c), 1073741824), this.K0);
            }
        }
    }

    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3;
        int i4;
        ibf i5;
        int childCount = getChildCount();
        if ((i & 2) != 0) {
            i3 = childCount;
            i4 = 0;
            i2 = 1;
        } else {
            i4 = childCount - 1;
            i3 = -1;
            i2 = -1;
        }
        while (i4 != i3) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() == 0 && (i5 = i(childAt)) != null && i5.b == this.x0 && childAt.requestFocus(i, rect)) {
                return true;
            }
            i4 += i2;
        }
        return false;
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof lbf)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        lbf lbf = (lbf) parcelable;
        super.onRestoreInstanceState(lbf.a);
        tia tia = this.w0;
        ClassLoader classLoader = lbf.X;
        if (tia != null) {
            tia.e(lbf.o, classLoader);
            v(lbf.c, 0, false, true);
            return;
        }
        this.y0 = lbf.c;
        this.z0 = lbf.o;
        this.A0 = classLoader;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [lbf, android.os.Parcelable, z] */
    public final Parcelable onSaveInstanceState() {
        Bundle bundle;
        ? zVar = new z(super.onSaveInstanceState());
        zVar.c = this.x0;
        fi5 fi5 = this.w0;
        if (fi5 != null) {
            fi5 fi52 = fi5;
            if (fi52.f || fi52.e.g() <= 0) {
                bundle = null;
            } else {
                kr7 kr7 = fi52.e;
                kr7.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                synchronized (kr7.c) {
                    for (Map.Entry entry : ((LinkedHashMap) kr7.b.b).entrySet()) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                for (String remove : fi52.g.keySet()) {
                    linkedHashMap.remove(remove);
                }
                ei5[] ei5Arr = new ei5[linkedHashMap.size()];
                linkedHashMap.values().toArray(ei5Arr);
                bundle = new Bundle();
                bundle.putParcelableArray("states", ei5Arr);
            }
            for (String str : fi52.g.keySet()) {
                a aVar = (a) fi52.g.get(str);
                if (aVar != null && aVar.p0()) {
                    if (bundle == null) {
                        bundle = new Bundle();
                    }
                    c cVar = fi52.c;
                    cVar.W(bundle, "f" + str, aVar);
                }
            }
            zVar.o = bundle;
        }
        return zVar;
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            int i5 = this.E0;
            s(i, i3, i5, i5);
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        tia tia;
        int i = this.T0;
        boolean z = false;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (tia = this.w0) == null || tia.b() == 0) {
            return false;
        }
        if (this.Z0 == null) {
            this.Z0 = VelocityTracker.obtain();
        }
        this.Z0.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.B0.abortAnimation();
            this.N0 = false;
            q();
            float x = motionEvent.getX();
            this.W0 = x;
            this.U0 = x;
            float y = motionEvent.getY();
            this.X0 = y;
            this.V0 = y;
            this.Y0 = motionEvent.getPointerId(0);
        } else if (action != 1) {
            if (action == 2) {
                if (!this.P0) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.Y0);
                    if (findPointerIndex == -1) {
                        z = t();
                    } else {
                        float x2 = motionEvent.getX(findPointerIndex);
                        float abs = Math.abs(x2 - this.U0);
                        float y2 = motionEvent.getY(findPointerIndex);
                        float abs2 = Math.abs(y2 - this.V0);
                        if (abs > ((float) i) && abs > abs2) {
                            this.P0 = true;
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                            float f = this.W0;
                            float f2 = (float) i;
                            this.U0 = x2 - f > 0.0f ? f + f2 : f - f2;
                            this.V0 = y2;
                            setScrollState(1);
                            setScrollingCacheEnabled(true);
                            ViewParent parent2 = getParent();
                            if (parent2 != null) {
                                parent2.requestDisallowInterceptTouchEvent(true);
                            }
                        }
                    }
                }
                if (this.P0) {
                    z = p(motionEvent.getX(motionEvent.findPointerIndex(this.Y0)));
                }
            } else if (action != 3) {
                if (action == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    this.U0 = motionEvent.getX(actionIndex);
                    this.Y0 = motionEvent.getPointerId(actionIndex);
                } else if (action == 6) {
                    m(motionEvent);
                    this.U0 = motionEvent.getX(motionEvent.findPointerIndex(this.Y0));
                }
            } else if (this.P0) {
                u(this.x0, 0, true, false);
                z = t();
            }
        } else if (this.P0) {
            VelocityTracker velocityTracker = this.Z0;
            velocityTracker.computeCurrentVelocity(1000, (float) this.b1);
            int xVelocity = (int) velocityTracker.getXVelocity(this.Y0);
            this.N0 = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            ibf j = j();
            float f3 = (float) clientWidth;
            float f4 = ((float) this.E0) / f3;
            int i2 = j.b;
            float f5 = ((((float) scrollX) / f3) - j.e) / (j.d + f4);
            if (Math.abs((int) (motionEvent.getX(motionEvent.findPointerIndex(this.Y0)) - this.W0)) <= this.c1 || Math.abs(xVelocity) <= this.a1) {
                i2 += (int) (f5 + (i2 >= this.x0 ? 0.4f : 0.6f));
            } else if (xVelocity <= 0) {
                i2++;
            }
            ArrayList arrayList = this.b;
            if (arrayList.size() > 0) {
                i2 = Math.max(((ibf) arrayList.get(0)).b, Math.min(i2, ((ibf) rf0.e(arrayList, 1)).b));
            }
            v(i2, xVelocity, true, true);
            z = t();
        }
        if (z) {
            WeakHashMap weakHashMap = eaf.a;
            postInvalidateOnAnimation();
        }
        return true;
    }

    public final boolean p(float f) {
        boolean z;
        boolean z2;
        float f2 = this.U0 - f;
        this.U0 = f;
        float scrollX = ((float) getScrollX()) + f2;
        float clientWidth = (float) getClientWidth();
        float f3 = this.I0 * clientWidth;
        float f4 = this.J0 * clientWidth;
        ArrayList arrayList = this.b;
        boolean z3 = false;
        ibf ibf = (ibf) arrayList.get(0);
        ibf ibf2 = (ibf) rf0.e(arrayList, 1);
        if (ibf.b != 0) {
            f3 = ibf.e * clientWidth;
            z = false;
        } else {
            z = true;
        }
        if (ibf2.b != this.w0.b() - 1) {
            f4 = ibf2.e * clientWidth;
            z2 = false;
        } else {
            z2 = true;
        }
        if (scrollX < f3) {
            if (z) {
                this.e1.onPull(Math.abs(f3 - scrollX) / clientWidth);
                z3 = true;
            }
            scrollX = f3;
        } else if (scrollX > f4) {
            if (z2) {
                this.f1.onPull(Math.abs(scrollX - f4) / clientWidth);
                z3 = true;
            }
            scrollX = f4;
        }
        int i = (int) scrollX;
        this.U0 = (scrollX - ((float) i)) + this.U0;
        scrollTo(i, getScrollY());
        o(i);
        return z3;
    }

    public final void q() {
        r(this.x0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0058, code lost:
        if (r10 == r11) goto L_0x005f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void r(int r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r0.x0
            if (r2 == r1) goto L_0x000f
            ibf r2 = r0.k(r2)
            r0.x0 = r1
            goto L_0x0010
        L_0x000f:
            r2 = 0
        L_0x0010:
            tia r1 = r0.w0
            if (r1 != 0) goto L_0x0015
            return
        L_0x0015:
            boolean r1 = r0.N0
            if (r1 == 0) goto L_0x001a
            return
        L_0x001a:
            android.os.IBinder r1 = r17.getWindowToken()
            if (r1 != 0) goto L_0x0021
            return
        L_0x0021:
            tia r1 = r0.w0
            r1.f(r0)
            int r1 = r0.O0
            int r4 = r0.x0
            int r4 = r4 - r1
            r5 = 0
            int r4 = java.lang.Math.max(r5, r4)
            tia r6 = r0.w0
            int r6 = r6.b()
            int r7 = r6 + -1
            int r8 = r0.x0
            int r8 = r8 + r1
            int r1 = java.lang.Math.min(r7, r8)
            int r7 = r0.a
            if (r6 != r7) goto L_0x0350
            r7 = r5
        L_0x0044:
            java.util.ArrayList r8 = r0.b
            int r9 = r8.size()
            if (r7 >= r9) goto L_0x005e
            java.lang.Object r9 = r8.get(r7)
            ibf r9 = (defpackage.ibf) r9
            int r10 = r9.b
            int r11 = r0.x0
            if (r10 < r11) goto L_0x005b
            if (r10 != r11) goto L_0x005e
            goto L_0x005f
        L_0x005b:
            int r7 = r7 + 1
            goto L_0x0044
        L_0x005e:
            r9 = 0
        L_0x005f:
            if (r9 != 0) goto L_0x0069
            if (r6 <= 0) goto L_0x0069
            int r9 = r0.x0
            ibf r9 = r0.a(r9, r7)
        L_0x0069:
            r10 = 1
            if (r9 == 0) goto L_0x02af
            int r12 = r7 + -1
            if (r12 < 0) goto L_0x0077
            java.lang.Object r13 = r8.get(r12)
            ibf r13 = (defpackage.ibf) r13
            goto L_0x0078
        L_0x0077:
            r13 = 0
        L_0x0078:
            int r14 = r17.getClientWidth()
            r15 = 1073741824(0x40000000, float:2.0)
            if (r14 > 0) goto L_0x0082
            r3 = 0
            goto L_0x008e
        L_0x0082:
            float r11 = r9.d
            float r11 = r15 - r11
            int r3 = r17.getPaddingLeft()
            float r3 = (float) r3
            float r5 = (float) r14
            float r3 = r3 / r5
            float r3 = r3 + r11
        L_0x008e:
            int r5 = r0.x0
            int r5 = r5 - r10
            r11 = 0
        L_0x0092:
            if (r5 < 0) goto L_0x00eb
            int r16 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r16 < 0) goto L_0x00bf
            if (r5 >= r4) goto L_0x00bf
            if (r13 != 0) goto L_0x009d
            goto L_0x00eb
        L_0x009d:
            int r10 = r13.b
            if (r5 != r10) goto L_0x00e7
            boolean r10 = r13.c
            if (r10 != 0) goto L_0x00e7
            r8.remove(r12)
            tia r10 = r0.w0
            androidx.fragment.app.a r13 = r13.a
            r10.a(r0, r5, r13)
            int r12 = r12 + -1
            int r7 = r7 + -1
            if (r12 < 0) goto L_0x00bc
            java.lang.Object r10 = r8.get(r12)
            ibf r10 = (defpackage.ibf) r10
            goto L_0x00bd
        L_0x00bc:
            r10 = 0
        L_0x00bd:
            r13 = r10
            goto L_0x00e7
        L_0x00bf:
            if (r13 == 0) goto L_0x00d3
            int r10 = r13.b
            if (r5 != r10) goto L_0x00d3
            float r10 = r13.d
            float r11 = r11 + r10
            int r12 = r12 + -1
            if (r12 < 0) goto L_0x00bc
            java.lang.Object r10 = r8.get(r12)
            ibf r10 = (defpackage.ibf) r10
            goto L_0x00bd
        L_0x00d3:
            int r10 = r12 + 1
            ibf r10 = r0.a(r5, r10)
            float r10 = r10.d
            float r11 = r11 + r10
            int r7 = r7 + 1
            if (r12 < 0) goto L_0x00bc
            java.lang.Object r10 = r8.get(r12)
            ibf r10 = (defpackage.ibf) r10
            goto L_0x00bd
        L_0x00e7:
            int r5 = r5 + -1
            r10 = 1
            goto L_0x0092
        L_0x00eb:
            float r3 = r9.d
            int r4 = r7 + 1
            int r5 = (r3 > r15 ? 1 : (r3 == r15 ? 0 : -1))
            if (r5 >= 0) goto L_0x016e
            int r5 = r8.size()
            if (r4 >= r5) goto L_0x0100
            java.lang.Object r5 = r8.get(r4)
            ibf r5 = (defpackage.ibf) r5
            goto L_0x0101
        L_0x0100:
            r5 = 0
        L_0x0101:
            if (r14 > 0) goto L_0x0105
            r10 = 0
            goto L_0x010d
        L_0x0105:
            int r10 = r17.getPaddingRight()
            float r10 = (float) r10
            float r11 = (float) r14
            float r10 = r10 / r11
            float r10 = r10 + r15
        L_0x010d:
            int r11 = r0.x0
            r12 = 1
            int r11 = r11 + r12
            r12 = r4
        L_0x0112:
            if (r11 >= r6) goto L_0x016e
            int r13 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r13 < 0) goto L_0x013e
            if (r11 <= r1) goto L_0x013e
            if (r5 != 0) goto L_0x011d
            goto L_0x016e
        L_0x011d:
            int r13 = r5.b
            if (r11 != r13) goto L_0x016b
            boolean r13 = r5.c
            if (r13 != 0) goto L_0x016b
            r8.remove(r12)
            tia r13 = r0.w0
            androidx.fragment.app.a r5 = r5.a
            r13.a(r0, r11, r5)
            int r5 = r8.size()
            if (r12 >= r5) goto L_0x013c
            java.lang.Object r5 = r8.get(r12)
            ibf r5 = (defpackage.ibf) r5
            goto L_0x016b
        L_0x013c:
            r5 = 0
            goto L_0x016b
        L_0x013e:
            if (r5 == 0) goto L_0x0156
            int r13 = r5.b
            if (r11 != r13) goto L_0x0156
            float r5 = r5.d
            float r3 = r3 + r5
            int r12 = r12 + 1
            int r5 = r8.size()
            if (r12 >= r5) goto L_0x013c
            java.lang.Object r5 = r8.get(r12)
            ibf r5 = (defpackage.ibf) r5
            goto L_0x016b
        L_0x0156:
            ibf r5 = r0.a(r11, r12)
            int r12 = r12 + 1
            float r5 = r5.d
            float r3 = r3 + r5
            int r5 = r8.size()
            if (r12 >= r5) goto L_0x013c
            java.lang.Object r5 = r8.get(r12)
            ibf r5 = (defpackage.ibf) r5
        L_0x016b:
            int r11 = r11 + 1
            goto L_0x0112
        L_0x016e:
            tia r1 = r0.w0
            int r1 = r1.b()
            int r3 = r17.getClientWidth()
            if (r3 <= 0) goto L_0x0180
            int r5 = r0.E0
            float r5 = (float) r5
            float r3 = (float) r3
            float r5 = r5 / r3
            goto L_0x0181
        L_0x0180:
            r5 = 0
        L_0x0181:
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r2 == 0) goto L_0x020f
            int r6 = r2.b
            int r10 = r9.b
            if (r6 >= r10) goto L_0x01d1
            float r10 = r2.e
            float r2 = r2.d
            float r10 = r10 + r2
            float r10 = r10 + r5
            r2 = 1
            int r6 = r6 + r2
            r2 = 0
        L_0x0194:
            int r11 = r9.b
            if (r6 > r11) goto L_0x020f
            int r11 = r8.size()
            if (r2 >= r11) goto L_0x020f
            java.lang.Object r11 = r8.get(r2)
            ibf r11 = (defpackage.ibf) r11
        L_0x01a4:
            int r12 = r11.b
            if (r6 <= r12) goto L_0x01b9
            int r12 = r8.size()
            r13 = 1
            int r12 = r12 - r13
            if (r2 >= r12) goto L_0x01b9
            int r2 = r2 + 1
            java.lang.Object r11 = r8.get(r2)
            ibf r11 = (defpackage.ibf) r11
            goto L_0x01a4
        L_0x01b9:
            int r12 = r11.b
            if (r6 >= r12) goto L_0x01c8
            tia r12 = r0.w0
            r12.getClass()
            float r12 = r3 + r5
            float r10 = r10 + r12
            int r6 = r6 + 1
            goto L_0x01b9
        L_0x01c8:
            r11.e = r10
            float r11 = r11.d
            float r11 = r11 + r5
            float r10 = r10 + r11
            int r6 = r6 + 1
            goto L_0x0194
        L_0x01d1:
            if (r6 <= r10) goto L_0x020f
            int r10 = r8.size()
            r11 = 1
            int r10 = r10 - r11
            float r2 = r2.e
            int r6 = r6 - r11
        L_0x01dc:
            int r11 = r9.b
            if (r6 < r11) goto L_0x020f
            if (r10 < 0) goto L_0x020f
            java.lang.Object r11 = r8.get(r10)
            ibf r11 = (defpackage.ibf) r11
        L_0x01e8:
            int r12 = r11.b
            if (r6 >= r12) goto L_0x01f7
            if (r10 <= 0) goto L_0x01f7
            int r10 = r10 + -1
            java.lang.Object r11 = r8.get(r10)
            ibf r11 = (defpackage.ibf) r11
            goto L_0x01e8
        L_0x01f7:
            int r12 = r11.b
            if (r6 <= r12) goto L_0x0206
            tia r12 = r0.w0
            r12.getClass()
            float r12 = r3 + r5
            float r2 = r2 - r12
            int r6 = r6 + -1
            goto L_0x01f7
        L_0x0206:
            float r12 = r11.d
            float r12 = r12 + r5
            float r2 = r2 - r12
            r11.e = r2
            int r6 = r6 + -1
            goto L_0x01dc
        L_0x020f:
            int r2 = r8.size()
            float r6 = r9.e
            int r10 = r9.b
            int r11 = r10 + -1
            if (r10 != 0) goto L_0x021d
            r12 = r6
            goto L_0x0220
        L_0x021d:
            r12 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
        L_0x0220:
            r0.I0 = r12
            r12 = 1
            int r1 = r1 - r12
            if (r10 != r1) goto L_0x022b
            float r10 = r9.d
            float r10 = r10 + r6
            float r10 = r10 - r3
            goto L_0x022e
        L_0x022b:
            r10 = 2139095039(0x7f7fffff, float:3.4028235E38)
        L_0x022e:
            r0.J0 = r10
            int r7 = r7 - r12
        L_0x0231:
            if (r7 < 0) goto L_0x0257
            java.lang.Object r10 = r8.get(r7)
            ibf r10 = (defpackage.ibf) r10
        L_0x0239:
            int r12 = r10.b
            if (r11 <= r12) goto L_0x0248
            tia r12 = r0.w0
            int r11 = r11 + -1
            r12.getClass()
            float r12 = r3 + r5
            float r6 = r6 - r12
            goto L_0x0239
        L_0x0248:
            float r13 = r10.d
            float r13 = r13 + r5
            float r6 = r6 - r13
            r10.e = r6
            if (r12 != 0) goto L_0x0252
            r0.I0 = r6
        L_0x0252:
            int r7 = r7 + -1
            int r11 = r11 + -1
            goto L_0x0231
        L_0x0257:
            float r6 = r9.e
            float r7 = r9.d
            float r6 = r6 + r7
            float r6 = r6 + r5
            int r7 = r9.b
            r10 = 1
            int r7 = r7 + r10
        L_0x0261:
            if (r4 >= r2) goto L_0x028b
            java.lang.Object r10 = r8.get(r4)
            ibf r10 = (defpackage.ibf) r10
        L_0x0269:
            int r11 = r10.b
            if (r7 >= r11) goto L_0x0278
            tia r11 = r0.w0
            int r7 = r7 + 1
            r11.getClass()
            float r11 = r3 + r5
            float r6 = r6 + r11
            goto L_0x0269
        L_0x0278:
            if (r11 != r1) goto L_0x0280
            float r11 = r10.d
            float r11 = r11 + r6
            float r11 = r11 - r3
            r0.J0 = r11
        L_0x0280:
            r10.e = r6
            float r10 = r10.d
            float r10 = r10 + r5
            float r6 = r6 + r10
            int r4 = r4 + 1
            int r7 = r7 + 1
            goto L_0x0261
        L_0x028b:
            tia r1 = r0.w0
            androidx.fragment.app.a r2 = r9.a
            fi5 r1 = (fi5) r1
            r1.getClass()
            androidx.fragment.app.a r3 = r1.h
            r4 = 0
            if (r2 == r3) goto L_0x02b0
            if (r3 == 0) goto L_0x02a3
            r3.a1(r4)
            androidx.fragment.app.a r3 = r1.h
            r3.d1(r4)
        L_0x02a3:
            if (r2 == 0) goto L_0x02ac
            r3 = 1
            r2.a1(r3)
            r2.d1(r3)
        L_0x02ac:
            r1.h = r2
            goto L_0x02b0
        L_0x02af:
            r4 = r5
        L_0x02b0:
            tia r1 = r0.w0
            fi5 r1 = (fi5) r1
            hd0 r2 = r1.d
            if (r2 == 0) goto L_0x02ce
            boolean r3 = r2.g
            if (r3 != 0) goto L_0x02c6
            androidx.fragment.app.c r3 = r2.q
            r5 = 1
            r3.B(r2, r5)
            r2 = 0
            r1.d = r2
            goto L_0x02cf
        L_0x02c6:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "This transaction is already being added to the back stack"
            r0.<init>(r1)
            throw r0
        L_0x02ce:
            r2 = 0
        L_0x02cf:
            int r1 = r17.getChildCount()
            r3 = r4
        L_0x02d4:
            if (r3 >= r1) goto L_0x0302
            android.view.View r5 = r0.getChildAt(r3)
            android.view.ViewGroup$LayoutParams r6 = r5.getLayoutParams()
            jbf r6 = (defpackage.jbf) r6
            r6.getClass()
            boolean r7 = r6.a
            if (r7 != 0) goto L_0x02fe
            float r7 = r6.c
            r8 = 0
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 != 0) goto L_0x02ff
            ibf r5 = r0.i(r5)
            if (r5 == 0) goto L_0x02ff
            float r7 = r5.d
            r6.c = r7
            int r5 = r5.b
            r6.getClass()
            goto L_0x02ff
        L_0x02fe:
            r8 = 0
        L_0x02ff:
            int r3 = r3 + 1
            goto L_0x02d4
        L_0x0302:
            boolean r1 = r17.hasFocus()
            if (r1 == 0) goto L_0x034f
            android.view.View r1 = r17.findFocus()
            if (r1 == 0) goto L_0x0324
        L_0x030e:
            android.view.ViewParent r3 = r1.getParent()
            if (r3 == r0) goto L_0x031f
            if (r3 == 0) goto L_0x0324
            boolean r1 = r3 instanceof android.view.View
            if (r1 != 0) goto L_0x031b
            goto L_0x0324
        L_0x031b:
            r1 = r3
            android.view.View r1 = (android.view.View) r1
            goto L_0x030e
        L_0x031f:
            ibf r3 = r0.i(r1)
            goto L_0x0325
        L_0x0324:
            r3 = r2
        L_0x0325:
            if (r3 == 0) goto L_0x032d
            int r1 = r3.b
            int r2 = r0.x0
            if (r1 == r2) goto L_0x034f
        L_0x032d:
            r5 = r4
        L_0x032e:
            int r1 = r17.getChildCount()
            if (r5 >= r1) goto L_0x034f
            android.view.View r1 = r0.getChildAt(r5)
            ibf r2 = r0.i(r1)
            if (r2 == 0) goto L_0x034c
            int r2 = r2.b
            int r3 = r0.x0
            if (r2 != r3) goto L_0x034c
            r2 = 2
            boolean r1 = r1.requestFocus(r2)
            if (r1 == 0) goto L_0x034c
            goto L_0x034f
        L_0x034c:
            int r5 = r5 + 1
            goto L_0x032e
        L_0x034f:
            return
        L_0x0350:
            android.content.res.Resources r1 = r17.getResources()     // Catch:{ NotFoundException -> 0x035d }
            int r2 = r17.getId()     // Catch:{ NotFoundException -> 0x035d }
            java.lang.String r1 = r1.getResourceName(r2)     // Catch:{ NotFoundException -> 0x035d }
            goto L_0x0365
        L_0x035d:
            int r1 = r17.getId()
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
        L_0x0365:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: "
            r3.<init>(r4)
            int r4 = r0.a
            java.lang.String r5 = ", found: "
            java.lang.String r7 = " Pager id: "
            th2.l(r3, r4, r5, r6, r7)
            r3.append(r1)
            java.lang.String r1 = " Pager class: "
            r3.append(r1)
            java.lang.Class r1 = r17.getClass()
            r3.append(r1)
            java.lang.String r1 = " Problematic adapter: "
            r3.append(r1)
            tia r0 = r0.w0
            java.lang.Class r0 = r0.getClass()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.r(int):void");
    }

    public final void removeView(View view) {
        if (this.L0) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public final void s(int i, int i2, int i3, int i4) {
        if (i2 <= 0 || this.b.isEmpty()) {
            ibf k = k(this.x0);
            int min = (int) ((k != null ? Math.min(k.e, this.J0) : 0.0f) * ((float) ((i - getPaddingLeft()) - getPaddingRight())));
            if (min != getScrollX()) {
                e(false);
                scrollTo(min, getScrollY());
            }
        } else if (!this.B0.isFinished()) {
            this.B0.setFinalX(getCurrentItem() * getClientWidth());
        } else {
            scrollTo((int) ((((float) getScrollX()) / ((float) (((i2 - getPaddingLeft()) - getPaddingRight()) + i4))) * ((float) (((i - getPaddingLeft()) - getPaddingRight()) + i3))), getScrollY());
        }
    }

    public void setAdapter(tia tia) {
        ArrayList arrayList;
        tia tia2 = this.w0;
        if (tia2 != null) {
            synchronized (tia2) {
                tia2.b = null;
            }
            this.w0.f(this);
            int i = 0;
            while (true) {
                arrayList = this.b;
                if (i >= arrayList.size()) {
                    break;
                }
                ibf ibf = (ibf) arrayList.get(i);
                this.w0.a(this, ibf.b, ibf.a);
                i++;
            }
            fi5 fi5 = this.w0;
            hd0 hd0 = fi5.d;
            if (hd0 != null) {
                if (!hd0.g) {
                    hd0.q.B(hd0, true);
                    fi5.d = null;
                } else {
                    throw new IllegalStateException("This transaction is already being added to the back stack");
                }
            }
            arrayList.clear();
            int i2 = 0;
            while (i2 < getChildCount()) {
                if (!((jbf) getChildAt(i2).getLayoutParams()).a) {
                    removeViewAt(i2);
                    i2--;
                }
                i2++;
            }
            this.x0 = 0;
            scrollTo(0, 0);
        }
        this.w0 = tia;
        this.a = 0;
        if (tia != null) {
            if (this.D0 == null) {
                this.D0 = new cx3(3, this);
            }
            tia tia3 = this.w0;
            cx3 cx3 = this.D0;
            synchronized (tia3) {
                tia3.b = cx3;
            }
            this.N0 = false;
            boolean z = this.g1;
            this.g1 = true;
            this.a = this.w0.b();
            if (this.y0 >= 0) {
                this.w0.e(this.z0, this.A0);
                v(this.y0, 0, false, true);
                this.y0 = -1;
                this.z0 = null;
                this.A0 = null;
            } else if (!z) {
                q();
            } else {
                requestLayout();
            }
        }
        ArrayList arrayList2 = this.l1;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            int size = this.l1.size();
            for (int i3 = 0; i3 < size; i3++) {
                f9e f9e = (f9e) this.l1.get(i3);
                TabLayout tabLayout = f9e.b;
                if (tabLayout.g1 == this) {
                    tabLayout.p(tia, f9e.a);
                }
            }
        }
    }

    public void setCurrentItem(int i) {
        this.N0 = false;
        v(i, 0, !this.g1, false);
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1) {
            i = 1;
        }
        if (i != this.O0) {
            this.O0 = i;
            q();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(kbf kbf) {
        this.k1 = kbf;
    }

    public void setPageMargin(int i) {
        int i2 = this.E0;
        this.E0 = i;
        int width = getWidth();
        s(width, width, i, i2);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.F0 = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setScrollState(int i) {
        if (this.n1 != i) {
            this.n1 = i;
            kbf kbf = this.k1;
            if (kbf != null) {
                kbf.k(i);
            }
            ArrayList arrayList = this.j1;
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    kbf kbf2 = (kbf) this.j1.get(i2);
                    if (kbf2 != null) {
                        kbf2.k(i);
                    }
                }
            }
        }
    }

    public final boolean t() {
        this.Y0 = -1;
        this.P0 = false;
        this.Q0 = false;
        VelocityTracker velocityTracker = this.Z0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.Z0 = null;
        }
        this.e1.onRelease();
        this.f1.onRelease();
        return this.e1.isFinished() || this.f1.isFinished();
    }

    public final void u(int i, int i2, boolean z, boolean z2) {
        int scrollX;
        int i3;
        Scroller scroller = this.B0;
        ibf k = k(i);
        int max = k != null ? (int) (Math.max(this.I0, Math.min(k.e, this.J0)) * ((float) getClientWidth())) : 0;
        if (z) {
            if (getChildCount() == 0) {
                setScrollingCacheEnabled(false);
            } else {
                if (scroller == null || scroller.isFinished()) {
                    scrollX = getScrollX();
                } else {
                    scrollX = this.C0 ? scroller.getCurrX() : scroller.getStartX();
                    scroller.abortAnimation();
                    setScrollingCacheEnabled(false);
                }
                int i4 = scrollX;
                int scrollY = getScrollY();
                int i5 = max - i4;
                int i6 = 0 - scrollY;
                if (i5 == 0 && i6 == 0) {
                    e(false);
                    q();
                    setScrollState(0);
                } else {
                    setScrollingCacheEnabled(true);
                    setScrollState(2);
                    int clientWidth = getClientWidth();
                    int i7 = clientWidth / 2;
                    float f = (float) clientWidth;
                    float f2 = (float) i7;
                    float sin = (((float) Math.sin((double) ((Math.min(1.0f, (((float) Math.abs(i5)) * 1.0f) / f) - 0.5f) * 0.47123894f))) * f2) + f2;
                    int abs = Math.abs(i2);
                    if (abs > 0) {
                        i3 = Math.round(Math.abs(sin / ((float) abs)) * 1000.0f) * 4;
                    } else {
                        this.w0.getClass();
                        i3 = (int) (((((float) Math.abs(i5)) / ((f * 1.0f) + ((float) this.E0))) + 1.0f) * 100.0f);
                    }
                    int min = Math.min(i3, 600);
                    this.C0 = false;
                    this.B0.startScroll(i4, scrollY, i5, i6, min);
                    WeakHashMap weakHashMap = eaf.a;
                    postInvalidateOnAnimation();
                }
            }
            if (z2) {
                g(i);
                return;
            }
            return;
        }
        if (z2) {
            g(i);
        }
        e(false);
        scrollTo(max, 0);
        o(max);
    }

    public final void v(int i, int i2, boolean z, boolean z2) {
        tia tia = this.w0;
        boolean z3 = false;
        if (tia == null || tia.b() <= 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        ArrayList arrayList = this.b;
        if (z2 || this.x0 != i || arrayList.size() == 0) {
            if (i < 0) {
                i = 0;
            } else if (i >= this.w0.b()) {
                i = this.w0.b() - 1;
            }
            int i3 = this.O0;
            int i4 = this.x0;
            if (i > i4 + i3 || i < i4 - i3) {
                for (int i5 = 0; i5 < arrayList.size(); i5++) {
                    ((ibf) arrayList.get(i5)).c = true;
                }
            }
            if (this.x0 != i) {
                z3 = true;
            }
            if (this.g1) {
                this.x0 = i;
                if (z3) {
                    g(i);
                }
                requestLayout();
                return;
            }
            r(i);
            u(i, i2, z, z3);
            return;
        }
        setScrollingCacheEnabled(false);
    }

    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.F0;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [android.view.ViewGroup$LayoutParams, jbf] */
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        ? layoutParams = new ViewGroup.LayoutParams(context, attributeSet);
        layoutParams.c = 0.0f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o1);
        layoutParams.b = obtainStyledAttributes.getInteger(0, 48);
        obtainStyledAttributes.recycle();
        return layoutParams;
    }

    public void setPageMarginDrawable(int i) {
        setPageMarginDrawable(gq3.b(getContext(), i));
    }
}
