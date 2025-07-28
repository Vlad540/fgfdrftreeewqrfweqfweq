package defpackage;

import android.graphics.Bitmap;
import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.view.KeyEvent;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.Set;

/* renamed from: te  reason: default package */
public final class te implements of3 {
    public static final le4 Y = new Object();
    public final Object X;
    public final boolean a;
    public final Object b;
    public Object c;
    public Object o;

    public /* synthetic */ te(Object obj, Object obj2, Object obj3, Object obj4, boolean z) {
        this.b = obj;
        this.c = obj2;
        this.o = obj3;
        this.X = obj4;
        this.a = z;
    }

    public static boolean a(Editable editable, KeyEvent keyEvent, boolean z) {
        ite[] iteArr;
        if (!KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (!(selectionStart == -1 || selectionEnd == -1 || selectionStart != selectionEnd || (iteArr = (ite[]) editable.getSpans(selectionStart, selectionEnd, ite.class)) == null || iteArr.length <= 0)) {
            int length = iteArr.length;
            int i = 0;
            while (i < length) {
                ite ite = iteArr[i];
                int spanStart = editable.getSpanStart(ite);
                int spanEnd = editable.getSpanEnd(ite);
                if ((!z || spanStart != selectionStart) && ((z || spanEnd != selectionStart) && (selectionStart <= spanStart || selectionStart >= spanEnd))) {
                    i++;
                } else {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    public void accept(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        if (charSequence.length() != 0 && !charSequence.equals((CharSequence) this.b)) {
            ((sw8) this.c).a((i22) this.o, (xm8) this.X, charSequence, this.a);
        }
    }

    public boolean b(CharSequence charSequence, int i, int i2, hte hte) {
        if ((hte.c & 3) == 0) {
            mt4 mt4 = (mt4) this.o;
            g39 c2 = hte.c();
            int a2 = c2.a(8);
            if (a2 != 0) {
                ((ByteBuffer) c2.o).getShort(a2 + c2.a);
            }
            w74 w74 = (w74) mt4;
            w74.getClass();
            ThreadLocal threadLocal = w74.b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i < i2) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            TextPaint textPaint = w74.a;
            String sb2 = sb.toString();
            int i3 = via.a;
            boolean a3 = uia.a(textPaint, sb2);
            int i4 = hte.c & 4;
            hte.c = a3 ? i4 | 2 : i4 | 1;
        }
        return (hte.c & 3) == 2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00c0 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object c(java.lang.CharSequence r17, int r18, int r19, int r20, boolean r21, defpackage.ru4 r22) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r19
            r3 = r20
            r4 = r22
            tu4 r5 = new tu4
            java.lang.Object r6 = r0.c
            o39 r6 = (defpackage.o39) r6
            n39 r6 = r6.c
            boolean r7 = r0.a
            java.lang.Object r8 = r0.X
            int[] r8 = (int[]) r8
            r5.<init>(r6, r7, r8)
            int r6 = java.lang.Character.codePointAt(r17, r18)
            r7 = 1
            r8 = 0
            r9 = r6
            r11 = r7
            r10 = r8
            r6 = r18
        L_0x0026:
            r8 = r6
        L_0x0027:
            r12 = 2
            if (r6 >= r2) goto L_0x00d2
            if (r10 >= r3) goto L_0x00d2
            if (r11 == 0) goto L_0x00d2
            n39 r13 = r5.c
            android.util.SparseArray r13 = r13.a
            if (r13 != 0) goto L_0x0036
            r13 = 0
            goto L_0x003c
        L_0x0036:
            java.lang.Object r13 = r13.get(r9)
            n39 r13 = (defpackage.n39) r13
        L_0x003c:
            int r14 = r5.a
            r15 = 3
            if (r14 == r12) goto L_0x0050
            if (r13 != 0) goto L_0x0048
            r5.a()
        L_0x0046:
            r13 = r7
            goto L_0x0090
        L_0x0048:
            r5.a = r12
            r5.c = r13
            r5.f = r7
        L_0x004e:
            r13 = r12
            goto L_0x0090
        L_0x0050:
            if (r13 == 0) goto L_0x005a
            r5.c = r13
            int r13 = r5.f
            int r13 = r13 + r7
            r5.f = r13
            goto L_0x004e
        L_0x005a:
            r13 = 65038(0xfe0e, float:9.1138E-41)
            if (r9 != r13) goto L_0x0063
            r5.a()
            goto L_0x0046
        L_0x0063:
            r13 = 65039(0xfe0f, float:9.1139E-41)
            if (r9 != r13) goto L_0x0069
            goto L_0x004e
        L_0x0069:
            n39 r13 = r5.c
            hte r14 = r13.b
            if (r14 == 0) goto L_0x008c
            int r14 = r5.f
            if (r14 != r7) goto L_0x0086
            boolean r13 = r5.b()
            if (r13 == 0) goto L_0x0082
            n39 r13 = r5.c
            r5.d = r13
            r5.a()
        L_0x0080:
            r13 = r15
            goto L_0x0090
        L_0x0082:
            r5.a()
            goto L_0x0046
        L_0x0086:
            r5.d = r13
            r5.a()
            goto L_0x0080
        L_0x008c:
            r5.a()
            goto L_0x0046
        L_0x0090:
            r5.e = r9
            if (r13 == r7) goto L_0x00c0
            if (r13 == r12) goto L_0x00b1
            if (r13 == r15) goto L_0x0099
            goto L_0x0027
        L_0x0099:
            if (r21 != 0) goto L_0x00a5
            n39 r12 = r5.d
            hte r12 = r12.b
            boolean r12 = r0.b(r1, r8, r6, r12)
            if (r12 != 0) goto L_0x0026
        L_0x00a5:
            n39 r11 = r5.d
            hte r11 = r11.b
            boolean r11 = r4.n(r1, r8, r6, r11)
            int r10 = r10 + 1
            goto L_0x0026
        L_0x00b1:
            int r12 = java.lang.Character.charCount(r9)
            int r12 = r12 + r6
            if (r12 >= r2) goto L_0x00bd
            int r6 = java.lang.Character.codePointAt(r1, r12)
            r9 = r6
        L_0x00bd:
            r6 = r12
            goto L_0x0027
        L_0x00c0:
            int r6 = java.lang.Character.codePointAt(r1, r8)
            int r6 = java.lang.Character.charCount(r6)
            int r6 = r6 + r8
            if (r6 >= r2) goto L_0x0026
            int r8 = java.lang.Character.codePointAt(r1, r6)
            r9 = r8
            goto L_0x0026
        L_0x00d2:
            int r2 = r5.a
            if (r2 != r12) goto L_0x00fd
            n39 r2 = r5.c
            hte r2 = r2.b
            if (r2 == 0) goto L_0x00fd
            int r2 = r5.f
            if (r2 > r7) goto L_0x00e6
            boolean r2 = r5.b()
            if (r2 == 0) goto L_0x00fd
        L_0x00e6:
            if (r10 >= r3) goto L_0x00fd
            if (r11 == 0) goto L_0x00fd
            if (r21 != 0) goto L_0x00f6
            n39 r2 = r5.c
            hte r2 = r2.b
            boolean r0 = r0.b(r1, r8, r6, r2)
            if (r0 != 0) goto L_0x00fd
        L_0x00f6:
            n39 r0 = r5.c
            hte r0 = r0.b
            r4.n(r1, r8, r6, r0)
        L_0x00fd:
            java.lang.Object r0 = r22.h()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.te.c(java.lang.CharSequence, int, int, int, boolean, ru4):java.lang.Object");
    }

    public boolean d(Bitmap bitmap, int i) {
        try {
            ((e06) this.o).t(bitmap, i);
            return true;
        } catch (IllegalStateException e) {
            if (!m75.a.i(6)) {
                return false;
            }
            eo7 eo7 = m75.a;
            String simpleName = te.class.getSimpleName();
            eo7.e(simpleName, "Rendering of frame unsuccessful. Frame number: " + i, e);
            return false;
        }
    }

    public te(rm0 rm0, ue ueVar, boolean z) {
        this.b = rm0;
        this.c = ueVar;
        this.a = z;
        e3 e3Var = new e3(this);
        this.X = e3Var;
        this.o = new e06(ueVar, z, e3Var);
    }

    public te(o39 o39, qr4 qr4, mt4 mt4, boolean z, int[] iArr, Set set) {
        this.b = qr4;
        this.c = o39;
        this.o = mt4;
        this.a = z;
        this.X = iArr;
        if (!set.isEmpty()) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                int[] iArr2 = (int[]) it.next();
                String str = new String(iArr2, 0, iArr2.length);
                c(str, 0, str.length(), 1, true, new su4(str));
            }
        }
    }
}
