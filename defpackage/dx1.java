package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.transition.Transition;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: dx1  reason: default package */
public final class dx1 extends zl8 implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public static final int Q0 = asb.abc_cascading_menu_item_layout;
    public final za6 A0 = new za6((Object) this);
    public int B0;
    public int C0;
    public View D0;
    public View E0;
    public int F0;
    public boolean G0;
    public boolean H0;
    public int I0;
    public int J0;
    public boolean K0;
    public boolean L0;
    public gm8 M0;
    public ViewTreeObserver N0;
    public PopupWindow.OnDismissListener O0;
    public boolean P0;
    public final int X;
    public final boolean Y;
    public final Handler Z;
    public final Context b;
    public final int c;
    public final int o;
    public final ArrayList w0 = new ArrayList();
    public final ArrayList x0 = new ArrayList();
    public final tn y0 = new tn(2, this);
    public final ck z0 = new ck(1, this);

    public dx1(Context context, View view, int i, int i2, boolean z) {
        int i3 = 0;
        this.B0 = 0;
        this.C0 = 0;
        this.b = context;
        this.D0 = view;
        this.o = i;
        this.X = i2;
        this.Y = z;
        this.K0 = false;
        this.F0 = view.getLayoutDirection() != 1 ? 1 : i3;
        Resources resources = context.getResources();
        this.c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(anb.abc_config_prefDialogWidth));
        this.Z = new Handler();
    }

    public final boolean a() {
        ArrayList arrayList = this.x0;
        return arrayList.size() > 0 && ((cx1) arrayList.get(0)).a.O0.isShowing();
    }

    public final boolean b(w0e w0e) {
        Iterator it = this.x0.iterator();
        while (it.hasNext()) {
            cx1 cx1 = (cx1) it.next();
            if (w0e == cx1.b) {
                cx1.a.c.requestFocus();
                return true;
            }
        }
        if (!w0e.hasVisibleItems()) {
            return false;
        }
        l(w0e);
        gm8 gm8 = this.M0;
        if (gm8 != null) {
            gm8.x(w0e);
        }
        return true;
    }

    public final boolean c() {
        return false;
    }

    public final void dismiss() {
        ArrayList arrayList = this.x0;
        int size = arrayList.size();
        if (size > 0) {
            cx1[] cx1Arr = (cx1[]) arrayList.toArray(new cx1[size]);
            for (int i = size - 1; i >= 0; i--) {
                cx1 cx1 = cx1Arr[i];
                if (cx1.a.O0.isShowing()) {
                    cx1.a.dismiss();
                }
            }
        }
    }

    public final void e(gm8 gm8) {
        this.M0 = gm8;
    }

    public final void f(pl8 pl8, boolean z) {
        ArrayList arrayList = this.x0;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (pl8 == ((cx1) arrayList.get(i)).b) {
                break;
            } else {
                i++;
            }
        }
        if (i >= 0) {
            int i2 = i + 1;
            if (i2 < arrayList.size()) {
                ((cx1) arrayList.get(i2)).b.c(false);
            }
            cx1 cx1 = (cx1) arrayList.remove(i);
            cx1.b.r(this);
            boolean z2 = this.P0;
            fm8 fm8 = cx1.a;
            if (z2) {
                cm8.b(fm8.O0, (Transition) null);
                fm8.O0.setAnimationStyle(0);
            }
            fm8.dismiss();
            int size2 = arrayList.size();
            if (size2 > 0) {
                this.F0 = ((cx1) arrayList.get(size2 - 1)).c;
            } else {
                this.F0 = this.D0.getLayoutDirection() == 1 ? 0 : 1;
            }
            if (size2 == 0) {
                dismiss();
                gm8 gm8 = this.M0;
                if (gm8 != null) {
                    gm8.f(pl8, true);
                }
                ViewTreeObserver viewTreeObserver = this.N0;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        this.N0.removeGlobalOnLayoutListener(this.y0);
                    }
                    this.N0 = null;
                }
                this.E0.removeOnAttachStateChangeListener(this.z0);
                this.O0.onDismiss();
            } else if (z) {
                ((cx1) arrayList.get(0)).b.c(false);
            }
        }
    }

    public final void g() {
        if (!a()) {
            ArrayList arrayList = this.w0;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                v((pl8) it.next());
            }
            arrayList.clear();
            View view = this.D0;
            this.E0 = view;
            if (view != null) {
                boolean z = this.N0 == null;
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                this.N0 = viewTreeObserver;
                if (z) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.y0);
                }
                this.E0.addOnAttachStateChangeListener(this.z0);
            }
        }
    }

    public final void i() {
        Iterator it = this.x0.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((cx1) it.next()).a.c.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((ml8) adapter).notifyDataSetChanged();
        }
    }

    public final yo4 j() {
        ArrayList arrayList = this.x0;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((cx1) rf0.e(arrayList, 1)).a.c;
    }

    public final void l(pl8 pl8) {
        pl8.b(this, this.b);
        if (a()) {
            v(pl8);
        } else {
            this.w0.add(pl8);
        }
    }

    public final void n(View view) {
        if (this.D0 != view) {
            this.D0 = view;
            this.C0 = Gravity.getAbsoluteGravity(this.B0, view.getLayoutDirection());
        }
    }

    public final void o(boolean z) {
        this.K0 = z;
    }

    public final void onDismiss() {
        cx1 cx1;
        ArrayList arrayList = this.x0;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                cx1 = null;
                break;
            }
            cx1 = (cx1) arrayList.get(i);
            if (!cx1.a.O0.isShowing()) {
                break;
            }
            i++;
        }
        if (cx1 != null) {
            cx1.b.c(false);
        }
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    public final void p(int i) {
        if (this.B0 != i) {
            this.B0 = i;
            this.C0 = Gravity.getAbsoluteGravity(i, this.D0.getLayoutDirection());
        }
    }

    public final void q(int i) {
        this.G0 = true;
        this.I0 = i;
    }

    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.O0 = onDismissListener;
    }

    public final void s(boolean z) {
        this.L0 = z;
    }

    public final void t(int i) {
        this.H0 = true;
        this.J0 = i;
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [fm8, xg7] */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x011f, code lost:
        if (((r8.getWidth() + r10[0]) + r5) > r11.right) goto L_0x0121;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0124, code lost:
        r8 = 1;
        r10 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x012a, code lost:
        if ((r10[0] - r5) < 0) goto L_0x0124;
     */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0194  */
    /* JADX WARNING: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void v(defpackage.pl8 r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            android.content.Context r2 = r0.b
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r2)
            ml8 r4 = new ml8
            boolean r5 = r0.Y
            int r6 = Q0
            r4.<init>(r1, r3, r5, r6)
            boolean r5 = r16.a()
            r6 = 1
            if (r5 != 0) goto L_0x0021
            boolean r5 = r0.K0
            if (r5 == 0) goto L_0x0021
            r4.c = r6
            goto L_0x002d
        L_0x0021:
            boolean r5 = r16.a()
            if (r5 == 0) goto L_0x002d
            boolean r5 = defpackage.zl8.u(r17)
            r4.c = r5
        L_0x002d:
            int r5 = r0.c
            int r5 = defpackage.zl8.m(r4, r2, r5)
            fm8 r7 = new fm8
            int r8 = r0.o
            int r9 = r0.X
            r10 = 0
            r7.<init>(r2, r10, r8, r9)
            za6 r2 = r0.A0
            r7.P0 = r2
            r7.E0 = r0
            ln r2 = r7.O0
            r2.setOnDismissListener(r0)
            android.view.View r2 = r0.D0
            r7.D0 = r2
            int r2 = r0.C0
            r7.A0 = r2
            r7.N0 = r6
            ln r2 = r7.O0
            r2.setFocusable(r6)
            ln r2 = r7.O0
            r8 = 2
            r2.setInputMethodMode(r8)
            r7.o(r4)
            r7.q(r5)
            int r2 = r0.C0
            r7.A0 = r2
            java.util.ArrayList r2 = r0.x0
            int r4 = r2.size()
            r9 = 0
            if (r4 <= 0) goto L_0x00e1
            java.lang.Object r4 = rf0.e(r2, r6)
            cx1 r4 = (defpackage.cx1) r4
            pl8 r11 = r4.b
            java.util.ArrayList r12 = r11.Y
            int r12 = r12.size()
            r13 = r9
        L_0x007f:
            if (r13 >= r12) goto L_0x0095
            android.view.MenuItem r14 = r11.getItem(r13)
            boolean r15 = r14.hasSubMenu()
            if (r15 == 0) goto L_0x0092
            android.view.SubMenu r15 = r14.getSubMenu()
            if (r1 != r15) goto L_0x0092
            goto L_0x0096
        L_0x0092:
            int r13 = r13 + 1
            goto L_0x007f
        L_0x0095:
            r14 = r10
        L_0x0096:
            if (r14 != 0) goto L_0x009a
            r6 = r10
            goto L_0x00e3
        L_0x009a:
            fm8 r11 = r4.a
            yo4 r11 = r11.c
            android.widget.ListAdapter r12 = r11.getAdapter()
            boolean r13 = r12 instanceof android.widget.HeaderViewListAdapter
            if (r13 == 0) goto L_0x00b3
            android.widget.HeaderViewListAdapter r12 = (android.widget.HeaderViewListAdapter) r12
            int r13 = r12.getHeadersCount()
            android.widget.ListAdapter r12 = r12.getWrappedAdapter()
            ml8 r12 = (defpackage.ml8) r12
            goto L_0x00b6
        L_0x00b3:
            ml8 r12 = (defpackage.ml8) r12
            r13 = r9
        L_0x00b6:
            int r15 = r12.getCount()
            r8 = r9
        L_0x00bb:
            r6 = -1
            if (r8 >= r15) goto L_0x00c9
            ul8 r10 = r12.getItem(r8)
            if (r14 != r10) goto L_0x00c5
            goto L_0x00ca
        L_0x00c5:
            int r8 = r8 + 1
            r10 = 0
            goto L_0x00bb
        L_0x00c9:
            r8 = r6
        L_0x00ca:
            if (r8 != r6) goto L_0x00cd
            goto L_0x00e2
        L_0x00cd:
            int r8 = r8 + r13
            int r6 = r11.getFirstVisiblePosition()
            int r8 = r8 - r6
            if (r8 < 0) goto L_0x00e2
            int r6 = r11.getChildCount()
            if (r8 < r6) goto L_0x00dc
            goto L_0x00e2
        L_0x00dc:
            android.view.View r6 = r11.getChildAt(r8)
            goto L_0x00e3
        L_0x00e1:
            r4 = 0
        L_0x00e2:
            r6 = 0
        L_0x00e3:
            if (r6 == 0) goto L_0x015a
            ln r8 = r7.O0
            defpackage.dm8.a(r8, r9)
            ln r8 = r7.O0
            r10 = 0
            defpackage.cm8.a(r8, r10)
            int r8 = r2.size()
            r10 = 1
            int r8 = r8 - r10
            java.lang.Object r8 = r2.get(r8)
            cx1 r8 = (defpackage.cx1) r8
            fm8 r8 = r8.a
            yo4 r8 = r8.c
            r10 = 2
            int[] r10 = new int[r10]
            r8.getLocationOnScreen(r10)
            android.graphics.Rect r11 = new android.graphics.Rect
            r11.<init>()
            android.view.View r12 = r0.E0
            r12.getWindowVisibleDisplayFrame(r11)
            int r12 = r0.F0
            r13 = 1
            if (r12 != r13) goto L_0x0127
            r10 = r10[r9]
            int r8 = r8.getWidth()
            int r8 = r8 + r10
            int r8 = r8 + r5
            int r10 = r11.right
            if (r8 <= r10) goto L_0x0124
        L_0x0121:
            r10 = r9
            r8 = 1
            goto L_0x012d
        L_0x0124:
            r8 = 1
            r10 = 1
            goto L_0x012d
        L_0x0127:
            r8 = r10[r9]
            int r8 = r8 - r5
            if (r8 >= 0) goto L_0x0121
            goto L_0x0124
        L_0x012d:
            if (r10 != r8) goto L_0x0131
            r8 = 1
            goto L_0x0132
        L_0x0131:
            r8 = r9
        L_0x0132:
            r0.F0 = r10
            r7.D0 = r6
            int r10 = r0.C0
            r11 = 5
            r10 = r10 & r11
            if (r10 != r11) goto L_0x0146
            if (r8 == 0) goto L_0x013f
            goto L_0x014f
        L_0x013f:
            int r5 = r6.getWidth()
            int r5 = 0 - r5
            goto L_0x014f
        L_0x0146:
            if (r8 == 0) goto L_0x014d
            int r5 = r6.getWidth()
            goto L_0x014f
        L_0x014d:
            int r5 = 0 - r5
        L_0x014f:
            r7.Y = r5
            r5 = 1
            r7.z0 = r5
            r7.y0 = r5
            r7.k(r9)
            goto L_0x0178
        L_0x015a:
            boolean r5 = r0.G0
            if (r5 == 0) goto L_0x0162
            int r5 = r0.I0
            r7.Y = r5
        L_0x0162:
            boolean r5 = r0.H0
            if (r5 == 0) goto L_0x016b
            int r5 = r0.J0
            r7.k(r5)
        L_0x016b:
            android.graphics.Rect r5 = r0.a
            if (r5 == 0) goto L_0x0175
            android.graphics.Rect r10 = new android.graphics.Rect
            r10.<init>(r5)
            goto L_0x0176
        L_0x0175:
            r10 = 0
        L_0x0176:
            r7.M0 = r10
        L_0x0178:
            cx1 r5 = new cx1
            int r6 = r0.F0
            r5.<init>(r7, r1, r6)
            r2.add(r5)
            r7.g()
            yo4 r2 = r7.c
            r2.setOnKeyListener(r0)
            if (r4 != 0) goto L_0x01b4
            boolean r0 = r0.L0
            if (r0 == 0) goto L_0x01b4
            java.lang.CharSequence r0 = r1.B0
            if (r0 == 0) goto L_0x01b4
            int r0 = defpackage.asb.abc_popup_menu_header_item_layout
            android.view.View r0 = r3.inflate(r0, r2, r9)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r3 = 16908310(0x1020016, float:2.387729E-38)
            android.view.View r3 = r0.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r0.setEnabled(r9)
            java.lang.CharSequence r1 = r1.B0
            r3.setText(r1)
            r1 = 0
            r2.addHeaderView(r0, r1, r9)
            r7.g()
        L_0x01b4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dx1.v(pl8):void");
    }
}
