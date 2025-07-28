package defpackage;

import android.net.Uri;
import java.util.List;

/* renamed from: z96  reason: default package */
public final class z96 implements pg7 {
    public final Uri X;
    public final uj3 Y;
    public final List Z;
    public final long a;
    public final CharSequence b;
    public final q1b c;
    public final q1b o;
    public final boolean w0;
    public final int x0 = p2a.p;
    public final long y0;

    public z96(long j, String str, q1b q1b, q1b q1b2, Uri uri, uj3 uj3, zy zyVar, boolean z) {
        this.a = j;
        this.b = str;
        this.c = q1b;
        this.o = q1b2;
        this.X = uri;
        this.Y = uj3;
        this.Z = zyVar;
        this.w0 = z;
        this.y0 = j;
    }

    public final long getItemId() {
        return this.y0;
    }

    public final int l() {
        return this.x0;
    }
}
