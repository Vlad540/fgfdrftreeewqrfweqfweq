package defpackage;

import android.graphics.Bitmap;
import com.facebook.imagepipeline.image.CloseableStaticBitmap;

/* renamed from: u54  reason: default package */
public final class u54 extends zg0 implements CloseableStaticBitmap {
    public static final /* synthetic */ int x0 = 0;
    public volatile Bitmap X;
    public final tjb Y;
    public final int Z;
    public e13 o;
    public final int w0;

    public u54(Bitmap bitmap, nbc nbc, tjb tjb, int i, int i2) {
        bitmap.getClass();
        this.X = bitmap;
        Bitmap bitmap2 = this.X;
        nbc.getClass();
        this.o = e13.p0(bitmap2, nbc, e13.Y);
        this.Y = tjb;
        this.Z = i;
        this.w0 = i2;
    }

    public final synchronized e13 cloneUnderlyingBitmapReference() {
        return e13.o(this.o);
    }

    public final void close() {
        e13 e13;
        synchronized (this) {
            e13 = this.o;
            this.o = null;
            this.X = null;
        }
        if (e13 != null) {
            e13.close();
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final synchronized defpackage.e13 convertToBitmapReference() {
        /*
            r2 = this;
            monitor-enter(r2)
            e13 r0 = r2.o     // Catch:{ all -> 0x0016 }
            java.lang.String r1 = "Cannot convert a closed static bitmap"
            defpackage.ez3.n(r0, r1)     // Catch:{ all -> 0x0016 }
            monitor-enter(r2)     // Catch:{ all -> 0x0016 }
            e13 r0 = r2.o     // Catch:{ all -> 0x0013 }
            r1 = 0
            r2.o = r1     // Catch:{ all -> 0x0013 }
            r2.X = r1     // Catch:{ all -> 0x0013 }
            monitor-exit(r2)     // Catch:{ all -> 0x0016 }
            monitor-exit(r2)
            return r0
        L_0x0013:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0013 }
            throw r0     // Catch:{ all -> 0x0016 }
        L_0x0016:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0016 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u54.convertToBitmapReference():e13");
    }

    public final void finalize() {
        if (!isClosed()) {
            m75.m("DefaultCloseableStaticBitmap", "finalize: %s %x still open.", u54.class.getSimpleName(), Integer.valueOf(System.identityHashCode(this)));
            try {
                close();
            } finally {
                super.finalize();
            }
        }
    }

    public final int getExifOrientation() {
        return this.w0;
    }

    public final int getHeight() {
        int i;
        if (this.Z % 180 != 0 || (i = this.w0) == 5 || i == 7) {
            Bitmap bitmap = this.X;
            if (bitmap == null) {
                return 0;
            }
            return bitmap.getWidth();
        }
        Bitmap bitmap2 = this.X;
        if (bitmap2 == null) {
            return 0;
        }
        return bitmap2.getHeight();
    }

    public final tjb getQualityInfo() {
        return this.Y;
    }

    public final int getRotationAngle() {
        return this.Z;
    }

    public final int getSizeInBytes() {
        return mn0.d(this.X);
    }

    public final Bitmap getUnderlyingBitmap() {
        return this.X;
    }

    public final int getWidth() {
        int i;
        if (this.Z % 180 != 0 || (i = this.w0) == 5 || i == 7) {
            Bitmap bitmap = this.X;
            if (bitmap == null) {
                return 0;
            }
            return bitmap.getHeight();
        }
        Bitmap bitmap2 = this.X;
        if (bitmap2 == null) {
            return 0;
        }
        return bitmap2.getWidth();
    }

    public final synchronized boolean isClosed() {
        return this.o == null;
    }

    public u54(e13 e13, tjb tjb, int i, int i2) {
        e13 n = e13.n();
        n.getClass();
        this.o = n;
        this.X = (Bitmap) n.e0();
        this.Y = tjb;
        this.Z = i;
        this.w0 = i2;
    }
}
