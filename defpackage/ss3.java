package defpackage;

import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;

/* renamed from: ss3  reason: default package */
public abstract class ss3 {
    public static final Set a = Collections.unmodifiableSet(EnumSet.of(ts1.o, ts1.X, ts1.Y, ts1.Z));
    public static final Set b = Collections.unmodifiableSet(EnumSet.of(us1.o, us1.a));
    public static final Set c;
    public static final Set d;

    static {
        ss1 ss1 = ss1.X;
        ss1 ss12 = ss1.o;
        ss1 ss13 = ss1.a;
        Set unmodifiableSet = Collections.unmodifiableSet(EnumSet.of(ss1, ss12, ss13));
        c = unmodifiableSet;
        EnumSet copyOf = EnumSet.copyOf(unmodifiableSet);
        copyOf.remove(ss12);
        copyOf.remove(ss13);
        d = Collections.unmodifiableSet(copyOf);
    }
}
