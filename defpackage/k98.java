package defpackage;

import android.net.Uri;
import java.io.File;
import kotlin.coroutines.Continuation;

/* renamed from: k98  reason: default package */
public final class k98 extends er3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ n98 Y;
    public int Z;
    public n98 o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k98(n98 n98, Continuation continuation) {
        super(continuation);
        this.Y = n98;
    }

    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return n98.q(this.Y, (File) null, (Uri) null, this);
    }
}
