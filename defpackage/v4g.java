package defpackage;

import java.lang.ref.WeakReference;

/* renamed from: v4g  reason: default package */
public abstract class v4g extends j4g {
    public static final WeakReference f = new WeakReference((Object) null);
    public WeakReference e;

    public final byte[] L0() {
        byte[] bArr;
        synchronized (this) {
            try {
                bArr = (byte[]) this.e.get();
                if (bArr == null) {
                    bArr = M0();
                    this.e = new WeakReference(bArr);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bArr;
    }

    public abstract byte[] M0();
}
