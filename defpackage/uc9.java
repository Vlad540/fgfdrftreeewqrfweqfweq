package defpackage;

import kotlinx.coroutines.internal.Symbol;

/* renamed from: uc9  reason: default package */
public abstract class uc9 {
    public static final Symbol a = new Symbol("NO_OWNER");

    static {
        new Symbol("ALREADY_LOCKED_BY_OWNER");
    }

    public static tc9 a() {
        return new tc9(false);
    }
}
