package defpackage;

import android.os.SystemClock;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: hoe  reason: default package */
public final class hoe {
    public static final hoe a = new Object();
    public static volatile goe b = lu7.o;

    public static void a(String str, long j, TimeUnit timeUnit, wia... wiaArr) {
        String str2;
        switch (ute.$EnumSwitchMapping$0[timeUnit.ordinal()]) {
            case 1:
                str2 = "ns";
                break;
            case 2:
                str2 = "us";
                break;
            case 3:
                str2 = "ms";
                break;
            case 4:
                str2 = "s";
                break;
            case 5:
                str2 = "min";
                break;
            case 6:
                str2 = "h";
                break;
            case 7:
                str2 = "d";
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        String str3 = str2;
        Map T = ju7.T((wia[]) Arrays.copyOf(wiaArr, wiaArr.length));
        goe goe = b;
        if (!hhd.f(goe, lu7.o) && !hhd.f(goe, ns7.Z)) {
            koe.a(new pfe(4, new mma((SystemClock.elapsedRealtimeNanos() + r1b.a) - r1b.b, str, j, str3, T)));
        }
    }
}
