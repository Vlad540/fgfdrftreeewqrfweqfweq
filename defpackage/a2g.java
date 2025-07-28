package defpackage;

import java.util.Objects;

/* renamed from: a2g  reason: default package */
public final class a2g extends ClassLoader {
    public final Class loadClass(String str, boolean z) {
        return Objects.equals(str, "com.google.android.gms.iid.MessengerCompat") ? m2g.class : super.loadClass(str, z);
    }
}
