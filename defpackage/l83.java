package defpackage;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: l83  reason: default package */
public class l83 implements f83 {
    public static final j83 h = new j83(0);
    public static final byte[] i = {0, 7, 8, 15};
    public static final byte[] j = {0, 119, -120, -1};
    public static final byte[] k = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    public Object a;
    public Object b = new dd9(22);
    public Object c = new dd9(23);
    public Object d = hl.a;
    public Object e;
    public Object f;
    public Object g;

    public static final void g(l83 l83) {
        SparseArray sparseArray = (SparseArray) l83.e;
        int size = sparseArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            sparseArray.keyAt(i2);
            myd myd = (myd) sparseArray.valueAt(i2);
            SparseArray sparseArray2 = (SparseArray) l83.f;
            myd.getClass();
            List list = (List) sparseArray2.get(0);
            if (list == null) {
                list = new ArrayList();
                sparseArray2.put(0, list);
            }
            list.add(myd);
        }
        sparseArray.clear();
        ((SparseArray) l83.d).clear();
    }

    public static byte[] i(int i2, int i3, wx1 wx1) {
        byte[] bArr = new byte[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            bArr[i4] = (byte) wx1.i(i3);
        }
        return bArr;
    }

    public static int[] k() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i2 = 1; i2 < 16; i2++) {
            if (i2 < 8) {
                iArr[i2] = m(255, (i2 & 1) != 0 ? 255 : 0, (i2 & 2) != 0 ? 255 : 0, (i2 & 4) != 0 ? 255 : 0);
            } else {
                int i3 = 127;
                int i4 = (i2 & 1) != 0 ? 127 : 0;
                int i5 = (i2 & 2) != 0 ? 127 : 0;
                if ((i2 & 4) == 0) {
                    i3 = 0;
                }
                iArr[i2] = m(255, i4, i5, i3);
            }
        }
        return iArr;
    }

    public static int[] l() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            int i3 = 255;
            if (i2 < 8) {
                int i4 = (i2 & 1) != 0 ? 255 : 0;
                int i5 = (i2 & 2) != 0 ? 255 : 0;
                if ((i2 & 4) == 0) {
                    i3 = 0;
                }
                iArr[i2] = m(63, i4, i5, i3);
            } else {
                int i6 = i2 & 136;
                int i7 = 170;
                int i8 = 85;
                if (i6 == 0) {
                    int i9 = ((i2 & 1) != 0 ? 85 : 0) + ((i2 & 16) != 0 ? 170 : 0);
                    int i10 = ((i2 & 2) != 0 ? 85 : 0) + ((i2 & 32) != 0 ? 170 : 0);
                    if ((i2 & 4) == 0) {
                        i8 = 0;
                    }
                    if ((i2 & 64) == 0) {
                        i7 = 0;
                    }
                    iArr[i2] = m(255, i9, i10, i8 + i7);
                } else if (i6 != 8) {
                    int i11 = 43;
                    if (i6 == 128) {
                        int i12 = ((i2 & 1) != 0 ? 43 : 0) + 127 + ((i2 & 16) != 0 ? 85 : 0);
                        int i13 = ((i2 & 2) != 0 ? 43 : 0) + 127 + ((i2 & 32) != 0 ? 85 : 0);
                        if ((i2 & 4) == 0) {
                            i11 = 0;
                        }
                        int i14 = i11 + 127;
                        if ((i2 & 64) == 0) {
                            i8 = 0;
                        }
                        iArr[i2] = m(255, i12, i13, i14 + i8);
                    } else if (i6 == 136) {
                        int i15 = ((i2 & 1) != 0 ? 43 : 0) + ((i2 & 16) != 0 ? 85 : 0);
                        int i16 = ((i2 & 2) != 0 ? 43 : 0) + ((i2 & 32) != 0 ? 85 : 0);
                        if ((i2 & 4) == 0) {
                            i11 = 0;
                        }
                        if ((i2 & 64) == 0) {
                            i8 = 0;
                        }
                        iArr[i2] = m(255, i15, i16, i11 + i8);
                    }
                } else {
                    int i17 = ((i2 & 1) != 0 ? 85 : 0) + ((i2 & 16) != 0 ? 170 : 0);
                    int i18 = ((i2 & 2) != 0 ? 85 : 0) + ((i2 & 32) != 0 ? 170 : 0);
                    if ((i2 & 4) == 0) {
                        i8 = 0;
                    }
                    if ((i2 & 64) == 0) {
                        i7 = 0;
                    }
                    iArr[i2] = m(127, i17, i18, i8 + i7);
                }
            }
        }
        return iArr;
    }

    public static int m(int i2, int i3, int i4, int i5) {
        return (i2 << 24) | (i3 << 16) | (i4 << 8) | i5;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v62, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v63, resolved type: byte} */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=int, for r3v34, types: [byte] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=int, for r3v7, types: [byte] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x01f3 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0226 A[LOOP:3: B:86:0x0174->B:115:0x0226, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0221 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x017a  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0183  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void p(byte[] r23, int[] r24, int r25, int r26, int r27, android.graphics.Paint r28, android.graphics.Canvas r29) {
        /*
            r0 = r23
            r1 = r25
            r8 = r28
            wx1 r9 = new wx1
            int r2 = r0.length
            r3 = 1
            r4 = 0
            r9.<init>((byte[]) r0, (int) r2, (int) r3, (byte) r4)
            r2 = r26
            r10 = r27
            r11 = 0
            r12 = 0
            r13 = 0
        L_0x0015:
            int r3 = r9.b()
            if (r3 == 0) goto L_0x0231
            r14 = 8
            int r3 = r9.i(r14)
            r4 = 240(0xf0, float:3.36E-43)
            if (r3 == r4) goto L_0x022b
            r15 = 2
            r7 = 1
            r16 = 0
            r6 = 3
            r5 = 4
            switch(r3) {
                case 16: goto L_0x0159;
                case 17: goto L_0x009f;
                case 18: goto L_0x0043;
                default: goto L_0x002e;
            }
        L_0x002e:
            switch(r3) {
                case 32: goto L_0x003e;
                case 33: goto L_0x0039;
                case 34: goto L_0x0032;
                default: goto L_0x0031;
            }
        L_0x0031:
            goto L_0x0015
        L_0x0032:
            r3 = 16
            byte[] r12 = i(r3, r14, r9)
            goto L_0x0015
        L_0x0039:
            byte[] r11 = i(r5, r14, r9)
            goto L_0x0015
        L_0x003e:
            byte[] r13 = i(r5, r5, r9)
            goto L_0x0015
        L_0x0043:
            r15 = r2
            r2 = r16
        L_0x0046:
            int r3 = r9.i(r14)
            if (r3 == 0) goto L_0x0051
            r17 = r2
            r18 = r7
            goto L_0x0079
        L_0x0051:
            boolean r3 = r9.h()
            r4 = 7
            if (r3 != 0) goto L_0x006c
            int r3 = r9.i(r4)
            if (r3 == 0) goto L_0x0065
            r17 = r2
            r18 = r3
            r3 = r16
            goto L_0x0079
        L_0x0065:
            r17 = r7
            r3 = r16
            r18 = r3
            goto L_0x0079
        L_0x006c:
            int r3 = r9.i(r4)
            int r4 = r9.i(r14)
            r17 = r2
            r18 = r3
            r3 = r4
        L_0x0079:
            if (r18 == 0) goto L_0x0093
            if (r8 == 0) goto L_0x0093
            r2 = r24[r3]
            r8.setColor(r2)
            float r3 = (float) r15
            float r4 = (float) r10
            int r2 = r15 + r18
            float r5 = (float) r2
            int r2 = r10 + 1
            float r6 = (float) r2
            r2 = r29
            r0 = r7
            r7 = r28
            r2.drawRect(r3, r4, r5, r6, r7)
            goto L_0x0094
        L_0x0093:
            r0 = r7
        L_0x0094:
            int r15 = r15 + r18
            if (r17 == 0) goto L_0x009b
            r2 = r15
            goto L_0x0015
        L_0x009b:
            r7 = r0
            r2 = r17
            goto L_0x0046
        L_0x009f:
            r0 = r7
            if (r1 != r6) goto L_0x00ab
            if (r12 != 0) goto L_0x00a7
            byte[] r3 = k
            goto L_0x00a8
        L_0x00a7:
            r3 = r12
        L_0x00a8:
            r17 = r3
            goto L_0x00ad
        L_0x00ab:
            r17 = 0
        L_0x00ad:
            r7 = r2
            r2 = r16
        L_0x00b0:
            int r3 = r9.i(r5)
            if (r3 == 0) goto L_0x00bc
            r19 = r0
            r18 = r2
            goto L_0x011c
        L_0x00bc:
            boolean r3 = r9.h()
            if (r3 != 0) goto L_0x00d8
            int r3 = r9.i(r6)
            if (r3 == 0) goto L_0x00d1
            int r3 = r3 + 2
            r18 = r2
            r19 = r3
        L_0x00ce:
            r3 = r16
            goto L_0x011c
        L_0x00d1:
            r18 = r0
        L_0x00d3:
            r3 = r16
            r19 = r3
            goto L_0x011c
        L_0x00d8:
            boolean r3 = r9.h()
            if (r3 != 0) goto L_0x00ed
            int r3 = r9.i(r15)
            int r3 = r3 + r5
            int r4 = r9.i(r5)
        L_0x00e7:
            r18 = r2
            r19 = r3
            r3 = r4
            goto L_0x011c
        L_0x00ed:
            int r3 = r9.i(r15)
            if (r3 == 0) goto L_0x0117
            if (r3 == r0) goto L_0x0112
            if (r3 == r15) goto L_0x0107
            if (r3 == r6) goto L_0x00fc
            r18 = r2
            goto L_0x00d3
        L_0x00fc:
            int r3 = r9.i(r14)
            int r3 = r3 + 25
            int r4 = r9.i(r5)
            goto L_0x00e7
        L_0x0107:
            int r3 = r9.i(r5)
            int r3 = r3 + 9
            int r4 = r9.i(r5)
            goto L_0x00e7
        L_0x0112:
            r18 = r2
            r19 = r15
            goto L_0x00ce
        L_0x0117:
            r19 = r0
            r18 = r2
            goto L_0x00ce
        L_0x011c:
            if (r19 == 0) goto L_0x0144
            if (r8 == 0) goto L_0x0144
            if (r17 == 0) goto L_0x0124
            byte r3 = r17[r3]
        L_0x0124:
            r2 = r24[r3]
            r8.setColor(r2)
            float r3 = (float) r7
            float r4 = (float) r10
            int r2 = r7 + r19
            float r2 = (float) r2
            int r5 = r10 + 1
            float r5 = (float) r5
            r20 = r2
            r2 = r29
            r22 = r5
            r5 = r20
            r14 = r6
            r6 = r22
            r20 = r7
            r7 = r28
            r2.drawRect(r3, r4, r5, r6, r7)
            goto L_0x0147
        L_0x0144:
            r14 = r6
            r20 = r7
        L_0x0147:
            int r7 = r20 + r19
            if (r18 == 0) goto L_0x0151
            r9.c()
        L_0x014e:
            r2 = r7
            goto L_0x0015
        L_0x0151:
            r6 = r14
            r2 = r18
            r5 = 4
            r14 = 8
            goto L_0x00b0
        L_0x0159:
            r14 = r6
            r0 = r7
            if (r1 != r14) goto L_0x0166
            if (r11 != 0) goto L_0x0162
            byte[] r3 = j
            goto L_0x0163
        L_0x0162:
            r3 = r11
        L_0x0163:
            r17 = r3
            goto L_0x0171
        L_0x0166:
            if (r1 != r15) goto L_0x016f
            if (r13 != 0) goto L_0x016d
            byte[] r3 = i
            goto L_0x0163
        L_0x016d:
            r3 = r13
            goto L_0x0163
        L_0x016f:
            r17 = 0
        L_0x0171:
            r7 = r2
            r2 = r16
        L_0x0174:
            int r3 = r9.i(r15)
            if (r3 == 0) goto L_0x0183
            r19 = r0
            r18 = r2
        L_0x017e:
            r5 = 4
            r6 = 8
            goto L_0x01f1
        L_0x0183:
            boolean r3 = r9.h()
            if (r3 == 0) goto L_0x0198
            int r3 = r9.i(r14)
            int r3 = r3 + r14
            int r4 = r9.i(r15)
            r18 = r2
            r19 = r3
            r3 = r4
            goto L_0x017e
        L_0x0198:
            boolean r3 = r9.h()
            if (r3 == 0) goto L_0x01a5
            r19 = r0
            r18 = r2
            r3 = r16
            goto L_0x017e
        L_0x01a5:
            int r3 = r9.i(r15)
            if (r3 == 0) goto L_0x01e8
            if (r3 == r0) goto L_0x01de
            if (r3 == r15) goto L_0x01cb
            if (r3 == r14) goto L_0x01b8
            r18 = r2
            r3 = r16
            r19 = r3
            goto L_0x017e
        L_0x01b8:
            r6 = 8
            int r3 = r9.i(r6)
            int r3 = r3 + 29
            int r4 = r9.i(r15)
            r18 = r2
            r19 = r3
            r3 = r4
            r5 = 4
            goto L_0x01f1
        L_0x01cb:
            r5 = 4
            r6 = 8
            int r3 = r9.i(r5)
            int r3 = r3 + 12
            int r4 = r9.i(r15)
            r18 = r2
            r19 = r3
            r3 = r4
            goto L_0x01f1
        L_0x01de:
            r5 = 4
            r6 = 8
            r18 = r2
            r19 = r15
            r3 = r16
            goto L_0x01f1
        L_0x01e8:
            r5 = 4
            r6 = 8
            r18 = r0
            r3 = r16
            r19 = r3
        L_0x01f1:
            if (r19 == 0) goto L_0x0218
            if (r8 == 0) goto L_0x0218
            if (r17 == 0) goto L_0x01f9
            byte r3 = r17[r3]
        L_0x01f9:
            r2 = r24[r3]
            r8.setColor(r2)
            float r3 = (float) r7
            float r4 = (float) r10
            int r2 = r7 + r19
            float r2 = (float) r2
            int r0 = r10 + 1
            float r0 = (float) r0
            r21 = r2
            r2 = r29
            r22 = r5
            r5 = r21
            r21 = r6
            r6 = r0
            r0 = r7
            r7 = r28
            r2.drawRect(r3, r4, r5, r6, r7)
            goto L_0x021d
        L_0x0218:
            r22 = r5
            r21 = r6
            r0 = r7
        L_0x021d:
            int r7 = r0 + r19
            if (r18 == 0) goto L_0x0226
            r9.c()
            goto L_0x014e
        L_0x0226:
            r2 = r18
            r0 = 1
            goto L_0x0174
        L_0x022b:
            int r10 = r10 + 2
            r2 = r26
            goto L_0x0015
        L_0x0231:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l83.p(byte[], int[], int, int, int, android.graphics.Paint, android.graphics.Canvas):void");
    }

    public static gq4 q(wx1 wx1, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        wx1 wx12 = wx1;
        int i8 = 8;
        int i9 = wx12.i(8);
        wx12.t(8);
        int i10 = 2;
        int i11 = i2 - 2;
        int i12 = 0;
        int[] iArr = {0, -1, -16777216, -8421505};
        int[] k2 = k();
        int[] l = l();
        while (i11 > 0) {
            int i13 = wx12.i(i8);
            int i14 = wx12.i(i8);
            int[] iArr2 = (i14 & 128) != 0 ? iArr : (i14 & 64) != 0 ? k2 : l;
            if ((i14 & 1) != 0) {
                i6 = wx12.i(i8);
                i5 = wx12.i(i8);
                i4 = wx12.i(i8);
                i3 = wx12.i(i8);
                i7 = i11 - 6;
            } else {
                i4 = wx12.i(4) << 4;
                i7 = i11 - 4;
                int i15 = wx12.i(4) << 4;
                i3 = wx12.i(i10) << 6;
                i6 = wx12.i(6) << i10;
                i5 = i15;
            }
            if (i6 == 0) {
                i5 = i12;
                i4 = i5;
                i3 = 255;
            }
            double d2 = (double) i6;
            double d3 = (double) (i5 - 128);
            double d4 = (double) (i4 - 128);
            iArr2[i13] = m((byte) (255 - (i3 & 255)), mze.j((int) ((1.402d * d3) + d2), 0, 255), mze.j((int) ((d2 - (0.34414d * d4)) - (d3 * 0.71414d)), 0, 255), mze.j((int) ((d4 * 1.772d) + d2), 0, 255));
            i11 = i7;
            i12 = 0;
            i9 = i9;
            l = l;
            i8 = 8;
            i10 = 2;
        }
        return new gq4(i9, iArr, k2, l);
    }

    public static jq4 r(wx1 wx1) {
        byte[] bArr;
        int i2 = wx1.i(16);
        wx1.t(4);
        int i3 = wx1.i(2);
        boolean h2 = wx1.h();
        wx1.t(1);
        byte[] bArr2 = mze.f;
        if (i3 == 1) {
            wx1.t(wx1.i(8) * 16);
        } else if (i3 == 0) {
            int i4 = wx1.i(16);
            int i5 = wx1.i(16);
            if (i4 > 0) {
                bArr2 = new byte[i4];
                wx1.l(i4, bArr2);
            }
            if (i5 > 0) {
                bArr = new byte[i5];
                wx1.l(i5, bArr);
                return new jq4(i2, h2, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new jq4(i2, h2, bArr2, bArr);
    }

    public synchronized jib d(pjb pjb) {
        z97 z97 = (z97) ((HashMap) this.c).get(pjb);
        if (z97 != null) {
            return z97;
        }
        return h;
    }

    public synchronized jib e(pjb pjb) {
        n06.j(pjb, "Null interface requested.");
        return (jib) ((HashMap) this.b).get(pjb);
    }

    public mw9 h() {
        ya3 ya3 = (ya3) this.a;
        mle mle = (mle) this.b;
        nl nlVar = (nl) this.g;
        rl rlVar = (rl) this.f;
        jj7 jj7 = (jj7) this.e;
        if (nlVar != null && rlVar != null && jj7 != null) {
            return new v94(this, nlVar, rlVar, jj7);
        }
        if (ya3 != null && mle != null) {
            return new v94(this, ya3, mle);
        }
        throw new IllegalArgumentException("You must either provide configurationStore and tokenProvider, either sessionStore, tokenInfoProvider and appKeyProvider");
    }

    public void j(Map map, boolean z) {
        ArrayDeque arrayDeque;
        for (Map.Entry entry : map.entrySet()) {
            jib jib = (jib) entry.getValue();
            int i2 = ((t73) entry.getKey()).d;
            if (i2 == 1 || (i2 == 2 && z)) {
                jib.get();
            }
        }
        k05 k05 = (k05) this.e;
        synchronized (k05) {
            arrayDeque = k05.b;
            if (arrayDeque != null) {
                k05.b = null;
            } else {
                arrayDeque = null;
            }
        }
        if (arrayDeque != null) {
            Iterator it = arrayDeque.iterator();
            if (it.hasNext()) {
                hr1.r(it.next());
                throw null;
            }
        }
    }

    public Object n(int i2) {
        SparseArray sparseArray = (SparseArray) this.d;
        if (sparseArray.indexOfKey(i2) >= 0) {
            return sparseArray.get(i2);
        }
        Object a2 = ((syd) this.c).a(i2);
        sparseArray.put(i2, a2);
        return a2;
    }

    public myd o(int i2) {
        SparseArray sparseArray = (SparseArray) this.e;
        myd myd = (myd) sparseArray.get(i2);
        if (myd == null) {
            syd syd = (syd) this.c;
            syd.getClass();
            List list = (List) ((SparseArray) this.f).get(0);
            RecyclerView recyclerView = (RecyclerView) this.a;
            myd = (list == null || list.isEmpty()) ? syd.b(recyclerView) : (myd) list.remove(0);
            sparseArray.put(i2, myd);
            syd.c(myd, i2);
            View view = myd.a;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            view.measure(marginLayoutParams.width == -1 ? View.MeasureSpec.makeMeasureSpec((recyclerView.getMeasuredWidth() - marginLayoutParams.rightMargin) - recyclerView.getScrollBarSize(), 1073741824) : ViewGroup.getChildMeasureSpec(recyclerView.getMeasuredWidth(), 0, view.getLayoutParams().width), ViewGroup.getChildMeasureSpec(recyclerView.getMeasuredHeight(), 0, view.getLayoutParams().height));
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            if (xy6.w(view)) {
                view.layout(recyclerView.getMeasuredWidth() - measuredWidth, 0, recyclerView.getMeasuredWidth(), measuredHeight);
            } else {
                view.layout(0, 0, measuredWidth, measuredHeight);
            }
            myd.b = marginLayoutParams.getMarginStart();
            myd.c = marginLayoutParams.topMargin;
        }
        return myd;
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [fga, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r6v4, types: [z97, java.lang.Object] */
    public void s() {
        for (t73 t73 : ((HashMap) this.a).keySet()) {
            Iterator it = t73.c.iterator();
            while (true) {
                if (it.hasNext()) {
                    oe4 oe4 = (oe4) it.next();
                    if (oe4.b == 2 && !((HashMap) this.c).containsKey(oe4.a)) {
                        pjb pjb = oe4.a;
                        Set emptySet = Collections.emptySet();
                        ? obj = new Object();
                        obj.b = null;
                        obj.a = Collections.newSetFromMap(new ConcurrentHashMap());
                        obj.a.addAll(emptySet);
                        ((HashMap) this.c).put(pjb, obj);
                    } else if (((HashMap) this.b).containsKey(oe4.a)) {
                        continue;
                    } else {
                        int i2 = oe4.b;
                        if (i2 == 1) {
                            pjb pjb2 = oe4.a;
                            throw new RuntimeException("Unsatisfied dependency for component " + t73 + ": " + pjb2);
                        } else if (i2 != 2) {
                            pjb pjb3 = oe4.a;
                            hs1 hs1 = fga.c;
                            j83 j83 = fga.d;
                            ? obj2 = new Object();
                            obj2.a = hs1;
                            obj2.b = j83;
                            ((HashMap) this.b).put(pjb3, obj2);
                        }
                    }
                }
            }
        }
    }

    public ArrayList t(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            t73 t73 = (t73) it.next();
            if (t73.e == 0) {
                jib jib = (jib) ((HashMap) this.a).get(t73);
                for (pjb pjb : t73.b) {
                    HashMap hashMap = (HashMap) this.b;
                    if (!hashMap.containsKey(pjb)) {
                        hashMap.put(pjb, jib);
                    } else {
                        arrayList2.add(new dr1((fga) ((jib) hashMap.get(pjb)), 9, jib));
                    }
                }
            }
        }
        return arrayList2;
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [z97, java.lang.Object] */
    public ArrayList u() {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : ((HashMap) this.a).entrySet()) {
            t73 t73 = (t73) entry.getKey();
            if (t73.e != 0) {
                jib jib = (jib) entry.getValue();
                for (pjb pjb : t73.b) {
                    if (!hashMap.containsKey(pjb)) {
                        hashMap.put(pjb, new HashSet());
                    }
                    ((Set) hashMap.get(pjb)).add(jib);
                }
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            Object key = entry2.getKey();
            HashMap hashMap2 = (HashMap) this.c;
            if (!hashMap2.containsKey(key)) {
                ? obj = new Object();
                obj.b = null;
                obj.a = Collections.newSetFromMap(new ConcurrentHashMap());
                obj.a.addAll((Set) ((Collection) entry2.getValue()));
                hashMap2.put((pjb) entry2.getKey(), obj);
            } else {
                z97 z97 = (z97) hashMap2.get(entry2.getKey());
                for (jib dr1 : (Set) entry2.getValue()) {
                    arrayList.add(new dr1(z97, 10, dr1));
                }
            }
        }
        return arrayList;
    }
}
