package defpackage;

import android.system.ErrnoException;
import android.system.OsConstants;

/* renamed from: hd5  reason: default package */
public abstract class hd5 {
    /* access modifiers changed from: private */
    public static boolean b(Throwable th) {
        return (th instanceof ErrnoException) && ((ErrnoException) th).errno == OsConstants.EACCES;
    }
}
