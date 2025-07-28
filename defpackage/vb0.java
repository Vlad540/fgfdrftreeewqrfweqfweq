package defpackage;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;

/* renamed from: vb0  reason: default package */
public final class vb0 extends ii0 {
    public final tb9 c = new tb9(1);
    public final Paint d;
    public final Matrix e;

    public vb0() {
        Paint paint = new Paint(1);
        paint.setAntiAlias(true);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.d = paint;
        this.e = new Matrix();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0068, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0069, code lost:
        urd.l(r9, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x006c, code lost:
        throw r8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final e13 a(android.graphics.Bitmap r8, mxa r9) {
        /*
            r7 = this;
            int r0 = r8.getWidth()
            int r0 = r0 / 2
            tb9 r1 = r7.c
            java.lang.Object r2 = r1.c(r0)
            if (r2 != 0) goto L_0x0038
            android.graphics.Path r2 = new android.graphics.Path
            r2.<init>()
            int r3 = r8.getWidth()
            float r3 = (float) r3
            r4 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 / r4
            int r5 = r8.getHeight()
            float r5 = (float) r5
            float r5 = r5 / r4
            float r4 = (float) r0
            android.graphics.Path$Direction r6 = android.graphics.Path.Direction.CW
            r2.addCircle(r3, r5, r4, r6)
            android.graphics.Path$FillType r3 = android.graphics.Path.FillType.INVERSE_WINDING
            r2.setFillType(r3)
            int r3 = r1.a(r0)
            int[] r4 = r1.b
            r4[r3] = r0
            java.lang.Object[] r0 = r1.c
            r0[r3] = r2
        L_0x0038:
            android.graphics.Path r2 = (android.graphics.Path) r2
            int r0 = r8.getWidth()
            int r1 = r8.getHeight()
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.ARGB_8888
            e13 r9 = r9.c(r0, r1, r3)
            android.graphics.Canvas r0 = new android.graphics.Canvas     // Catch:{ all -> 0x0066 }
            java.lang.Object r1 = r9.e0()     // Catch:{ all -> 0x0066 }
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1     // Catch:{ all -> 0x0066 }
            r0.<init>(r1)     // Catch:{ all -> 0x0066 }
            android.graphics.Matrix r1 = r7.e     // Catch:{ all -> 0x0066 }
            r3 = 0
            r0.drawBitmap(r8, r1, r3)     // Catch:{ all -> 0x0066 }
            android.graphics.Paint r7 = r7.d     // Catch:{ all -> 0x0066 }
            r0.drawPath(r2, r7)     // Catch:{ all -> 0x0066 }
            e13 r7 = r9.n()     // Catch:{ all -> 0x0066 }
            urd.l(r9, r3)
            return r7
        L_0x0066:
            r7 = move-exception
            throw r7     // Catch:{ all -> 0x0068 }
        L_0x0068:
            r8 = move-exception
            urd.l(r9, r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vb0.a(android.graphics.Bitmap, mxa):e13");
    }

    public final ov0 b() {
        return new ngd("AvatarAsCirclePostProcessor");
    }
}
