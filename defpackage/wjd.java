package defpackage;

import java.util.ArrayList;
import java.util.Collections;

/* renamed from: wjd  reason: default package */
public final class wjd {
    public static final xb4 i = new xb4(18);
    public static final xb4 j = new xb4(20);
    public static final xb4 k = new xb4(19);
    public static final xb4 l = new xb4(21);
    public final /* synthetic */ int a;
    public final int b;
    public final ArrayList c;
    public int d;
    public int e;
    public int f;
    public int g;
    public final Object[] h;

    public wjd(int i2, int i3) {
        this.a = i3;
        switch (i3) {
            case 1:
                this.b = i2;
                this.h = new vjd[5];
                this.c = new ArrayList();
                this.d = -1;
                return;
            default:
                this.b = i2;
                this.h = new ujd[5];
                this.c = new ArrayList();
                this.d = -1;
                return;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: ujd} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: vjd} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v19, resolved type: ujd} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v20, resolved type: ujd} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v21, resolved type: vjd} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v22, resolved type: vjd} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r6, float r7) {
        /*
            r5 = this;
            int r0 = r5.a
            switch(r0) {
                case 0: goto L_0x006a;
                default: goto L_0x0005;
            }
        L_0x0005:
            int r0 = r5.d
            java.util.ArrayList r1 = r5.c
            r2 = 1
            if (r0 == r2) goto L_0x0013
            xb4 r0 = k
            java.util.Collections.sort(r1, r0)
            r5.d = r2
        L_0x0013:
            int r0 = r5.g
            java.lang.Object[] r3 = r5.h
            vjd[] r3 = (defpackage.vjd[]) r3
            if (r0 <= 0) goto L_0x0021
            int r0 = r0 - r2
            r5.g = r0
            r0 = r3[r0]
            goto L_0x0026
        L_0x0021:
            vjd r0 = new vjd
            r0.<init>()
        L_0x0026:
            int r2 = r5.e
            int r4 = r2 + 1
            r5.e = r4
            r0.a = r2
            r0.b = r6
            r0.c = r7
            r1.add(r0)
            int r7 = r5.f
            int r7 = r7 + r6
            r5.f = r7
        L_0x003a:
            int r6 = r5.f
            int r7 = r5.b
            if (r6 <= r7) goto L_0x0069
            int r6 = r6 - r7
            r7 = 0
            java.lang.Object r0 = r1.get(r7)
            vjd r0 = (defpackage.vjd) r0
            int r2 = r0.b
            if (r2 > r6) goto L_0x0060
            int r6 = r5.f
            int r6 = r6 - r2
            r5.f = r6
            r1.remove(r7)
            int r6 = r5.g
            r7 = 5
            if (r6 >= r7) goto L_0x003a
            int r7 = r6 + 1
            r5.g = r7
            r3[r6] = r0
            goto L_0x003a
        L_0x0060:
            int r2 = r2 - r6
            r0.b = r2
            int r7 = r5.f
            int r7 = r7 - r6
            r5.f = r7
            goto L_0x003a
        L_0x0069:
            return
        L_0x006a:
            int r0 = r5.d
            java.util.ArrayList r1 = r5.c
            r2 = 1
            if (r0 == r2) goto L_0x0078
            xb4 r0 = i
            java.util.Collections.sort(r1, r0)
            r5.d = r2
        L_0x0078:
            int r0 = r5.g
            java.lang.Object[] r3 = r5.h
            ujd[] r3 = (defpackage.ujd[]) r3
            if (r0 <= 0) goto L_0x0086
            int r0 = r0 - r2
            r5.g = r0
            r0 = r3[r0]
            goto L_0x008b
        L_0x0086:
            ujd r0 = new ujd
            r0.<init>()
        L_0x008b:
            int r2 = r5.e
            int r4 = r2 + 1
            r5.e = r4
            r0.a = r2
            r0.b = r6
            r0.c = r7
            r1.add(r0)
            int r7 = r5.f
            int r7 = r7 + r6
            r5.f = r7
        L_0x009f:
            int r6 = r5.f
            int r7 = r5.b
            if (r6 <= r7) goto L_0x00ce
            int r6 = r6 - r7
            r7 = 0
            java.lang.Object r0 = r1.get(r7)
            ujd r0 = (defpackage.ujd) r0
            int r2 = r0.b
            if (r2 > r6) goto L_0x00c5
            int r6 = r5.f
            int r6 = r6 - r2
            r5.f = r6
            r1.remove(r7)
            int r6 = r5.g
            r7 = 5
            if (r6 >= r7) goto L_0x009f
            int r7 = r6 + 1
            r5.g = r7
            r3[r6] = r0
            goto L_0x009f
        L_0x00c5:
            int r2 = r2 - r6
            r0.b = r2
            int r7 = r5.f
            int r7 = r7 - r6
            r5.f = r7
            goto L_0x009f
        L_0x00ce:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wjd.a(int, float):void");
    }

    public final float b() {
        switch (this.a) {
            case 0:
                int i2 = this.d;
                ArrayList arrayList = this.c;
                if (i2 != 0) {
                    Collections.sort(arrayList, j);
                    this.d = 0;
                }
                float f2 = 0.5f * ((float) this.f);
                int i3 = 0;
                for (int i4 = 0; i4 < arrayList.size(); i4++) {
                    ujd ujd = (ujd) arrayList.get(i4);
                    i3 += ujd.b;
                    if (((float) i3) >= f2) {
                        return ujd.c;
                    }
                }
                if (arrayList.isEmpty()) {
                    return Float.NaN;
                }
                return ((ujd) rf0.e(arrayList, 1)).c;
            default:
                int i5 = this.d;
                ArrayList arrayList2 = this.c;
                if (i5 != 0) {
                    Collections.sort(arrayList2, l);
                    this.d = 0;
                }
                float f3 = 0.5f * ((float) this.f);
                int i6 = 0;
                for (int i7 = 0; i7 < arrayList2.size(); i7++) {
                    vjd vjd = (vjd) arrayList2.get(i7);
                    i6 += vjd.b;
                    if (((float) i6) >= f3) {
                        return vjd.c;
                    }
                }
                if (arrayList2.isEmpty()) {
                    return Float.NaN;
                }
                return ((vjd) rf0.e(arrayList2, 1)).c;
        }
    }
}
