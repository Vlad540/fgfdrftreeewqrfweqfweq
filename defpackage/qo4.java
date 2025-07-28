package defpackage;

import android.media.MediaDrm;

/* renamed from: qo4  reason: default package */
public abstract class qo4 {
    public static boolean a(Throwable th) {
        return th instanceof MediaDrm.MediaDrmStateException;
    }

    public static int b(Throwable th) {
        return oze.x(oze.y(((MediaDrm.MediaDrmStateException) th).getDiagnosticInfo()));
    }
}
