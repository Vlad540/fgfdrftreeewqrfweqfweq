package defpackage;

import android.content.Context;

/* renamed from: wz5  reason: default package */
public final class wz5 implements d4e {
    public final boolean X;
    public final r7e Y = new r7e(new ke(2, (Object) this));
    public boolean Z;
    public final Context a;
    public final String b;
    public final ope c;
    public final boolean o;

    public wz5(Context context, String str, ope ope, boolean z, boolean z2) {
        this.a = context;
        this.b = str;
        this.c = ope;
        this.o = z;
        this.X = z2;
    }

    public final void close() {
        r7e r7e = this.Y;
        if (r7e.a()) {
            ((vz5) r7e.getValue()).close();
        }
    }

    public final sz5 getReadableDatabase() {
        return ((vz5) this.Y.getValue()).a(false);
    }

    public final sz5 getWritableDatabase() {
        return ((vz5) this.Y.getValue()).a(true);
    }

    public final void setWriteAheadLoggingEnabled(boolean z) {
        r7e r7e = this.Y;
        if (r7e.a()) {
            ((vz5) r7e.getValue()).setWriteAheadLoggingEnabled(z);
        }
        this.Z = z;
    }
}
