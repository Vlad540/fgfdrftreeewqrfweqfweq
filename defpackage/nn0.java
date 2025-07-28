package defpackage;

import android.graphics.Bitmap;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: nn0  reason: default package */
public final /* synthetic */ class nn0 implements Runnable {
    public final /* synthetic */ ls6[] X;
    public final /* synthetic */ int Y;
    public final /* synthetic */ RandomAccessFile Z;
    public final /* synthetic */ rn0 a;
    public final /* synthetic */ AtomicBoolean b;
    public final /* synthetic */ Bitmap[] c;
    public final /* synthetic */ int o;
    public final /* synthetic */ ArrayList w0;
    public final /* synthetic */ CountDownLatch[] x0;

    public /* synthetic */ nn0(rn0 rn0, AtomicBoolean atomicBoolean, Bitmap[] bitmapArr, int i, ls6[] ls6Arr, int i2, RandomAccessFile randomAccessFile, ArrayList arrayList, CountDownLatch[] countDownLatchArr) {
        this.a = rn0;
        this.b = atomicBoolean;
        this.c = bitmapArr;
        this.o = i;
        this.X = ls6Arr;
        this.Y = i2;
        this.Z = randomAccessFile;
        this.w0 = arrayList;
        this.x0 = countDownLatchArr;
    }

    public final void run() {
        rn0 rn0 = this.a;
        AtomicBoolean atomicBoolean = this.b;
        Bitmap[] bitmapArr = this.c;
        int i = this.o;
        ls6[] ls6Arr = this.X;
        int i2 = this.Y;
        RandomAccessFile randomAccessFile = this.Z;
        ArrayList arrayList = this.w0;
        CountDownLatch[] countDownLatchArr = this.x0;
        if (!rn0.o.get() && !atomicBoolean.get()) {
            bitmapArr[i].compress(Bitmap.CompressFormat.WEBP, rn0.l, ls6Arr[i]);
            int i3 = ls6Arr[i].b;
            try {
                synchronized (rn0.h) {
                    qn0 qn0 = new qn0(i2);
                    qn0.c = (int) randomAccessFile.length();
                    arrayList.add(qn0);
                    randomAccessFile.write(ls6Arr[i].a, 0, i3);
                    qn0.b = i3;
                    ls6 ls6 = ls6Arr[i];
                    synchronized (ls6) {
                        ls6.b = 0;
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
                try {
                    randomAccessFile.close();
                } catch (Exception unused) {
                } catch (Throwable th) {
                    atomicBoolean.set(true);
                    throw th;
                }
                atomicBoolean.set(true);
            }
            countDownLatchArr[i].countDown();
        }
    }
}
