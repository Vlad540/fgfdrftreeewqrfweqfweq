package defpackage;

import android.util.Size;
import java.util.Comparator;

/* renamed from: d63  reason: default package */
public final class d63 implements Comparator {
    public final boolean a;

    public d63(boolean z) {
        this.a = z;
    }

    public final int compare(Object obj, Object obj2) {
        Size size = (Size) obj;
        Size size2 = (Size) obj2;
        int signum = Long.signum((((long) size.getWidth()) * ((long) size.getHeight())) - (((long) size2.getWidth()) * ((long) size2.getHeight())));
        return this.a ? signum * -1 : signum;
    }
}
