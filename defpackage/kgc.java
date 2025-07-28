package defpackage;

/* renamed from: kgc  reason: default package */
public final class kgc extends udd {
    public final void y(nad nad, float f, float f2) {
        nad.d(0.0f, f2 * f, 180.0f, 90.0f);
        float f3 = f2 * 2.0f * f;
        jad jad = new jad(0.0f, 0.0f, f3, f3);
        jad.f = 180.0f;
        jad.g = 90.0f;
        nad.g.add(jad);
        had had = new had(jad);
        nad.a(180.0f);
        nad.h.add(had);
        nad.e = 270.0f;
        float f4 = (0.0f + f3) * 0.5f;
        float f5 = (f3 - 0.0f) / 2.0f;
        double d = (double) 270.0f;
        nad.c = (((float) Math.cos(Math.toRadians(d))) * f5) + f4;
        nad.d = (f5 * ((float) Math.sin(Math.toRadians(d)))) + f4;
    }
}
