package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Range;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.WeakHashMap;
import kotlinx.serialization.MissingFieldException;

/* renamed from: b9  reason: default package */
public final class b9 implements s3e, m15 {
    public Object X;
    public Object Y;
    public Object Z;
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public Object o;

    public /* synthetic */ b9() {
        this.a = 4;
    }

    public int A(int i, int i2) {
        ArrayList arrayList = (ArrayList) this.X;
        int size = arrayList.size();
        while (i2 < size) {
            a9 a9Var = (a9) arrayList.get(i2);
            int i3 = a9Var.a;
            if (i3 == 8) {
                int i4 = a9Var.b;
                if (i4 == i) {
                    i = a9Var.d;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (a9Var.d <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = a9Var.b;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = a9Var.d;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += a9Var.d;
                }
            }
            i2++;
        }
        return i;
    }

    public ColorStateList B() {
        od3 od3 = (od3) this.Y;
        if (od3 != null) {
            return (ColorStateList) od3.d;
        }
        return null;
    }

    public PorterDuff.Mode C() {
        od3 od3 = (od3) this.Y;
        if (od3 != null) {
            return (PorterDuff.Mode) od3.e;
        }
        return null;
    }

    public boolean D() {
        return ((ArrayList) this.o).size() > 0;
    }

    public boolean E() {
        int i = this.b;
        if (i != 1 && i != 2 && i != 4 && i != 3) {
            return false;
        }
        ArrayList arrayList = (ArrayList) this.o;
        int size = arrayList == null ? 0 : arrayList.size();
        ArrayList arrayList2 = (ArrayList) this.X;
        int size2 = size + (arrayList2 == null ? 0 : arrayList2.size());
        ArrayList arrayList3 = (ArrayList) this.Y;
        return size2 + (arrayList3 == null ? 0 : arrayList3.size()) == 1;
    }

    public void F(AttributeSet attributeSet, int i) {
        ColorStateList h;
        View view = (View) this.c;
        ydc D = ydc.D(view.getContext(), attributeSet, nwb.ViewBackgroundHelper, i, 0);
        TypedArray typedArray = (TypedArray) D.c;
        View view2 = (View) this.c;
        Context context = view2.getContext();
        int[] iArr = nwb.ViewBackgroundHelper;
        WeakHashMap weakHashMap = eaf.a;
        z9f.d(view2, context, iArr, attributeSet, (TypedArray) D.c, i, 0);
        try {
            if (typedArray.hasValue(nwb.ViewBackgroundHelper_android_background)) {
                this.b = typedArray.getResourceId(nwb.ViewBackgroundHelper_android_background, -1);
                gn gnVar = (gn) this.o;
                Context context2 = view.getContext();
                int i2 = this.b;
                synchronized (gnVar) {
                    h = gnVar.a.h(context2, i2);
                }
                if (h != null) {
                    O(h);
                }
            }
            if (typedArray.hasValue(nwb.ViewBackgroundHelper_backgroundTint)) {
                t9f.q(view, D.w(nwb.ViewBackgroundHelper_backgroundTint));
            }
            if (typedArray.hasValue(nwb.ViewBackgroundHelper_backgroundTintMode)) {
                t9f.r(view, bn4.c(typedArray.getInt(nwb.ViewBackgroundHelper_backgroundTintMode, -1), (PorterDuff.Mode) null));
            }
            D.E();
        } catch (Throwable th) {
            D.E();
            throw th;
        }
    }

    public tk6 G(long j) {
        if (this.b == 4) {
            this.b = 5;
            return new tk6(this, j);
        }
        throw new IllegalStateException(("state: " + this.b).toString());
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [a9, java.lang.Object] */
    public a9 H(Object obj, int i, int i2, int i3) {
        a9 a9Var = (a9) ((o0b) this.c).h();
        if (a9Var == null) {
            ? obj2 = new Object();
            obj2.a = i;
            obj2.b = i2;
            obj2.d = i3;
            obj2.c = obj;
            return obj2;
        }
        a9Var.a = i;
        a9Var.b = i2;
        a9Var.d = i3;
        a9Var.c = obj;
        return a9Var;
    }

    public void I() {
        this.b = -1;
        O((ColorStateList) null);
        i();
    }

    public void J(int i) {
        ColorStateList colorStateList;
        this.b = i;
        gn gnVar = (gn) this.o;
        if (gnVar != null) {
            Context context = ((View) this.c).getContext();
            synchronized (gnVar) {
                colorStateList = gnVar.a.h(context, i);
            }
        } else {
            colorStateList = null;
        }
        O(colorStateList);
        i();
    }

    public void K(a9 a9Var) {
        ((ArrayList) this.X).add(a9Var);
        int i = a9Var.a;
        ea6 ea6 = (ea6) this.Y;
        if (i == 1) {
            ea6.L(a9Var.b, a9Var.d);
        } else if (i == 2) {
            int i2 = a9Var.b;
            int i3 = a9Var.d;
            RecyclerView recyclerView = (RecyclerView) ea6.b;
            recyclerView.d0(i2, i3, false);
            recyclerView.z1 = true;
        } else if (i == 4) {
            ea6.K(a9Var.b, a9Var.d, a9Var.c);
        } else if (i == 8) {
            ea6.M(a9Var.b, a9Var.d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + a9Var);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:176:0x000d A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0135  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void L() {
        /*
            r17 = this;
            r0 = r17
            java.lang.Object r1 = r0.o
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.lang.Object r2 = r0.Z
            c9 r2 = (defpackage.c9) r2
            r2.getClass()
        L_0x000d:
            int r3 = r1.size()
            r4 = 1
            int r3 = r3 - r4
            r6 = 0
        L_0x0014:
            r7 = -1
            r8 = 8
            if (r3 < 0) goto L_0x002a
            java.lang.Object r9 = r1.get(r3)
            a9 r9 = (defpackage.a9) r9
            int r9 = r9.a
            if (r9 != r8) goto L_0x0026
            if (r6 == 0) goto L_0x0027
            goto L_0x002b
        L_0x0026:
            r6 = r4
        L_0x0027:
            int r3 = r3 + -1
            goto L_0x0014
        L_0x002a:
            r3 = r7
        L_0x002b:
            r6 = 0
            r9 = 4
            r10 = 2
            if (r3 == r7) goto L_0x01d5
            int r8 = r3 + 1
            java.lang.Object r11 = r1.get(r3)
            a9 r11 = (defpackage.a9) r11
            java.lang.Object r12 = r1.get(r8)
            a9 r12 = (defpackage.a9) r12
            int r13 = r12.a
            if (r13 == r4) goto L_0x01ab
            java.lang.Object r7 = r2.b
            b9 r7 = (defpackage.b9) r7
            if (r13 == r10) goto L_0x00af
            if (r13 == r9) goto L_0x004b
            goto L_0x000d
        L_0x004b:
            int r5 = r11.d
            int r10 = r12.b
            if (r5 >= r10) goto L_0x0056
            int r10 = r10 + -1
            r12.b = r10
            goto L_0x0068
        L_0x0056:
            int r13 = r12.d
            int r10 = r10 + r13
            if (r5 >= r10) goto L_0x0068
            int r13 = r13 + -1
            r12.d = r13
            int r5 = r11.b
            java.lang.Object r10 = r12.c
            a9 r4 = r7.H(r10, r9, r5, r4)
            goto L_0x0069
        L_0x0068:
            r4 = r6
        L_0x0069:
            int r5 = r11.b
            int r10 = r12.b
            if (r5 > r10) goto L_0x0074
            int r10 = r10 + 1
            r12.b = r10
            goto L_0x0088
        L_0x0074:
            int r13 = r12.d
            int r10 = r10 + r13
            if (r5 >= r10) goto L_0x0088
            int r10 = r10 - r5
            int r5 = r5 + 1
            java.lang.Object r13 = r12.c
            a9 r5 = r7.H(r13, r9, r5, r10)
            int r9 = r12.d
            int r9 = r9 - r10
            r12.d = r9
            goto L_0x0089
        L_0x0088:
            r5 = r6
        L_0x0089:
            r1.set(r8, r11)
            int r8 = r12.d
            if (r8 <= 0) goto L_0x0094
            r1.set(r3, r12)
            goto L_0x00a3
        L_0x0094:
            r1.remove(r3)
            r7.getClass()
            r12.c = r6
            java.lang.Object r6 = r7.c
            o0b r6 = (defpackage.o0b) r6
            r6.g(r12)
        L_0x00a3:
            if (r4 == 0) goto L_0x00a8
            r1.add(r3, r4)
        L_0x00a8:
            if (r5 == 0) goto L_0x000d
            r1.add(r3, r5)
            goto L_0x000d
        L_0x00af:
            int r9 = r11.b
            int r13 = r11.d
            if (r9 >= r13) goto L_0x00c4
            int r14 = r12.b
            if (r14 != r9) goto L_0x00c2
            int r14 = r12.d
            int r9 = r13 - r9
            if (r14 != r9) goto L_0x00c2
            r5 = r4
        L_0x00c0:
            r9 = 0
            goto L_0x00d4
        L_0x00c2:
            r5 = 0
            goto L_0x00c0
        L_0x00c4:
            int r14 = r12.b
            int r15 = r13 + 1
            if (r14 != r15) goto L_0x00d2
            int r14 = r12.d
            int r9 = r9 - r13
            if (r14 != r9) goto L_0x00d2
            r5 = r4
            r9 = r5
            goto L_0x00d4
        L_0x00d2:
            r9 = r4
            r5 = 0
        L_0x00d4:
            int r14 = r12.b
            if (r13 >= r14) goto L_0x00dd
            int r14 = r14 + -1
            r12.b = r14
            goto L_0x00ff
        L_0x00dd:
            int r15 = r12.d
            int r14 = r14 + r15
            if (r13 >= r14) goto L_0x00ff
            int r15 = r15 + -1
            r12.d = r15
            r11.a = r10
            r11.d = r4
            int r3 = r12.d
            if (r3 != 0) goto L_0x000d
            r1.remove(r8)
            r7.getClass()
            r12.c = r6
            java.lang.Object r3 = r7.c
            o0b r3 = (defpackage.o0b) r3
            r3.g(r12)
            goto L_0x000d
        L_0x00ff:
            int r4 = r11.b
            int r13 = r12.b
            if (r4 > r13) goto L_0x010a
            int r13 = r13 + 1
            r12.b = r13
            goto L_0x011e
        L_0x010a:
            int r14 = r12.d
            int r13 = r13 + r14
            if (r4 >= r13) goto L_0x011e
            int r13 = r13 - r4
            int r4 = r4 + 1
            a9 r4 = r7.H(r6, r10, r4, r13)
            int r10 = r11.b
            int r13 = r12.b
            int r10 = r10 - r13
            r12.d = r10
            goto L_0x011f
        L_0x011e:
            r4 = r6
        L_0x011f:
            if (r5 == 0) goto L_0x0135
            r1.set(r3, r12)
            r1.remove(r8)
            r7.getClass()
            r11.c = r6
            java.lang.Object r3 = r7.c
            o0b r3 = (defpackage.o0b) r3
            r3.g(r11)
            goto L_0x000d
        L_0x0135:
            if (r9 == 0) goto L_0x0166
            if (r4 == 0) goto L_0x014f
            int r5 = r11.b
            int r6 = r4.b
            if (r5 <= r6) goto L_0x0144
            int r6 = r4.d
            int r5 = r5 - r6
            r11.b = r5
        L_0x0144:
            int r5 = r11.d
            int r6 = r4.b
            if (r5 <= r6) goto L_0x014f
            int r6 = r4.d
            int r5 = r5 - r6
            r11.d = r5
        L_0x014f:
            int r5 = r11.b
            int r6 = r12.b
            if (r5 <= r6) goto L_0x015a
            int r6 = r12.d
            int r5 = r5 - r6
            r11.b = r5
        L_0x015a:
            int r5 = r11.d
            int r6 = r12.b
            if (r5 <= r6) goto L_0x0194
            int r6 = r12.d
            int r5 = r5 - r6
            r11.d = r5
            goto L_0x0194
        L_0x0166:
            if (r4 == 0) goto L_0x017e
            int r5 = r11.b
            int r6 = r4.b
            if (r5 < r6) goto L_0x0173
            int r6 = r4.d
            int r5 = r5 - r6
            r11.b = r5
        L_0x0173:
            int r5 = r11.d
            int r6 = r4.b
            if (r5 < r6) goto L_0x017e
            int r6 = r4.d
            int r5 = r5 - r6
            r11.d = r5
        L_0x017e:
            int r5 = r11.b
            int r6 = r12.b
            if (r5 < r6) goto L_0x0189
            int r6 = r12.d
            int r5 = r5 - r6
            r11.b = r5
        L_0x0189:
            int r5 = r11.d
            int r6 = r12.b
            if (r5 < r6) goto L_0x0194
            int r6 = r12.d
            int r5 = r5 - r6
            r11.d = r5
        L_0x0194:
            r1.set(r3, r12)
            int r5 = r11.b
            int r6 = r11.d
            if (r5 == r6) goto L_0x01a1
            r1.set(r8, r11)
            goto L_0x01a4
        L_0x01a1:
            r1.remove(r8)
        L_0x01a4:
            if (r4 == 0) goto L_0x000d
            r1.add(r3, r4)
            goto L_0x000d
        L_0x01ab:
            int r4 = r11.d
            int r6 = r12.b
            if (r4 >= r6) goto L_0x01b3
            r5 = r7
            goto L_0x01b4
        L_0x01b3:
            r5 = 0
        L_0x01b4:
            int r7 = r11.b
            if (r7 >= r6) goto L_0x01ba
            int r5 = r5 + 1
        L_0x01ba:
            if (r6 > r7) goto L_0x01c1
            int r6 = r12.d
            int r7 = r7 + r6
            r11.b = r7
        L_0x01c1:
            int r6 = r12.b
            if (r6 > r4) goto L_0x01ca
            int r7 = r12.d
            int r4 = r4 + r7
            r11.d = r4
        L_0x01ca:
            int r6 = r6 + r5
            r12.b = r6
            r1.set(r3, r12)
            r1.set(r8, r11)
            goto L_0x000d
        L_0x01d5:
            int r2 = r1.size()
            r3 = 0
        L_0x01da:
            if (r3 >= r2) goto L_0x02b0
            java.lang.Object r11 = r1.get(r3)
            a9 r11 = (defpackage.a9) r11
            int r12 = r11.a
            if (r12 == r4) goto L_0x02a8
            java.lang.Object r13 = r0.Y
            ea6 r13 = (defpackage.ea6) r13
            if (r12 == r10) goto L_0x024d
            if (r12 == r9) goto L_0x01f7
            if (r12 == r8) goto L_0x01f2
            goto L_0x02ab
        L_0x01f2:
            r0.K(r11)
            goto L_0x02ab
        L_0x01f7:
            int r12 = r11.b
            int r14 = r11.d
            int r14 = r14 + r12
            r15 = r12
            r5 = 0
        L_0x01fe:
            if (r12 >= r14) goto L_0x022e
            b7c r16 = r13.H(r12)
            if (r16 != 0) goto L_0x021c
            boolean r16 = r0.k(r12)
            if (r16 == 0) goto L_0x020d
            goto L_0x021c
        L_0x020d:
            if (r7 != r4) goto L_0x021a
            java.lang.Object r7 = r11.c
            a9 r5 = r0.H(r7, r9, r15, r5)
            r0.K(r5)
            r15 = r12
            r5 = 0
        L_0x021a:
            r7 = 0
            goto L_0x022a
        L_0x021c:
            if (r7 != 0) goto L_0x0229
            java.lang.Object r7 = r11.c
            a9 r5 = r0.H(r7, r9, r15, r5)
            r0.x(r5)
            r15 = r12
            r5 = 0
        L_0x0229:
            r7 = r4
        L_0x022a:
            int r5 = r5 + r4
            int r12 = r12 + 1
            goto L_0x01fe
        L_0x022e:
            int r12 = r11.d
            if (r5 == r12) goto L_0x0241
            java.lang.Object r12 = r11.c
            r11.c = r6
            java.lang.Object r13 = r0.c
            o0b r13 = (defpackage.o0b) r13
            r13.g(r11)
            a9 r11 = r0.H(r12, r9, r15, r5)
        L_0x0241:
            if (r7 != 0) goto L_0x0248
            r0.x(r11)
            goto L_0x02ab
        L_0x0248:
            r0.K(r11)
            goto L_0x02ab
        L_0x024d:
            int r5 = r11.b
            int r7 = r11.d
            int r7 = r7 + r5
            r12 = r5
            r14 = 0
            r15 = -1
        L_0x0255:
            if (r12 >= r7) goto L_0x028d
            b7c r16 = r13.H(r12)
            if (r16 != 0) goto L_0x0273
            boolean r16 = r0.k(r12)
            if (r16 == 0) goto L_0x0264
            goto L_0x0273
        L_0x0264:
            if (r15 != r4) goto L_0x026f
            a9 r15 = r0.H(r6, r10, r5, r14)
            r0.K(r15)
            r15 = r4
            goto L_0x0270
        L_0x026f:
            r15 = 0
        L_0x0270:
            r16 = 0
            goto L_0x0281
        L_0x0273:
            if (r15 != 0) goto L_0x027e
            a9 r15 = r0.H(r6, r10, r5, r14)
            r0.x(r15)
            r15 = r4
            goto L_0x027f
        L_0x027e:
            r15 = 0
        L_0x027f:
            r16 = r4
        L_0x0281:
            if (r15 == 0) goto L_0x0287
            int r12 = r12 - r14
            int r7 = r7 - r14
            r14 = r4
            goto L_0x0289
        L_0x0287:
            int r14 = r14 + 1
        L_0x0289:
            int r12 = r12 + r4
            r15 = r16
            goto L_0x0255
        L_0x028d:
            int r7 = r11.d
            if (r14 == r7) goto L_0x029e
            r11.c = r6
            java.lang.Object r7 = r0.c
            o0b r7 = (defpackage.o0b) r7
            r7.g(r11)
            a9 r11 = r0.H(r6, r10, r5, r14)
        L_0x029e:
            if (r15 != 0) goto L_0x02a4
            r0.x(r11)
            goto L_0x02ab
        L_0x02a4:
            r0.K(r11)
            goto L_0x02ab
        L_0x02a8:
            r0.K(r11)
        L_0x02ab:
            int r3 = r3 + 1
            r7 = -1
            goto L_0x01da
        L_0x02b0:
            r1.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b9.L():void");
    }

    public void M(a9 a9Var) {
        a9Var.c = null;
        ((o0b) this.c).g(a9Var);
    }

    public void N(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            M((a9) list.get(i));
        }
        list.clear();
    }

    public void O(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (((od3) this.X) == null) {
                this.X = new od3(2);
            }
            od3 od3 = (od3) this.X;
            od3.d = colorStateList;
            od3.c = true;
        } else {
            this.X = null;
        }
        i();
    }

    public void P(ColorStateList colorStateList) {
        if (((od3) this.Y) == null) {
            this.Y = new od3(2);
        }
        od3 od3 = (od3) this.Y;
        od3.d = colorStateList;
        od3.c = true;
        i();
    }

    public void Q(PorterDuff.Mode mode) {
        if (((od3) this.Y) == null) {
            this.Y = new od3(2);
        }
        od3 od3 = (od3) this.Y;
        od3.e = mode;
        od3.b = true;
        i();
    }

    public int R(int i, int i2) {
        int i3;
        int i4;
        ArrayList arrayList = (ArrayList) this.X;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            a9 a9Var = (a9) arrayList.get(size);
            int i5 = a9Var.a;
            if (i5 == 8) {
                int i6 = a9Var.b;
                int i7 = a9Var.d;
                if (i6 < i7) {
                    i4 = i6;
                    i3 = i7;
                } else {
                    i3 = i6;
                    i4 = i7;
                }
                if (i < i4 || i > i3) {
                    if (i < i6) {
                        if (i2 == 1) {
                            a9Var.b = i6 + 1;
                            a9Var.d = i7 + 1;
                        } else if (i2 == 2) {
                            a9Var.b = i6 - 1;
                            a9Var.d = i7 - 1;
                        }
                    }
                } else if (i4 == i6) {
                    if (i2 == 1) {
                        a9Var.d = i7 + 1;
                    } else if (i2 == 2) {
                        a9Var.d = i7 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        a9Var.b = i6 + 1;
                    } else if (i2 == 2) {
                        a9Var.b = i6 - 1;
                    }
                    i--;
                }
            } else {
                int i8 = a9Var.b;
                if (i8 <= i) {
                    if (i5 == 1) {
                        i -= a9Var.d;
                    } else if (i5 == 2) {
                        i += a9Var.d;
                    }
                } else if (i2 == 1) {
                    a9Var.b = i8 + 1;
                } else if (i2 == 2) {
                    a9Var.b = i8 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            a9 a9Var2 = (a9) arrayList.get(size2);
            if (a9Var2.a == 8) {
                int i9 = a9Var2.d;
                if (i9 == a9Var2.b || i9 < 0) {
                    arrayList.remove(size2);
                    a9Var2.c = null;
                    ((o0b) this.c).g(a9Var2);
                }
            } else if (a9Var2.d <= 0) {
                arrayList.remove(size2);
                a9Var2.c = null;
                ((o0b) this.c).g(a9Var2);
            }
        }
        return i;
    }

    public void S(ye6 ye6, String str) {
        if (this.b == 0) {
            zs0 zs0 = (zs0) this.Z;
            zs0.L(str).L("\r\n");
            int size = ye6.size();
            for (int i = 0; i < size; i++) {
                zs0.L(ye6.b(i)).L(": ").L(ye6.d(i)).L("\r\n");
            }
            zs0.L("\r\n");
            this.b = 1;
            return;
        }
        throw new IllegalStateException(("state: " + this.b).toString());
    }

    public tld a(xbc xbc) {
        if (!im6.a(xbc)) {
            return G(0);
        }
        String a2 = xbc.Y.a("Transfer-Encoding");
        if (a2 == null) {
            a2 = null;
        }
        if ("chunked".equalsIgnoreCase(a2)) {
            sm6 sm6 = xbc.a.b;
            if (this.b == 4) {
                this.b = 5;
                return new sk6(this, sm6);
            }
            throw new IllegalStateException(("state: " + this.b).toString());
        }
        long j = nze.j(xbc);
        if (j != -1) {
            return G(j);
        }
        if (this.b == 4) {
            this.b = 5;
            ((c1c) this.X).k();
            return new qk6(this);
        }
        throw new IllegalStateException(("state: " + this.b).toString());
    }

    public void b() {
        ((zs0) this.Z).flush();
    }

    public fjd c(lac lac, long j) {
        d8 d8Var = lac.e;
        if ("chunked".equalsIgnoreCase(lac.d.a("Transfer-Encoding"))) {
            if (this.b == 1) {
                this.b = 2;
                return new rk6(this);
            }
            throw new IllegalStateException(("state: " + this.b).toString());
        } else if (j == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        } else if (this.b == 1) {
            this.b = 2;
            return new gd4(this);
        } else {
            throw new IllegalStateException(("state: " + this.b).toString());
        }
    }

    public void cancel() {
        Socket socket = ((c1c) this.X).b;
        if (socket != null) {
            nze.d(socket);
        }
    }

    public long d(xbc xbc) {
        if (!im6.a(xbc)) {
            return 0;
        }
        String a2 = xbc.Y.a("Transfer-Encoding");
        if (a2 == null) {
            a2 = null;
        }
        if ("chunked".equalsIgnoreCase(a2)) {
            return -1;
        }
        return nze.j(xbc);
    }

    public wbc e(boolean z) {
        xw2 xw2 = (xw2) this.c;
        int i = this.b;
        if (i == 1 || i == 3) {
            try {
                String G = ((at0) xw2.c).G(xw2.b);
                xw2.b -= (long) G.length();
                jn C = lp.C(G);
                int i2 = C.b;
                wbc wbc = new wbc();
                wbc.b = (vhb) C.c;
                wbc.c = i2;
                wbc.d = (String) C.o;
                wbc.f = xw2.Y().c();
                if (z && i2 == 100) {
                    return null;
                }
                if (i2 == 100) {
                    this.b = 3;
                    return wbc;
                }
                this.b = 4;
                return wbc;
            } catch (EOFException e) {
                throw new IOException(rf0.h("unexpected end of stream on ", ((c1c) this.X).q.a.a.g()), e);
            }
        } else {
            throw new IllegalStateException(("state: " + this.b).toString());
        }
    }

    public c1c f() {
        return (c1c) this.X;
    }

    public void g(lac lac) {
        Proxy.Type type = ((c1c) this.X).q.b.type();
        StringBuilder sb = new StringBuilder();
        sb.append(lac.c);
        sb.append(' ');
        sm6 sm6 = lac.b;
        if (sm6.a || type != Proxy.Type.HTTP) {
            String b2 = sm6.b();
            String d = sm6.d();
            if (d != null) {
                b2 = b2 + '?' + d;
            }
            sb.append(b2);
        } else {
            sb.append(sm6);
        }
        sb.append(" HTTP/1.1");
        S(lac.d, sb.toString());
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [oz2, java.lang.Object] */
    public Object get() {
        Range range = ((n80) this.X).a;
        e90 e90 = (e90) this.Z;
        int i = e90.c;
        m80 m80 = (m80) this.Y;
        int L = gwf.L(i, m80.c, e90.e, m80.b, e90.d, range);
        ? obj = new Object();
        obj.b = -1;
        String str = (String) this.c;
        if (str != null) {
            obj.a = str;
            obj.b = Integer.valueOf(this.b);
            kje kje = (kje) this.o;
            if (kje != null) {
                obj.c = kje;
                obj.f = Integer.valueOf(m80.c);
                obj.e = Integer.valueOf(m80.b);
                obj.d = Integer.valueOf(L);
                return obj.e();
            }
            throw new NullPointerException("Null inputTimebase");
        }
        throw new NullPointerException("Null mimeType");
    }

    public void h() {
        ((zs0) this.Z).flush();
    }

    public void i() {
        View view = (View) this.c;
        Drawable background = view.getBackground();
        if (background != null) {
            if (((od3) this.X) != null) {
                if (((od3) this.Z) == null) {
                    this.Z = new od3(2);
                }
                od3 od3 = (od3) this.Z;
                od3.d = null;
                od3.c = false;
                od3.e = null;
                od3.b = false;
                WeakHashMap weakHashMap = eaf.a;
                ColorStateList g = t9f.g(view);
                if (g != null) {
                    od3.c = true;
                    od3.d = g;
                }
                PorterDuff.Mode h = t9f.h(view);
                if (h != null) {
                    od3.b = true;
                    od3.e = h;
                }
                if (od3.c || od3.b) {
                    gn.e(background, od3, view.getDrawableState());
                    return;
                }
            }
            od3 od32 = (od3) this.Y;
            if (od32 != null) {
                gn.e(background, od32, view.getDrawableState());
                return;
            }
            od3 od33 = (od3) this.X;
            if (od33 != null) {
                gn.e(background, od33, view.getDrawableState());
            }
        }
    }

    public b9 j(syc syc) {
        b9 b9Var;
        r57 r57 = (r57) this.c;
        yuf I = a06.I(r57, syc);
        ope ope = (ope) this.X;
        jn jnVar = (jn) ope.o;
        int i = jnVar.b + 1;
        jnVar.b = i;
        Object[] objArr = (Object[]) jnVar.c;
        if (i == objArr.length) {
            int i2 = i * 2;
            jnVar.c = Arrays.copyOf(objArr, i2);
            jnVar.o = Arrays.copyOf((int[]) jnVar.o, i2);
        }
        ((Object[]) jnVar.c)[i] = syc;
        ope.n(I.a);
        if (ope.N() != 4) {
            int ordinal = I.ordinal();
            if (ordinal == 1 || ordinal == 2 || ordinal == 3) {
                b9Var = new b9((r57) this.c, I, (ope) this.X, syc, (mv0) null);
            } else if (((yuf) this.o) == I && r57.a.f) {
                return this;
            } else {
                b9Var = new b9((r57) this.c, I, (ope) this.X, syc, (mv0) null);
            }
            return b9Var;
        }
        ope.v(ope, "Unexpected leading comma", 0, (String) null, 6);
        throw null;
    }

    public boolean k(int i) {
        ArrayList arrayList = (ArrayList) this.X;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            a9 a9Var = (a9) arrayList.get(i2);
            int i3 = a9Var.a;
            if (i3 == 8) {
                if (A(a9Var.d, i2 + 1) == i) {
                    return true;
                }
            } else if (i3 == 1) {
                int i4 = a9Var.b;
                int i5 = a9Var.d + i4;
                while (i4 < i5) {
                    if (A(i4, i2 + 1) == i) {
                        return true;
                    }
                    i4++;
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    public void l() {
        ArrayList arrayList = (ArrayList) this.X;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((ea6) this.Y).G((a9) arrayList.get(i));
        }
        N(arrayList);
        this.b = 0;
    }

    public void m() {
        l();
        ArrayList arrayList = (ArrayList) this.o;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            a9 a9Var = (a9) arrayList.get(i);
            int i2 = a9Var.a;
            ea6 ea6 = (ea6) this.Y;
            if (i2 == 1) {
                ea6.G(a9Var);
                ea6.L(a9Var.b, a9Var.d);
            } else if (i2 == 2) {
                ea6.G(a9Var);
                int i3 = a9Var.b;
                int i4 = a9Var.d;
                RecyclerView recyclerView = (RecyclerView) ea6.b;
                recyclerView.d0(i3, i4, true);
                recyclerView.z1 = true;
                recyclerView.w1.d += i4;
            } else if (i2 == 4) {
                ea6.G(a9Var);
                ea6.K(a9Var.b, a9Var.d, a9Var.c);
            } else if (i2 == 8) {
                ea6.G(a9Var);
                ea6.M(a9Var.b, a9Var.d);
            }
        }
        N(arrayList);
        this.b = 0;
    }

    public boolean n() {
        boolean z;
        boolean z2;
        ope ope = (ope) this.X;
        int T = ope.T();
        String str = (String) ope.c;
        if (T != str.length()) {
            if (str.charAt(T) == '\"') {
                T++;
                z = true;
            } else {
                z = false;
            }
            int P = ope.P(T);
            if (P >= str.length() || P == -1) {
                ope.v(ope, "EOF", 0, (String) null, 6);
                throw null;
            }
            int i = P + 1;
            char charAt = str.charAt(P) | ' ';
            if (charAt == 'f') {
                ope.j(i, "alse");
                z2 = false;
            } else if (charAt == 't') {
                ope.j(i, "rue");
                z2 = true;
            } else {
                ope.v(ope, "Expected valid boolean literal prefix, but had '" + ope.q() + '\'', 0, (String) null, 6);
                throw null;
            }
            if (z) {
                if (ope.b == str.length()) {
                    ope.v(ope, "EOF", 0, (String) null, 6);
                    throw null;
                } else if (str.charAt(ope.b) == '\"') {
                    ope.b++;
                } else {
                    ope.v(ope, "Expected closing quotation mark", 0, (String) null, 6);
                    throw null;
                }
            }
            return z2;
        }
        ope.v(ope, "EOF", 0, (String) null, 6);
        throw null;
    }

    public boolean o(syc syc, int i) {
        return n();
    }

    public int p(syc syc) {
        y57 y57;
        int l;
        boolean z;
        boolean z2;
        boolean z3;
        String O;
        syc syc2 = syc;
        yuf yuf = (yuf) this.o;
        int ordinal = yuf.ordinal();
        ope ope = (ope) this.X;
        boolean z4 = true;
        int i = 0;
        Throwable th = null;
        char c2 = ':';
        r57 r57 = (r57) this.c;
        int i2 = -1;
        if (ordinal == 0) {
            boolean U = ope.U();
            while (true) {
                boolean h = ope.h();
                y57 = (y57) this.Z;
                if (h) {
                    t57 t57 = (t57) this.Y;
                    String r = t57.c ? ope.r() : ope.l();
                    ope.n(c2);
                    l = bm3.l(syc2, r57, r);
                    boolean z5 = t57.c;
                    if (l != -3) {
                        if (!t57.h) {
                            break;
                        }
                        boolean j = syc2.j(l);
                        syc i3 = syc2.i(l);
                        if (!j || i3.c() || !ope.V(z4)) {
                            if (!hhd.f(i3.e(), xyc.g) || ((i3.c() && ope.V(false)) || (O = ope.O(z5)) == null)) {
                                break;
                            }
                            int l2 = bm3.l(i3, r57, O);
                            boolean z6 = !r57.a.f && i3.c();
                            if (l2 != -3 || (!j && !z6)) {
                                break;
                            }
                            ope.o();
                        }
                        z = ope.U();
                        z2 = false;
                    } else {
                        z = false;
                        z2 = true;
                    }
                    if (z2) {
                        boolean z7 = t57.b;
                        String str = (String) ope.c;
                        if (z7) {
                            ArrayList arrayList = new ArrayList();
                            byte N = ope.N();
                            if (N == 8 || N == 6) {
                                while (true) {
                                    byte N2 = ope.N();
                                    z3 = true;
                                    if (N2 != 1) {
                                        if (N2 == 8 || N2 == 6) {
                                            arrayList.add(Byte.valueOf(N2));
                                        } else {
                                            jn jnVar = (jn) ope.o;
                                            if (N2 == 9) {
                                                if (((Number) o23.e0(arrayList)).byteValue() == 8) {
                                                    u23.O(arrayList);
                                                } else {
                                                    throw gp0.b("found ] instead of } at path: " + jnVar, str, ope.b);
                                                }
                                            } else if (N2 == 7) {
                                                if (((Number) o23.e0(arrayList)).byteValue() == 6) {
                                                    u23.O(arrayList);
                                                } else {
                                                    throw gp0.b("found } instead of ] at path: " + jnVar, str, ope.b);
                                                }
                                            } else if (N2 == 10) {
                                                ope.v(ope, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, (String) null, 6);
                                                throw null;
                                            }
                                        }
                                        ope.m();
                                        if (arrayList.size() == 0) {
                                            break;
                                        }
                                    } else if (z5) {
                                        ope.q();
                                    } else {
                                        ope.l();
                                    }
                                }
                            } else {
                                ope.q();
                                z3 = true;
                            }
                            U = ope.U();
                            z4 = z3;
                        } else {
                            ope.u(h0e.f0(r, str.subSequence(0, ope.b).toString(), 6), "Encountered an unknown key '" + r + '\'', "Use 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.");
                            throw null;
                        }
                    } else {
                        U = z;
                        z4 = true;
                    }
                    th = null;
                    c2 = ':';
                } else if (!U || r57.a.n) {
                    if (y57 != null) {
                        ws4 ws4 = y57.a;
                        syc syc3 = (syc) ws4.b;
                        int f = syc3.f();
                        while (true) {
                            long j2 = ws4.a;
                            long j3 = -1;
                            int i4 = (j2 > -1 ? 1 : (j2 == -1 ? 0 : -1));
                            i26 i26 = (i26) ws4.c;
                            if (i4 != 0) {
                                int numberOfTrailingZeros = Long.numberOfTrailingZeros(~j2);
                                ws4.a |= 1 << numberOfTrailingZeros;
                                if (((Boolean) i26.invoke(syc3, Integer.valueOf(numberOfTrailingZeros))).booleanValue()) {
                                    i2 = numberOfTrailingZeros;
                                    break;
                                }
                            } else if (f > 64) {
                                long[] jArr = (long[]) ws4.o;
                                int length = jArr.length;
                                loop3:
                                while (true) {
                                    if (i >= length) {
                                        break;
                                    }
                                    int i5 = i + 1;
                                    int i6 = i5 * 64;
                                    long j4 = jArr[i];
                                    while (j4 != j3) {
                                        int numberOfTrailingZeros2 = Long.numberOfTrailingZeros(~j4);
                                        j4 |= 1 << numberOfTrailingZeros2;
                                        int i7 = numberOfTrailingZeros2 + i6;
                                        if (((Boolean) i26.invoke(syc3, Integer.valueOf(i7))).booleanValue()) {
                                            jArr[i] = j4;
                                            i2 = i7;
                                            break loop3;
                                        }
                                        j3 = -1;
                                    }
                                    jArr[i] = j4;
                                    i = i5;
                                    j3 = -1;
                                }
                            }
                        }
                    }
                    i2 = -1;
                } else {
                    gp0.z(ope);
                    throw th;
                }
            }
            if (y57 != null) {
                ws4 ws42 = y57.a;
                if (l < 64) {
                    ws42.a |= 1 << l;
                } else {
                    int i8 = (l >>> 6) - 1;
                    long[] jArr2 = (long[]) ws42.o;
                    jArr2[i8] = jArr2[i8] | (1 << (l & 63));
                }
            }
            i2 = l;
        } else if (ordinal != 2) {
            boolean U2 = ope.U();
            if (ope.h()) {
                int i9 = this.b;
                if (i9 == -1 || U2) {
                    i2 = i9 + 1;
                    this.b = i2;
                } else {
                    ope.v(ope, "Expected end of the array or comma", 0, (String) null, 6);
                    throw null;
                }
            } else if (U2 && !r57.a.n) {
                gp0.y(ope, "array");
                throw null;
            }
        } else {
            int i10 = this.b;
            boolean z8 = i10 % 2 != 0;
            if (!z8) {
                ope.n(':');
            } else if (i10 != -1) {
                i = ope.U();
            }
            if (ope.h()) {
                if (z8) {
                    if (this.b == -1) {
                        int i11 = i ^ 1;
                        int i12 = ope.b;
                        if (i11 == 0) {
                            ope.v(ope, "Unexpected leading comma", i12, (String) null, 4);
                            throw null;
                        }
                    } else {
                        int i13 = ope.b;
                        if (i == 0) {
                            ope.v(ope, "Expected comma after the key-value pair", i13, (String) null, 4);
                            throw null;
                        }
                    }
                }
                i2 = this.b + 1;
                this.b = i2;
            } else if (i != 0 && !r57.a.n) {
                gp0.z(ope);
                throw null;
            }
        }
        if (yuf != yuf.MAP) {
            jn jnVar2 = (jn) ope.o;
            ((int[]) jnVar2.o)[jnVar2.b] = i2;
        }
        return i2;
    }

    public int q(syc syc) {
        return bm3.m(syc, (r57) this.c, v(), " at path ".concat(((jn) ((ope) this.X).o).u()));
    }

    public boolean r() {
        y57 y57 = (y57) this.Z;
        return !(y57 != null ? y57.b : false) && !((ope) this.X).V(true);
    }

    public Object s(syc syc, int i, String str) {
        d0e d0e = d0e.a;
        d0e d0e2 = d0e.a;
        if (r()) {
            return u(d0e);
        }
        return null;
    }

    public Object t(syc syc, int i, l77 l77, Object obj) {
        boolean z = ((yuf) this.o) == yuf.MAP && (i & 1) == 0;
        ope ope = (ope) this.X;
        if (z) {
            jn jnVar = (jn) ope.o;
            int i2 = jnVar.b;
            if (((int[]) jnVar.o)[i2] == -2) {
                ((Object[]) jnVar.c)[i2] = j06.X;
            }
        }
        Object u = u(l77);
        if (z) {
            jn jnVar2 = (jn) ope.o;
            int i3 = jnVar2.b;
            if (((int[]) jnVar2.o)[i3] != -2) {
                int i4 = i3 + 1;
                jnVar2.b = i4;
                Object[] objArr = (Object[]) jnVar2.c;
                if (i4 == objArr.length) {
                    int i5 = i4 * 2;
                    jnVar2.c = Arrays.copyOf(objArr, i5);
                    jnVar2.o = Arrays.copyOf((int[]) jnVar2.o, i5);
                }
            }
            int i6 = jnVar2.b;
            ((Object[]) jnVar2.c)[i6] = u;
            ((int[]) jnVar2.o)[i6] = -2;
        }
        return u;
    }

    public String toString() {
        switch (this.a) {
            case 4:
                StringBuilder sb = new StringBuilder("ShareData{type=");
                sb.append(this.b);
                sb.append(", images=");
                sb.append((ArrayList) this.o);
                sb.append(", videos=");
                sb.append((ArrayList) this.X);
                sb.append(", text='");
                sb.append((String) this.c);
                sb.append("', shares=null, files=");
                sb.append((ArrayList) this.Y);
                sb.append(", vcard='");
                return wn6.l(sb, (String) this.Z, "'}");
            default:
                return super.toString();
        }
    }

    public Object u(l77 l77) {
        try {
            return l77.a(this);
        } catch (MissingFieldException e) {
            if (h0e.R(e.getMessage(), "at path", false)) {
                throw e;
            }
            throw new MissingFieldException((ArrayList) e.a, e.getMessage() + " at path: " + ((jn) ((ope) this.X).o).u(), e);
        }
    }

    public String v() {
        boolean z = ((t57) this.Y).c;
        ope ope = (ope) this.X;
        return z ? ope.r() : ope.o();
    }

    public String w(syc syc, int i) {
        return v();
    }

    public void x(a9 a9Var) {
        int i;
        int i2 = a9Var.a;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int R = R(a9Var.b, i2);
        int i3 = a9Var.b;
        int i4 = a9Var.a;
        if (i4 == 2) {
            i = 0;
        } else if (i4 == 4) {
            i = 1;
        } else {
            throw new IllegalArgumentException("op should be remove or update." + a9Var);
        }
        int i5 = 1;
        for (int i6 = 1; i6 < a9Var.d; i6++) {
            int R2 = R((i * i6) + a9Var.b, a9Var.a);
            int i7 = a9Var.a;
            if (i7 == 2 ? R2 != R : !(i7 == 4 && R2 == R + 1)) {
                a9 H = H(a9Var.c, i7, R, i5);
                y(H, i3);
                H.c = null;
                ((o0b) this.c).g(H);
                if (a9Var.a == 4) {
                    i3 += i5;
                }
                i5 = 1;
                R = R2;
            } else {
                i5++;
            }
        }
        Object obj = a9Var.c;
        a9Var.c = null;
        ((o0b) this.c).g(a9Var);
        if (i5 > 0) {
            a9 H2 = H(obj, a9Var.a, R, i5);
            y(H2, i3);
            H2.c = null;
            ((o0b) this.c).g(H2);
        }
    }

    public void y(a9 a9Var, int i) {
        ea6 ea6 = (ea6) this.Y;
        ea6.G(a9Var);
        int i2 = a9Var.a;
        if (i2 == 2) {
            int i3 = a9Var.d;
            RecyclerView recyclerView = (RecyclerView) ea6.b;
            recyclerView.d0(i, i3, true);
            recyclerView.z1 = true;
            recyclerView.w1.d += i3;
        } else if (i2 == 4) {
            ea6.K(i, a9Var.d, a9Var.c);
        } else {
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void z(defpackage.syc r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.c
            r57 r0 = (defpackage.r57) r0
            t57 r1 = r0.a
            boolean r1 = r1.b
            r2 = -1
            if (r1 == 0) goto L_0x0017
            int r1 = r5.f()
            if (r1 != 0) goto L_0x0017
        L_0x0011:
            int r1 = r4.p(r5)
            if (r1 != r2) goto L_0x0011
        L_0x0017:
            java.lang.Object r5 = r4.X
            ope r5 = (defpackage.ope) r5
            boolean r1 = r5.U()
            if (r1 == 0) goto L_0x002f
            t57 r0 = r0.a
            boolean r0 = r0.n
            if (r0 == 0) goto L_0x0028
            goto L_0x002f
        L_0x0028:
            java.lang.String r4 = ""
            gp0.y(r5, r4)
            r4 = 0
            throw r4
        L_0x002f:
            java.lang.Object r4 = r4.o
            yuf r4 = (defpackage.yuf) r4
            char r4 = r4.b
            r5.n(r4)
            java.lang.Object r4 = r5.o
            jn r4 = (defpackage.jn) r4
            int r5 = r4.b
            java.lang.Object r0 = r4.o
            int[] r0 = (int[]) r0
            r1 = r0[r5]
            r3 = -2
            if (r1 != r3) goto L_0x004c
            r0[r5] = r2
            int r5 = r5 + r2
            r4.b = r5
        L_0x004c:
            int r5 = r4.b
            if (r5 == r2) goto L_0x0053
            int r5 = r5 + r2
            r4.b = r5
        L_0x0053:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b9.z(syc):void");
    }

    public b9(r57 r57, yuf yuf, ope ope, syc syc, mv0 mv0) {
        y57 y57;
        this.a = 5;
        this.c = r57;
        this.o = yuf;
        this.X = ope;
        this.b = -1;
        t57 t57 = r57.a;
        this.Y = t57;
        if (t57.f) {
            y57 = null;
        } else {
            y57 = new y57(syc);
        }
        this.Z = y57;
    }

    public b9(View view) {
        this.a = 1;
        this.b = -1;
        this.c = view;
        this.o = gn.a();
    }

    public b9(String str, int i, n80 n80, m80 m80, e90 e90) {
        this.a = 2;
        kje kje = kje.a;
        this.c = str;
        this.b = i;
        this.o = kje;
        this.X = n80;
        this.Y = m80;
        this.Z = e90;
    }

    public b9(qw9 qw9, c1c c1c, at0 at0, zs0 zs0) {
        this.a = 3;
        this.o = qw9;
        this.X = c1c;
        this.Y = at0;
        this.Z = zs0;
        this.c = new xw2(at0);
    }

    public b9(ea6 ea6) {
        this.a = 0;
        this.c = new o0b(30);
        this.o = new ArrayList();
        this.X = new ArrayList();
        this.b = 0;
        this.Y = ea6;
        this.Z = new c9(18, this);
    }
}
