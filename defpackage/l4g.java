package defpackage;

import android.os.Process;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: l4g  reason: default package */
public abstract class l4g {
    public static final HashMap a = new HashMap();

    static {
        new HashSet(Arrays.asList(new String[]{"native", "unity"}));
        rf0.g("UID: [", Process.myUid(), "]  PID: [", Process.myPid(), "] ").concat("PlayCoreVersion");
    }
}
