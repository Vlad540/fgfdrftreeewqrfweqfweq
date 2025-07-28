package defpackage;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: mu0  reason: default package */
public final class mu0 {
    public final /* synthetic */ int a = 2;
    public int b;
    public int c;
    public int d;
    public Serializable e;

    /* JADX WARNING: type inference failed for: r3v0, types: [java.nio.ByteBuffer[], java.io.Serializable] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public mu0(java.nio.ByteBuffer[] r3) {
        /*
            r2 = this;
            r0 = 0
            r2.a = r0
            int r0 = r3.length
            r2.<init>()
            r2.e = r3
            r1 = 0
            r2.b = r1
            r2.c = r0
            r2.d = r0
            int r2 = r3.length
            if (r2 < r0) goto L_0x0014
            return
        L_0x0014:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "Check failed."
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mu0.<init>(java.nio.ByteBuffer[]):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: java.lang.Object[]} */
    /* JADX WARNING: type inference failed for: r5v0, types: [java.lang.Object[], java.io.Serializable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(java.lang.Object r9) {
        /*
            r8 = this;
            java.io.Serializable r0 = r8.e
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            int r1 = r8.b
            int r2 = r9.hashCode()
            r3 = -1640531527(0xffffffff9e3779b9, float:-9.713111E-21)
            int r2 = r2 * r3
            int r4 = r2 >>> 16
            r2 = r2 ^ r4
            r2 = r2 & r1
            r4 = r0[r2]
            if (r4 == 0) goto L_0x002c
            boolean r4 = r4.equals(r9)
            if (r4 == 0) goto L_0x001d
            return
        L_0x001d:
            int r2 = r2 + 1
            r2 = r2 & r1
            r4 = r0[r2]
            if (r4 != 0) goto L_0x0025
            goto L_0x002c
        L_0x0025:
            boolean r4 = r4.equals(r9)
            if (r4 == 0) goto L_0x001d
            return
        L_0x002c:
            r0[r2] = r9
            int r9 = r8.c
            int r9 = r9 + 1
            r8.c = r9
            int r0 = r8.d
            if (r9 < r0) goto L_0x0073
            java.io.Serializable r0 = r8.e
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            int r1 = r0.length
            int r2 = r1 << 1
            int r4 = r2 + -1
            java.lang.Object[] r5 = new java.lang.Object[r2]
        L_0x0043:
            int r6 = r9 + -1
            if (r9 == 0) goto L_0x0068
        L_0x0047:
            int r1 = r1 + -1
            r9 = r0[r1]
            if (r9 != 0) goto L_0x004e
            goto L_0x0047
        L_0x004e:
            int r9 = r9.hashCode()
            int r9 = r9 * r3
            int r7 = r9 >>> 16
            r9 = r9 ^ r7
            r9 = r9 & r4
            r7 = r5[r9]
            if (r7 == 0) goto L_0x0062
        L_0x005b:
            int r9 = r9 + 1
            r9 = r9 & r4
            r7 = r5[r9]
            if (r7 != 0) goto L_0x005b
        L_0x0062:
            r7 = r0[r1]
            r5[r9] = r7
            r9 = r6
            goto L_0x0043
        L_0x0068:
            r8.b = r4
            float r9 = (float) r2
            r0 = 1061158912(0x3f400000, float:0.75)
            float r9 = r9 * r0
            int r9 = (int) r9
            r8.d = r9
            r8.e = r5
        L_0x0073:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mu0.a(java.lang.Object):void");
    }

    public uf4 b() {
        oyb.d(this.c <= this.d);
        return new uf4(this);
    }

    public long c() {
        long j = 0;
        for (int i = this.b; i < this.d; i++) {
            j += (long) ((ByteBuffer[]) this.e)[i].remaining();
        }
        return j;
    }

    public void d(int i, int i2, Object[] objArr) {
        int i3;
        Object obj;
        this.c--;
        while (true) {
            int i4 = i + 1;
            while (true) {
                i3 = i4 & i2;
                obj = objArr[i3];
                if (obj == null) {
                    objArr[i] = null;
                    return;
                }
                int hashCode = obj.hashCode() * -1640531527;
                int i5 = (hashCode ^ (hashCode >>> 16)) & i2;
                if (i <= i3) {
                    if (i >= i5 || i5 > i3) {
                        break;
                    }
                    i4 = i3 + 1;
                } else {
                    if (i >= i5 && i5 > i3) {
                        break;
                    }
                    i4 = i3 + 1;
                }
            }
            objArr[i] = obj;
            i = i3;
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                StringBuilder m = hr1.m("ByteBufferSet[", Arrays.toString((ByteBuffer[]) this.e), ":");
                m.append(this.b);
                m.append(":");
                return wn6.j(m, this.c, "]");
            default:
                return super.toString();
        }
    }

    public mu0(ByteBuffer byteBuffer) {
        this(new ByteBuffer[]{byteBuffer});
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [java.lang.Object[], java.io.Serializable] */
    public mu0() {
        int numberOfLeadingZeros = 1 << (32 - Integer.numberOfLeadingZeros(15));
        this.b = numberOfLeadingZeros - 1;
        this.d = (int) (0.75f * ((float) numberOfLeadingZeros));
        this.e = new Object[numberOfLeadingZeros];
    }

    public mu0(int i) {
        this.b = i;
    }
}
