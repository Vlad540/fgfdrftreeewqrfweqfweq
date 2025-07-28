package defpackage;

import java.math.RoundingMode;
import java.text.DecimalFormat;

/* renamed from: a0e  reason: default package */
public abstract class a0e {
    public static final DecimalFormat a;

    static {
        DecimalFormat decimalFormat = new DecimalFormat("#.#");
        RoundingMode roundingMode = RoundingMode.DOWN;
        decimalFormat.setRoundingMode(roundingMode);
        a = decimalFormat;
        new DecimalFormat("0.0").setRoundingMode(roundingMode);
    }
}
