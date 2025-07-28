package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: qhb  reason: default package */
public final class qhb {
    public final Context a;
    public final t97 b;
    public final t97 c;

    public qhb(Context context, t97 t97, t97 t972) {
        this.a = context;
        this.b = t97;
        this.c = t972;
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ef A[SYNTHETIC, Splitter:B:35:0x00ef] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0058 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.CharSequence a(java.lang.CharSequence r10, defpackage.mw6[] r11) {
        /*
            r9 = this;
            if (r11 == 0) goto L_0x012f
            int r0 = r11.length
            if (r0 != 0) goto L_0x0007
            goto L_0x012f
        L_0x0007:
            android.text.SpannableStringBuilder r0 = new android.text.SpannableStringBuilder
            r0.<init>()
            r0.append(r10)
            r10 = 0
            r1 = r10
        L_0x0011:
            int r2 = r11.length
            if (r1 >= r2) goto L_0x0129
            int r2 = r1 + 1
            r1 = r11[r1]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x011e }
            int r3 = r1.a
            t97 r4 = r9.c
            r5 = 1
            android.content.Context r6 = r9.a
            if (r3 == r5) goto L_0x00ad
            r5 = 2
            if (r3 == r5) goto L_0x0085
            r5 = 3
            r7 = 4
            if (r3 == r5) goto L_0x0046
            if (r3 == r7) goto L_0x002c
            goto L_0x00ec
        L_0x002c:
            nw6 r3 = new nw6
            r3.<init>()
            byte[] r4 = r1.d
            gr8 r3 = defpackage.gr8.mergeFrom(r3, r4)
            nw6 r3 = (defpackage.nw6) r3
            int r4 = r3.a
            if (r4 <= 0) goto L_0x00ec
            wld r4 = new wld
            int r3 = r3.a
            r4.<init>(r3)
            goto L_0x00ed
        L_0x0046:
            hw6 r3 = new hw6
            r3.<init>()
            byte[] r5 = r1.d
            gr8 r3 = defpackage.gr8.mergeFrom(r3, r5)
            hw6 r3 = (defpackage.hw6) r3
            byte[] r5 = r3.b
            int r5 = r5.length
            if (r5 != 0) goto L_0x005a
        L_0x0058:
            r1 = r2
            goto L_0x0011
        L_0x005a:
            java.lang.Object r4 = r4.getValue()
            en0 r4 = (defpackage.en0) r4
            byte[] r5 = r3.b
            r4.getClass()
            android.graphics.Bitmap r4 = defpackage.en0.a(r5)
            if (r4 == 0) goto L_0x00ec
            bi5 r5 = new bi5
            android.graphics.drawable.BitmapDrawable r8 = new android.graphics.drawable.BitmapDrawable
            android.content.res.Resources r6 = r6.getResources()
            r8.<init>(r6, r4)
            pz4 r4 = vh5.X
            int r3 = r3.a
            java.lang.Object r3 = r4.get(r3)
            vh5 r3 = (vh5) r3
            r5.<init>(r8, r3, r7)
            r4 = r5
            goto L_0x00ed
        L_0x0085:
            ow6 r3 = new ow6
            r3.<init>()
            byte[] r4 = r1.d
            gr8 r3 = defpackage.gr8.mergeFrom(r3, r4)
            ow6 r3 = (defpackage.ow6) r3
            int r4 = r3.a
            if (r4 == 0) goto L_0x00ec
            whe r4 = new whe
            s59 r5 = defpackage.km4.y0
            km4 r5 = r5.n(r6)
            pda r5 = r5.g()
            e98 r6 = new e98
            r7 = 25
            r6.<init>(r7, r3)
            r4.<init>(r5, r6)
            goto L_0x00ed
        L_0x00ad:
            gw6 r3 = new gw6
            r3.<init>()
            byte[] r5 = r1.d
            gr8 r3 = defpackage.gr8.mergeFrom(r3, r5)
            gw6 r3 = (defpackage.gw6) r3
            byte[] r5 = r3.a
            int r5 = r5.length
            if (r5 != 0) goto L_0x00c0
            goto L_0x0058
        L_0x00c0:
            java.lang.Object r4 = r4.getValue()
            en0 r4 = (defpackage.en0) r4
            byte[] r3 = r3.a
            r4.getClass()
            android.graphics.Bitmap r3 = defpackage.en0.a(r3)
            if (r3 == 0) goto L_0x00ec
            android.graphics.drawable.BitmapDrawable r4 = new android.graphics.drawable.BitmapDrawable
            android.content.res.Resources r5 = r6.getResources()
            r4.<init>(r5, r3)
            int r5 = r3.getWidth()
            int r3 = r3.getHeight()
            r4.setBounds(r10, r10, r5, r3)
            yu4 r3 = new yu4
            r3.<init>(r4)
            r4 = r3
            goto L_0x00ed
        L_0x00ec:
            r4 = 0
        L_0x00ed:
            if (r4 == 0) goto L_0x0058
            int r3 = r1.b     // Catch:{ all -> 0x00f8 }
            int r5 = r1.c     // Catch:{ all -> 0x00f8 }
            r0.setSpan(r4, r3, r5, r10)     // Catch:{ all -> 0x00f8 }
            goto L_0x0058
        L_0x00f8:
            r3 = move-exception
            java.lang.Class r4 = r0.getClass()
            java.lang.String r4 = r4.getName()
            int r5 = r1.a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "fail to set span "
            r6.<init>(r7)
            r6.append(r1)
            java.lang.String r1 = " of type "
            r6.append(r1)
            r6.append(r5)
            java.lang.String r1 = r6.toString()
            defpackage.udd.s(r4, r1, r3)
            goto L_0x0058
        L_0x011e:
            r9 = move-exception
            java.util.NoSuchElementException r10 = new java.util.NoSuchElementException
            java.lang.String r9 = r9.getMessage()
            r10.<init>(r9)
            throw r10
        L_0x0129:
            android.text.SpannedString r9 = new android.text.SpannedString
            r9.<init>(r0)
            return r9
        L_0x012f:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qhb.a(java.lang.CharSequence, mw6[]):java.lang.CharSequence");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: hw6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: hw6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v22, resolved type: hw6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v29, resolved type: nw6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v30, resolved type: hw6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v31, resolved type: ow6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v32, resolved type: hw6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: android.graphics.Bitmap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v2, resolved type: android.graphics.Rect} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v37, resolved type: gw6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v6, resolved type: android.graphics.Rect} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v5, resolved type: android.graphics.Bitmap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v9, resolved type: android.graphics.Bitmap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v11, resolved type: android.graphics.Bitmap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v46, resolved type: hw6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v47, resolved type: hw6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v48, resolved type: hw6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v49, resolved type: hw6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v11, resolved type: android.graphics.Rect} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v12, resolved type: android.graphics.Rect} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x0273  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x0289 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0155  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.ArrayList b(java.lang.CharSequence r25) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            boolean r2 = r1 instanceof android.text.Spanned
            r3 = 0
            if (r2 != 0) goto L_0x000a
            return r3
        L_0x000a:
            int r2 = r25.length()
            if (r2 != 0) goto L_0x0011
            return r3
        L_0x0011:
            r4 = r1
            android.text.Spanned r4 = (android.text.Spanned) r4
            r5 = 0
            int r6 = r4.nextSpanTransition(r5, r2, r3)
            if (r6 != r2) goto L_0x001c
            return r3
        L_0x001c:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            int r7 = r25.length()
            boolean r8 = r1 instanceof android.text.Spanned     // Catch:{ all -> 0x0036 }
            if (r8 == 0) goto L_0x002c
            android.text.Spanned r1 = (android.text.Spanned) r1     // Catch:{ all -> 0x0036 }
            goto L_0x002d
        L_0x002c:
            r1 = r3
        L_0x002d:
            if (r1 == 0) goto L_0x0036
            java.lang.Class<java.lang.Object> r8 = java.lang.Object.class
            java.lang.Object[] r1 = r1.getSpans(r5, r7, r8)     // Catch:{ all -> 0x0036 }
            goto L_0x0037
        L_0x0036:
            r1 = r3
        L_0x0037:
            if (r1 == 0) goto L_0x0293
            int r7 = r1.length
            r8 = r5
        L_0x003b:
            if (r8 >= r7) goto L_0x0293
            r9 = r1[r8]
            int r10 = r4.getSpanStart(r9)
            if (r10 < 0) goto L_0x0047
            if (r10 <= r2) goto L_0x004e
        L_0x0047:
            r22 = r1
            r23 = r2
            r2 = r3
            goto L_0x0289
        L_0x004e:
            int r11 = r4.getSpanEnd(r9)
            if (r11 < 0) goto L_0x0047
            if (r11 <= r2) goto L_0x0057
            goto L_0x0047
        L_0x0057:
            boolean r12 = r9 instanceof yu4
            t97 r14 = r0.c
            if (r12 == 0) goto L_0x0163
            yu4 r9 = (yu4) r9
            android.graphics.drawable.Drawable r12 = r9.Y
            boolean r15 = r12 instanceof android.graphics.drawable.BitmapDrawable
            if (r15 == 0) goto L_0x006c
            android.graphics.drawable.BitmapDrawable r12 = (android.graphics.drawable.BitmapDrawable) r12
            android.graphics.Bitmap r12 = r12.getBitmap()
            goto L_0x007e
        L_0x006c:
            boolean r15 = r12 instanceof hnd
            if (r15 == 0) goto L_0x007d
            hnd r12 = (hnd) r12
            ind r12 = r12.a
            it4 r15 = r12.e
            hu4 r12 = r12.a
            android.graphics.Bitmap r12 = r15.v(r12)
            goto L_0x007e
        L_0x007d:
            r12 = r3
        L_0x007e:
            if (r12 != 0) goto L_0x0081
            goto L_0x0047
        L_0x0081:
            android.graphics.drawable.Drawable r9 = r9.Y
            boolean r15 = r9 instanceof android.graphics.drawable.BitmapDrawable
            if (r15 == 0) goto L_0x0093
            android.graphics.Rect r15 = new android.graphics.Rect
            android.graphics.drawable.BitmapDrawable r9 = (android.graphics.drawable.BitmapDrawable) r9
            android.graphics.Rect r9 = r9.getBounds()
            r15.<init>(r9)
            goto L_0x00a5
        L_0x0093:
            boolean r15 = r9 instanceof hnd
            if (r15 == 0) goto L_0x00a4
            hnd r9 = (hnd) r9
            r9.getClass()
            android.graphics.Rect r15 = new android.graphics.Rect
            android.graphics.Rect r9 = r9.b
            r15.<init>(r9)
            goto L_0x00a5
        L_0x00a4:
            r15 = r3
        L_0x00a5:
            if (r15 != 0) goto L_0x00a8
            goto L_0x0047
        L_0x00a8:
            java.lang.Object r9 = r14.getValue()
            en0 r9 = (defpackage.en0) r9
            gvf r14 = r9.a
            java.lang.Object r14 = r14.b
            r7e r14 = (defpackage.r7e) r14
            java.lang.Object r14 = r14.getValue()
            byte[] r14 = (byte[]) r14
            boolean r16 = r15.isEmpty()
            if (r16 != 0) goto L_0x00e5
            boolean r16 = r12.isRecycled()
            if (r16 != 0) goto L_0x00e5
            int r16 = defpackage.mn0.d(r12)
            if (r16 != 0) goto L_0x00cd
            goto L_0x00e5
        L_0x00cd:
            int r5 = r15.width()
            int r13 = r12.getWidth()
            if (r5 != r13) goto L_0x00ea
            int r5 = r15.height()
            int r13 = r12.getHeight()
            if (r5 != r13) goto L_0x00ea
            byte[] r14 = defpackage.en0.c(r12, r14)
        L_0x00e5:
            r22 = r1
            r23 = r2
            goto L_0x014a
        L_0x00ea:
            t97 r5 = r9.c
            java.lang.Object r5 = r5.getValue()
            ir6 r5 = (defpackage.ir6) r5
            mxa r5 = r5.h()
            int r9 = r15.width()
            int r13 = r15.height()
            r5.getClass()
            defpackage.mxa.a(r9, r13)
            android.graphics.Matrix r15 = new android.graphics.Matrix
            r15.<init>()
            int r3 = r12.getWidth()
            r22 = r1
            int r1 = r12.getHeight()
            float r9 = (float) r9
            r23 = r2
            float r2 = (float) r3
            float r9 = r9 / r2
            float r2 = (float) r13
            float r13 = (float) r1
            float r2 = r2 / r13
            r15.setScale(r9, r2)
            r18 = 0
            r17 = 0
            r2 = r15
            r15 = r5
            r16 = r12
            r19 = r3
            r20 = r1
            r21 = r2
            t54 r1 = r15.b(r16, r17, r18, r19, r20, r21)
            java.lang.Object r2 = r1.e0()     // Catch:{ all -> 0x0141 }
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2     // Catch:{ all -> 0x0141 }
            byte[] r14 = defpackage.en0.c(r2, r14)     // Catch:{ all -> 0x0141 }
            r2 = 0
            defpackage.urd.l(r1, r2)
            goto L_0x014a
        L_0x013f:
            r2 = r0
            goto L_0x0143
        L_0x0141:
            r0 = move-exception
            goto L_0x013f
        L_0x0143:
            throw r2     // Catch:{ all -> 0x0144 }
        L_0x0144:
            r0 = move-exception
            r3 = r0
            defpackage.urd.l(r1, r2)
            throw r3
        L_0x014a:
            int r1 = r14.length
            if (r1 != 0) goto L_0x0150
            r1 = 1
        L_0x014e:
            r2 = 1
            goto L_0x0152
        L_0x0150:
            r1 = 0
            goto L_0x014e
        L_0x0152:
            r1 = r1 ^ r2
            if (r1 == 0) goto L_0x0160
            gw6 r1 = new gw6
            r1.<init>()
            r1.a = r14
            r2 = 0
            r13 = 1
            goto L_0x0271
        L_0x0160:
            r2 = 0
            goto L_0x026f
        L_0x0163:
            r22 = r1
            r23 = r2
            boolean r1 = r9 instanceof whe
            if (r1 == 0) goto L_0x017a
            ow6 r1 = new ow6
            r1.<init>()
            whe r9 = (whe) r9
            int r2 = r9.b
            r1.a = r2
            r13 = 2
        L_0x0177:
            r2 = 0
            goto L_0x0271
        L_0x017a:
            boolean r1 = r9 instanceof wld
            if (r1 == 0) goto L_0x018b
            nw6 r1 = new nw6
            r1.<init>()
            wld r9 = (wld) r9
            int r2 = r9.a
            r1.a = r2
            r13 = 4
            goto L_0x0177
        L_0x018b:
            boolean r1 = r9 instanceof ak
            r2 = 3
            if (r1 == 0) goto L_0x020d
            r1 = r9
            ak r1 = (ak) r1
            zj r1 = r1.w0
            mi r3 = r1.c
            boolean r5 = r3 instanceof ki
            if (r5 == 0) goto L_0x01a0
            ki r3 = (ki) r3
            android.graphics.drawable.Drawable r1 = r3.a
            goto L_0x01b7
        L_0x01a0:
            r7e r3 = r1.A0
            boolean r5 = r3.a()
            if (r5 == 0) goto L_0x01af
            java.lang.Object r1 = r3.getValue()
            android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1
            goto L_0x01b7
        L_0x01af:
            t97 r1 = r1.y0
            java.lang.Object r1 = r1.getValue()
            dw4 r1 = (dw4) r1
        L_0x01b7:
            t54 r1 = r0.c(r1)
            if (r1 == 0) goto L_0x0160
            java.lang.Object r3 = r14.getValue()     // Catch:{ all -> 0x01f9 }
            en0 r3 = (defpackage.en0) r3     // Catch:{ all -> 0x01f9 }
            java.lang.Object r5 = r1.e0()     // Catch:{ all -> 0x01f9 }
            android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5     // Catch:{ all -> 0x01f9 }
            gvf r3 = r3.a     // Catch:{ all -> 0x01f9 }
            java.lang.Object r3 = r3.b     // Catch:{ all -> 0x01f9 }
            r7e r3 = (defpackage.r7e) r3     // Catch:{ all -> 0x01f9 }
            java.lang.Object r3 = r3.getValue()     // Catch:{ all -> 0x01f9 }
            byte[] r3 = (byte[]) r3     // Catch:{ all -> 0x01f9 }
            byte[] r3 = defpackage.en0.c(r5, r3)     // Catch:{ all -> 0x01f9 }
            int r5 = r3.length     // Catch:{ all -> 0x01f9 }
            if (r5 != 0) goto L_0x01df
            r5 = 1
        L_0x01dd:
            r12 = 1
            goto L_0x01e1
        L_0x01df:
            r5 = 0
            goto L_0x01dd
        L_0x01e1:
            r5 = r5 ^ r12
            if (r5 == 0) goto L_0x01fc
            hw6 r5 = new hw6     // Catch:{ all -> 0x01f9 }
            r5.<init>()     // Catch:{ all -> 0x01f9 }
            ak r9 = (ak) r9     // Catch:{ all -> 0x01f9 }
            vh5 r9 = r9.a     // Catch:{ all -> 0x01f9 }
            int r9 = r9.ordinal()     // Catch:{ all -> 0x01f9 }
            r5.a = r9     // Catch:{ all -> 0x01f9 }
            r5.b = r3     // Catch:{ all -> 0x01f9 }
            r13 = r2
            r2 = r5
            r3 = 0
            goto L_0x01ff
        L_0x01f9:
            r0 = move-exception
            r2 = r0
            goto L_0x0206
        L_0x01fc:
            r2 = 0
            r3 = 0
            r13 = 0
        L_0x01ff:
            defpackage.urd.l(r1, r3)
            r1 = r2
            r2 = r3
            goto L_0x0271
        L_0x0206:
            throw r2     // Catch:{ all -> 0x0207 }
        L_0x0207:
            r0 = move-exception
            r3 = r0
            defpackage.urd.l(r1, r2)
            throw r3
        L_0x020d:
            boolean r1 = r9 instanceof bi5
            if (r1 == 0) goto L_0x0288
            r1 = r9
            android.text.style.ImageSpan r1 = (android.text.style.ImageSpan) r1
            android.graphics.drawable.Drawable r1 = r1.getDrawable()
            if (r1 != 0) goto L_0x021c
            r1 = 0
            goto L_0x0220
        L_0x021c:
            t54 r1 = r0.c(r1)
        L_0x0220:
            if (r1 == 0) goto L_0x0160
            java.lang.Object r3 = r14.getValue()     // Catch:{ all -> 0x025d }
            en0 r3 = (defpackage.en0) r3     // Catch:{ all -> 0x025d }
            java.lang.Object r5 = r1.e0()     // Catch:{ all -> 0x025d }
            android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5     // Catch:{ all -> 0x025d }
            gvf r3 = r3.a     // Catch:{ all -> 0x025d }
            java.lang.Object r3 = r3.b     // Catch:{ all -> 0x025d }
            r7e r3 = (defpackage.r7e) r3     // Catch:{ all -> 0x025d }
            java.lang.Object r3 = r3.getValue()     // Catch:{ all -> 0x025d }
            byte[] r3 = (byte[]) r3     // Catch:{ all -> 0x025d }
            byte[] r3 = defpackage.en0.c(r5, r3)     // Catch:{ all -> 0x025d }
            int r5 = r3.length     // Catch:{ all -> 0x025d }
            if (r5 != 0) goto L_0x0244
            r5 = 1
        L_0x0242:
            r12 = 1
            goto L_0x0246
        L_0x0244:
            r5 = 0
            goto L_0x0242
        L_0x0246:
            r5 = r5 ^ r12
            if (r5 == 0) goto L_0x0260
            hw6 r5 = new hw6     // Catch:{ all -> 0x025d }
            r5.<init>()     // Catch:{ all -> 0x025d }
            bi5 r9 = (bi5) r9     // Catch:{ all -> 0x025d }
            vh5 r9 = r9.a     // Catch:{ all -> 0x025d }
            int r9 = r9.ordinal()     // Catch:{ all -> 0x025d }
            r5.a = r9     // Catch:{ all -> 0x025d }
            r5.b = r3     // Catch:{ all -> 0x025d }
            r13 = r2
            r2 = 0
            goto L_0x0263
        L_0x025d:
            r0 = move-exception
            r2 = r0
            goto L_0x0268
        L_0x0260:
            r2 = 0
            r5 = 0
            r13 = 0
        L_0x0263:
            defpackage.urd.l(r1, r2)
            r1 = r5
            goto L_0x0271
        L_0x0268:
            throw r2     // Catch:{ all -> 0x0269 }
        L_0x0269:
            r0 = move-exception
            r3 = r0
            defpackage.urd.l(r1, r2)
            throw r3
        L_0x026f:
            r1 = r2
            r13 = 0
        L_0x0271:
            if (r1 == 0) goto L_0x0289
            byte[] r1 = defpackage.gr8.toByteArray(r1)
            mw6 r3 = new mw6
            r3.<init>()
            r3.b = r10
            r3.c = r11
            r3.a = r13
            r3.d = r1
            r6.add(r3)
            goto L_0x0289
        L_0x0288:
            r2 = 0
        L_0x0289:
            int r8 = r8 + 1
            r3 = r2
            r1 = r22
            r2 = r23
            r5 = 0
            goto L_0x003b
        L_0x0293:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qhb.b(java.lang.CharSequence):java.util.ArrayList");
    }

    public final t54 c(Drawable drawable) {
        try {
            mxa h = ((ir6) this.b.getValue()).h();
            int width = drawable.getBounds().width();
            int height = drawable.getBounds().height();
            if (width <= 0) {
                width = a24.X(((float) 18) * dh4.c().getDisplayMetrics().density);
            }
            if (height <= 0) {
                height = a24.X(((float) 18) * dh4.c().getDisplayMetrics().density);
            }
            Rect bounds = drawable.getBounds();
            int i = bounds.left;
            int i2 = bounds.top;
            int i3 = bounds.right;
            int i4 = bounds.bottom;
            e13 c2 = h.c(width, height, Bitmap.Config.ARGB_8888);
            drawable.setBounds(0, 0, width, height);
            Canvas canvas = new Canvas((Bitmap) c2.e0());
            canvas.drawColor(0, PorterDuff.Mode.SRC);
            drawable.draw(canvas);
            drawable.setBounds(i, i2, i3, i4);
            return (t54) c2;
        } catch (Throwable th) {
            udd.s(drawable.getClass().getName(), "fail to fetch image from Drawable", th);
            return null;
        }
    }
}
